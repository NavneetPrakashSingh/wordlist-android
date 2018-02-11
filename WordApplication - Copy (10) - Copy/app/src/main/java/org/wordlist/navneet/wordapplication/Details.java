package org.wordlist.navneet.wordapplication;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.navneet.wordapplication.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Created by Navneet on 7/14/2015.
 */
public class Details extends ActionBarActivity implements TextToSpeech.OnInitListener{

    String name="";
    String meaning="";
    String sentence="";
    DatabaseHelper1 db;
    DatabaseHelper2 db2;
    List<StudentsModel1> list=new ArrayList<StudentsModel1>();
    List<StudentsModel2> list2=new ArrayList<StudentsModel2>();
    TextView tv;

   // private EditText txtText;
    private TextToSpeech tts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        db = new DatabaseHelper1(getApplicationContext());
        db2 = new DatabaseHelper2(getApplicationContext());
        tv=(TextView) findViewById(R.id.data);

        Intent in=getIntent();
         name=in.getStringExtra("word");
         meaning=in.getStringExtra("mean");
        sentence=in.getStringExtra("sent");

        TextView view=(TextView)findViewById(R.id.word_text);
        TextView view2=(TextView)findViewById(R.id.meaning_text);
        TextView view3=(TextView) findViewById(R.id.sentence);
        view.setText(name);
        view2.setText(meaning);
        view3.setText(sentence);


        //quiz list
        try {
            String str1="a";
            list2=db2.getAllStudentsList();
            String word = "";
            for(StudentsModel2 sm : list2){
                //value = value+"id: "+sm.id+", word: "+sm.word+" Meaning: "+sm.meaning+"Sentence:"+sm.sentence+"\n";
               // word=word+sm.word+"\n";
                if(name.equals(sm.word)){
                   // new AlertDialog.Builder(this).setMessage("Its in the list").show();
                    ImageView quiz_img=(ImageView) findViewById(R.id.image);
                    quiz_img.setVisibility(view.VISIBLE);
                    break;
                }else{
                    //new AlertDialog.Builder(this).setMessage("Its not in the list").show();
                    ImageView quiz_img=(ImageView) findViewById(R.id.image);
                    quiz_img.setVisibility(view.GONE);
                }
            }
           // new AlertDialog.Builder(this).setMessage(word).show();

        }catch (Exception ex)
        {
            new AlertDialog.Builder(Details.this).setMessage(""+ex).show();
        }


        //display button if its in favorite list
        try {
            list = db.getAllStudentsList();
            //print(list);
            for(StudentsModel1 sm: list){
                //new AlertDialog.Builder(Details.this).setMessage("fav\n"+sm.word).show();
                if(name.equals(sm.word)) {
                    ImageView quiz_img = (ImageView) findViewById(R.id.image2);
                    quiz_img.setVisibility(view.VISIBLE);
                    break;
                }else{
                    ImageView quiz_img=(ImageView) findViewById(R.id.image2);
                    quiz_img.setVisibility(view.GONE);
                }
            }

        }catch (Exception ex)
        {
            new AlertDialog.Builder(Details.this).setMessage(""+ex).show();
        }

        tts = new TextToSpeech(this, this);

    }

    public void speak(View view){
       // new AlertDialog.Builder(this).setMessage("Clicked here").show();
        tts.speak(name, TextToSpeech.QUEUE_FLUSH, null);
        //speakOut();
    }

//    private void speakOut() {
//       // new AlertDialog.Builder(this).setMessage(""+name).show();
//
//    }

    @Override
    public void onDestroy() {
        // Don't forget to shutdown tts!
        if (tts != null) {
            tts.stop();
            tts.shutdown();
        }
        super.onDestroy();
    }

    @Override
    public void onInit(int status) {

        if (status == TextToSpeech.SUCCESS) {

            int result = tts.setLanguage(Locale.US);

            if (result == TextToSpeech.LANG_MISSING_DATA
                    || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                Log.e("TTS", "This Language is not supported");
            } else {
                //btnSpeak.setEnabled(true);
                //speakOut();
            }

        } else {
            Log.e("TTS", "Initilization Failed!");
        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_details, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.addwordtoquiz) {

            try {
                list2=db2.getAllStudentsList();
                int value=0;
                for(StudentsModel2 sm : list2){
                    //value = value+"id: "+sm.id+", word: "+sm.word+" Meaning: "+sm.meaning+"Sentence:"+sm.sentence+"\n";
                   if(sm.word.equals(name)){
                       //whenever the word is present in the database it will break the loop
                       value=1;
                       break;
                   }else
                   {
                       //new AlertDialog.Builder(this).setMessage("Word is not in database").show();
                       value=0;
                   }
                }

                if(value==1)
                {
                    //since the word is present in the database show a message here
                    new AlertDialog.Builder(this).setTitle("Word List").setMessage("Word is present in the quiz list")
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {

                                public void onClick(DialogInterface arg0, int arg1) {
                                    // Some stuff to do when ok got clicked

                                }
                            }).show();
                    return true;
                }else {
                    StudentsModel2 student2=new StudentsModel2();
                    student2.word=name;
                    student2.meaning=meaning;
                    student2.sentence=sentence;
                    db2.addStudentDetail(student2);

                    ImageView quiz_img = (ImageView) findViewById(R.id.image);
                    quiz_img.setVisibility(View.VISIBLE);

                    new AlertDialog.Builder(this).setTitle("Word List").setMessage("Word added to quiz")
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {

                                public void onClick(DialogInterface arg0, int arg1) {
                                    // Some stuff to do when ok got clicked
                                }

                            }).show();
                    return true;
                }


            }catch (Exception ex)
            {
                new AlertDialog.Builder(Details.this).setMessage(""+ex).show();
            }






        }else if(id == R.id.addwordtofavourite){

            list=db.getAllStudentsList();

            //new AlertDialog.Builder(this).setMessage("Reached here").show();

            int value=0;
            for(StudentsModel1 sm : list){
                //new AlertDialog.Builder(this).setMessage("Word" +sm.word).show();
                //value = value+"id: "+sm.id+", word: "+sm.word+" Meaning: "+sm.meaning+"Sentence:"+sm.sentence+"\n";
               if(sm.word.equals(name))
               {
                   //new AlertDialog.Builder(this).setMessage("Word is present in database").show();
                   value=1;
                   break;
               }else
               {
                   //new AlertDialog.Builder(this).setMessage("Word is not in database").show();
                   value=0;
               }

            }

            if(value==1)
            {
                new AlertDialog.Builder(this).setTitle("Word List").setMessage("Word is present in the favorite list")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {

                            public void onClick(DialogInterface arg0, int arg1) {
                                // Some stuff to do when ok got clicked

                            }
                        }).show();
                return true;
            }else {
                try {
                    StudentsModel1 student1 = new StudentsModel1();
                    student1.word = name;
                    student1.meaning = meaning;
                    student1.sentence=sentence;
                    // student.sentence = sentences.getText().toString();
                    db.addStudentDetail(student1);

                    ImageView quiz_img = (ImageView) findViewById(R.id.image2);
                    quiz_img.setVisibility(View.VISIBLE);
                }catch (Exception ex)
                {
                    new AlertDialog.Builder(Details.this).setMessage(""+ex).show();
                }

                new AlertDialog.Builder(this).setTitle("Word List").setMessage("Word added to favorite")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {

                            public void onClick(DialogInterface arg0, int arg1) {
                                // Some stuff to do when ok got clicked

                            }
                        }).show();
                return true;


                //new AlertDialog.Builder(this).setMessage("Word is present in database").show();
            }
            //}




        }else if(id == R.id.deletewordfromquiz){
            list2=db2.getAllStudentsList();

            //new AlertDialog.Builder(this).setMessage("Reached here").show();

            int value=0;
            for(StudentsModel2 sm : list2){
                //new AlertDialog.Builder(this).setMessage("Word" +sm.word).show();
                //value = value+"id: "+sm.id+", word: "+sm.word+" Meaning: "+sm.meaning+"Sentence:"+sm.sentence+"\n";
                if(sm.word.equals(name))
                {
                    //since the word is present in the database we need to delete it
                    //new AlertDialog.Builder(this).setMessage("Word is present in database").show();
                    value=1;
                    break;
                }else
                {
                    //new AlertDialog.Builder(this).setMessage("Word is not in database").show();
                    value=0;
                }

            }

            if(value==1) {
                //deleting code here has the word is present in the database
                try {
                    String str = name;
                    db2.deleteme(str);
                }catch (Exception ex)
                {
                    new AlertDialog.Builder(this).setMessage("Error" + ex).show();
                }

                //favimage gone/hide
                ImageView quiz_img = (ImageView) findViewById(R.id.image);
                quiz_img.setVisibility(View.GONE);

                new AlertDialog.Builder(this).setMessage("Word deleted successfully").show();
            }else{
                //word is not present in the database
                new AlertDialog.Builder(this).setTitle("Word List").setMessage("Word is not present in the quiz list, please add the word before deleting it.") .setPositiveButton("OK", new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface arg0, int arg1) {
                        // Some stuff to do when ok got clicked

                    }
                }).show();

            }


        }else if(id == R.id.deletewordfromfavourite){

            list=db.getAllStudentsList();

            //new AlertDialog.Builder(this).setMessage("Reached here").show();

            int value=0;
            for(StudentsModel1 sm : list){
                //new AlertDialog.Builder(this).setMessage("Word" +sm.word).show();
                //value = value+"id: "+sm.id+", word: "+sm.word+" Meaning: "+sm.meaning+"Sentence:"+sm.sentence+"\n";
                if(sm.word.equals(name))
                {
                    //new AlertDialog.Builder(this).setMessage("Word is present in database").show();
                    value=1;
                    break;
                }else
                {
                    //new AlertDialog.Builder(this).setMessage("Word is not in database").show();
                    value=0;
                }

            }

            if(value==1)
            {
                //deleting code here has the word is present in the database
                String std= name;
                try {
                    db.deleteme(std);
                }catch (Exception ex){
                    new AlertDialog.Builder(this).setMessage(""+ex).show();
                }

                ImageView quiz_img = (ImageView) findViewById(R.id.image2);
                quiz_img.setVisibility(View.GONE);

                new AlertDialog.Builder(this).setTitle("Word List").setMessage("Word successfully deleted from the favorite list")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {

                            public void onClick(DialogInterface arg0, int arg1) {
                                // Some stuff to do when ok got clicked

                            }
                        }).show();
                return true;
            }else{
                //word is not present in the database show message here
                new AlertDialog.Builder(this).setTitle("Word List").setMessage("Word is not present in the favorite list , please add the word before deleting it.")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {

                            public void onClick(DialogInterface arg0, int arg1) {
                                // Some stuff to do when ok got clicked

                            }
                        }).show();
                return true;
            }


           // Toast.makeText(this,"Word deleted from favourite list",Toast.LENGTH_SHORT).show();

        }
//        else if(id==R.id.showme){
//            try {
//                list = db.getAllStudentsList();
//                //print(list);
//                for(StudentsModel1 sm: list){
//                    new AlertDialog.Builder(Details.this).setMessage("fav\n"+sm.word).show();
//                }
//
//            }catch (Exception ex)
//            {
//                new AlertDialog.Builder(Details.this).setMessage(""+ex).show();
//            }
//        }else if(id==R.id.showquiz)
//        {
//
//        }

        return super.onOptionsItemSelected(item);
    }
    private void print(List<StudentsModel1> list) {
        list=db.getAllStudentsList();
        String word = "";
        for(StudentsModel1 sm : list){
            //value = value+"id: "+sm.id+", word: "+sm.word+" Meaning: "+sm.meaning+"Sentence:"+sm.sentence+"\n";
            word=word+sm.word+"\n";

        }
        tv.setText(word);
    }
}
