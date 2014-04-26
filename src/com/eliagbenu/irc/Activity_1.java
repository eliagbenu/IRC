package com.eliagbenu.irc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Activity_1 extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_1);
		
		ImageButton imgBtn = (ImageButton) findViewById(R.id.imageButton1);
		imgBtn.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent openSecondScreen = new Intent(Activity_1.this, Activity_2.class );					
				startActivity(openSecondScreen);
			}			
		});		
		
	}

	
}
