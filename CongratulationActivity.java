package com.org.proj;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class CongratulationActivity extends Activity{
	Button home;
	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sam);
            //  String tag="score6";
			//Log.d(tag, Values.score6+"");
    //    MediaPlayer mp=MediaPlayer.create(this,R.raw.iron_man);
    //    mp.start();
        home=(Button)findViewById(R.id.timeloser4);
        home.setBackgroundColor(Color.TRANSPARENT);
        home.setOnClickListener(new OnClickListener() {
       		
       		public void onClick(View v) {
       			// TODO Auto-generated method stub
       			Intent i=new Intent(CongratulationActivity.this,HomeActivity.class);
       			finish();
       			startActivity(i);
       			//buttonSound.start();
       		}
       	});
        
     
	}
}   


