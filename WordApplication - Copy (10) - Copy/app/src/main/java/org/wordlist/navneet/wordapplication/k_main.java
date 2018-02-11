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

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Navneet on 7/13/2015.
 */
public class k_main extends ActionBarActivity {
    // private TextView resultText;
    private ListView myList;
    SimpleList simpleList[];
    DatabaseHelper2 db2;
    List<StudentsModel2> list2=new ArrayList<StudentsModel2>();
    // private ArrayList<SimpleList> alist=new ArrayList<SimpleList>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.k_main);

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
                new SimpleList("keen","demonstrating ability to recognize or draw fine distinctions","His keen eyes had detected a small, swiftly moving object on the horizon--the expected patrol boat.  -- Westerman, Percy F. (Percy Francis)"),
                new SimpleList("ken","range of what one can know or understand","Ah, but the Eyes Divine look long and see far; things beyond the human ken are all revealed.  -- Brady, Cyrus Townsend"),
                new SimpleList("kindle","cause to start burning","At a little distance a fire had been quickly kindled and cooking was already going on.  -- Stoddard, William O."),
                new SimpleList("kinetic","characterized by motion","But when the can is opened, the potential energy quickly converts to kinetic energy as the fake snake jumps out.  -- Scientific American (Apr 5, 2012)"),
                new SimpleList("kinship","relatedness or connection by blood or marriage or adoption","Alexander the Great extended his conquests as far eastward as India, whose native inhabitants claim kinship with European peoples through a common Aryan ancestry.  -- Whitney, Orson F."),
                new SimpleList("knave","a deceitful and unreliable scoundrel","The merchant subsequently turned out a very great knave, cheating Tom on various occasions, and finally broke, very much in his debt.   -- Borrow, George Henry"),
                new SimpleList("knead","make uniform","He did not look at her as he spoke, but kept on diligently smoothing and kneading the soft clay.  -- Heyse, Paul"),
                new SimpleList("knell","the sound of a bell rung slowly to announce a death"," If she dies,  he had said, and the words rang in my ears like a funeral knell.  -- Boothby, Guy"),
                new SimpleList("knit","make by needlework with interlacing yarn","Poor farming families took up extra work in the villages such as making gloves, knitting stockings, or spinning yarn.  -- Reilly, S. A."),
                new SimpleList("knoll","a small natural hill","At the very base of the hill or knoll alluded to, they halted.  -- Ellis, Edward Sylvester"),
                new SimpleList("knotty","highly complex or intricate and occasionally devious","I am, at this present writing, perplexed and plagued with two knotty problems in politics.  -- Adams, Abigail"),
                new SimpleList("kagu	","long-legged bird of New Caledonia","- -"),
                new SimpleList("kainotophobia	","fear of change","- -"),
                new SimpleList("kaiserin	","wife of a kaiser","- -"),
                new SimpleList("kaka	","olive-brown parrot native to New Zealand","- -"),
                new SimpleList("kakaki	","West African ceremonial trumpet","- -"),
                new SimpleList("kakidrosis	","body odour","- -"),
                new SimpleList("kakistocracy	","government by the worst","- -"),
                new SimpleList("kakorrhaphiophobia	","fear of failure","- -"),
                new SimpleList("kalamkari	","fabric coloured by repeated dyeing","- -"),
                new SimpleList("kaleidophone	","instrument for demonstrating sound waves by lines of light","- -"),
                new SimpleList("kalimba	","African musical instrument made of metal strips along a hollow wooden tube","- -"),
                new SimpleList("kalology	","study of beauty","- -"),
                new SimpleList("kalon	","beauty that is more than skin deep","- -"),
                new SimpleList("kalpis	","a water jar","- -"),
                new SimpleList("kalyptra	","veil worn by Greek women","- -"),
                new SimpleList("kamagraphy	","making copies of original paintings using treated canvas","- -"),
                new SimpleList("kame	","steep irregular ridge","- -"),
                new SimpleList("kamelaukion	","tall cylindrical hat worn by Orthodox priests","- -"),
                new SimpleList("kamerad	","to surrender","- -"),
                new SimpleList("kamik	","knee-length sealskin boot","- -"),
                new SimpleList("kaneh	","Hebrew measure of 6 cubits","- -"),
                new SimpleList("kantar	","Turkish unit of weight equal to approximately 100 pounds","- -"),
                new SimpleList("kantele	","Finnish zither","- -"),
                new SimpleList("kantikoy	","to dance as an act of worship","- -"),
                new SimpleList("kapnography	","means of producing designs on smoked glass surfaces","- -"),
                new SimpleList("kapnography	","process for producing designs on smoked glass","- -"),
                new SimpleList("karabiner	","steel link with clip on side used in mountaineering","- -"),
                new SimpleList("karezza	","prolonged sex avoiding orgasm","- -"),
                new SimpleList("karrozzin	","Maltese horse-drawn carriage","- -"),
                new SimpleList("karst	","rough limestone country with underground drainage","- -"),
                new SimpleList("karyokinesis	","division of cell nucleus","- -"),
                new SimpleList("karyology	","study of cell nuclei","- -"),
                new SimpleList("karyotype	","appearance, number and arrangements of chromosomes","- -"),
                new SimpleList("kasha	","porridge or gruel-like dish made from crushed buckwheat","- -"),
                new SimpleList("katabasis	","going down; military retreat","- -"),
                new SimpleList("katabothron	","underground water-channel","- -"),
                new SimpleList("katathermometer	","instrument for measuring the cooling power of air","- -"),
                new SimpleList("katharometer	","instrument measuring changes in composition of gases","- -"),
                new SimpleList("kathenotheism	","polytheism in which several gods are considered supreme in succession","- -"),
                new SimpleList("katzenjammer	","hangover; uproar; clamour","- -"),
                new SimpleList("kausia	","Macedonian felt hat with broad brim","- -"),
                new SimpleList("kava	","narcotic drink prepared from Polynesian plant","- -"),
                new SimpleList("kazachoc	","Slavic fast dance in which dancer squats and kicks out legs alternately","- -"),
                new SimpleList("kazatzka	","Slavic folk dance performed by a couple","- -"),
                new SimpleList("kea	","green parrot of New Zealand","- -"),
                new SimpleList("keb	","ewe that gives birth to stillborn lamb","- -"),
                new SimpleList("kebbie	","a shepherd's crook","- -"),
                new SimpleList("keck	","to retch; to feel disgust","- -"),
                new SimpleList("keckle	","to protect by binding with rope","- -"),
                new SimpleList("ked	","wingless fly that feeds on livestock","- -"),
                new SimpleList("kedge	","small anchor to keep a ship steady","- -"),
                new SimpleList("keelhaul","to punish by dragging under keel of ship","- -"),
                new SimpleList("keelson	","lengthwise wooden or steel beam in ship for bearing stress","- -"),
                new SimpleList("keeve	","a large tub","- -"),
                new SimpleList("kef	","state of dreamy or drug-induced repose","- -"),
                new SimpleList("keffel	","a horse; a nag","- -"),
                new SimpleList("keister	","burglar's tool kit","- -"),
                new SimpleList("keloid	","hard scar tissue which grows over injured skin","- -"),
                new SimpleList("kelpie	","mischievous water spirit","- -"),
                new SimpleList("kelt	","coarse fabric made of black and white wool","- -"),
                new SimpleList("kelter	","nonsense","- -"),
                new SimpleList("kemb	","to comb","- -"),
                new SimpleList("kemp	","coarse, rough strand of wool","- -"),
                new SimpleList("kennebecker	","knapsack","- -"),
                new SimpleList("kenodoxy	","the love or study of vain-glory","- -"),
                new SimpleList("kenophobia	","fear of empty spaces","- -"),
                new SimpleList("kenosis	","Christ's rejection of his divine side upon assuming human form","- -"),
                new SimpleList("kenotism	","doctrine that Christ rid himself of divinity in becoming human","- -"),
                new SimpleList("kenspeckle	","easily recognizable or distinguishable","- -"),
                new SimpleList("kent-bugle	","an obsolete keybugle","- -"),
                new SimpleList("kente	","hand-woven African silk fabric","- -"),
                new SimpleList("kentledge	","pig-iron used as ballast in ship's hold","- -"),
                new SimpleList("kep	","to catch an approaching object or falling liquid","- -"),
                new SimpleList("kephalonomancy	","divination using a baked ass's head","- -"),
                new SimpleList("kerasine	","horny; made of horn","- -"),
                new SimpleList("keratogenic	","causing growth of horn, skin or hair","- -"),
                new SimpleList("keratometer	","instrument for measuring curvature of the cornea","- -"),
                new SimpleList("keraunograph	","instrument for recording distant thunderstorms","- -"),
                new SimpleList("keraunoscopia	","divination using thunder","- -"),
                new SimpleList("kereru	","pigeon variety of New Zealand","- -"),
                new SimpleList("kerf	","cut, notch or groove; quantity of something cut at the same time","- -"),
                new SimpleList("kermes	","brilliant red colour; a red dye derived from insects","- -"),
                new SimpleList("kermesse	","cycle race held in an urban area","- -"),
                new SimpleList("kermis	","indoor charity fair","- -"),
                new SimpleList("kern	","Irish foot-soldier","- -"),

        };

        //ListAdapter listAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,simpleList);

        ListAdapter listAdapter=new CustomAdapter_k(this,simpleList);

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

                        Intent i=new Intent(k_main.this,Details.class);
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
                String str="k";
                Intent in = new Intent(k_main.this, quizStats.class);
                in.putExtra("val",str);
                startActivity(in);

            }catch (Exception ex){
                new AlertDialog.Builder(k_main.this).setMessage(""+ex).show();
            }

            return true;
        }else if(id == R.id.action_search){
            // get prompts.xml view
            LayoutInflater layoutInflater = LayoutInflater.from(k_main.this);
            View promptView = layoutInflater.inflate(R.layout.input_dialog, null);
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(k_main.this);
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
                                        new AlertDialog.Builder(k_main.this).setTitle(simpleList[i].words+"                        ").setMessage(simpleList[i].meanings+"    \n").show();
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
                                    new AlertDialog.Builder(k_main.this).setTitle("Word List: Oops                           ").setMessage("Word not in out database \n").show();

                                }

                            }catch (Exception ex)
                            {
                                new AlertDialog.Builder(k_main.this).setTitle("Error").setMessage(""+ex).show();
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
                String val="k";
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
                                    String str="k";
                                    Intent in = new Intent(k_main.this, quiz.class);
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
