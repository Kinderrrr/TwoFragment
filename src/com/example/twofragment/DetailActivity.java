package com.example.twofragment;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.View;

public class DetailActivity extends FragmentActivity {
	
	   @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);

	       if (getResources().getConfiguration().orientation
	                == Configuration.ORIENTATION_LANDSCAPE) {
	    	   
	    	   finish(); 
	        }
	       
	        getIntent().getSerializableExtra("value");
	        setContentView(R.layout.detail_activity_layout);
	        ViewPager pager =(ViewPager)findViewById(R.id.pager);
	        pager.setAdapter(new  MyPagerAdapter(getSupportFragmentManager()));
	        pager.setCurrentItem((Integer)getIntent().getSerializableExtra("value"));
	        
	        
	   }
	    


}
