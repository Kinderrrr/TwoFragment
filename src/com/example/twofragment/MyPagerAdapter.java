package com.example.twofragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class MyPagerAdapter extends FragmentStatePagerAdapter {

	
	
	public MyPagerAdapter(FragmentManager fm) {
		super(fm);
		
	}
	
	@Override
	public Fragment getItem(int pos){
		return MyDetailsFragment.newInstance(pos);
	}
	
	@Override
	public int getCount(){
		return 100;
	}

}
