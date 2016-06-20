package com.zonsim.ninecells;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
	
	private GridView mGridView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		initView();
	}
	
	private void initView() {
		mGridView = (GridView) findViewById(R.id.gv_items);
		mGridView.setAdapter(new MyGridAdapter(this));
	}
}
