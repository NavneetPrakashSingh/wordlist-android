package org.wordlist.navneet.wordapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;

import com.example.navneet.wordapplication.R;

/**
 * Created by Navneet on 8/5/2015.
 */
public class thirdscreen extends Fragment {


    //TextView txttitle = (TextView) findViewById(R.id.thirdtextview);

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.third_screen, container, false);
        //tv = (TextView) view.findViewById(R.id.thirdtextview);
        return view;

    }
}
