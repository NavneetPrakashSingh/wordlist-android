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
public class h_main extends ActionBarActivity {
    // private TextView resultText;
    private ListView myList;
    SimpleList simpleList[];
    DatabaseHelper2 db2;
    List<StudentsModel2> list2=new ArrayList<StudentsModel2>();
    // private ArrayList<SimpleList> alist=new ArrayList<SimpleList>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h_main);

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
                new SimpleList("habitat","the type of environment in which an organism normally lives","Peromyscus maniculatus is ubiquitous, occurring in habitats ranging from mesic boreal forests to arid southwestern deserts.  -- Douglas, Charles L."),
                new SimpleList("habitual","commonly used or practiced","Training of mind, as of hand, consists in making certain actions so habitual that they are accomplished quite automatically.  -- Walsh, James J. (James Joseph)"),
                new SimpleList("habitue","a regular patron","The old bathers, the habitues, whose season was almost over, glanced, gazed toward the door whenever it opened, to see what new faces might appear.  -- Maupassant, Guy de"),
                new SimpleList("hackneyed","repeated too often; overfamiliar through overuse","She instinctively avoids every thing that is hackneyed, vulgar, and common place, and uniformly succeeds in pleasing by the judicious novelties she introduces.  -- Montefiore, Judith Cohen, Lady"),
                new SimpleList("haggard","showing the wearing effects of overwork or care or suffering","There are too many people with haggard eyes standing before me Saying, To live you must suffer even as we.  -- Fletcher, John Gould"),
                new SimpleList("haggle","an instance of intense argument (as in bargaining)","They haggled for a while, and finally agreed on sixteen.  -- Porterfield, Allen Wilson"),
                new SimpleList("halcyon","idyllically calm and peaceful; suggesting happy tranquility","Smooth seas, lovely weather and favoring winds speeded the voyagers: those halcyon days flew swiftly by.  -- Edson, Milan C."),
                new SimpleList("hale","exhibiting or restored to vigorous good health","He is a hale man, he does not look his years.  -- Meade, L. T."),
                new SimpleList("hallowed","worthy of religious veneration","Our life together is sacred, hallowed, a thing apart, 'Above the smoke and stir of this dim spot Which men call earth.'  -- Birmingham, George A."),
                new SimpleList("halt","cause to stop","Shares of Apple were temporarily halted before they resumed trading a few minutes later.  -- New York Times (Mar 23, 2012)"),
                new SimpleList("haphazardly","without care; in a slapdash manner","Tripoli drivers have always been known for their speeding and changing lanes haphazardly, but hazardous driving has reached new heights, he said.  -- New York Times (Nov 29, 2011)"),
                new SimpleList("hapless","deserving or inciting pity","Then seeing how rueful, how dismayed the hapless giant looked, she took compassion and held out a frank little brown hand.  -- Wingfield, Lewis"),
                new SimpleList("harangue","address forcefully","On that occasion, he harangued the West for more than 90 minutes, attacking its moral bankruptcy in an often nonsensical rant.  -- Time (Oct 20, 2011)"),
                new SimpleList("harbinger","something indicating the approach of something or someone","Even as villagers stared out at an ocean of detritus littered by the tsunami, cherry blossoms, the harbinger of spring, bloomed.  -- Time (Apr 11, 2011)"),
                new SimpleList("harmony","compatibility in opinion and action","These fibres are so laid and connected, that a whole set of muscles can be moved simultaneously, being made to work in perfect harmony.  -- Calderwood, Henry"),
                new SimpleList("harried","troubled persistently especially with petty annoyances","Hours passed before Ann could sleep, and then her slumber was broken, her rest harried by weird dreams, her half-waking periods crammed with disturbing fantasies.  -- Titus, Harold"),
                new SimpleList("harrowing","extremely painful","Rhythmic activities, such as dancing, riding and climbing may be mentioned, also harrowing experiences, such as being run over.  -- Freud, Sigmund"),
                new SimpleList("hasten","move fast","Turnpike workers who peeled up the sticky puddles, then covered them with sand to hasten drying, had traffic moving normally again by Wednesday morning.  -- Washington Post (Nov 23, 2011)"),
                new SimpleList("haughty","having or showing arrogant superiority to","He might easily be reserved,' but is it not surprising to find him described as haughty, prouder than Lucifer, inhumanly arrogant?  -- Bradley, Andrew Cecil"),
                new SimpleList("hauteur","overbearing pride with a superior manner toward inferiors","In them are written hauteur, pride, and arrogant fierceness beyond anything on this earth; there is also contempt that has no expression in speech.  -- Rountree, Harry"),
                new SimpleList("haven","a shelter serving as a place of safety or sanctuary","At most shows, security guards usually swoop in at this point, cutting off audience access to designers and their backstage havens.  -- Seattle Times (Feb 15, 2012)"),
                new SimpleList("havoc","violent and needless disturbance","On Friday, 62-mph winds caused havoc, knocking over TV towers and fences, and forced race organizers to cancel a giant slalom.  -- Seattle Times (Feb 11, 2012)"),
                new SimpleList("headstrong","habitually disposed to disobedience and opposition","She has a great deal of difficulty, for they are both so headstrong and unruly that they will hardly obey at all.  -- S. L. M."),
                new SimpleList("hearsay","gossip passed around by word of mouth","I tell you not of things learned by hearsay; I myself have beheld all these horrors in the Holy Land of Palestine.  -- Greene, Frances Nimmo"),
                new SimpleList("hearty","showing warm and sincere friendliness","Not one hesitating voice, but instead, three hearty cheers, that made the vessel ring.  -- Headley, Joel Tyler"),
                new SimpleList("heathen","a person who does not acknowledge your god","Are you Christians, said the holy man, or heathens?  -- Various"),
                new SimpleList("heave","throw with great effort","Instead, he panicked and heaved an incomplete pass at teammate Rich Seubert.  -- Seattle Times (Jan 20, 2012)"),
                new SimpleList("heckler","someone who tries to embarrass you with gibes and objections","For the next few days, when NTV reporters went out to cover public events, hecklers gathered around them chanting shame.  -- New York Times (Mar 24, 2012)"),
                new SimpleList("heed","pay close attention to","For some distance he put on great speed, but later heeded Perth's suggestion to go more slowly and so attract less notice.  -- Braden, James A. (James Andrew)"),
                new SimpleList("heedless","characterized by careless unconcern","Rembrandt was heedless in his habits, spending what he earned, living on credit, signing onto bad deals.  -- New York Times (Feb 18, 2011)"),
                new SimpleList("hegemony","the dominance or leadership of one social group over others","Chinese officials say the purpose of their military modernization is purely defensive and they have no aspirations toward regional hegemony.  -- BusinessWeek (Jan 10, 2011)"),
                new SimpleList("heinous","extremely wicked, deeply criminal","Supporters of the death penalty, meanwhile, described heinous cases and said there were still some circumstances so intolerable as to require execution.  -- New York Times (Jan 12, 2011)"),
                new SimpleList("heir","a person who inherits some title or office","Hu's heir apparent, Vice President Xi Jinping, is scheduled to take over next year and is far less shy about making headlines and meeting Westerners.  -- Newsweek (Jan 18, 2011)"),
                new SimpleList("helm","a position of leadership","He held various positions, including head of the technology development planning unit and personnel chief, before taking the helm at the camera business in April.  -- BusinessWeek (Oct 27, 2011)"),
                new SimpleList("hemisphere","half of a sphere","The New World or Western Hemisphere consists of two continents.  -- Kirkpatrick, F. A. (Frederick Alexander)"),
                new SimpleList("hemorrhage","the flow of blood from a ruptured blood vessel","On the other hand, babies delivered by C-section were less likely to have one type of bleeding around the brain -- known as subdural hemorrhage.  -- Reuters (Nov 30, 2011)"),
                new SimpleList("herald","foreshadow or presage","The fleet of traders was preceded some way in advance by light, swift sailing ships which heralded its coming.  -- Norway, Arthur H."),
                new SimpleList("herbivorous","feeding only on plants","Sheep and cattle are herbivorous: they feed on herbs, on vegetables.  -- Walsh, William Shepard"),
                new SimpleList("herculean","extremely difficult; requiring great strength","He made herculean efforts to get on terms with his examination subjects, and worked harder than he had ever done in his life before.  -- Marshall, Archibald"),
                new SimpleList("hereditary","inherited or inheritable by established rules of descent","From the way in which his eldest son Osman is being brought up, it is evident that Abdullah seeks to establish an hereditary succession.  -- Wingate, F. R."),
                new SimpleList("heresy","any opinions at variance with the official position","It wished still to dominate over the faith of its disciples and to persecute as heresy every deviation from its convictions.  -- Freytag, Gustav"),
                new SimpleList("heritage","that which is inherited","SAT-SUN Celebrating Japan's cultural heritage with performing arts, martial arts demonstrations, tea ceremony demonstrations, exhibits, food vendors, workshops, Koi Show, 10 a.m.-6 p.m.  -- Seattle Times (Sep 7, 2011)"),
                new SimpleList("hermetic","completely sealed or airtight","The hermetic isolation which during the world war divided Europe into two separate worlds made this doubly urgent.  -- Czernin von und zu Chudenitz, Ottokar Theobald Otto Maria, Graf"),
                new SimpleList("hermitage","the abode of a recluse","In his sorrow and remorse the knight withdrew into a hermitage, where he spent six years in constant penance and prayer.  -- Guerber, H. A. (H�l�ne Adeline)"),
                new SimpleList("heterodox","characterized by departure from accepted standards","You will think these ideas horribly heterodox, but if we all thought alike there would be nothing to write about and nothing to learn.  -- Marchant, James"),
                new SimpleList("heterogeneous","consisting of elements not of the same kind or nature","Mine layers were here with mine sweepers and hospital ships--a heterogeneous collection of well-nigh every kind of ship that floats.  -- Farnol, Jeffery"),
                new SimpleList("heuristic","a commonsense rule to help solve some problem","He was swayed by the familiarity heuristic, which basically says that humans trust what is familiar.  -- US News (Sep 20, 2010)"),
                new SimpleList("hew","strike with an axe; cut down, strike","But the swords are active and clearly seen smiting,  hewing, chopping.  -- The Guardian (Aug 29, 2011)"),
                new SimpleList("hiatus","an interruption in the intensity or amount of something","Real estate prices are skyrocketing because of all the international organizations coming back to Mogadishu after a 20-year hiatus.  -- New York Times (Apr 3, 2012)"),
                new SimpleList("hibernate","be in an inactive or dormant state","In winter they hibernate like our squirrels, passing several months underground in a kind of slow and nearly motionless existence.  -- Clarke, J. Erskine (John Erskine)"),
                new SimpleList("hierarchy","a series of ordered groupings within a system","After enough trials, the conventionally raised pigeons inferred a hierarchy of the most fruitful colors: red > blue > green > yellow > violet.  -- Scientific American (Mar 8, 2012)"),
                new SimpleList("hieroglyphic","belonging to a writing system using pictorial symbols","Hieroglyphic writing is really picture writing, and is the oldest means man has employed to enable him to communicate with his fellows.  -- Kelly, R. Talbot (Robert Talbot)"),
                new SimpleList("hilarious","marked by boisterous merriment or convulsive laughter","Soames saw, too, at least one hilarious group of college-age boys who might have been organized by a college humor magazine.  -- Leinster, Murray"),
                new SimpleList("hinder","be an obstacle to","Polish drilling also has been hindered by a scarcity of rigs, water and specialized equipment needed for shale wells, Bern said.  -- BusinessWeek (Feb 1, 2012)"),
                new SimpleList("hindmost","located farthest to the rear","He was the hindmost when the race began, but with widespread nostrils, long extended neck, and glaring eyeballs, he seemed to fly over the course.  -- MacLean, J. P. (John Patterson)"),
                new SimpleList("hindrance","any obstruction that impedes or is burdensome","While Japanese giant Sony said China's move represented a hindrance to free trade, for other companies the Chinese action provided a boost. -- Reuters (Dec 29, 2010)"),
                new SimpleList("hinge","a joint that holds two parts together so that one can swing","He opened the door, trying to will away telltale creaks in hinges and joints, avoid any possible attention.  -- Nature (Mar 28, 2012)"),
                new SimpleList("hinterland","a remote and undeveloped area","There in those half explored and altogether unsettled hinterlands, lurk desires that sting like adders and hatreds cruel as hell....  -- Wells, H. G. (Herbert George)"),
                new SimpleList("hireling","a person who works only for money","Hireling troops, soldiers serving for pay: they were not Ultonians and did not belong to the Red Branch.  -- Joyce, P. W."),
                new SimpleList("hirsute","having or covered with hair","Peter got out after a prolonged struggle; place very hirsute; big beards on everybody; ten parts of hair to one part Dutchman.  -- Doesticks, Q. K. Philander"),
                new SimpleList("histrionic","characteristic of acting or a stage performance","Present-day Graham dancers are often taken to task for overacting, or histrionics or otherwise obscuring the integrity of their material.  -- New York Times (Mar 19, 2012)"),
                new SimpleList("hoard","save up as for future use","The offspring of starving mothers, anticipating hard times during their own future lives, adjust their metabolisms to hoard calories.  -- Economist (Jan 6, 2011)"),
                new SimpleList("hoary","having gray or white hair as with age","He was an aged monarch of the mountains, reddish brown in color originally, but now a hoary dirty gray.  -- Brady, Cyrus Townsend"),
                new SimpleList("hoax","something intended to deceive","On Monday, a bomb threat received in London was first taken by the police as credible, but later described as a probable hoax.  -- New York Times (May 18, 2011)"),
                new SimpleList("hoist","raise or haul up with or as if with mechanical help","Then the signal was given to resume hoisting the big fish aboard, and once more the crane started winding up the cable.  -- Duffield, J. W."),
                new SimpleList("holocaust","an act of mass destruction and loss of life","Twenty-four thousand bodies were burned in one holocaust, and it is solemnly stated that in the spring thaws twelve thousand more were brought to light.  -- Sloane, William Milligan"),
                new SimpleList("homage","respectful deference","With cathedral ceilings, sparkling mosaic tile floors and elaborately carved moldings and paneling, the restaurant pays homage to the Gilded Age.  -- New York Times (Jun 12, 2010)"),
                new SimpleList("homespun","characteristic of country life","His rural, homespun demeanor ordinarily might elicit snickers from India's urban elite.  -- New York Times (Aug 19, 2011)"),
                new SimpleList("homily","a sermon on a moral or religious topic","Benedict said in a homily last week that Christians must repent for sins and recognize mistakes in comments widely interpreted as concerning the scandal.  -- New York Times (Apr 21, 2010)"),
                new SimpleList("homogeneous","all of the same or similar kind or nature","But I thought, My goodness, what a homogeneous population, akin to identical white mice, which thereby controls for all sorts of differences.'   -- New York Times (Aug 30, 2010)"),
                new SimpleList("homologous","similar in position, structure, function or characteristics","So, too, organs which were homologous in the ordinary sense, as the heart of birds and mammals, might have arisen separately in evolution.  -- E. S. (Edward Stuart) Russell"),
                new SimpleList("hone","make perfect or complete","Kopec says his clients are wine curious and fast learners, honing their palates by sharing bottles in private rooms at restaurants.  -- BusinessWeek (Nov 13, 2011)"),
                new SimpleList("honor","bestow rewards upon","The host country's gold medalists will be honored with commemorate postage stamps available at 500 outlets the very next day, Royal Mail announced.  -- Seattle Times (Apr 9, 2012)"),
                new SimpleList("honorable","deserving of esteem and respect","The office of bailiff formerly was high and honorable in England, and officers under that title on the continent are still invested with important functions.--Webster.  -- Spooner, Lysander"),
                new SimpleList("horde","a vast multitude","New York's Times Square was awash in hopeful sentiments as it prepared to welcome hordes of New Year's Eve revelers.  -- Chicago Tribune (Dec 31, 2011)"),
                new SimpleList("horizon","the line at which the sky and Earth appear to meet","We can see to the horizon about 35 miles distant, tapering off into low blue hills, and closer in, three shivering silver lakes.  -- New York Times (Nov 14, 2011)"),
                new SimpleList("horrendous","causing fear or dread or terror","Some wounded civilians evacuated from Misrata by boat described horrendous scenes of shelling and hand-to-hand fighting, he says.  -- BBC (Apr 6, 2011)"),
                new SimpleList("hortatory","giving strong encouragement","For hortatory or inspirational purposes we do not need to make this analysis; it has, indeed, its practical dangers.  -- Drake, Durant"),
                new SimpleList("horticultural","of or relating to the cultivation of plants","Japanese flower arrangements, candles and giant orchids make the stage look more like an oriental horticultural exhibition than a concert venue.  -- The Guardian (Aug 6, 2010)"),
                new SimpleList("hospitable","disposed to treat guests and strangers with generosity","In Morgantown, many of the fans we came across were gracious, welcoming, hospitable and constantly inquiring about whether we had received any harsh treatment.  -- Washington Post (Sep 28, 2011)"),
                new SimpleList("hostile","troops belonging to the enemy's military forces","On Elliott Bay, the cabins of the farther away settlers had gone up in smoke, fired by the hostile Indians.  -- Denny, Emily Inez"),
                new SimpleList("hovel","small crude shelter used as a dwelling","It is a paltry hovel of two low stories, half timbered, with meagre windows, and must have been a squalid abode even in its prime.  -- Horne, Charles F. (Charles Francis)"),
                new SimpleList("hover","hang in the air; fly or be suspended above","Here he stood still, looking up the dim expanse, with the dusky shadows, like great winged, formless ghosts, hovering over him.  -- Woolson, Constance Fenimore"),
                new SimpleList("hubris","overbearing pride or presumption","Fab's arrogance, and that of his Goldman colleagues who also testified, bested previous displays of hubris by the automotive, oil and tobacco industries.  -- Washington Post (Apr 28, 2010)"),
                new SimpleList("humane","showing evidence of moral and intellectual advancement","Men and women were in those less humane days burned for displeasing God, while now they are only fined and incarcerated.  -- Hetherington, Henry"),
                new SimpleList("humanitarian","marked by devotion to popular welfare","They discussed efforts to provide humanitarian assistance, especially urgently needed medical supplies in battered cities like Homs.  -- New York Times (Feb 23, 2012)"),
                new SimpleList("humiliation","state of disgrace or loss of self-respect","The humiliation of losing his first match 5-0 was compounded by hearing his opponent's friends marvelling at the easy draw he had been given.  -- The Guardian (Jan 14, 2011)"),
                new SimpleList("humility","a disposition to be humble; a lack of false pride","During the meal Jesus taught His disciples a touching lesson in humility; laying aside His upper robe, He washed and wiped their feet. -- Willard, J. H. (James Hartwell)"),
                new SimpleList("humongous","very large","These are humongous, gigantic, scare-your-pants-off kinds of waterfalls, he said.  -- New York Times (Sep 6, 2011)"),
                new SimpleList("hurtle","move with or as if with a rushing sound","Yet the cannonade continued, each shell that came hurtling through the air exploding with deadly effect and spreading destruction on all hands.  -- Le Queux, William"),
                new SimpleList("husbandry","the practice of cultivating the land or raising stock","The U.S. can take a lesson from Denmark, which has efficiently raised livestock without hurting farmers, by using better animal husbandry practices.  -- Scientific American (Mar 22, 2011)"),
                new SimpleList("hybrid","a composite of mixed origin","Current training, Hertling said, concentrated on  hybrid threats where criminals may work with conventional forces, or with terrorists, sharing weapons or drugs.  -- Reuters (Feb 4, 2012)"),
                new SimpleList("hydrophobia","viral disease of the nervous system of warm-blooded animals","One of his most stirring narratives related to the manner in which he escaped hydrophobia, after being bitten by a rabid wolf.  -- Ellis, Edward Sylvester"),
                new SimpleList("hyperbole","extravagant exaggeration","Quaint exaggeration of statement, the use of hyperbole, is often employed, and very happily, to compel attention.  -- Hulme, F. Edward (Frederick Edward)"),
                new SimpleList("hyperbolic","enlarged beyond truth or reasonableness","I am surprised that plaintiffs' hyperbolic allegations and inflated damage claims are given any credence, said the bank's top lawyer, Gary Lynch.  -- New York Times (Aug 26, 2011)"),
                new SimpleList("hypnagogic","sleep inducing","This intermediate and persistent stage of hypnagogic images serves in every way to explain the physical genesis of involuntary hallucinations.  -- Vignoli, Tito"),
                new SimpleList("hypochondriac","a patient with imaginary symptoms and ailments","The man proved to be a regular hypochondriac, taking medicine constantly, at one time with five doctors prescribing for him.  -- Wood-Allen, Mary"),
                new SimpleList("hypocritical","professing feelings or virtues one does not have","While all political leaders call for compromise, their actions and finger pointing increasingly appear hypocritical and self-serving.  -- Forbes (Sep 7, 2011)"),
                new SimpleList("hypothetical","a conjectural possibility or circumstance","They see rampant piracy as a reality and the threat to fair use as some kind of academic hypothetical rarely encountered in reality.  -- Boyle, James"),
                new SimpleList("hysteria","state of violent mental agitation","Washington teenager Mike Mitchell, then 18, was on hand at Union Station when the Beatles arrived and documented the shrieking hysteria of their fans.  -- Reuters (May 20, 2011)")

        };

        //ListAdapter listAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,simpleList);

        ListAdapter listAdapter=new CustomAdapter_h(this,simpleList);

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

                        Intent i=new Intent(h_main.this,Details.class);
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
                String str="h";
                Intent in = new Intent(h_main.this, quizStats.class);
                in.putExtra("val",str);
                startActivity(in);

            }catch (Exception ex){
                new AlertDialog.Builder(h_main.this).setMessage(""+ex).show();
            }

            return true;
        }else if(id == R.id.action_search){
            // get prompts.xml view
            LayoutInflater layoutInflater = LayoutInflater.from(h_main.this);
            View promptView = layoutInflater.inflate(R.layout.input_dialog, null);
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(h_main.this);
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
                                        new AlertDialog.Builder(h_main.this).setTitle(simpleList[i].words+"                        ").setMessage(simpleList[i].meanings+"    \n").show();
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
                                    new AlertDialog.Builder(h_main.this).setTitle("Word List: Oops                           ").setMessage("Word not in out database \n").show();

                                }

                            }catch (Exception ex)
                            {
                                new AlertDialog.Builder(h_main.this).setTitle("Error").setMessage(""+ex).show();
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
               // list2=db2.getAllStudentsList();
                String val="h";
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
                                    String str="h";
                                    Intent in = new Intent(h_main.this, quiz.class);
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
