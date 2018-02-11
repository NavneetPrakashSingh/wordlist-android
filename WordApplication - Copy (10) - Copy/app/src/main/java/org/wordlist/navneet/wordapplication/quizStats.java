package org.wordlist.navneet.wordapplication;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.navneet.wordapplication.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Navneet on 7/26/2015.
 */
public class quizStats extends Activity {

    DatabaseHelper3 db3;
    List<StudentsModel3> list=new ArrayList<StudentsModel3>();
    ArrayList<String> lst=new ArrayList<String>();
    SimpleList2 simpleList2[];
    List<SimpleList2> lst1=new ArrayList<SimpleList2>();

    String name="";
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz_stats);

        try {



            Intent in = getIntent();
            name = in.getStringExtra("val");
            db3 = new DatabaseHelper3(getApplicationContext());


            // tv = (TextView) findViewById(R.id.show);
            //list = db3.getAllStudentsList();
            //getAllStudentsLista
            list = db3.getAllStudentsLista(name);

            if(list.size()==0) {
                //If the list is empty then display message that no scores to display
                new AlertDialog.Builder(this).setTitle("Word List : Quiz Stats Zone").setMessage("Looks like you haven't taken any quizzes,so we don't have any results to display, please make sure you take some quizzess and then monitor your progress.")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {

                            public void onClick(DialogInterface arg0, int arg1) {
                                // Some stuff to do when ok got clicked
                                Intent in = new Intent();
                                in.setClass(quizStats.this, AlphaGrid.class);
                                startActivity(in);

                            }
                        }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface arg0, int arg1) {
                        // Some stuff to do when ok got clicked
                        Intent in = new Intent();
                        in.setClass(quizStats.this, AlphaGrid.class);
                        startActivity(in);

                    }
                }).setCancelable(false).show();
                // TextView txt=(TextView) findViewById(R.id.stats);
            }else {

                for (int i = 0; i < list.size(); i++) {
                    lst1.add(new SimpleList2(list.get(i).id, list.get(i).word, list.get(i).meaning, list.get(i).sentence));
                }

//
                simpleList2 = new SimpleList2[list.size()];
                String str = "";

                //simpleList2=new SimpleList2[]{
                for (int i = 0; i < list.size(); i++) {
                    simpleList2[i] = new SimpleList2(list.get(i).id, list.get(i).word, list.get(i).meaning, list.get(i).sentence);

                    str = list.get(i).word + "--" + list.get(i).meaning + "---" + list.get(i).sentence;

                }

                // new AlertDialog.Builder(this).setMessage("" + str).show();


                ListAdapter listAdapter = new CustomAdapter_quizstats(this, simpleList2);

                ListView list = (ListView) findViewById(R.id.list1);
                list.setAdapter(listAdapter);
            }
        }catch (Exception ex){
            new AlertDialog.Builder(this).setMessage(""+ex).show();
        }



//        try {
//            //list = db3.getAllStudentsList();
//            String word="";
//            for(StudentsModel3 sm : list3){
//                //value = value+"id: "+sm.id+", word: "+sm.word+" Meaning: "+sm.meaning+"Sentence:"+sm.sentence+"\n";
//                word=word+sm.word+"\n"+sm.meaning+"\n"+sm.sentence;
//            }
//
//            txt.setText(word);
//            new AlertDialog.Builder(this).setMessage(word).show();
//        }catch (Exception ex)
//        {
//            new AlertDialog.Builder(this).setMessage(""+ex).show();
//        }


    }

    public class SimpleList2{
        public String words;
        public String meanings;
        public String sentence;
        public int id;

        public SimpleList2(){}

        public SimpleList2(int id,String word, String meaning, String sentence ){
            this.id=id;
            this.words=word;
            this.meanings=meaning;
            this.sentence=sentence;

        }
    }
}
