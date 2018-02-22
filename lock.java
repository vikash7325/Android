package com.org.proj;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class lock extends Activity{
	bfRelativeLout av;
	int mode,music,difficulty,sfx;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		av=new bfRelativeLout(this);
		  Bundle extras = getIntent().getExtras(); 
	        if(extras !=null) { 
	        /*	Values.modeValue = extras.getInt("mode1");
	        /Log.d("lock",Values.modeValue+" : "+Values.modeValue);
	        	Values.musicValue = extras.getInt("music1");
	        	Log.d("lock",Values.musicValue+" : "+Values.musicValue);
	        	Values.difficultyValue = extras.getInt("difficulty1");
	        	Log.d("lock",Values.difficultyValue+" : "+Values.difficultyValue);
	        	Values.sfxValue = extras.getInt("special1");
	        	Log.d("lock",Values.sfxValue+" : "+Values.sfxValue);
	        	Values.level = extras.getInt("level");*/
	        } 
		setContentView(av);
		av.invalidate();
		av.invalidate();
		
	}

}

//view class
class bfRelativeLout extends LinearLayout
{ 
  public bfRelativeLout(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		contxt1=context;
		win_const_code();
		this.setWillNotDraw(false);
		Log.d("af", this.getHeight()+":"+this.getWidth());
	}

  Context contxt1;
  LinearLayout ll;
  RelativeLayout rl;
  ImageView homeImv,settingImv,playImv,lock1Imv,lock2Imv,lock3Imv,lock4Imv,lock5Imv,lock6Imv,lock7Imv,lock8Imv,lock9Imv,
  lock10Imv,lock11Imv,lock12Imv,lock13Imv,lock14Imv,lock15Imv,lock16Imv,lock17Imv,lock18Imv,lock19Imv,lock20Imv,lock21Imv,lock22Imv,
  lock23Imv,lock24Imv,lock25Imv,lock26Imv,lock27Imv,lock28Imv,lock29Imv,lock30Imv,lock31Imv,lock32Imv,lock33Imv,lock34Imv,lock35Imv,
  lock36Imv;
  RelativeLayout.LayoutParams q_rlp,a1_rlp,a2_rlp,a3_rlp,a4_rlp;
  Paint p;
  int onD=0,height,width;
  boolean once=true;
  int i=1;
  private String tag;

	void win_const_code()
	{ 
	 this.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
     rl=new RelativeLayout(contxt1);
     rl.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.FILL_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT));
     Log.d("af",this.getHeight()+":"+this.getWidth()+"::"+rl.getHeight()+":"+rl.getWidth());
     this.setBackgroundResource(R.drawable.safe2);
     this.addView(rl);		
	}
	public void initialize()
	{  
		Log.d(tag, "hi");
		width=this.getWidth();
		height=this.getHeight();
	    Log.d("af","inliz: "+width+" : "+height);		
	    homeImv=new ImageView(contxt1);

	   homeImv.setImageResource(R.drawable.home2);  

	   homeImv.setAdjustViewBounds(true); 
	   RelativeLayout.LayoutParams hmImv_rlp=
               new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                       RelativeLayout.LayoutParams.WRAP_CONTENT);
	   hmImv_rlp.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
	   hmImv_rlp.addRule(RelativeLayout.ALIGN_PARENT_TOP, RelativeLayout.TRUE);
	   hmImv_rlp.leftMargin=width/10;
	   hmImv_rlp.topMargin=height/110;
	   hmImv_rlp.width=width/5;
	   hmImv_rlp.height=height/5;//adjusting h,w to screen h,w 
	   rl.addView(homeImv,hmImv_rlp);
	   homeImv.setOnClickListener(new View.OnClickListener() {
			
		
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(contxt1,HomeActivity.class);
				((Activity) contxt1).finish();
              contxt1.startActivity(i);
			}
		});
	
	  Values.scorel12=0;Values.score1=0;Values.score2=0;Values.score3=0;Values.score4=0; Values.score5=0;
	  Values.score6=0;Values.score7=0;Values.score8=0;Values.score9=0;Values.score10=0;
	  Values.score11=0; Values.score12=0;Values.score13=0;Values.score14=0;Values.score15=0;
	  Values.score16=0; Values.score17=0;Values.score18=0;Values.score19=0;Values.score20=0;
	  
	  
	  Values.click1=0;Values.click2=0;Values.click3=0;Values.click4=0;Values.click5=0;
      Values.click6=0;Values.click7=0;Values.click8=0;Values.click9=0;
	  Values.click10=0;Values.click11=0;Values.click12=0;Values.click13=0;Values.click14=0;Values.click15=0;
	  Values.click16=0;Values.click17=0;Values.click18=0;Values.click19=0;Values.click20=0;
	  
	 //lock1 image view
	   lock1Imv=new ImageView(contxt1);
	   lock1Imv.setImageResource(R.drawable.l1); 
	   lock1Imv.setAdjustViewBounds(true);
	    RelativeLayout.LayoutParams lock1Imv_rlp=
               new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
		                                        RelativeLayout.LayoutParams.WRAP_CONTENT);
	    lock1Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
	    lock1Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_TOP, RelativeLayout.TRUE);
	    lock1Imv_rlp.leftMargin=width/11;
	    lock1Imv_rlp.topMargin=(height/6)+10;
	    lock1Imv_rlp.width=width/7;
	    lock1Imv_rlp.height=height/7;//adjusting h,w to screen h,w
	    rl.addView(lock1Imv, lock1Imv_rlp);
	    lock1Imv.setOnClickListener(new View.OnClickListener() {
		       public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent i = new Intent(contxt1,Playlevel1Activity.class);

				((Activity) contxt1).finish();
                 contxt1.startActivity(i);
			}
		});
	 
	   lock2Imv=new ImageView(contxt1);
	   lock2Imv.setAdjustViewBounds(true);
	    RelativeLayout.LayoutParams lock2Imv_rlp=
              new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
		                                        RelativeLayout.LayoutParams.WRAP_CONTENT);
	    lock2Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
	    lock2Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_TOP, RelativeLayout.TRUE);
	    lock2Imv_rlp.leftMargin=2*lock1Imv_rlp.leftMargin+40;
	    lock2Imv_rlp.topMargin=(height/6)+10;
	    lock2Imv_rlp.width=width/7;
	    lock2Imv_rlp.height=height/7;//adjusting h,w to screen h,w
	    rl.addView(lock2Imv, lock2Imv_rlp);
        if( Values.level1cleared==0)
	       {
        
		   lock2Imv.setImageResource(R.drawable.l2);
		   lock2Imv.setOnClickListener(new View.OnClickListener() {
				

				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent i = new Intent(contxt1,Playlevel2Activity.class);
		
					((Activity) contxt1).finish();
	                 contxt1.startActivity(i);
				}
			});   
	   }
	   else
	   {   lock2Imv.setImageResource(R.drawable.lockenable);}

	
	  
	  
	   
	   lock3Imv=new ImageView(contxt1);
	   lock3Imv.setAdjustViewBounds(true);
	    RelativeLayout.LayoutParams lock3Imv_rlp=
               new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
		                                        RelativeLayout.LayoutParams.WRAP_CONTENT);
	    lock3Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
	    lock3Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_TOP, RelativeLayout.TRUE);
	    lock3Imv_rlp.leftMargin=lock2Imv_rlp.leftMargin+(lock2Imv_rlp.leftMargin-lock1Imv_rlp.leftMargin);
	    lock3Imv_rlp.topMargin=(height/6)+10;
	    lock3Imv_rlp.width=width/7;
	    lock3Imv_rlp.height=height/7;//adjusting h,w to screen h,w
	    rl.addView(lock3Imv, lock3Imv_rlp);

		   if( Values.level2cleared==0){
			
			   lock3Imv.setImageResource(R.drawable.l3);
			   lock3Imv.setOnClickListener(new View.OnClickListener() {
					

					public void onClick(View v) {
						// TODO Auto-generated method stub
						
						Intent i = new Intent(contxt1,Playlevel3Activity.class);
			
						((Activity) contxt1).finish();
		                 contxt1.startActivity(i);
					}
				});   
		   }
		   else
		   {   lock3Imv.setImageResource(R.drawable.lockenable);}
	    
	     
	       lock4Imv=new ImageView(contxt1);
	       lock4Imv.setAdjustViewBounds(true);
		    RelativeLayout.LayoutParams lock4Imv_rlp=
	               new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
			                                        RelativeLayout.LayoutParams.WRAP_CONTENT);
		    lock4Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
		    lock4Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_TOP, RelativeLayout.TRUE);
		    lock4Imv_rlp.leftMargin=lock3Imv_rlp.leftMargin+(lock3Imv_rlp.leftMargin-lock2Imv_rlp.leftMargin);
		    lock4Imv_rlp.topMargin=(height/6)+10;
		    lock4Imv_rlp.width=width/7;
		    lock4Imv_rlp.height=height/7;//adjusting h,w to screen h,w
		    rl.addView(lock4Imv, lock4Imv_rlp);
	
			   if( Values.level3cleared==0){
				   lock4Imv.setImageResource(R.drawable.l4);
				   lock4Imv.setOnClickListener(new View.OnClickListener() {
						

						public void onClick(View v) {
							// TODO Auto-generated method stub
							
							Intent i = new Intent(contxt1,Playlevel4Activity.class);
				
							((Activity) contxt1).finish();
			                 contxt1.startActivity(i);
						}
					});   
			   }
			   else
			   {   lock4Imv.setImageResource(R.drawable.lockenable);}
		    
		   
		   lock5Imv=new ImageView(contxt1);
		 
		   lock5Imv.setAdjustViewBounds(true);
		   RelativeLayout.LayoutParams lock5Imv_rlp=
		   new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
				                                        RelativeLayout.LayoutParams.WRAP_CONTENT);
		    lock5Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
		    lock5Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_TOP, RelativeLayout.TRUE);
		    lock5Imv_rlp.leftMargin=lock4Imv_rlp.leftMargin+(lock4Imv_rlp.leftMargin-lock3Imv_rlp.leftMargin);
		    lock5Imv_rlp.topMargin=(height/6)+10;
		    lock5Imv_rlp.width=width/7;
		    lock5Imv_rlp.height=height/7;//adjusting h,w to screen h,w
		    rl.addView(lock5Imv, lock5Imv_rlp);
		 
		
			   if( Values.level4cleared==0){
				   lock5Imv.setImageResource(R.drawable.l5);
				   lock5Imv.setOnClickListener(new View.OnClickListener() {
						

						public void onClick(View v) {
							// TODO Auto-generated method stub
							
							Intent i = new Intent(contxt1,Playlevel5Activity.class);
				
							((Activity) contxt1).finish();
			                 contxt1.startActivity(i);
						}
					});   
			   }
			   else
			   {   lock5Imv.setImageResource(R.drawable.lockenable);}
			    
		   
	         lock6Imv=new ImageView(contxt1);
			 lock6Imv.setAdjustViewBounds(true);
		    RelativeLayout.LayoutParams lock6Imv_rlp=
		               new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
				                                        RelativeLayout.LayoutParams.WRAP_CONTENT);
		    lock6Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
		    lock6Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_TOP, RelativeLayout.TRUE);
		    lock6Imv_rlp.leftMargin=width/11;
		    lock6Imv_rlp.topMargin=lock1Imv_rlp.topMargin+85;
		    lock6Imv_rlp.width=width/7;
		    lock6Imv_rlp.height=height/7;//adjusting h,w to screen h,w
		    rl.addView(lock6Imv, lock6Imv_rlp);
		    if( Values.level5cleared==0){
				   lock6Imv.setImageResource(R.drawable.l6);
				   lock6Imv.setOnClickListener(new View.OnClickListener() {
						

						public void onClick(View v) {
							// TODO Auto-generated method stub
							
							Intent i = new Intent(contxt1,Playlevel6Activity.class);
				
							((Activity) contxt1).finish();
			                 contxt1.startActivity(i);
						}
					});   
			   }
			   else
			   {   lock6Imv.setImageResource(R.drawable.lockenable);}

		    
		    
		    
		    lock7Imv=new ImageView(contxt1);
			   //   lock7Imv.setId(93);		 
	  
		       lock7Imv=new ImageView(contxt1);
			   lock7Imv.setAdjustViewBounds(true);
			    RelativeLayout.LayoutParams lock7Imv_rlp=
		               new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
				                                        RelativeLayout.LayoutParams.WRAP_CONTENT);
			    lock7Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
			    lock7Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_TOP, RelativeLayout.TRUE);
			    lock7Imv_rlp.leftMargin=2*lock1Imv_rlp.leftMargin+40;
			    lock7Imv_rlp.topMargin=lock1Imv_rlp.topMargin+85;
			    lock7Imv_rlp.width=width/7;
			    lock7Imv_rlp.height=height/7;//adjusting h,w to screen h,w
			    rl.addView(lock7Imv, lock7Imv_rlp);
			    if(Values.level6cleared==0)
			    {

			     lock7Imv.setImageResource(R.drawable.l7);
			     lock7Imv.setOnClickListener(new View.OnClickListener() {
					

					public void onClick(View v) {
						// TODO Auto-generated method stub
			
						
						Intent i = new Intent(contxt1,Playlevel7Activity.class);

						((Activity) contxt1).finish();
		                 contxt1.startActivity(i);
					}
				});
			    } 
			    else
			    { lock7Imv.setImageResource(R.drawable.lockenable); }
			    
			   
			       lock8Imv=new ImageView(contxt1);
				   lock8Imv.setAdjustViewBounds(true);
				    RelativeLayout.LayoutParams lock8Imv_rlp=
			               new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
					                                        RelativeLayout.LayoutParams.WRAP_CONTENT);
				    lock8Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
				    lock8Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_TOP, RelativeLayout.TRUE);
				    lock8Imv_rlp.leftMargin=lock2Imv_rlp.leftMargin+(lock2Imv_rlp.leftMargin-lock1Imv_rlp.leftMargin);
				    lock8Imv_rlp.topMargin=lock1Imv_rlp.topMargin+85;
				    lock8Imv_rlp.width=width/7;
				    lock8Imv_rlp.height=height/7;//adjusting h,w to screen h,w
				    rl.addView(lock8Imv, lock8Imv_rlp);

				    if(Values.level7cleared==0)
				    {

				     lock8Imv.setImageResource(R.drawable.l8);
				     lock8Imv.setOnClickListener(new View.OnClickListener() {
						

						public void onClick(View v) {
							// TODO Auto-generated method stub
							
							Intent i = new Intent(contxt1,Playlevel8Activity.class);

							((Activity) contxt1).finish();
			                 contxt1.startActivity(i);
						}
					});
				    }  
				    else
				    { lock8Imv.setImageResource(R.drawable.lockenable); }
			
		

				    
		       lock9Imv=new ImageView(contxt1);
	           lock9Imv.setAdjustViewBounds(true);
			    RelativeLayout.LayoutParams lock9Imv_rlp=
				               new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
						                                        RelativeLayout.LayoutParams.WRAP_CONTENT);
			    lock9Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
			    lock9Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_TOP, RelativeLayout.TRUE);
			    lock9Imv_rlp.leftMargin=lock3Imv_rlp.leftMargin+(lock3Imv_rlp.leftMargin-lock2Imv_rlp.leftMargin);
			    lock9Imv_rlp.topMargin=lock1Imv_rlp.topMargin+85;
			    lock9Imv_rlp.width=width/7;
			    lock9Imv_rlp.height=height/7;//adjusting h,w to screen h,w
			    rl.addView(lock9Imv, lock9Imv_rlp);
			    if(Values.level8cleared==0)
			    {

			     lock9Imv.setImageResource(R.drawable.l9);
			     lock9Imv.setOnClickListener(new View.OnClickListener() {
					

					public void onClick(View v) {
						// TODO Auto-generated method stub
						
						Intent i = new Intent(contxt1,Playlevel9Activity.class);

						((Activity) contxt1).finish();
		                 contxt1.startActivity(i);
					}
				});
			    }
			    else
			          lock9Imv.setImageResource(R.drawable.lockenable); 
			    
			    
		/////////////////////////////////////////////////////
	

			       lock10Imv=new ImageView(contxt1);
		           lock10Imv.setAdjustViewBounds(true);
				    RelativeLayout.LayoutParams lock10Imv_rlp=
					               new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
							                                        RelativeLayout.LayoutParams.WRAP_CONTENT);
				    lock10Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
				    lock10Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_TOP, RelativeLayout.TRUE);
				    lock10Imv_rlp.leftMargin=lock4Imv_rlp.leftMargin+(lock4Imv_rlp.leftMargin-lock3Imv_rlp.leftMargin);
				    lock10Imv_rlp.topMargin=lock1Imv_rlp.topMargin+85;
				    lock10Imv_rlp.width=width/7;
				    lock10Imv_rlp.height=height/7;//adjusting h,w to screen h,w
				    rl.addView(lock10Imv, lock10Imv_rlp);
				    if(Values.level9cleared==0)
				    {

				     lock10Imv.setImageResource(R.drawable.l10);
				     lock10Imv.setOnClickListener(new View.OnClickListener() {
						

						public void onClick(View v) {
							// TODO Auto-generated method stub
							
							Intent i = new Intent(contxt1,Playlevel10Activity.class);

							((Activity) contxt1).finish();
			                 contxt1.startActivity(i);
						}
					});
				    }
				    else
				          lock10Imv.setImageResource(R.drawable.lockenable); 
				    
				    
				    lock11Imv=new ImageView(contxt1);
					//  lock6Imv.setId(93);		 
	   			    lock11Imv.setImageResource(R.drawable.lockenable); 
	   			    lock11Imv.setAdjustViewBounds(true);
								   RelativeLayout.LayoutParams lock11Imv_rlp=
							               new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
									                                        RelativeLayout.LayoutParams.WRAP_CONTENT);
				    lock11Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
				    lock11Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_TOP, RelativeLayout.TRUE);
				    lock11Imv_rlp.leftMargin=width/11;
				    lock11Imv_rlp.topMargin=lock6Imv_rlp.topMargin+85;
				    lock11Imv_rlp.width=width/7;
				    lock11Imv_rlp.height=height/7;//adjusting h,w to screen h,w
				    rl.addView(lock11Imv, lock11Imv_rlp);
				      
				      /* lock11Imv=new ImageView(contxt1);
			           lock11Imv.setAdjustViewBounds(true);
					    RelativeLayout.LayoutParams lock11Imv_rlp=
						               new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
								                                        RelativeLayout.LayoutParams.WRAP_CONTENT);
					    lock11Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
					    lock11Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_TOP, RelativeLayout.TRUE);
					    lock11Imv_rlp.leftMargin=lock3Imv_rlp.leftMargin+(lock3Imv_rlp.leftMargin-lock2Imv_rlp.leftMargin);
					    lock11Imv_rlp.topMargin=lock1Imv_rlp.topMargin+85;
					    lock11Imv_rlp.width=width/7;
					    lock11Imv_rlp.height=height/7;//adjusting h,w to screen h,w
					    rl.addView(lock11Imv, lock11Imv_rlp);*/
					   if(Values.level10cleared==0)
					    {

					     lock11Imv.setImageResource(R.drawable.l11);
					     lock11Imv.setOnClickListener(new View.OnClickListener() {
							

							public void onClick(View v) {
								// TODO Auto-generated method stub
								
								Intent i = new Intent(contxt1,playlevel11.class);

								((Activity) contxt1).finish();
				                 contxt1.startActivity(i);
							}
						});
					    }
					  else
					     lock11Imv.setImageResource(R.drawable.lockenable); 
					    
					       lock12Imv=new ImageView(contxt1);
					       lock12Imv.setImageResource(R.drawable.lockenable); 
					       lock12Imv.setAdjustViewBounds(true);
						    RelativeLayout.LayoutParams lock12Imv_rlp=
										               new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
												                                        RelativeLayout.LayoutParams.WRAP_CONTENT);
						    lock12Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
						    lock12Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_TOP, RelativeLayout.TRUE);
						    lock12Imv_rlp.leftMargin=2*lock1Imv_rlp.leftMargin+40;
						    lock12Imv_rlp.topMargin=lock6Imv_rlp.topMargin+85;
				    	    lock12Imv_rlp.width=width/7;
							lock12Imv_rlp.height=height/7;//adjusting h,w to screen h,w
						    rl.addView(lock12Imv, lock12Imv_rlp);
					       
						   /* lock12Imv=new ImageView(contxt1);
				            lock12Imv.setAdjustViewBounds(true);
						    RelativeLayout.LayoutParams lock12Imv_rlp=
							               new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
									                                        RelativeLayout.LayoutParams.WRAP_CONTENT);
						    lock12Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
						    lock12Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_TOP, RelativeLayout.TRUE);
						    lock12Imv_rlp.leftMargin=lock3Imv_rlp.leftMargin+(lock3Imv_rlp.leftMargin-lock2Imv_rlp.leftMargin);
						    lock12Imv_rlp.topMargin=lock1Imv_rlp.topMargin+85;
						    lock12Imv_rlp.width=width/7;
						    lock12Imv_rlp.height=height/7;//adjusting h,w to screen h,w
						    rl.addView(lock12Imv, lock12Imv_rlp);*/
						    if(Values.level11cleared==0)
						    {

						     lock12Imv.setImageResource(R.drawable.l12);
						     lock12Imv.setOnClickListener(new View.OnClickListener() {
								

								public void onClick(View v) {
									// TODO Auto-generated method stub
									
									Intent i = new Intent(contxt1,Playlevel12.class);

									((Activity) contxt1).finish();
					                 contxt1.startActivity(i);
								}
							});
						    }
						    else
						          lock12Imv.setImageResource(R.drawable.lockenable); 
							    
						    lock13Imv=new ImageView(contxt1);
							//   lock8Imv.setId(93);		 
						    lock13Imv.setImageResource(R.drawable.lockenable); 
						    lock13Imv.setAdjustViewBounds(true);
						    RelativeLayout.LayoutParams lock13Imv_rlp=
									               new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
											                                        RelativeLayout.LayoutParams.WRAP_CONTENT);
						    lock13Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
						    lock13Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_TOP, RelativeLayout.TRUE);
						    lock13Imv_rlp.leftMargin=lock2Imv_rlp.leftMargin+(lock2Imv_rlp.leftMargin-lock1Imv_rlp.leftMargin);
						    lock13Imv_rlp.topMargin=lock6Imv_rlp.topMargin+85;
						    lock13Imv_rlp.width=width/7;
						    lock13Imv_rlp.height=height/7;//adjusting h,w to screen h,w
						    rl.addView(lock13Imv, lock13Imv_rlp);
						       /*lock13Imv=new ImageView(contxt1);
					           lock13Imv.setAdjustViewBounds(true);
							    RelativeLayout.LayoutParams lock13Imv_rlp=
								               new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
										                                        RelativeLayout.LayoutParams.WRAP_CONTENT);
							    lock13Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
							    lock13Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_TOP, RelativeLayout.TRUE);
							    lock13Imv_rlp.leftMargin=lock3Imv_rlp.leftMargin+(lock3Imv_rlp.leftMargin-lock2Imv_rlp.leftMargin);
							    lock13Imv_rlp.topMargin=lock1Imv_rlp.topMargin+85;
							    lock13Imv_rlp.width=width/7;
							    lock13Imv_rlp.height=height/7;//adjusting h,w to screen h,w
							    rl.addView(lock13Imv, lock13Imv_rlp);*/
							    if(Values.level12cleared==0)
							    {

							     lock13Imv.setImageResource(R.drawable.l13);
							     lock13Imv.setOnClickListener(new View.OnClickListener() {
									

									public void onClick(View v) {
										// TODO Auto-generated method stub
										
										Intent i = new Intent(contxt1,Playlevel13.class);

										((Activity) contxt1).finish();
						                 contxt1.startActivity(i);
									}
								});
							    }
							    else
							          lock13Imv.setImageResource(R.drawable.lockenable); 
								    
							    lock14Imv=new ImageView(contxt1);
								//   lock9Imv.setId(93);		 
							    lock14Imv.setImageResource(R.drawable.lockenable); 
							    lock14Imv.setAdjustViewBounds(true);
							    RelativeLayout.LayoutParams lock14Imv_rlp=
							               new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
									                                        RelativeLayout.LayoutParams.WRAP_CONTENT);
							    lock14Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
							    lock14Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_TOP, RelativeLayout.TRUE);
							    lock14Imv_rlp.leftMargin=lock3Imv_rlp.leftMargin+(lock3Imv_rlp.leftMargin-lock2Imv_rlp.leftMargin);
							    lock14Imv_rlp.topMargin=lock6Imv_rlp.topMargin+85;
							    lock14Imv_rlp.width=width/7;
							    lock14Imv_rlp.height=height/7;//adjusting h,w to screen h,w
							    rl.addView(lock14Imv, lock14Imv_rlp);
								    if(Values.level13cleared==0)
								    {

								     lock14Imv.setImageResource(R.drawable.l14);
								     lock14Imv.setOnClickListener(new View.OnClickListener() {
										

										public void onClick(View v) {
											// TODO Auto-generated method stub
											
											Intent i = new Intent(contxt1,Playlevel14.class);

											((Activity) contxt1).finish();
							                 contxt1.startActivity(i);
										}
									});
								    }
								    else
								          lock14Imv.setImageResource(R.drawable.lockenable); 
									    
								    lock15Imv=new ImageView(contxt1);
									 //  lock5Imv.setId(93);		 
								    lock15Imv.setImageResource(R.drawable.lockenable); 
								    lock15Imv.setAdjustViewBounds(true);
								    RelativeLayout.LayoutParams lock15Imv_rlp=
														               new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
																                                        RelativeLayout.LayoutParams.WRAP_CONTENT);
								    lock15Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
								    lock15Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_TOP, RelativeLayout.TRUE);
								    lock15Imv_rlp.leftMargin=lock4Imv_rlp.leftMargin+(lock4Imv_rlp.leftMargin-lock3Imv_rlp.leftMargin);
								    lock15Imv_rlp.topMargin=lock6Imv_rlp.topMargin+85;
								    lock15Imv_rlp.width=width/7;
								    lock15Imv_rlp.height=height/7;//adjusting h,w to screen h,w
								    rl.addView(lock15Imv, lock15Imv_rlp);
									    if(Values.level14cleared==0)
									    {

									     lock15Imv.setImageResource(R.drawable.l15);
									     lock15Imv.setOnClickListener(new View.OnClickListener() {
											

											public void onClick(View v) {
												// TODO Auto-generated method stub
												
												Intent i = new Intent(contxt1,Playlevel14.class);

												((Activity) contxt1).finish();
								                 contxt1.startActivity(i);
											}
										});
									    }
									    else
									          lock15Imv.setImageResource(R.drawable.lockenable); 
										    
									    lock16Imv=new ImageView(contxt1);
						
									    lock16Imv.setAdjustViewBounds(true);
									   RelativeLayout.LayoutParams lock16Imv_rlp=
																               new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
																		                                        RelativeLayout.LayoutParams.WRAP_CONTENT);
									    lock16Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
									    lock16Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_TOP, RelativeLayout.TRUE);
									    lock16Imv_rlp.leftMargin=width/11;
									    lock16Imv_rlp.topMargin=lock11Imv_rlp.topMargin+85;
									    lock16Imv_rlp.width=width/7;
									    lock16Imv_rlp.height=height/7;//adjusting h,w to screen h,w
									    rl.addView(lock16Imv, lock16Imv_rlp);
									    if(Values.level15cleared==0)
									    {

									     lock16Imv.setImageResource(R.drawable.l16);
									     lock16Imv.setOnClickListener(new View.OnClickListener() {
											

											public void onClick(View v) {
												// TODO Auto-generated method stub
												
												Intent i = new Intent(contxt1,Playlevel16Activity.class);

												((Activity) contxt1).finish();
								                 contxt1.startActivity(i);
											}
										});
									    }
									    else
									          lock16Imv.setImageResource(R.drawable.lockenable); 
										    
									    
									    
																	   
									   lock17Imv=new ImageView(contxt1);
									
									   lock17Imv.setAdjustViewBounds(true);
									    RelativeLayout.LayoutParams lock17Imv_rlp=
																               new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
																		                                        RelativeLayout.LayoutParams.WRAP_CONTENT);
									    lock17Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
									    lock17Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_TOP, RelativeLayout.TRUE);
									    lock17Imv_rlp.leftMargin=2*lock1Imv_rlp.leftMargin+40;
									    lock17Imv_rlp.topMargin=lock11Imv_rlp.topMargin+85;
									    lock17Imv_rlp.width=width/7;
									    lock17Imv_rlp.height=height/7;//adjusting h,w to screen h,w
									    rl.addView(lock17Imv, lock17Imv_rlp);
									    if(Values.level16cleared==0)
									    {

									     lock17Imv.setImageResource(R.drawable.l17);
									     lock17Imv.setOnClickListener(new View.OnClickListener() {
											

											public void onClick(View v) {
												// TODO Auto-generated method stub
												
												Intent i = new Intent(contxt1,Playlevel17Activity.class);

												((Activity) contxt1).finish();
								                 contxt1.startActivity(i);
											}
										});
									    }
									    else
									          lock17Imv.setImageResource(R.drawable.lockenable); 
										    
																	   
									   lock18Imv=new ImageView(contxt1);
									   lock18Imv.setAdjustViewBounds(true);
									   RelativeLayout.LayoutParams lock18Imv_rlp=
										   new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
																		                                        RelativeLayout.LayoutParams.WRAP_CONTENT);
									    lock18Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
									    lock18Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_TOP, RelativeLayout.TRUE);
									    lock18Imv_rlp.leftMargin=lock2Imv_rlp.leftMargin+(lock2Imv_rlp.leftMargin-lock1Imv_rlp.leftMargin);
									    lock18Imv_rlp.topMargin=lock11Imv_rlp.topMargin+85;
									    lock18Imv_rlp.width=width/7;
									    lock18Imv_rlp.height=height/7;//adjusting h,w to screen h,w
									    rl.addView(lock18Imv, lock18Imv_rlp);
									    if(Values.level17cleared==0)
									    {

									     lock18Imv.setImageResource(R.drawable.l18);
									     lock18Imv.setOnClickListener(new View.OnClickListener() {
											

											public void onClick(View v) {
												// TODO Auto-generated method stub
												
												Intent i = new Intent(contxt1,Playlevel18Activity.class);

												((Activity) contxt1).finish();
								                 contxt1.startActivity(i);
											}
										});
									    }
									    else
									          lock18Imv.setImageResource(R.drawable.lockenable); 
										    							    
									    lock19Imv=new ImageView(contxt1);
				
									   lock19Imv.setAdjustViewBounds(true);
									    RelativeLayout.LayoutParams lock19Imv_rlp=
															               new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
																			                                        RelativeLayout.LayoutParams.WRAP_CONTENT);
									    lock19Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
									    lock19Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_TOP, RelativeLayout.TRUE);
									    lock19Imv_rlp.leftMargin=lock3Imv_rlp.leftMargin+(lock3Imv_rlp.leftMargin-lock2Imv_rlp.leftMargin);
									    lock19Imv_rlp.topMargin=lock11Imv_rlp.topMargin+85;
									    lock19Imv_rlp.width=width/7;
									    lock19Imv_rlp.height=height/7;//adjusting h,w to screen h,w
									    rl.addView(lock19Imv, lock19Imv_rlp);
									    if(Values.level18cleared==0)
									    {

									     lock19Imv.setImageResource(R.drawable.l19);
									     lock19Imv.setOnClickListener(new View.OnClickListener() {
											

											public void onClick(View v) {
												// TODO Auto-generated method stub
												
												Intent i = new Intent(contxt1,Playlevel19Activity.class);

												((Activity) contxt1).finish();
								                 contxt1.startActivity(i);
											}
										});
									    }
									    else
									          lock19Imv.setImageResource(R.drawable.lockenable); 
										    
																		    		
									    lock20Imv=new ImageView(contxt1);
										 //  lock5Imv.setId(93);		 
									   lock20Imv.setImageResource(R.drawable.lockenable); 
									   lock20Imv.setAdjustViewBounds(true);
									   RelativeLayout.LayoutParams lock20Imv_rlp=
																		               new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
																				                                        RelativeLayout.LayoutParams.WRAP_CONTENT);
									    lock20Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
									    lock20Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_TOP, RelativeLayout.TRUE);
									    lock20Imv_rlp.leftMargin=lock4Imv_rlp.leftMargin+(lock4Imv_rlp.leftMargin-lock3Imv_rlp.leftMargin);
									    lock20Imv_rlp.topMargin=lock11Imv_rlp.topMargin+85;
								     lock20Imv_rlp.width=width/7;
										  lock20Imv_rlp.height=height/7;//adjusting h,w to screen h,w
									    rl.addView(lock20Imv, lock20Imv_rlp);
									    if(Values.level19cleared==0)
									    {

									     lock20Imv.setImageResource(R.drawable.l20);
									     lock20Imv.setOnClickListener(new View.OnClickListener() {
											

											public void onClick(View v) {
												// TODO Auto-generated method stub
												
												Intent i = new Intent(contxt1,Playlevel20Activity.class);

												((Activity) contxt1).finish();
								                 contxt1.startActivity(i);
											}
										});
									    }
									    else
									          lock20Imv.setImageResource(R.drawable.lockenable); 
										    									 
																			    
									    lock21Imv=new ImageView(contxt1);
										//  lock6Imv.setId(93);		 
									    lock21Imv.setImageResource(R.drawable.lockenable); 
								    	  lock21Imv.setAdjustViewBounds(true);
									   RelativeLayout.LayoutParams lock21Imv_rlp=
																			               new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
																					                                        RelativeLayout.LayoutParams.WRAP_CONTENT);
								    lock21Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
								    lock21Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_TOP, RelativeLayout.TRUE);
								    lock21Imv_rlp.leftMargin=width/11;
								    lock21Imv_rlp.topMargin=lock16Imv_rlp.topMargin+85;
								    lock21Imv_rlp.width=width/7;
								    lock21Imv_rlp.height=height/7;//adjusting h,w to screen h,w
								    rl.addView(lock21Imv, lock21Imv_rlp);
								    if(Values.level20cleared==0)
								    {

								     lock21Imv.setImageResource(R.drawable.l21);
								     lock21Imv.setOnClickListener(new View.OnClickListener() {
										

										public void onClick(View v) {
											// TODO Auto-generated method stub
											
											Intent i = new Intent(contxt1,Playlevel2Activity.class);

											((Activity) contxt1).finish();
							                 contxt1.startActivity(i);
										}
									});
								    }
								    else
								          lock21Imv.setImageResource(R.drawable.lockenable); 	
								    
								    lock22Imv=new ImageView(contxt1);
																				//   lock7Imv.setId(93);		 
								    lock22Imv.setImageResource(R.drawable.lockenable); 
								    lock22Imv.setAdjustViewBounds(true);
								    RelativeLayout.LayoutParams lock22Imv_rlp=
																			               new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
																					                                        RelativeLayout.LayoutParams.WRAP_CONTENT);
								    lock22Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
								    lock22Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_TOP, RelativeLayout.TRUE);
								    lock22Imv_rlp.leftMargin=2*lock1Imv_rlp.leftMargin+40;
								    lock22Imv_rlp.topMargin=lock16Imv_rlp.topMargin+85;
								    lock22Imv_rlp.width=width/7;
								    lock22Imv_rlp.height=height/7;//adjusting h,w to screen h,w
								    rl.addView(lock22Imv, lock22Imv_rlp);
																				   
								   lock23Imv=new ImageView(contxt1);
								//   lock8Imv.setId(93);		 
								   lock23Imv.setImageResource(R.drawable.lockenable); 
								   lock23Imv.setAdjustViewBounds(true);
							       RelativeLayout.LayoutParams lock23Imv_rlp=
																			               new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
																					                                        RelativeLayout.LayoutParams.WRAP_CONTENT);
								    lock23Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
								    lock23Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_TOP, RelativeLayout.TRUE);
								    lock23Imv_rlp.leftMargin=lock2Imv_rlp.leftMargin+(lock2Imv_rlp.leftMargin-lock1Imv_rlp.leftMargin);
								    lock23Imv_rlp.topMargin=lock16Imv_rlp.topMargin+85;
								    lock23Imv_rlp.width=width/7;
								    lock23Imv_rlp.height=height/7;//adjusting h,w to screen h,w
								    rl.addView(lock23Imv, lock23Imv_rlp);
																				    
								    lock24Imv=new ImageView(contxt1);
									//   lock9Imv.setId(93);		 
								    lock24Imv.setImageResource(R.drawable.lockenable); 
								   lock24Imv.setAdjustViewBounds(true);
								    RelativeLayout.LayoutParams lock24Imv_rlp=
																				               new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
																						                                        RelativeLayout.LayoutParams.WRAP_CONTENT);
								    lock24Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
								    lock24Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_TOP, RelativeLayout.TRUE);
								    lock24Imv_rlp.leftMargin=lock3Imv_rlp.leftMargin+(lock3Imv_rlp.leftMargin-lock2Imv_rlp.leftMargin);
								    lock24Imv_rlp.topMargin=lock16Imv_rlp.topMargin+85;
								    lock24Imv_rlp.width=width/7;
									lock24Imv_rlp.height=height/7;//adjusting h,w to screen h,w
									rl.addView(lock24Imv, lock24Imv_rlp);
																					    
								    lock25Imv=new ImageView(contxt1);
								    //  lock5Imv.setId(93);		 
								   lock25Imv.setImageResource(R.drawable.lockenable); 
								   lock25Imv.setAdjustViewBounds(true);
							       RelativeLayout.LayoutParams lock25Imv_rlp=
																					               new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
																							                                        RelativeLayout.LayoutParams.WRAP_CONTENT);
								    lock25Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
							        lock25Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_TOP, RelativeLayout.TRUE);
								    lock25Imv_rlp.leftMargin=lock4Imv_rlp.leftMargin+(lock4Imv_rlp.leftMargin-lock3Imv_rlp.leftMargin);
								    lock25Imv_rlp.topMargin=lock16Imv_rlp.topMargin+85;
								    lock25Imv_rlp.width=width/7;
								    lock25Imv_rlp.height=height/7;//adjusting h,w to screen h,w
								    rl.addView(lock25Imv, lock25Imv_rlp);
									
																						    
								    lock26Imv=new ImageView(contxt1);
									//  lock6Imv.setId(93);		 
								  lock26Imv.setImageResource(R.drawable.lockenable); 
								  lock26Imv.setAdjustViewBounds(true);
								  RelativeLayout.LayoutParams lock26Imv_rlp=
																						               new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
																								                                        RelativeLayout.LayoutParams.WRAP_CONTENT);
							    lock26Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
							    lock26Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_TOP, RelativeLayout.TRUE);
							    lock26Imv_rlp.leftMargin=width/11;
							    lock26Imv_rlp.topMargin=lock21Imv_rlp.topMargin+85;
							    lock26Imv_rlp.width=width/7;
							    lock26Imv_rlp.height=height/7;//adjusting h,w to screen h,w
							    rl.addView(lock26Imv, lock26Imv_rlp);
																							   
							    lock27Imv=new ImageView(contxt1);
								//   lock7Imv.setId(93);		 
							  lock27Imv.setImageResource(R.drawable.lockenable); 
							  lock27Imv.setAdjustViewBounds(true);
							  RelativeLayout.LayoutParams lock27Imv_rlp=
							  new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
																								                                        RelativeLayout.LayoutParams.WRAP_CONTENT);
							  lock27Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
							  lock27Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_TOP, RelativeLayout.TRUE);
							  lock27Imv_rlp.leftMargin=2*lock1Imv_rlp.leftMargin+40;
							  lock27Imv_rlp.topMargin=lock21Imv_rlp.topMargin+85;
							  lock27Imv_rlp.width=width/7;
							  lock27Imv_rlp.height=height/7;//adjusting h,w to screen h,w
							  rl.addView(lock27Imv, lock27Imv_rlp);
																							   
							   lock28Imv=new ImageView(contxt1);
								//   lock8Imv.setId(93);		 
							   lock28Imv.setImageResource(R.drawable.lockenable); 
							   lock28Imv.setAdjustViewBounds(true);
							   RelativeLayout.LayoutParams lock28Imv_rlp=
															               new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
																				                          RelativeLayout.LayoutParams.WRAP_CONTENT);
							   lock28Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
							   lock28Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_TOP, RelativeLayout.TRUE);
							   lock28Imv_rlp.leftMargin=lock2Imv_rlp.leftMargin+(lock2Imv_rlp.leftMargin-lock1Imv_rlp.leftMargin);
							   lock28Imv_rlp.topMargin=lock21Imv_rlp.topMargin+85;
							   lock28Imv_rlp.width=width/7;
							   lock28Imv_rlp.height=height/7;//adjusting h,w to screen h,w
							   rl.addView(lock28Imv, lock28Imv_rlp);
																							    
								lock29Imv=new ImageView(contxt1);
								//   lock9Imv.setId(93);		 
							   lock29Imv.setImageResource(R.drawable.lockenable); 
							   lock29Imv.setAdjustViewBounds(true);
							   RelativeLayout.LayoutParams lock29Imv_rlp=
													         new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
																                                        RelativeLayout.LayoutParams.WRAP_CONTENT);
								lock29Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
								lock29Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_TOP, RelativeLayout.TRUE);
								lock29Imv_rlp.leftMargin=lock3Imv_rlp.leftMargin+(lock3Imv_rlp.leftMargin-lock2Imv_rlp.leftMargin);
							    lock29Imv_rlp.topMargin=lock21Imv_rlp.topMargin+85;
								lock29Imv_rlp.width=width/7;
							    lock29Imv_rlp.height=height/7;//adjusting h,w to screen h,w
							    rl.addView(lock29Imv, lock29Imv_rlp);
																								    
							    lock30Imv=new ImageView(contxt1);
							    //  lock5Imv.setId(93);		 
							    lock30Imv.setImageResource(R.drawable.lockenable); 
							    lock30Imv.setAdjustViewBounds(true);
								RelativeLayout.LayoutParams lock30Imv_rlp=
																								               new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
																										                                        RelativeLayout.LayoutParams.WRAP_CONTENT);
								lock30Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
								lock30Imv_rlp.addRule(RelativeLayout.ALIGN_PARENT_TOP, RelativeLayout.TRUE);
								lock30Imv_rlp.leftMargin=lock4Imv_rlp.leftMargin+(lock4Imv_rlp.leftMargin-lock3Imv_rlp.leftMargin);
								lock30Imv_rlp.topMargin=lock21Imv_rlp.topMargin+85;
								lock30Imv_rlp.width=width/7;
								lock30Imv_rlp.height=height/7;//adjusting h,w to screen h,w
								rl.addView(lock30Imv, lock30Imv_rlp);
		
				
	// Setting imageview
    settingImv=new ImageView(contxt1);
	settingImv.setId(91);		 
	settingImv.setImageResource(R.drawable.setting1); 
	settingImv.setAdjustViewBounds(true);
 //  settingImv.setAlpha(0);
	 RelativeLayout.LayoutParams setImv_rlp=
					new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
					                                 RelativeLayout.LayoutParams.WRAP_CONTENT);
	setImv_rlp.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
	setImv_rlp.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, RelativeLayout.TRUE);
	setImv_rlp.topMargin=lock26Imv_rlp.topMargin+85;
	setImv_rlp.leftMargin=width/10;
	setImv_rlp.width=width/5;
	setImv_rlp.height=height/5;
	Log.d("af","rl: "+rl.getWidth()+" : "+rl.getHeight());
    rl.addView(settingImv, setImv_rlp); 
	settingImv.setOnClickListener(new View.OnClickListener() {

		public void onClick(View v) {
						// TODO Auto-generated method stub
				Intent i = new Intent(contxt1,SettingsActivity.class);
				((Activity) contxt1).finish();
				contxt1.startActivity(i);
	}
});
																			
	// playimage view
   playImv=new ImageView(contxt1);
	playImv.setId(92);		 
	playImv.setImageResource(R.drawable.play1);
	playImv.setAdjustViewBounds(true);
	RelativeLayout.LayoutParams playImv_rlp=
					new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
												RelativeLayout.LayoutParams.WRAP_CONTENT);
	playImv_rlp.addRule(RelativeLayout.ALIGN_PARENT_RIGHT, RelativeLayout.TRUE);
    playImv_rlp.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, RelativeLayout.TRUE);
	playImv_rlp.topMargin=lock26Imv_rlp.topMargin+85;
	playImv_rlp.rightMargin=width/10;
	playImv_rlp.width=width/5; 
	playImv_rlp.height=height/5;//adjusting h,w to screen h,w
	rl.addView(playImv, playImv_rlp);
	playImv.setOnClickListener(new View.OnClickListener() {
	public void onClick(View v) {
              // TODO Auto-generated method stub
			Intent i = new Intent(contxt1,Playlevel6Activity.class);
			((Activity) contxt1).finish();
			contxt1.startActivity(i);
	    }
    });
	    
	rl.invalidate();
	this.invalidate();
	}
	@Override
		public boolean onTouchEvent(MotionEvent event) {
			// TODO Auto-generated method stub
									
			Log.d("af",(int)event.getRawX()+" : "+(int)event.getRawY());
			Log.d("af","rl: "+rl.getWidth()+" : "+rl.getHeight());
			
			return super.onTouchEvent(event);
		}
	
	@Override
		protected void onDraw(Canvas canvas)// call setWillNotDraw(false) fuction in consructor
	{
			// TODO Auto-generated method stub
			super.onDraw(canvas);
			onD++;
			if(once){
				initialize();
				once=false;
			}
			Log.d("af","onD:"+onD+": "+this.getHeight()+":"+this.getWidth()+"::"+rl.getHeight()+":"+rl.getWidth());
			Log.d("af","onD:"+onD+": "+this.getHeight()+":"+this.getWidth());
		}
	
	 
}	
	
	

