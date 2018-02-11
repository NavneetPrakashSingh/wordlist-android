package org.wordlist.navneet.wordapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.navneet.wordapplication.R;

/**
 * Created by Navneet on 7/2/2015.
 */
public class CustomAdapter_v extends ArrayAdapter<v_main.SimpleList>{


    CustomAdapter_v(Context context, v_main.SimpleList[] simpleLists) {
        super(context,R.layout.v_custom_main, simpleLists);

    }

    public View getView(int position, View convertView, ViewGroup parent) {



        //Used to point to which layout you are reference to , in this case it is custom_row.xml layout
        LayoutInflater firstInflater=LayoutInflater.from(getContext());
        View customView=firstInflater.inflate(R.layout.v_custom_main,parent,false);

        String singleFoodItem=getItem(position).words.toString();
        TextView firstText=(TextView)customView.findViewById(R.id.bindingText);

        firstText.setText(singleFoodItem);

        return customView;
    }
}
