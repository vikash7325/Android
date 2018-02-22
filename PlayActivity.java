package com.org.proj;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class PlayActivity extends Activity implements OnClickListener {
	afRelativeLout av;
	animHandler h;
	//MediaPlayer mp;
  //  public int modeValue,difficultyValue,sfxValue,money;
	public int musicValue;
    
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        av=new afRelativeLout(this);
       // mp=MediaPlayer.create(this,R.raw.iron_man);
		setContentView(av);
		 Bundle extras = getIntent().getExtras(); 
	        if(extras !=null) { 
	        	 Values.modeValue = extras.getInt("mode1");
	        	 Log.d("play",Values.modeValue+" : "+Values.modeValue);
	        	 musicValue = extras.getInt("music1");
	        	 Log.d("play",musicValue+" : "+musicValue);
	        	 Values.difficultyValue = extras.getInt("difficulty1");
	        	 Log.d("play",Values.difficultyValue+" : "+Values.difficultyValue);
	        	 Values.sfxValue = extras.getInt("special1");
	        	 Log.d("play",Values.sfxValue+" : "+Values.sfxValue);
	        	 
	        }
	    //    money=modeValue;
       //	 Log.d("mymoney1",money+" : "+money);
		av.invalidate();
		av.invalidate();
    }
	
    protected void onResume() {
    		// TODO Auto-generated method stub
    			
    			super.onResume();
    			h=new animHandler(1000,av);
    			h.sendEmptyMessage(0);
    			if(musicValue==0)
    			{
    			//mp.start();
    			//mp.setLooping(true);
    			}
    }

	
	
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
	
	protected void onPause() {
	    super.onPause();
     	  //mp.stop();
	    }


	
	
	
}
class afRelativeLout extends LinearLayout
{

	private Context contxt1;
	private RelativeLayout rl;
	//MediaPlayer mp1;
	ImageView homeView,solveView,resetView,hintView,rockView,swampView,waterView;
	TextView scoreView,timeView;
	int width,height,onD=0,changeAfterThis,splash;
	int[] doubleClick1=new int[64];
	int[] changedRock=new int[64];
	int[] convertRock=new int[64];
	float x=200,y=30;
	Thread t;
	boolean once=true;
	int []a={30,80,130,180,230,280,330,380};
	int []b={180,230,280,330,380,430,480,530};
	int flag=0,front=0,back=0,count=1,flag1=0,right=0,left=0,anim=0,swamp=0,sub1=0,sub2=0,sub3=0,score=0,arcade=0,m1,m2;
	float p,q,r,s=0,x1,y1,p1,q1,s1=0,r1,p2,q2,s2=0,p3,q3,s3=0,slope;
	float yValue=30,xValue;
	double val;
	Bitmap stone;
	Bitmap rock;
	float x_position,y_position;
	float frog_xposition,frog_yposition;
	float x_difference,y_difference;
	RelativeLayout.LayoutParams scoreView_rlp,timeView_rlp;
	private int swamp_Rocks;
	static double value;
	boolean stopTimer=false;
	private long mStartTime = 0L;
	private Handler mHandler=new Handler();
//	Play object = new Play();
//	int sfxValuePassed = object.sfxValue;
//	int modeValuePassed = object.modeValue;
//	int difficultyPassed = object.difficultyValue;
//	int money1=object.money;
	public afRelativeLout(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		contxt1=context;
		background_image();
	}

	private void background_image() {
		// TODO Auto-generated method stub
		this.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
	     rl=new RelativeLayout(contxt1);
	     rl.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.FILL_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT));	
	     this.setBackgroundResource(R.drawable.my);
	     this.addView(rl);
		
	}
	
	public void initialize(){
		
		 width = this.getWidth(); 
		 height=this.getHeight();
		 //mp1=MediaPlayer.create(contxt1,R.raw.water_splash);
		 Log.d("mymode",Values.modeValue+" : "+Values.modeValue);
		 Log.d("mysfx",Values.sfxValue+" : "+Values.sfxValue);
		 Log.d("mydifficulty",Values.difficultyValue+" : "+Values.difficultyValue);
		// Log.d("mymoney",money1+" : "+money1);
		//home view
		 
		 homeView=new ImageView(contxt1);
		 homeView.setId(90);	 
		 homeView.setImageResource(R.drawable.go_home);  
		 homeView.setAdjustViewBounds(true); 
		 RelativeLayout.LayoutParams hmImv_rlp=
         new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
	     hmImv_rlp.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
	     hmImv_rlp.addRule(RelativeLayout.ALIGN_PARENT_TOP, RelativeLayout.TRUE);
	     hmImv_rlp.width=width/4;
	     hmImv_rlp.height=height/7;
	     rl.addView(homeView,hmImv_rlp);
	     
	     //click to get home
	     homeView.setOnClickListener(new View.OnClickListener() {
			
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(contxt1,SafeleapActivity.class);
				((Activity) contxt1).finish();
                contxt1.startActivity(i);
  //              buttonSound.start();
			}
		});

	   // reset imageview
	     
		    resetView=new ImageView(contxt1);
		    resetView.setId(91);		 
		    resetView.setImageResource(R.drawable.rename); 
		    resetView.setAdjustViewBounds(true);
		    RelativeLayout.LayoutParams rstImv_rlp=new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
		    rstImv_rlp.addRule(RelativeLayout.ALIGN_PARENT_RIGHT, RelativeLayout.TRUE);
		    rstImv_rlp.addRule(RelativeLayout.ALIGN_PARENT_TOP, RelativeLayout.TRUE);
		    rstImv_rlp.width=width/4; 
		    rstImv_rlp.height=height/7;
		    rl.addView(resetView, rstImv_rlp);
		    
	//click to reset
		    //click to get home
		     resetView.setOnClickListener(new View.OnClickListener() {
				
				
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent i = new Intent(contxt1,PlayActivity.class);
					((Activity) contxt1).finish();
	                contxt1.startActivity(i);
				}
			});
		    
	//solve imageview
		    
		    solveView=new ImageView(contxt1);
		    solveView.setId(92);		 
		    solveView.setImageResource(R.drawable.solve);
		    solveView.setAdjustViewBounds(true);
		    RelativeLayout.LayoutParams solveImv_rlp=new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
		    solveImv_rlp.addRule(RelativeLayout.ALIGN_PARENT_RIGHT, RelativeLayout.TRUE);
		    solveImv_rlp.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, RelativeLayout.TRUE);
		    solveImv_rlp.width=width/4; 
		    solveImv_rlp.height=height/7;
		    rl.addView(solveView, solveImv_rlp);
		    
		  //click to solve
		    
		     solveView.setOnClickListener(new View.OnClickListener() {
				
				
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					
							
				}
			});
		    
      //hint imageview
		    
		    hintView=new ImageView(contxt1);
		    hintView.setId(93);		 
		    hintView.setImageResource(R.drawable.hints);
		    hintView.setAdjustViewBounds(true);
		    RelativeLayout.LayoutParams hintImv_rlp=new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
		    hintImv_rlp.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
		    hintImv_rlp.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, RelativeLayout.TRUE);
		    hintImv_rlp.width=width/4; 
		    hintImv_rlp.height=height/7;
		    rl.addView(hintView, hintImv_rlp);
		     hintView.setOnClickListener(new View.OnClickListener() {
				
				
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent i = new Intent(contxt1,PlayActivity.class);
					((Activity) contxt1).finish();
	                contxt1.startActivity(i);
				}
			});
		    
	//textview for score
		     	scoreView=new TextView(contxt1); 
		     	scoreView.setText(""+0);   
		     	scoreView.setTextColor(Color.rgb(200, 0, 0));
		     	scoreView.setTextSize(20);
				scoreView.setId(100);
				scoreView_rlp=new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,
			    RelativeLayout.LayoutParams.WRAP_CONTENT);
				//q_rlp.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
				scoreView_rlp.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
				scoreView_rlp.addRule(RelativeLayout.LEFT_OF, resetView.getId());
				scoreView_rlp.topMargin=15; 
				scoreView_rlp.leftMargin=300;
			    rl.addView(scoreView,scoreView_rlp);
		    
      //textview for timer
			    timeView=new TextView(contxt1); 
		     	timeView.setText(""+"");   
		     	timeView.setTextColor(Color.rgb(200, 0, 0));
		     	timeView.setTextSize(20);
				scoreView.setId(110);
				timeView_rlp=new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,
			    RelativeLayout.LayoutParams.WRAP_CONTENT);
				timeView_rlp.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
				timeView_rlp.addRule(RelativeLayout.LEFT_OF, resetView.getId());
				timeView_rlp.topMargin=600; 
				timeView_rlp.leftMargin=210;
			    rl.addView(timeView,timeView_rlp);
			    	if (mStartTime == 0L)
			    	{
			    		mStartTime = System.currentTimeMillis();
			    		mHandler.removeCallbacks(mUpdateTimeTask);
			    		mHandler.postDelayed(mUpdateTimeTask, 100);
			    	}
	}
	   private Runnable mUpdateTimeTask = new Runnable() 
	   {
		   private String tag;

		public void run()
	        {
			   		if(Values.modeValue==0)
                    {
                	 final long start = mStartTime;
                	 Log.d(tag, "intime");
                	 long elapseTime = System.currentTimeMillis() - start;
                	 int seconds = (int)(elapseTime / 1000);
                	 int minutes = seconds / 60;
                	 seconds     = seconds % 60;

                	 if (seconds<1010) 
                	 {
                		 timeView.setText("" + minutes + ":0" + seconds);
                	 }
                	 else
                	 {
                		 timeView.setText("" + minutes + ":" + seconds);            
                	 }

                	 // add a delay to adjust for computation time
                	 long delay = (1000 - (elapseTime%1000));

                	 mHandler.postDelayed(this, delay);
                	 if(seconds>58)
                	 {
                		 	stopTimer=true;
                		 	Intent i = new Intent(contxt1,TimeOutActivity.class);
                		 	((Activity) contxt1).finish();
                		 	contxt1.startActivity(i);
               	 
                	 }
	            
	             }
              }
		 };
	
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method 
	  x1=event.getX();
     y1=event.getY();
    	
    		
    	switch( event.getAction()){
    	 case MotionEvent.ACTION_DOWN:
    		 					
    		 //limit the clicked position to the center of the bitmap whenever it is clicked at any position
    		 //for first row
    		 						swamp=0;
    		                        flag=0;
    		                        changeAfterThis=0;
    		            
    		 						 if((x1>=30&&x1<80)&&(y1>=180&&y1<230))
    		 						 {
    		 							  if(doubleClick1[0]==0)
    		 							  {
    		 								  x1=55;
    		 								  y1=185;
    		 								  flag=1;
    		 								  swamp=1;
    		 								  doubleClick1[0]++;  
    		 								  changedRock[0]=1;
    		 								  
    		 								  convertRock[0]=1;
    		 				     		  }
    		 				     	 }
    		 						 else if((x1>=80&&x1<130)&&(y1>180&&y1<230))
    		 						 {
    		 							  if(doubleClick1[1]==0)
    		 							  {
    		 								  x1=105;
    		 								  y1=185;
    		 								  flag=1;
    		 								  doubleClick1[1]++;
    		 								  changedRock[1]=1;
    		 								  convertRock[1]=1;
    		 							  }
    		 						 }
    		 						 else if((x1>=130&&x1<180)&&(y1>180&&y1<230))
    		 						 {
    		 							  if(doubleClick1[2]==0)
    		 							  {	  
    		 								  x1=155;
    		 								  y1=185;
    		 								  flag=1;
    		 								  doubleClick1[2]++;
    		 								  changedRock[2]=1;
    		 								  convertRock[2]=1;
    		 							  }
    		 						 }
    		 						 else if((x1>=180&&x1<230)&&(y1>180&&y1<230))
   		 						     {
   		 							     if(doubleClick1[3]==0)
   		 							     {
   		 							    	 x1=205;
   		 							    	 y1=185;
   		 							    	 flag=1;
   		 							    	 doubleClick1[3]++;
   		 							    	 changedRock[3]=1;
   		 							    	 convertRock[3]=1;
   		 							     }
   		 						     }
    		 						 else if((x1>=230&&x1<280)&&(y1>180&&y1<230))
   		 						     {
   		 						         if(doubleClick1[4]==0)
   		 						         {
   		 						        	 x1=255;
   		 						        	 y1=185;
   		 						        	 flag=1;
   		 						        	 doubleClick1[4]++;
   		 						        	 changedRock[4]=1;
   		 						        	convertRock[4]=1;
   		 						         }
   		 						     }
    		 						 else if((x1>=280&&x1<330)&&(y1>180&&y1<230))
   		 						     {
   		 							     if(doubleClick1[5]==0)
   		 							     {
   		 							    	 x1=305;
   		 							    	 y1=185;
   		 							    	 flag=1;
   		 							    	 doubleClick1[5]++;
   		 							    	 changedRock[5]=1;
   		 							    	convertRock[5]=1;
   		 							     }
   		 						    }
    		 						 else if((x1>=330&&x1<380)&&(y1>180&&y1<230))
		 						    {
		 							    if(doubleClick1[6]==0)
		 							    {
		 							    	x1=355;
		 							    	y1=185;
		 							    	flag=1;
		 							    	doubleClick1[6]++;
		 							    	changedRock[6]=1;
		 							    	convertRock[6]=1;
		 							    }
		 						    }
    		 						 else if((x1>=380&&x1<430)&&(y1>180&&y1<230))
		 						    {
		 						    	if(doubleClick1[7]==0)
		 							    {
		 						    		x1=405;
		 						    		y1=185;
		 						    		flag=1;
		 						    		doubleClick1[7]++;
		 						    		changedRock[7]=1;
		 						    		convertRock[7]=1;
		 							    }
		 						    }
		 						    
		 			//for second row
		 						    
    		 						else if((x1>=30&&x1<80)&&(y1>230&&y1<280))
 		 						   {
		 							   if(doubleClick1[8]==0)
		 							   {
		 								   x1=55;
		 								   y1=235;
		 								   flag=1;
		 								   doubleClick1[8]++;
		 								   changedRock[8]=1;
		 								   convertRock[8]=1;
		 							   }
 		 						   }
    		 					   else if((x1>=80&&x1<130)&&(y1>230&&y1<280))
 		 						   {
 		 							   	if(doubleClick1[9]==0)
		 							    {
 		 							   		x1=105;
 		 							   		y1=235;
 		 							   		flag=1;
 		 							   		doubleClick1[9]++;
 		 							   		changedRock[9]=1;
 		 							   	    convertRock[9]=1;
		 							    }
 		 						   }
    		 					  else if((x1>=130&&x1<180)&&(y1>230&&y1<280))
 		 						  {
 		 							  if(doubleClick1[10]==0)
 		 							  {
 		 								  x1=155;
 		 								  y1=235;
 		 								  flag=1;
 		 								  doubleClick1[10]++;
 		 								  changedRock[10]=1;
 		 						     	  convertRock[10]=1;
 		 							  }
 		 						  }
    		 					  else if((x1>=180&&x1<230)&&(y1>230&&y1<280))
		 						  {
 		 							  if(doubleClick1[11]==0)
 		 							  {
 		 								  x1=205;
 		 								  y1=235;
 		 								  flag=1;
 		 								  doubleClick1[11]++;
 		 								  changedRock[11]=1;
 		 								convertRock[11]=1;
 		 							  }
		 					      }
    		 					  else if((x1>=230&&x1<280)&&(y1>230&&y1<280))
		 						  {
		 						    	if(doubleClick1[12]==0)
		 							    {
		 						    		x1=255;
		 						    		y1=235;
		 						    		flag=1;
		 						    		doubleClick1[12]++;
		 						    		changedRock[12]=1;
		 						    		convertRock[12]=1;
		 							    }
		 						  }
    		 					  else if((x1>=280&&x1<330)&&(y1>230&&y1<280))
		 						  {
		 						    	if(doubleClick1[13]==0)
		 							    {
		 						    		x1=305;
		 						    		y1=235;
		 						    		flag=1;
		 						    		doubleClick1[13]++;
		 						    		changedRock[13]=1;
		 						    		convertRock[13]=1;
		 							    }
		 						  }
    		 					  else if((x1>=330&&x1<380)&&(y1>230&&y1<280))
		 						  {
		 						    	if(doubleClick1[14]==0)
		 							    {
		 						    		x1=355;
		 						    		y1=235;
		 						    		flag=1;
		 						    		doubleClick1[14]++;
		 						    		changedRock[14]=1;
		 						    		convertRock[14]=1;
		 							    }
		 						   }
    		 					   else if((x1>=380&&x1<430)&&(y1>230&&y1<280))
		 						   {
		 						    	if(doubleClick1[15]==0)
		 							    {
		 						    		
		 						    		x1=405;
		 						    		y1=235;
		 						    		flag=1;
		 						    		doubleClick1[15]++;
		 						    		changedRock[15]=1;
		 						    		convertRock[15]=1;
		 							    }
		 						   }
		 						    
		 		//for third row				    
		 						
    		 					   else if((x1>=30&&x1<80)&&(y1>=280&&y1<330))
 		 						   {
		 							    if(doubleClick1[16]==0)
		 							    {
		 							    	x1=55;
		 							    	y1=285;
		 							    	flag=1;
		 							    	doubleClick1[16]++;
		 							    	changedRock[16]=1;
		 							    	convertRock[16]=1;
		 							    }
 		 						   }
    		 					   else if((x1>=80&&x1<130)&&(y1>=280&&y1<330))
 		 						   {
 		 							   if(doubleClick1[17]==0)
		 							   {
 		 								   x1=105;
 		 								   y1=285;
 		 								   flag=1;
 		 								   doubleClick1[17]++;
 		 								   changedRock[17]=1;
 		 								   convertRock[17]=1;
		 							   }
 		 						  }
    		 					  else if((x1>=130&&x1<180)&&(y1>280&&y1<330))
 		 						  {
 		 							  if(doubleClick1[18]==0)
 		 							  {
 		 								  x1=155;
 		 								  y1=285;
 		 								  flag=1;
 		 								  doubleClick1[18]++;
 		 								  changedRock[18]=1;
 		 							   	  convertRock[18]=1;
 		 							  }
 		 						  }
    		 					  else if((x1>=180&&x1<230)&&(y1>280&&y1<330))
		 						  {
 		 							  if(doubleClick1[19]==0)
	 							      {    
 		 								  x1=205;
 		 								  y1=285;
 		 								  flag=1;
 		 								  doubleClick1[19]++;
 		 								  changedRock[19]=1;
 		 							      convertRock[19]=1;
	 							      }
		 						  }
    		 					  else if((x1>=230&&x1<280)&&(y1>280&&y1<330))
		 						  {
		 							  if(doubleClick1[20]==0)
		 							  {
		 						    	 x1=255;
		 							     y1=285;
		 							     flag=1;
		 							     doubleClick1[20]++;
		 							     changedRock[20]=1;
		 							     convertRock[20]=1;
		 							  }
		 						    }
    		 					   else if((x1>=280&&x1<330)&&(y1>=280&&y1<330))
		 						    {
		 						    	if(doubleClick1[21]==0)
		 							    {
		 						    		x1=305;
		 						    		y1=285;
		 						    		flag=1;
		 						    		doubleClick1[21]++;
		 						    		changedRock[21]=1;
		 						    		convertRock[21]=1;
		 							    }
		 						    }
    		 					   else if((x1>=330&&x1<380)&&(y1>=280&&y1<330))
		 						    {
		 						    	if(doubleClick1[22]==0)
		 							    {
		 						    		x1=355;
		 						    		y1=285;
		 						    		flag=1;
		 						    		doubleClick1[22]++;
		 						    		changedRock[22]=1;
		 						    		convertRock[22]=1;
		 							    }
		 						    }
    		 					   else if((x1>=380&&x1<430)&&(y1>280&&y1<330))
		 						    {
		 						    	if(doubleClick1[23]==0)
		 							    {
		 						    		x1=405;
		 						    		y1=285;
		 						    		flag=1;
		 						    		doubleClick1[23]++;
		 						    		changedRock[23]=1;
		 						    		convertRock[23]=1;
		 							    }
		 						    }
		 //for fourth row						    
		 						    
    		 					   else if((x1>=30&&x1<80)&&(y1>=330&&y1<380))
 		 						   {
		 							   if(doubleClick1[24]==0)
		 							   {
		 								   x1=55;
		 								   y1=335;
		 								   flag=1;
		 								   doubleClick1[24]++;
		 								   changedRock[24]=1;
		 								   convertRock[24]=1;
		 							   }
		 						    }
    		 					   else if((x1>=80&&x1<130)&&(y1>=330&&y1<380))
 		 						   {
 		 							    if(doubleClick1[25]==0)
		 							    {
 		 							    	x1=105;
 		 							    	y1=335;
 		 							    	flag=1;
 		 							    	doubleClick1[25]++;
 		 							    	changedRock[25]=1;
 		 							    	convertRock[25]=1;
		 							    }
 		 							 
 		 						  }
    		 					else if((x1>=130&&x1<180)&&(y1>=330&&y1<380))
 		 						  {
 		 							  if(doubleClick1[26]==0)
 		 							  {
 		 								  x1=155;
 		 								  y1=335;
 		 								  flag=1;
 		 								  doubleClick1[26]++;
 		 								  changedRock[26]=1;
 		 								  convertRock[26]=1;
 		 							  }
 		 						  }	  
    		 					else if((x1>=180&&x1<230)&&(y1>=330&&y1<380))
		 						 {
 		 							 if(doubleClick1[27]==0)
 		 							 { 
 		 								 x1=205;
		 							     y1=335;
		 							     flag=1;
		 							     doubleClick1[27]++;
		 							     changedRock[27]=1;
		 							     convertRock[27]=1;
 		 							 }
		 						 }
    		 					else if((x1>=230&&x1<280)&&(y1>=330&&y1<380))
		 						 {
		 							 if(doubleClick1[28]==0)
		 							 {
		 						    	 x1=255;
		 							     y1=335;
		 							     flag=1;
		 							     doubleClick1[28]++;
		 							     changedRock[28]=1;
		 							     convertRock[28]=1;
		 							 }
		 					     }
    		 					else if((x1>=280&&x1<330)&&(y1>330&&y1<380))
		 						 {
		 						     if(doubleClick1[29]==0)
		 							 {
		 						    	 x1=305;
		 							     y1=335;
		 							     flag=1;
		 							     doubleClick1[29]++;
		 							     changedRock[29]=1;
		 							     convertRock[29]=1;
		 							 }
		 					    }
    		 					else if((x1>=330&&x1<380)&&(y1>330&&y1<380))
		 						{
		 						     if(doubleClick1[30]==0)
		 							 {
		 						    	  x1=355;
		 							      y1=335;
		 							      flag=1;
		 							      doubleClick1[30]++;
		 							      changedRock[30]=1;
		 							      convertRock[30]=1;
		 							 }
		 						}
    		 					else if((x1>=380&&x1<430)&&(y1>=330&&y1<=380))
		 						{
		 					    	if(doubleClick1[31]==0)
		 						    {
		 						    	x1=405;
		 							    y1=335;
		 							    flag=1;
		 							    doubleClick1[31]++;
		 							    changedRock[31]=1;
		 							    convertRock[31]=1;
		 						    }
		 						}		    
		  //for fifth row
    		 					else if((x1>=30&&x1<80)&&(y1>380&&y1<=430))
 		 						   {
		 							   if(doubleClick1[32]==0)
		 							   {
		 								   x1=55;
		 								   y1=385;
		 								   flag=1;
		 								   doubleClick1[32]++;
		 								   changedRock[32]=1;
		 								  convertRock[32]=1;
		 							   }
		 						   }
    		 					else if((x1>=80&&x1<130)&&(y1>380&&y1<430))
 		 						   {
 		 							    if(doubleClick1[33]==0)
		 							    {
 		 							    	x1=105;
 		 							    	y1=385;
 		 							    	flag=1;
 		 							    	doubleClick1[33]++;
 		 							    	changedRock[33]=1;
 		 							    	convertRock[33]=1;
		 							    }
 		 						   }
 		 						   
    		 					else if((x1>=130&&x1<180)&&(y1>380&&y1<430))
 		 						  {
 		 							    if(doubleClick1[34]==0)
 		 							    {
 		 							    	x1=155;
 		 							    	y1=385;
 		 							    	flag=1;
 		 							    	doubleClick1[34]++;
 		 							    	changedRock[34]=1;
 		 							    	convertRock[34]=1;
 		 							    }
 		 						  }
    		 					else if((x1>=180&&x1<230)&&(y1>380&&y1<430))
		 						 {
 		 							  if(doubleClick1[35]==0)
	 							      {    
 		 								  x1=205;
 		 								  y1=385;
 		 								  flag=1;
 		 								  doubleClick1[35]++;
 		 								  changedRock[35]=1;
 		 							       convertRock[35]=1;
	 							      }
		 						  }
    		 					else if((x1>=230&&x1<280)&&(y1>380&&y1<430))
		 						  {
		 						    	if(doubleClick1[36]==0)
		 							    {
		 						    		x1=255;
		 						    		y1=405;
		 						    		flag=1;
		 						    		doubleClick1[36]++;
		 						    		changedRock[36]=1;
		 						    		convertRock[36]=1;
		 							    }
		 						   }
    		 					else if((x1>=280&&x1<330)&&(y1>380&&y1<430))
		 						   {
		 						    	if(doubleClick1[37]==0)
		 							    {
		 						    		x1=305;
		 						    		y1=385;
		 						    		flag=1;
		 						    		doubleClick1[37]++;
		 						    		changedRock[37]=1;
		 						    		convertRock[37]=1;
		 							    }
		 						    }
    		 					else if((x1>=330&&x1<380)&&(y1>380&&y1<430))
		 						    {
		 						    	if(doubleClick1[38]==0)
		 							    {
		 						    		x1=355;
		 						    		y1=385;
		 						    		flag=1;
		 						    		doubleClick1[38]++;
		 						    		changedRock[38]=1;
		 						    		convertRock[38]=1;
		 							    }
		 						    }
    		 					else if((x1>=380&&x1<430)&&(y1>=380&&y1<=430))
		 						    {
		 						    	if(doubleClick1[39]==0)
		 							    {
		 						    		x1=405;
		 						    		y1=385;
		 						    		flag=1;
		 						    		doubleClick1[39]++;
		 						    		changedRock[39]=1;
		 						    		convertRock[39]=1;
		 							    }
		 						    }
		 						    
		 			//for sixthh row
		 						    
    		 					else if((x1>=30&&x1<80)&&(y1>430&&y1<480))
 		 						   {
		 							  if(doubleClick1[40]==0)
		 							  {
		 								  x1=55;
		 								  y1=435;
		 								  flag=1;
		 								  doubleClick1[40]++;
		 								  changedRock[40]=1;
		 								  convertRock[40]=1;
		 							  }
 		 						   }
    		 					else if((x1>=80&&x1<130)&&(y1>430&&y1<480))
 		 						   {
 		 							   if(doubleClick1[41]==0)
		 							   {
 		 								   x1=105;
 		 								   y1=435;
 		 								   flag=1;
 		 								   doubleClick1[41]++;
 		 								   changedRock[41]=1;
 		 								   convertRock[41]=1;
		 							   }
 		 						   }
    		 					else if((x1>=130&&x1<180)&&(y1>430&&y1<480))
 		 						   {
 		 							   if(doubleClick1[42]==0)
 		 							   {
 		 								   x1=155;
 		 								   y1=435;
 		 								   flag=1;
 		 								   doubleClick1[42]++;
 		 								   changedRock[42]=1;
 		 								   convertRock[42]=1 ;
 		 							   }
 		 						  }
    		 					else if((x1>=180&&x1<230)&&(y1>430&&y1<480))
		 						  {
 		 							  if(doubleClick1[43]==0)
 		 							  { 
 		 								  x1=205;
 		 								  y1=435;
 		 								  flag=1;
 		 								  doubleClick1[43]++;
 		 								  changedRock[43]=1;
 		 								  convertRock[43]=1;
 		 							  }
		 						  }
    		 					else if((x1>=230&&x1<280)&&(y1>430&&y1<480))
		 						  {
		 						    	if(doubleClick1[44]==0)
		 							    {
		 						    		x1=255;
		 						    		y1=435;
		 						    		flag=1;
		 						    		doubleClick1[44]++;
		 						    		changedRock[44]=1;
		 						    		convertRock[44]=1;
		 							    }
		 						   }
    		 					else if((x1>=280&&x1<320)&&(y1>430&&y1<480))
		 						   { 
		 						    	if(doubleClick1[45]==0)
		 							    {
		 						    		x1=305;
		 						    		y1=435;
		 						    		flag=1;
		 						    		doubleClick1[45]++;
		 						    		changedRock[45]=1;
		 						    		convertRock[45]=1;
		 							    }
		 						    }
    		 					else if((x1>=320&&x1<380)&&(y1>430&&y1<480))
		 						    {
		 						    	if(doubleClick1[46]==0)
		 							    {
		 						    		x1=355;
		 						    		y1=435;
		 						    		flag=1;
		 						    		doubleClick1[46]++;
		 						    		changedRock[46]=1;
		 						    		convertRock[46]=1;
		 							    }
		 						    }
    		 					else if((x1>=380&&x1<430)&&(y1>=430&&y1<=480))
		 						    {
		 						    	if(doubleClick1[47]==0)
		 							    {
		 						    		x1=405;
		 						    		y1=435;
		 						    		flag=1;
		 						    		doubleClick1[47]++;
		 						    		changedRock[47]=1;
		 						    		convertRock[47]=1;
		 							    }
		 						    }

		 		//for seventh row
		 						    
    		 					else if((x1>=30&&x1<80)&&(y1>480&&y1<530))
 		 						   {
		 							  if(doubleClick1[48]==0)
		 							  {
		 								  x1=55;
		 								  y1=485;
		 								  flag=1;
		 								  doubleClick1[48]++;
		 								 changedRock[48]=1;
		 								convertRock[48]=1;
		 							  }
 		 						   }
    		 					else if((x1>=80&&x1<130)&&(y1>480&&y1<530))
 		 						   {
 		 							   if(doubleClick1[49]==0)
		 							   {
 		 								   x1=105;
 		 								   y1=485;
 		 								   flag=1;
 		 								   doubleClick1[49]++;
 		 								   changedRock[49]=1;
 		 								 convertRock[49]=1;
		 							   }
 		 						  }
    		 					else if((x1>=130&&x1<180)&&(y1>480&&y1<530))
 		 						  {
 		 							  if(doubleClick1[50]==0)
 		 							  {
 		 								  x1=155;
 		 								  y1=485;
 		 								  flag=1;
 		 								  doubleClick1[50]++;
 		 								  changedRock[50]=1;
 		 								convertRock[50]=1;
 		 							  }
 		 						  }
    		 					else if((x1>=180&&x1<230)&&(y1>480&&y1<530))
		 						  {
 		 							  if(doubleClick1[51]==0)
 		 							  {    
 		 								  x1=205;
 		 								  y1=485;
 		 								  flag=1;
 		 								  doubleClick1[51]++;
 		 								  changedRock[51]=1;
 		 								  convertRock[51]=1;
 		 							  }
		 						  }
    		 					else if((x1>=230&&x1<280)&&(y1>480&&y1<530))
		 						  {
		 						       if(doubleClick1[52]==0)
		 							   {
		 						    	   x1=255;
		 						    	   y1=485;
		 						    	   flag=1;
		 						    	   doubleClick1[52]++;
		 						    	   changedRock[52]=1;
		 						    	  convertRock[52]=1;
		 							   }
		 						  }
    		 					else if((x1>=280&&x1<330)&&(y1>480&&y1<530))
		 						  {
		 						       if(doubleClick1[53]==0)
		 							   {
		 						    	   x1=305;
		 							       y1=485;
		 							       flag=1;
		 							       doubleClick1[53]++;
		 							       changedRock[53]=1;
		 							      convertRock[53]=1;
		 							   }
		 						  }
    		 					else if((x1>=330&&x1<380)&&(y1>480&&y1<530))
		 						  {
		 						       if(doubleClick1[54]==0)
		 							   {
		 						    	   x1=355;
		 						    	   y1=485;
		 						    	   flag=1;
		 						    	   doubleClick1[54]++;
		 						    	   changedRock[54]=1;
		 						    	  convertRock[54]=1;
		 							   }
		 						   }
    		 					else if((x1>=380&&x1<430)&&(y1>=480&&y1<=530))
		 						   {
		 						       if(doubleClick1[55]==0)
		 							   {
		 						    	   x1=405;
		 						    	   y1=485;
		 						    	   flag=1;
		 						    	   doubleClick1[55]++;
		 						    	   changedRock[55]=1;
		 						    	  convertRock[55]=1;
		 							   }
		 						    }
		 						    
		 						    
		 		//for eigth row
		 						    
    		 					else if((x1>=30&&x1<80)&&(y1>530&&y1<580))
 		 						   {
		 							  if(doubleClick1[56]==0)
		 							  {
		 							      x1=55;
		 							      y1=535;
		 							      flag=1;
		 							      doubleClick1[56]++;
		 							      changedRock[56]=1;
		 							     convertRock[56]=1;
		 							  }
 		 						   }
    		 					else if((x1>=80&&x1<130)&&(y1>530&&y1<580))
 		 						   {
 		 							   if(doubleClick1[57]==0)
		 							   {
 		 								   x1=105;
 		 								   y1=535;
 		 								   flag=1;
 		 								   doubleClick1[57]++;
 		 								   changedRock[57]=1;
 		 								 convertRock[57]=1;
		 							   }
 		 						   }
    		 					else if((x1>=130&&x1<180)&&(y1>530&&y1<580))
 		 						   {
 		 							   if(doubleClick1[58]==0)
 		 							   {
 		 								   x1=155;
 		 								   y1=535;
 		 								   flag=1;
 		 								   doubleClick1[58]++;
 		 								   changedRock[58]=1;
 		 								   convertRock[58]=1;
 		 							   }
 		 						  }
    		 					else if((x1>=180&&x1<230)&&(y1>530&&y1<580))
		 						  {
 		 							  if(doubleClick1[59]==0)
 		 							  {
 		 								  x1=205;
 		 								  y1=535;
 		 								  flag=1;
 		 								  doubleClick1[59]++;
 		 								  changedRock[59]=1;
 		 								convertRock[59]=1;
 		 							  }
		 						   }
    		 					else if((x1>=230&&x1<280)&&(y1>530&&y1<580))
		 						   {
		 						    	if(doubleClick1[60]==0)
		 							    {
		 						    		x1=255;
		 						    		y1=535;
		 						    		flag=1;
		 						    		doubleClick1[60]++;
		 						    		changedRock[60]=1;
		 						    		convertRock[60]=1;
		 							    }
		 						    }
    		 					else if((x1>=280&&x1<330)&&(y1>530&&y1<580))
		 						    {
		 						    	if(doubleClick1[61]==0)
		 							    {
		 						    		x1=305;
		 						    		y1=535;
		 						    		flag=1;
		 						    		doubleClick1[61]++;
		 						    		changedRock[61]=1;
		 						    		convertRock[61]=1;
		 							    }
		 						    }
    		 					else if((x1>=330&&x1<380)&&(y1>530&&y1<580))
		 						    {
		 						    	if(doubleClick1[62]==0)
		 							    {
		 						    		x1=355;
		 						    		y1=535;
		 						    		flag=1;
		 						    		doubleClick1[62]++;
		 						    		changedRock[62]=1;
		 						    		convertRock[62]=1;
		 							    }
		 						    }
    		 						else if((x1>=380&&x1<430)&&(y1>=530&&y1<=580))
		 						    {
		 						    	if(doubleClick1[63]==0)
		 							    {
		 						    		x1=405;
		 						    		y1=535;
		 						    		flag=1;
		 						    		doubleClick1[63]++;
		 						    		changedRock[63]=1;
		 						    		convertRock[63]=1;
		 							    }
		 							 }
    		 						else
    		 						{
    		 							flag=0;
    		 						}
    		 						 //to check the direction of fly of frog
		 						    if(flag==1)
		 						    {
		 						    		score+=5;
		 						    		front=0;
		 						    	    back=0;
		 						    	    left=0;
		 						    	    right=0;
		 						    	    anim=0;
		 						    	    s=0;
		 						    	    s1=0;
		 						    	    s2=0;
		 						    	    s3=0;
		 						    	    if(y<y1&&x1<430)    //if clicked position is below the current location of frog 
				 						    {
				 						    	
		 						    	    	front=1;
				 						    }
				 						    else if(y>y1)    //if clicked position is above the current location of the frog
				 						    {
				 						    	back=1;				 						    	
    				 						}
				 						    else if(y==y1&&x<x1)      //if on the same line and left of the frog
 				 						    {
				 						    	right=1;
				 						    }
				 						    else         //if on same line and right of the frog
				 						    {
				 						    	left=1;
				 						    }
		 						    	    p2=x;
		 						    	    q2=y;
		 						    	    float g=y1-q2;
			 								float h=x1-p2;
			 							    slope=g/h;
		 						 	        x=x1;
    		 						        y=y1;
    		 						        count++;
    	    		 						invalidate();
       		 						        count++;
                               	            break;
		 						    }
		 		    	}
    	return true;
    }
    
	protected void onDraw(Canvas canvas)  
	{
		// TODO Auto-generated method stub
	//	bitmap  during left jumping
		Bitmap anim_left_frog = BitmapFactory.decodeResource(this.getResources(), R.drawable.left_jump);
		Bitmap left_frog = BitmapFactory.decodeResource(this.getResources(), R.drawable.left_1);
	//bitmap during front jump	
		Bitmap front_frog = BitmapFactory.decodeResource(this.getResources(), R.drawable.front_1);
		Bitmap anim_front_frog = BitmapFactory.decodeResource(this.getResources(), R.drawable.front_jump);
	//bitmap during right jump
		Bitmap right_frog = BitmapFactory.decodeResource(this.getResources(), R.drawable.right_1);
		Bitmap anim_right_frog = BitmapFactory.decodeResource(this.getResources(), R.drawable.right_jump);
	//bitmap during back jump
		Bitmap back_frog = BitmapFactory.decodeResource(this.getResources(), R.drawable.back_1);
		Bitmap anim_back_frog = BitmapFactory.decodeResource(this.getResources(), R.drawable.back_jump);
	//bitmap of bubble
		Bitmap bubble1 = BitmapFactory.decodeResource(this.getResources(), R.drawable.bubble1);
		Bitmap stone1 = BitmapFactory.decodeResource(this.getResources(), R.drawable.stone);
		//bitmap of arcade	
		Bitmap blue1 = BitmapFactory.decodeResource(this.getResources(), R.drawable.square);
		
		Bitmap front_left_now = BitmapFactory.decodeResource(this.getResources(),R.drawable.front_jump2);
		Bitmap front_right_now = BitmapFactory.decodeResource(this.getResources(),R.drawable.front_jump4);
		Bitmap back_left_now = BitmapFactory.decodeResource(this.getResources(),R.drawable.back_jump2);
		Bitmap back_right_now = BitmapFactory.decodeResource(this.getResources(),R.drawable.back_jump4);
		Bitmap left_up_now = BitmapFactory.decodeResource(this.getResources(),R.drawable.left_jump2);
		Bitmap left_down_now = BitmapFactory.decodeResource(this.getResources(),R.drawable.left_jump4);
		Bitmap right_up_now = BitmapFactory.decodeResource(this.getResources(),R.drawable.right_jump2);
		Bitmap right_down_now = BitmapFactory.decodeResource(this.getResources(),R.drawable.right_jump4);
			super.onDraw(canvas);
			onD++;
			
			if(once){
				initialize();
				once=false;
			}
			//to draw all the rocks on the river
					for(int k=0;k<8;k++)
					{
						for(int l=0;l<8;l++)
						{
						
							if(k==0&&l==1&&changedRock[1]>=1)
							{
						        
								canvas.drawBitmap(stone1, a[l], b[k],null);
								
							}
							else if(k==0&&l==2&&changedRock[2]>=1)
							{
								
								canvas.drawBitmap(stone1, a[l], b[k],null);
								
							}
							else if(k==0&&l==3&&changedRock[3]>=1)
							{
								
								canvas.drawBitmap(stone1, a[l], b[k],null);
								
							}
							else if(k==0&&l==4&&changedRock[4]>=1)
							{
								
								canvas.drawBitmap(stone1, a[l], b[k],null);
								
							}
							else if(k==0&&l==5&&changedRock[5]>=1)
							{
								
								canvas.drawBitmap(stone1, a[l], b[k],null);
								
							}
							else if(k==0&&l==6&&changedRock[6]>=1)
							{
								
								canvas.drawBitmap(stone1, a[l], b[k],null);
								
							}
							else if(k==0&&l==7&&changedRock[7]>=1)
							{
								
								canvas.drawBitmap(stone1, a[l], b[k],null);
								
							}
							else if(k==1&&l==0&&changedRock[8]>=1)
							{
								
								canvas.drawBitmap(stone1, a[l], b[k],null);
							}
							else if(k==1&&l==1&&changedRock[9]>=1)
							{
								
								canvas.drawBitmap(stone1, a[l], b[k],null);
							}
							else if(k==1&&l==2&&changedRock[10]>=1)
							{
								
								canvas.drawBitmap(stone1, a[l], b[k],null);
							}
							else if(k==1&&l==3&&changedRock[11]>=1)
							{
								
								canvas.drawBitmap(stone1, a[l], b[k],null);
							}
							else if(k==1&&l==4&&changedRock[12]>=1)
							{
								
								canvas.drawBitmap(stone1, a[l], b[k],null);
							}
							else if(k==1&&l==5&&changedRock[13]>=1)
							{
								
								canvas.drawBitmap(stone1, a[l], b[k],null);
							}
							else if(k==1&&l==6&&changedRock[14]>=1)
							{
								
								canvas.drawBitmap(stone1, a[l], b[k],null);
							}
							else if(k==1&&l==7&&changedRock[15]>=1)
							{
								
								canvas.drawBitmap(stone1, a[l], b[k],null);
							}
							else if(k==2&&l==0&&changedRock[16]>=1)
							{
								canvas.drawBitmap(stone1, a[l], b[k],null);
							}
							else if(k==2&&l==1&&changedRock[17]>=1)
							{
								canvas.drawBitmap(stone1, a[l], b[k],null);
							}
							else if(k==2&&l==2&&changedRock[18]>=1)
							{
								canvas.drawBitmap(stone1, a[l], b[k],null);
							}
							else if(k==2&&l==3&&changedRock[19]>=1)
							{
								canvas.drawBitmap(stone1, a[l], b[k],null);
							}
							else if(k==2&&l==4&&changedRock[20]>=1)
							{
								canvas.drawBitmap(stone1, a[l], b[k],null);
							}
							else if(k==2&&l==5&&changedRock[21]>=1)
							{
								canvas.drawBitmap(stone1, a[l], b[k],null);
							}
							else if(k==2&&l==6&&changedRock[22]>=1)
							{
								canvas.drawBitmap(stone1, a[l], b[k],null);
							}
							else if(k==2&&l==7&&changedRock[23]>=1)
							{
								canvas.drawBitmap(stone1, a[l], b[k],null);
							}
							
							else if(k==3&&l==0&&changedRock[24]>=1)
							{
								canvas.drawBitmap(stone1, a[l], b[k],null);
							}
							else if(k==3&&l==1&&changedRock[25]>=1)
							{
								
								canvas.drawBitmap(stone1, a[l], b[k],null);
							}
							else if(k==3&&l==2&&changedRock[26]>=1)
							{
								canvas.drawBitmap(stone1, a[l], b[k],null);
							}
							else if(k==3&&l==3&&changedRock[27]>=1)
							{
								canvas.drawBitmap(stone1, a[l], b[k],null);
							}
							else if(k==3&&l==4&&changedRock[28]>=1)
							{
								canvas.drawBitmap(stone1, a[l], b[k],null);
							}
							else if(k==3&&l==5&&changedRock[29]>=1)
							{
								canvas.drawBitmap(stone1, a[l], b[k],null);
							}
							else if(k==3&&l==6&&changedRock[30]>=1)
							{
								canvas.drawBitmap(stone1, a[l], b[k],null);
							}
							else if(k==3&&l==7&&changedRock[31]>=1)
							{
								canvas.drawBitmap(stone1, a[l], b[k],null);
							}
							else if(k==4&&l==0&&changedRock[32]>=1)
							{
								canvas.drawBitmap(stone1, a[l], b[k],null);
							}
							else if(k==4&&l==1&&changedRock[33]>=1)
							{
								
								canvas.drawBitmap(stone1, a[l], b[k],null);
							}
							else if(k==4&&l==2&&changedRock[34]>=1)
							{
								canvas.drawBitmap(stone1, a[l], b[k],null);
							}
							else if(k==4&&l==3&&changedRock[35]>=1)
							{
								canvas.drawBitmap(stone1, a[l], b[k],null);
							}
							else if(k==4&&l==4&&changedRock[36]>=1)
							{
								canvas.drawBitmap(stone1, a[l], b[k],null);
							}
							else if(k==4&&l==5&&changedRock[37]>=1)
							{
								canvas.drawBitmap(stone1, a[l], b[k],null);
							}
							else if(k==4&&l==6&&changedRock[38]>=1)
							{
								canvas.drawBitmap(stone1, a[l], b[k],null);
							}
							else if(k==4&&l==7&&changedRock[39]>=1)
							{
								canvas.drawBitmap(stone1, a[l], b[k],null);
							}
							else if(k==5&&l==0&&changedRock[40]>=1)
							{
								canvas.drawBitmap(stone1, a[l], b[k],null);
							}
							else if(k==5&&l==1&&changedRock[41]>=1)
							{
								canvas.drawBitmap(stone1, a[l], b[k],null);
							}
							else if(k==5&&l==2&&changedRock[42]>=1)
							{
								canvas.drawBitmap(stone1, a[l], b[k],null);
							}
							else if(k==5&&l==3&&changedRock[43]>=1)
							{
								canvas.drawBitmap(stone1, a[l], b[k],null);
							}
							else if(k==5&&l==4&&changedRock[44]>=1)
							{
								canvas.drawBitmap(stone1, a[l], b[k],null);
							}
							else if(k==5&&l==5&&changedRock[45]>=1)
							{
								canvas.drawBitmap(stone1, a[l], b[k],null);
							}
							else if(k==5&&l==6&&changedRock[46]>=1)
							{
								canvas.drawBitmap(stone1, a[l], b[k],null);
							}
							else if(k==5&&l==7&&changedRock[47]>=1)
							{
								canvas.drawBitmap(stone1, a[l], b[k],null);
							}
							else if(k==6&&l==0&&changedRock[48]>=1)
							{
								
							   	canvas.drawBitmap(stone1, a[l], b[k],null);
							}
							else if(k==6&&l==1&&changedRock[49]>=1)
							{
								
								canvas.drawBitmap(stone1, a[l], b[k],null);
							}
							else if(k==6&&l==2&&changedRock[50]>=1)
							{
								canvas.drawBitmap(stone1, a[l], b[k],null);
							}
							else if(k==6&&l==3&&changedRock[51]>=1)
							{
								canvas.drawBitmap(stone1, a[l], b[k],null);
							}
							else if(k==6&&l==4&&changedRock[52]>=1)
							{
								canvas.drawBitmap(stone1, a[l], b[k],null);
							}
							else if(k==6&&l==5&&changedRock[53]>=1)
							{
								canvas.drawBitmap(stone1, a[l], b[k],null);
							}
							else if(k==6&&l==6&&changedRock[54]>=1)
							{
								canvas.drawBitmap(stone1, a[l], b[k],null);
							}
							else if(k==6&&l==7&&changedRock[55]>=1)
							{
								canvas.drawBitmap(stone1, a[l], b[k],null);
							}
							
							else if(k==7&&l==0&&changedRock[56]>=1)
							{
								canvas.drawBitmap(stone1, a[l], b[k],null);
							}
							else if(k==7&&l==1&&changedRock[57]>=1)
							{
								
								canvas.drawBitmap(stone1, a[l], b[k],null);
							}
							else if(k==7&&l==2&&changedRock[58]>=1)
							{
								canvas.drawBitmap(stone1, a[l], b[k],null);
							}
							else if(k==7&&l==3&&changedRock[59]>=1)
							{
								canvas.drawBitmap(stone1, a[l], b[k],null);
							}
							else if(k==7&&l==4&&changedRock[60]>=1)
							{
								canvas.drawBitmap(stone1, a[l], b[k],null);
							}
							else if(k==7&&l==5&&changedRock[61]>=1)
							{
								canvas.drawBitmap(stone1, a[l], b[k],null);
							}
							else if(k==7&&l==6&&changedRock[62]>=1)
							{
								canvas.drawBitmap(stone1, a[l], b[k],null);
							}
							else if(k==7&&l==7&&changedRock[63]>=1)
							{
								canvas.drawBitmap(stone1, a[l], b[k],null);
							}
							else
							{
								canvas.drawBitmap(blue1, a[l], b[k], null);
							}
						}
					}
			//to draw the frog at the top when activity starts
			 if(count==1)
			 {
				 canvas.drawBitmap(front_frog, x-(front_frog.getWidth()/2), y-(front_frog.getHeight()/2), null);
			 }
			 if(score==305)
			 {
				 show_congrat();
			 }
			//checking the condition of ontouch event
			 if(front==1)
			 {
				   
				  xValue = (x1+(yValue-y1)/slope);
		          if(yValue<y1)		  
				  {
		        	  if(x1<(p2-25))
		        	  {
		        		  canvas.drawBitmap(front_left_now, xValue-(front_left_now.getWidth()/2), yValue-(front_left_now.getHeight()/2), null);
				      }
		        	  else if(x1>p2+25)
		        	  {
		        		  canvas.drawBitmap(front_right_now, xValue-(front_right_now.getWidth()/2), yValue-(front_right_now.getHeight()/2), null);
		        	  }
		        	  else
		        	  {
		        		 canvas.drawBitmap(anim_front_frog,(xValue-(anim_front_frog.getWidth()/2)),(yValue-(anim_front_frog.getHeight()/2)), null);
		        	  }
		        	  yValue+=20;
				   }
		           else
				   {
					  if(sub1==0)
					  {
						 canvas.drawBitmap(front_frog, x-(front_frog.getWidth()/2), y-(front_frog.getHeight()/2), null);
						 scoreView.setText(""+score);
					  }
					  if(flag==1)
					  {
						 if((x1>80&&x1<130&&y1>180&&y1<230)||(x1>80&&x1<130&&y1>230&&y1<280)||(x1>30&&x1<80&&y1>230&&y1<280)||
								 (x1>280&&x1<330&&y1>380&&y1<430)||(x1>280&&x1<330&&y1>430&&y1<480)||(x1>230&&x1<280&&y1>330&&y1<380)||
								 (x1>180&&x1<230&&y1>380&&y1<430)||(x1>180&&x1<230&&y1>430&&y1<480)||(x1>180&&x1<230&&y1>330&&y1<380)||
								 (x1>230&&x1<280&&y1>430&&y1<480)||(x1>280&&x1<330&&y1>330&&y1<380)||(x1>330&&x1<380&&y1>530&&y1<580)||
								 (x1>380&&x1<430&&y1>480&&y1<530)||(x1>330&&x1<380&&y1>480&&y1<530))
						 {
							 canvas.drawBitmap(bubble1,( x-(front_frog.getWidth()/2)+40),( y-(front_frog.getHeight()/2)-50), null);
						 }
						 else
						 {
							  if(x1>80&&x1<380&&y1>230&&y1<530)        
							  {
								
								    show_Center_Rock(x1,y1);
				              }
							  else if(x1<80&&x1>30&&y1>280&&y1<530)
							  {
								  show_First_Column(x1,y1);
							  }
							  else if(y1>180&&y1<230&&x1>130&&x1<380) 
							  {
								  show_First_Row(x1,y1);
							  }
							  else if(x1>380&&x1<430&&y1>230&&y1<480)
							  {
								  show_Last_Column(x1,y1);
							  }
							  else if(x1>80&&x1<330&&y1>530&&y1<580)
							  {
								  show_Last_Row(x1,y1);
							  }
							  else if(x1>30&&x1<80&&y1>530&&y1<580)
							  {
								  show_Left_Down_Corner(x1,y1);
							  }
							  else if(x1>380&&x1<430&&y1>180&&y1<230)
							  { 
								  show_Top_Right_Corner(x1,y1);
							  }
							  else
							  {
								  ;
						
							  }
						 }  
					}			   
				     if((x1<80&&x1>30)&&(y1>180&&y1<230)||(x1<430&&x1>380)&&(y1>530&&y1<580)||((x1<280&&x1>230)&&(y1>380&&y1<430)))
					 {
							swamp_areas(x,y,canvas);
		    		  }
					 
					 
				 }
			 }
			 if(back==1)
			 {
				  xValue = (x1+(yValue-y1)/slope);
		          if(yValue>y1)		  
				  {
		        	 if(x1<(p2-25))
		        	  {
		        	      canvas.drawBitmap(back_left_now, xValue-(back_left_now.getWidth()/2), yValue-(back_left_now.getHeight()/2), null);
		        	     
		        	  }
		        	 
		        	 else if(x1>(p2+50))
		        	  {
		        		 canvas.drawBitmap(back_right_now, xValue-(back_right_now.getWidth()/2), yValue-(back_right_now.getHeight()/2), null);
		        		
		        	  }	
		        	 else
		        	 {
		        		 canvas.drawBitmap(anim_back_frog,(xValue-(anim_back_frog.getWidth()/2)),(yValue-(anim_back_frog.getHeight()/2)), null);
		        		 
		        	 }
		        	 yValue-=20;
				  }
				 else
				 {
					 if(sub1==0)
					 {	 
						     
						 	 canvas.drawBitmap(back_frog, x-(back_frog.getWidth()/2), y-(back_frog.getHeight()/2), null);
				 	         scoreView.setText(""+score);
					 }
					 if(flag==1)
					 {
					 if((x1>80&&x1<130&&y1>180&&y1<230)||(x1>80&&x1<130&&y1>230&&y1<280)||(x1>30&&x1<80&&y1>230&&y1<280)||
							   (x1>280&&x1<330&&y1>380&&y1<430)||(x1>280&&x1<330&&y1>430&&y1<480)||(x1>230&&x1<280&&y1>330&&y1<380)||
							   (x1>180&&x1<230&&y1>380&&y1<430)||(x1>180&&x1<230&&y1>430&&y1<480)||(x1>180&&x1<230&&y1>330&&y1<380)||
							   (x1>230&&x1<280&&y1>430&&y1<480)||(x1>280&&x1<330&&y1>330&&y1<380)||(x1>330&&x1<380&&y1>530&&y1<580)||
							   (x1>380&&x1<430&&y1>480&&y1<530)||(x1>330&&x1<380&&y1>480&&y1<530))
					 {
						 canvas.drawBitmap(bubble1,( x-(front_frog.getWidth()/2)+40),( y-(front_frog.getHeight()/2)-50), null);
					 }
					 else
					 {
    					  if(x1>80&&x1<380&&y1>230&&y1<530)
						  {
							
							    show_Center_Rock(x1,y1);
			              }
						  else if(x1<80&&x1>30&&y1>280&&y1<530)
						  {
							  show_First_Column(x1,y1);
						  }
						  else if(y1>180&&y1<230&&x1>130&&x1<380) 
						  {
							  show_First_Row(x1,y1);
						  }
						  else if(x1>380&&x1<430&&y1>230&&y1<480)
						  {
							  show_Last_Column(x1,y1);
						  }
						  else if(x1>80&&x1<330&&y1>530&&y1<580)
						  {
							  show_Last_Row(x1,y1);
						  }
						  else if(x1>30&&x1<80&&y1>530&&y1<580)
						  {
							  show_Left_Down_Corner(x1,y1);
						  }
						  else if(x1>380&&x1<430&&y1>180&&y1<230)
						  { 
							  show_Top_Right_Corner(x1,y1);
						  }
						  else
						  {
							  ;
						  }
					 }
					 }
					 if((x1<80&&x1>30)&&(y1>180&&y1<230)||(x1<430&&x1>380)&&(y1>530&&y1<580)||((x1<280&&x1>230)&&(y1>380&&y1<430)))
				   	 {
						     swamp_areas(x,y,canvas);
						 	
					}
				}
			 }
			 if(left==1)
			 {
				  yValue=y1+slope*(xValue-x1);
		          if(xValue>x1)
				  {
					   if(y1<(q2-25))
		        	   {
		        	      canvas.drawBitmap(left_up_now, xValue-(left_up_now.getWidth()/2), yValue-(left_up_now.getHeight()/2), null);
		        	     
		        	   }
		        	   else if(y1>(q2+50))
		        	   {
		        		 canvas.drawBitmap(left_down_now, xValue-(left_down_now.getWidth()/2), yValue-(left_down_now.getHeight()/2), null);
		        		 
		        	   }	
		        	   else
		        	   {
		        		   canvas.drawBitmap(anim_left_frog,(xValue-(anim_left_frog.getWidth()/2)),(yValue-(anim_left_frog.getHeight()/2)), null);
		        		   
		        	   }
					   xValue-=20;
				    }
		        	else 
				    {
				       if(sub1==0)
				       {
				           canvas.drawBitmap(left_frog, x-(left_frog.getWidth()/2), y-(left_frog.getHeight()/2), null);
					       scoreView.setText(""+score);
				       }
				       if(flag==1)
				       {
				       if((x1>80&&x1<130&&y1>180&&y1<230)||(x1>80&&x1<130&&y1>230&&y1<280)||(x1>30&&x1<80&&y1>230&&y1<280)||
							   (x1>280&&x1<330&&y1>380&&y1<430)||(x1>280&&x1<330&&y1>430&&y1<480)||(x1>230&&x1<280&&y1>330&&y1<380)||
							   (x1>180&&x1<230&&y1>380&&y1<430)||(x1>180&&x1<230&&y1>430&&y1<480)||(x1>180&&x1<230&&y1>330&&y1<380)||
							   (x1>230&&x1<280&&y1>430&&y1<480)||(x1>280&&x1<330&&y1>330&&y1<380)||(x1>330&&x1<380&&y1>530&&y1<580)||
							   (x1>380&&x1<430&&y1>480&&y1<530)||(x1>330&&x1<380&&y1>480&&y1<530))
					   {
						 canvas.drawBitmap(bubble1,( x-(front_frog.getWidth()/2)+40),( y-(front_frog.getHeight()/2)-50), null);
					   }
					   else
					   {
						      if(x1>80&&x1<380&&y1>230&&y1<530)
							  {
						    	  show_Center_Rock(x1,y1);
				              }
						      else if(x1<80&&x1>30&&y1>280&&y1<530)
							  {
								  show_First_Column(x1,y1);
							  }
							  else if(y1>180&&y1<230&&x1>130&&x1<380) 
							  {
								  show_First_Row(x1,y1);
							  }
							  else if(x1>380&&x1<430&&y1>230&&y1<480)
							  {
								  show_Last_Column(x1,y1);
							  }
							  else if(x1>80&&x1<330&&y1>530&&y1<580)
							  {
								  show_Last_Row(x1,y1);
							  }
							  else if(x1>30&&x1<80&&y1>530&&y1<580)
							  {
								  show_Left_Down_Corner(x1,y1);
							  }
							  else if(x1>380&&x1<430&&y1>180&&y1<230)
							  { 
								  show_Top_Right_Corner(x1,y1);
							  }
							  else
							  {
								  ;
							  }
					     }
				     }
				     if((x1<80&&x1>30)&&(y1>180&&y1<230)||(x1<430&&x1>380)&&(y1>530&&y1<580)||((x1<280&&x1>230)&&(y1>380&&y1<430)))
					 {
				    	    swamp_areas(x,y,canvas);	
				    	 
		    		  }
				     
				  }
			 }
			 if(right==1)
			 {
				 
				  yValue=y1+slope*(xValue-x1);
		          if(xValue<x1)		  
				  {
		        	   if(y1<(q2-25))
		        	   {
		        	      canvas.drawBitmap(right_up_now, xValue-(right_up_now.getWidth()/2), yValue-(right_up_now.getHeight()/2), null);
		        	     
		        	   }
		        	   else if(y1>(q2+25))
		        	   {
		        		 canvas.drawBitmap(right_down_now, xValue-(right_down_now.getWidth()/2), yValue-(right_down_now.getHeight()/2), null);
		        		 
		        	   }	
		        	   else
		        	   {
		        		   canvas.drawBitmap(anim_right_frog,(xValue-(anim_right_frog.getWidth()/2)),(yValue-(anim_right_frog.getHeight()/2)), null);
		        		   
		        	   }
		        	   xValue+=20;
				    }
			   else
			   {
					if(sub1==0)
					{
						  
						   canvas.drawBitmap(right_frog, x-(right_frog.getWidth()/2), y-(right_frog.getHeight()/2), null);
						   scoreView.setText(""+score);
					}
					if(flag==1)
					{
					   if((x1>80&&x1<130&&y1>180&&y1<230)||(x1>80&&x1<130&&y1>230&&y1<280)||(x1>30&&x1<80&&y1>230&&y1<280)||
							   (x1>280&&x1<330&&y1>380&&y1<430)||(x1>280&&x1<330&&y1>430&&y1<480)||(x1>230&&x1<280&&y1>330&&y1<380)||
							   (x1>180&&x1<230&&y1>380&&y1<430)||(x1>180&&x1<230&&y1>430&&y1<480)||(x1>180&&x1<230&&y1>330&&y1<380)||
							   (x1>230&&x1<280&&y1>430&&y1<480)||(x1>280&&x1<330&&y1>330&&y1<380)||(x1>330&&x1<380&&y1>530&&y1<580)||
							   (x1>380&&x1<430&&y1>480&&y1<530)||(x1>330&&x1<380&&y1>480&&y1<530))
					 {
						 canvas.drawBitmap(bubble1,( x-(front_frog.getWidth()/2)+40),( y-(front_frog.getHeight()/2)-50), null);
					 }
					 else
					 {
				
						 if(x1>80&&x1<380&&y1>230&&y1<530)
						  {
				 		       show_Center_Rock(x1,y1);
			              }
						 else if(x1<80&&x1>30&&y1>280&&y1<530)//////////////
						  {
							   show_First_Column(x1,y1);
						  }
						  else if(y1>180&&y1<230&&x1>130&&x1<380) 
						  {
							   show_First_Row(x1,y1);
						  }
						  else if(x1>380&&x1<430&&y1>230&&y1<480)
						  {
							   show_Last_Column(x1,y1);
						  }
						  else if(x1>80&&x1<330&&y1>530&&y1<580)
						  {
							   show_Last_Row(x1,y1);
						  }
						  else if(x1>30&&x1<80&&y1>530&&y1<580)
						  {
							   show_Left_Down_Corner(x1,y1);
						  }
						  else if(x1>380&&x1<430&&y1>180&&y1<230)
						  { 
							   show_Top_Right_Corner(x1,y1);
						  }
						  else
						  {
							  ;
						  }
					 }
					 
					}
					if((x1<80&&x1>30)&&(y1>180&&y1<230)||(x1<430&&x1>380)&&(y1>530&&y1<580)||((x1<280&&x1>230)&&(y1>380&&y1<430)))
					{
						swamp_areas(x,y,canvas);
						
					}
             }
		        
		         
       }
}
private void show_congrat() {
		// TODO Auto-generated method stub
	    Intent i=new Intent(contxt1,CongratulationActivity.class);
	    ((Activity) contxt1).finish();
	    contxt1.startActivity(i);
	   //((Activity) contxt1).finish();
		
	}

private void swamp_areas(float x, float y,Canvas canvas) {
		// TODO Auto-generated method stub
	Bitmap danger = BitmapFactory.decodeResource(this.getResources(), R.drawable.redsquare);
	Bitmap front_dis = BitmapFactory.decodeResource(this.getResources(), R.drawable.front_dissolve);
	Bitmap front_dis1 = BitmapFactory.decodeResource(this.getResources(), R.drawable.front_dissolve1);
	Bitmap front_dis2 = BitmapFactory.decodeResource(this.getResources(), R.drawable.front_dissolve2);
	sub1++;
	if(Values.sfxValue==0)
	{
		if(splash==0)
		{
			//mp1.start();
			splash++;
		
		}
		else
		{
			//mp1.stop();
		}
	}
	canvas.drawBitmap(danger, 30, 180, null);
	canvas.drawBitmap(danger, 380, 530, null);
	canvas.drawBitmap(danger, 230, 380, null);
	if(sub1==1)
	{
	 canvas.drawBitmap(front_dis, x-(front_dis.getWidth()/2), y-(front_dis.getHeight()/2), null);
	}
	if(sub1==2)
	{
		front_dis.recycle();	
		canvas.drawBitmap(front_dis1, x-(front_dis1.getWidth()/2), y-(front_dis1.getHeight()/2), null);
	}
	if(sub1==3)
	{
		front_dis1.recycle();
		canvas.drawBitmap(front_dis2, x-(front_dis2.getWidth()/2), y-(front_dis2.getHeight()/2), null);
	}
	if(sub1==4)
	{
		front_dis2.recycle();
		canvas.drawBitmap(danger, 30, 180, null);
		canvas.drawBitmap(danger, 380, 530, null);
		show_loose();
		return;
	}
	
		
	}

private void show_Top_Right_Corner(float x12, float y12) {
		// TODO Auto-generated method stub
		m1=7;
	    doubleClick1[m1-1]++;
	    doubleClick1[m1+7]++;
	    doubleClick1[m1+8]++;
	    changedRock[m1-1]++;
	    if(changedRock[m1-1]==1)
	    {
	    	score+=5;
	    }
	    changedRock[m1+7]++;
	    if(changedRock[m1+7]==1)
	    {
	    	score+=5;
	    }
	    changedRock[m1+8]++;
	    if(changedRock[m1+8]==1)
	    {
	    	score+=5;
	    }
	      
	    	  
	}

private void show_Left_Down_Corner(float x12, float y12) {
		// TODO Auto-generated method stub
	    m1=56;
	 //   changedRock[m1-7]=1;
	  //  changedRock[m1-8]=1;
	  //  changedRock[m1+1]=1;
	    doubleClick1[m1-7]++;
	    doubleClick1[m1-8]++;
	    doubleClick1[m1+1]++;
	    changedRock[m1-7]++;
	    if(changedRock[m1-7]==1)
	    {
	    	score+=5;
	    }
	    changedRock[m1-8]++;
	    if(changedRock[m1-8]==1)
	    {
	    	score+=5;
	    }
	    changedRock[m1+1]++;
	    if(changedRock[m1+1]==1)
	    {
	    	score+=5;
	    }
		
	}

private void show_Last_Row(float x12, float y12) {
		// TODO Auto-generated method stub
	if(x1>80&&x1<130)
	{
		m1=57;
	}
	else if(x1>130&&x1<180)
	{
		m1=58;
	}
	else if(x1>180&&x1<230)
	{
		m1=59;
	}
	else if(x1>230&&x1<280)
	{
		m1=60;
	}
	else
	{
		m1=61;
	}
	//changedRock[m1-1]=1;
	doubleClick1[m1-1]++;
   // changedRock[m1-7]=1;
    doubleClick1[m1-7]++;
  //  changedRock[m1-8]=1;
    doubleClick1[m1-8]++;
  //  changedRock[m1-9]=1;
    doubleClick1[m1-9]++;
   // changedRock[m1+1]=1;
    doubleClick1[m1-1]++;
    changedRock[m1-1]++;
    if(changedRock[m1-1]==1)
    {
    	score+=5;
    }
    changedRock[m1-7]++;
    if(changedRock[m1-7]==1)
    {
    	score+=5;
    }
    changedRock[m1-8]++;
    if(changedRock[m1-8]==1)
    {
    	score+=5;
    }
    changedRock[m1-9]++;
    if(changedRock[m1-9]==1)
    {
    	score+=5;
    }
    changedRock[m1+1]++;
    if(changedRock[m1+1]==1)
    {
    	score+=5;
    }
   
    
	}

private void show_Last_Column(float x12, float y12) {
		// TODO Auto-generated method stub
		if(y1>230&&y1<280)
		{
			m1=15;
		}
		else if(y1>280&&y1<330)
		{
			m1=23;
		}
		else if(y1>330&&y1<380)
		{
			m1=31;
		}
		else if(y1>380&&y1<430)
		{
			m1=39;
		}
		else
		{
			m1=47;
		}
		
	//	  changedRock[m1-1]=1;
		changedRock[m1-1]++;
		if(changedRock[m1-1]==1)
		{
			score+=5;
		}
		  doubleClick1[m1-1]++;
	//      changedRock[m1+8]=1;
		  changedRock[m1+8]++;
		  if(changedRock[m1+8]==1)
			{
				score+=5;
			}
	      doubleClick1[m1+8]++;
	 //     changedRock[m1-8]=1;
	      changedRock[m1-8]++;
	      if(changedRock[m1-8]==1)
			{
				score+=5;
			}
	      doubleClick1[m1-8]++;
	 //     changedRock[m1-9]=1;
	      changedRock[m1-9]++;
	      if(changedRock[m1-9]==1)
			{
				score+=5;
			}
	      doubleClick1[m1-9]++;
	 //     changedRock[m1+7]=1;
	      changedRock[m1+7]++;
	      if(changedRock[m1+7]==1)
			{
				score+=5;
			}
	      doubleClick1[m1+7]++;
		
	}

private void show_First_Row(float x12, float y12) {
		// TODO Auto-generated method stub
		if(x1>130&&x1<180)
		{
			m1=2;
		}
		else if(x1>180&&x1<230)
		{
			m1=3;
		}
		else if(x1>230&&x1<280)
		{
			m1=4;
		}
		else if(x1>280&&x1<330)
		{
			m1=5;
		}
		else
		{
			m1=6;
		}
		 // changedRock[m1+1]=1;
			changedRock[m1+1]++;
			if(changedRock[m1+1]==1)
			{
				score+=5;
			}
		    doubleClick1[m1+1]++;
	      //  changedRock[m1+7]=1;
		  changedRock[m1+7]++;
		  if(changedRock[m1+7]==1)
			{
				score+=5;
			}
		  doubleClick1[m1+7]++;
	     // changedRock[m1+8]=1;
		  changedRock[m1+8]++;
		  if(changedRock[m1+8]==1)
			{
				score+=5;
			}
	      doubleClick1[m1+8]++;
	     // changedRock[m1+9]=1;
	      changedRock[m1+9]++;
	      if(changedRock[m1+9]==1)
			{
				score+=5;
			}
	      doubleClick1[m1+9]++;
	    // changedRock[m1-1]=1;
	      changedRock[m1-1]++;
	      if(changedRock[m1-1]==1)
			{
				score+=5;
			}
	      doubleClick1[m1-1]++;
	}

private void show_First_Column(float x12, float y12) {
		// TODO Auto-generated method stub
		if(y1>280&&y1<330)
		{
			m1=16;
		}
		else if(y1>330&&y1<380)
		{
			m1=24;
		}
		else if(y1>380&&y1<430)
		{
			m1=32;
		}
		else if(y1>430&&y1<480)
		{
			m1=40;
		}
		else
		{
			m1=48;
		}
		  changedRock[m1-8]++;
		  if(changedRock[m1-8]==1)
		  {
			  score+=5;
		  }
		  doubleClick1[m1-8]++;
	      changedRock[m1+8]++;
	      if(changedRock[m1+8]==1)
		  {
			  score+=5;
		  }
	      doubleClick1[m1+8]++;
	      changedRock[m1+9]++;
	      if(changedRock[m1+9]==1)
		  {
			  score+=5;
		  }
	      doubleClick1[m1+9]++;
	      changedRock[m1+1]++;
	      if(changedRock[m1+1]==1)
		  {
			  score+=5;
		  }
	      doubleClick1[m1+1]++;
	      changedRock[m1-7]++;
	      if(changedRock[m1-7]==1)
		  {
			  score+=5;
		  }
	      doubleClick1[m1-7]++;
}

private void show_Center_Rock(float x1, float y1) {
		// TODO Auto-generated method stub
	
	   if(x1>130&&x1<180&&y1>230&&y1<280)
	   {
		   m1=10;
	   }
	   else if(x1>180&&x1<230&&y1>230&&y1<280)
	   {
		   m1=11;
	   }
	   else if(x1>230&&x1<280&&y1>230&&y1<280)
	   {
		   m1=12;
	   }
	   else if(x1>280&&x1<330&&y1>230&&y1<280)
	   {
		   m1=13;
	   }
	   else if(x1>330&&x1<380&&y1>230&&y1<280)
	   {
		   m1=14;
	   }
	   else if(x1>80&&x1<130&&y1>280&&y1<330)
	   {
		   m1=17;
	   }
	   else if(x1>130&&x1<180&&y1>280&&y1<330)
	   {
		   m1=18;
	   }
	   else if(x1>180&&x1<230&&y1>280&&y1<330)
	   {
		   m1=19;
	   }
	   else if(x1>230&&x1<280&&y1>280&&y1<330)
	   {
		   m1=20;
	   }
	   else if(x1>280&&x1<330&&y1>280&&y1<330)
	   {
		   m1=21;
	   }
	   else if(x1>330&&x1<380&&y1>280&&y1<330)
	   {
		   m1=22;
	   }
	   else if(x1>80&&x1<130&&y1>330&&y1<380)
	   {
		   m1=25;
	   }
	   else if(x1>130&&x1<180&&y1>330&&y1<380)
	   {
		   m1=26;
	   }
	   else if(x1>330&&x1<380&&y1>330&&y1<380)
	   {
		   m1=30;
	   }
	   else if(x1>80&&x1<130&&y1>380&&y1<430)
	   {
		   m1=33;
	   }
	   else if(x1>130&&x1<180&&y1>380&&y1<430)
	   {
		   m1=34;
	   }
	   else if(x1>330&&x1<380&&y1>380&&y1<430)
	   {
		   m1=38;
	   }
	   else if(x1>80&&x1<130&&y1>430&&y1<480)
	   {
		   m1=41;
	   }
	   else if(x1>130&&x1<180&&y1>430&&y1<480)
	   {
		   m1=42;
	   }
	   else if(x1>330&&x1<380&&y1>430&&y1<480)
	   {
		   m1=46;
	   }
	   else if(x1>80&&x1<130&&y1>480&&y1<530)
	   {
		   m1=49;
	   }
	   else if(x1>130&&x1<180&&y1>480&&y1<530)
	   {
		   m1=50;
	   }
	   else if(x1>180&&x1<230&&y1>480&&y1<530)
	   {
		   m1=51;
	   }
	   else if(x1>230&&x1<280&&y1>480&&y1<530)
	   {
		   m1=52;
	   }
	   else if(x1>280&&x1<330&&y1>480&&y1<530) 
	   {
		   m1=53;
	   }
	   else
	   {
		   swamp_Rocks++;
	   }
	   	      if(swamp_Rocks==0)
	   	      {
	   	    	  
	   	    	  changedRock[m1-1]++;
	   	    	  if(changedRock[m1-1]==1)
	   			  {
	   				  score+=5;
	   			  }
	   	    	  doubleClick1[m1-1]++;
	   	    	  changedRock[m1+1]++;
	   	    	  if(changedRock[m1+1]==1)
	   			  {
	   				  score+=5;
	   			  }
	   	    	  doubleClick1[m1+1]++;
	   	    	  changedRock[m1+7]++;
	   	    	  if(changedRock[m1+7]==1)
	   			  {
	   				  score+=5;
	   			  }
	   	    	  doubleClick1[m1+7]++;
	   	    	  changedRock[m1+8]++;
	   	    	  if(changedRock[m1+8]==1)
	   			  {
	   				  score+=5;
	   			  }
	   	    	  doubleClick1[m1+8]++;
	   	    	  changedRock[m1+9]++;
	   	    	  if(changedRock[m1+9]==1)
	   			  {
	   				  score+=5;
	   			  }
	   	    	  doubleClick1[m1+9]++;
	   	    	  changedRock[m1-8]++;
	   	    	  if(changedRock[m1-8]==1)
	   			  {
	   				  score+=5;
	   			  }
	   	    	  doubleClick1[m1-8]++;
	   	    	  changedRock[m1-9]++;
	   	    	  if(changedRock[m1-9]==1)
	   			  {
	   				  score+=5;
	   			  }
	   	    	  doubleClick1[m1-9]++;
	   	    	  changedRock[m1-7]++;
	   	    	  if(changedRock[m1-7]==1)
	   			  {
	   				  score+=5;
	   			  }
	   	    	  doubleClick1[m1-7]++;
	   	      }
	   	     
}

private void show_loose() {
		// TODO Auto-generated method stub
		Intent i=new Intent(contxt1,IncorrectsolutionActivity.class);
		contxt1.startActivity(i);
		((Activity) contxt1).finish();
		
	}
}

class animHandler extends Handler
{ 
	
	View vv;
    int miterations;
    int mcuriteration;
    animHandler(int count,View v)
    {
    	vv=v;
        miterations=count;
        mcuriteration=0;
	}

    
	public void handleMessage(Message msg) {
		// TODO Auto-generated method stub
		super.handleMessage(msg);
	//	if(miterations > 0 )
		    vv.invalidate();
	//	miterations--;
		sendEmptyMessage(0);
	}
	
}
