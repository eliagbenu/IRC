package com.eliagbenu.irc;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Activity_3 extends Activity{

	MediaPlayer thisSong;

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_3);

		thisSong = MediaPlayer.create(this,R.raw.sweetio);
		ImageButton imgBtn = (ImageButton) findViewById(R.id.imageButton1);
		
		imgBtn.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				thisSong.start();
			}
			
		});

		
	}

	
}
