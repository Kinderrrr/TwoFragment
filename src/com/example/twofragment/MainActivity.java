package com.example.twofragment;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
	
	public static int pos;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ViewPager pager =(ViewPager)findViewById(R.id.pager);
		
		if(pager!=null){
			ViewPager pager1 =(ViewPager)findViewById(R.id.pager);
		    pager1.setAdapter(new  MyPagerAdapter(getSupportFragmentManager()));
		    pager1.setCurrentItem(5);
			

}
	}

	
}
