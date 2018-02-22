package com.org.proj;



import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;

import android.os.Bundle;
import android.os.Handler;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.Button;


public  class HelpActivity extends Activity implements OnTouchListener{
	Button getHelp,home,setting,play;
	Handler mHandler;
	View mv;
	float x;
	float y;
	String Tag="hi";
	
	
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.help_screen);
	        //final MediaPlayer buttonSound=MediaPlayer.create(this,R.raw.button_1);
	//        MediaPlayer mp=MediaPlayer.create(this,R.raw.iron_man);
	//        mp.start();
	        View view=findViewById(R.id.scrollView1);
	       
	        view.setOnTouchListener(this);
	        getHelp=(Button)findViewById(R.id.home);
	        getHelp.setBackgroundColor(Color.TRANSPARENT);
	        getHelp.setOnClickListener(new OnClickListener() {
	       		
	       		public void onClick(View v) {
	       			// TODO Auto-generated method stub
	       	//		Log.d(Tag,"clicked");
	       			Intent i=new Intent(HelpActivity.this,HomeActivity.class);
	       			finish();
	       			startActivity(i);
	       			//buttonSound.start();
	       		}
	       	});
	       setting=(Button)findViewById(R.id.settings);
	       setting.setBackgroundColor(Color.TRANSPARENT);
	       setting.setOnClickListener(new OnClickListener()
	       {
	    	   public void onClick(View v){
	    		   Intent i=new Intent(HelpActivity.this,SettingsActivity.class);
	    		   finish();
	    		   startActivity(i);
	    		   //buttonSound.start();
	    	   }
	      
	    });
	       play=(Button)findViewById(R.id.play2);
	       play.setBackgroundColor(Color.TRANSPARENT);
	       play.setOnClickListener(new OnClickListener()
	       {
	    	   public void onClick(View v){
	    		   Intent i=new Intent(HelpActivity.this,lock.class);
	    		   finish();
	    		   startActivity(i);
	    		  // buttonSound.start();
	    	   }
	      
	    });
	
	}

	
	public boolean onTouch(View arg0, MotionEvent arg1) {
		// TODO Auto-generated method stub
		// final MediaPlayer buttonSound=MediaPlayer.create(this,R.raw.button_start);
		x=arg1.getX();
		y=arg1.getY();
	//	if(x<100||y>400)
	//	{
			Intent i=new Intent(HelpActivity.this,SettingsActivity.class);
   			startActivity(i);
   			//buttonSound.start();
	//	
		Log.d(Tag, "msg");
		return false;
	}
}
	
