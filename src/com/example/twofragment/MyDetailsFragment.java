package com.example.twofragment;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MyDetailsFragment extends Fragment {
	
	private ArrayList<Animals> mAnimals;
	private Animals CurrentAnimals = new Animals();
	
	private static final String KEY ="MyDetails";
	
	public static Fragment newInstance(int cur){
		MyDetailsFragment fragment = new MyDetailsFragment();
		Bundle args = new Bundle();
		args.putInt(KEY,cur);
		fragment.setArguments(args);
		return fragment;
	}

  

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    	  mAnimals = ManagerAnimals.get(getActivity()).getAnimals();
    	  CurrentAnimals = mAnimals.get(getArguments().getInt(KEY));
          View view = inflater.inflate(R.layout.detail_layout, container, false);
          TextView Text = (TextView) view.findViewById(com.example.twofragment.R.id.textView1);
          Text.setText(CurrentAnimals.getmType());
            
    return view;
    }

   
}
