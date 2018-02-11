package org.wordlist.navneet.wordapplication;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.navneet.wordapplication.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Navneet on 7/21/2015.
 */
public class fifthscreen extends Fragment implements View.OnClickListener {

    //DatabaseHelper1 db;
    DatabaseHelper1 db;
    List<StudentsModel1> list=new ArrayList<StudentsModel1>();
    List<SimpleList2> lst1=new ArrayList<SimpleList2>();

    Button btn;
    SimpleList2 simpleList[];

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fifth_screen,container,false);
       // fifthscreenfunction();
        btn=(Button) view.findViewById(R.id.refresh);
        btn.setOnClickListener(this);

        return view;


    }

    @Override
    public void onClick(View v) {

        fifthscreenfunction();

        //Toast.makeText(this.getActivity(),
          //      "Button is clicked!", Toast.LENGTH_LONG).show();

    }

    private void fifthscreenfunction() {

        try {
            db = new DatabaseHelper1(getActivity());
            // tv = (TextView) findViewById(R.id.show);
            list = db.getAllStudentsList();

            if(list.size()==0){
                new AlertDialog.Builder(getActivity()).setMessage("You haven't added any word to the favourite list, please make sure you add some words and then refresh the list").show();
            }else{

            }
           // new AlertDialog.Builder(getActivity()).setMessage("" + list.size()).show();
            //simpleList2=db.getAllStudentsList();

//
            for (int i = 0; i < list.size(); i++) {
                lst1.add(new SimpleList2(list.get(i).id,list.get(i).word,list.get(i).meaning,list.get(i).sentence));
            }

//
            simpleList=new SimpleList2[list.size()];

            // simpleList2=new SimpleList2[list.size()];

            for (int i = 0; i < list.size(); i++) {
                simpleList[i] = new SimpleList2(list.get(i).id, list.get(i).word, list.get(i).meaning, list.get(i).sentence);

            }

//            simpleList = new SimpleList2[]{
//                    new SimpleList2(0, "abbreviate", "shorten", "Because we were running out of time , the lecturer had to abbreviate her speech."),
//                    new SimpleList2(1, "abate", "subside or moderate", "Rather than leaving immediately, they waited for the storm to abate"),
//                    new SimpleList2(2, "abortive", "unsuccessful or fruitless", "We had to abandon our abortive attempts"),
//                    new SimpleList2(3, "absolute", "complete,totally unlimited,certain", "Although the king of Siam was an absolute monarch, he did not want to behead his unfaithful wife")
//            };


            ListAdapter listAdapter = new CustomAdapter_fifthscreen(getActivity(), simpleList);

           // ListView somethning= (ListView)

            ListView list = (ListView) getView().findViewById(R.id.show1);
            //ListView list=(ListView) getFragmentManager().findFragmentById(R.layout.fifth_screen).getView().findViewById(R.id.show1);
            list.setAdapter(listAdapter);


        }catch (Exception ex){
            new AlertDialog.Builder(getActivity()).setMessage(""+ex).show();
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
