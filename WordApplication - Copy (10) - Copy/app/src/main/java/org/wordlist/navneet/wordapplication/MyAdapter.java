package org.wordlist.navneet.wordapplication;

import android.support.v4.app.FragmentManager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;

public class MyAdapter extends FragmentStatePagerAdapter {

    public MyAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public int getCount() {
        return MainActivity.NUMBER_OF_LISTS;
    }

    // when swiping returns a fragment with the object identified by position
    @Override
    public Fragment getItem(int position) {
        Fragment fragment=null;
        if(position==0){
            fragment=new firstscreen();
            Bundle args=new Bundle();
            fragment.setArguments(args);
            return fragment;
        }else if(position==1){
            fragment=new secondscreen();
            Bundle args=new Bundle();
            fragment.setArguments(args);
            return fragment;
        }else if(position==2){
            fragment=new thirdscreen();
            Bundle args=new Bundle();
            fragment.setArguments(args);
            return fragment;
        }else if(position==3){
            fragment=new fourthscreen();
            Bundle args=new Bundle();
            fragment.setArguments(args);
            return fragment;
        }else if(position==4){
            fragment = new fifthscreen();
            Bundle args=new Bundle();
            fragment.setArguments(args);
            return fragment;
        }else if(position==5){
            fragment = new sixthScreen();
            Bundle args=new Bundle();
            fragment.setArguments(args);
            return fragment;
        }else if(position==6){
            fragment = new seventhScreen();
            Bundle args=new Bundle();
            fragment.setArguments(args);
            return fragment;
        }else if(position==7) {
            fragment = new eightScreen();
            Bundle args = new Bundle();
            fragment.setArguments(args);
            return fragment;
        }else{
            return ArrayListFragment.createNewFragmentToDisplay(position);
        }



    }

    /*gets the title describing specified page
    and passes it to the PagerTitleStrip in
    fragment_pager.xml - displays either top or
    bottom of screen*/
    @Override
    public CharSequence getPageTitle(int position) {
        if(position==0){
            return "Word List";
        }else if(position==1){
            return "Add Words";
        }else if(position==2){
            return "Random Word";
        }else if(position==3){
            return "Search";
        }else if(position==4){
            return "Favorite";
        }else if (position==5){
            return "Quiz Score";
        }else if(position==6){
            return "How To Use?";
        }else if(position==7){
            return "About";
        }else{
            return "true";
        }

    }
}
