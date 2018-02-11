package org.wordlist.navneet.wordapplication;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.navneet.wordapplication.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Navneet on 7/14/2015.
 */
public class addWord2 extends Activity {

    List<StudentsModel> list=new ArrayList<StudentsModel>();
    DatabaseHelper db;
    TextView tv;
    List<SimpleList2> lst1=new ArrayList<SimpleList2>();
    ArrayList<String> lst=new ArrayList<String>();

    StudentsModel std[];
    SimpleList2 simpleList2[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_word_2);
        try{
            db = new DatabaseHelper(getApplicationContext());
            // tv = (TextView) findViewById(R.id.show);
            list = db.getAllStudentsList();

           // new AlertDialog.Builder(this).setMessage(""+list.size()).show();
            //simpleList2=db.getAllStudentsList();


            for (int i = 0; i < list.size(); i++) {
                lst1.add(new SimpleList2(list.get(i).id,list.get(i).word,list.get(i).meaning,list.get(i).sentence));
            }

//
             simpleList2=new SimpleList2[list.size()];

            //simpleList2=new SimpleList2[]{
            for (int i = 0; i < list.size(); i++) {
                simpleList2[i] = new SimpleList2(list.get(i).id, list.get(i).word, list.get(i).meaning, list.get(i).sentence);

            }


            ListAdapter listAdapter=new CustomAdapter_addWord(this,simpleList2);

            ListView list=(ListView)findViewById(R.id.show);
            list.setAdapter(listAdapter);


            list.setOnItemClickListener(
                    new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                            //String str=String.valueOf(parent.getItemAtPosition(position));
                            //Toast.makeText(MainActivity.this, simpleList[position].words+ simpleList[position].meanings, Toast.LENGTH_SHORT).show();
                            final String word=simpleList2[position].words;
                            final String mean=simpleList2[position].meanings;
                            final String sent=simpleList2[position].sentence;


                            Intent i=new Intent(addWord2.this,Details.class);
                            i.putExtra("word",word);
                            i.putExtra("mean",mean);
                            i.putExtra("sent",sent);

                            startActivity(i);

                        }
                    }
            );



        }catch (Exception ex){
            new AlertDialog.Builder(this).setMessage(""+ex).show();
        }



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
