package com.org.proj;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class TimeOutActivity extends Activity{
	Button home,retry,solve;
	String Tag="clicked";
	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timeout_screen);
	
        //final MediaPlayer buttonSound=MediaPlayer.create(this,R.raw.button_1);
    //    MediaPlayer mp=MediaPlayer.create(this,R.raw.iron_man);
    //    mp.start();
        home=(Button)findViewById(R.id.timeloser3);
        home.setBackgroundColor(Color.TRANSPARENT);
        home.setOnClickListener(new OnClickListener() {
       		
       		public void onClick(View v) {
       			// TODO Auto-generated method stub
       			Intent i=new Intent(TimeOutActivity.this,HomeActivity.class);finish();
       			startActivity(i);
       			//buttonSound.start();
       		}
       	});
        
        
        retry=(Button)findViewById(R.id.timeloser1);
        retry.setBackgroundColor(Color.TRANSPARENT);
        if(Values.clickedt==1)
    		retry.setOnClickListener(new OnClickListener() {
    	
    	
    			public void onClick(View v) {
    				// TODO Auto-generated method stub
    				Intent i=new Intent(TimeOutActivity.this,Playlevel1Activity.class);finish();
    				startActivity(i);
    				//buttonSound.start();
    		}
    		});
    else if(Values.clickedt==2){
    	 retry.setOnClickListener(new OnClickListener() {
        	
        	
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i=new Intent(TimeOutActivity.this,Playlevel2Activity.class);finish();
				startActivity(i);
				//buttonSound.start();
		}
		});
    }
    else if(Values.clickedt==3){
   	 retry.setOnClickListener(new OnClickListener() {
       	
       	
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i=new Intent(TimeOutActivity.this,Playlevel3Activity.class);finish();
				startActivity(i);
				//buttonSound.start();
		}
		});
   }
    else if(Values.clickedt==4){
   	 retry.setOnClickListener(new OnClickListener() {
       	
       	
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i=new Intent(TimeOutActivity.this,Playlevel4Activity.class);finish();
				startActivity(i);
				//buttonSound.start();
		}
		});
   }
    else if(Values.clickedt==5){
   	 retry.setOnClickListener(new OnClickListener() {
       	
       	
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i=new Intent(TimeOutActivity.this,Playlevel5Activity.class);finish();
				startActivity(i);
				//buttonSound.start();
		}
		});
   }
    else if(Values.clickedt==6){
      	 retry.setOnClickListener(new OnClickListener() {
          	
          	
  			public void onClick(View v) {
  				// TODO Auto-generated method stub
  				Intent i=new Intent(TimeOutActivity.this,Playlevel6Activity.class);finish();
  				startActivity(i);
  				//buttonSound.start();
  		}
  		});
      }
       else if(Values.clickedt==7){
      	 retry.setOnClickListener(new OnClickListener() {
          	
          	
  			public void onClick(View v) {
  				// TODO Auto-generated method stub
  				Intent i=new Intent(TimeOutActivity.this,Playlevel7Activity.class);finish();
  				startActivity(i);
  				//buttonSound.start();
  		}
  		});
      }
       else if(Values.clickedt==8){
      	 retry.setOnClickListener(new OnClickListener() {
          	
          	
  			public void onClick(View v) {
  				// TODO Auto-generated method stub
  				Intent i=new Intent(TimeOutActivity.this,Playlevel8Activity.class);finish();
  				startActivity(i);
  				//buttonSound.start();
  		}
  		});
      }
       else if(Values.clickedt==9){
         	 retry.setOnClickListener(new OnClickListener() {
             	
             	
     			public void onClick(View v) {
     				// TODO Auto-generated method stub
     				Intent i=new Intent(TimeOutActivity.this,Playlevel9Activity.class);finish();
     				startActivity(i);
     				//buttonSound.start();
     		}
     		});
         }
          else if(Values.clickedt==10){
         	 retry.setOnClickListener(new OnClickListener() {
             	
             	
     			public void onClick(View v) {
     				// TODO Auto-generated method stub
     				Intent i=new Intent(TimeOutActivity.this,Playlevel10Activity.class);finish();
     				startActivity(i);
     				//buttonSound.start();
     		}
     		});
         }
          else if(Values.clickedt==11){
         	 retry.setOnClickListener(new OnClickListener() {
             	
             	
     			public void onClick(View v) {
     				// TODO Auto-generated method stub
     				Intent i=new Intent(TimeOutActivity.this,playlevel11.class);finish();
     				startActivity(i);
     				//buttonSound.start();
     		}
     		});
         }
          else if(Values.clickedt==12){
            	 retry.setOnClickListener(new OnClickListener() {
                	
                	
        			public void onClick(View v) {
        				// TODO Auto-generated method stub
        				Intent i=new Intent(TimeOutActivity.this,Playlevel12.class);finish();
        				startActivity(i);
        				//buttonSound.start();
        		}
        		});
            }
             else if(Values.clickedt==13){
            	 retry.setOnClickListener(new OnClickListener() {
                	
                	
        			public void onClick(View v) {
        				// TODO Auto-generated method stub
        				Intent i=new Intent(TimeOutActivity.this,Playlevel13.class);finish();
        				startActivity(i);
        				//buttonSound.start();
        		}
        		});
            }
             else if(Values.clickedt==14){
            	 retry.setOnClickListener(new OnClickListener() {
                	
                	
        			public void onClick(View v) {
        				// TODO Auto-generated method stub
        				Intent i=new Intent(TimeOutActivity.this,Playlevel14.class);finish();
        				startActivity(i);
        				//buttonSound.start();
        		}
        		});
            }
             else if(Values.clickedt==15){
               	 retry.setOnClickListener(new OnClickListener() {
                   	
                   	
           			public void onClick(View v) {
           				// TODO Auto-generated method stub
           				Intent i=new Intent(TimeOutActivity.this,Playlevel2Activity.class);finish();
           				startActivity(i);
           				//buttonSound.start();
           		}
           		});
               }
                else if(Values.clickedt==16){
               	 retry.setOnClickListener(new OnClickListener() {
                   	
                   	
           			public void onClick(View v) {
           				// TODO Auto-generated method stub
           				Intent i=new Intent(TimeOutActivity.this,Playlevel16Activity.class);finish();
           				startActivity(i);
           				//buttonSound.start();
           		}
           		});
               }
                else if(Values.clickedt==17){
               	 retry.setOnClickListener(new OnClickListener() {
                   	
                   	
           			public void onClick(View v) {
           				// TODO Auto-generated method stub
           				Intent i=new Intent(TimeOutActivity.this,Playlevel17Activity.class);finish();
           				startActivity(i);
           				//buttonSound.start();
           		}
           		});
               }
                else if(Values.clickedt==18){
                  	 retry.setOnClickListener(new OnClickListener() {
                      	
                      	
              			public void onClick(View v) {
              				// TODO Auto-generated method stub
              				Intent i=new Intent(TimeOutActivity.this,Playlevel18Activity.class);finish();finish();
              				startActivity(i);
              				//buttonSound.start();
              		}
              		});
                  }
                   else if(Values.clickedt==19){
                  	 retry.setOnClickListener(new OnClickListener() {
                      	
                      	
              			public void onClick(View v) {
              				// TODO Auto-generated method stub
              				Intent i=new Intent(TimeOutActivity.this,Playlevel19Activity.class);finish();
              				startActivity(i);
              				//buttonSound.start();
              		}
              		});
                  }
                   else if(Values.clickedt==20){
                  	 retry.setOnClickListener(new OnClickListener() {
                      	
                      	
              			public void onClick(View v) {
              				// TODO Auto-generated method stub
              				Intent i=new Intent(TimeOutActivity.this,Playlevel20Activity.class);finish();
              				startActivity(i);
              				//buttonSound.start();
              		}
              		});
                  }

        
        solve=(Button)findViewById(R.id.timeloser2);
        solve.setBackgroundColor(Color.TRANSPARENT);
        
        if( Values.clickedt==1)
        {	
        	solve.setOnClickListener(new OnClickListener() {
       		
        		public void onClick(View v) {
        			// TODO Auto-generated method stub
        			Values.click1=1;
        			Intent i=new Intent(TimeOutActivity.this,Playlevel1Activity.class);finish();
        			startActivity(i);
        			//buttonSound.start();
        		}
        	});
        }
        else if( Values.clickedt==2)
        {	
        	solve.setOnClickListener(new OnClickListener() {
       		
        		public void onClick(View v) {
        			// TODO Auto-generated method stub
        			Values.click2=1;
        			Intent i=new Intent(TimeOutActivity.this,Playlevel2Activity.class);finish();
        			startActivity(i);
        			//buttonSound.start();
        		}
        	});
        }
        else if( Values.clickedt==3)
        {	
        	solve.setOnClickListener(new OnClickListener() {
       		
        		public void onClick(View v) {
        			// TODO Auto-generated method stub
        			Values.click3=1;
        			Intent i=new Intent(TimeOutActivity.this,Playlevel3Activity.class);finish();
        			startActivity(i);
        			//buttonSound.start();
        		}
        	});
        }
        else if( Values.clickedt==4)
        {	
        	solve.setOnClickListener(new OnClickListener() {
       		
        		public void onClick(View v) {
        			// TODO Auto-generated method stub
        			Values.click4=1;
        			Intent i=new Intent(TimeOutActivity.this,Playlevel4Activity.class);finish();
        			startActivity(i);
        			//buttonSound.start();
        		}
        	});
        }
        else if( Values.clickedt==5)
        {	
        	solve.setOnClickListener(new OnClickListener() {
       		
        		public void onClick(View v) {
        			// TODO Auto-generated method stub
        			Values.click5=1;
        			Intent i=new Intent(TimeOutActivity.this,Playlevel5Activity.class);finish();
        			startActivity(i);
        			//buttonSound.start();
        		}
        	});
        }
        else if( Values.clickedt==6)
        {	
        	solve.setOnClickListener(new OnClickListener() {
       		
        		public void onClick(View v) {
        			// TODO Auto-generated method stub
        			Values.click6=1;
        			Intent i=new Intent(TimeOutActivity.this,Playlevel6Activity.class);finish();
        			startActivity(i);
        			//buttonSound.start();
        		}
        	});
        }
        else if( Values.clickedt==7)
        {	
        	solve.setOnClickListener(new OnClickListener() {
       		
        		public void onClick(View v) {
        			// TODO Auto-generated method stub
        			Values.click7=1;
        			Intent i=new Intent(TimeOutActivity.this,Playlevel7Activity.class);finish();
        			startActivity(i);
        			//buttonSound.start();
        		}
        	});
        }
        else if( Values.clickedt==8)
        {	
        	solve.setOnClickListener(new OnClickListener() {
       		
        		public void onClick(View v) {
        			// TODO Auto-generated method stub
        			Values.click8=1;
        			Intent i=new Intent(TimeOutActivity.this,Playlevel8Activity.class);finish();
        			startActivity(i);
        			//buttonSound.start();
        		}
        	});
        }
        else if( Values.clickedt==9)
        {	
        	solve.setOnClickListener(new OnClickListener() {
       		
        		public void onClick(View v) {
        			// TODO Auto-generated method stub
        			Values.click9=1;
        			Intent i=new Intent(TimeOutActivity.this,Playlevel9Activity.class);finish();
        			startActivity(i);
        			//buttonSound.start();
        		}
        	});
        }
        else if( Values.clickedt==10)
        {	
        	solve.setOnClickListener(new OnClickListener() {
       		
        		public void onClick(View v) {
        			// TODO Auto-generated method stub
        			Values.click10=1;
        			Intent i=new Intent(TimeOutActivity.this,Playlevel10Activity.class);finish();
        			startActivity(i);
        			//buttonSound.start();
        		}
        	});
        }
        else if( Values.clickedt==11)
        {	
        	solve.setOnClickListener(new OnClickListener() {
       		
        		public void onClick(View v) {
        			// TODO Auto-generated method stub
        			Values.click11=1;
        			Intent i=new Intent(TimeOutActivity.this,playlevel11.class);finish();
        			startActivity(i);
        			//buttonSound.start();
        		}
        	});
        }
        else if( Values.clickedt==12)
        {	
        	solve.setOnClickListener(new OnClickListener() {
       		
        		public void onClick(View v) {
        			// TODO Auto-generated method stub
        			Values.click12=1;
        			Intent i=new Intent(TimeOutActivity.this,Playlevel12.class);finish();
        			startActivity(i);
        			//buttonSound.start();
        		}
        	});
        }
        else if( Values.clickedt==13)
        {	
        	solve.setOnClickListener(new OnClickListener() {
       		
        		public void onClick(View v) {
        			// TODO Auto-generated method stub
        			Values.click13=1;
        			Intent i=new Intent(TimeOutActivity.this,Playlevel13.class);finish();
        			startActivity(i);
        			//buttonSound.start();
        		}
        	});
        }
        else if( Values.clickedt==14)
        {	
        	solve.setOnClickListener(new OnClickListener() {
       		
        		public void onClick(View v) {
        			// TODO Auto-generated method stub
        			Values.click14=1;
        			Intent i=new Intent(TimeOutActivity.this,Playlevel14.class);finish();
        			startActivity(i);
        			//buttonSound.start();
        		}
        	});
        }
        else if( Values.clickedt==15)
        {	
        	solve.setOnClickListener(new OnClickListener() {
       		
        		public void onClick(View v) {
        			// TODO Auto-generated method stub
        			Values.click15=1;
        			Intent i=new Intent(TimeOutActivity.this,Playlevel14.class);finish();
        			startActivity(i);
        			//buttonSound.start();
        		}
        	});
        }
        else if( Values.clickedt==16)
        {	
        	solve.setOnClickListener(new OnClickListener() {
       		
        		public void onClick(View v) {
        			// TODO Auto-generated method stub
        			Values.click16=1;
        			Intent i=new Intent(TimeOutActivity.this,Playlevel16Activity.class);finish();
        			startActivity(i);
        			//buttonSound.start();
        		}
        	});
        }
        else if( Values.clickedt==17)
        {	
        	solve.setOnClickListener(new OnClickListener() {
       		
        		public void onClick(View v) {
        			// TODO Auto-generated method stub
        			Values.click17=1;
        			Intent i=new Intent(TimeOutActivity.this,Playlevel17Activity.class);finish();
        			startActivity(i);
        			//buttonSound.start();
        		}
        	});
        }
        else if( Values.clickedt==18)
        {	
        	solve.setOnClickListener(new OnClickListener() {
       		
        		public void onClick(View v) {
        			// TODO Auto-generated method stub
        			Values.click18=1;
        			Intent i=new Intent(TimeOutActivity.this,Playlevel18Activity.class);finish();
        			startActivity(i);
        			//buttonSound.start();
        		}
        	});
        }
        else if( Values.clickedt==19)
        {	
        	solve.setOnClickListener(new OnClickListener() {
       		
        		public void onClick(View v) {
        			// TODO Auto-generated method stub
        			Values.click19=1;
        			Intent i=new Intent(TimeOutActivity.this,Playlevel19Activity.class);finish();
        			startActivity(i);
        			//buttonSound.start();
        		}
        	});
        }
        else if( Values.clickedt==20)
        {	
        	solve.setOnClickListener(new OnClickListener() {
       		
        		public void onClick(View v) {
        			// TODO Auto-generated method stub
        			Values.click20=1;
        			Intent i=new Intent(TimeOutActivity.this,Playlevel20Activity.class);finish();
        			startActivity(i);
        			//buttonSound.start();
        		}
        	});
        }
        
	}
}

