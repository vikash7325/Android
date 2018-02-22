package com.org.proj;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class IncorrectsolutionActivity extends Activity{
	Button home,retry,solve;
	String Tag="clicked";
	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.incorrectsolution_screen);
      //  final MediaPlayer buttonSound=MediaPlayer.create(this,R.raw.button_1);
    //    MediaPlayer mp=MediaPlayer.create(this,R.raw.iron_man);
    //    mp.start();
        String tag1="scoreinincorrect";
		   Log.d(tag1, " "+Values.score11);
        home=(Button)findViewById(R.id.hmeincorrect);
        home.setBackgroundColor(Color.TRANSPARENT);
        home.setOnClickListener(new OnClickListener() {
       		
       		public void onClick(View v) {
       			// TODO Auto-generated method stub
       			Intent i=new Intent(IncorrectsolutionActivity.this,HomeActivity.class);
       			finish();
       			startActivity(i);
       			//buttonSound.start();
       		}
       	});
        retry=(Button)findViewById(R.id.losser2);
        retry.setBackgroundColor(Color.TRANSPARENT);
        
        
        if(Values.clicked==1)
        		retry.setOnClickListener(new OnClickListener() {
        	
        	
        			public void onClick(View v) {
        				// TODO Auto-generated method stub
        				Intent i=new Intent(IncorrectsolutionActivity.this,Playlevel1Activity.class);
        				finish();
        				startActivity(i);
        				//buttonSound.start();
        		}
        		});
        else if(Values.clicked==2){
        	 retry.setOnClickListener(new OnClickListener() {
            	
            	
    			public void onClick(View v) {
    				// TODO Auto-generated method stub
    				Intent i=new Intent(IncorrectsolutionActivity.this,Playlevel2Activity.class);
    				finish();
    				startActivity(i);
    				//buttonSound.start();
    		}
    		});
        }
        else if(Values.clicked==3){
       	 retry.setOnClickListener(new OnClickListener() {
           	
           	
   			public void onClick(View v) {
   				// TODO Auto-generated method stub
   				Intent i=new Intent(IncorrectsolutionActivity.this,Playlevel3Activity.class);finish();
   				startActivity(i);
   				//buttonSound.start();
   		}
   		});
       }
        else if(Values.clicked==4){
       	 retry.setOnClickListener(new OnClickListener() {
           	
           	
   			public void onClick(View v) {
   				// TODO Auto-generated method stub
   				Intent i=new Intent(IncorrectsolutionActivity.this,Playlevel4Activity.class);finish();
   				startActivity(i);
   				//buttonSound.start();
   		}
   		});
       }
        else if(Values.clicked==5){
       	 retry.setOnClickListener(new OnClickListener() {
           	
           	
   			public void onClick(View v) {
   				// TODO Auto-generated method stub
   				Intent i=new Intent(IncorrectsolutionActivity.this,Playlevel5Activity.class);finish();
   				startActivity(i);
   				//buttonSound.start();
   		}
   		});
       }
        else if(Values.clicked==6){
          	 retry.setOnClickListener(new OnClickListener() {
              	
              	
      			public void onClick(View v) {
      				// TODO Auto-generated method stub
      				Intent i=new Intent(IncorrectsolutionActivity.this,Playlevel6Activity.class);finish();
      				startActivity(i);
      				//buttonSound.start();
      		}
      		});
          }
           else if(Values.clicked==7){
          	 retry.setOnClickListener(new OnClickListener() {
              	
              	
      			public void onClick(View v) {
      				// TODO Auto-generated method stub
      				Intent i=new Intent(IncorrectsolutionActivity.this,Playlevel7Activity.class);finish();
      				startActivity(i);
      				//buttonSound.start();
      		}
      		});
          }
           else if(Values.clicked==8){
          	 retry.setOnClickListener(new OnClickListener() {
              	
              	
      			public void onClick(View v) {
      				// TODO Auto-generated method stub
      				Intent i=new Intent(IncorrectsolutionActivity.this,Playlevel8Activity.class);finish();
      				startActivity(i);
      				//buttonSound.start();
      		}
      		});
          }
           else if(Values.clicked==9){
             	 retry.setOnClickListener(new OnClickListener() {
                 	
                 	
         			public void onClick(View v) {
         				// TODO Auto-generated method stub
         				Intent i=new Intent(IncorrectsolutionActivity.this,Playlevel9Activity.class);finish();
         				startActivity(i);
         				//buttonSound.start();
         		}
         		});
             }
              else if(Values.clicked==10){
             	 retry.setOnClickListener(new OnClickListener() {
                 	
                 	
         			public void onClick(View v) {
         				// TODO Auto-generated method stub
         				Intent i=new Intent(IncorrectsolutionActivity.this,Playlevel10Activity.class);finish();
         				startActivity(i);
         				//buttonSound.start();
         		}
         		});
             }
              else if(Values.clicked==11){
             	 retry.setOnClickListener(new OnClickListener() {
                 	
                 	
         			public void onClick(View v) {
         				// TODO Auto-generated method stub
         				Intent i=new Intent(IncorrectsolutionActivity.this,playlevel11.class);finish();
         				startActivity(i);
         				//buttonSound.start();
         		}
         		});
             }
              else if(Values.clicked==12){
                	 retry.setOnClickListener(new OnClickListener() {
                    	
                    	
            			public void onClick(View v) {
            				// TODO Auto-generated method stub
            				Intent i=new Intent(IncorrectsolutionActivity.this,Playlevel12.class);finish();
            				startActivity(i);
            				//buttonSound.start();
            		}
            		});
                }
                 else if(Values.clicked==13){
                	 retry.setOnClickListener(new OnClickListener() {
                    	
                    	
            			public void onClick(View v) {
            				// TODO Auto-generated method stub
            				Intent i=new Intent(IncorrectsolutionActivity.this,Playlevel13.class);finish();
            				startActivity(i);
            				//buttonSound.start();
            		}
            		});
                }
                 else if(Values.clicked==14){
                	 retry.setOnClickListener(new OnClickListener() {
                    	
                    	
            			public void onClick(View v) {
            				// TODO Auto-generated method stub
            				Intent i=new Intent(IncorrectsolutionActivity.this,Playlevel14.class);finish();
            				startActivity(i);
            				//buttonSound.start();
            		}
            		});
                }
                 else if(Values.clicked==15){
                   	 retry.setOnClickListener(new OnClickListener() {
                       	
                       	
               			public void onClick(View v) {
               				// TODO Auto-generated method stub
               				Intent i=new Intent(IncorrectsolutionActivity.this,Playlevel2Activity.class);finish();
               				startActivity(i);
               				//buttonSound.start();
               		}
               		});
                   }
                    else if(Values.clicked==16){
                   	 retry.setOnClickListener(new OnClickListener() {
                       	
                       	
               			public void onClick(View v) {
               				// TODO Auto-generated method stub
               				Intent i=new Intent(IncorrectsolutionActivity.this,Playlevel16Activity.class);finish();
               				startActivity(i);
               				//buttonSound.start();
               		}
               		});
                   }
                    else if(Values.clicked==17){
                   	 retry.setOnClickListener(new OnClickListener() {
                       	
                       	
               			public void onClick(View v) {
               				// TODO Auto-generated method stub
               				Intent i=new Intent(IncorrectsolutionActivity.this,Playlevel17Activity.class);finish();
               				startActivity(i);
               				//buttonSound.start();
               		}
               		});
                   }
                    else if(Values.clicked==18){
                      	 retry.setOnClickListener(new OnClickListener() {
                          	
                          	
                  			public void onClick(View v) {
                  				// TODO Auto-generated method stub
                  				Intent i=new Intent(IncorrectsolutionActivity.this,Playlevel18Activity.class);finish();
                  				startActivity(i);
                  				//buttonSound.start();
                  		}
                  		});
                      }
                       else if(Values.clicked==19){
                      	 retry.setOnClickListener(new OnClickListener() {
                          	
                          	
                  			public void onClick(View v) {
                  				// TODO Auto-generated method stub
                  				Intent i=new Intent(IncorrectsolutionActivity.this,Playlevel19Activity.class);finish();
                  				startActivity(i);
                  				//buttonSound.start();
                  		}
                  		});
                      }
                       else if(Values.clicked==20){
                      	 retry.setOnClickListener(new OnClickListener() {
                          	
                          	
                  			public void onClick(View v) {
                  				// TODO Auto-generated method stub
                  				Intent i=new Intent(IncorrectsolutionActivity.this,Playlevel20Activity.class);finish();
                  				startActivity(i);
                  				//buttonSound.start();
                  		}
                  		});
                      }







        
        solve=(Button)findViewById(R.id.losser3);
        solve.setBackgroundColor(Color.TRANSPARENT);
        solve.setOnClickListener(new OnClickListener() {
       		
       		public void onClick(View v) {
       			// TODO Auto-generated method stub
       			Intent i=new Intent(IncorrectsolutionActivity.this,PlayActivity.class);finish();
       			startActivity(i);
       		//	buttonSound.start();
       		}
       	});
     
	}
}

