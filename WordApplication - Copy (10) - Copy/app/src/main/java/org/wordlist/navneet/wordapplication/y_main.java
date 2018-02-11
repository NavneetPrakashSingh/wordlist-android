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
public class y_main extends ActionBarActivity {
    // private TextView resultText;
    private ListView myList;
    SimpleList simpleList[];
    DatabaseHelper2 db2;
    List<StudentsModel2> list2=new ArrayList<StudentsModel2>();
    // private ArrayList<SimpleList> alist=new ArrayList<SimpleList>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.y_main);

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
                new SimpleList("yahoo","a person who is not intelligent or interested in culture","What I wanted to bring to your distinguished notice is this--that you must not behave like a yahoo in my mathematical set.  -- Hay, Ian"),
                new SimpleList("yearn","desire strongly or persistently","Now and then there is an extreme individualist who yearns to go through life absolutely unmolested, single file.  -- Warner, Frances Lester"),
                new SimpleList("yearning","prolonged unfulfilled desire or need","Each generation of foxes grew more approachable, many showing doglike yearning for human contact.  -- Slate (Mar 13, 2012)"),
                new SimpleList("yelp","a sharp high-pitched cry","While faintly heard from somewhere outside there was the yelping, barking, howling whine of a dog.  -- Fenn, George Manville"),
                new SimpleList("yen","the basic unit of money in Japan; equal to 100 sen","In the last decade, most major coinages have been faked, including British pounds, Russian rubles, Indian rupees, Japanese yen, and Canadian dollars.  -- Slate (Feb 27, 2012)"),
                new SimpleList("yeoman","a free man who cultivates his own land","On one extreme was the well-to-do yeoman farmer farming his own land.  -- Reilly, S. A."),
                new SimpleList("yield","give or supply","Cotton and coffee are both indigenous, the former yielding two crops per year.  -- Alden, John B."),
                new SimpleList("yoke","become joined or linked together","The reason was that it had been found unwise and unwholesome to mix up or yoke together believers and unbelievers.*  -- Pierson, Arthur T. (Arthur Tappan)"),
                new SimpleList("yokel","a person who is not intelligent or interested in culture","Now, poor people, yokels, clods, cannot love what is incomprehensible to them.  -- Meredith, George"),
                new SimpleList("yonder","distant but within sight","  Yonder,  said he, pointing to some distance down the river.  -- Borrow, George Henry"),
                new SimpleList("yore","time long past","Yore, long ago; generally used in the expression of yore, formerly, once upon a time.  -- Turner, Winifred"),
                new SimpleList("yabba	","large Jamaican earthenware or wooden vessel","- -"),
                new SimpleList("yabby	","small edible freshwater crayfish","- -"),
                new SimpleList("yachty	","relating to yachts","- -"),
                new SimpleList("yad	","rod used by readers of the Torah as a pointer for following text","- -"),
                new SimpleList("yaff	","to bark like a snarling dog","- -"),
                new SimpleList("yaffingale	","green woodpecker","- -"),
                new SimpleList("yag	","synthetic diamond made of yttrium aluminum garnet","- -"),
                new SimpleList("yager	","nineteenth-century rifle","- -"),
                new SimpleList("yahrzeit	","Jewish remembrance of the first anniversary of someone's death","- -"),
                new SimpleList("yair	","tidal enclosure for catching fish","- -"),
                new SimpleList("yajna	","Hindu sacrificial rite","- -"),
                new SimpleList("yakhdan	","box used for carrying ice on back of pack animal","- -"),
                new SimpleList("yakow	","animal crossbred from male yak and domestic cow","- -"),
                new SimpleList("yale	","mythical animal resembling tusked horse with elephant's tail and used in heraldry","- -"),
                new SimpleList("yam	","posting-house along a road","- -"),
                new SimpleList("yang-chin	","Chinese hammered dulcimer","- -"),
                new SimpleList("yantra	","geometrical diagram designed as a meditation aid","- -"),
                new SimpleList("yapness	","hunger","- -"),
                new SimpleList("yapok	","an amphibious opossum of South America","- -"),
                new SimpleList("yapp	","limp leather binding in which cover overlaps edges of book","- -"),
                new SimpleList("yarak	","of a hawk, in good condition for hunting","- -"),
                new SimpleList("yarborough	","hand of cards containing no card above nine","- -"),
                new SimpleList("yardage	","charge for use of a yard","- -"),
                new SimpleList("yardang	","ridge formed by wind erosion parallel to prevailing winds","- -"),
                new SimpleList("yardarm	","either end of the yard of a square-rigged ship","- -"),
                new SimpleList("yarder	","donkey-engine used in logging","- -"),
                new SimpleList("yardland	","unit of land area equal to 30 acres","- -"),
                new SimpleList("yare	","marked by quickness and agility; nimble; prepared; easily handled","- -"),
                new SimpleList("yarling	","wailing; howling","- -"),
                new SimpleList("yarmulke	","skullcap worn by Orthodox Jewish men","- -"),
                new SimpleList("yarnwindle	","tool for winding yarn into a ball","- -"),
                new SimpleList("yarpha	","peatbog; sandy or fibrous peat","- -"),
                new SimpleList("yarrow	","flowering herb growing in moist areas; milfoil","- -"),
                new SimpleList("yashiki	","residence of a feudal Japanese nobleman","- -"),
                new SimpleList("yashmak	","double Muslim veil leaving only eyes uncovered","- -"),
                new SimpleList("yataghan	","long curved knife or sabre","- -"),
                new SimpleList("yate	","species of eucalyptus tree with strong wood","- -"),
                new SimpleList("yautia	","root crop of the West Indies like a yam","- -"),
                new SimpleList("yaw	","to move unsteadily side to side; to rotate about a vertical axis","- -"),
                new SimpleList("yawl	","ship's small boat; sailboat carrying mainsail and one or more jibs","- -"),
                new SimpleList("yawny	","prone to yawning; characterized by yawning","- -"),
                new SimpleList("yealing	","person of the same age","- -"),
                new SimpleList("yean	","to give birth to a lamb or kid","- -"),
                new SimpleList("yeanling	","lamb; kid","- -"),
                new SimpleList("yearling	","animal or plant one year old","- -"),
                new SimpleList("yeasty	","full of restless energy or creativity; insubstantial","- -"),
                new SimpleList("yedda	","grass used to make straw hats","- -"),
                new SimpleList("yede	","to go","- -"),
                new SimpleList("yeep	","to cheep; to chirp","- -"),
                new SimpleList("yegg	","a burglar of safes","- -"),
                new SimpleList("yelek	","outer garment worn by Turkish women","- -"),
                new SimpleList("yellow	","to bellow; to yelp","- -"),
                new SimpleList("yellowback	","cheap sensational novel","- -"),
                new SimpleList("yellowplush	","a footman","- -"),
                new SimpleList("yelm	","a straight bundle of straw used for thatching","- -"),
                new SimpleList("yelt	","a young sow","- -"),
                new SimpleList("yelting	","glass-eyed snapper","- -"),
                new SimpleList("yen	","craving or yearning","- -"),
                new SimpleList("yenta	","gossip or busybody","- -"),
                new SimpleList("yeo	","stream or drain used in mining","- -"),
                new SimpleList("yeomanette	","old term for a female yeoman in the American naval reserve","- -"),
                new SimpleList("yeowoman	","female yeoman","- -"),
                new SimpleList("yerk	","to draw tight; to bind","- -"),
                new SimpleList("yestertempest	","immediately preceding the last tempest","- -"),
                new SimpleList("yetling	","cast iron; an object of cast iron","- -"),
                new SimpleList("yeuk	","to itch","- -"),
                new SimpleList("yew	","to rise, as a layer of froth in a boiling liquid","- -"),
                new SimpleList("yewen	","made of yew-wood","- -"),
                new SimpleList("yex	","to hiccup, belch or spit","- -"),
                new SimpleList("yieldless	","unyielding","- -"),
                new SimpleList("yike	","imitation of the woodpecker's cry","- -"),
                new SimpleList("yikker	","to utter sharp little cries","- -"),
                new SimpleList("yill	","to ply with ale","- -"),
                new SimpleList("yips	","nervous state in golf causing player to miss an easy putt","- -"),
                new SimpleList("yird	","to bury","- -"),
                new SimpleList("ylem	","in alchemy, substance from which the elements developed","- -"),
                new SimpleList("ylid	","compound bonding negatively charged carbon to a positively charged atom","- -"),
                new SimpleList("yobbery	","hooliganism","- -"),
                new SimpleList("yodization	","insertion of a 'y' sound after a consonant","- -"),
                new SimpleList("yogh	","letter in Middle English representing y or 'hh' sound","- -"),
                new SimpleList("yogibogeybox	","materials used by a spiritualist","- -"),
                new SimpleList("yogic	","of or pertaining to yoga","- -"),
                new SimpleList("yogini	","female yogi","- -"),
                new SimpleList("yoicks	","expression of surprise or excitement","- -"),
                new SimpleList("yok	","pejorative Jewish term for a non-Jew","- -"),
                new SimpleList("yolk	","greasy substance emitted by sheep's skin to moisten the wool","- -"),
                new SimpleList("yomp	","to carry heavy equipment over difficult terrain","- -"),
                new SimpleList("yon	","yonder; that over there; those over there","- -"),
                new SimpleList("yonderly	","mentally or emotionally distant; absent-minded","- -"),
                new SimpleList("yoni	","symbol representing female genitals","- -"),
                new SimpleList("yonside	","on the farther side of","- -"),
                new SimpleList("yordim	","emigrants who leave Israel","- -"),
                new SimpleList("york	","strap used to tie trouser legs beneath the knee","- -"),
                new SimpleList("yote	","to cast in metal","- -"),
                new SimpleList("young	","to present the younger side of a geological formation","- -"),
                new SimpleList("youngberry	","dewberry similar to a loganberry","- -"),
                new SimpleList("youngstock	","young domestic animals","- -"),
                new SimpleList("younker	","a young person","- -"),
                new SimpleList("youster	","to fester","- -"),
                new SimpleList("youthquake	","the series of cultural upheavals of the 1960s","- -"),
                new SimpleList("yowie	","a little ewe","- -"),
                new SimpleList("yowndrift	","snow driven by the wind","- -"),
                new SimpleList("yperite	","mustard gas","- -"),
                new SimpleList("ypsiliform	","shaped like an upsilon","- -"),
                new SimpleList("yrneh	","unit of reciprocal inductance","- -"),
                new SimpleList("yttriferous	","bearing yttrium","- -"),
                new SimpleList("yu	","precious jade","- -"),
                new SimpleList("yuan	","flat perforated Chinese jade disk","- -"),
                new SimpleList("yucca	","woody North American plant","- -"),
                new SimpleList("yuft	","Russian leather","- -"),
                new SimpleList("yuke	","to itch","- -"),
                new SimpleList("yulo	","Chinese sculling oar","- -"),
                new SimpleList("yusho	","skin-staining disease caused by contaminated rice oil","- -"),
                new SimpleList("yuzbashi	","Turkish military officer","- -")

        };

        //ListAdapter listAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,simpleList);

        ListAdapter listAdapter=new CustomAdapter_y(this,simpleList);

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

                        Intent i=new Intent(y_main.this,Details.class);
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
                String str="y";
                Intent in = new Intent(y_main.this, quizStats.class);
                in.putExtra("val",str);
                startActivity(in);

            }catch (Exception ex){
                new AlertDialog.Builder(y_main.this).setMessage(""+ex).show();
            }

            return true;
        }else if(id == R.id.action_search){
            // get prompts.xml view
            LayoutInflater layoutInflater = LayoutInflater.from(y_main.this);
            View promptView = layoutInflater.inflate(R.layout.input_dialog, null);
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(y_main.this);
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
                                        new AlertDialog.Builder(y_main.this).setTitle(simpleList[i].words+"                        ").setMessage(simpleList[i].meanings+"    \n").show();
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
                                    new AlertDialog.Builder(y_main.this).setTitle("Word List: Oops                           ").setMessage("Word not in out database \n").show();

                                }

                            }catch (Exception ex)
                            {
                                new AlertDialog.Builder(y_main.this).setTitle("Error").setMessage(""+ex).show();
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
                String val="y";
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
                                    String str="y";
                                    Intent in = new Intent(y_main.this, quiz.class);
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
