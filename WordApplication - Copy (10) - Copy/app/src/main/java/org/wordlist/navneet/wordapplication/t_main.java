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
public class t_main extends ActionBarActivity {
    // private TextView resultText;
    private ListView myList;
    SimpleList simpleList[];
    DatabaseHelper2 db2;
    List<StudentsModel2> list2=new ArrayList<StudentsModel2>();
    // private ArrayList<SimpleList> alist=new ArrayList<SimpleList>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.t_main);

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
                new SimpleList("tacit","implied by or inferred from actions or statements","The sentiment here is not tacit, but communicable and overt.  -- Rhys, Ernest"),
                new SimpleList("taciturn","habitually reserved and uncommunicative","He is of a reserved, taciturn habit, somewhat surly: not talkative even in his cups.  -- Reid, Mayne"),
                new SimpleList("tactful","having a sense of what is considerate in dealing with others","Lady Ruth went back to her guests, and with the effortless ease of long training, she became once more the gracious and tactful hostess.  -- Oppenheim, E. Phillips (Edward Phillips)"),
                new SimpleList("tactile","of or relating to or proceeding from the sense of touch","Researchers are promoting magnetic interfaces for touch screens, which will make operating the touch screen more tactile and reduce excessive tapping.  -- Forbes (Jan 20, 2012)"),
                new SimpleList("taint","contaminate with a disease or microorganism","The industry, though, hasn't disclosed what chemicals are used, raising concerns about tainted drinking water supplies and a call for peer-reviewed studies on the effects.  -- BusinessWeek (Jan 9, 2012)"),
                new SimpleList("talisman","a trinket thought to be a magical protection against evil","Tiny prayer wheels are now a popular car ornament, a talisman to ward off accidents.  -- Time (Apr 10, 2012)"),
                new SimpleList("tangential","of superficial relevance if any","It is terrific fun, but its relation to the theme remains tangential at best.  -- The Guardian (Aug 26, 2011)"),
                new SimpleList("tangible","perceptible by the senses especially the sense of touch","It has the capacity to change tangible, hard realities through no more than airy nothings, mere gauzy thoughts.  -- Forbes (Jun 9, 2011)"),
                new SimpleList("tantalizing","arousing desire or expectation for something unattainable","For long, monotonous months she had been struggling against just such cravings, impossible of realization, and therefore all the more tantalizing.  -- Fischer, Anton Otto"),
                new SimpleList("tantamount","being essentially equal to something","But keeping rabbits cooped up alone in hutches of the type sold by these big retail chains is just tantamount to cruelty.  -- The Guardian (Aug 11, 2010)"),
                new SimpleList("taper","diminish gradually","The snow tapered off after the field was cleared for warmups, but it picked back up toward halftime and kept falling with the mercury.  -- Washington Post (Dec 21, 2010)"),
                new SimpleList("tariff","a government tax on imports or exports","South Korea is dropping a long list of tariffs under the agreement, including stiff taxes on U.S. agricultural goods.  -- Washington Post (Oct 1, 2010)"),
                new SimpleList("taunt","harass with persistent criticism or carping","Verbal harassment refers to teasing, taunting, or insulting someone.  -- New York Times (Nov 17, 2011)"),
                new SimpleList("taut","pulled or drawn tight","The stay wires were tightened by turn buckles till they were taut as fiddle strings, assuring stability of the wings.  -- Goldfrap, John Henry"),
                new SimpleList("tautological","repetition of same sense in different words","The expression sounds trite and tautological; but it needs emphasis.  -- Various"),
                new SimpleList("tawdry","tastelessly showy","A cheap ornament spoils a handsome costume, better none at all; too many ornaments, even if good, look tawdry.  -- Ritter, Thomas Jefferson"),
                new SimpleList("tedious","so lacking in interest as to cause mental weariness","The journey was long and tedious, day after day passing with but few incidents to change the monotony of our progress.  -- Brayton, Matthew"),
                new SimpleList("temerity","fearless daring","He was confident that he had the backing of the men, and in that confidence grew bold with reckless temerity.  -- Crawford, Will"),
                new SimpleList("temperament","your usual mood","His bringing up was left to an uncle who had neither understanding nor sympathy for his dreamy and wayward temperament.  -- Various"),
                new SimpleList("temporal","of this earth or world","There was not room in Italy for two universal rulers, both holding of God, even though one ruled spiritual things and the other temporal.  -- Norway, Arthur H."),
                new SimpleList("temporize","draw out a discussion or process in order to gain time","I dare say you have often observed this disposition to temporize, or to procrastinate, in people who are labouring under any very poignant sorrow.  -- Poe, Edgar Allan"),
                new SimpleList("tenable","based on sound reasoning or evidence","Then you allow his position to be more tenable and reasonable than yours?  -- Rogers, Henry"),
                new SimpleList("tenacity","persistent determination","Constancy, persistence, dogged tenacity is certainly the striking feature of Jacob's character.  -- Dods, Marcus"),
                new SimpleList("tenet","a religious doctrine proclaimed as true without proof","Mr. Malik, who does not drink, decided that trading so-called pub securities would violate tenets of his faith.  -- New York Times (Apr 15, 2012)"),
                new SimpleList("tentative","unsettled in mind or opinion","Here and there, passages of solid, compelling music making were marred by tentative, uncertain moments.  -- New York Times (Mar 5, 2011)"),
                new SimpleList("tenuous","lacking substance or significance","Watching Belasco's short play in London in 1900, Puccini reportedly was deeply moved -- despite his tenuous grasp of the English language.  -- Seattle Times (Apr 25, 2012)"),
                new SimpleList("tenure","the term during which some position is held","Mr. Marshall's career as Chief Justice extended through a period of more than thirty-four years, which is the longest judicial tenure recorded in history.  -- Various"),
                new SimpleList("terminal","station where vehicles load or unload passengers or goods","Workers prepare flower orders in the American Airlines cargo terminal at Kennedy International Airport.  -- New York Times (Mar 13, 2012)"),
                new SimpleList("termination","the act of ending something","This sight made us forget our fatigues, and we hurried on, with fond anticipations of finding a speedy termination to all our sufferings.  -- Marryat, Frederick"),
                new SimpleList("terminology","a system of words used to name things in a discipline","This building was known, in monastic terminology, as the  Lavabo.   -- Anonymous"),
                new SimpleList("terrain","a piece of ground having specific characteristics","Most inhabitants were farmers struggling to coax crops out of the steep and rocky terrain.  -- New York Times (Mar 3, 2012)"),
                new SimpleList("terrestrial","operating or living or growing on land","On land, habitat loss takes away much-needed space for large, terrestrial animals.  -- Scientific American (May 3, 2011)"),
                new SimpleList("territory","a region marked off for administrative or other purposes","The war was just a few months old, and the entire Michigan territory had fallen into British hands.  -- Slate (May 25, 2012)"),
                new SimpleList("terse","brief and to the point","While she stared at him, he uttered the short, terse command:  Hands up!   -- Seltzer, Charles Alden"),
                new SimpleList("tertiary","coming third in position","The plan divides roadways into three major categories: arterial, secondary and tertiary.  -- New York Times (Dec 28, 2010)"),
                new SimpleList("tessellated","decorated with small pieces of colored glass or stone","Passing from one pavilion to another over tessellated pavements, we enter apartments rich in mosaics and all manner of precious stones.  -- Field, Henry M. (Henry Martyn)"),
                new SimpleList("theocracy","a political unit governed by a deity","For in theocracies, to the social evil of the offence is added the impiety committed against the Deity and his representative on earth.  -- R?ville, Albert"),
                new SimpleList("theology","the rational and systematic study of religion","He had read widely in theology -- Saint Augustine and Nietzsche and Reinhold Niebuhr -- but he had no formal religious training.  -- Washington Post (Feb 23, 2012)"),
                new SimpleList("thermal","relating to or associated with heat","The great masses of concrete act as a thermal sink, absorbing heat during the molten days and then radiating warmth at night.  -- New York Times (Feb 16, 2012)"),
                new SimpleList("thespian","of or relating to drama","True to her thespian inheritance, she played Olivia in Twelfth Night on a student tour of the Highlands and Islands.  -- The Guardian (Jul 27, 2010)"),
                new SimpleList("threshold","the entrance for passing through a room or building","The words are hardly out of her mouth when the door opens and somebody appears upon the threshold.  -- Duchess"),
                new SimpleList("thrifty","mindful of the future in spending money","He was managing clerk in some mercantile house, and, being a thrifty soul, invested all his spare cash instead of spending it.  -- Peters, Charles"),
                new SimpleList("thrive","grow vigorously","A naturally outgoing person, Irenstein learned quickly and his dating life began to thrive.  -- Slate (Apr 27, 2012)"),
                new SimpleList("throes","violent pangs of suffering","He suffered rheumatism in its most acute form, so the coastguard explained between his throes.  -- Creswicke, Louis"),
                new SimpleList("throng","a large gathering of people","Visitors flocked to Fredericksburg and long before the beginning thousands had gathered, sidewalks, steps and porches were crowded with merry throngs in carnival mood.  -- Goolrick, John T."),
                new SimpleList("throttle","a valve that regulates the supply of fuel to the engine","Cora slowed down her engine by means of a throttle control that extended up near the wheel.  -- Penrose, Margaret"),
                new SimpleList("thrust","push forcefully","I cried angrily, thrusting back those who pressed on me most closely.  -- Weyman, Stanley John"),
                new SimpleList("thwart","hinder or prevent, as an effort, plan, or desire","Efforts to learn more were thwarted in January 2007, when the camera channel used by Hubble to acquire the image stopped working.  -- Nature (May 23, 2012)"),
                new SimpleList("tirade","a speech of violent denunciation","It is an angry, sometimes abusive, but overall articulate and heartfelt tirade about growing up in Gaza.  -- BBC (Feb 9, 2011)"),
                new SimpleList("toady","a person who tries to please someone to gain an advantage","It bored him, and he was no toady to waste his time fawning upon possible patrons.  -- Horne, Charles F. (Charles Francis)"),
                new SimpleList("toil","work hard","Taking his stone axe he toiled all day until the tree was felled.  -- Westervelt, W. D. (William Drake)"),
                new SimpleList("token","a disk that can be used in designated slot machines","It works on a similar principle as casino chips, or, more directly, arcade tokens.  -- Forbes (Jan 24, 2012)"),
                new SimpleList("tome","a large and scholarly book","This seems like a particularly troubling trend for academia, where digital books are slowly overtaking the heavy tomes I used to lug around.  -- Time (Mar 18, 2012)"),
                new SimpleList("topography","the configuration of a surface and its features","They land in a lush green jungle whose topography seems to resemble no known place on Earth.  -- Seattle Times (Jul 8, 2010)"),
                new SimpleList("torpid","slow and apathetic","His energies are suspended, his senses become numbed and torpid--in short, he feels as one who goes to sleep in a snow-storm.  -- Reid, Mayne"),
                new SimpleList("torpor","inactivity resulting from lethargy and lack of energy","Notwithstanding my nervous apprehension, a sleep more like the torpor of lethargy than natural slumber, fell on me at once.  -- Mayer, Brantz"),
                new SimpleList("torque","a twisting force","Those photons produce very small amounts of torque that can slow the rotation or speed it up.  -- New York Times (Jan 12, 2010)"),
                new SimpleList("torrential","relating to or resulting from the action of a downpour","Torrential rains killed at least six people in Genoa on Friday, in the worst flooding the port city has seen in years, officials said.  -- New York Times (Nov 5, 2011)"),
                new SimpleList("torrid","extremely hot","Days dragged on; days of torrid, relentless heat.  -- Elliott, Maud Howe"),
                new SimpleList("torso","the body excluding the head and neck and limbs","Her dresses were fitted not only at the waist, but along the torso by a long and pointed bodice stiffened with wood, steel, or whalebone.  -- Reilly, S. A."),
                new SimpleList("totalitarian","of a system in which the state regulates every realm of life","Suppression of art and ideas is something that happens in totalitarian regimes, not this country, he added.  -- Seattle Times (Oct 8, 2010)"),
                new SimpleList("tout","advertize in strongly positive terms","Shock jock Howard Stern, however, didn't hold back at a news conference in New York touting his own new TV gig.  -- Seattle Times (May 11, 2012)"),
                new SimpleList("tract","an extended area of land","One tract of the mallee scrub, shared between Victoria and South Australia, covers an area of nearly 9000 square miles.  -- Willoughby, Howard"),
                new SimpleList("tractable","easily managed","By a three months' School course stubborn horses may be made tractable, dangerous horses rendered comparatively safe, uncomfortable brutes easy and reliable.  -- Dodge, Theodore Ayrault"),
                new SimpleList("traduce","speak unfavorably about","One may abuse, assail, or vilify another to his face; he asperses, calumniates, slanders, or traduces him behind his back.  -- Fernald, James Champlin"),
                new SimpleList("trajectory","the path followed by an object moving through space","Losing altitude, they hurtled on a sloping trajectory toward Washington.  -- Neville, Kris"),
                new SimpleList("tranquility","a state of peace and quiet","Lifelong fisherman Jay Cassell, deputy editor of Field & Stream magazine, treasures lakeside vacations for the peace and tranquility only one can offer.  -- Forbes (Jun 1, 2010)"),
                new SimpleList("transcendental","existing outside of or not in accordance with nature","That she should have wanted to captivate Mr. Traffick,--she with her high ideas of some transcendental, more than human, hero!  -- Trollope, Anthony"),
                new SimpleList("transcribe","write out, as from speech or notes","Hastily procuring pen and ink, he bade Sir Walter sing it over again while he transcribed the words to paper.  -- Bender, Millicent Schwab"),
                new SimpleList("transfixed","having your attention fixated as though by a spell","To say that I was transfixed, speechless, fascinated to intoxication by the spell of this marvellous development is no exaggeration.  -- Various"),
                new SimpleList("transgression","the violation of a law or a duty or moral principle","Vietnamese state media prior to the trial reported prosecutors as saying that Mr. Dinh's transgressions represent a particularly serious violation of national security.  -- Wall Street Journal (Jan 21, 2010)"),
                new SimpleList("transient","lasting a very short time","Smokers, on the other hand, had wildly transient populations, with species moving in and out--which opened up real estate for the bad bugs.  -- Scientific American (Feb 21, 2012)"),
                new SimpleList("transitory","lasting a very short time","Positive reviews are blissful but strangely transitory, forgotten within hours.  -- The Guardian (May 22, 2012)"),
                new SimpleList("translucent","allowing light to pass through diffusely","It is usually translucent, becoming nearly transparent on immersion in water.  -- Various"),
                new SimpleList("transparent","transmitting light; able to be seen through with clarity","In looking at any object through a perfectly transparent medium, such as plate glass, we do not perceive any alteration in the real colours.  -- Howard, Frank"),
                new SimpleList("transpire","come about, happen, or occur","So let's inaugurate things around here by continuing a hallowed Technologizer tradition: making collective predictions about what will transpire at an upcoming Apple event.  -- Time (Mar 3, 2012)"),
                new SimpleList("travail","use of physical or mental energy; hard work","Through an anguish of travail Canada has worked out an excellent system of self-government.  -- Laut, Agnes C. (Agnes Christina)"),
                new SimpleList("traverse","travel across","It had taken them four days to traverse just 25 miles.  -- Time (Mar 8, 2012)"),
                new SimpleList("travesty","a composition that imitates or misrepresents a style","As any comic writer will tell you, one person's humorous homage can easily be another's disrespectful travesty.  -- The Guardian (Feb 9, 2011)"),
                new SimpleList("treachery","an act of deliberate betrayal","By this fatal step Ashburnham incurred the unmerited charge of treachery and disloyalty.  -- Various"),
                new SimpleList("tread","a step in walking or running","He went out; they could hear his slow, careful tread on each of the slippery stairs.  -- Woolson, Constance Fenimore"),
                new SimpleList("treason","an act of deliberate betrayal","He was accused of disloyalty and treason, with the greatest heat, everywhere.  -- Day, Clarence"),
                new SimpleList("treatise","a formal exposition","I purchased the requisite study guides -- intimidating, densely worded treatises on gastroenterology, cardiology, geriatrics, hematology and all the specialty areas of internal medicine.  -- New York Times (Nov 3, 2011)"),
                new SimpleList("trek","journey on foot, especially in the mountains","In the mountains, Mr. Sherpa can spend months trekking over glaciers and negotiating ice falls and treacherous crevasses at nosebleed heights.  -- New York Times (Jan 21, 2012)"),
                new SimpleList("tremulous","quivering as from weakness or fear","Only his tremulous voice and shaking hand betrayed suffering.  -- Armstrong, W. N."),
                new SimpleList("trenchant","having keenness and forcefulness and penetration in thought","The trenchant blade of his intellect is still keen.  -- Codman, John Thomas"),
                new SimpleList("trepidation","a feeling of alarm or dread","No sign of trepidation or alarm, save the sudden stiffening of her form, was betrayed.  -- Ainsworth, William Harrison"),
                new SimpleList("tribulation","an annoying or frustrating or catastrophic event","The students have described their personal trials, tribulations and emotional turmoil in my writing class.  -- New York Times (Feb 15, 2012)"),
                new SimpleList("tribunal","an assembly to conduct judicial business","The judicial power of the United States shall be vested in one Supreme Court and certain inferior tribunals.  -- Van Buren, Martin"),
                new SimpleList("trifling","not worth considering","Everything, in fact, was well thought over, and as was subsequently proved, the mistakes that did occur were few and trifling.  -- Bull, Jacob B."),
                new SimpleList("trilogy","a set of three literary or dramatic works related in subject","Mr. Tucker never finished the third book of what was supposed to be his Stalin trilogy.  -- New York Times (Aug 1, 2010)"),
                new SimpleList("triumvirate","a group of three people responsible for civil authority","Well, all three teams in the Epstein management triumvirate are struggling.  -- Seattle Times (Apr 22, 2012)"),
                new SimpleList("troglodyte","someone who lives in a cave","The original cave man, the troglodyte, may have got his that way.  -- Paine, Albert Bigelow"),
                new SimpleList("truculent","defiantly aggressive","Now he turned to behold a huge cock ostrich bearing down upon him with hostility and aggressiveness writ large all over its truculent personality.  -- Mitford, Bertram"),
                new SimpleList("truism","an obvious statement of fact","They cannot hurt us more than we can be hurt--an obvious truism but one which is often overlooked.  -- Archer, William"),
                new SimpleList("truncate","make shorter as if by cutting off"," Health care provider  came into vogue as the catchall phrase and was quickly truncated to just  provider.   -- New York Times (Dec 29, 2011)"),
                new SimpleList("tumult","a state of commotion and noise and confusion","A scene of confusion and tumult arose in the office, lasting several moments.  -- Palacio Vald�s, Armando"),
                new SimpleList("turpitude","a corrupt or depraved or degenerate act or practice","The cities were berated as hubs of moral turpitude, decadence and greed.  -- Vaknin, Samuel"),
                new SimpleList("tutelage","teaching pupils individually","The Falcons have even hired mixed martial arts instructors for off-season tutelage in wrestling, boxing and kickboxing.  -- New York Times (Dec 26, 2011)"),
                new SimpleList("tyranny","dominance through threat of punishment and violence","Alexander Lebedev sees his newspapers as vital forces against tyranny, oppression and corruption.  -- The Guardian (Nov 21, 2010)")

        };

        //ListAdapter listAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,simpleList);

        ListAdapter listAdapter=new CustomAdapter_t(this,simpleList);

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

                        Intent i=new Intent(t_main.this,Details.class);
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
                String str="t";
                Intent in = new Intent(t_main.this, quizStats.class);
                in.putExtra("val",str);
                startActivity(in);

            }catch (Exception ex){
                new AlertDialog.Builder(t_main.this).setMessage(""+ex).show();
            }

            return true;
        }else if(id == R.id.action_search){
            // get prompts.xml view
            LayoutInflater layoutInflater = LayoutInflater.from(t_main.this);
            View promptView = layoutInflater.inflate(R.layout.input_dialog, null);
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(t_main.this);
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
                                        new AlertDialog.Builder(t_main.this).setTitle(simpleList[i].words+"                        ").setMessage(simpleList[i].meanings+"    \n").show();
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
                                    new AlertDialog.Builder(t_main.this).setTitle("Word List: Oops                           ").setMessage("Word not in out database \n").show();

                                }

                            }catch (Exception ex)
                            {
                                new AlertDialog.Builder(t_main.this).setTitle("Error").setMessage(""+ex).show();
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
                String val="t";
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
                                    String str="t";
                                    Intent in = new Intent(t_main.this, quiz.class);
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
