package com.org.proj;

import android.app.Activity;
import android.os.Bundle;





import android.content.Intent;
import android.graphics.Color;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class SafeleapActivity extends Activity{
    /** Called when the activity is first created. */
	
	Button play,help,button1;
	String Tag="button";
	TextView t1;
	
    public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
         setContentView(R.layout.main);
         
       //adding sound to button 
       // final MediaPlayer buttonSound=MediaPlayer.create(this,R.raw.button_start);
     //   MediaPlayer mp=MediaPlayer.create(this,R.raw.iron_man);
     //   mp.start();
         button1=(Button)findViewById(R.id.button2);
         t1=(TextView)findViewById(R.id.textView1);
        play=(Button)findViewById(R.id.play);
      
        
        play.setBackgroundColor(Color.TRANSPARENT);
        play.setOnClickListener(new OnClickListener() {
       		
       		public void onClick(View v) {
       			// TODO Auto-generated method stub
       	//		Log.d(Tag,"clicked");
       			Intent i=new Intent(SafeleapActivity.this,HomeActivity.class);
       			finish();
       			startActivity(i);
       			//buttonSound.start();
       		}
       	});
        
        help=(Button)findViewById(R.id.help);
      help.setBackgroundColor(Color.TRANSPARENT);
        help.setOnClickListener(new OnClickListener() {
       		
       		public void onClick(View v) {
       			// TODO  Auto-generated method stub
       			Log.d(Tag,"clicked");
       			Intent i=new Intent(SafeleapActivity.this,HelpActivity.class);
       			finish();
       			startActivity(i);
       			//buttonSound.start();
       		}
       	});
     }
	
}
  