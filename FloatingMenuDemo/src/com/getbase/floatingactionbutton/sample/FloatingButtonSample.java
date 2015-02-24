package com.getbase.floatingactionbutton.sample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.getbase.floatingactionbutton.FloatingActionButton;

public class FloatingButtonSample extends Activity implements View.OnClickListener{
	
	com.getbase.floatingactionbutton.FloatingActionButton btn_first, btn_second, btn_third;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.floating_btn);
		init();
		
		//set click listener
		btn_first.setOnClickListener(this);
		btn_second.setOnClickListener(this);
		btn_third.setOnClickListener(this);
	}

	void init()
	{
		btn_first = (FloatingActionButton)findViewById(R.id.first);
		btn_second = (FloatingActionButton)findViewById(R.id.second);
		btn_third = (FloatingActionButton)findViewById(R.id.third);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v == btn_first)
		{
			Toast.makeText(FloatingButtonSample.this, "first clicked", Toast.LENGTH_SHORT).show();
		}
		else if(v == btn_second)
		{
			Toast.makeText(FloatingButtonSample.this, "second clicked", Toast.LENGTH_SHORT).show();
		}
		else if(v == btn_third)
		{
			Toast.makeText(FloatingButtonSample.this, "third clicked", Toast.LENGTH_SHORT).show();
		}
	}
}
