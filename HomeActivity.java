package com.org.proj;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class HomeActivity extends Activity{

	Button play,setting,help;
	static int u1,u2,u3,u4;
	
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.home_screen);
	        Bundle extras = getIntent().getExtras(); 
	        if(extras !=null) { 
	        	u1 = extras.getInt("mode1");
	        	Log.d("first",u1+" : "+u1);
	        	u2 = extras.getInt("music1");
	        	Log.d("first",u2+" : "+u2);
	        	u3 = extras.getInt("difficulty1");
	        	Log.d("first",u3+" : "+u3);
	        	u4 = extras.getInt("special1");
	        	Log.d("first",u4+" : "+u4);
	        } 
	       // final MediaPlayer buttonSound=MediaPlayer.create(this,R.raw.button_1);
	  //      MediaPlayer mp=MediaPlayer.create(this,R.raw.iron_man);
	  //      mp.start();
	        
	        play=(Button)findViewById(R.id.play1);
	        play.setBackgroundColor(Color.TRANSPARENT);
	        play.setOnClickListener(new OnClickListener() {
	       		
	       		public void onClick(View v) {
	       			// TODO Auto-generated method stub
	       	//		Log.d(Tag,"clicked");
	       			Intent i=new Intent(HomeActivity.this,lock.class);
	       			i.putExtra("mode1",u1);
	       			i.putExtra("music1",u2);
	       			i.putExtra("difficulty1",u3);
	       			i.putExtra("special1",u4);
	       			finish();
	       			startActivity(i);
	       			//buttonSound.start();
	       		}
	       	});
	        
	        setting=(Button)findViewById(R.id.settings1);
	        setting.setBackgroundColor(Color.TRANSPARENT);
	        setting.setOnClickListener(new OnClickListener() {
	       		
	       		public void onClick(View v) {
	       			// TODO  Auto-generated method stub
	       		//	Log.d(Tag,"clicked");
	       			Intent i=new Intent(HomeActivity.this,SettingsActivity.class);
	       			finish();
	       			startActivity(i);
	       			//buttonSound.start();
	       		}
	       	});
	              
	        help=(Button)findViewById(R.id.help1);
	        help.setBackgroundColor(Color.TRANSPARENT);
	        help.setOnClickListener(new OnClickListener() {
	       		
	       		public void onClick(View v) {
	       			// TODO  Auto-generated method stub
	       		//	Log.d(Tag,"clicked");
	       			Intent i=new Intent(HomeActivity.this,HelpActivity.class);
	       			finish();
	       			startActivity(i);
	       			//buttonSound.start();
	       		}
	       	});
	        
	}
	
}

