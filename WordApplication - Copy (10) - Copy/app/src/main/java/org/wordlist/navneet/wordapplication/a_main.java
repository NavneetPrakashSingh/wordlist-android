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
public class a_main extends ActionBarActivity {
   // private TextView resultText;
    private ListView myList;
    SimpleList simpleList[];
    DatabaseHelper2 db2;
    List<StudentsModel2> list2=new ArrayList<StudentsModel2>();
    // private ArrayList<SimpleList> alist=new ArrayList<SimpleList>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_main);




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
                         new SimpleList("abase","cause to feel shame","She is not abased or dejected, but exalted, rather.  -- Sinclair, May"),
                         new SimpleList("aberration","a state or condition markedly different from the norm","While Tampa Bay has taken a huge nosedive a year after going 10-6, maybe that 2010 success was an aberration.  -- Seattle Times (Dec 26, 2011)"),
                         new SimpleList("abhor","find repugnant","There are sane readers who abhor gratuitous violence but love Reacher's menacing wisecracks.  -- New York Times (Sep 20, 2011)"),
                         new SimpleList("abject","most unfortunate or miserable","Mr. Jobling stood wringing his hands helplessly, his flaccid features expressive of abject despair.  -- Douglas, Hudson"),
                         new SimpleList("abrasive","sharply disagreeable; rigorous"," He has always been focused, driven, demanding and, as a result, very difficult and abrasive,  Mr. Norman said.  -- New York Times (Oct 7, 2011)"),
                         new SimpleList("abstain","choose not to consume","Griffin felt that he had better abstain from questioning, and let his host run on.  -- Marsh, Richard"),
                         new SimpleList("abstract","existing only in the mind","Presenting an abstract concept, waving our arms trying to describe it, we will lose our audience right away.  -- Inc (Feb 20, 2012)"),
                         new SimpleList("abundant","present in great quantity","Fringing and barrier reefs are abundant throughout the archipelago, surrounding nearly every island.  -- Gabel, Norman E."),
                         new SimpleList("accentuate","to stress, single out as important","It was a carefully studied costume; and he accentuated its eccentricity by adopting theatrical attitudes and an air of satisfied negligence.  -- Leblanc, Maurice"),
                         new SimpleList("acclimate","get used to a certain weather","The Jets will leave Friday for Denver, the better to acclimate to the altitude and change in time zone.  -- New York Times (Oct 14, 2010)"),
                         new SimpleList("accomplice","a person who joins with another in carrying out some plan","Tiller, the thief, and a supposed accomplice, are under arrest.  -- Various"),
                         new SimpleList("accord","concurrence of opinion","Friday's accord removes one of two main sticking points that have been holding up a strategic partnership agreement between the two countries.  -- Wall Street Journal (Mar 9, 2012)"),
                         new SimpleList("acerbic","harsh or corrosive in tone","They were complaining, sometimes yelling, and maybe a bit acerbic.  -- New York Times (Mar 29, 2012)"),
                         new SimpleList("acme","the highest level or degree attainable","Paris wholly has got to the acme of its frenzy; whirled, all ways, by panic madness.  -- Various"),
                         new SimpleList("acquiesce","to agree or express agreement","I favored building a fire and staying there till morning, but Frank preferred pushing on to camp, so I acquiesced.  -- Shields, George O."),
                         new SimpleList("acquit","pronounce not guilty of criminal charges","He said that in the absence of other evidence,  the accused is acquitted and discharged.   -- New York Times (Jan 9, 2012)"),
                         new SimpleList("acrimonious","marked by strong resentment or cynicism","At times, the two groups squabble like schoolchildren, and the exchange gets acrimonious.  -- BBC (Feb 9, 2010)"),
                         new SimpleList("acute","extremely sharp or intense","Labor shortages are already so acute in many Chinese industrial zones that factories struggle to find enough people to operate their assembly lines.  -- New York Times (Mar 31, 2012)"),
                         new SimpleList("adamant","impervious to pleas, persuasion, requests, reason","But high profile or no, Mr. Kors is adamant about keeping his personal life under wraps -- even as his wedding day approaches.  -- New York Times (Aug 5, 2011)"),
                         new SimpleList("adept","having or showing knowledge and skill and aptitude","He proved an adept playmaker, however, making several nice passes and finishing with 7 assists.  -- New York Times (Jan 7, 2012)"),
                         new SimpleList("adhere","stick to firmly","Adhering to strict safety standards has kept me alive in some very dangerous situations.  -- Time (Mar 18, 2012)"),
                         new SimpleList("admonish","take to task"," Children, children, stop quarrelling, right here in public!  admonished Mrs. Dering, in a low, shocked tone.  -- Perry, Nora"),
                         new SimpleList("adorn","make more attractive, as by adding ornament or color","Old master reproductions adorn chianti-colored walls; tapestries hang in the restrooms.  -- Seattle Times (Feb 9, 2012)"),
                         new SimpleList("adroit","quick or skillful or adept in action or thought","Neither is he adroit in the exercise of his duty; instead performs it bunglingly; his thoughts preoccupied, and eyes wandering about.  -- Reid, Mayne"),
                         new SimpleList("adulation","servile flattery; exaggerated and hypocritical praise","Taylor, a demagogue of the Democratic party, was hypocritically appealing to his  horny handed neighbors  in language of feigned adulation.  -- Levy, T. Aaron"),
                         new SimpleList("adversity","a state of misfortune or affliction","Forty years in the wilderness, meeting adversities together, fighting enemies, marching as one host, made them a nation.  -- Hurlbut, Jesse Lyman"),
                         new SimpleList("advocacy","active support of an idea or cause","That sentiment faded after the 1930s, he said, as consumer advocacy focused more on protecting shoppers.  -- New York Times (Nov 11, 2011)"),
                         new SimpleList("aesthetic","characterized by an appreciation of beauty or good taste","In old-fashioned, aesthetic terms, his glossy, color pictures of modern housing projects in Turkish cities under moody, gray skies are beautiful.  -- New York Times (Oct 14, 2011)"),
                         new SimpleList("affable","diffusing warmth and friendliness","She is restless, irritable, out of sorts, censorious, complaining at home; animated, gracious, affable, complaisant abroad.  -- Hyde, William De Witt"),
                         new SimpleList("affinity","a close connection marked by community of interests","Malaysia has a close affinity with many Middle Eastern nations through their shared religion.  -- Reuters (Feb 12, 2012)"),
                         new SimpleList("affliction","a cause of great suffering and distress","Firm and exceptional natures are thus moulded out of miseries, misfortunes and afflictions.  -- Leonard, Arthur Glyn"),
                         new SimpleList("affluent","having an abundant supply of money or possessions of value","Affluent families can afford guns, which are more efficient for bagging some elusive animals than a poorer household's typical snare trap.  -- New York Times (Dec 27, 2011)"),
                         new SimpleList("aggrandize","add details to","Louis XIV. was growing increasingly ambitious of enlarging his domains and aggrandizing his power.  -- Abbott, John S. C. (John Stevens Cabot)"),
                         new SimpleList("agile","moving quickly and lightly","Are not many beasts physically stronger, more nimble and agile than man?  -- Nordau, Max Simon"),
                         new SimpleList("agrarian","relating to rural matters","We're not an agrarian society any longer, where more hands help farm the land.  -- New York Times (Jun 20, 2011)"),
                         new SimpleList("alacrity","liveliness and eagerness","The men obeyed with alacrity, as all were glad to go, lying in camp so long.  -- Terrill, J. Newton"),
                         new SimpleList("alienate","arouse hostility or indifference in","Keeping schools closed and blocking certain public services is not a strategy we support and could alienate public opinion and play into the governor's hand.  -- New York Times (Feb 18, 2011)"),
                         new SimpleList("allege","report or maintain","David is alleged to have written several Psalms, but of this there is little evidence beyond pious assertion.  -- Bradlaugh, Charles"),
                         new SimpleList("allegiance","the act of binding yourself to a course of action","Notwithstanding this good fortune, Pontiac daily saw his followers dropping off from their allegiance; for even the boldest had lost heart. -- Parkman, Francis"),
                         new SimpleList("allegory","a style that describes a subject by suggestive resemblances","Achingly beautiful, quiet and graceful, his award-winning novel Waiting is a love story superimposed on a political allegory.  -- The Guardian (Feb 16, 2011)"),
                         new SimpleList("alleviate","provide physical relief, as from pain","Lewis said he got a Synvisc shot � an injection commonly used to alleviate arthritic symptoms � in his left knee on Monday.  -- Washington Post (Mar 7, 2012)"),
                         new SimpleList("allude","make a more or less disguised reference to","In his State of the Union address Tuesday night, Mr. Obama turned up the heat, alluding to the plan without fleshing out details.  -- New York Times (Jan 27, 2012)"),
                         new SimpleList("aloof","remote in manner","Too much focus on official duties can make an incumbent look isolated and aloof.  -- New York Times (Mar 12, 2012)"),
                         new SimpleList("altruistic","showing unselfish concern for the welfare of others","The gesture was not necessarily altruistic; he was hoping for a donation in return.  -- New York Times (Jan 24, 2011)"),
                         new SimpleList("ambiguous","having more than one possible meaning"," The election law in New York is written in an ill-defined, ambiguous way,  Goldfeder said, adding that he did not believe any laws were broken.  -- Reuters (Sep 16, 2011)"),
                         new SimpleList("ambivalent","uncertain or unable to decide about what course to follow"," If managers are ambivalent, or wavering, then investor uncertainty increases and the stocks become more volatile.   -- Reuters (Oct 26, 2011)"),
                         new SimpleList("ameliorate","to make better","Possessed of broadly humanitarian sympathies, he became interested in ameliorating the conditions of imprisoned debtors.  -- Bolton, Herbert Eugene"),
                         new SimpleList("amiable","diffusing warmth and friendliness","He was also remarkable for his amiable and cheerful manners.  -- Anonymous"),
                         new SimpleList("amicable","characterized by friendship and good will","Thus, by kindness, the natives of this region were won to friendship, and amicable relations were established.  -- Abbott, John S. C. (John Stevens Cabot)"),
                         new SimpleList("amnesty","a warrant granting release from punishment for an offense","After three years in prison, he was released last October in an amnesty that freed about 200 political detainees.  -- Seattle Times (Mar 5, 2012)"),
                         new SimpleList("amorphous","having no definite form or distinct shape","The problem is that where genes are tidy bits of DNA, the environment is huge, amorphous and hard to quantify.  -- New York Times (Jun 9, 2010)"),
                         new SimpleList("ample","more than enough in size or scope or capacity","Both are highly respected and well known, with ample experience in development and economic policy making.  -- New York Times (Mar 22, 2012)"),
                         new SimpleList("anachronism","something located at a time when it could not have existed","Today, the British monarchy seems like even more of an anachronism, notes my friend Merida, a London bureau friend now living in New York.  -- Time (Apr 20, 2011)"),
                         new SimpleList("analogous","similar or equivalent in some respects","The two conditions, although apparently analogous, are, in reality, very different.  -- Various"),
                         new SimpleList("anecdote","short account of an incident","With his fourth book,  Business at 16,  Mr. Bagchi hopes to get teenagers interested in business, partly by using fictional anecdotes, including boy-meets-girl stories.  -- New York Times (Nov 29, 2011)"),
                         new SimpleList("animosity","a feeling of ill will arousing active hostility","In this brutal contest, two opposing teams face off against each other with competing agendas, borrowed tuxedos and tight smiles concealing deep animosities.  -- New York Times (Jan 14, 2011)"),
                         new SimpleList("annihilate","kill in large numbers","Men deployed may fall back and escape; a mass of columns under direct artillery fire must surrender or be annihilated.  -- Morse, John"),
                         new SimpleList("anomaly","deviation from the normal or common order or form or rule","In this view, crises can be understood only as anomalies, the consequences of unusual outside shocks.  -- BusinessWeek (Dec 6, 2011)"),
                         new SimpleList("anonymous","having no known name or identity or known source","Throughout the process, the targeted consumers are tagged with an alphanumeric code, removing their names and making the data anonymous.  -- New York Times (Feb 21, 2012)"),
                         new SimpleList("antagonism","an actively expressed feeling of dislike and hostility","It bred a sense of resentment and secret antagonism which he took less pains to hide, from that night.  -- Prichard, Katharine Susannah"),
                         new SimpleList("antecedent","someone from whom you are descended","Paul Bunyan is known by his mighty works; his antecedents and personal history are lost in doubt.  -- Laughead, W. B."),
                         new SimpleList("anthropomorphic","suggesting human features for animals or inanimate things","The same anthropomorphic fallacy that accords human attributes to giant corporations like BP distorts clear thinking about how to limit their political influence.  -- Salon (Jul 28, 2010)"),
                         new SimpleList("anticipate","be excited or anxious about","I will continue to sit here as usual, waiting, grinning, tapping and anticipating my future.  -- New York Times (Mar 22, 2012)"),
                         new SimpleList("antipathy","a feeling of intense dislike","At any rate, they had, as a matter of fact, produced widespread discontent and bitter antipathies between classes.  -- Stephen, Leslie"),
                         new SimpleList("antithetical","sharply contrasted in character or purpose","Memorisation has a bad reputation in education today, dismissed as antithetical to creativity.  -- The Guardian (Apr 10, 2011)"),
                         new SimpleList("apathy","an absence of emotion or enthusiasm","When not thus engaged, his days were passed in listless apathy.  -- Anonymous"),
                         new SimpleList("aptitude","inherent ability","If there is such a thing as inherited aptitude for art it certainly showed itself in the family of Bach.  -- Forkel, Johann Nikolaus"),
                         new SimpleList("arbitrary","based on or subject to individual discretion or preference","The pieces don't build or develop, sections are carelessly joined, endings seem arbitrary.  -- New York Times (Jun 4, 2011)"),
                         new SimpleList("arcane","requiring secret or mysterious knowledge","Not just the knowledge of world geography but the very conceptualisation of space in this late medieval map looks to us remote and arcane.  -- The Guardian (Apr 24, 2010)"),
                         new SimpleList("archaic","so extremely old as seeming to belong to an earlier period","There are other advantages as well to reading the classics electronically--you can tap archaic words on the screen for an instant definition.  -- Time (Feb 9, 2012)"),
                         new SimpleList("archetype","something that serves as a model","In many ways, Mr. Romney and Mr. Huntsman embody the Mormon archetype: clean-cut, Republican American family men.  -- New York Times (Nov 18, 2011)"),
                         new SimpleList("ardent","characterized by intense emotion","Age, study, experience, retirement, reflection, had in no wise dimmed the fire of his ardent nationalism.  -- McCarthy, Justin"),
                         new SimpleList("arduous","characterized by effort to the point of exhaustion","He seemed about thirty-five years of age, though the trace of arduous mental and physical exertion gave him a rather worn and older appearance.  -- Lindley, Augustus F."),
                         new SimpleList("aristocratic","belonging to or characteristic of the nobility","Several aristocratic families were stripped of their status after World War II, limiting the number of royal matches.  -- BusinessWeek (Feb 16, 2012)"),
                         new SimpleList("artifice","a deceptive maneuver, especially to avoid capture","But small men use lying artifices and disguises to protect themselves.  -- Hillis, Newell Dwight"),
                         new SimpleList("ascetic","characteristic of the practice of rigorous self-discipline","Another frequent cause of visions is long-continued fasting combined with more or less ascetic devotion.  -- Vere, Maximilian Schele de"),
                         new SimpleList("aspire","have an ambitious plan or a lofty goal","India's leaders, eager for a bigger footprint in global affairs, now aspire to a permanent seat on an expanded United Nations Security Council.  -- New York Times (Mar 31, 2012)"),
                         new SimpleList("assimilation","the process of absorbing one cultural group into another","On the contrary, they themselves become Americanised, thanks to that faculty of assimilation which they possess in a high degree.  -- Allyn, Jack"),
                         new SimpleList("assuage","provide physical relief, as from pain","Moreover, I became at rest within myself, and the gaping, aching void which has filled my vitals these many days, became assuaged.  -- Hamilton, J. Angus"),
                         new SimpleList("atone","make amends for","But let us pause for a moment to remember what  redeeming  actually is: atoning or making up for some mistake or wrongdoing.  -- New York Times (Jan 25, 2011)"),
                         new SimpleList("attest","provide evidence for","Anticipating compensation, thousands flooded treatment centers seeking medical certificates attesting to their cholera.  -- New York Times (Mar 31, 2012)"),
                         new SimpleList("attire","clothing of a distinctive style or for a particular occasion","She was elegantly and fashionably attired, wearing rich earrings, gold chain and locket, three valuable rings in addition to her wedding-ring, and so forth.  -- Whymper, Frederick"),
                         new SimpleList("attribute","an abstraction belonging to or characteristic of an entity","This means that fundamentally important attributes such as common sense and curiosity are starting to take primacy.  -- Washington Post (Mar 29, 2012)"),
                         new SimpleList("attribution","assigning to a cause or source","But borrowing from sample essays found online or other online sources without attribution, even unintentionally, might result in your application being rejected.  -- BusinessWeek (Dec 15, 2011)"),
                         new SimpleList("audacious","disposed to venture or take risks","It was such an audacious, daring thing that the very thought made her dizzy.  -- Stokes, Katherine"),
                         new SimpleList("audible","heard or perceptible by the ear","Tavannes answered--but his words were barely audible above the deafening uproar.  -- Weyman, Stanley J."),
                         new SimpleList("augment","enlarge or increase","Computer engineers, in high demand but short supply, can command six-figure salaries right out of college, augmented by signing bonuses and equity or stock options.  -- New York Times (Jan 25, 2012)"),
                         new SimpleList("augur","predict from an omen","But ultimately the numbers augured an inescapably grim fate: Lieberman's approval rating in Connecticut bottomed out at just 31 percent last fall.  -- Time (Jan 19, 2011)"),
                         new SimpleList("augury","an event indicating important things to come","It was altogether a pretty picture, that seemed to be a happy augury of the good times in store.  -- Oxley, J. Macdonald (James Macdonald)"),
                         new SimpleList("auspicious","auguring favorable circumstances and good luck","The coast at the point at which he reached it seemed specially designed by nature for his favorable and auspicious reception.  -- Johnson, Willis Fletcher"),
                         new SimpleList("austere","severely simple","Adams was poor, simple, ostentatiously austere; the blended influence of Calvinistic theology and republican principles had indurated his whole character.  -- Stark, James H."),
                         new SimpleList("authentic","conforming to fact and therefore worthy of belief","This census is not considered authentic, as many transparent errors were found in various parts of it.  -- Casseday, Ben"),
                         new SimpleList("authoritarian","characteristic of an absolute ruler or absolute rule","But, he said,  all the ingredients of a repressive regime, an authoritarian regime, are there.   -- New York Times (Dec 13, 2011)"),
                         new SimpleList("authoritative","of recognized power or excellence","His plays are being revived, and an authoritative and exhaustive edition of his writings is being issued by a leading publishing house.  -- Ingleby, Leonard Cresswell"),
                         new SimpleList("avarice","reprehensible acquisitiveness; insatiable desire for wealth","Greed about getting or keeping money pertains to avarice, not necessarily to simony.  -- Callan, Charles Jerome"),
                         new SimpleList("avenge","take action in return for a perceived wrong","But Amon-Ra of Thebes avenged the dishonour that had been done him, and stirred up his adorers to successful revolt.  -- Sayce, A. H. (Archibald Henry)"),
                         new SimpleList("aversion","a feeling of intense dislike","Our peculiar aversion, nay, our dread, of various alimentary substances are well known.  -- Millingen, J. G. (John Gideon)"),
                         new SimpleList("avid","marked by active interest and enthusiasm","An avid runner, Moyer eventually began arriving six hours early on game days to exercise on an underwater treadmill.  -- New York Times (Mar 21, 2012)"),
                         new SimpleList("avuncular","resembling a uncle in kindness or indulgence","He is a consummate retail politician, given to small talk and an avuncular style.  -- New York Times (Feb 27, 2011)"),
                         new SimpleList("awe","an overwhelming feeling of wonder or admiration","The aurora deeply impressed him, inspiring feelings of awe and reverence.  -- Mudge, Zachariah Atwell")

                 };

        //ListAdapter listAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,simpleList);

        ListAdapter listAdapter=new CustomAdapter(this,simpleList);

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

                        Intent i=new Intent(a_main.this,Details.class);
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
            String str="a";
            Intent in = new Intent(a_main.this, quizStats.class);
            in.putExtra("val",str);
            startActivity(in);

        }catch (Exception ex){
            new AlertDialog.Builder(a_main.this).setMessage(""+ex).show();
        }

            return true;
        }else if(id == R.id.action_search){
            // get prompts.xml view
            LayoutInflater layoutInflater = LayoutInflater.from(a_main.this);
            View promptView = layoutInflater.inflate(R.layout.input_dialog, null);
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(a_main.this);
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
                                        new AlertDialog.Builder(a_main.this).setTitle(simpleList[i].words+"                        ").setMessage(simpleList[i].meanings+"    \n").show();
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
                                    new AlertDialog.Builder(a_main.this).setTitle("Word List: Oops                           ").setMessage("Word not in out database \n").show();

                                }

                            }catch (Exception ex)
                            {
                                new AlertDialog.Builder(a_main.this).setTitle("Error").setMessage(""+ex).show();
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
                String val="a";
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
                                    String str="a";
                                    Intent in = new Intent(a_main.this, quiz.class);
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
