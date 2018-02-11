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
public class g_main extends ActionBarActivity {
    // private TextView resultText;
    private ListView myList;
    SimpleList simpleList[];
    DatabaseHelper2 db2;
    List<StudentsModel2> list2=new ArrayList<StudentsModel2>();
    // private ArrayList<SimpleList> alist=new ArrayList<SimpleList>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.g_main);

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
                new SimpleList("gaffe","a socially awkward or tactless act","Later, Mr. Perry made a minor gaffe by misstating the voting age, which is 18.  -- New York Times (Nov 30, 2011)"),
                new SimpleList("gallant","unflinching in battle or action","Now straining up steep ascents, and now swimming deep rivers, the fearless and gallant band pressed forward.  -- Headley, Joel Tyler"),
                new SimpleList("galvanize","to stimulate to action","It's going to galvanize people and inspire more to attend today's events, he said by telephone.  -- BusinessWeek (Nov 17, 2011)"),
                new SimpleList("gamut","a complete extent or range","The program spans the entire cultural gamut, encompassing fine art, sculpture, dance, music, cinema, literature and theater.  -- New York Times (Jan 24, 2011)"),
                new SimpleList("garb","provide with clothes or put clothes on","Some are garbed in burgundy monks' robes, others in jeans and trucker hats.  -- New York Times (Jan 28, 2012)"),
                new SimpleList("garish","tastelessly showy","The garish colors, fabrics, trim and gaudy interior looks like it was done by a 12 year old.  -- Forbes (Dec 21, 2011)"),
                new SimpleList("garment","an article of clothing","He and two of his sisters work at a nearby tailoring shop, cutting off loose threads from nearly finished garments.  -- New York Times (Dec 2, 2011)"),
                new SimpleList("garnish","something added to a dish for flavor or decoration","Lemon, hard-boiled egg and capers may also be used as garnish for chicken salad.  -- Richards, Lenore"),
                new SimpleList("garrulous","full of trivial conversation","He was not in the best of spirits, for the drink was dying out of him; but his garrulous, inconsequent talk amused me mightily.  -- Bullen, Frank T."),
                new SimpleList("gastronomy","the art and practice of preparing and eating good food","Cooking is there esteemed a service of especial merit, hence France ranks all nations in gastronomy.  -- Ronald, Mary"),
                new SimpleList("gaudy","tastelessly showy","In fact, he seemed incapable of using any colors but gaudy or resplendent ones, and is nothing if not exaggerated, and using heaps of words.  -- Mitchell, Donald G."),
                new SimpleList("gaunt","very thin especially from disease or hunger or cold","Gaunt, starved, and ragged, the men marched northwards, leaving the Touat country upon their left hand.  -- Mason, A. E. W. (Alfred Edward Woodley)"),
                new SimpleList("gender","the properties distinguishing reproductive roles","Once strict gender roles softened and sexual mores loosened, the notion of a proposing woman began to seem less patently ridiculous.  -- Slate (Feb 28, 2012)"),
                new SimpleList("genealogy","the study or investigation of ancestry and family history","The genealogies and family histories are excellent, and many particulars are given of the lives and works of authors not easily found elsewhere.  -- Various"),
                new SimpleList("generalization","the process of abstracting common properties of instances","With this purpose in view he has kept closely to concrete statement and above all has tried to avoid vagueness and loose generalization.  -- Kelly, Edmond"),
                new SimpleList("generation","all the people living at the same time or of the same age","There they are, staring from photographic portraits on the entrance wall, looking much like ancestral grandfather and the family's new generation.  -- New York Times (Mar 26, 2012)"),
                new SimpleList("generic","applicable to an entire class or group","But rather than asking a generic question like Are you happy here? inquire about things that matter to your loved one.  -- US News (Feb 7, 2012)"),
                new SimpleList("genetic","of a segment of DNA involved in producing polypeptide chains","DNA testing confirmed that the patient carried the genetic abnormality behind the disease.  -- New York Times (Mar 2, 2012)"),
                new SimpleList("genial","diffusing warmth and friendliness","Perhaps there is nothing that prolongs life more than genial, hearty laughter.  -- McCarty, Louis Philippe"),
                new SimpleList("genre","an expressive style of music","Over the years, the series has featured just about every genre of American arts and music, including pop, country, jazz, blues, theater and dance.  -- Seattle Times (Feb 16, 2012)"),
                new SimpleList("genteel","marked by refinement in taste and manners","Mrs. D., said he, turning on me like a tiger, are you going to teach me polite breeding and genteel manners?  -- Lever, Charles James"),
                new SimpleList("gentility","elegance by virtue of fineness of manner and expression","Obviously, that level of gentility and decorum is difficult to maintain at regular tour events.  -- New York Times (Mar 27, 2010)"),
                new SimpleList("gentry","the most powerful members of a society","In my young days the people with means were the landed gentry and the nobility.  -- Hine, Muriel"),
                new SimpleList("genuflect","bend the knees and bow before a religious superior or image","When you enter, bless yourself with holy water and go quietly to your seat, genuflect on your right knee and enter the pew.  -- Anonymous"),
                new SimpleList("genuine","not fake or counterfeit","While partial relief may be obtained through other channels, real, genuine, and lasting redress can only be obtained by organized action at the polls.  -- Cloud, D. C."),
                new SimpleList("germane","relevant and appropriate","But such questions are not germane to my central theme, and so I pass them over lightly.  -- Coit, Stanton"),
                new SimpleList("germinal","containing seeds of later development","The most valuable means of securing this all-important growth is �play, which Froebel said contained the germinal leaves of all later life.  -- Nearing, Scott"),
                new SimpleList("germinate","cause to grow or sprout","Nothing might come of it just then, but Elmer hoped the seed would find lodging, and perhaps later on germinate.  -- Douglas, Alan"),
                new SimpleList("gerrymander","divide voting districts unfairly and to one's advantage","In practice, though, officials in both parties often try to gerrymander districts to help themselves and their parties win more elections.  -- New York Times (Sep 7, 2010)"),
                new SimpleList("gestate","be pregnant with","In her womb they were gestated and formed.  -- Burroughs, John"),
                new SimpleList("gesticulation","a deliberate and vigorous gesture or motion","Then the clapping and gesticulations broke forth with increased violence.  -- Mudge, Zachariah Atwell"),
                new SimpleList("gesture","motion of hands or body to emphasize a thought or feeling","At that, one of the younger men lifted a hand--a quick, nervous gesture, denoting at once surprise and consternation.  -- Gilson, Charles"),
                new SimpleList("ghastly","shockingly repellent; inspiring horror","From here events build up to highly shocking climaxes, including a ghastly murder.  -- Bradley, Marion Zimmer"),
                new SimpleList("gibberish","unintelligible talking","But the answer was a gurgling gibberish that made no sense at all!  -- Various"),
                new SimpleList("gibe","an aggressive remark directed at a person like a missile","When nothing but charred end-logs and glowing coals remained, Kent's men tramped off through the deep snows shouting gibes and taunts at their enemies.  -- Chisholm, A. M. (Arthur Murray)"),
                new SimpleList("giddy","lacking seriousness; given to frivolity","Another party of giddy, laughing girls, chatter away in a different strain.  -- Anonymous"),
                new SimpleList("gingerly","in a manner marked by extreme care or delicacy","Newman got hurt during practice Wednesday, walking gingerly off the field after getting tangled with a receiver during pass coverage drills.  -- Washington Post (Aug 4, 2011)"),
                new SimpleList("gird","prepare oneself for a military confrontation","In this semantic skirmish, the White House, bolstered by the momentum of victory and allies old and new, is girded for combat.  -- Time (Mar 22, 2010)"),
                new SimpleList("girder","a beam used as a main support in a structure","The 130-year-old stone cathedral stands broken and deconsecrated, with stained-glass windows shattered and the west wall propped up by girders.  -- BusinessWeek (Feb 21, 2012)"),
                new SimpleList("girth","the distance around a person's body","Others posted messages saying they were looking for a fat guy called Ai� a reference to the artist's impressive girth.  -- The Guardian (Apr 6, 2011)"),
                new SimpleList("gist","the choicest or most vital part of some idea or experience","To sum up the gist of Anglo-American relations in half a dozen pages, as Mr. Ayres does here, is surely a remarkable achievement.  -- Ayres, Harry Morgan"),
                new SimpleList("glacial","relating to or derived from a glacier","But no mammoth remains have been found around the White Sea; it was still covered with glacial ice when mammoths died out in Europe.  -- Scientific American (Nov 22, 2011)"),
                new SimpleList("glean","gather, as of natural products","A group of men and boys stood round awestruck, anxious to glean every bit of information that could be given.  -- Reynolds, Mrs. Baillie"),
                new SimpleList("glib","marked by lack of intellectual depth","The other sort of engineer understands that glib comparisons between computers and humans don't do justice to the complexities of either.  -- Forbes (Jul 22, 2010)"),
                new SimpleList("glimmer","shine brightly, like a star or a light","The leaves were black overhead, but the white birch trunks round me glimmered like pale ghosts.  -- Weyman, Stanley J."),
                new SimpleList("gloat","dwell on with satisfaction","Vixetta was in high spirits; she and her familiars hatched mischief together, and gloated over their evil doings in fiendish glee.  -- Harrison, Constance Cary"),
                new SimpleList("globalization","growth to a worldwide scale","Stock markets around the world have grown more correlated, thanks to the effects of globalization.  -- New York Times (Jun 12, 2010)"),
                new SimpleList("glower","look angry or sullen as if to signal disapproval","Nils was glowering, and Erik saw the scolding in his eyes.  -- Brandeis, Madeline"),
                new SimpleList("glum","moody and melancholic","The music stayed somber and steadfast, determinedly maintaining its glum tone.  -- New York Times (Apr 22, 2010)"),
                new SimpleList("glut","the quality of being so overabundant that prices fall","While mining companies may be making more money than ever, the shipping companies are contending with a glut rather than shortages.  -- BusinessWeek (May 17, 2011)"),
                new SimpleList("glutinous","having the sticky properties of an adhesive","The young were very little larger, and had a glutinous surface, which caused them to adhere together on being taken from the water.  -- Various"),
                new SimpleList("glutton","a person who is devoted to eating and drinking to excess","He was a glutton, and stuffed himself so at meals that he did little but choke and wheeze through the latter half of them.  -- Rives, Hallie Erminie"),
                new SimpleList("gluttony","habitual eating to excess","Moderation in eating was advised at all times, and any serious excess set down as gluttony, one of the seven deadly sins.  -- Walsh, James J. (James Joseph)"),
                new SimpleList("gnarled","old and twisted and covered in lines","She was about forty years old, with stooping shoulders, and hands gnarled and twisted by hard work.  -- Sage, William"),
                new SimpleList("goad","stab or urge on as if with a pointed stick","With oaths and savage lashings they were goaded on through deep, new-fallen snow.  -- Williamson, A. M. (Alice Muriel)"),
                new SimpleList("gorge","overeat or eat immodestly","True, he lay moaning and groaning all night, but next morning would be quite ready to gorge an equal meal.  -- Strang, Herbert"),
                new SimpleList("gorgeous","dazzlingly beautiful","The leaves had assumed their gorgeous autumnal tints, and the masses of timber, variegated in colour, presented an inexpressibly beautiful appearance.  -- Ainsworth, William Harrison"),
                new SimpleList("gory","covered with blood","And then they showed Denver's pistol; the one he had borrowed from Bunker, all gory with hair and blood.  -- Coolidge, Dane"),
                new SimpleList("gossamer","characterized by unusual lightness and delicacy","After an atmospheric episode, the piece broke into a spiraling dance, sometimes crazed, sometimes delicate with gossamer textures.  -- New York Times (Apr 16, 2011)"),
                new SimpleList("gouge","make a groove in","The door was massive, hand-hewn timber that was liberally scratched and gouged, and Joe frowned as he looked at it.  -- Kjelgaard, James Arthur"),
                new SimpleList("gourmand","a person who is devoted to eating and drinking to excess","With ravenous appetites they partook of a feast which any gourmand might covet.  -- Abbott, John S. C. (John Stevens Cabot)"),
                new SimpleList("gourmet","a person devoted to refined sensuous enjoyment","Prince Koltsoff had enjoyed his luncheon, as only an exacting gourmet whose every canon of taste has been satisfied, can.  -- McFall, J. V."),
                new SimpleList("govern","exercise authority over, as of nations","Saying they do not want to govern, the generals are due to hand power to an elected president by mid-year.  -- Reuters (Jan 4, 2012)"),
                new SimpleList("governance","the act of exercising authority","He explained that an interim government would immediately take over to provide day-to-day governance and keep order, the Associated Press news agency reports.  -- BBC (May 6, 2011)"),
                new SimpleList("grading","evaluation of performance by assigning a score","Each commissioner's smock came adorned with a bright blue �A rating, a nod to the city's new grading system for restaurant cleanliness.  -- New York Times (Mar 23, 2012)"),
                new SimpleList("graduated","marked with or divided into degrees","Latterly he took to using paper scales graduated to millimeters.  -- Darwin, Charles"),
                new SimpleList("graduation","the successful completion of a program of study","People who have earned advanced degrees are �hooded as part of the graduation ceremony.  -- Slate (Mar 22, 2012)"),
                new SimpleList("graft","tissue or organ transplanted from a donor to a recipient","UPS already has a good business ensuring that organs and skin grafts get to hospitals in good time.  -- Economist (Mar 22, 2012)"),
                new SimpleList("granary","a storehouse for threshed grain or animal feed","Here is where he does his husking, and the clear corn produced is stored away in some underground granary till It is needed.  -- Seton, Ernest Thompson"),
                new SimpleList("grandeur","the quality of being magnificent or splendid or grand","Honest Jack was perfectly astounded at seeing so much beauty and grandeur where he expected to find nothing except solitude and savage desert.  -- Garibaldi, Giuseppe"),
                new SimpleList("grandiloquent","puffed up with vanity","There was something theatrical and grandiloquent about him, and he seemed to pose like an actor who attracts admiration.  -- Gautier, Th�ophile"),
                new SimpleList("grandiose","impressive because of unnecessary largeness or grandeur","Even in a state known for grandiose real estate deals, the proposed development has set new standards for ambition or, depending on one's view, recklessness.  -- New York Times (Feb 18, 2012)"),
                new SimpleList("graphic","written or drawn or engraved","Unlike in the West, where graphic novels are accepted, the Iranian comic book is struggling to make headway.  -- New York Times (Apr 12, 2012)"),
                new SimpleList("grapple","come to terms with","Spanish borrowing costs have fared better than Italy's as both nations grapple with the debt crisis.  -- BusinessWeek (Oct 12, 2011)"),
                new SimpleList("gratify","make happy or satisfied","This matter was engineered through so handsomely by Mr. Applegate, that Dr. White expressed himself highly gratified and pleased.  -- Gray, William Henry"),
                new SimpleList("gratitude","a feeling of thankfulness and appreciation","He has saved my life, and I owe him much gratitude.  -- Allen, Grant"),
                new SimpleList("gratuitous","unnecessary and unwarranted","The reader is treated to pedantic little footnotes, and given a good deal of information which is either gratuitous or uninteresting.  -- Hay, Ian"),
                new SimpleList("gratuity","a relatively small amount of money for services rendered","Room service is supplied by the nearby Park Avenue Bistro, with a $3.50 surcharge for each plate, plus a 25 percent gratuity.  -- New York Times (Jun 18, 2010)"),
                new SimpleList("graze","let feed in a field or pasture or meadow","As soon as haymaking was over, the meadows became common grazing land for horses, cows, and oxen.  -- Reilly, S. A."),
                new SimpleList("gregarious","temperamentally seeking and enjoying the company of others","The Bison is gregarious, associating in herds many hundreds strong.  -- Various"),
                new SimpleList("grievance","a complaint about a wrong that causes resentment","In the open letter, Students & Scholars Against Corporate Misbehaviour, listed grievances cited by employees at Apple suppliers, including poverty wages and excessive and forced overtime.  -- Chicago Tribune (Mar 27, 2012)"),
                new SimpleList("grievous","shockingly brutal or cruel","He was convicted of recklessly causing grievous bodily harm to Cowley, who sustained fractures to his jaw, eye socket, cheekbone and nose.  -- Seattle Times (Mar 18, 2012)"),
                new SimpleList("grim","harshly uninviting or formidable in manner or appearance","As he lay awake through the small hours, the sinister truth grew clear that grim forces were closing upon him again.  -- Snaith, J. C."),
                new SimpleList("grimace","contort the face to indicate a certain mental state","As people squinted, frowned, glared, grinned, grimaced, snarled and other ways looked at the screens, their pictures were snapped, silently.  -- New York Times (Jul 20, 2011)"),
                new SimpleList("gripe","complain","The night drivers come in griping about drunken passengers, bad tippers and unfair summonses.  -- New York Times (Mar 24, 2012)"),
                new SimpleList("grisly","shockingly repellent; inspiring horror","Television video showed a heavily damaged building and a grisly scene inside, with clothing and prayer mats scattered across a blood-splattered floor.  -- New York Times (Aug 19, 2011)"),
                new SimpleList("groan","indicate pain, discomfort, or displeasure","The wounded man's eyes were open, and he was moving his head uneasily and slowly, groaning deeply every now and then.  -- Reynolds, Mrs. Baillie"),
                new SimpleList("groggy","stunned or confused and slow to react","Narcotics dulled the pain but left him groggy and nauseous.  -- Seattle Times (Dec 12, 2011)"),
                new SimpleList("groom","give a neat appearance to","The deep green, meticulously groomed, Wimbledon-like front lawn is undeniably attractive.  -- Time (Apr 13, 2012)"),
                new SimpleList("grovel","show submission or fear","The two young men who drove them had fallen flat and were grovelling and wailing for mercy.  -- Mitford, Bertram"),
                new SimpleList("grudging","petty or reluctant in giving or spending","Toyota's slow response--doubt, grudging acceptance, and then surrender--prompted Toyota owners to pick their heads up.  -- Time (Feb 8, 2011)"),
                new SimpleList("grueling","characterized by effort to the point of exhaustion","Afterward, a dejected Seraphin admitted to being physically and mentally fatigued from the Wizards' grueling schedule and his increased playing load.  -- Washington Post (Apr 9, 2012)"),
                new SimpleList("gruff","brusque and surly and forbidding","Mr. Napier's formidable jaw, gruff demeanor and growling bass voice lent themselves to rugged parts.  -- New York Times (Oct 7, 2011)"),
                new SimpleList("guild","a formal association of people with similar interests","More than 50 permanently disabled jockeys receive assistance from the Jockeys' Guild, he said.  -- New York Times (Mar 24, 2012)"),
                new SimpleList("guile","the use of tricks to deceive someone","He was subtle, ambitious, designing, crafty--dishonorably resorting to guile, where he dared not venture on overt acts of hostility.  -- Various"),
                new SimpleList("guileless","free of deceit","There was nothing alarming in this apparently simple and guileless missive.  -- Bolderwood, Rolf"),
                new SimpleList("guise","an artful or simulated semblance","But more broadly, 30 years of near total rule by one man under the guise of democracy has stunted the country's political development.  -- Time (Jan 31, 2011)"),
                new SimpleList("gullible","naive and easily deceived or tricked","The people were gullible; they might be made to believe that the senators of Rome were their best friends.  -- Morris, Charles"),
                new SimpleList("gumption","fortitude and determination","But he said the fact that he kept running for higher office showed admirable gumption.  -- New York Times (Sep 9, 2011)"),
                new SimpleList("gustatory","of or relating to the sense of taste","By gastronomical tests, we mean dishes of so delicious a flavor that their very appearance excites the gustatory organs of every healthy man.  -- Robinson, Fayette"),

        };

        //ListAdapter listAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,simpleList);

        ListAdapter listAdapter=new CustomAdapter_g(this,simpleList);

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

                        Intent i=new Intent(g_main.this,Details.class);
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
                String str="g";
                Intent in = new Intent(g_main.this, quizStats.class);
                in.putExtra("val",str);
                startActivity(in);

            }catch (Exception ex){
                new AlertDialog.Builder(g_main.this).setMessage(""+ex).show();
            }

            return true;
        }else if(id == R.id.action_search){
            // get prompts.xml view
            LayoutInflater layoutInflater = LayoutInflater.from(g_main.this);
            View promptView = layoutInflater.inflate(R.layout.input_dialog, null);
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(g_main.this);
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
                                        new AlertDialog.Builder(g_main.this).setTitle(simpleList[i].words+"                        ").setMessage(simpleList[i].meanings+"    \n").show();
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
                                    new AlertDialog.Builder(g_main.this).setTitle("Word List: Oops                           ").setMessage("Word not in out database \n").show();

                                }

                            }catch (Exception ex)
                            {
                                new AlertDialog.Builder(g_main.this).setTitle("Error").setMessage(""+ex).show();
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
                String val="g";
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
                                    String str="g";
                                    Intent in = new Intent(g_main.this, quiz.class);
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
