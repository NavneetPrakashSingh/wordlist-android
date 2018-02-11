package org.wordlist.navneet.wordapplication;

/**
 * Created by Navneet on 7/21/2015.
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.navneet.wordapplication.R;

/**
 * Created by Navneet on 7/21/2015.
 */
public class CustomAdapter_fifthscreen extends ArrayAdapter<fifthscreen.SimpleList2> {

    CustomAdapter_fifthscreen(Context context, fifthscreen.SimpleList2[] simpleLists) {
        super(context,R.layout.fifth_custom_row, simpleLists);
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        //Used to point to which layout you are reference to , in this case it is custom_row.xml layout
        LayoutInflater firstInflater=LayoutInflater.from(getContext());
        View customView=firstInflater.inflate(R.layout.fifth_custom_row,parent,false);

        String singleFoodItem=getItem(position).words.toString();
        TextView firstText=(TextView)customView.findViewById(R.id.bindingText);

        firstText.setText(singleFoodItem);

        return customView;
    }
}