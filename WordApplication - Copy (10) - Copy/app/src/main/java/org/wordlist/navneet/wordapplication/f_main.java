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
public class f_main extends ActionBarActivity {
    // private TextView resultText;
    private ListView myList;
    SimpleList simpleList[];
    DatabaseHelper2 db2;
    List<StudentsModel2> list2=new ArrayList<StudentsModel2>();
    // private ArrayList<SimpleList> alist=new ArrayList<SimpleList>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.f_main);

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
                new SimpleList("fabricate","put together out of artificial or natural components","Generally they are fabricated in that hardest of all metals--steel.  -- Hungerford, Edward"),
                new SimpleList("facet","a distinct feature or element in a problem","For the last two years, my work has focused on all facets of the energy sector, including investment, development and policy issues.  -- Forbes (Feb 16, 2012)"),
                new SimpleList("facetious","cleverly amusing in tone","I am looked upon as highly facetious at night, for I crack jokes with everybody near me until we fall asleep.  -- Forster, John"),
                new SimpleList("facile","performing adroitly and without effort","His facile talent adapted itself to every style in turn.  -- Gozzi, Carlo"),
                new SimpleList("facsimile","an exact copy or reproduction","These ultra-counterfeits are light years beyond the weak facsimiles produced by most forgers, who use desktop printers.  -- Time (Feb 24, 2012)"),
                new SimpleList("faction","a dissenting clique","According to reports, an Islamist, al-Qaeda-linked faction known as Ansar Dine spearheaded the city's takeover, likely muscling out more secular Tuareg and rebel comrades.  -- Time (Apr 6, 2012)"),
                new SimpleList("fallacy","a misconception resulting from incorrect reasoning","It's called the straw man fallacy: refuting arguments nobody's made.  -- Salon (Jun 30, 2011)"),
                new SimpleList("fallible","wanting in moral strength, courage, or will","We regard them as extraordinary but fallible and imperfect men, whom it would be very unsafe to follow in every view and line of conduct.  -- Various"),
                new SimpleList("fallow","left unplowed and unseeded during a growing season","But before that the fields, which had lain fallow through the winter, must be ploughed and harrowed.  -- Beyerlein, Franz"),
                new SimpleList("falter","the act of pausing uncertainly","Tom tried to speak, but he faltered and moved from one foot to the other, in an embarrassed and hesitating way.  -- Lever, Charles James"),
                new SimpleList("familial","relating to a social unit living together","They are also highly familial, with very high rates among first-degree relatives of affected people.  -- Scientific American (Jan 18, 2011)"),
                new SimpleList("famine","a severe shortage of food resulting in starvation and death","To address famine in developing countries, genetic engineers can make inexpensive food crops, such as rice or corn, that contain extra nutrients.  -- Nature (Feb 29, 2012)"),
                new SimpleList("farcical","broadly or extravagantly humorous","Mr. Sheldon's The Havoc seems also farcical in its type; nevertheless it is a serious satiric thrust at certain extreme conceptions of marital relations.  -- Burton, Richard Francis, Sir"),
                new SimpleList("fastidious","giving careful attention to detail","Clodagh bent her head, noting with the fastidious intolerance of youth that his clothes were baggy and his hands unclean.  -- Thurston, Katherine Cecil"),
                new SimpleList("fatal","bringing death","It was a very fatal complication, death resulting in all but two instances.  -- Various"),
                new SimpleList("fatuous","devoid of intelligence","Seth Meyers's opening monologue: Background required to understand jokes: Like other celebrities, professional athletes are occasionally fatuous and commit embarrassing acts in their personal lives.  -- New York Times (Jul 15, 2010)"),
                new SimpleList("fauna","all the animal life in a particular region or period","Bore holes and wells drilled in Australia, however, have revealed an amazing water beetle fauna of about 100 species.  -- The Guardian (Apr 3, 2011)"),
                new SimpleList("fawning","attempting to win favor by flattery","Waiters at fashionable hotels, who hung on the chairs of rich guests with more than usual fawning, were boasting of fortunes made in a day.  -- Dixon, Thomas"),
                new SimpleList("fealty","the loyalty that citizens owe to their country","In Germany and France the vassal owned supreme fealty to his lord, against all foes, even the King himself.  -- Parmele, Mary Platt"),
                new SimpleList("feasible","capable of being done with means at hand","There are many evening classes at universities in major metropolitan areas, which make it more feasible when you're working full-time.  -- BusinessWeek (Jun 21, 2011)"),
                new SimpleList("feckless","generally incompetent and ineffectual","Her research helped change the stereotype of bankrupt people as feckless deadbeats: many, she showed, are middle-class workers upended by divorce or illness.  -- New York Times (Mar 24, 2010)"),
                new SimpleList("feign","give a false appearance of","Robots, says Christian, have become quite good at feigning conversation, giving an appearance of interchange, when in fact there is none.  -- Forbes (Feb 9, 2012)"),
                new SimpleList("felicity","state of well-being characterized by contentment","In those warm climates men imagined there could be no greater felicity than shades and murmuring brooks.  --"),
                new SimpleList("feral","wild and menacing","Rural Arkansans are seeing Razorback red as feral hogs are destroying yards, wreaking havoc on gardens and leaving behind their waste.  -- Reuters (Jul 21, 2011)"),
                new SimpleList("fervent","characterized by intense emotion","Inside was an uproar of adulation: repeated standing ovations, eagerly shouted requests, Cuban flags and banners unfurled, fervent singalongs, roses hurled onstage.  -- New York Times (Jun 7, 2010)"),
                new SimpleList("fiasco","a sudden and violent collapse","Still, it's hard to imagine a more embarrassing public relations fiasco than being connected with child sex trafficking -- even indirectly.  -- Time (Apr 2, 2012)"),
                new SimpleList("fickle","liable to sudden unpredictable change","Once Hollywood's most reliable audience, teenagers have become increasingly fickle and distracted by other leisure activities, like video games.  -- New York Times (Feb 2, 2012)"),
                new SimpleList("fidelity","the quality of being faithful","Her fidelity to Scriptural language may be seen in the following simple verses: Have ye heard the invitation, Sinners ruined by the fall?  -- Ryden, Ernest Edwin"),
                new SimpleList("figurative","not literal","The cat-in-heat joke, the judge said, quoting from a previous court decision, was  colorful, figurative rhetoric that reasonable minds would not take to be factual.   -- Seattle Times (May 5, 2010)"),
                new SimpleList("filial","designating the generation following the parental generation","Filial cannibalism, where a mother eats her own offspring, is much rarer, particularly among great apes, in which it has only once been reported before.  -- BBC (Feb 1, 2010)"),
                new SimpleList("filibuster","a tactic for delaying legislation by making long speeches","The government has accused Labour of deliberately trying to sabotage the bill by stretching out debate - known as filibustering.  -- BBC (Jun 23, 2010)"),
                new SimpleList("finesse","subtly skillful handling of a situation","Drivers say that turning on ice requires finesse -- turn too much, and you will spin out; don't turn enough, and the turn will not happen.  -- New York Times (Mar 23, 2010)"),
                new SimpleList("finicky","exacting especially about details","After overeating for a day or two, Dr. Levitsky said, people become very finicky; starving yourself will decrease food selectivity.  -- New York Times (Aug 8, 2011)"),
                new SimpleList("finite","bounded in magnitude or spatial or temporal extent","Scientists have long taught that all female mammals are born with a finite supply of egg cells, called ooctyes, that runs out in middle age.  -- Time (Feb 20, 2012)"),
                new SimpleList("firebrand","someone who deliberately foments trouble","The firebrand rarely pulled punches, and some obituarists are following his lead.  -- Slate (Mar 2, 2012)"),
                new SimpleList("firmament","the sphere on which celestial bodies appear to be projected","The firmament above us was without a cloud, and of a darkness almost equal to that which surrounded the moon at 2 a.m.  -- Tyndall, John"),
                new SimpleList("fissure","a long narrow depression in a surface","The fissures produced in the crust are sometimes clean, sharply defined divisional planes, like cracks across a pane of glass.  -- Various"),
                new SimpleList("flabbergasted","as if struck dumb with astonishment and surprise","I should translate from experience:   Flabbergasted; astounded and bewildered at the same time, with a slight dash of premature second childhood thrown in.   -- Williamson, A. M. (Alice Muriel)"),
                new SimpleList("flagrant","conspicuously and outrageously bad or reprehensible","-- -"),
                new SimpleList("flail","thresh about","Coach Tom Coughlin was raging as only he can, arms flailing in all directions, after a blocked field-goal attempt in the fourth quarter.  -- New York Times (Sep 12, 2011)"),
                new SimpleList("flaunt","display proudly","Between the corridors of Saddar, Karachi's old city, sunlit storefronts still flaunt glorious silks and chiffons, offering distractions from striking poverty on the street.  -- New York Times (Mar 5, 2012)"),
                new SimpleList("flippant","showing inappropriate levity","I may be flippant--several people have called me flippant--but I draw the line at making jokes about murder.  -- Birmingham, George A."),
                new SimpleList("flora","all the plant life in a particular region or period"," The flora is so vivid -- every few meters you come across a different plant,  he explained later.  -- New York Times (Dec 31, 2010)"),
                new SimpleList("florid","elaborately or excessively ornamented","The North Korean Central News Agency, in its typically florid language, derided the exercise as warmongering and threatened  a merciless counterblow.   -- New York Times (Sep 24, 2010)"),
                new SimpleList("flounder","walk with great difficulty","He set out for it, limping, while the sharp gravel rolled under his bleeding feet as he floundered up the climbing trail.  -- Bindloss, Harold"),
                new SimpleList("flourish","grow vigorously","Roses are a flourishing industry in India, particularly around Valentine's Day.  -- New York Times (Feb 14, 2012)"),
                new SimpleList("fluke","a stroke of luck","Cautious that it might be a fluke, Midas tried the program in St. Louis and got similarly encouraging results.  -- Time (Nov 11, 2010)"),
                new SimpleList("fluster","cause to be nervous or upset","Ms. Ryan also includes time for role-playing situations that might fluster the student, like being pulled over by a police officer.  -- New York Times (Mar 27, 2012)"),
                new SimpleList("flux","in constant change","Though plans are still in flux, he will likely travel by sailboat, kayak, foot and mountain bike.  -- New York Times (Dec 30, 2011)"),
                new SimpleList("fodder","coarse food composed of plants or leaves and stalks"," The products will be mainly fruits and vegetables, and we're looking at cereals as well, fodder, livestock and fisheries.   -- Reuters (Jan 6, 2012)"),
                new SimpleList("foible","a minor weakness or peculiarity in someone's character","In truth, the leading foible of Hodgkinson through life, was vanity--the great taproot of all his irregularities and errors.  -- Carpenter, S. C. (Stephen Cullen)"),
                new SimpleList("foil","hinder or prevent, as an effort, plan, or desire","On March 1st, a Turkish newspaper reported that the country's intelligence service had foiled an attempt by Syrian agents to kidnap the colonel.  -- Time (Mar 9, 2012)"),
                new SimpleList("foliage","the aggregate of leaves of one or more plants","Witch hazel will burst into small yellow flowers in January, and striking plants like Japanese maple will have brilliant red foliage throughout summer and fall.  -- New York Times (Dec 26, 2010)"),
                new SimpleList("foment","try to stir up","Iran is often accused of instigating, fomenting, or stirring up violence and anti-Americanism in other countries.  -- Slate (Apr 5, 2012)"),
                new SimpleList("forage","collect or look around for, as food","Banded birds also arrived later at the breeding grounds and took longer trips to forage for food.  -- Science Magazine (Jan 12, 2011)"),
                new SimpleList("foray","an initial attempt","Another big question is whether Apple will reveal its rumored foray into making TV sets.  -- Seattle Times (Mar 7, 2012)"),
                new SimpleList("foreboding","a feeling of evil to come","There were forebodings of evil in attempting this winter journey now stretched out to fifteen hundred miles, under conditions which increased its perils.  -- Greely, Adolphus W."),
                new SimpleList("forecast","a prediction about how something will develop","We broke another record today as forecasts show the March warm spell continuing into next week.  -- Chicago Tribune (Mar 15, 2012)"),
                new SimpleList("forensic","used in the investigation of facts or evidence in court","Defence lawyers said the large number of forensic tests which had been carried out had failed to find any substantial evidence linked to the accused.  -- BBC (Feb 23, 2012)"),
                new SimpleList("foresee","realize beforehand","Shortly thereafter the political atmosphere was considerably disturbed by the Crete affair, just as Chevket Pasha had foreseen.  -- Straus, Oscar S."),
                new SimpleList("foreshadow","indicate by signs","Rising wealth disparities could foreshadow a year of tensions, as failed harvests and inflation cause famines, riots, hoarding and trade wars worldwide.  -- BusinessWeek (Jan 6, 2011)"),
                new SimpleList("foresight","seeing ahead; knowing in advance; foreseeing","Mr. Bourassa said that General Lea, gifted with an astonishing foresight, predicted all that was happening in Europe and in the world.  -- Desjardins, Louis-Georges"),
                new SimpleList("forestall","keep from happening or arising; make impossible","Many hundreds, perhaps thousands, of the guards -- at some points posted every 15 feet -- had apparently been deployed to forestall disruptions.  -- New York Times (Oct 18, 2011)"),
                new SimpleList("forfeit","lose or lose the right to by some error, offense, or crime","By giving up its status as a U.S. bank holding company, Deutsche Bank is forfeiting its access to the Federal Reserve's emergency lending window.  -- Washington Post (Mar 24, 2012)"),
                new SimpleList("forge","create by hammering","Forging and Welding.--The process of pressing or hammering wrought iron when at a red or white heat into any desired shape is called forging.  -- Low, David Allan"),
                new SimpleList("forlorn","marked by or showing hopelessness","Hans, the resort in such emergencies, was given a light sledge, the two surviving dogs, and to him was committed the forlorn hope.  -- Mudge, Zachariah Atwell"),
                new SimpleList("formidable","extremely impressive in strength or excellence","That has not prevented China from producing modern weapons systems, buying arms elsewhere and building up a formidable military with both.  -- New York Times (Nov 21, 2011)"),
                new SimpleList("forsake","leave someone who needs or counts on you; leave in the lurch","He was not going to forsake her, but would serve her to the day of his death.  -- Pennell, T. L. (Theodore Leighton)"),
                new SimpleList("forte","an asset of special worth or utility","Playmaking has never been Anthony's forte, but the ball moved a bit better and, at times, the offense hummed in the first half.  -- New York Times (Dec 30, 2011)"),
                new SimpleList("forthcoming","available when required or as promised","Two colleges aren't forthcoming with solid offers, leaving you at an unreasonable disadvantage in making your important decision on deadline.  -- New York Times (Apr 14, 2011)"),
                new SimpleList("fortified","having something added to increase the strength","Some of the houses at Wells were fortified; one in particular was defended by fifteen men under a militia captain named Convers.  -- LeSueur, William Dawson"),
                new SimpleList("fortitude","strength of mind that enables one to endure adversity","Have you ever proved your fortitude by suffering protracted pain, enduring continued hunger, or sustaining great fatigue?  -- Schoolcraft, Henry Rowe"),
                new SimpleList("fortress","a fortified defensive structure","Before the invention of gunpowder Castle Reifenstein had been an impregnable fortress, although it owed little of its impregnability to art.  -- Streckfuss, Adolph"),
                new SimpleList("fortuitous","occurring by happy chance","Did the prosperities and confident hopes with which the twentieth century opened, mark nothing more than a culmination of fortuitous good luck?  -- H. G."),
                new SimpleList("fortunate","having unexpected good luck","Chet was not so fortunate, as his gun failed to go off.  -- Stratemeyer, Edward"),
                new SimpleList("fortune","a large amount of wealth or prosperity","He has an independent fortune, though not called rich in this country. -- Various"),
                new SimpleList("forum","a public facility to meet for open discussion","Britain and Hong Kong set up a forum earlier this year to discuss working more closely in yuan trade clearing and settlement.  -- Wall Street Journal (Mar 8, 2012)"),
                new SimpleList("foster","help develop, help grow","Paris and Pyongyang do not have formal diplomatic relations, but France opened an office in North Korea last year to foster cultural exchanges.  -- Seattle Times (Mar 9, 2012)"),
                new SimpleList("foul","highly offensive; arousing aversion or disgust","There was panic buying of bottled water in some areas in Jiangsu after residents noticed a foul smell coming from the tap water.  -- BBC (Feb 8, 2012)"),
                new SimpleList("founder","a person who establishes some institution","Microsoft founder Bill Gates is expected to testify.  -- Washington Post (Oct 19, 2011)"),
                new SimpleList("founding","the act of starting something for the first time","Eight years later, Garay succeeded in founding Buenos Aires after Zarate, the third adelantado, had failed as badly as any of his predecessors.  -- Dawson, Thomas C."),
                new SimpleList("foyer","a large entrance or reception room or area","Suddenly James, their stooping, white-haired Irish servant pushed through the doorway from the paneled entry foyer.  -- Hoover, Thomas"),
                new SimpleList("fracas","noisy quarrel","After an estimated half-dozen individual altercations on the court, some Chinese onlookers joined the fracas, the Washington Post reported late on Thursday.  -- Reuters (Aug 19, 2011)"),
                new SimpleList("fractious","easily irritated or annoyed","The last-minute haggling between 19 countries involved in the test over whether and how to make the test's design available, highlights fractious European Union decision-making.  -- Reuters (Jul 8, 2010)"),
                new SimpleList("fracture","breaking of hard tissue such as bone","He was convicted of recklessly causing grievous bodily harm to Cowley, who sustained fractures to his jaw, eye socket, cheekbone and nose.  -- Seattle Times (Mar 18, 2012)"),
                new SimpleList("fragile","easily broken or damaged or destroyed","Larvae lack mouths, eyes and guts and are so fragile that colliding with an air bubble could kill them.  -- Scientific American (Apr 6, 2012)"),
                new SimpleList("fragrant","pleasant-smelling","Michael found himself wrapped in a cloud of filmy linen fragrant with feminine perfumes.  -- Blasco Ib??ez, Vicente"),
                new SimpleList("frail","physically weak","He had been frail for years, using a walker to get around.  -- Seattle Times (Oct 9, 2011)"),
                new SimpleList("fraud","intentional deception resulting in injury to another person","Despite claims of sporadic vote rigging in Sunday's presidential election, it is becoming increasingly clear that Mr. Putin had enough support to win without fraud.  -- New York Times (Mar 8, 2012)"),
                new SimpleList("fraught","marked by distress","His girlfriend's parents are divorced, and her family situation is fraught.  -- New York Times (Mar 16, 2012)"),
                new SimpleList("frenetic","excessively agitated","But the Rams mimic the frenetic nature of their mentor; they run, press, take charges and go at least nine players deep.  -- New York Times (Jan 31, 2010)"),
                new SimpleList("frenzy","state of violent mental agitation","Inside the store, glassy-eyed staff were whipped up into a frenzy of excitement, jumping up and down, clapping and shouting.  -- BBC (May 17, 2011)"),
                new SimpleList("fresco","a mural done with watercolors on wet plaster"," She's an unmitigated nuisance,  declared an artist, proceeding to Natal in order to paint some frescoes for one of the important buildings.  -- Westerman, Percy F. (Percy Francis)"),
                new SimpleList("frolic","play boisterously","More nimble now than when he was young, he frolics about, cuts capers, and leaps from the bottom of a large pitcher.  -- Michelet, Jules"),
                new SimpleList("frontier","an international boundary or the area immediately inside it","Thus threatened with invasion on her German and Italian frontiers, France was disabled by anarchy within.  -- Various"),
                new SimpleList("frugal","avoiding waste","Such banking represents the kind of   frugal innovation  that India has become known for in recent years -- finding inexpensive solutions to its development challenges.  -- New York Times (Sep 29, 2011)"),
                new SimpleList("fulminate","criticize severely","Mr. Cameron has fulminated publicly about cutting public sector pay and decreed that members of Parliament themselves take a 5 percent pay cut.  -- New York Times (May 25, 2010)"),
                new SimpleList("fulsome","unpleasantly and excessively suave or ingratiating","Fulsome, fool'sum, adj. cloying or causing surfeit: nauseous: offensive: gross: disgustingly fawning.--adj.  -- Various"),
                new SimpleList("furtive","secret and sly or sordid","I anticipated finding them deceitful and evasive: furtive people, wandering in devious ways and disappearing into mysterious houses, at dead of night.  -- Street, Julian"),
                new SimpleList("futile","producing no result or effect","He took up elocution lessons for a while, but eventually concluded that his efforts to become an Englishman were futile.  -- Forbes (Jul 20, 2011)")

        };

        //ListAdapter listAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,simpleList);

        ListAdapter listAdapter=new CustomAdapter_f(this,simpleList);

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

                        Intent i=new Intent(f_main.this,Details.class);
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
                String str="f";
                Intent in = new Intent(f_main.this, quizStats.class);
                in.putExtra("val",str);
                startActivity(in);

            }catch (Exception ex){
                new AlertDialog.Builder(f_main.this).setMessage(""+ex).show();
            }

            return true;
        }else if(id == R.id.action_search){
            // get prompts.xml view
            LayoutInflater layoutInflater = LayoutInflater.from(f_main.this);
            View promptView = layoutInflater.inflate(R.layout.input_dialog, null);
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(f_main.this);
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
                                        new AlertDialog.Builder(f_main.this).setTitle(simpleList[i].words+"                        ").setMessage(simpleList[i].meanings+"    \n").show();
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
                                    new AlertDialog.Builder(f_main.this).setTitle("Word List: Oops                           ").setMessage("Word not in out database \n").show();

                                }

                            }catch (Exception ex)
                            {
                                new AlertDialog.Builder(f_main.this).setTitle("Error").setMessage(""+ex).show();
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
                String val="f";
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
                                    String str="f";
                                    Intent in = new Intent(f_main.this, quiz.class);
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
