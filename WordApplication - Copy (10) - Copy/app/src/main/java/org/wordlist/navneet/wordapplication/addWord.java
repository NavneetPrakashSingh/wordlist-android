package org.wordlist.navneet.wordapplication;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.navneet.wordapplication.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Navneet on 7/14/2015.
 */
public class addWord extends Activity {

    List<StudentsModel> list=new ArrayList<StudentsModel>();
    DatabaseHelper db;
    EditText words,meanings,sentences;
    TextView tv;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_word);

        db = new DatabaseHelper(getApplicationContext());
        words=(EditText) findViewById(R.id.editword);
        meanings=(EditText) findViewById(R.id.editmeaning);
        sentences=(EditText) findViewById(R.id.editsentence);
        tv=(TextView) findViewById(R.id.show);

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

    public void addbtn(View view){
        try {

            if (words.getText().toString().trim().equals("") || meanings.getText().toString().trim().equals("") || sentences.getText().toString().trim().equals("")) {
                new AlertDialog.Builder(this).setTitle("Word List").setMessage("Looks like one of your input fields are empty. Please check again and then add ")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {

                            public void onClick(DialogInterface arg0, int arg1) {
                                // Some stuff to do when ok got clicked

                            }
                        }).show();
            } else {

                list = db.getAllStudentsList();
                int value = 0;

                for (StudentsModel sm : list) {
                    //value = value+"id: "+sm.id+", word: "+sm.word+" Meaning: "+sm.meaning+"Sentence:"+sm.sentence+"\n";
                    if (sm.word.equals(words.getText().toString())) {
                        //whenever the word is present in the database it will break the loop
                        value = 1;
                        break;
                    } else {
                        //new AlertDialog.Builder(this).setMessage("Word is not in database").show();
                        value = 0;
                    }
                }

                if (value == 0) {

                    StudentsModel student = new StudentsModel();
                    student.word = words.getText().toString();
                    student.meaning = meanings.getText().toString();
                    student.sentence = sentences.getText().toString();
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
            }
            }catch(Exception ex)
            {
                new AlertDialog.Builder(addWord.this).setMessage("" + ex).show();
            }

            //new AlertDialog.Builder(addWord.this).setMessage("Word added successfully").show();

    }
    public void deletebtn(View view){
        //new AlertDialog.Builder(addWord.this).setMessage("Reached in deleted").show();

        if (words.getText().toString().trim().equals("") || meanings.getText().toString().trim().equals("") || sentences.getText().toString().trim().equals("")) {
            new AlertDialog.Builder(this).setTitle("Word List").setMessage("Looks like one of your input fields are empty. Please check again and then delete ")
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {

                        public void onClick(DialogInterface arg0, int arg1) {
                            // Some stuff to do when ok got clicked

                        }
                    }).show();
        } else {

            try {
                list = db.getAllStudentsList();

                int value = 0;
                for (StudentsModel sm : list) {

                    // new AlertDialog.Builder(this).setMessage("=="+sm.word+"=="+words.getText().toString()).show();
                    //new AlertDialog.Builder(this).setMessage("Word" +sm.word).show();
                    //value = value+"id: "+sm.id+", word: "+sm.word+" Meaning: "+sm.meaning+"Sentence:"+sm.sentence+"\n";
                    if (sm.word.equals(words.getText().toString())) {
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
                    String std = words.getText().toString();
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

    }
    public void updatebtn(View view){
        try {
            list = db.getAllStudentsList();
            print(list);
            new AlertDialog.Builder(addWord.this).setMessage("Reached in update").show();
        }catch (Exception ex)
        {
            new AlertDialog.Builder(addWord.this).setMessage(""+ex).show();
        }
    }
    public void navigatebtn(View view){
//print(list);
  //      new AlertDialog.Builder(addWord.this).setMessage("Reached in navigated").show();
        try{
            Intent in=new Intent(addWord.this,addWord2.class);
            startActivity(in);
        }catch (Exception ex){
            new AlertDialog.Builder(addWord.this).setMessage("" + ex).show();
        }

    }


    private void print(List<StudentsModel> list) {
        list=db.getAllStudentsList();
        String word = "";
        for(StudentsModel sm : list){
            //value = value+"id: "+sm.id+", word: "+sm.word+" Meaning: "+sm.meaning+"Sentence:"+sm.sentence+"\n";
            word=word+sm.sentence+"\n";

        }
        tv.setText(word);
    }

}
