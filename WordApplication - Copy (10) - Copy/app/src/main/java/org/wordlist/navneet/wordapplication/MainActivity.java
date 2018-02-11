package org.wordlist.navneet.wordapplication;

import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.navneet.wordapplication.R;


public class MainActivity extends ActionBarActivity {

    static final int NUMBER_OF_LISTS=7;
    MyAdapter mAdapter;
    ViewPager mPager;

    Boolean isInternetPresent = false;
    // Connection detector class
    ConnectionDetector cd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAdapter=new MyAdapter(getSupportFragmentManager());

        mPager=(ViewPager)findViewById(R.id.pager);
        mPager.setAdapter(mAdapter);



    }

    public void clicked(View view){
        try{

            // creating connection detector class instance
            cd = new ConnectionDetector(getApplicationContext());
            isInternetPresent = cd.isConnectingToInternet();

            // check for Internet status
            if (isInternetPresent) {
                // Internet Connection is Present
                // make HTTP requests
                Intent in=new Intent(MainActivity.this, randomword.class);
                startActivity(in);

            } else {
                // Internet connection is not present
                // Ask user to connect to Internet
                new AlertDialog.Builder(this).setTitle("Word List").setMessage("You don't have an internet connection,inorder to avail this feature please make sure you are connected to the internet ").show();
            }


        }catch (Exception ex){
            new AlertDialog.Builder(this).setMessage("ex"+ex).show();
        }
    }

    public void eightClick(View view){
        //new AlertDialog.Builder(this).setMessage("Activity clicked").show();
        Log.i("Send email", "");
        String[] TO = {"npsc009@gmail.com"};
        String[] CC = {"navneet_prakash_singh@live.com"};
        Intent emailIntent = new Intent(Intent.ACTION_SEND);

        emailIntent.setType("message/rfc822");
        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
        emailIntent.putExtra(Intent.EXTRA_CC, CC);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Word List Android Feedback");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "");

        try {
            startActivity(Intent.createChooser(emailIntent, "Send mail..."));
            finish();
            Log.i("Finished sending email.", "");
        }
        catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(MainActivity.this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
        }

    }

    public void firstScreenClick(View view){

        //new AlertDialog.Builder(view.getContext()).setTitle("Reached here").show();
        try {
            Intent i = new Intent(MainActivity.this, AlphaGrid.class);
            startActivity(i);
        }catch (Exception ex)
        {
            new AlertDialog.Builder(view.getContext()).setMessage(""+ex).show();
        }
    }

    public void secondScreenClick(View view){
        Intent in=new Intent(MainActivity.this,addWord.class);
        startActivity(in);
    }

    public void serchClick (View view){

        // creating connection detector class instance
        cd = new ConnectionDetector(getApplicationContext());
        isInternetPresent = cd.isConnectingToInternet();

        // check for Internet status
        if (isInternetPresent) {
            Intent in = new Intent(MainActivity.this, searchPage.class);
            startActivity(in);
        }else{
            new AlertDialog.Builder(this).setTitle("Word List").setMessage("You don't have an internet connection,inorder to avail this feature please make sure you are connected to the internet ").show();
        }
    }

    public void score(View view){

        //new AlertDialog.Builder(view.getContext()).setTitle("Reached here").show();
        try {
            Intent i = new Intent(MainActivity.this, progressScores.class);
            startActivity(i);
        }catch (Exception ex)
        {
            new AlertDialog.Builder(view.getContext()).setMessage(""+ex).show();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
