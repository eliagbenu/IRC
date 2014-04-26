package com.eliagbenu.irc;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;

public class Splash extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash_screen);
		//wait for 3 secs
		Thread timer = new Thread(){
			public void run(){
				try{
					sleep(3000);
				}catch(InterruptedException e){
					e.printStackTrace();
				}finally{
					//continue to registration page			
					Intent i = new Intent("com.eliagbenu.irc.ACTIVITY_1");						
		             startActivity(i);
				}
			}
		};
		timer.start();	
		
	}

}
