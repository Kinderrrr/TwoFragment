package com.example.twofragment;

import java.util.ArrayList;

import android.content.Context;

public class ManagerAnimals {

	 
	 
		private static ManagerAnimals sManagerAnimals;
	    private Context mAppContext;
	    private ArrayList<Animals> mAnimals;

	    
	    private ManagerAnimals(Context appContext) {
	        mAppContext = appContext;
	        mAnimals = new ArrayList<Animals>();
	        for (int i = 0; i < 100; i++) {
	            Animals c = new Animals(); 
	            c.setmType("Animals #" + i);
	            mAnimals.add(c);
	        }

	    }
	    
	    public static ManagerAnimals get(Context c) {
	        if (sManagerAnimals == null) {
	        	sManagerAnimals = new ManagerAnimals(c.getApplicationContext());
	        }
	        
	        return sManagerAnimals;
	    }
	    
	    public ArrayList<Animals> getAnimals() {
	        return mAnimals;
	    }
	    
	    public Animals getCurrentAnimals(int pos) {
	        return mAnimals.get(pos);
	    }
	    
	    public Animals getAnimals(String type) {
		     for (Animals c : mAnimals) {
		         if (c.getmType().equals(type))
		             return c;
		     }
		 return null;
		    }


}
