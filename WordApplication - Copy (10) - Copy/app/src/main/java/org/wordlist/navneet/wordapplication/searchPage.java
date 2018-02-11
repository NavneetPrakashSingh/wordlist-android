package org.wordlist.navneet.wordapplication;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.navneet.wordapplication.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.List;
import java.util.Random;

/**
 * Created by Navneet on 8/7/2015.
 */
public class searchPage extends Activity {


    TextView tv;
    ProgressDialog mProgressDialog;
    EditText et;
    // String str="adverse";
    String url="";
    List<words> lst;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_page);

        tv=(TextView) findViewById(R.id.textview1);

        try {
            AdView mAdView = (AdView) findViewById(R.id.adView);
            AdRequest adRequest = new AdRequest.Builder()
                    .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                    .build();
            mAdView.loadAd(adRequest);
            //new AlertDialog.Builder(this).setMessage(""+adRequest).show();
        }catch (Exception ex){
            new AlertDialog.Builder(this).setMessage("Ex "+ex).show();
        }


    }

    public void clickme(View view)
    {
        try {
            et=(EditText) findViewById(R.id.edittext);
            // url = "http://www.bing.com/search?q="+et;

            //String str="adverse";
            url="http://www.bing.com/search?q="+et.getText().toString()+"+meaning";
            new Title().execute();
            //new AlertDialog.Builder(this).setMessage("Clicked me").show();
        }catch (Exception ex)
        {
            new AlertDialog.Builder(this).setMessage(""+ex).show();
        }
    }

    private class Title extends AsyncTask<Void, Void, Void> {
        String title="";
        String means="";
        String sent="";
        String total="";

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            mProgressDialog = new ProgressDialog(searchPage.this);
            mProgressDialog.setTitle("Word List");
            mProgressDialog.setMessage("Loading...");
            mProgressDialog.setIndeterminate(false);
            mProgressDialog.show();
        }

        @Override
        protected Void doInBackground(Void... params) {
            try {
                // Connect to the web site
                Document document = Jsoup.connect(url).get();


                int i=0;
                //3 loops will be required for this

                Elements meant =document.select("ol li div div ol");//this works great for meaning
                for (Element item : meant) {
                    means = item.select("div").first().text();//gets the meaning
                    sent = item.getElementsByClass("b_demoteText").text();//gets the sentence and synonym
                }

                Elements meant2 =document.select("ol li div ol li");//this works great for meaning
                for (Element item : meant2) {
                    means = item.select("div").first().text();//gets the meaning
                    sent = item.getElementsByClass("b_demoteText").text();//gets the sentence and synonym
                }

                //for the word
//                Elements word =document.select("ol li div");//this works great for word
//                for (Element item : word) {
//                    //start here
//                    title=item.getElementsByClass("b_focusTextSmall").text();//get the word
//                }

                //Elements meant =document.select("ol li div div ol");//this works great for meaning
//                Elements meant =document.select("ol li div ol li");//this works great for meaning
//                for (Element item : meant) {
//                    means=item.select("div").first().text();//gets the meaning
//                    sent=item.getElementsByClass("b_demoteText").text();//gets the sentence and synonym
//                }


//                //Elements listTag =document.select("ol li");//this works great for word
//                //Elements listTag =document.select("ol li div div ol");//this works great for meaning
//                Elements listTag =document.select("ol li div div ol ");//this works great for sentence
//
//                for (Element item : listTag) {
////
//                    //start here
//
//                    //total=total+"--- \n"+item.getElementsByClass("b_focusTextSmall").text();//get the word
//                    //total="--"+item.select("div").first().text();//gets the meaning
//                    //total="--"+item.getElementsByClass("b_demoteText").text();//gets the sentence and synonym
//                   // lst.add(new words(i,title,means,sent));
//                    //i++;
//                }


            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            //super.onPostExecute(result);
            Random rnd=new Random();
            int value=rnd.nextInt(999);
            // Set title into TextView
            TextView textview1 = (TextView) findViewById(R.id.textview1);
            TextView textview2=(TextView) findViewById(R.id.textview2);
            TextView textvew3=(TextView) findViewById(R.id.textview3);
            //txttitle.setText(lst.get(value).id +"\n"+lst.get(value).words+"\n"+lst.get(value).meaning+"\n"+lst.get(value).sentence);
            textview1.setText(title);
            textview2.setText(means);
            textvew3.setText(sent);

            mProgressDialog.dismiss();
        }
    }

    public class words{
        public int id;
        public String words;
        public String meaning;
        public String sentence;

        public words( int id,String words,String meaning, String sentence)
        {
            this.id=id;
            this.words=words;
            this.meaning=meaning;
            this.sentence=sentence;
        }
    }
}
