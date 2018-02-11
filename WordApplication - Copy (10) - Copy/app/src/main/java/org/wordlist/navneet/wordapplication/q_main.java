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
public class q_main extends ActionBarActivity {
    // private TextView resultText;
    private ListView myList;
    SimpleList simpleList[];
    DatabaseHelper2 db2;
    List<StudentsModel2> list2=new ArrayList<StudentsModel2>();
    // private ArrayList<SimpleList> alist=new ArrayList<SimpleList>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.q_main);

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
                new SimpleList("quack","the harsh sound of a duck","A family of ducks were slowly paddling about in front of me, making little furrows in the quiet water and giving an occasional placid quack. -- Arnim, Elizabeth von"),
                new SimpleList("quadrilateral","a four-sided polygon","It is quadrilateral in shape, consisting of four unequal sides flanked by towers and built round a courtyard.  -- Various"),
                new SimpleList("quadruped","an animal especially a mammal having four limbs","In a moment they were on all fours, hopping about like so many quadrupeds.  -- Patchin, Frank Gee"),
                new SimpleList("quaff","to swallow hurriedly or greedily or in one draught","Gareth gave it to him, and quaffed deeply of the refreshing draught, for he was burning with thirst.  -- Morris, Charles"),
                new SimpleList("quagmire","a soft wet area of low-lying land that sinks underfoot","The heavy rain had reduced this low-lying ground to a veritable quagmire, making progress very difficult even for one as unburdened as he was.  -- Putnam Weale, B. L. (Bertram Lenox)"),
                new SimpleList("quaint","attractively old-fashioned","She lives in a quaint old-fashioned house with casement windows and deep window seats, old oak staircase and panelled rooms.  -- Strang, Mrs. Herbert"),
                new SimpleList("qualified","meeting the proper standards and requirements for a task","All schools need administrators who are highly qualified, dedicated to the profession and not hired due to political connections.  -- Washington Post (Aug 22, 2011)"),
                new SimpleList("qualify","prove capable or fit; meet requirements","The housing bust wiped away $7 trillion in household equity, leaving many homeowners with too much debt to qualify for new loans.  -- Wall Street Journal (May 9, 2012)"),
                new SimpleList("qualitative","involving distinguishing attributes","Qualitative research can help entrepreneurs to understand their customers' or clients' feelings, values, and perceptions of a particular product or service.  -- Inc (Oct 25, 2010)"),
                new SimpleList("qualm","uneasiness about the fitness of an action","Kenneth had no qualms about asking a neighboring table at the country club to stop cussing with his daughters in earshot.  -- Inc (Feb 1, 2012)"),
                new SimpleList("quandary","a situation from which extrication is difficult","Colleges and universities are in a quandary: Spending cuts, combined with a freeze on tuition, mean fewer teachers and the closing of certain programs.  -- New York Times (Feb 20, 2012)"),
                new SimpleList("quantitative","expressible as an amount that can be measured","Agencies have not traditionally hired for skills like  number crunching, data visualization, quantitative analysis,  Mr. Neumann said.  -- New York Times (Oct 30, 2011)"),
                new SimpleList("quantity","how much there is or how many there are of something","Producing big quantities in America has become harder, as the authorities have cracked down on bulk purchases of the ingredients.  -- Economist (Mar 22, 2012)"),
                new SimpleList("quantum","the smallest discrete quantity of some physical property","Physicists have used all manner of quantum objects to store qubits--electrons, atomic nuclei, photons and so on.  -- Scientific American (Apr 11, 2012)"),
                new SimpleList("quarantine","isolation to prevent the spread of infectious disease","The exact time when it is safe for a person to come out of quarantine and resume ordinary life varies in different diseases.  -- Cross, American Red"),
                new SimpleList("quarrel","an angry dispute","The slightest quarrel, the most commonplace street brawl are pretexts for rival factions to come out in battle array.  -- Bastide, Charles"),
                new SimpleList("quarry","a surface excavation for extracting stone or slate","But what about quarries from which are taken building stone, salt, kaolin or clay?  -- Hoskin, Arthur J."),
                new SimpleList("quash","put down by force or intimidation","More than 500 people are thought to have been killed since mid-March as the security forces try to quash dissent.  -- BBC (May 7, 2011)"),
                new SimpleList("quay","wharf usually built parallel to the shoreline","The harbour accommodation is extensive and excellent, large new docks and quays having been recently built, and other works being under construction or contemplated.  -- Various"),
                new SimpleList("queasy","feeling nausea","The ground still shook under his feet, and his insides were producing the queasy symptoms of motion sickness.  -- Goodwin, Harold L. (Harold Leland)"),
                new SimpleList("quell","suppress or crush completely","Burned cars and tires littered a street as police used tear gas to quell demonstrators who threw rocks and small explosives, local TV footage showed.  -- Reuters (Sep 8, 2011)"),
                new SimpleList("quench","put out, as of fires, flames, or lights","No fire was visible anywhere; every bit had been quenched by the flood which came in after Lutchi propped up the sky.  -- Curtin, Jeremiah"),
                new SimpleList("querulous","habitually complaining","In the first place, she is not rich; I could tell that by the querulous complaints of her middle-class mother.  -- Du Maurier, George"),
                new SimpleList("query","pose a question","How can such things be? queried Reuben, stroking his beard in perplexity.  -- Johnston, Annie F. (Annie Fellows)"),
                new SimpleList("quest","the act of searching for something","In the never-ending quest to cut costs and increase money paid out of pocket by customers, airline perks have been disappearing for years.  -- Time (Apr 6, 2012)"),
                new SimpleList("queue","form a line or stand in line","Voters queued up in orderly lines in Taipei and other cities islandwide after polls opened at 8 a.m.  -- Reuters (Jan 14, 2012)"),
                new SimpleList("quibble","argue over petty things","Philosophy, Sports People often dismiss philosophical disputes as mere quibbles about words.    -- New York Times (Mar 16, 2012)"),
                new SimpleList("quiescent","being quiet or still or inactive","Under normal conditions, only a fraction of these blood-forming stem cells are active; the rest are deeply quiescent � asleep.  -- The Guardian (Jan 17, 2011)"),
                new SimpleList("quietude","a state of peace and quiet","She took the vacant seat with a sort of frozen quietude, and her limbs seemed to settle themselves rigidly into positions where they remained immovable.  -- Ritchie, Anna Cora Ogden Mowatt"),
                new SimpleList("quintessence","the most typical example or representative of a type","This composition, in many ways the most wonderful single piece we have from Chopin, is the quintessence of his genius.  -- Spalding, Walter Raymond"),
                new SimpleList("quip","witty remark","When Turkle said she had been at funerals where people checked their iPhones, Colbert quipped: We all say goodbye in our own way.  -- The Guardian (Jan 22, 2011)"),
                new SimpleList("quirk","a strange attitude or habit","There are a few annoying quirks: For example, the PlayBook took a long time when scrolling through long documents or Web pages.  -- Seattle Times (Apr 16, 2011)"),
                new SimpleList("quirky","strikingly unconventional","Quirky experiences abound: A vintage clothing store in a double-decker bus!  -- Time (Apr 19, 2012)"),
                new SimpleList("quisling","someone who collaborates with an enemy occupying force","Naturally enough, the attitude taken up by the Christians earned them fresh attacks from the Quisling followers.  -- Snoek, Johan Martinus"),
                new SimpleList("quiver","shake with fast, tremulous movements","His last words had scarcely rung out when my horse began to quiver under me and sway backward and forward.  -- Weyman, Stanley John"),
                new SimpleList("quixotic","not sensible about practical matters","Granted, Latin American integration is an elusive if not quixotic goal: the region stretches farther than Africa, and its nations' interests are just as balkanized.  -- Time (Dec 4, 2011)"),
                new SimpleList("quizzical","playfully vexing, especially by ridicule","Not too long ago, wearing Chicago Blackhawks gear would earn you quizzical looks or jokes about being the last of the team's fans.  -- Seattle Times (Jun 1, 2010)"),
                new SimpleList("quorum","a gathering of the minimal number of members of a group","Without a quorum of four, the commission was unable to do even basic things such as approving public funding for presidential candidates.  -- Slate (Jan 25, 2011)"),
                new SimpleList("quotation","a passage or expression that is cited"," Better fifty years of Europe Than a cycle of Cathay,  murmured Dick, yielding once more to his chronic habit of quotation.  -- Duffield, J. W."),
                new SimpleList("quotidian","found in the ordinary course of events","More seriously, plenty of quotidian consumer staples, such as children's clothes, come from China.  -- The Guardian (Apr 16, 2010)"),
                new SimpleList("qanat	","underground tunnel for carrying irrigation water","- -"),
                new SimpleList("qasida	","Arabic or Persian elegiac poem","- -"),
                new SimpleList("qat	","leaves chewed or brewed in tea as a stimulant","- -"),
                new SimpleList("qawwali	","fervent Muslim devotional music","- -"),
                new SimpleList("qigong	","system of Chinese meditational exercises","- -"),
                new SimpleList("qintar	","Albanian unit of currency","- -"),
                new SimpleList("qiviut	","wool of the undercoat of a musk-ox","- -"),
                new SimpleList("qoph	","a Hebrew letter","- -"),
                new SimpleList("qua	","in the capacity of","- -"),
                new SimpleList("quab	","something unfinished or immature; unfledged bird","- -"),
                new SimpleList("quab	","to throb; to quiver","- -"),
                new SimpleList("quackle	","to choke; to suffocate","- -"),
                new SimpleList("quacksalver	","one who falsely pretends to knowledge of medicine","- -"),
                new SimpleList("quad	","unit of energy equal to one quadrillion British thermal units","- -"),
                new SimpleList("quadra	","square frame; plinth","- -"),
                new SimpleList("quadrable	","capable of being expressed in a finite number of algebraic terms","- -"),
                new SimpleList("quadragenarian	","a person between 40 and 49 years of age","- -"),
                new SimpleList("quadragesimal	","of, like or pertaining to Lent; lasting forty days","- -"),
                new SimpleList("quadragesimarian	","one who observes Lent","- -"),
                new SimpleList("quadragintesimal	","forty-fold; having forty parts","- -"),
                new SimpleList("quadral	","in four parts","- -"),
                new SimpleList("quadraphonic	","produced by a sound system that employs four signal sources","- -"),
                new SimpleList("quadrat	","small square block used as a space in printing","- -"),
                new SimpleList("quadratary	","relating to a square","- -"),
                new SimpleList("quadrate	","to make square; to make to agree","- -"),
                new SimpleList("quadratrix	","a curve by which a circle may be squared","- -"),
                new SimpleList("quadratura	","wall or ceiling painted with arches and columns in strong perspective","- -"),
                new SimpleList("quadrel	","square block of brick","- -"),
                new SimpleList("quadrennial	","lasting four years; occurring once every four years","- -"),
                new SimpleList("quadrennium	","period of four years","- -"),
                new SimpleList("quadrifid	","split into four","- -"),
                new SimpleList("quadrifoliate	","having four leaves","- -"),
                new SimpleList("quadriga	","two-wheeled carriage drawn by four horses","- -"),
                new SimpleList("quadrigeminal	","in four similar or equal parts","- -"),
                new SimpleList("quadrigenarious	","comprising four hundred","- -"),
                new SimpleList("quadrille	","square dance for four couples; card game for four people","- -"),
                new SimpleList("quadrilocular	","having four compartments","- -"),
                new SimpleList("quadrimium	","four-year-old wine; best or oldest wine","- -"),
                new SimpleList("quadringenarious	","containing four hundred of something","- -"),
                new SimpleList("quadripole	","device having one pair of output terminals and one pair of input terminals","- -"),
                new SimpleList("quadrireme	","ancient ship with four sets of oars","- -"),
                new SimpleList("quadrivial	","leading in four directions; concerning a four-way junction","- -"),
                new SimpleList("quadrivium	","four branches of mathematics in medieval education","- -"),
                new SimpleList("quadrivoltine	","having four litters in a single year","- -"),
                new SimpleList("quadrobulary	","fourfold","- -"),
                new SimpleList("quadroon	","old term for a person of one-quarter black ancestry","- -"),
                new SimpleList("quadrumanous	","of the primates other than man","- -"),
                new SimpleList("quadrupedation	","stamping with four feet","- -"),
                new SimpleList("quaedam	","disparaging term for a woman","- -"),
                new SimpleList("quaere	","to introduce a question or issue","- -"),
                new SimpleList("quaeritur	","the question is asked","- -"),
                new SimpleList("quaesitum	","something sought for; the true value","- -"),
                new SimpleList("quaestionary	","religious pardoner","- -"),
                new SimpleList("quaestor	","ancient magistrate; a medieval pardoner","- -"),
                new SimpleList("quaestuary	","money-making; money-seeking; in business only for profit","- -"),
                new SimpleList("quagga	","extinct African wild ass like the zebra","- -"),
                new SimpleList("quagma	","hypothetical matter made up of quarks and gluons","- -"),
                new SimpleList("quagswag	","to shake to and fro","- -"),
                new SimpleList("quahog	","type of edible clam","- -"),
                new SimpleList("quain	","angle; wedge-like corner","- -"),
                new SimpleList("quale	","quality or property of something; abstract virtue or quality","- -"),
                new SimpleList("qualificator	","one who prepares ecclesiastical cases for trial","- -"),
                new SimpleList("qualimeter	","apparatus for measuring penetrating power of X-ray beams","- -"),
                new SimpleList("qually	","of wine, cloudy or turbid","- -"),
                new SimpleList("qualtagh	","first person encountered after leaving home on a special day","- -"),
                new SimpleList("quamoclit	","tropical climbing plant with brilliant flowers","- -"),
                new SimpleList("quango	","a quasi-autonomous non-governmental organization","- -"),
                new SimpleList("quangocracy	","rule of quasi-autonomous non-governmental organizations","- -"),
                new SimpleList("quannet	","flat file used like a plane","- -"),
                new SimpleList("quant	","punting or jumping pole with a flat end","- -"),
                new SimpleList("quantile	","any of a set of equal fractions of a given population","- -"),
                new SimpleList("quantimeter	","apparatus for measuring quantity of X-rays","- -"),
                new SimpleList("quantivalence	","chemical valence; ability of atoms to hold other atoms in combination","- -"),
                new SimpleList("quantometer	","instrument for measuring proportions of elements in metallic samples","- -"),
                new SimpleList("quantophrenia	","obsessive reliance on statistics and mathematical results","- -"),
                new SimpleList("quantulate	","to calculate the magnitude of","- -"),
                new SimpleList("quantulum	","small quantity","- -"),
                new SimpleList("quantuplicity	","relative magnitude of a quantity","- -"),
                new SimpleList("quaquadrate	","a sixteenth power","- -"),
                new SimpleList("quaquaversal	","facing or bending all ways","- -"),
                new SimpleList("quarender	","dark red apple","- -"),
                new SimpleList("quaresimal	","Lenten; having the meagreness of Lenten meals","- -"),
                new SimpleList("quarion	","candle","- -"),
                new SimpleList("quark	","soft cheese made from skim milk","- -"),
                new SimpleList("quarkonium	","meson formed of a quark and an anti-quark","- -"),
                new SimpleList("quarl	","large curved brick or tile used to support melting pot","- -"),
                new SimpleList("quarred	","soured; clotted","- -"),
                new SimpleList("quarrelet	","small square","- -"),
                new SimpleList("quarrenden	","variety of apple","- -"),
                new SimpleList("quarrion	","Australian parrot like the cockatiel","- -"),
                new SimpleList("quartan	","a fever recurring every third day","- -"),
                new SimpleList("quartation	","mixing one part gold with three parts silver prior to purifying it","- -"),
                new SimpleList("quarter	","unit of weight equal to 28 pounds","- -"),
                new SimpleList("quarterdeck	","part of ship's deck set aside by captain for ceremonial functions","- -"),
                new SimpleList("quartering	","sailing nearly before the wind","- -"),
                new SimpleList("quarterland	","ancient land division on the Isle of Man","- -"),
                new SimpleList("quarterlight	","small triangular ventilation window in a car","- -"),
                new SimpleList("quartern	","one quarter of various measures","- -"),
                new SimpleList("quartic	","a curve or equation of the fourth degree","- -"),
                new SimpleList("quartinvariant	","an invariant of the fourth degree","- -")

        };

        //ListAdapter listAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,simpleList);

        ListAdapter listAdapter=new CustomAdapter_q(this,simpleList);

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

                        Intent i=new Intent(q_main.this,Details.class);
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
                String str="q";
                Intent in = new Intent(q_main.this, quizStats.class);
                in.putExtra("val",str);
                startActivity(in);

            }catch (Exception ex){
                new AlertDialog.Builder(q_main.this).setMessage(""+ex).show();
            }

            return true;
        }else if(id == R.id.action_search){
            // get prompts.xml view
            LayoutInflater layoutInflater = LayoutInflater.from(q_main.this);
            View promptView = layoutInflater.inflate(R.layout.input_dialog, null);
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(q_main.this);
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
                                        new AlertDialog.Builder(q_main.this).setTitle(simpleList[i].words+"                        ").setMessage(simpleList[i].meanings+"    \n").show();
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
                                    new AlertDialog.Builder(q_main.this).setTitle("Word List: Oops                           ").setMessage("Word not in out database \n").show();

                                }

                            }catch (Exception ex)
                            {
                                new AlertDialog.Builder(q_main.this).setTitle("Error").setMessage(""+ex).show();
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
                String val="q";
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
                                    String str="q";
                                    Intent in = new Intent(q_main.this, quiz.class);
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
