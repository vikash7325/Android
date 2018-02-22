package com.org.proj;



import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SettingsActivity extends Activity{
	Button faceBook,twitter,about,home,settingMode,settingDifficulty,settingMusic,sfx;
	String Tag="hi";
	Context context=this; 
//	int special,music,mode,difficulty;
	
	int a,b,c,d;
	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_screen);
        //final MediaPlayer buttonSound=MediaPlayer.create(this,R.raw.button_1);
    //    MediaPlayer mp=MediaPlayer.create(this,R.raw.iron_man);
     //   mp.start(); 
        
        
        home=(Button)findViewById(R.id.homesetting);
        home.setBackgroundColor(Color.TRANSPARENT);
        home.setOnClickListener(new OnClickListener() {
       		
       		public void onClick(View v) {
       			// TODO Auto-generated method stub
       	//		Log.d(Tag,"clicked");
       			Intent i=new Intent(SettingsActivity.this,HomeActivity.class);finish();
       			i.putExtra("mode1",a);
       			i.putExtra("music1",b);
       			i.putExtra("difficulty1",c);
       			i.putExtra("special1",d);
       			startActivity(i);
       			//buttonSound.start();
       		}
       	});
        
        
      /*  faceBook=(Button)findViewById(R.id.faceBookButton);
        faceBook.setBackgroundColor(Color.TRANSPARENT);
        faceBook.setOnClickListener(new OnClickListener() {
       		
       		public void onClick(View v) {
       			// TODO Auto-generated method stub
       			Log.d(Tag,"clicked");
       			Intent i=new Intent(Setting.this,MyFaceBook.class);
       			startActivity(i);
       			buttonSound.start();
       		}
       	});
        twitter=(Button)findViewById(R.id.twitterButton);
        twitter.setBackgroundColor(Color.TRANSPARENT);
        twitter.setOnClickListener(new OnClickListener() {
       		
       		public void onClick(View v) {
       			// TODO Auto-generated method stub
       			Log.d(Tag,"clickedtwitter");
       			Intent i=new Intent(Setting.this,Twitter.class);
       			startActivity(i);
       			buttonSound.start();
       		}
       	});*/
        //adding sound to button 
      /*  about=(Button)findViewById(R.id.aboutButton);
        about.setBackgroundColor(Color.TRANSPARENT);
        about.setOnClickListener(new OnClickListener() {
       		
       		public void onClick(View v) {
       			// TODO Auto-generated method stub
       			Log.d(Tag,"aboutclicked");
       			Intent i=new Intent(Setting.this,About.class);
       			startActivity(i);
       			buttonSound.start();
       		}
       	});*/
        settingMode=(Button)findViewById(R.id.settingone);
        settingMode.setBackgroundColor(Color.TRANSPARENT);
        settingMode.setOnClickListener(new OnClickListener() {
       		
       		public void onClick(View v) {
       			// TODO Auto-generated method stub
       			Log.d(Tag,"clicked");
       			switch(v.getId())
       			{
       			  case R.id.settingone:
       					openFirstSetting();
       					break;
                 }
       			
       			
       		}

		

			

			private void openFirstSetting() {
				// TODO Auto-generated method stub
				new AlertDialog.Builder(context).setTitle(R.string.setting_one).setItems(R.array.Mode,new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface dialoginterface,int mode){
						startMode(mode);
						
					}
				})
				.show();
			}
			private void startMode(int mode)
			{
				Log.d(Tag,"clicked on"+ mode);
				a=mode;
				Values.mode=a;
			}
			
       	});
        settingDifficulty=(Button)findViewById(R.id.settingthree);
        settingDifficulty.setBackgroundColor(Color.TRANSPARENT);
        settingDifficulty.setOnClickListener(new OnClickListener() {
       		
       		public void onClick(View v) {
       			// TODO Auto-generated method stub 
       			Log.d(Tag,"clicked");
       			switch(v.getId()){

       				
       				case R.id.settingthree:
   					openThirdSetting();
   					break;
       			}
       		
       		}

			private void openThirdSetting() {
				// TODO Auto-generated method stub
				new AlertDialog.Builder(context).setTitle(R.string.game_difficulty).setItems(R.array.difficulty,new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface dialoginterface,int difficulty){
						startMode(difficulty);
						
					}
				})
				.show();
				
			}
			private void startMode(int difficulty)
			{
				Log.d(Tag,"clicked on"+ difficulty);
				c=difficulty;
				Values.diff=c;
			}

       	});
        settingMusic=(Button)findViewById(R.id.settingtwo);
        settingMusic.setBackgroundColor(Color.TRANSPARENT);
        settingMusic.setOnClickListener(new OnClickListener() {
       		
       		public void onClick(View v) {
       			// TODO Auto-generated method stub
       			Log.d(Tag,"clicked");
       			switch(v.getId()){
  
       				case R.id.settingtwo:
       							openSecondSetting();
       							break;
       			
       			}
       		}
       		private void openSecondSetting() {
				// TODO Auto-generated method stub
				new AlertDialog.Builder(context).setTitle(R.string.setting_two).setItems(R.array.music,new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface dialoginterface,int music){
						startMode(music);
						
					}
				})
				.show();
				
			}
       		private void startMode(int music)
			{
				Log.d(Tag,"clicked on"+ music);
				b=music;
			}
        });
        sfx=(Button)findViewById(R.id.settingfour);
        sfx.setBackgroundColor(Color.TRANSPARENT);
        sfx.setOnClickListener(new OnClickListener() {
       		
       		public void onClick(View v) {
       			// TODO Auto-generated method stub
       			Log.d(Tag,"clicked");
       			switch(R.id.settingfour){
       					case R.id.settingfour:
       						openFourthSetting();
       						break;
       			}
       			
       			
       		}
       		private void openFourthSetting() {
				// TODO Auto-generated method stub
				new AlertDialog.Builder(context).setTitle(R.string.special_effects).setItems(R.array.special_effects,new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface dialoginterface,int special){
						startMode(special);
						
					}
				})
				.show();
				
			}
       		private void startMode(int special)
			{
				Log.d(Tag,"clicked on"+ special);
				d=special;
			}
       	});
	}
}

