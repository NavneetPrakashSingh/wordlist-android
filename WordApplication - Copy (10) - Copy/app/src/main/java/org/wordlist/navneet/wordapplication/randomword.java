package org.wordlist.navneet.wordapplication;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.navneet.wordapplication.R;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Navneet on 8/5/2015.
 */
public class randomword extends Activity {


    List<StudentsModel> list=new ArrayList<StudentsModel>();
    DatabaseHelper db;
    TextView tv;
    ProgressDialog mProgressDialog;
    String url = "http://www.vocabulary.com/lists/52473#view=notes";
    List<words> lst;

    // flag for Internet connection status
//    Boolean isInternetPresent = false;
//    // Connection detector class
//    ConnectionDetector cd;

    int ans;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.random_word);




        db = new DatabaseHelper(getApplicationContext());
        lst=new ArrayList<words>();
        tv=(TextView) findViewById(R.id.textview1);
        //tv.setText("Reached here");
        ans=0;
//        // creating connection detector class instance
//        cd = new ConnectionDetector(getApplicationContext());
//        isInternetPresent = cd.isConnectingToInternet();
//
//        // check for Internet status
//        if (isInternetPresent) {
//            // Internet Connection is Present
//            // make HTTP requests
//             new AlertDialog.Builder(this).setMessage("You have internet connection").show();
//
//        } else {
//            // Internet connection is not present
//            // Ask user to connect to Internet
//            new AlertDialog.Builder(this).setMessage("You don't have internet connection").show();
//        }


        new Title().execute();


    }

    public void clickme(View view)
    {
        try {

            Random rnd=new Random();
            int value=rnd.nextInt(999);
            ans=value;

            //new AlertDialog.Builder(this).setMessage(value).show();
            // Set title into TextView
            TextView txttitle = (TextView) findViewById(R.id.textview1);
            txttitle.setText("\t\t\t\t\t\t"+lst.get(value).words+"\n\n"+"Meaning :"+lst.get(value).meaning+"\n\n"+"Sentence :"+lst.get(value).sentence);
            //txttitle.setText(total);
            mProgressDialog.dismiss();
            //new AlertDialog.Builder(this).setMessage("Clicked me").show();
        }catch (Exception ex)
        {
            new AlertDialog.Builder(this).setMessage(""+ex).show();
        }
    }


    public  void clickme2(View view){
        // add a word here code
       // new AlertDialog.Builder(this).setMessage("clicked on add").show();

        try {


            //new AlertDialog.Builder(this).setMessage(ans).show();

                list = db.getAllStudentsList();
                int value1 = 0;

                for (StudentsModel sm : list) {
                    //value = value+"id: "+sm.id+", word: "+sm.word+" Meaning: "+sm.meaning+"Sentence:"+sm.sentence+"\n";
                    if (sm.word.equals(lst.get(ans).words)) {
                        //whenever the word is present in the database it will break the loop
                        value1 = 1;
                        break;
                    } else {
                        //new AlertDialog.Builder(this).setMessage("Word is not in database").show();
                        value1 = 0;
                    }
                }

                if (value1 == 0) {

                    StudentsModel student = new StudentsModel();
                    student.word = lst.get(ans).words;
                    student.meaning = lst.get(ans).meaning;
                    student.sentence = lst.get(ans).sentence;
                    db.addStudentDetail(student);
                    new AlertDialog.Builder(this).setTitle("Word List").setMessage("Word added to your list")
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {

                                public void onClick(DialogInterface arg0, int arg1) {
                                    // Some stuff to do when ok got clicked

                                }
                            }).show();
                } else {

                    new AlertDialog.Builder(this).setTitle("Word List").setMessage("Word is already added to your list")
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {

                                public void onClick(DialogInterface arg0, int arg1) {
                                    // Some stuff to do when ok got clicked

                                }
                            }).show();

            }
        }catch(Exception ex)
        {
            new AlertDialog.Builder(randomword.this).setMessage("" + ex).show();
        }


    }

    public  void clickme3(View view){
        // delete a word here code
        //new AlertDialog.Builder(this).setMessage("Clicked on delete").show();



            try {
                list = db.getAllStudentsList();

                int value = 0;
                for (StudentsModel sm : list) {

                    // new AlertDialog.Builder(this).setMessage("=="+sm.word+"=="+words.getText().toString()).show();
                    //new AlertDialog.Builder(this).setMessage("Word" +sm.word).show();
                    //value = value+"id: "+sm.id+", word: "+sm.word+" Meaning: "+sm.meaning+"Sentence:"+sm.sentence+"\n";
                    if (sm.word.equals(lst.get(ans).words)) {
                        //new AlertDialog.Builder(this).setMessage("Word is present in database").show();
                        value = 1;
                        break;
                    } else {
                        //new AlertDialog.Builder(this).setMessage("Word is not in database").show();
                        value = 0;
                    }

                }

                if (value == 1) {
                    //deleting code here has the word is present in the database
                    String std = lst.get(ans).words;
                    try {
                        db.deleteme(std);
                    } catch (Exception ex) {
                        new AlertDialog.Builder(this).setMessage("" + ex).show();
                    }


                    new AlertDialog.Builder(this).setTitle("Word List").setMessage("Word deleted successfully.")
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {

                                public void onClick(DialogInterface arg0, int arg1) {
                                    // Some stuff to do when ok got clicked

                                }
                            }).show();
                    //return true;

                } else {
                    //word is not present in the database show message here
                    new AlertDialog.Builder(this).setTitle("Word List").setMessage("Word is not present in the your list , please add the word before deleting it.")
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {

                                public void onClick(DialogInterface arg0, int arg1) {
                                    // Some stuff to do when ok got clicked

                                }
                            }).show();
                    //return true;
                }
            } catch (Exception ex) {
                //exception caught here
            }
        }


    public  void clickme4(View view){
        // navigate a word here code
        //new AlertDialog.Builder(this).setMessage("Clicked on navigate").show();
        Intent in=new Intent(randomword.this,addWord2.class);
        startActivity(in);
    }





    private class Title extends AsyncTask<Void, Void, Void> {



        String title="";
        String means="";
        String sent="";
        String total="";

        @Override
        protected void onPreExecute() {
            try {
                super.onPreExecute();
                mProgressDialog = new ProgressDialog(randomword.this);
                mProgressDialog.setTitle("Word List");
                mProgressDialog.setMessage("Loading a random word from the web...");
                mProgressDialog.setIndeterminate(false);
                mProgressDialog.show();
                mProgressDialog.setCancelable(false);
            }catch (Exception ex){
                new AlertDialog.Builder(getApplicationContext()).setMessage("ex"+ex).show();
            }
        }

        @Override
        protected Void doInBackground(Void... params) {
            try {
                // Connect to the web site
                Document document = Jsoup.connect(url).get();
                // Get the html document title
                //Elements el=document.select("li.entry learnable");
                //Element e1=document.getElementsByClass("entry learnable").first();
                //title=document.title();
                // title=document.title();

                // Elements links = document.getElementsByClass("entry learnable");
                //new AlertDialog.Builder(getApplicationContext()).setMessage(""+links).show();
//                for (Element link : links) {
//
//                    // get the value from href attribute
//                   title=title+link.text();
//                    new AlertDialog.Builder(getApplicationContext()).setMessage(""+link).show();
//
//                }

                int i=0;
                // Elements listTag=document.select("ol li div");
                Elements listTag =document.select("ol li");
                Elements headingItems=document.select("a");
                for (Element item : listTag) {
                    title=item.select("a").first().text();
                    sent=item.getElementsByClass("example").text();//works for meaning
                    means=item.getElementsByClass("definition").text();//works for defination
                    //Elements req=item.getElementsByClass(".word dynamictext");
                    //title=title+"------------"+req.text();
                    total=title+"\n"+means+"\n"+sent+"\n";
                    lst.add(new words(i,title,means,sent));
                    i++;
                }


            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            try {
                Random rnd = new Random();
                int value = rnd.nextInt(999);
                ans=value;
                // Set title into TextView
                TextView txttitle = (TextView) findViewById(R.id.textview1);
                // txttitle.setText(lst.get(value).id +"\n"+lst.get(value).words+"\n"+lst.get(value).meaning+"\n"+lst.get(value).sentence);
                txttitle.setText("\t\t\t\t\t\t"+lst.get(value).words+"\n\n"+"Meaning :"+lst.get(value).meaning+"\n\n"+"Sentence :"+lst.get(value).sentence);
                //txttitle.setText(total);
                mProgressDialog.dismiss();
            }catch (Exception ex){
                new AlertDialog.Builder(getApplicationContext()).setMessage("ex"+ex).show();
            }
        }
    }

    public class words {
        public int id;
        public String words;
        public String meaning;
        public String sentence;

        public words(int id, String words, String meaning, String sentence) {
            this.id = id;
            this.words = words;
            this.meaning = meaning;
            this.sentence = sentence;
        }
    }
}
