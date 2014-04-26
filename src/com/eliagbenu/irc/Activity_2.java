package com.eliagbenu.irc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Activity_2 extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_2);
		
		ImageButton imgBtn = (ImageButton) findViewById(R.id.imageButton1);
		imgBtn.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent openNextScreen = new Intent(Activity_2.this, Activity_3.class );					
				startActivity(openNextScreen);
			}			
		});		
		
	}

	
}
