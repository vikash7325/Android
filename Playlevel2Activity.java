

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
import android.media.MediaPlayer;
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


public class Playlevel2Activity extends Activity implements OnClickListener
{
	afRelativeLout12 av;
	animHandler12 h;
	MediaPlayer mp;
	public int musicValue;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        av=new afRelativeLout12(this);
       // mp=MediaPlayer.create(this,R.raw.iron_man);
		setContentView(av);
		Bundle extras = getIntent().getExtras(); 
	    if(extras !=null) 
	    { 
	        	 Values.modeValue = extras.getInt("mode1");
	        	 Log.d("play",Values.modeValue+" : "+Values.modeValue);
	        	 musicValue = extras.getInt("music1");
	        	 Log.d("play",musicValue+" : "+musicValue);
	        	 Values.difficultyValue = extras.getInt("difficulty1");
	        	 Log.d("play",Values.difficultyValue+" : "+Values.difficultyValue);
	        	 Values.sfxValue = extras.getInt("special1");
	        	 Log.d("play",Values.sfxValue+" : "+Values.sfxValue);
	        	 
	    }
		av.invalidate();
		av.invalidate();
    }
	@Override
    protected void onResume()
	{
    		// TODO Auto-generated method stub
    			
    			super.onResume();
    			h=new animHandler12(1000,av);
    			h.sendEmptyMessage(0);
    			
    			Values.stopTimer=0;
    			Log.d("resumestoptimer",Values.stopTimer+" : "+Values.stopTimer);
    		//	if(musicValue==0)
    		//	{
    		//	mp.start();
    		//	mp.setLooping(true);
    		//	}
    }

	@Override
	protected void onRestart()
	{
		super.onRestart();
		Values.stopTimer=0;
	}
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
	@Override
	protected void onPause()
	{
	    super.onPause();
     	//  mp.stop();
	    Values.stopTimer=1;
	//    SharedPreferences.Editor ed = mPrefs.edit();
     //   ed.putInt("view_mode", Values.stopTimer);
        Log.d("pausestoptimer",Values.stopTimer+" : "+Values.stopTimer);
     //   ed.commit();
	    
	}
}
class afRelativeLout12 extends LinearLayout
{
	   int cong=0,blue_square=1;
	private Context contxt1;
	private RelativeLayout rl;
	MediaPlayer mp1;
	ImageView homeView,solveView,resetView,hintView,rockView,swampView,waterView,pauseView,restartView;
	TextView scoreView,timeView;
	int width,height,onD=0,changeAfterThis,splash;
	int[] doubleClick1=new int[64];
	int[] changedRock=new int[64];
	int[] convertRock=new int[64];
	float x=200,y=30;
	Thread t;
	int width1,height1;
	boolean once=true;
	int []a = new int[8];
	int []b = new int[8];
	int [][]c=new int[8][8];
	int [][]d=new int[8][8];
	int click=0;
	int flag=0,front=0,back=0,count=1,flag1=0,right=0,left=0,anim=0,swamp=0,sub1=0,sub2=0,sub3=0,arcade=0,m1,m2;
	int rock_height,rock_width;
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
	int bubble1flag=0,bubble2flag=0;
	
	//boolean stopTimer=false;
	private long mStartTime = 0L;
	private Handler mHandler=new Handler();
	public afRelativeLout12(Context context)
	{
		super(context);
		// TODO Auto-generated constructor stub
		contxt1=context;
		background_image();
	}

	private void background_image()
	{
		// TODO Auto-generated method stub
		this.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
	     rl=new RelativeLayout(contxt1);
	     rl.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.FILL_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT));	
	     this.setBackgroundResource(R.drawable.my);
	     this.addView(rl);
		
	}
	
	public void initialize()
	{
		
		 width = this.getWidth(); 
		 height=this.getHeight();
		 Log.d("height",width+" : "+height);
		// mp1=MediaPlayer.create(contxt1,R.raw.water_splash);

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
	     homeView.setOnClickListener(new View.OnClickListener()
	     {
			public void onClick(View v)
			{
				// TODO Auto-generated method stub
				Intent i = new Intent(contxt1,HomeActivity.class);
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
		     resetView.setOnClickListener(new View.OnClickListener()
		     {
				
				public void onClick(View v)
				{
					// TODO Auto-generated method stub
					Intent i = new Intent(contxt1,Playlevel2Activity.class);
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
                Values.click2 =1;
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
		 //   hintImv_rlp.leftMargin=width/16; 
		    hintImv_rlp.width=width/4; 
		    hintImv_rlp.height=height/7;
		    rl.addView(hintView, hintImv_rlp);
		    hintView.setOnClickListener(new View.OnClickListener() {
		  		   public void onClick(View v) {
		                  AlertDialog.Builder builder = new AlertDialog.Builder(contxt1); 
		                 
		               //  if(count6==0)
				                    builder.setMessage("Beware of the 2nd column!!!!You might end up on a swamp Area!!");
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
	
	
		    
		     
		 
			      
			      
	//textview for Values.score2
		     	scoreView=new TextView(contxt1); 
		     	scoreView.setText(""+0);   
		     	scoreView.setTextColor(Color.rgb(200, 0, 0));
		     	scoreView.setTextSize(20);
				scoreView.setId(100);
				scoreView_rlp=new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,
			    RelativeLayout.LayoutParams.WRAP_CONTENT);
				scoreView_rlp.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
				scoreView_rlp.addRule(RelativeLayout.LEFT_OF, resetView.getId()); 
				scoreView_rlp.leftMargin=100;
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
				timeView_rlp.bottomMargin=height/12;
				timeView_rlp.leftMargin=width/2;
			    rl.addView(timeView,timeView_rlp);
			    	if (mStartTime == 0L)
			    	{
			    		mStartTime = System.currentTimeMillis();
			    		mHandler.removeCallbacks(mUpdateTimeTask);
			    		mHandler.postDelayed(mUpdateTimeTask, 100);
			    		 Log.d("insidestoptimer",Values.stopTimer+" : "+Values.stopTimer);
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
                	

                	 if (seconds< 10) 
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
                	    if(secs==60)
                	     {
                		 	//stopTimer=true;
                		 	 Values.score2=0;
                		 	 Values.clickedt=2;
                			Intent i = new Intent(contxt1,TimeOutActivity.class);
                		 	((Activity) contxt1).finish();
                		 	contxt1.startActivity(i);
                		 }
                	 }
                	 else
                	 {
                		 if(secs==30)
                	     {
                		 	//stopTimer=true;
                		 	 Values.score2=0;
                		 	 Values.clickedt=2;
                			Intent i = new Intent(contxt1,TimeOutActivity.class);
                		 	((Activity) contxt1).finish();
                		 	contxt1.startActivity(i);
                		 }
                		 
                	 }
	            
	            }
					  }
              }
		 };
	private String tag;
	@Override
	public boolean onTouchEvent(MotionEvent event)
	{
		// TODO Auto-generated method 
	  x1=event.getX();
      y1=event.getY();
    	
    		
    	switch( event.getAction())
    	{
    	     case MotionEvent.ACTION_DOWN:
    		 					
    		 //limit the clicked position to the center of the bitmap whenever it is clicked at any position
    		 //for first row
    		 						swamp=0;
    		                        flag=0;
    		                        changeAfterThis=0;
    		 						
    		 			
    		 						 if((x1>=a[2]&&x1<a[3])&&(y1>=b[3]&&y1<b[4]))
    		 						{
 		 							  if(doubleClick1[26]==0)
 		 							  {
 		 						
 		 								x1=a[2]+((a[7]-a[6])/2);
		 								y1=b[3]+((b[1]-b[0])/2);
 		 								  flag=1;
 		 								  doubleClick1[26]++;
 		 								  changedRock[26]=1;
 		 								  
 		 							  }
 		 						  }	  
    		 			
    		 						else if((x1>=a[3]&&x1<a[4])&&(y1>=b[3]&&y1<b[4]))
    		 						{
 		 							 if(doubleClick1[27]==0)
 		 							 { 
 		 						
 		 								x1=a[3]+((a[7]-a[6])/2);
		 								y1=b[3]+((b[1]-b[0])/2);
		 							     flag=1;
		 							     doubleClick1[27]++;
		 							     changedRock[27]=1;
		 							     
 		 							 }
		 						 }
    		
    		 						else if((x1>=a[4]&&x1<a[5])&&(y1>=b[3]&&y1<b[4]))
    		 						{
		 							 if(doubleClick1[28]==0)
		 							 {
		 						 
		 								x1=a[4]+((a[7]-a[6])/2);
		 								y1=b[3]+((b[1]-b[0])/2);
		 							     flag=1;
		 							     doubleClick1[28]++;
		 							     changedRock[28]=1;
		 							     
		 							 }
		 					     }
    		 	
    		 						else if((x1>=a[5]&&x1<a[6])&&(y1>=b[3]&&y1<b[4]))
    		 						{
		 						     if(doubleClick1[29]==0)
		 							 {
		 						
		 						    	x1=a[5]+((a[7]-a[6])/2);
		 								y1=b[3]+((b[1]-b[0])/2);
		 							     flag=1;
		 							     doubleClick1[29]++;
		 							     changedRock[29]=1;
		 							   
		 							 }
		 					    }
    	
    		 				else if((x1>=a[2]&&x1<a[3])&&(y1>=b[4]&&y1<b[5]))	
    		 						{
 		 							    if(doubleClick1[34]==0)
 		 							    {
 		 							  
 		 							    	x1=a[2]+((a[7]-a[6])/2);
			 								y1=b[4]+((b[1]-b[0])/2);
 		 							    	flag=1;
 		 							    	doubleClick1[34]++;
 		 							    	changedRock[34]=1;
 		 							    	
 		 							    }
 		 						  }
    		 	
    		 						else if((x1>=a[3]&&x1<a[4])&&(y1>=b[4]&&y1<b[5]))
    		 						{
 		 							  if(doubleClick1[35]==0)
	 							      {    
 		 				
 		 								x1=a[3]+((a[7]-a[6])/2);
		 								y1=b[4]+((b[1]-b[0])/2);
 		 								  flag=1;
 		 								  doubleClick1[35]++;
 		 								  changedRock[35]=1;
 		 							      
	 							      }
		 						  }
    	
    		 						else if((x1>=a[4]&&x1<a[5])&&(y1>=b[4]&&y1<b[5]))
    		 						{
		 						    	if(doubleClick1[36]==0)
		 							    {
		 					
		 						    		x1=a[4]+((a[7]-a[6])/2);
			 								y1=b[4]+((b[1]-b[0])/2);
		 						    		flag=1;
		 						    		doubleClick1[36]++;
		 						    		changedRock[36]=1;
		 						    		
		 							    }
		 						   }
    		 						else if((x1>=a[5]&&x1<a[6])&&(y1>=b[4]&&y1<b[5]))
    		 						{
		 						    	if(doubleClick1[37]==0)
		 							    {
		 					
		 						    		x1=a[5]+((a[7]-a[6])/2);
			 								y1=b[4]+((b[1]-b[0])/2);
		 						    		flag=1;
		 						    		doubleClick1[37]++;
		 						    		changedRock[37]=1;
		 						    		
		 							    }
		 						    }
    		 		
    		 			else if((x1>=a[2]&&x1<a[3])&&(y1>=b[5]&&y1<b[6]))
 		 						   {
 		 							   if(doubleClick1[42]==0)
 		 							   {
 		 						
 		 								   x1=a[2]+((a[7]-a[6])/2);
			 								y1=b[5]+((b[1]-b[0])/2);
 		 								   flag=1;
 		 								   doubleClick1[42]++;
 		 								   changedRock[42]=1;
 		 								
 		 							   }
 		 						  }
    		 
    		 						else if((x1>=a[3]&&x1<a[4])&&(y1>=b[5]&&y1<b[6]))
    		 						{
 		 							  if(doubleClick1[43]==0)
 		 							  { 
 		 						
 		 								x1=a[3]+((a[7]-a[6])/2);
		 								y1=b[5]+((b[1]-b[0])/2);
 		 								  flag=1;
 		 								  doubleClick1[43]++;
 		 								  changedRock[43]=1;
 		 								 
 		 							  }
		 						  }
    		 	
    		 						else if((x1>=a[4]&&x1<a[5])&&(y1>=b[5]&&y1<b[6]))
    		 						{
		 						    	if(doubleClick1[44]==0)
		 							    {
		 						    
		 						    
		 						    		x1=a[4]+((a[7]-a[6])/2);
			 								y1=b[5]+((b[1]-b[0])/2);
		 						    		flag=1;
		 						    		doubleClick1[44]++;
		 						    		changedRock[44]=1;
		 						    		
		 							    }
		 						   }
    		
    		 						else if((x1>=a[5]&&x1<a[6])&&(y1>=b[5]&&y1<b[6]))
    		 						{ 
		 						    	if(doubleClick1[45]==0)
		 							    {
		 						   
		 						    		x1=a[5]+((a[7]-a[6])/2);
			 								y1=b[5]+((b[1]-b[0])/2);
		 						    		flag=1;
		 						    		doubleClick1[45]++;
		 						    		changedRock[45]=1;
		 						    		
		 							    }
		 						    }
    	
    		 						
    	
    		 						
    		 						else if((x1>=a[2]&&x1<a[3])&&(y1>=b[6]&&y1<b[7]))
    		 						{
 		 							  if(doubleClick1[50]==0)
 		 							  {
 		 				
 		 								x1=a[2]+((a[7]-a[6])/2);
		 								y1=b[6]+((b[1]-b[0])/2);
 		 								  flag=1;
 		 								  doubleClick1[50]++;
 		 								  changedRock[50]=1;
 		 							
 		 							  }
 		 						  }
    		 	
    		 						else if((x1>=a[3]&&x1<a[4])&&(y1>=b[6]&&y1<b[7]))
    		 						{
 		 							  if(doubleClick1[51]==0)
 		 							  {    
 		 						
 		 								x1=a[3]+((a[7]-a[6])/2);
		 								y1=b[6]+((b[1]-b[0])/2);
 		 								  flag=1;
 		 								  doubleClick1[51]++;
 		 								  changedRock[51]=1;
 		 								  
 		 							  }
		 						  }
    		 		
    		 						else if((x1>=a[4]&&x1<a[5])&&(y1>=b[6]&&y1<b[7]))
    		 						{
		 						       if(doubleClick1[52]==0)
		 							   {
		 						 
		 						    	  x1=a[4]+((a[7]-a[6])/2);
			 								y1=b[6]+((b[1]-b[0])/2);
		 						    	   flag=1;
		 						    	   doubleClick1[52]++;
		 						    	   changedRock[52]=1;
		 						    	  
		 							   }
		 						  }
    		
    		 						else if((x1>=a[5]&&x1<a[6])&&(y1>=b[6]&&y1<b[7]))
    		 						{
		 						       if(doubleClick1[53]==0)
		 							   {
		 						  
		 						    	  x1=a[5]+((a[7]-a[6])/2);
			 								y1=b[6]+((b[1]-b[0])/2);
		 							       flag=1;
		 							       doubleClick1[53]++;
		 							       changedRock[53]=1;
		 							      
		 							   }
		 						  }
    		 			
    		 					else
    		 						{
    		 							flag=0;
    		 						}
    		 						 //to check the direction of fly of frog
		 						    if(flag==1)
		 						    {
		 						    		Values.score2+=5;
		 						    		front=0;
		 						    	    back=0;
		 						    	    left=0;
		 						    	    right=0;
		 						    	    anim=0;
		 						    	    s=0;
		 						    	    s1=0;
		 						    	    s2=0;
		 						    	    s3=0;
		 						    	    if(y<y1&&x1<a[7]+(a[7]-a[6]))    //if clicked position is below the current location of frog 
				 						    {
				 						    	
		 						    	    	front=1;
		 						    	    	
				 						    }
				 						    else if(y>y1)    //if clicked position is above the current location of the frog
				 						    {
				 						    	back=1;				
				 						    	
    				 						}
				 						         //if on the same line and left of the frog
				 						    else if(x<x1&&y<(y1+(rock_height/2))&&y>(y1-(rock_height/2)))
		 						    	    {
				 						    	right=1;
				 						    	Log.d(tag, "right");
				 						    }
				 						    else         //if on same line and right of the frog
				 						    {
				 						    	left=1;
				 						    	Log.d(tag, "left");
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
    @Override
	protected void onDraw(Canvas canvas)  
	{
		// TODO Auto-generated method stub
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
        int [][]d={{a[2],b[3]},{a[3],b[3]},{a[4],b[3]},{a[5],b[3]},
     		   {a[2],b[4]},{a[3],b[4]},{a[4],b[4]},{a[5],b[4]},
     		   {a[2],b[5]},{a[3],b[5]},{a[4],b[5]},{a[5],b[5]},
     		   {a[2],b[6]},{a[3],b[6]},{a[4],b[6]},{a[5],b[6]}};
       int ci=width1*10000;
       int di=height1*10000;
        //c[0][1]=b[3];
        Log.d("outside",b[0]+" : "+a[1]);
    	//	bitmap  during left jumping
		Bitmap anim_left_frog = BitmapFactory.decodeResource(this.getResources(), R.drawable.left_jump);
		Bitmap left_frog = BitmapFactory.decodeResource(this.getResources(), R.drawable.left_1);
	//bitmap during front jump	
		Bitmap front_frog = BitmapFactory.decodeResource(this.getResources(), R.drawable.front_1);
		Bitmap danger = BitmapFactory.decodeResource(this.getResources(), R.drawable.redsquare);
		Bitmap frog = BitmapFactory.decodeResource(this.getResources(), R.drawable.front_1);
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
		Bitmap stone1 = BitmapFactory.decodeResource(this.getResources(), R.drawable.stone);
		//bitmap of arcade	
		Bitmap blue1 = BitmapFactory.decodeResource(this.getResources(), R.drawable.square);
		rock_height=blue1.getHeight();
		rock_width=blue1.getWidth();
		
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
			
			if(once)
			{
				initialize();
				once=false;
			}
			if(Values.click2==1)
			{
				flag=0;
				front=0;
				back=0;
				left=0;
				right=0;
				count=0;
				//background_image();
				canvas.drawBitmap(frog,230,150, null);
				for(int y=26;y<54;y++)
				{
					
			    		doubleClick1[y]=0;
			    		changedRock[y]=0;
				}
				for(int i=0;i<16;i++)
	        	{
	        		
	        		for(int j=0;j<2;j++)
	        		{
	        			
	        			if( i!=1 && i!=2 )
	        			{	
	        				for(int k=3;k<7;k++)
	    					{
	    						for(int l=2;l<6;l++)
	    						{
	    						
	                		a[l]=ci;//(ci+=ci);
	                    	b[k]=di;//(ci+=ci);
	        			
	    						}
	    					}
	                
	                	
	                    canvas.drawBitmap(stone1,d[i][j],d[i][++j], null);
	        			
	        			}
	                	else
	                	{
	                		
	                		
	                		for(int k=3;k<7;k++)
	    					{
	    						for(int l=2;l<6;l++)
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
			for(int k=3;k<7;k++)
			{
				for(int l=2;l<6;l++)
				{
				
					
					 if(k==3&&l==2&&changedRock[26]>=1&&cong!=1)
					{
						canvas.drawBitmap(stone1, a[l], b[k],null);
					}
					else if(k==3&&l==3&&changedRock[27]>=1&&cong!=1)
					{
						canvas.drawBitmap(stone1, a[l], b[k],null);
					}
					else if(k==3&&l==4&&changedRock[28]>=1&&cong!=1)
					{
						canvas.drawBitmap(stone1, a[l], b[k],null);
					}
					else if(k==3&&l==5&&changedRock[29]>=1&&cong!=1)
					{
						canvas.drawBitmap(stone1, a[l], b[k],null);
					}
				
					else if(k==4&&l==2&&changedRock[34]>=1&&cong!=1)
					{
						canvas.drawBitmap(stone1, a[l], b[k],null);
					}
					else if(k==4&&l==3&&changedRock[35]>=1&&cong!=1)
					{
						canvas.drawBitmap(stone1, a[l], b[k],null);
					}
					else if(k==4&&l==4&&changedRock[36]>=1&&cong!=1)
					{
						canvas.drawBitmap(stone1, a[l], b[k],null);
					}
					else if(k==4&&l==5&&changedRock[37]>=1&&cong!=1)
					{
						canvas.drawBitmap(stone1, a[l], b[k],null);
					}
					
					
					else if(k==5&&l==2&&changedRock[42]>=1&&cong!=1)
					{
						canvas.drawBitmap(stone1, a[l], b[k],null);
					}
					else if(k==5&&l==3&&changedRock[43]>=1&&cong!=1)
					{
						canvas.drawBitmap(stone1, a[l], b[k],null);
					}
					else if(k==5&&l==4&&changedRock[44]>=1&&cong!=1)
					{
						canvas.drawBitmap(stone1, a[l], b[k],null);
					}
					else if(k==5&&l==5&&changedRock[45]>=1&&cong!=1)
					{
						canvas.drawBitmap(stone1, a[l], b[k],null);
					}
					else if(k==5&&l==6&&changedRock[46]>=1&&cong!=1)
					{
						canvas.drawBitmap(stone1, a[l], b[k],null);
					}
					
					else if(k==6&&l==2&&changedRock[50]>=1&&cong!=1)
					{
						canvas.drawBitmap(stone1, a[l], b[k],null);
					}
					else if(k==6&&l==3&&changedRock[51]>=1&&cong!=1)
					{
						canvas.drawBitmap(stone1, a[l], b[k],null);
					}
					else if(k==6&&l==4&&changedRock[52]>=1&&cong!=1)
					{
						canvas.drawBitmap(stone1, a[l], b[k],null);
					}
					else if(k==6&&l==5&&changedRock[53]>=1&&cong!=1)
					{
						canvas.drawBitmap(stone1, a[l], b[k],null);
					}
					else
					{
						if(blue_square==1)
					      { 
					    	  canvas.drawBitmap(blue1, a[l], b[k], null);
					       }
					}
				}
			}
			//to draw the frog at the top when activity starts
			 if(count==1)
			 {
				 canvas.drawBitmap(front_frog, x-(front_frog.getWidth()/2), y-(front_frog.getHeight()/2), null);
			 }
			 if(cong==1)
			 {
    		  disappear();
    		 }
			//checking the condition of ontouch event
			 
			 if(front==1)
			 {
				   
				  xValue = (x1+(yValue-y1)/slope);
		   	
				  if(yValue<y1&&y1<(b[7]+(b[7]-b[6]))&&y1>b[0])
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
					 	 if(Values.score2>=70||cong==1)
							 scoreView.setText(""+70);
						 else
						     scoreView.setText(""+Values.score2);
					  }
					  if(Values.difficultyValue==0)
					  {
					  if(flag==1)
					  {
					
						  
						  if((x1>=a[2]&&x1<a[3])&&(y1>=b[3]&&y1<b[4])||(x1>=a[5]&&x1<a[6])&&(y1>=b[3]&&y1<b[4])
								  ||(x1>=a[2]&&x1<a[3])&&(y1>=b[4]&&y1<b[5])||(x1>=a[5]&&x1<a[6])&&(y1>=b[4]&&y1<b[5]))
						  {
							 // bubble1flag=1;
							 canvas.drawBitmap(bubble1,( x-(front_frog.getWidth()/2)+40),( y-(front_frog.getHeight()/2)-50), null);
						 } 
						  
						  
						  if((x1>=a[3]&&x1<a[4])&&(y1>=b[4]&&y1<b[5])||(x1>=a[4]&&x1<a[5])&&(y1>=b[4]&&y1<b[5]))
								  
						  {
							  canvas.drawBitmap(bubble2, (x-(front_frog.getWidth()/2)+40), (y-(front_frog.getHeight()/2)-50), null);
						  }
		
						 else
						 {
						        
							 if(x1>a[3]&&x1<a[5]&&y1>b[5]&&y1<b[6]) 
							 {
								
								    show_Center_Rock(x1,y1,canvas);
				              }
							
							
						
							 else if(x1>a[2]&&x1<a[3]&&y1>b[5]&&y1<b[6])
							 {
								  show_First_Row(x1,y1);
							  }
							 else if(x1>a[2]&&x1<a[3]&&y1>b[5]&&y1<b[6])
							 {
							  show_First_Column(x1,y1);
							  }
							 else if(x1>a[5]&&x1<a[6]&&y1>b[5]&&y1<b[6])
							 {
								  show_Last_Column(x1,y1);
							  }
				
							 else if(x1>a[3]&&x1<a[5]&&y1>b[6]&&y1<b[7])
							 {
								  show_Last_Row(x1,y1);
							  }
							  else if(x1>a[5]&&x1<a[6]&&y1>b[6]&&y1<b[7])
							  { 
								  show_Bottom_Right_Corner(x1,y1);
							  }
							
							  else if(x1>a[2]&&x1<a[3]&&y1>b[6]&&y1<b[7])
							  {
								  show_Left_Down_Corner(x1,y1);
							  }
							 
							
							  else
							  {
								  ;
						
							  }
						 }  
					 }			   
				 
						if((x1>=a[3]&&x1<a[4])&&(y1>=b[3]&&y1<b[4])||(x1>=a[4]&&x1<a[5])&&(y1>=b[3]&&y1<b[4]))
					  {
							swamp_areas(x,y,canvas);
		    		  }
						if(Values.score2==70)//23*5(2 swapms)
		   			    {
							cong=1;
							disappear();
		   	 		        Values.level2cleared=1;
		   	 			
		   					scoreView_rlp.topMargin=1500; 
		   					scoreView_rlp.leftMargin=3000;
		   					timeView_rlp.topMargin=6000; 
		   					timeView_rlp.leftMargin=2100;
		   					
					    }
					 
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
						 	 if(Values.score2>=70||cong==1)
								 scoreView.setText(""+70);
							 else
							     scoreView.setText(""+Values.score2);
					 }
					 if(Values.difficultyValue==0)
					 {
					 if(flag==1)
					 {
						 
						  if((x1>=a[2]&&x1<a[3])&&(y1>=b[3]&&y1<b[4])||(x1>=a[5]&&x1<a[6])&&(y1>=b[3]&&y1<b[4])
								  ||(x1>=a[2]&&x1<a[3])&&(y1>=b[4]&&y1<b[5])||(x1>=a[5]&&x1<a[6])&&(y1>=b[4]&&y1<b[5]))
						  {
							 // bubble1flag=1;
							 canvas.drawBitmap(bubble1,( x-(front_frog.getWidth()/2)+40),( y-(front_frog.getHeight()/2)-50), null);
						 } 
						
						 if((x1>=a[3]&&x1<a[4])&&(y1>=b[4]&&y1<b[5])||(x1>=a[4]&&x1<a[5])&&(y1>=b[4]&&y1<b[5]))
							  
						  {
							 canvas.drawBitmap(bubble2, (x-(front_frog.getWidth()/2)+40), (y-(front_frog.getHeight()/2)-50), null);
						  }
						
						 
					 else
					 {
    					 
						 if(x1>a[3]&&x1<a[5]&&y1>b[5]&&y1<b[6]) 
						  {
							
							    show_Center_Rock(x1,y1,canvas);
			              }
						 
						
				 

						 else if(x1>a[2]&&x1<a[3]&&y1>b[5]&&y1<b[6])
						 {
							  show_First_Row(x1,y1);
						  }
						 else if(x1>a[2]&&x1<a[3]&&y1>b[5]&&y1<b[6])
						 {
						  show_First_Column(x1,y1);
						  }
						 else if(x1>a[5]&&x1<a[6]&&y1>b[5]&&y1<b[6])
						 {
							  show_Last_Column(x1,y1);
						  }
						 else if(x1>a[3]&&x1<a[5]&&y1>b[6]&&y1<b[7])
						 {
							  show_Last_Row(x1,y1);
						  }
						  else if(x1>a[5]&&x1<a[6]&&y1>b[6]&&y1<b[7])
						  { 
							  show_Bottom_Right_Corner(x1,y1);
						  }
						
						  else if(x1>a[2]&&x1<a[3]&&y1>b[6]&&y1<b[7])
						  {
							  show_Left_Down_Corner(x1,y1);
						  }
						 
						
						  else
						  {
							  ;
						  }
					    }
					 }
			
						if((x1>=a[3]&&x1<a[4])&&(y1>=b[3]&&y1<b[4])||(x1>=a[4]&&x1<a[5])&&(y1>=b[3]&&y1<b[4])) 
					  {
							swamp_areas(x,y,canvas);
		    		  }
						if(Values.score2==70)//23*5(2 swapms)
		   			    {
							cong=1;
							disappear();
		   	 		        Values.level2cleared=1;
		   	 			
		   					scoreView_rlp.topMargin=1500; 
		   					scoreView_rlp.leftMargin=3000;
		   					timeView_rlp.topMargin=6000; 
		   					timeView_rlp.leftMargin=2100;
		   					
					    }
					 
					 }
					
				}
			 }
			 if(left==1)
			 {
				  yValue=y1+slope*(xValue-x1);
		          if(xValue>x1)
				  {
					   if(y1<(q2-(rock_height/2)))
		        	   {
		        	      canvas.drawBitmap(left_up_now, xValue-(left_up_now.getWidth()/2), yValue-(left_up_now.getHeight()/2), null);
		        	      
		        	   }
		        	   else if(y1>(q2+(rock_height/2)))
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
				           if(Values.score2>=70||cong==1)
								 scoreView.setText(""+70);
							 else
							     scoreView.setText(""+Values.score2);
				       }
				       if(Values.difficultyValue==0)
				       {
				       if(flag==1)
				       {
				    	   
							  if((x1>=a[2]&&x1<a[3])&&(y1>=b[3]&&y1<b[4])||(x1>=a[5]&&x1<a[6])&&(y1>=b[3]&&y1<b[4])
									  ||(x1>=a[2]&&x1<a[3])&&(y1>=b[4]&&y1<b[5])||(x1>=a[5]&&x1<a[6])&&(y1>=b[4]&&y1<b[5]))
							  {
								 // bubble1flag=1;
								 canvas.drawBitmap(bubble1,( x-(front_frog.getWidth()/2)+40),( y-(front_frog.getHeight()/2)-50), null);
							 } 
				    	   if((x1>=a[3]&&x1<a[4])&&(y1>=b[4]&&y1<b[5])||(x1>=a[4]&&x1<a[5])&&(y1>=b[4]&&y1<b[5]))
								  
							  {
				    		   canvas.drawBitmap(bubble2, (x-(front_frog.getWidth()/2)+40), (y-(front_frog.getHeight()/2)-50), null);
							  }
				    	  
				   	  else
					   {
						  
						   if(x1>a[3]&&x1<a[5]&&y1>b[5]&&y1<b[6]) 
							  {
						    	  show_Center_Rock(x1,y1,canvas);
				              }
						  
						 
						   else if(x1>a[2]&&x1<a[3]&&y1>b[5]&&y1<b[6])
							 {
								  show_First_Row(x1,y1);
							  }
						   else if(x1>a[2]&&x1<a[3]&&y1>b[5]&&y1<b[6])
							 {
							  show_First_Column(x1,y1);
							  }
							 else if(x1>a[5]&&x1<a[6]&&y1>b[5]&&y1<b[6])
							 {
								  show_Last_Column(x1,y1);
							  }
							 else if(x1>a[3]&&x1<a[5]&&y1>b[6]&&y1<b[7])
							 {
								  show_Last_Row(x1,y1);
							  }
						   else if(x1>a[5]&&x1<a[6]&&y1>b[6]&&y1<b[7])
							  { 
								  show_Bottom_Right_Corner(x1,y1);
							  }
						   
						   else if(x1>a[2]&&x1<a[3]&&y1>b[6]&&y1<b[7])
							  {
								  show_Left_Down_Corner(x1,y1);
							  }
						  
							  else
							  {
								  ;
							  }
					     }
				     }
				  
				   	if((x1>=a[3]&&x1<a[4])&&(y1>=b[3]&&y1<b[4])||(x1>=a[4]&&x1<a[5])&&(y1>=b[3]&&y1<b[4]))
						  {
								swamp_areas(x,y,canvas);
			    		  }
				   	if(Values.score2==70)//23*5(2 swapms)
	   			    {
						cong=1;
						disappear();
	   	 		        Values.level2cleared=1;
	   	 			
	   					scoreView_rlp.topMargin=1500; 
	   					scoreView_rlp.leftMargin=3000;
	   					timeView_rlp.topMargin=6000; 
	   					timeView_rlp.leftMargin=2100;
	   					
				    }
				       }
				      
				  }
			 }
			 if(right==1)
			 {
				 
				  yValue=y1+slope*(xValue-x1);
		          if(xValue<x1)		  
				  {
		        	   if(y1<(q2-(rock_height/2)))
		        	   {
		        	      canvas.drawBitmap(right_up_now, xValue-(right_up_now.getWidth()/2), yValue-(right_up_now.getHeight()/2), null);
		        	      
		        	   }
		        	   else if(y1>(q2+(rock_height/2)))
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
						   if(Values.score2>=70||cong==1)
								 scoreView.setText(""+70);
							 else
							     scoreView.setText(""+Values.score2);
					}
					if(Values.difficultyValue==0)
					{
					if(flag==1)
					{
						 
						  if((x1>=a[2]&&x1<a[3])&&(y1>=b[3]&&y1<b[4])||(x1>=a[5]&&x1<a[6])&&(y1>=b[3]&&y1<b[4])
								  ||(x1>=a[2]&&x1<a[3])&&(y1>=b[4]&&y1<b[5])||(x1>=a[5]&&x1<a[6])&&(y1>=b[4]&&y1<b[5]))
						  {
							  //bubble1flag=1;
							 canvas.drawBitmap(bubble1,( x-(front_frog.getWidth()/2)+40),( y-(front_frog.getHeight()/2)-50), null);
						 } 
						 if((x1>=a[3]&&x1<a[4])&&(y1>=b[4]&&y1<b[5])||(x1>=a[4]&&x1<a[5])&&(y1>=b[4]&&y1<b[5]))
							  
						  {
							  canvas.drawBitmap(bubble2, (x-(front_frog.getWidth()/2)+40), (y-(front_frog.getHeight()/2)-50), null);
						  }
						
					 else
					 {
				
				
						  if(x1>a[3]&&x1<a[5]&&y1>b[5]&&y1<b[6]) 
						  {
				 		       show_Center_Rock(x1,y1,canvas);
			              }
					
						
						  else if(x1>a[2]&&x1<a[3]&&y1>b[5]&&y1<b[6])
							 {
								  show_First_Row(x1,y1);
							  }
						  else if(x1>a[2]&&x1<a[3]&&y1>b[5]&&y1<b[6])
							 {
							  show_First_Column(x1,y1);
							  }
							 else if(x1>a[5]&&x1<a[6]&&y1>b[5]&&y1<b[6])
							 {
								  show_Last_Column(x1,y1);
							  }
					
							 else if(x1>a[3]&&x1<a[5]&&y1>b[6]&&y1<b[7])
							 {
								  show_Last_Row(x1,y1);
							  }
						  else if(x1>a[5]&&x1<a[6]&&y1>b[6]&&y1<b[7])
						  { 
							  show_Bottom_Right_Corner(x1,y1);
						  }
						 
				
							 
							  else if(x1>a[2]&&x1<a[3]&&y1>b[6]&&y1<b[7])
							  {
								  show_Left_Down_Corner(x1,y1);
							  }
						  else
						  {
							  ;
						  }
					 }
					 
					}
			
					if((x1>=a[3]&&x1<a[4])&&(y1>=b[3]&&y1<b[4])||(x1>=a[4]&&x1<a[5])&&(y1>=b[3]&&y1<b[4]))
					  {
							swamp_areas(x,y,canvas);
		    		  }
					if(Values.score2==70)//23*5(2 swapms)
	   			    {
						cong=1;
						disappear();
	   	 		        Values.level2cleared=1;
	   	 			
	   					scoreView_rlp.topMargin=1500; 
	   					scoreView_rlp.leftMargin=3000;
	   					timeView_rlp.topMargin=6000; 
	   					timeView_rlp.leftMargin=2100;
	   					
				    }
					 
					}
					
					}
					}	 
			 if(bubble1flag==1)
			 {
				 canvas.drawBitmap(bubble1,( x-(front_frog.getWidth()/2)+40),( y-(front_frog.getHeight()/2)-50), null); 
				 bubble1flag=0;
			 }
			 if(bubble2flag==1)
			 {
				 canvas.drawBitmap(bubble2,( x-(front_frog.getWidth()/2)+40),( y-(front_frog.getHeight()/2)-50), null); 
				 bubble2flag=0;
			 }
			 
}

private void show_congrat() {
		// TODO Auto-generated method stub
	    Intent i=new Intent(contxt1,CongratulationActivity.class);
	//    ((Activity) contxt1).finish();
	    contxt1.startActivity(i);
	   ((Activity) contxt1).finish();
		
	}

private void swamp_areas(float x, float y,Canvas canvas) {
		// TODO Auto-generated method stub
	Bitmap swampy = BitmapFactory.decodeResource(this.getResources(), R.drawable.redsquare);
	Bitmap danger = Bitmap.createScaledBitmap(swampy,width1/8,height1/12, true);
	Bitmap front_dis = BitmapFactory.decodeResource(this.getResources(), R.drawable.front_dissolve);
	Bitmap front_dis1 = BitmapFactory.decodeResource(this.getResources(), R.drawable.front_dissolve1);
	Bitmap front_dis2 = BitmapFactory.decodeResource(this.getResources(), R.drawable.front_dissolve2);
	sub1++;
/*	if(Values.sfxValue==0)
//	{
		if(splash==0)
		{
			mp1.start();
			splash++;
		
		}
		else
		{
			mp1.stop();
		}
	}*/
	
	canvas.drawBitmap(danger,a[3],b[3], null);
	canvas.drawBitmap(danger,a[4],b[3], null);
	
	//canvas.drawBitmap(danger,a[7],b[7], null);
	if(Values.difficultyValue==1)
	{
		canvas.drawBitmap(danger, 130, 330, null);
	}
	
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
		canvas.drawBitmap(danger,a[3],b[3], null);
		canvas.drawBitmap(danger,a[4],b[3], null);
		
		
		if(Values.difficultyValue==1)
		{
			canvas.drawBitmap(danger, 130, 330, null);
		}
		show_loose();
		return;
	}
	
		
	}
private void show_Left_Down_Corner(float x12, float y12) {
	// TODO Auto-generated method stub
    m1=50;
    doubleClick1[m1-7]++;
    doubleClick1[m1-8]++;
    doubleClick1[m1+1]++;
 
    changedRock[m1-7]++;
    if(changedRock[m1-7]==1)
    {
    	Values.scorel12+=5;
    }
    changedRock[m1-8]++;
    if(changedRock[m1-8]==1)
    {
    	Values.scorel12+=5;
    }
    changedRock[m1+1]++;
    if(changedRock[m1+1]==1)
    {
    	Values.scorel12+=5;
    }
}

/*private void show_Top_Right_Corner(float x12, float y12) {
		// TODO Auto-generated method stub
		m1=29;
	    doubleClick1[m1-1]++;
	    doubleClick1[m1+7]++;
	    doubleClick1[m1+8]++;
	    changedRock[m1-1]++;
	    if(changedRock[m1-1]==1)
	    {
	    	Values.score2+=5;
	    }
	    changedRock[m1+7]++;
	    if(changedRock[m1+7]==1)
	    {
	    	Values.score2+=5;
	    }
	    changedRock[m1+8]++;
	    if(changedRock[m1+8]==1)
	    {
	    	Values.score2+=5;
	    }
	      
	    	  
	}*/
private void show_Bottom_Right_Corner(float x12, float y12) {
	// TODO Auto-generated method stub
	m1=53;
    doubleClick1[m1-1]++;
    changedRock[m1-1]++;
    if(changedRock[m1-1]==1)
    	Values.scorel12+=5;
    
    doubleClick1[m1-9]++;
    changedRock[m1-9]++;
    if(changedRock[m1-9]==1)
    	Values.scorel12+=5;
    
    doubleClick1[m1-8]++;
    changedRock[m1-8]++;
    if(changedRock[m1-8]==1)
    	Values.scorel12+=5;
    
      
    	  
}

/*private void show_Right_Down_Corner(float x12, float y12) {
		// TODO Auto-generated method stub
	    m1=53;
	    doubleClick1[m1-9]++;
	    doubleClick1[m1-8]++;
	    doubleClick1[m1-1]++;
	    changedRock[m1-9]++;
	    if(changedRock[m1-9]==1)
	    {
	    	Values.score2+=5;
	    }
	    changedRock[m1-8]++;
	    if(changedRock[m1-8]==1)
	    {
	    	Values.score2+=5;
	    }
	    changedRock[m1-1]++;
	    if(changedRock[m1-1]==1)
	    {
	    	Values.score2+=5;
	    }
		
	}*/

private void show_Last_Row(float x12, float y12) {
		// TODO Auto-generated method stub


    if(x1>a[3]&&x1<a[4])
    {
		m1=51;
	}

    else if(x1>a[4]&&x1<a[5])
    {
		m1=52;
	}

		
	
	doubleClick1[m1-1]++;
    doubleClick1[m1-7]++;
    doubleClick1[m1-8]++;
    doubleClick1[m1-9]++;
    doubleClick1[m1-1]++;
    changedRock[m1-1]++;
    if(changedRock[m1-1]==1)
    {
    	Values.score2+=5;
    }
    changedRock[m1-7]++;
    if(changedRock[m1-7]==1)
    {
    	Values.score2+=5;
    }
    changedRock[m1-8]++;
    if(changedRock[m1-8]==1)
    {
    	Values.score2+=5;
    }
    changedRock[m1-9]++;
    if(changedRock[m1-9]==1)
    {
    	Values.score2+=5;
    }
    changedRock[m1+1]++;
    if(changedRock[m1+1]==1)
    {
    	Values.score2+=5;
    }
   
    
	}

private void show_Last_Column(float x12, float y12) {
		// TODO Auto-generated method stub

	    

	   
			m1=45;
		

	   

	   /* else if(y1>b[4]&&y1<b[5])
	    {
			m1=39;
		}
		else
		{
			m1=47;
		}*/
		
	
		changedRock[m1-1]++;
		if(changedRock[m1-1]==1)
		{
			Values.score2+=5;
		}
		  doubleClick1[m1-1]++;
	
		  changedRock[m1+8]++;
		  if(changedRock[m1+8]==1)
			{
				Values.score2+=5;
			}
	      doubleClick1[m1+8]++;
	
	      changedRock[m1-8]++;
	      if(changedRock[m1-8]==1)
			{
				Values.score2+=5;
			}
	      doubleClick1[m1-8]++;
	
	      changedRock[m1-9]++;
	      if(changedRock[m1-9]==1)
			{
				Values.score2+=5;
			}
	      doubleClick1[m1-9]++;
	
	      changedRock[m1+7]++;
	      if(changedRock[m1+7]==1)
			{
				Values.score2+=5;
			}
	      doubleClick1[m1+7]++;
		
	}
private void show_First_Column(float x12, float y12) {
	// TODO Auto-generated method stub

    

   
		m1=42;
	

   

   /* else if(y1>b[4]&&y1<b[5])
    {
		m1=39;
	}
	else
	{
		m1=47;
	}*/
	

		changedRock[m1+1]++;
		if(changedRock[m1+1]==1)
		{
			Values.score2+=5;
		}
		  doubleClick1[m1+1]++;

		  changedRock[m1+8]++;
		  if(changedRock[m1+8]==1)
			{
				Values.score2+=5;
			}
	      doubleClick1[m1+8]++;

	      changedRock[m1-8]++;
	      if(changedRock[m1-8]==1)
			{
				Values.score2+=5;
			}
	      doubleClick1[m1-8]++;

	      changedRock[m1+9]++;
	      if(changedRock[m1+9]==1)
			{
				Values.score2+=5;
			}
	      doubleClick1[m1+9]++;

	      changedRock[m1-7]++;
	      if(changedRock[m1-7]==1)
			{
				Values.score2+=5;
			}
	      doubleClick1[m1-7]++;
}
private void show_First_Row(float x12, float y12) {
		// TODO Auto-generated method stub

	   
			m1=42;
		
		
			changedRock[m1+1]++;
			if(changedRock[m1+1]==1)
			{
				Values.score2+=5;
			}
		    doubleClick1[m1+1]++;
	     
		  changedRock[m1+7]++;
		  if(changedRock[m1+7]==1)
			{
				Values.score2+=5;
			}
		  doubleClick1[m1+7]++;
	     
		  changedRock[m1+8]++;
		  if(changedRock[m1+8]==1)
			{
				Values.score2+=5;
			}
	      doubleClick1[m1+8]++;
	    
	      changedRock[m1+9]++;
	      if(changedRock[m1+9]==1)
			{
				Values.score2+=5;
			}
	      doubleClick1[m1+9]++;
	    
	      changedRock[m1-1]++;
	      if(changedRock[m1-1]==1)
			{
				Values.score2+=5;
			}
	      doubleClick1[m1-1]++;
	}



private void show_Center_Rock(float x1, float y1,Canvas canvas) {
		// TODO Auto-generated method stub
	
	//Bitmap bubble1 = BitmapFactory.decodeResource(this.getResources(), R.drawable.bubble1);
	//Bitmap bubble2 = BitmapFactory.decodeResource(this.getResources(), R.drawable.bubble2);
	//Bitmap bubble11 = BitmapFactory.decodeResource(this.getResources(), R.drawable.bubble11);
	if(x1>a[4]&&x1<a[5]&&y1>b[5]&&y1<b[6])
	   {
		   m1=44;
		   //canvas.drawBitmap(bubble11, a[4],b[4] , null);
		   //canvas.drawBitmap(bubble2,( a[4]-(front_frog.getWidth()/2)+40),( b[4]-(front_frog.getHeight()/2)-50), null); 
	   }
	 else if(x1>a[3]&&x1<a[4]&&y1>b[5]&&y1<b[6])
	   {
		   m1=43;
		 // canvas.drawBitmap(bubble2, a[4],b[5] , null);
		   //canvas.drawBitmap(bubble2,( a[4]-(front_frog.getWidth()/2)+40),( b[5]-(front_frog.getHeight()/2)-50), null); 
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
	   				  Values.score2+=5;
	   			  }
	   	    	  doubleClick1[m1-1]++;
	   	    	  changedRock[m1+1]++;
	   	    	  if(changedRock[m1+1]==1)
	   			  {
	   				  Values.score2+=5;
	   			  }
	   	    	  doubleClick1[m1+1]++;
	   	    	  changedRock[m1+7]++;
	   	    	  if(changedRock[m1+7]==1)
	   			  {
	   				  Values.score2+=5;
	   			  }
	   	    	  doubleClick1[m1+7]++;
	   	    	  changedRock[m1+8]++;
	   	    	  if(changedRock[m1+8]==1)
	   			  {
	   				  Values.score2+=5;
	   			  }
	   	    	  doubleClick1[m1+8]++;
	   	    	  changedRock[m1+9]++;
	   	    	  if(changedRock[m1+9]==1)
	   			  {
	   				  Values.score2+=5;
	   			  }
	   	    	  doubleClick1[m1+9]++;
	   	    	  changedRock[m1-8]++;
	   	    	  if(changedRock[m1-8]==1)
	   			  {
	   				  Values.score2+=5;
	   			  }
	   	    	  doubleClick1[m1-8]++;
	   	    	  changedRock[m1-9]++;
	   	    	  if(changedRock[m1-9]==1)
	   			  {
	   				  Values.score2+=5;
	   			  }
	   	    	  doubleClick1[m1-9]++;
	   	    	  changedRock[m1-7]++;
	   	    	  if(changedRock[m1-7]==1)
	   			  {
	   				  Values.score2+=5;
	   			  }
	   	    	  doubleClick1[m1-7]++;
	   	      }
	   	     
}

private void show_loose() {
		// TODO Auto-generated method stub
	 Values.clicked=2;
		Intent i=new Intent(contxt1,IncorrectsolutionActivity.class);
		contxt1.startActivity(i);
		((Activity) contxt1).finish();
		
	}
void disappear()
{
	
		scoreView_rlp.topMargin=1500; 
		scoreView_rlp.leftMargin=3000;
		timeView_rlp.topMargin=6000; 
		timeView_rlp.leftMargin=2100;
	//	secs=0;
	   
	
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
				
			   /* solveImv_rlp.width=0; 
			    solveImv_rlp.height=0;
			    hintImv_rlp.width=0; 
			    hintImv_rlp.height= 0;*/

				
				/*changedRock[9]=0;changedRock[10]=0;changedRock[11]=0;
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
				
				changedRock[58]=0;changedRock[59]=0;changedRock[60]=0;changedRock[61]=0;changedRock[62]=0;*/
				
		
						
						
			     this.setBackgroundResource(R.drawable.congratulation_screen);
			     
			    // this.invalidate();
			}
		}
		
	}
}

class animHandler12 extends Handler
{ 
	
	View vv;
    int miterations;
    int mcuriteration;
    animHandler12(int count,View v)
    {
    	vv=v;
        miterations=count;
        mcuriteration=0;
	}

    @Override
	public void handleMessage(Message msg) {
		// TODO Auto-generated method stub
		super.handleMessage(msg);
	//	if(miterations > 0 )
		    vv.invalidate();
	//	miterations--;
		sendEmptyMessage(0);
	}
	
}



