package org.myapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity{
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public void onStart(){
		super.onStart();
		TextView textView = (TextView) findViewById(R.id.text_view);
		textView.setText("Your Android App is running fine!");
	}
	
}