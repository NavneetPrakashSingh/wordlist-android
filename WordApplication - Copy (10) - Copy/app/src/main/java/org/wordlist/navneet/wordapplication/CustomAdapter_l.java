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
public class CustomAdapter_l extends ArrayAdapter<l_main.SimpleList>{


    CustomAdapter_l(Context context, l_main.SimpleList[] simpleLists) {
        super(context,R.layout.l_custom_row, simpleLists);

    }

    public View getView(int position, View convertView, ViewGroup parent) {



        //Used to point to which layout you are reference to , in this case it is custom_row.xml layout
        LayoutInflater firstInflater=LayoutInflater.from(getContext());
        View customView=firstInflater.inflate(R.layout.l_custom_row,parent,false);

        String singleFoodItem=getItem(position).words.toString();
        TextView firstText=(TextView)customView.findViewById(R.id.bindingText);

        firstText.setText(singleFoodItem);

        return customView;
    }
}
