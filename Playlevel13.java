package com.org.proj;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
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


public class Playlevel13 extends Activity implements OnClickListener {
	afRelativeLoutl13 av;
	animHandlerl13 h;
	//MediaPlayer mp;
  //  public int modeValue,difficultyValue,sfxValue,money;
	public int musicValue;
    
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        av=new afRelativeLoutl13(this);
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
    			h=new animHandlerl13(1000,av);
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
class afRelativeLoutl13 extends LinearLayout
{
    int blue_square=1,cong=0;
	int click=0,height,width;
    int ci=1000;
	int width1,height1;
	int []a = new int[8];
	int []b = new int[8];
	private Context contxt1;
	private RelativeLayout rl;
	//MediaPlayer mp1;
	ImageView homeView,solveView,resetView,hintView,rockView,swampView,waterView;
	TextView scoreView,timeView;
	int onD=0,changeAfterThis,splash;
	int[] doubleClick1=new int[64];
	int[] changedRock=new int[64];
	int[] convertRock=new int[64];
	float x=200,y=30;
	Thread t;
	boolean once=true;
	int swampflag=1;
	int flag=0,front=0,back=0,count=1,flag1=0,right=0,left=0,anim=0,swamp=0,sub1=0,sub2=0,sub3=0,arcade=0,m1,m2;
	float p,q,r,s=0,x1,y1,p1,q1,s1=0,r1,p2,q2,s2=0,p3,q3,s3=0,slope;
	float yValue=30,xValue;
	double val;
	Bitmap stone;
	Bitmap rock;
	float x_position,y_position;
	float frog_xposition,frog_yposition;
	float x_difference,y_difference;
	RelativeLayout.LayoutParams scoreView_rlp,timeView_rlp,hintImv_rlp,hmImv_rlp,  rstImv_rlp,solveImv_rlp;
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
	public afRelativeLoutl13(Context context) {
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
	     hmImv_rlp.width= width/4;
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
		    rstImv_rlp.height= height/7;
		    rl.addView(resetView, rstImv_rlp);
		    
	//click to reset
		    //click to get home
		     resetView.setOnClickListener(new View.OnClickListener() {
				
				
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent i = new Intent(contxt1,Playlevel14.class);
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
		    
		    solveView.setOnClickListener(new View.OnClickListener()
		     {
				
				public void onClick(View v)
				{
					// TODO Auto-generated method stub
					
					 AlertDialog.Builder builder = new AlertDialog.Builder(contxt1); 
		               
	                    builder.setMessage("Are you sure??");
                   builder.setCancelable(false);
                   builder.setNegativeButton("no", new DialogInterface.OnClickListener() { 
                   public void onClick(DialogInterface dialog, int id) { 
             dialog.cancel(); 
            } 
      });
                   builder.setPositiveButton("yes", new DialogInterface.OnClickListener() { 
                       public void onClick(DialogInterface dialog, int id) { 
                 dialog.cancel(); 
               Values.click13 =1;
                 //solve();
                }

						
							
          });
                   
     AlertDialog alert = builder.create();
     alert.show();
          }

					//click=1;
							
				}
			);	
		    
      //hint imageview
		    
		    hintView=new ImageView(contxt1);
		    hintView.setId(93);		 
		    hintView.setImageResource(R.drawable.hints);
		    hintView.setAdjustViewBounds(true);
		    RelativeLayout.LayoutParams hintImv_rlp=new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
		    hintImv_rlp.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
		    hintImv_rlp.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, RelativeLayout.TRUE);
		    hintImv_rlp.width= width/4; 
		    hintImv_rlp.height= height/7;
		    rl.addView(hintView, hintImv_rlp);
		    hintView.setOnClickListener(new View.OnClickListener() {
		  		   public void onClick(View v) {
		                  AlertDialog.Builder builder = new AlertDialog.Builder(contxt1); 
		                 
		               //  if(count6==0)
				                    builder.setMessage("There exists succesive swamps in the last row!!You might end up on a swamp Area!!");
			              //  else if(count6==1)
				                   // builder.setMessage(" swamp!!"); 
			               // else if(count6==2)
				                   // builder.setMessage("safe!!");
			               // else
				                    //builder.setMessage("hints over!!");
			                builder.setCancelable(false); 
		                 builder.setNegativeButton("ok", new DialogInterface.OnClickListener() { 
		                        public void onClick(DialogInterface dialog, int id) { 
		                        dialog.cancel(); 
		                       } 
		                 });
		                AlertDialog alert = builder.create();
		                alert.show();
			              // count6++;
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
			 if(cong!=1){
				 if(Values.mode==0){
                	 final long start = mStartTime;
                	 Log.d(tag, "intime");
                	 long elapseTime = System.currentTimeMillis() - start;
                	 int seconds = (int)(elapseTime / 1000);
                	 int secs=seconds;
                	 int minutes = seconds / 60;
                	 seconds     = seconds % 60;

                	 if (seconds<10) 
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
                	 if(Values.diff==0)//easy
                	 {
                	    if(secs==180)
                	     {
                		 	//stopTimer=true;
                		 	 Values.score11=0;
                		 	 Values.clickedt=13;
                			Intent i = new Intent(contxt1,TimeOutActivity.class);
                		 	((Activity) contxt1).finish();
                		 	contxt1.startActivity(i);
                		 }
                	 }
                	 else
                	 {
                		 if(secs==90)
                	     {
                		 	//stopTimer=true;
                		 	 Values.score11=0;	 Values.clickedt=13;
                			Intent i = new Intent(contxt1,TimeOutActivity.class);
                		 	((Activity) contxt1).finish();
                		 	contxt1.startActivity(i);
                		 }
                		 
                	 }
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
    		            
    		 						
    		                        if((x1>=a[1]&&x1<a[2])&&(y1>b[1]&&y1<b[2]))
      		 						 {
      		 							  if(doubleClick1[9]==0)
      		 							  {
      		 							       x1=a[1]+((a[2]-a[1])/2);
   	 								       y1=b[1]+((b[2]-b[1])/2);  
      		 						       
      		 						           flag=1;doubleClick1[9]++; changedRock[9]=1;
      		 							  }
      		 							
      		 						 }
       		                     else if((x1>=a[2]&&x1<a[3])&&(y1>=b[1]&&y1<b[2]))
    		 						  {
    		 							  if(doubleClick1[10]==0)
    		 							     {
    		 							       x1=a[2]+((a[3]-a[2])/2);
    		 							       y1=b[1]+((b[2]-b[1])/2);
    		 							      flag=1;  
    		 							      doubleClick1[10]++;
    		 							      changedRock[10]=1;
    		 							      }
    		 							
    		 						  }	  
       		 					else if((x1>=a[3]&&x1<a[4])&&(y1>=b[1]&&y1<b[2]))
   		 						 {
    		 							 if(doubleClick1[11]==0)
    		 							 { 
    		 							     x1=a[3]+((a[4]-a[3])/2);
    		 						         y1=b[1]+((b[2]-b[1])/2);
   		 							     flag=1;
   		 							     doubleClick1[11]++;
   		 							     changedRock[11]=1;
   		 							    // convertRock[11]=1;
    		 							 }
   		 						 }
       		 					else if((x1>=a[4]&&x1<a[5])&&(y1>=b[1]&&y1<b[2]))
   		 						 {
   		 							 if(doubleClick1[12]==0)
   		 							 {
   		 								   x1=a[4]+((a[5]-a[4])/2);
   		 						           y1=b[1]+((b[2]-b[1])/2);
   		 							     flag=1;
   		 							     doubleClick1[12]++;
   		 							     changedRock[12]=1;
   		 							    // convertRock[12]=1;
   		 							 }
   		 					     }
       		 				else if((x1>=a[5]&&x1<a[6])&&(y1>=b[1]&&y1<b[2]))
   		 						 {
   		 						     if(doubleClick1[13]==0)
   		 							 {
   		 								   x1=a[5]+((a[6]-a[5])/2);
   		 						    	   y1=b[1]+((b[2]-b[1])/2);
   		 							     flag=1;
   		 							     doubleClick1[13]++;
   		 							     changedRock[13]=1;
   		 							    // convertRock[13]=1;
   		 							 }
   		 					    }
       		 					else if((x1>=a[6]&&x1<a[7])&&(y1>=b[1]&&y1<b[2]))
   		 						{
   		 						     if(doubleClick1[14]==0)
   		 							 {
   		 								   x1=a[6]+((a[7]-a[6])/2);
   		 						    	   y1=b[1]+((b[2]-b[1])/2);
   		 							      flag=1;
   		 							      doubleClick1[14]++;
   		 							      changedRock[14]=1;
   		 							     // convertRock[14]=1;
   		 							 }
   		 						}
       		 				//END OF ROW1
       		 					 else if((x1>=a[1]&&x1<a[2])&&(y1>=b[2]&&y1<b[3]))
   		 						 {
   		 							  if(doubleClick1[17]==0)
   		 							  {
   		 							      x1=a[1]+((a[2]-a[1])/2);
   		 							 	  y1=b[2]+((b[3]-b[2])/2);
   		 								  flag=1;
   		 								  doubleClick1[17]++;
   		 								  changedRock[17]=1;
   		 								  //convertRock[17]=1;
   		 							  }
   		 						 }
       		 					else if((x1>=a[2]&&x1<a[3])&&(y1>=b[2]&&y1<b[3]))
    		 						  {
    		 							    if(doubleClick1[18]==0)
    		 							    {
    		 							      x1=a[2]+((a[3]-a[2])/2);
    		 								  y1=b[2]+((b[3]-b[2])/2);
    		 							    	flag=1;
    		 							    	doubleClick1[18]++;
    		 							    	changedRock[18]=1;
    		 							    	//convertRock[18]=1;
    		 							    }
    		 						  }
       		 					else if(((x1>=a[3]&&x1<a[4]))&&(y1>=b[2]&&y1<b[3]))
   		 						 {
    		 							  if(doubleClick1[19]==0)
   	 							      {    
    		 								 x1=a[3]+((a[4]-a[3])/2);
    		 								  y1=b[2]+((b[3]-b[2])/2);
    		 								  flag=1;
    		 								  doubleClick1[19]++;
    		 								  changedRock[19]=1;
    		 							       //convertRock[19]=1;
   	 							      }
   		 						  }
       		 					else if((x1>=a[4]&&x1<a[5])&&(y1>=b[2]&&y1<b[3]))
   		 						  {
   		 						    	if(doubleClick1[20]==0)
   		 							    {
   		 						    		x1=a[4]+((a[5]-a[4])/2);
   		 						    		  y1=b[2]+((b[3]-b[2])/2);
   		 						    		flag=1;
   		 						    		doubleClick1[20]++;
   		 						    		changedRock[20]=1;
   		 						    		//convertRock[20]=1;
   		 							    }
   		 						   }
       		 					else if((x1>=a[5]&&x1<a[6])&&(y1>=b[2]&&y1<b[3]))
   		 						   {
   		 						    	if(doubleClick1[21]==0)
   		 							    {
   		 						    		 x1=a[5]+((a[6]-a[5])/2);
   		 						    		  y1=b[2]+((b[3]-b[2])/2);
   		 						    		flag=1;
   		 						    		doubleClick1[21]++;
   		 						    		changedRock[21]=1;
   		 						    		//convertRock[21]=1;
   		 							    }
   		 						    }
       		 					else if((x1>=a[6]&&x1<a[7])&&(y1>=b[2]&&y1<b[3]))
   		 						    {
   		 						    	if(doubleClick1[22]==0)
   		 							    {
   		 						    		x1=a[6]+((a[7]-a[6])/2);
   		 						    		  y1=b[2]+((b[3]-b[2])/2);
   		 						    		flag=1;
   		 						    		doubleClick1[22]++;
   		 						    		changedRock[22]=1;
   		 						    		//convertRock[22]=1;
   		 							    }
   		 						    }
       		 			//END OF ROW2
       		 					 else if((x1>=a[1]&&x1<a[2])&&(y1>=b[3]&&y1<b[4]))
   		 						 {
   		 							  if(doubleClick1[25]==0)
   		 							  {
   		 							      x1=a[1]+((a[2]-a[1])/2);
   		 								  y1=b[3]+((b[4]-b[3])/2);
   		 								  flag=1;
   		 								  doubleClick1[25]++;
   		 								  changedRock[25]=1;
   		 								 // convertRock[25]=1;
   		 							  }
   		 						 }
       		 					else if((x1>=a[2]&&x1<a[3])&&(y1>=b[3]&&y1<b[4]))
    		 						   {
    		 							   if(doubleClick1[26]==0)
    		 							   {
    		 								    x1=a[2]+((a[3]-a[2])/2);
    		 								  y1=b[3]+((b[4]-b[3])/2);
    		 								   flag=1;
    		 								   doubleClick1[26]++;
    		 								   changedRock[26]=1;
    		 								  // convertRock[26]=1 ;
    		 							   }
    		 						  }
       		 					else if((x1>=a[3]&&x1<a[4])&&(y1>=b[3]&&y1<b[4]))
   		 						  {
    		 							  if(doubleClick1[27]==0)
    		 							  { 
    		 								 x1=a[3]+((a[4]-a[3])/2);
    		 								  y1=b[3]+((b[4]-b[3])/2);
    		 								  flag=1;
    		 								  doubleClick1[27]++;
    		 								  changedRock[27]=1;
    		 								//  convertRock[27]=1;
    		 							  }
   		 						  }
       		 					else if((x1>=a[4]&&x1<a[5])&&(y1>=b[3]&&y1<b[4]))
   		 						  {
   		 						    	if(doubleClick1[28]==0)
   		 							    {
   		 						    		x1=a[4]+((a[5]-a[4])/2);
   		 									  y1=b[3]+((b[4]-b[3])/2);
   		 						    		flag=1;
   		 						    		doubleClick1[28]++;
   		 						    		changedRock[28]=1;
   		 						    		//convertRock[28]=1;
   		 							    }
   		 						   }
       		 					else if((x1>=a[5]&&x1<a[6])&&(y1>=b[3]&&y1<b[4]))
   		 						   { 
   		 						    	if(doubleClick1[29]==0)
   		 							    {
   		 						    		 x1=a[5]+((a[6]-a[5])/2);
   		 									  y1=b[3]+((b[4]-b[3])/2);
   		 						    		flag=1;
   		 						    		doubleClick1[29]++;
   		 						    		changedRock[29]=1;
   		 						    	//	convertRock[29]=1;
   		 							    }
   		 						    }
       		 					else if((x1>=a[6]&&x1<a[7])&&(y1>=b[3]&&y1<b[4]))
   		 						    {
   		 						    	if(doubleClick1[30]==0)
   		 							    {
   		 						    		x1=a[6]+((a[7]-a[6])/2);
   		 									  y1=b[3]+((b[4]-b[3])/2);
   		 						    		flag=1;
   		 						    		doubleClick1[30]++;
   		 						    		changedRock[30]=1;
   		 						    		//convertRock[30]=1;
   		 							    }
   		 						    }
       		                     //end of ROW3
       		 					
    		 					else if((x1>=a[1]&&x1<a[2])&&(y1>=b[4]&&y1<b[5]))
   		 						   {
   		 							    if(doubleClick1[33]==0)
   		 							    {
   		 							       x1=a[1]+((a[2]-a[1])/2);
   		 								  y1=b[4]+((b[5]-b[4])/2);
   		 							    	flag=1;
   		 							    	doubleClick1[33]++;
   		 							    	changedRock[33]=1;
   		 							    	//convertRock[33]=1;
   		 							    }
   		 						   }
   		 						   
    		 					else if((x1>=a[2]&&x1<a[3])&&(y1>=b[4]&&y1<b[5]))
   		 						  {
   		 							    if(doubleClick1[34]==0)
   		 							    {
   		 							       x1=a[2]+((a[3]-a[2])/2);
   		 								  y1=b[4]+((b[5]-b[4])/2);
   		 							    	flag=1;
   		 							    	doubleClick1[34]++;
   		 							    	changedRock[34]=1;
   		 							    //	convertRock[34]=1;
   		 							    }
   		 						  }
    		 					else if((x1>=a[3]&&x1<a[4])&&(y1>=b[4]&&y1<b[5]))
   		 						 {
   		 							  if(doubleClick1[35]==0)
   	 							      {    
   		 								 x1=a[3]+((a[4]-a[3])/2);
   		 								  y1=b[4]+((b[5]-b[4])/2);
   		 								  flag=1;
   		 								  doubleClick1[35]++;
   		 								  changedRock[35]=1;
   		 							     //  convertRock[35]=1;
   	 							      }
   		 						  }
    		 					else if((x1>=a[4]&&x1<a[5])&&(y1>=b[4]&&y1<b[5]))
   		 						  {
   		 						    	if(doubleClick1[36]==0)
   		 							    {
   		 						    		x1=a[4]+((a[5]-a[4])/2);
   		 									  y1=b[4]+((b[5]-b[4])/2);
   		 						    		flag=1;
   		 						    		doubleClick1[36]++;
   		 						    		changedRock[36]=1;
   		 						    		//convertRock[36]=1;
   		 							    }
   		 						   }
    		 					else if((x1>=a[5]&&x1<a[6])&&(y1>=b[4]&&y1<b[5]))
   		 						   {
   		 						    	if(doubleClick1[37]==0)
   		 							    {
   		 						    		 x1=a[5]+((a[6]-a[5])/2);
   		 						    		y1=b[4]+((b[5]-b[4])/2);
   		 						    		flag=1;
   		 						    		doubleClick1[37]++;
   		 						    		changedRock[37]=1;
   		 						    		//convertRock[37]=1;
   		 							    }
   		 						    }
    		 					else if((x1>=a[6]&&x1<a[7])&&(y1>=b[4]&&y1<b[5]))
   		 						    {
   		 						    	if(doubleClick1[38]==0)
   		 							    {
   		 						    		x1=a[6]+((a[7]-a[6])/2);
   		 						    		y1=b[4]+((b[5]-b[4])/2);
   		 						    		flag=1;
   		 						    		doubleClick1[38]++;
   		 						    		changedRock[38]=1;
   		 						    		//convertRock[38]=1;
   		 							    }
   		 						    }
    		 						    
   		 			//END OF 4TH row
   		 						    
    		 					else if((x1>=a[1]&&x1<a[2])&&(y1>=b[5]&&y1<b[6]))
   		 						   {
   		 							   if(doubleClick1[41]==0)
   		 							   {
   		 							      x1=a[1]+((a[2]-a[1])/2);
   		 								  y1=b[5]+((b[6]-b[5])/2);
   		 								   flag=1;
   		 								   doubleClick1[41]++;
   		 								   changedRock[41]=1;
   		 								   //convertRock[41]=1;
   		 							   }
   		 						   }
    		 					else if((x1>=a[2]&&x1<a[3])&&(y1>=b[5]&&y1<b[6]))
   		 						   {
   		 							   if(doubleClick1[42]==0)
   		 							   {
   		 								    x1=a[2]+((a[3]-a[2])/2);
   		 									  y1=b[5]+((b[6]-b[5])/2);
   		 								   flag=1;
   		 								   doubleClick1[42]++;
   		 								   changedRock[42]=1;
   		 								//   convertRock[42]=1 ;
   		 							   }
   		 						  }
    		 					else if( (x1>=a[3]&&x1<a[4])&&(y1>=b[5]&&y1<b[6]))
   		 						  {
   		 							  if(doubleClick1[43]==0)
   		 							  { 
   		 								 x1=a[3]+((a[4]-a[3])/2);
   		 								  y1=b[5]+((b[6]-b[5])/2);
   		 								  flag=1;
   		 								  doubleClick1[43]++;
   		 								  changedRock[43]=1;
   		 								 // convertRock[43]=1;
   		 							  }
   		 						  }
    		 					else if((x1>=a[4]&&x1<a[5])&&(y1>=b[5]&&y1<b[6]))
   		 						  {
   		 						    	if(doubleClick1[44]==0)
   		 							    {
   		 						    		x1=a[4]+((a[5]-a[4])/2);
   		 						    		  y1=b[5]+((b[6]-b[5])/2);
   		 						    		flag=1;
   		 						    		doubleClick1[44]++;
   		 						    		changedRock[44]=1;
   		 						    		//convertRock[44]=1;
   		 							    }
   		 						   }
    		 					else if((x1>=a[5]&&x1<a[6])&&(y1>=b[5]&&y1<b[6]))
   		 						   { 
   		 						    	if(doubleClick1[45]==0)
   		 							    {
   		 						    		 x1=a[5]+((a[6]-a[5])/2);
   		 						    		  y1=b[5]+((b[6]-b[5])/2);
   		 						    		flag=1;
   		 						    		doubleClick1[45]++;
   		 						    		changedRock[45]=1;
   		 						    		//convertRock[45]=1;
   		 							    }
   		 						    }
    		 					else if((x1>=a[6]&&x1<a[7])&&(y1>=b[5]&&y1<b[6]))
   		 						    {
   		 						    	if(doubleClick1[46]==0)
   		 							    {
   		 						    		x1=a[6]+((a[7]-a[6])/2);
   		 						    		  y1=b[5]+((b[6]-b[5])/2);
   		 						    		flag=1;
   		 						    		doubleClick1[46]++;
   		 						    		changedRock[46]=1;
   		 						    		//convertRock[46]=1;
   		 							    }
   		 						    }
    		 					
       		                     
       		                     
       		                     
       		                     //BEGIN OF 6TH ROW
       		 					 else if( (x1>=a[1]&&x1<a[2])&&(y1>=b[6]&&y1<b[7]))
   		 						 {
   		 							  if(doubleClick1[49]==0)
   		 							  {
   		 							      x1=a[1]+((a[2]-a[1])/2);
   		 							     y1=b[6]+((b[7]-b[6])/2);
   		 								  flag=1;
   		 								  doubleClick1[49]++;
   		 								  changedRock[49]=1;
   		 								  //convertRock[49]=1;
   		 							  }
   		 						 }else if((x1>=a[2]&&x1<a[3])&&(y1>=b[6]&&y1<b[7]))
    		 						  {
    		 							  if(doubleClick1[50]==0)
    		 							  {
    		 							    x1=a[2]+((a[3]-a[2])/2);
    		 							     y1=b[6]+((b[7]-b[6])/2);
    		 								  flag=1;
    		 								  doubleClick1[50]++;
    		 								  changedRock[50]=1;
    		 								//convertRock[50]=1;
    		 							  }
    		 						  }
       		 					else if( (x1>=a[3]&&x1<a[4])&&(y1>=b[6]&&y1<b[7]))
   		 						  {
    		 							  if(doubleClick1[51]==0)
    		 							  {    
    		 								 x1=a[3]+((a[4]-a[3])/2);
    		 							     y1=b[6]+((b[7]-b[6])/2);
    		 								  flag=1;
    		 								  doubleClick1[51]++;
    		 								  changedRock[51]=1;
    		 								 // convertRock[51]=1;
    		 							  }
   		 						  }
       		 					else if((x1>=a[4]&&x1<a[5])&&(y1>=b[6]&&y1<b[7]))
   		 						  {
   		 						       if(doubleClick1[52]==0)
   		 							   {
   		 						    	  x1=a[4]+((a[5]-a[4])/2);
   		 							     y1=b[6]+((b[7]-b[6])/2);
   		 						    	   flag=1;
   		 						    	   doubleClick1[52]++;
   		 						    	   changedRock[52]=1;
   		 						    	 // convertRock[52]=1;
   		 							   }
   		 						  }
       		 					else if((x1>=a[5]&&x1<a[6])&&(y1>=b[6]&&y1<b[7]))
   		 						  {
   		 						       if(doubleClick1[53]==0)
   		 							   {
   		 						    	  x1=a[5]+((a[6]-a[5])/2);
   		 							     y1=b[6]+((b[7]-b[6])/2);
   		 							       flag=1;
   		 							       doubleClick1[53]++;
   		 							       changedRock[53]=1;
   		 							      //convertRock[53]=1;
   		 							   }
   		 						  }
       		 					else if((x1>=a[6]&&x1<a[7])&&(y1>=b[6]&&y1<b[7]))
   		 						  {
   		 						       if(doubleClick1[54]==0)
   		 							   {
   		 						    	  x1=a[6]+((a[7]-a[6])/2);
   		 							     y1=b[6]+((b[7]-b[6])/2);
   		 						    	   flag=1;
   		 						    	   doubleClick1[54]++;
   		 						    	   changedRock[54]=1;
   		 						    	 // convertRock[54]=1;
   		 							   }
   		 						   }
    		 			//END OF 6TH ROW
    		 						else
    		 						{
    		 							flag=0;
    		 						}
    		 						 //to check the direction of fly of frog
		 						    if(flag==1)
		 						    {
		 						    	Values.score13+=5;	front=0;
		 						    	    back=0;
		 						    	    left=0;
		 						    	    right=0;
		 						    	    anim=0;
		 						    	    s=0;
		 						    	    s1=0;
		 						    	    s2=0;
		 						    	    s3=0;
		 						    	    if(y<y1&&x1<b[5])    //if clicked position is below the current location of frog 
				 						        front=1;
				 						    else if(y>y1)    //if clicked position is above the current location of the frog
				 						    	back=1;				 						    	
    				 					    else if(y==y1&&x<x1)      //if on the same line and left of the frog
 				 						    	right=1;
				 						     else         //if on same line and right of the frog
				 						        left=1;
				 						    
		 						    	     p2=x; q2=y;
		 						    	    float g=y1-q2, h=x1-p2;
			 							    slope=g/h;
		 						 	        x=x1;  y=y1;
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
		width1=this.getWidth();
        height1=this.getHeight();
        a[0]=(0*(width1/8));
        
        a[1]=(1*(width1/8));
        a[2]=(2*(width1/8));
        a[3]=(3*(width1/8));
        a[4]=(4*(width1/8));
        a[5]=(5*(width1/8));
        a[6]=(6*(width1/8));
        a[7]=(7*(width1/8));
        b[0]=(2*(height1/12));
        b[1]=(3*(height1/12));
        b[2]=(4*(height1/12));
        b[3]=(5*(height1/12));
        b[4]=(6*(height1/12));
        b[5]=(7*(height1/12));
        b[6]=(8*(height1/12));
        b[7]=(9*(height1/12));
        int [][]d={{a[1],b[1]},{a[2],b[1]},{a[3],b[1]},{a[4],b[1]},{a[5],b[1]},{a[6],b[1]},
       		   {a[1],b[2]},{a[2],b[2]},{a[3],b[2]},{a[4],b[2]},{a[5],b[2]},{a[6],b[2]},
       		   {a[1],b[3]},{a[2],b[3]},{a[3],b[3]},{a[4],b[3]},{a[5],b[3]},{a[6],b[3]},
       		   {a[1],b[4]},{a[2],b[4]},{a[3],b[4]},{a[4],b[4]},{a[5],b[4]},{a[6],b[4]},
       		   {a[1],b[5]},{a[2],b[5]},{a[3],b[5]},{a[4],b[5]},{a[5],b[5]},{a[6],b[5]},
       		  {a[1],b[6]},{a[2],b[6]},{a[3],b[6]},{a[4],b[6]},{a[5],b[6]},{a[6],b[6]}};
          int ci=width1*10000;
          int di=height1*10000;
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
		Bitmap bubble2 = BitmapFactory.decodeResource(this.getResources(), R.drawable.bubble2);
		Bitmap bubble3 = BitmapFactory.decodeResource(this.getResources(), R.drawable.bubble3);
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
	    Bitmap danger = BitmapFactory.decodeResource(this.getResources(), R.drawable.redsquare);
        Bitmap frog = BitmapFactory.decodeResource(this.getResources(), R.drawable.front_1);
			super.onDraw(canvas);
			onD++;
			
			if(once){
				initialize();
				once=false;
			}
			if(Values.click13==1)
			{
				flag=0;
				front=0;
				back=0;
				left=0;
				right=0;
				count=0;
				//background_image();
				canvas.drawBitmap(frog,230,150, null);
				for(int y=9;y<55;y++)
				{
					
			    		doubleClick1[y]=0;
			    		changedRock[y]=0;
				}
			for(int i=0;i<36;i++)
        	{
        		
        		for(int j=0;j<2;j++)
        		{
        			
        			if(i!=7&&i!=10&&i!=21&&i!=32&&i!=33)
        			{	
        				for(int k=1;k<7;k++)
    					{
    						for(int l=1;l<7;l++)
    						{
    						
                		a[l]=ci;//(ci+=ci);
                    	b[k]=di;//(ci+=ci);
        			
    						}
    					}
                
                	
                    canvas.drawBitmap(stone1,d[i][j],d[i][++j], null);
        			
        			}
                	else
                	{
                		
                		
                		for(int k=1;k<7;k++)
    					{
    						for(int l=1;l<7;l++)
    						{
    						
                		a[l]=ci;//(ci+=ci);
                    	b[k]=di;//(ci+=ci);
        			
    						}
    					}
                		 canvas.drawBitmap(danger,d[i][j],d[i][++j], null);
        		}
        			}
        	}
			}
			
			//to draw all the rocks on the river
			for(int k=1;k<7;k++)
			{
				for(int l=1;l<7;l++)
				{
				      if(k==1&&l==1&&changedRock[9]>=1&&cong!=1)
				          	canvas.drawBitmap(stone1, a[l], b[k],null);
				      
				     else if(k==1&&l==2&&changedRock[10]>=1&&cong!=1)
				    	 	canvas.drawBitmap(stone1, a[l], b[k],null);
		             else if(k==1&&l==3&&changedRock[11]>=1&&cong!=1)
		            	 	canvas.drawBitmap(stone1, a[l], b[k],null);
				     else if(k==1&&l==4&&changedRock[12]>=1&&cong!=1)
				    	 	canvas.drawBitmap(stone1, a[l], b[k],null);
		             else if(k==1&&l==5&&changedRock[13]>=1&&cong!=1)
		            	  	canvas.drawBitmap(stone1, a[l], b[k],null);
			         else if(k==1&&l==6&&changedRock[14]>=1&&cong!=1)
			         	  	canvas.drawBitmap(stone1, a[l], b[k],null);
	                 else if(k==2&&l==1&&changedRock[17]>=1&&cong!=1)
			         		canvas.drawBitmap(stone1, a[l], b[k],null);
                     else if(k==2&&l==2&&changedRock[18]>=1&&cong!=1)
                    	 	canvas.drawBitmap(stone1, a[l], b[k],null);
                     else if(k==2&&l==3&&changedRock[19]>=1&&cong!=1)
			         		canvas.drawBitmap(stone1, a[l], b[k],null);
			         else if(k==2&&l==4&&changedRock[20]>=1&&cong!=1)
			        	 	canvas.drawBitmap(stone1, a[l], b[k],null);
		             else if(k==2&&l==5&&changedRock[21]>=1&&cong!=1)
		            	 	canvas.drawBitmap(stone1, a[l], b[k],null);
			         else if(k==2&&l==6&&changedRock[22]>=1&&cong!=1)
			        	 	canvas.drawBitmap(stone1, a[l], b[k],null);
					 else if(k==3&&l==1&&changedRock[25]>=1&&cong!=1)
						 	canvas.drawBitmap(stone1, a[l], b[k],null);
					 else if(k==3&&l==2&&changedRock[26]>=1&&cong!=1)
						 	canvas.drawBitmap(stone1, a[l], b[k],null);
					else if(k==3&&l==3&&changedRock[27]>=1&&cong!=1)
							canvas.drawBitmap(stone1, a[l], b[k],null);
					else if(k==3&&l==4&&changedRock[28]>=1&&cong!=1)
							canvas.drawBitmap(stone1, a[l], b[k],null);
					else if(k==3&&l==5&&changedRock[29]>=1&&cong!=1)
							canvas.drawBitmap(stone1, a[l], b[k],null);
					else if(k==3&&l==6&&changedRock[30]>=1&&cong!=1)
							canvas.drawBitmap(stone1, a[l], b[k],null);
				    else if(k==4&&l==1&&changedRock[33]>=1&&cong!=1)
				     		canvas.drawBitmap(stone1, a[l], b[k],null);
					else if(k==4&&l==2&&changedRock[34]>=1&&cong!=1)
							canvas.drawBitmap(stone1, a[l], b[k],null);
					else if(k==4&&l==3&&changedRock[35]>=1&&cong!=1)
							canvas.drawBitmap(stone1, a[l], b[k],null);
			    	else if(k==4&&l==4&&changedRock[36]>=1&&cong!=1)
			    			canvas.drawBitmap(stone1, a[l], b[k],null);
					else if(k==4&&l==5&&changedRock[37]>=1&&cong!=1)
							canvas.drawBitmap(stone1, a[l], b[k],null);
	              	else if(k==4&&l==6&&changedRock[38]>=1&&cong!=1)
	              			canvas.drawBitmap(stone1, a[l], b[k],null);
					else if(k==5&&l==1&&changedRock[41]>=1&&cong!=1)
							canvas.drawBitmap(stone1, a[l], b[k],null);
					else if(k==5&&l==2&&changedRock[42]>=1&&cong!=1)
							canvas.drawBitmap(stone1, a[l], b[k],null);
						else if(k==5&&l==3&&changedRock[43]>=1&&cong!=1)
							canvas.drawBitmap(stone1, a[l], b[k],null);
					else if(k==5&&l==4&&changedRock[44]>=1&&cong!=1)
							canvas.drawBitmap(stone1, a[l], b[k],null);
					else if(k==5&&l==5&&changedRock[45]>=1&&cong!=1)
							canvas.drawBitmap(stone1, a[l], b[k],null);
					else if(k==5&&l==6&&changedRock[46]>=1&&cong!=1)
							canvas.drawBitmap(stone1, a[l], b[k],null);
					else if(k==6&&l==1&&changedRock[49]>=1&&cong!=1)
							canvas.drawBitmap(stone1, a[l], b[k],null);
					else if(k==6&&l==2&&changedRock[50]>=1&&cong!=1)
							canvas.drawBitmap(stone1, a[l], b[k],null);
					else if(k==6&&l==3&&changedRock[51]>=1&&cong!=1)
							canvas.drawBitmap(stone1, a[l], b[k],null);
					else if(k==6&&l==4&&changedRock[52]>=1&&cong!=1)
							canvas.drawBitmap(stone1, a[l], b[k],null);
					else if(k==6&&l==5&&changedRock[53]>=1&&cong!=1)
							canvas.drawBitmap(stone1, a[l], b[k],null);
					else if(k==6&&l==6&&changedRock[54]>=1&&cong!=1)
							canvas.drawBitmap(stone1, a[l], b[k],null);
					else
							{
						      if(blue_square==1)
						      { 
						    	  canvas.drawBitmap(blue1, a[l], b[k], null);
						       }
						     }
				  	//;
					
				}
			}
			//to draw the frog at the top when activity starts
			 if(count==1)
			 {
				 canvas.drawBitmap(front_frog, x-(front_frog.getWidth()/2), y-(front_frog.getHeight()/2), null);
			 }
			 if(cong==1)
			 {
				for(int k=1;k<7;k++)
				{
					for(int l=1;l<7;l++)
					{
				
						
						x=1000;y=1000;
						//stopTimer=true;
						blue_square=0;
						scoreView_rlp.topMargin=1500; 
						scoreView_rlp.leftMargin=3000;
						timeView_rlp.topMargin=6000; 
						timeView_rlp.leftMargin=2100;
						
					    solveImv_rlp.width=0; 
					    solveImv_rlp.height=0;
					    hintImv_rlp.width=0; 
					    hintImv_rlp.height= 0;
	
						stopTimer=true;
						changedRock[9]=0;changedRock[10]=0;changedRock[11]=0;
						changedRock[12]=0;changedRock[13]=0;changedRock[14]=0;
						
						changedRock[17]=0;changedRock[18]=0;changedRock[19]=0;
						changedRock[20]=0;changedRock[21]=0;changedRock[22]=0;
						changedRock[25]=0;changedRock[26]=0;changedRock[27]=0;	 
						changedRock[28]=0;changedRock[29]=0;changedRock[30]=0;
						changedRock[33]=0;changedRock[34]=0;changedRock[35]=0;
			
						changedRock[36]=0;changedRock[37]=0;changedRock[38]=0;
						changedRock[41]=0;changedRock[42]=0;changedRock[43]=0;	
	
						changedRock[44]=0;changedRock[45]=0;changedRock[46]=0;	
						changedRock[49]=0;changedRock[50]=0;changedRock[51]=0;	
						changedRock[52]=0;changedRock[53]=0;changedRock[54]=0;
								
					     this.setBackgroundResource(R.drawable.congratulation_screen);
					}
				}
				

			 }
			 /*if(Values.score13>=155)//23*5(2 swapms)
			 {
				 show_congrat();
			 }*/
			//checking the condition of ontouch event
			 if(front==1)
			 {
				   
				  xValue = (x1+(yValue-y1)/slope);
		          if(yValue<y1)		  
				  {
		        	  	if(x1<(p2-25))
		        		  		canvas.drawBitmap(front_left_now, xValue-(front_left_now.getWidth()/2), yValue-(front_left_now.getHeight()/2), null);
		        	  	else if(x1>p2+25)
		        	  			canvas.drawBitmap(front_right_now, xValue-(front_right_now.getWidth()/2), yValue-(front_right_now.getHeight()/2), null);
		        	  	else
		        	  			canvas.drawBitmap(anim_front_frog,(xValue-(anim_front_frog.getWidth()/2)),(yValue-(anim_front_frog.getHeight()/2)), null);
		        	  	yValue+=20;
				  }
		          else
				  {
		        	  	if(sub1==0)
		        	  	{
		        	  		canvas.drawBitmap(front_frog, x-(front_frog.getWidth()/2), y-(front_frog.getHeight()/2), null);
		        	  		if(Values.score13>=155||cong==1)
								 scoreView.setText(""+155);
							 else
							     scoreView.setText(""+Values.score13);
		        	  	}
		        	  	if(flag==1)
		        	  	{
	        	  			if(     (x1>a[1]&&x1<a[2]&&y1>b[1]&&y1<b[2])||( x1>a[2]&&x1<a[3] && y1>b[1]&&y1<b[2])||( x1>a[3]&&x1<a[4] && y1>b[1]&&y1<b[2])||
	        	  					(x1>a[1]&&x1<a[2]&&y1>b[2]&&y1<b[3])||(x1>a[3]&&x1<a[4]&&y1>b[2]&&y1<b[3])||
	        	  					(x1>a[1]&&x1<a[2]&&y1>b[3]&&y1<b[4])||(x1>a[2]&&x1<a[3]&&y1>b[3]&&y1<b[4])||
	        	  					
	        	  					 (x1>a[4]&&x1<a[5]&&y1>b[1]&&y1<b[2])||( x1>a[5]&&x1<a[6] && y1>b[1]&&y1<b[2])||( x1>a[6]&&x1<a[7] && y1>b[1]&&y1<b[2])||
	        	  					(x1>a[4]&&x1<a[5]&&y1>b[2]&&y1<b[3])||(x1>a[6]&&x1<a[7]&&y1>b[2]&&y1<b[3])||
	        	  			      	(x1>a[6]&&x1<a[7]&&y1>b[3]&&y1<b[4])
	        	  			      	
	        	  			         || (x1>a[2]&&x1<a[3]&&y1>b[5]&&y1<b[6])|| (x1>a[2]&&x1<a[3]&&y1>b[6]&&y1<b[7])|| (x1>a[5]&&x1<a[6]&&y1>b[6]&&y1<b[7])
	        	  			       ||(x1>a[5]&&x1<a[6]&&y1>b[4]&&y1<b[5])||(x1>a[3]&&x1<a[4]&&y1>b[4]&&y1<b[5])
	        	  					
	        	  					)
								 
		        	  			          canvas.drawBitmap(bubble1,( x-(front_frog.getWidth()/2)+40),( y-(front_frog.getHeight()/2)-50), null);
		        	  			
		        	  			else if( (x1>a[3]&&x1<a[4]&&y1>b[3]&&y1<b[4])||	(x1>a[4]&&x1<a[5]&&y1>b[3]&&y1<b[4])||(x1>a[5]&&x1<a[6]&&y1>b[3]&&y1<b[4])||(x1>b[5]&&x1<b[6]&&y1>b[2]&&y1<b[3]) )
		        	  				 canvas.drawBitmap(bubble2,( x-(front_frog.getWidth()/2)+40),( y-(front_frog.getHeight()/2)-50), null); 
		        	  		
		        	  			else if( (x1>a[3]&&x1<a[4]&&y1>b[5]&&y1<b[6])||(x1>a[4]&&x1<a[5]&&y1>b[5]&&y1<b[6]) )
		        	  				 canvas.drawBitmap(bubble3,( x-(front_frog.getWidth()/2)+40),( y-(front_frog.getHeight()/2)-50), null); 
		        	  			
				              else
				              {

						    	   if(x1>a[1]&&x1<a[2]  && y1>b[2]&&y1<b[6])
			            	  			show_First_Column(x1,y1);
						    	   
			            	  		if(x1>a[6]&&x1<a[7]&&y1>b[2]&&y1<b[6])
			            	  			show_Last_Column(x1,y1);
			            	  		
			            	  		else if(x1>a[1]&&x1<a[2]&&y1>b[6]&&y1<b[7])
			            	  			show_Left_Down_Corner(x1,y1);
			            	  		
			            	  		else if(x1>a[6]&&x1<a[7]  &&y1>b[6]&&y1<b[7])
			            	  			show_Bottom_Right_Corner(x1,y1);
			            
			            	  		else if(x1>a[2]&&x1<a[6]&&y1>b[2]&&y1<b[6])
			            	  			show_Center_Rock(x1,y1);
				              }  
		        	  	}			   
		        	  	 if( ((x1>a[2]&&x1<a[3])&&(y1>b[2]&&y1<b[3]))||((x1>a[5]&&x1<a[6])&&(y1>b[2]&&y1<b[3]))
						         ||((x1>a[3]&&x1<a[4])&&(y1>b[6]&&y1<b[7]))||((x1>a[4]&&x1<a[5])&&(y1>b[6]&&y1<b[7])) ||((x1>a[4]&&x1<a[5])&&(y1>b[4]&&y1<b[5])))
						      {
									swamp_areas(x,y,canvas);
				    		  }
		        	  	 if(Values.score13>=155)//23*5(2 swapms)
						 {
				     		cong=1;		Values.level13cleared=1;	     		disappear();
						 }
		    	 }
			 }
			 if(back==1)
			 {
				  xValue = (x1+(yValue-y1)/slope);
		          if(yValue>y1)		  
				  {
		        	  if(x1<(p2-25))
		                  canvas.drawBitmap(back_left_now, xValue-(back_left_now.getWidth()/2), yValue-(back_left_now.getHeight()/2), null);
		        	  else if(x1>(p2+50))
		                   canvas.drawBitmap(back_right_now, xValue-(back_right_now.getWidth()/2), yValue-(back_right_now.getHeight()/2), null);
		              else
		                   canvas.drawBitmap(anim_back_frog,(xValue-(anim_back_frog.getWidth()/2)),(yValue-(anim_back_frog.getHeight()/2)), null);
		        	 yValue-=20;
				  }
				 else
				 {
					 if(sub1==0)
					 {	 
						 	 canvas.drawBitmap(back_frog, x-(back_frog.getWidth()/2), y-(back_frog.getHeight()/2), null);
						 	if(Values.score13>=155||cong==1)
								 scoreView.setText(""+155);
							 else
							     scoreView.setText(""+Values.score13);
					 }
				     if(flag==1)
					  {


	        	  			if(     (x1>a[1]&&x1<a[2]&&y1>b[1]&&y1<b[2])||( x1>a[2]&&x1<a[3] && y1>b[1]&&y1<b[2])||( x1>a[3]&&x1<a[4] && y1>b[1]&&y1<b[2])||
	        	  					(x1>a[1]&&x1<a[2]&&y1>b[2]&&y1<b[3])||(x1>a[3]&&x1<a[4]&&y1>b[2]&&y1<b[3])||
	        	  					(x1>a[1]&&x1<a[2]&&y1>b[3]&&y1<b[4])||(x1>a[2]&&x1<a[3]&&y1>b[3]&&y1<b[4])||
	        	  					
	        	  					 (x1>a[4]&&x1<a[5]&&y1>b[1]&&y1<b[2])||( x1>a[5]&&x1<a[6] && y1>b[1]&&y1<b[2])||( x1>a[6]&&x1<a[7] && y1>b[1]&&y1<b[2])||
	        	  					(x1>a[4]&&x1<a[5]&&y1>b[2]&&y1<b[3])||(x1>a[6]&&x1<a[7]&&y1>b[2]&&y1<b[3])||
	        	  			      	(x1>a[6]&&x1<a[7]&&y1>b[3]&&y1<b[4])
	        	  			      	
	        	  			         || (x1>a[2]&&x1<a[3]&&y1>b[5]&&y1<b[6])|| (x1>a[2]&&x1<a[3]&&y1>b[6]&&y1<b[7])|| (x1>a[5]&&x1<a[6]&&y1>b[6]&&y1<b[7])
	        	  			       ||(x1>a[5]&&x1<a[6]&&y1>b[4]&&y1<b[5])||(x1>a[3]&&x1<a[4]&&y1>b[4]&&y1<b[5])
	        	  					
	        	  					)
							 
	        	  			          canvas.drawBitmap(bubble1,( x-(front_frog.getWidth()/2)+40),( y-(front_frog.getHeight()/2)-50), null);
	        	  			
	        	  			else if( (x1>a[3]&&x1<a[4]&&y1>b[3]&&y1<b[4])||	(x1>a[4]&&x1<a[5]&&y1>b[3]&&y1<b[4])||(x1>a[5]&&x1<a[6]&&y1>b[3]&&y1<b[4])||(x1>b[5]&&x1<b[6]&&y1>b[2]&&y1<b[3]) )
	        	  				 canvas.drawBitmap(bubble2,( x-(front_frog.getWidth()/2)+40),( y-(front_frog.getHeight()/2)-50), null); 
	        	  		
	        	  			else if( (x1>a[3]&&x1<a[4]&&y1>b[5]&&y1<b[6])||(x1>a[4]&&x1<a[5]&&y1>b[5]&&y1<b[6]) )
	        	  				 canvas.drawBitmap(bubble3,( x-(front_frog.getWidth()/2)+40),( y-(front_frog.getHeight()/2)-50), null); 
						       else
					              {

						    	   if(x1>a[1]&&x1<a[2]  && y1>b[2]&&y1<b[6])
			            	  			show_First_Column(x1,y1);
						    	   
			            	  		if(x1>a[6]&&x1<a[7]&&y1>b[2]&&y1<b[6])
			            	  			show_Last_Column(x1,y1);
			            	  		
			            	  		else if(x1>a[1]&&x1<a[2]&&y1>b[6]&&y1<b[7])
			            	  			show_Left_Down_Corner(x1,y1);
			            	  		
			            	  		else if(x1>a[6]&&x1<a[7]  &&y1>b[6]&&y1<b[7])
			            	  			show_Bottom_Right_Corner(x1,y1);
			            
			            	  		else if(x1>a[2]&&x1<a[6]&&y1>b[2]&&y1<b[6])
			            	  			show_Center_Rock(x1,y1);
					              }  
					}			   
				     if( ((x1>a[2]&&x1<a[3])&&(y1>b[2]&&y1<b[3]))||((x1>a[5]&&x1<a[6])&&(y1>b[2]&&y1<b[3]))
					         ||((x1>a[3]&&x1<a[4])&&(y1>b[6]&&y1<b[7]))||((x1>a[4]&&x1<a[5])&&(y1>b[6]&&y1<b[7])) ||((x1>a[4]&&x1<a[5])&&(y1>b[4]&&y1<b[5])))
					      {
								swamp_areas(x,y,canvas);
			    		  }
				     if(Values.score13>=155)//23*5(2 swapms)
					 {
			     		cong=1;		Values.level13cleared=1;	     		disappear();
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
				           if(Values.score13>=155||cong==1)
								 scoreView.setText(""+155);
							 else
							     scoreView.setText(""+Values.score13);
				       }
				     
		
				       if(flag==1)
						  {


	        	  			if(     (x1>a[1]&&x1<a[2]&&y1>b[1]&&y1<b[2])||( x1>a[2]&&x1<a[3] && y1>b[1]&&y1<b[2])||( x1>a[3]&&x1<a[4] && y1>b[1]&&y1<b[2])||
	        	  					(x1>a[1]&&x1<a[2]&&y1>b[2]&&y1<b[3])||(x1>a[3]&&x1<a[4]&&y1>b[2]&&y1<b[3])||
	        	  					(x1>a[1]&&x1<a[2]&&y1>b[3]&&y1<b[4])||(x1>a[2]&&x1<a[3]&&y1>b[3]&&y1<b[4])||
	        	  					
	        	  					 (x1>a[4]&&x1<a[5]&&y1>b[1]&&y1<b[2])||( x1>a[5]&&x1<a[6] && y1>b[1]&&y1<b[2])||( x1>a[6]&&x1<a[7] && y1>b[1]&&y1<b[2])||
	        	  					(x1>a[4]&&x1<a[5]&&y1>b[2]&&y1<b[3])||(x1>a[6]&&x1<a[7]&&y1>b[2]&&y1<b[3])||
	        	  			      	(x1>a[6]&&x1<a[7]&&y1>b[3]&&y1<b[4])
	        	  			      	
	        	  			         || (x1>a[2]&&x1<a[3]&&y1>b[5]&&y1<b[6])|| (x1>a[2]&&x1<a[3]&&y1>b[6]&&y1<b[7])|| (x1>a[5]&&x1<a[6]&&y1>b[6]&&y1<b[7])
	        	  			       ||(x1>a[5]&&x1<a[6]&&y1>b[4]&&y1<b[5])||(x1>a[3]&&x1<a[4]&&y1>b[4]&&y1<b[5])
	        	  					
	        	  					)
							 
	        	  			          canvas.drawBitmap(bubble1,( x-(front_frog.getWidth()/2)+40),( y-(front_frog.getHeight()/2)-50), null);
	        	  			
	        	  			else if( (x1>a[3]&&x1<a[4]&&y1>b[3]&&y1<b[4])||	(x1>a[4]&&x1<a[5]&&y1>b[3]&&y1<b[4])||(x1>a[5]&&x1<a[6]&&y1>b[3]&&y1<b[4])||(x1>b[5]&&x1<b[6]&&y1>b[2]&&y1<b[3]) )
	        	  				 canvas.drawBitmap(bubble2,( x-(front_frog.getWidth()/2)+40),( y-(front_frog.getHeight()/2)-50), null); 
	        	  		
	        	  			else if( (x1>a[3]&&x1<a[4]&&y1>b[5]&&y1<b[6])||(x1>a[4]&&x1<a[5]&&y1>b[5]&&y1<b[6]) )
	        	  				 canvas.drawBitmap(bubble3,( x-(front_frog.getWidth()/2)+40),( y-(front_frog.getHeight()/2)-50), null); 
						       else
					              {
						    	   
						    	   if(x1>a[1]&&x1<a[2]  && y1>b[2]&&y1<b[6])
			            	  			show_First_Column(x1,y1);
						    	   
			            	  		if(x1>a[6]&&x1<a[7]&&y1>b[2]&&y1<b[6])
			            	  			show_Last_Column(x1,y1);
			            	  		
			            	  		else if(x1>a[1]&&x1<a[2]&&y1>b[6]&&y1<b[7])
			            	  			show_Left_Down_Corner(x1,y1);
			            	  		
			            	  		else if(x1>a[6]&&x1<a[7]  &&y1>b[6]&&y1<b[7])
			            	  			show_Bottom_Right_Corner(x1,y1);
			            
			            	  		else if(x1>a[2]&&x1<a[6]&&y1>b[2]&&y1<b[6])
			            	  			show_Center_Rock(x1,y1);
					              }   
						}			   
				       if( ((x1>a[2]&&x1<a[3])&&(y1>b[2]&&y1<b[3]))||((x1>a[5]&&x1<a[6])&&(y1>b[2]&&y1<b[3]))
						         ||((x1>a[3]&&x1<a[4])&&(y1>b[6]&&y1<b[7]))||((x1>a[4]&&x1<a[5])&&(y1>b[6]&&y1<b[7])) ||((x1>a[4]&&x1<a[5])&&(y1>b[4]&&y1<b[5])))
						      {
									swamp_areas(x,y,canvas);
				    		  }
				       if(Values.score13>=155)//23*5(2 swapms)
						 {
				     		cong=1;		Values.level13cleared=1;	     		disappear();
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
						   if(Values.score13>=155||cong==1)
								 scoreView.setText(""+155);
							 else
							     scoreView.setText(""+Values.score13);
					}
				
					  if(flag==1)
					  {


	        	  			if(     (x1>a[1]&&x1<a[2]&&y1>b[1]&&y1<b[2])||( x1>a[2]&&x1<a[3] && y1>b[1]&&y1<b[2])||( x1>a[3]&&x1<a[4] && y1>b[1]&&y1<b[2])||
	        	  					(x1>a[1]&&x1<a[2]&&y1>b[2]&&y1<b[3])||(x1>a[3]&&x1<a[4]&&y1>b[2]&&y1<b[3])||
	        	  					(x1>a[1]&&x1<a[2]&&y1>b[3]&&y1<b[4])||(x1>a[2]&&x1<a[3]&&y1>b[3]&&y1<b[4])||
	        	  					
	        	  					 (x1>a[4]&&x1<a[5]&&y1>b[1]&&y1<b[2])||( x1>a[5]&&x1<a[6] && y1>b[1]&&y1<b[2])||( x1>a[6]&&x1<a[7] && y1>b[1]&&y1<b[2])||
	        	  					(x1>a[4]&&x1<a[5]&&y1>b[2]&&y1<b[3])||(x1>a[6]&&x1<a[7]&&y1>b[2]&&y1<b[3])||
	        	  			      	(x1>a[6]&&x1<a[7]&&y1>b[3]&&y1<b[4])
	        	  			      	
	        	  			         || (x1>a[2]&&x1<a[3]&&y1>b[5]&&y1<b[6])|| (x1>a[2]&&x1<a[3]&&y1>b[6]&&y1<b[7])|| (x1>a[5]&&x1<a[6]&&y1>b[6]&&y1<b[7])
	        	  			       ||(x1>a[5]&&x1<a[6]&&y1>b[4]&&y1<b[5])||(x1>a[3]&&x1<a[4]&&y1>b[4]&&y1<b[5])
	        	  					
	        	  					)
	        	  			          canvas.drawBitmap(bubble1,( x-(front_frog.getWidth()/2)+40),( y-(front_frog.getHeight()/2)-50), null);
	        	  			
	        	  			else if( (x1>a[3]&&x1<a[4]&&y1>b[3]&&y1<b[4])||	(x1>a[4]&&x1<a[5]&&y1>b[3]&&y1<b[4])||(x1>a[5]&&x1<a[6]&&y1>b[3]&&y1<b[4])||(x1>b[5]&&x1<b[6]&&y1>b[2]&&y1<b[3]) )
	        	  				 canvas.drawBitmap(bubble2,( x-(front_frog.getWidth()/2)+40),( y-(front_frog.getHeight()/2)-50), null); 
	        	  		
	        	  			else if( (x1>a[3]&&x1<a[4]&&y1>b[5]&&y1<b[6])||(x1>a[4]&&x1<a[5]&&y1>b[5]&&y1<b[6]) )
	        	  				 canvas.drawBitmap(bubble3,( x-(front_frog.getWidth()/2)+40),( y-(front_frog.getHeight()/2)-50), null); 
						       else
					              {

						    	   if(x1>a[1]&&x1<a[2]  && y1>b[2]&&y1<b[6])
			            	  			show_First_Column(x1,y1);
						    	   
			            	  		if(x1>a[6]&&x1<a[7]&&y1>b[2]&&y1<b[6])
			            	  			show_Last_Column(x1,y1);
			            	  		
			            	  		else if(x1>a[1]&&x1<a[2]&&y1>b[6]&&y1<b[7])
			            	  			show_Left_Down_Corner(x1,y1);
			            	  		
			            	  		else if(x1>a[6]&&x1<a[7]  &&y1>b[6]&&y1<b[7])
			            	  			show_Bottom_Right_Corner(x1,y1);
			            
			            	  		else if(x1>a[2]&&x1<a[6]&&y1>b[2]&&y1<b[6])
			            	  			show_Center_Rock(x1,y1);
					              }   
					}			   
					  if( ((x1>a[2]&&x1<a[3])&&(y1>b[2]&&y1<b[3]))||((x1>a[5]&&x1<a[6])&&(y1>b[2]&&y1<b[3]))
						         ||((x1>a[3]&&x1<a[4])&&(y1>b[6]&&y1<b[7]))||((x1>a[4]&&x1<a[5])&&(y1>b[6]&&y1<b[7])) ||((x1>a[4]&&x1<a[5])&&(y1>b[4]&&y1<b[5])))
						      {
									swamp_areas(x,y,canvas);
				    		  }
					  if(Values.score13>=155)//23*5(2 swapms)
						 {
				     		cong=1;		Values.level13cleared=1;
				     		disappear();
						 }
					 
					 
				 }
			 }
}
private void show_congrat() {
		// TODO Auto-generated method stub
	
	    Intent i=new Intent(contxt1,CongratulationActivity.class);
	    //((Activity) contxt1).finish();
	    contxt1.startActivity(i);
	   ((Activity) contxt1).finish();
		
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
	canvas.drawBitmap(danger, a[2], b[2], null);
	canvas.drawBitmap(danger, a[5], b[2], null);
	canvas.drawBitmap(danger, a[4], b[4], null);
	canvas.drawBitmap(danger, a[3], b[6], null);
	canvas.drawBitmap(danger, a[4], b[6], null);
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
		canvas.drawBitmap(danger, 130, b[2], null);
		canvas.drawBitmap(danger, a[5], b[2], null);
		canvas.drawBitmap(danger, a[4], b[4], null);
		canvas.drawBitmap(danger, a[3], b[6], null);
		canvas.drawBitmap(danger, a[4], b[6], null);
		show_loose();
		return;
	}
	
		
	}





private void show_Center_Rock(float x1, float y1) {
	// TODO Auto-generated method stub


   if( x1>a[2]&&x1<a[3] &&  y1>b[4]&&y1<b[5] )
    m1=34;
    
   else
   swamp_Rocks++;
   
   	      if(swamp_Rocks==0)
   	      {
   	    	  
   	    	  changedRock[m1-1]++;doubleClick1[m1-1]++;
   	    	  if(changedRock[m1-1]==1)
   	    		Values.score13+=5;
   			  
   	    	  changedRock[m1+1]++;
   	    	  if(changedRock[m1+1]==1)
   	    		Values.score13+=5;
   	    	  doubleClick1[m1+1]++;
 
   	    	  changedRock[m1+7]++;
   	    	  if(changedRock[m1+7]==1)
   	    		Values.score13+=5;
   			  doubleClick1[m1+7]++;
   	    	  
   			  changedRock[m1+8]++;
   	    	  if(changedRock[m1+8]==1)
   	    		Values.score13+=5;
   			  doubleClick1[m1+8]++;
   	    	  
   	    	  changedRock[m1+9]++;
   	    	  if(changedRock[m1+9]==1)
   	    		Values.score13+=5;
   			  doubleClick1[m1+9]++;
   	    	  changedRock[m1-8]++;
   	    	  
   	    	  if(changedRock[m1-8]==1)
   	    		Values.score13+=5;
   			  doubleClick1[m1-8]++;
   	    	  
   	    	  changedRock[m1-9]++;
   	    	  if(changedRock[m1-9]==1)
   	    		Values.score13+=5;
   			    doubleClick1[m1-9]++;
   	    	  
   	    	  changedRock[m1-7]++;
   	    	  if(changedRock[m1-7]==1)
   	    		Values.score13+=5;
   			  doubleClick1[m1-7]++;
   	      }
   	     
}

private void show_Bottom_Right_Corner(float x12, float y12) {
		// TODO Auto-generated method stub
		m1=54;
	    doubleClick1[m1-1]++;
	    changedRock[m1-1]++;
	    if(changedRock[m1-1]==1)
	    	Values.score13+=5;
	    
	    doubleClick1[m1-9]++;
	    changedRock[m1-9]++;
	    if(changedRock[m1-9]==1)
	    	Values.score13+=5;
	    
	    doubleClick1[m1-8]++;
	    changedRock[m1-8]++;
	    if(changedRock[m1-8]==1)
	    	Values.score13+=5;
	    
	      
	    	  
	}

private void show_Left_Down_Corner(float x12, float y12) {
		// TODO Auto-generated method stub
	    m1=49;
	    doubleClick1[m1-7]++;
	    doubleClick1[m1-8]++;
	    doubleClick1[m1+1]++;
	 
	    changedRock[m1-7]++;
	    if(changedRock[m1-7]==1)
	    {
	    	Values.score13+=5;
	    }
	    changedRock[m1-8]++;
	    if(changedRock[m1-8]==1)
	    {
	    	Values.score13+=5;
	    }
	    changedRock[m1+1]++;
	    if(changedRock[m1+1]==1)
	    {
	    	Values.score13+=5;
	    }
		
	}



private void show_Last_Column(float x12, float y12) {
		// TODO Auto-generated method stub
     if(y1>b[4]&&y1<b[5])
		m1=38;
	else if(y1>b[5]&&y1<b[6])
		m1=46;
	
       changedRock[m1-8]++;doubleClick1[m1-8]++;
	   if(changedRock[m1-8]==1)  Values.score13+=5;

	   changedRock[m1+8]++;doubleClick1[m1+8]++;
	   if(changedRock[m1+8]==1)  Values.score13+=5;

	   changedRock[m1-9]++;doubleClick1[m1-9]++;
	   if(changedRock[m1-9]==1)  Values.score13+=5;

	   changedRock[m1+7]++;doubleClick1[m1+7]++;
	   if(changedRock[m1+7]==1)  Values.score13+=5;
	   
	   changedRock[m1-1]++;doubleClick1[m1-1]++;
	   if(changedRock[m1-1]==1)  Values.score13+=5;

}



private void show_First_Column(float x12, float y12) {
		// TODO Auto-generated method stub
		
	 if(y1>b[4]&&y1<b[5])
		m1=33;
	else if(y1>b[5]&&y1<b[6])
		m1=41;

	   changedRock[m1-8]++;doubleClick1[m1-8]++;
	   if(changedRock[m1-8]==1)  Values.score13+=5;

	   changedRock[m1+8]++;doubleClick1[m1+8]++;
	   if(changedRock[m1+8]==1)  Values.score13+=5;

	   changedRock[m1-7]++;doubleClick1[m1-7]++;
	   if(changedRock[m1-7]==1)  Values.score13+=5;

	   changedRock[m1+9]++;doubleClick1[m1+9]++;
	   if(changedRock[m1+9]==1)  Values.score13+=5;
	   
	   changedRock[m1+1]++;doubleClick1[m1+1]++;
	   if(changedRock[m1+1]==1)  Values.score13+=5;

   
	
}


private void show_loose() {
		// TODO Auto-generated method stub
	 Values.clicked=13;
		Intent i=new Intent(contxt1,IncorrectsolutionActivity.class);
		contxt1.startActivity(i);
		((Activity) contxt1).finish();
		
	}
void disappear()
{
	
	 if(Values.score11==175)//23*5(2 swapms)
	 {

		
 		cong=1;disappear();
 		for(int k=1;k<7;k++)
		{
			for(int l=1;l<7;l++)
			{
		
				
				x=1000;y=1000;
				//stopTimer=true;
				blue_square=0;
				
				
				scoreView_rlp.topMargin=1500; 
				scoreView_rlp.leftMargin=3000;
				timeView_rlp.topMargin=6000; 
				timeView_rlp.leftMargin=2100;
			    solveImv_rlp.width=0; 
			    solveImv_rlp.height=0;
			    hintImv_rlp.width=0; 
			    hintImv_rlp.height= 0;
				stopTimer=true;
				changedRock[9]=0;changedRock[10]=0;changedRock[11]=0;
				changedRock[12]=0;changedRock[13]=0;changedRock[14]=0;
				
				changedRock[17]=0;changedRock[18]=0;changedRock[19]=0;
				changedRock[20]=0;changedRock[21]=0;changedRock[22]=0;
				changedRock[25]=0;changedRock[26]=0;changedRock[27]=0;	 
				changedRock[28]=0;changedRock[29]=0;changedRock[30]=0;
				changedRock[33]=0;changedRock[34]=0;changedRock[35]=0;
	
				changedRock[36]=0;changedRock[37]=0;changedRock[38]=0;
				changedRock[41]=0;changedRock[42]=0;changedRock[43]=0;	

				changedRock[44]=0;changedRock[45]=0;changedRock[46]=0;	
				changedRock[49]=0;changedRock[50]=0;changedRock[51]=0;	
				changedRock[52]=0;changedRock[53]=0;changedRock[54]=0;
			
						
			     this.setBackgroundResource(R.drawable.congratulation_screen);
			     this.invalidate();
			}
		}
 		
 		Values.level13cleared=1;
	 }
}
}

class animHandlerl13 extends Handler
{ 
	
	View vv;
    int miterations;
    int mcuriteration;
    animHandlerl13(int count,View v)
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