package org.wordlist.navneet.wordapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navneet.wordapplication.R;

/**
 * Created by Navneet on 7/14/2015.
 */
public class secondscreen extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.second_screen,container,false);

        return view;

    }
}
