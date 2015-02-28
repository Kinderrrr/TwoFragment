package com.example.twofragment;


import java.util.ArrayList;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MyListFragment extends ListFragment {
	
	
	private ArrayList<Animals> mAnimals;
	
	 @Override
	 public void onActivityCreated(Bundle savedInstanceState) {
	        super.onActivityCreated(savedInstanceState);
	        getActivity().setTitle(R.string.title);
	        mAnimals = ManagerAnimals.get(getActivity()).getAnimals();
	        
	        ArrayAdapter<Animals> adapter = new ArrayAdapter<Animals>(getActivity(),android.R.layout.simple_list_item_1,  mAnimals);
	        setListAdapter(adapter);
	        
	 }
	 
	 @Override
     public void onCreate(Bundle savedInstanceState) {

             super.onCreate(savedInstanceState);
     }

	 
	 @Override
      public void onListItemClick(ListView l, View v, int position, long id) { 
		  Animals c = (Animals)getListAdapter().getItem(position);
		    
		  View detailsFrame =getActivity().findViewById(R.id.pager);
	
                  Intent intent = new Intent(getActivity().getApplicationContext(), DetailActivity.class);
                  intent.putExtra("value", position);
                  startActivity(intent);
     
		  
		 

      }
	 
	
	  
	  
	
	 
	 
}
