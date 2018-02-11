package org.wordlist.navneet.wordapplication;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.navneet.wordapplication.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Navneet on 7/23/2015.
 */
public class quiz extends Activity {

    String name="";
    String pass="";
    DatabaseHelper2 db2;
    DatabaseHelper3 db3;
    List<StudentsModel2> list2=new ArrayList<StudentsModel2>();
    List<StudentsModel3> list3=new ArrayList<StudentsModel3>();
    List<data> lst=new ArrayList<data>();
    List<String> other_word=new ArrayList<String>();
    TextView tv;
    Button btn1;
    Button btn2;
    int score=0;
    int index=0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz);

        Intent in=getIntent();
        name=in.getStringExtra("val");
        pass=in.getStringExtra("val");


        tv=(TextView) findViewById(R.id.word);
        btn1=(Button) findViewById(R.id.opt1);
        btn2=(Button) findViewById(R.id.opt2);

        db2 = new DatabaseHelper2(getApplicationContext());
        db3 = new DatabaseHelper3(getApplicationContext());

        other_word.add("deem to be");
        other_word.add("infinitely or immeasurably small");
        other_word.add("concurrence of opinion");
        other_word.add("have in mind as a purpose");
        other_word.add("perform an act");
        other_word.add("move towards");
        other_word.add("set up or found");
        other_word.add("without qualification");
        other_word.add("come into possession of");
        other_word.add("deficient in quantity ");
        other_word.add("without a break");
        other_word.add("see in one's mind");
        other_word.add("assign a duty");
        other_word.add("unproductive of success");
        other_word.add("a planned undertaking");




        new AlertDialog.Builder(this).setTitle("Rules And Regulations").setMessage("1.Only those words that are added to the quiz will appear in the quiz. \n 2.Its a self assessment test to make sure that that you memorized what you have read. \n 3.Process is simple, a word will appear and you have to choose the correct meaning, if you choose the correct answer you get a point. \n 4.You can view your progress in the progress stat page.").show();


        try {
            list3 = db3.getAllStudentsList();
            String word="";
            for(StudentsModel3 sm : list3){
                //value = value+"id: "+sm.id+", word: "+sm.word+" Meaning: "+sm.meaning+"Sentence:"+sm.sentence+"\n";
                word=word+sm.word+"\n"+sm.meaning+"\n"+sm.sentence;
            }
            //new AlertDialog.Builder(this).setMessage(word).show();
        }catch (Exception ex)
        {
            new AlertDialog.Builder(this).setMessage(""+ex).show();
        }


        try {
            list2=db2.getAllStudentsLista(name);
            String word = "";
            for(StudentsModel2 sm : list2){
                //value = value+"id: "+sm.id+", word: "+sm.word+" Meaning: "+sm.meaning+"Sentence:"+sm.sentence+"\n";
//                Random rnd=new Random();
//                int me=rnd.nextInt(2);
                //word=word+sm.word+"-----"+sm.meaning+"------"+me+"\n";

                //adding all the words obtained by the database in a list
                lst.add(new data(sm.word,sm.meaning,sm.sentence));
            }
           // new AlertDialog.Builder(this).setMessage(word).show();

            Random rnd=new Random();
                int me=rnd.nextInt(2);

            Random other=new Random();
            int oth=other.nextInt(7);

            index=0;
            if(me==0){
                tv.setText(lst.get(0).word);
                btn1.setText(lst.get(0).meaning);
                //btn2.setText(lst.get(0).sentence);
                btn2.setText(other_word.get(oth));
            }else{
                tv.setText(lst.get(0).word);
                btn2.setText(lst.get(0).meaning);
                //btn1.setText(lst.get(0).sentence);
                btn1.setText(other_word.get(oth));
            }



        }catch (Exception ex)
        {
            new AlertDialog.Builder(this).setMessage("" + ex).show();
        }

//        new AlertDialog.Builder(this).setTitle("Rues and regulations").setMessage("Word added to quiz")
//                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
//                    public void onClick(DialogInterface arg0, int arg1) {
//                        // Some stuff to do when ok got clicked
//                    }
//                }).show();
        //return true;
    }

    // create a class for the list here

    public class data{
        public String word;
        public String meaning;
        public String sentence;

        public data(){}

        public data(String word, String meaning, String sentence){
            this.word=word;
            this.meaning=meaning;
            this.sentence=sentence;
        }
    }

    public void opt1click(View view)
    {
        //new AlertDialog.Builder(this).setMessage("Clicked on opt1").show();

       try {

           checkans();
           nextword();
       }catch (Exception ex)
       {

           try {
               StudentsModel3 student3 = new StudentsModel3();
               student3.word = name;
               student3.meaning = String.valueOf(score);
               student3.sentence = String.valueOf(index);
               db3.addStudentDetail(student3);


               new AlertDialog.Builder(this).setTitle("Game Over").setMessage("You have scored: " + score + "/" + index).setCancelable(false)
                       .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                           public void onClick(DialogInterface dialog, int id) {
                               Intent in = new Intent();
                               in.setClass(quiz.this,MainActivity.class);
                               startActivity(in);
                           }
                       }).show();


           }catch (Exception ex1)
           {
               new AlertDialog.Builder(quiz.this).setMessage(""+ex1).show();
           }
       }
    }

    private void nextword() {
        index++;
        tv.setText(lst.get(index).word);
        Random rnd=new Random();
        int rr=rnd.nextInt(2);

        Random other=new Random();
        int oth=other.nextInt(14);

        if(rr==0){
            btn1.setText(lst.get(index).meaning);
           // btn2.setText(lst.get(index).sentence);
            btn2.setText(other_word.get(oth));
        }else{
            btn2.setText(lst.get(index).meaning);
           // btn1.setText(lst.get(index).sentence);
            btn1.setText(other_word.get(oth));
        }
    }

    private void checkans() {

            if (lst.get(index).meaning.toLowerCase().equals(btn1.getText().toString().toLowerCase())) {
                score++;
                Toast.makeText(this, "Correct ans", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Incorrect ans", Toast.LENGTH_SHORT).show();
            }

    }

    public void opt2click(View view){
        try {

            checkans2();
            nextword();
        }catch (Exception ex)
        {
           // new AlertDialog.Builder(this).setTitle("Game Over").setMessage("You have scored: "+score+"/"+index).show();
            new AlertDialog.Builder(this).setTitle("Game Over").setMessage("You have scored: " + score + "/" + index).setCancelable(false)
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            Intent in = new Intent();
                            in.setClass(quiz.this,MainActivity.class);
                            startActivity(in);
                        }
                    }).show();
           // new AlertDialog.Builder(this).setTitle("Game Over").setMessage("You have scored: "+score+"/"+index).show();
            try {
                StudentsModel3 student = new StudentsModel3();
                student.word = name;
                student.meaning = String.valueOf(score);
                student.sentence = String.valueOf(index);
                db3.addStudentDetail(student);
            }catch (Exception ex1)
            {
                new AlertDialog.Builder(quiz.this).setMessage(""+ex1).show();
            }
        }
    }

    private void checkans2() {

            if (lst.get(index).meaning.toLowerCase().equals(btn2.getText().toString().toLowerCase())) {
                score++;
                Toast.makeText(this, "Correct ans", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Incorrect ans", Toast.LENGTH_SHORT).show();
            }

    }


}
