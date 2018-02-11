package org.wordlist.navneet.wordapplication;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.navneet.wordapplication.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Navneet on 7/13/2015.
 */
public class x_main extends ActionBarActivity {
    // private TextView resultText;
    private ListView myList;
    SimpleList simpleList[];
    DatabaseHelper2 db2;
    List<StudentsModel2> list2=new ArrayList<StudentsModel2>();
    // private ArrayList<SimpleList> alist=new ArrayList<SimpleList>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.x_main);

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

        db2 = new DatabaseHelper2(getApplicationContext());

        // resultText = (TextView) findViewById(R.id.edittext);



//        ActionBar actionBar;
//
//        actionBar = getActionBar();
//        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#3498db"));
//        actionBar.setBackgroundDrawable(colorDrawable);
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        // bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#3498db")));
//            bar.setBackgroundDrawable(new ColorDrawable(0xff00DDED));
//            bar.setDisplayShowTitleEnabled(false);
//            bar.setDisplayShowTitleEnabled(true);


        simpleList =new SimpleList[]{
                new SimpleList("xanthareel	","yellow eel formerly used in medicinal foods","- -"),
                new SimpleList("xanthic	","yellow; yellowish","- -"),
                new SimpleList("xanthippe	","ill-tempered woman","- -"),
                new SimpleList("xanthocarpous	","having yellow fruit","- -"),
                new SimpleList("xanthochroia	","yellowness of the skin","- -"),
                new SimpleList("xanthochroic	","having yellow skin","- -"),
                new SimpleList("xanthocomic	","yellow-haired","- -"),
                new SimpleList("xanthocyanopsy	","form of colour-blindness in which only blue and yellow can be distinguished","- -"),
                new SimpleList("xanthoderm	","yellow-skinned person","- -"),
                new SimpleList("xanthodont	","one with yellow teeth","- -"),
                new SimpleList("xanthoma	","disease characterized by yellow patches on the skin","- -"),
                new SimpleList("xanthometer	","instrument for measuring colour of sea or lake water","- -"),
                new SimpleList("xanthophyll	","substance causing yellow colour of autumn leaves","- -"),
                new SimpleList("xanthopsia	","a visual condition where things appear yellow","- -"),
                new SimpleList("xanthospermous	","having yellow seeds","- -"),
                new SimpleList("xanthous	","yellow or red-haired","- -"),
                new SimpleList("xebec	","small three-masted pirate ship","- -"),
                new SimpleList("xeme	","fork-tailed gull","- -"),
                new SimpleList("xenagogue	","guide; someone who conducts strangers","- -"),
                new SimpleList("xenial	","of or concerning hospitality towards guests","- -"),
                new SimpleList("xenium	","gift made to a guest or ambassador; any compulsory gift","- -"),
                new SimpleList("xenobiotic	","indicating a substance or item foreign to the body","- -"),
                new SimpleList("xenocracy	","government by a body of foreigners","- -"),
                new SimpleList("xenodiagnosis	","diagnosis of disease by allowing laboratory-bred diseases to affect material","- -"),
                new SimpleList("xenodocheionology	","love of hotels","- -"),
                new SimpleList("xenodochial	","hospitable; kindly to strangers","- -"),
                new SimpleList("xenodochium	","building for the reception of strangers","- -"),
                new SimpleList("xenogamy	","cross-fertilization","- -"),
                new SimpleList("xenogeneic	","of a disease, derived from an individual of a different species","- -"),
                new SimpleList("xenogenesis	","generation of offspring entirely unlike the parent","- -"),
                new SimpleList("xenogenous	","due to an outside cause","- -"),
                new SimpleList("xenoglossia	","person's knowledge of a language never studied","- -"),
                new SimpleList("xenolalia	","person's knowledge of a language never studied","- -"),
                new SimpleList("xenolith	","fragment of extraneous rock embedded in magma or another rock","- -"),
                new SimpleList("xenomancy	","divination using strangers","- -"),
                new SimpleList("xenomania	","inordinate attachment to foreign things","- -"),
                new SimpleList("xenomenia	","menstruation from abnormal orifices","- -"),
                new SimpleList("xenomorphic	","having a form not its own","- -"),
                new SimpleList("xenophilia	","love of foreigners","- -"),
                new SimpleList("xenophobia	","fear of foreigners","- -"),
                new SimpleList("xenops	","a small tropical rainforest bird","- -"),
                new SimpleList("xenurine	","species of armadillo","- -"),
                new SimpleList("xeransis	","drying up","- -"),
                new SimpleList("xerarch	","growing in dry places","- -"),
                new SimpleList("xerasia	","abnormal dryness of the hair","- -"),
                new SimpleList("xeric	","dry; lacking in moisture","- -"),
                new SimpleList("xerocopy	","photocopy","- -"),
                new SimpleList("xerodermia	","abnormal dryness of the skin","- -"),
                new SimpleList("xerography	","photocopying","- -"),
                new SimpleList("xerophagy	","eating of dry food; fast of dry food in the week preceding Easter","- -"),
                new SimpleList("xerophily	","adaptation to very dry conditions","- -"),
                new SimpleList("xerophobous	","unable to survive drought","- -"),
                new SimpleList("xerophthalmia	","dryness and soreness of the eyes","- -"),
                new SimpleList("xerophytic	","able to withstand drought","- -"),
                new SimpleList("xeroradiography	","process for taking permanent pictures of X-ray images","- -"),
                new SimpleList("xerosis	","abnormal dryness of body parts","- -"),
                new SimpleList("xerostomia	","excessive dryness of the mouth","- -"),
                new SimpleList("xerothermic	","dry and hot","- -"),
                new SimpleList("xerotic	","dry","- -"),
                new SimpleList("xerotripsis	","dry friction","- -"),
                new SimpleList("xesturgy	","process of polishing","- -"),
                new SimpleList("xilinous	","of, like or pertaining to cotton","- -"),
                new SimpleList("xiphias	","swordfish","- -"),
                new SimpleList("xiphoid	","sword-shaped","- -"),
                new SimpleList("xiphopagus	","conjoined twins joined by a band of flesh on the torso","- -"),
                new SimpleList("xiphophyllous	","having sword-shaped leaves","- -"),
                new SimpleList("xiphosuran	","horseshoe crab","- -"),
                new SimpleList("xoanon	","primitive wooden statue overlaid with ivory and gold","- -"),
                new SimpleList("xography	","photographic process for producing three-dimensional images","- -"),
                new SimpleList("xu	","former monetary unit of Vietnam","- -"),
                new SimpleList("xylan	","gelatinous compound found in wood","- -"),
                new SimpleList("xylary	","of, like or pertaining to xylem","- -"),
                new SimpleList("xylem	","woody portion of a plant","- -"),
                new SimpleList("xylocarp	","hard and woody fruit","- -"),
                new SimpleList("xylogenous	","growing on wood","- -"),
                new SimpleList("xyloglyphy	","wood-carving","- -"),
                new SimpleList("xylography	","art of engraving on wood","- -"),
                new SimpleList("xyloid	","woody; ligneous","- -"),
                new SimpleList("xylology	","study of wood","- -"),
                new SimpleList("xylomancy	","divination by examining wood found in one's path","- -"),
                new SimpleList("xylometer	","instrument measuring specific gravity of wood","- -"),
                new SimpleList("xylophagous	","wood-eating","- -"),
                new SimpleList("xylophilous	","fond of wood; living in or on wood","- -"),
                new SimpleList("xylophory	","wood-carrying","- -"),
                new SimpleList("xylopolist	","one who sells wood","- -"),
                new SimpleList("xylopyrography	","engraving designs on wood with hot poker","- -"),
                new SimpleList("xylorimba	","combination of xylophone and marimba","- -"),
                new SimpleList("xylotherapy	","use of certain sorts of wood in treating disease","- -"),
                new SimpleList("xylotomous	","wood-cutting; wood-boring","- -"),
                new SimpleList("xylotypographic	","printed from wooden blocks","- -"),
                new SimpleList("xystarch	","ancient Greek officer in charge of gymnastic exercises","- -"),
                new SimpleList("xyster	","surgeon's instrument for scraping bones","- -"),
                new SimpleList("xyston	","short pike used by Greek heavy cavalry","- -"),
                new SimpleList("xystus	","covered walkway for exercises","- -")

        };

        //ListAdapter listAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,simpleList);

        ListAdapter listAdapter=new CustomAdapter_x(this,simpleList);

        ListView list=(ListView)findViewById(R.id.list1);

        //AdapterviewCustom

        list.setAdapter(listAdapter);


        list.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        //String str=String.valueOf(parent.getItemAtPosition(position));
                        //Toast.makeText(MainActivity.this, simpleList[position].words+ simpleList[position].meanings, Toast.LENGTH_SHORT).show();
                        final String word=simpleList[position].words;
                        final String mean=simpleList[position].meanings;
                        final String sent=simpleList[position].sentence;

                        Intent i=new Intent(x_main.this,Details.class);
                        i.putExtra("word",word);
                        i.putExtra("mean",mean);
                        i.putExtra("sent",sent);

                        startActivity(i);

                    }
                }
        );

    }


    public class SimpleList{
        public String words;
        public String meanings;
        public String sentence;

        public SimpleList(){}

        public SimpleList(String word, String meaning,String sentence){
            this.words=word;
            this.meanings=meaning;
            this.sentence=sentence;
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
            try{
                String str="x";
                Intent in = new Intent(x_main.this, quizStats.class);
                in.putExtra("val",str);
                startActivity(in);

            }catch (Exception ex){
                new AlertDialog.Builder(x_main.this).setMessage(""+ex).show();
            }

            return true;
        }else if(id == R.id.action_search){
            // get prompts.xml view
            LayoutInflater layoutInflater = LayoutInflater.from(x_main.this);
            View promptView = layoutInflater.inflate(R.layout.input_dialog, null);
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(x_main.this);
            alertDialogBuilder.setView(promptView);


            final EditText editText = (EditText) promptView.findViewById(R.id.wordData);

            //editText.setPadding(30,0,30,0);



            // setup a dialog window
            alertDialogBuilder.setCancelable(false)
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            //resultText.setText("Hello, " + editText.getText());

                            try {
                                final String str = editText.getText().toString();
                                boolean flag=false;

                                //new AlertDialog.Builder(a_main.this).setTitle(simpleList.length).setMessage(str).show();
                                for (int i = 0; i < simpleList.length; i++) {
                                    if (simpleList[i].words.contains(str)) {
                                        // new AlertDialog.Builder(a_main.this).setTitle(simpleList[i].words).setMessage(str).show();
                                        new AlertDialog.Builder(x_main.this).setTitle(simpleList[i].words+"                        ").setMessage(simpleList[i].meanings+"    \n").show();
                                        flag=false;
                                        break;
                                    } else {
                                        flag=true;
                                        //new AlertDialog.Builder(a_main.this).setTitle(simpleList[i].words).setMessage(str).show();
                                        //new AlertDialog.Builder(a_main.this).setTitle("Oops").setMessage("Word not in out database").show();
                                        //break;
                                    }
                                }

                                if(flag==true){
                                    new AlertDialog.Builder(x_main.this).setTitle("Word List: Oops                           ").setMessage("Word not in out database \n").show();

                                }

                            }catch (Exception ex)
                            {
                                new AlertDialog.Builder(x_main.this).setTitle("Error").setMessage(""+ex).show();
                            }


                        }
                    })
                    .setNegativeButton("Cancel",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    dialog.cancel();
                                }
                            });

            // create an alert dialog
            AlertDialog alert = alertDialogBuilder.create();
            alert.show();


            return true;
        }else if(id == R.id.action_quiz){
            //if the user clicks the start quiz option and the quiz list is not empty navigate him to another page

            try {
                String str="";
                //list2=db2.getAllStudentsList();
                String val="x";
                list2=db2.getAllStudentsLista(val);
                String word = "";
                int i=0;
                for(StudentsModel2 sm : list2){
                    //value = value+"id: "+sm.id+", word: "+sm.word+" Meaning: "+sm.meaning+"Sentence:"+sm.sentence+"\n";
                    // word=word+sm.word+"\n";
                    i++;
                }

                //new AlertDialog.Builder(this).setMessage(""+i).show();

                if(i==0){
                    new AlertDialog.Builder(this).setTitle("Word List : Quiz Zone").setMessage("All the words added in the quiz will appear in the quiz,looks like you haven't added any words in the quiz, please add the before taking a quiz.")
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {

                                public void onClick(DialogInterface arg0, int arg1) {
                                    // Some stuff to do when ok got clicked

                                }
                            }).show();
                    return true;
                }else {
                    new AlertDialog.Builder(this).setTitle("Word List").setMessage("You have added "+i+" question to the quiz, so you will be asked from those words only, once you click OK, your quiz will begin")
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {

                                public void onClick(DialogInterface arg0, int arg1) {
                                    // When the user clicks on OK button the quiz will begin
                                    String str="x";
                                    Intent in = new Intent(x_main.this, quiz.class);
                                    in.putExtra("val",str);
                                    startActivity(in);

                                }
                            }).show();



                    //new AlertDialog.Builder(this).setTitle("Rules And Regulations").setMessage("1. This is a self assessmen").show();
                }

            }catch (Exception ex)
            {
                new AlertDialog.Builder(this).setMessage(""+ex).show();
            }


        }

        return super.onOptionsItemSelected(item);
    }
}
