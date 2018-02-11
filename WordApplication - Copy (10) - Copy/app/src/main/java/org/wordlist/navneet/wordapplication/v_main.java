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
public class v_main extends ActionBarActivity {
    // private TextView resultText;
    private ListView myList;
    SimpleList simpleList[];
    DatabaseHelper2 db2;
    List<StudentsModel2> list2=new ArrayList<StudentsModel2>();
    // private ArrayList<SimpleList> alist=new ArrayList<SimpleList>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.v_main);

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
                new SimpleList("vacate","leave voluntarily, as a job or position","Their number diminished sharply after Villaraigosa announced last week that he wanted protesters to vacate the grounds by Monday or be forcibly removed.  -- Chicago Tribune (Nov 30, 2011)"),
                new SimpleList("vacillate","be undecided about something","But the old Napoleon was no more; vacillating almost as if in partial catalepsy, murmuring empty phrases in quick, indistinct utterance, he refused to decide.  -- Sloane, William Milligan"),
                new SimpleList("vacuous","devoid of intelligence","Why had his brain and senses lain fallow all these months, a vacuous vegetation, an empty consciousness?  -- Parker, Gilbert"),
                new SimpleList("vagary","an unexpected and inexplicable change in something","Nick Campbell, from energy consultancy Inenco, argues that relying more on LNG opens up the UK to the vagaries � and volatility � of global gas demand.  -- The Guardian (Dec 27, 2010)"),
                new SimpleList("vagrant","a wanderer with no established residence or means of support","Many of them refused to own houses or any dwelling place, and wandered about as vagrants and beggars.  -- Stace, W. T. (Walter Terence)"),
                new SimpleList("vague","lacking clarity or distinctness","The terms are all widely used, but their connotation is vague and uncertain.  -- Freud, Sigmund"),
                new SimpleList("vain","unproductive of success","I entreated, scolded, cursed, but all in vain; she let me go on, and answered not a word.  -- Seingalt, Jacques Casanova de"),
                new SimpleList("vainglorious","feeling self-importance","Though vainglorious and arrogant, he conducted the defence of Acre with sound judgment as well as with energy and courage.  -- Poole, Reginald Lane"),
                new SimpleList("valedictory","of or relating to an occasion or expression of farewell","He was graduated in 1828, on which occasion he delivered the valedictory oration.  -- Smith, Baxter Perry"),
                new SimpleList("valiant","having or showing valor","The first time, she continued a courageous and valiant fight.  -- BusinessWeek (Dec 24, 2010)"),
                new SimpleList("valid","well grounded in logic or truth or having legal force","But the authorities said that license was not valid in New York.  -- New York Times (Jan 13, 2012)"),
                new SimpleList("validate","show or confirm the effectiveness of something","If our findings are validated, coffee could represent one modifiable factor that may lower the risk of developing the most harmful form of prostate cancer.  -- BBC (May 17, 2011)"),
                new SimpleList("valor","courage when facing danger","Many had seen and spoken to the young hero, and all related his prodigies of valor.  -- Bolanden, Conrad von"),
                new SimpleList("vanguard","a creative group active in the innovation of new concepts","Panicked curators, artistic directors and art critics are warning of London's potential fall from the vanguard of the global arts scene.  -- Seattle Times (Aug 7, 2010)"),
                new SimpleList("vanity","the trait of being unduly conceited","Slowly I turned to look at Silver Heels, all my vanity, conceit, and condescension vanished.  -- Chambers, Robert W. (Robert William)"),
                new SimpleList("vanquish","come out better in a competition, race, or conflict","The unconquerable Argonne had been conquered; a ruthless enemy was vanquished.  -- Klausner, Julius"),
                new SimpleList("vantage","place or situation affording some benefit","But when he pulled out a telephoto lens, he was able to negotiate a better -- and closer -- vantage point.  -- New York Times (Feb 16, 2012)"),
                new SimpleList("vapid","lacking significance or liveliness or spirit or zest","No, ladies and gentlemen, do not let us be discouraged or deceived by any fine, vapid, empty words.   -- Dickens, Charles"),
                new SimpleList("variable","a quantity that can assume any of a set of values","He created a math model of a human being and then plugged in all the variables -- height, weight, food intake, exercise.  -- New York Times (May 16, 2012)"),
                new SimpleList("variegated","having a variety of colors","In domesticated animals, from causes apparently not as yet traced, the colour is variegated and various.  -- Various"),
                new SimpleList("varying","marked by diversity or difference","National central banks do make disclosures, but in varying formats and with differing frequencies and delays.  -- New York Times (Jun 1, 2012)"),
                new SimpleList("vassal","a person holding a fief","Second, the vassals, who rendered service to those from whom they held their lands.  -- Blackmar, Frank W. (Frank Wilson)"),
                new SimpleList("vast","unusually great in size or amount or extent or scope","Vast amounts of natural gas in shale rock formations have been unlocked by improved drilling techniques, making the fuel cheap and plentiful across the U.S.  -- Washington Post (May 24, 2012)"),
                new SimpleList("vault","a strongroom or compartment for safekeeping of valuables","Banks also offer investors the opportunity to buy shares of gold bars kept in their vaults.  -- Wall Street Journal (Dec 30, 2011)"),
                new SimpleList("vaunt","show off","He is not so foolish as to be puffed up, nor does he vaunt himself nor boast.  -- Comfort, William Wistar"),
                new SimpleList("veer","turn sharply; change direction abruptly","The day before Christmas the west wind suddenly veered round northward.  -- Nash, Wallis"),
                new SimpleList("vegetate","engage in passive relaxation","Others vegetated around the hotel, a rare luxury, to rest tired muscles and frayed nerves.  -- New York Times (Sep 21, 2011)"),
                new SimpleList("vehement","marked by extreme intensity of emotions or convictions","He rushed into his arms with an expression of the most vehement joy; the other was delighted, but not astonished, at meeting him so suddenly.  -- Tieck, Ludwig"),
                new SimpleList("velocity","distance travelled per unit time","His velocity was fine, hitting 97 mph on the radar gun in the fifth inning.  -- Washington Post (May 21, 2012)"),
                new SimpleList("venal","capable of being corrupted","It was still more creditable to him, that in such venal and corrupt days he maintained his integrity perfectly unsullied.  -- Ainsworth, William Harrison"),
                new SimpleList("vendetta","a blood feud between members of opposing parties","They are usually engaged in some vendetta between rival factions, or families, and blood is frequently shed.  -- Carter, Herbert"),
                new SimpleList("vendor","someone who exchanges goods or services for money","A street vendor sells Senegalese newspapers commemorating the presidential elections.  -- BBC (Feb 27, 2012)"),
                new SimpleList("veneer","coating consisting of a thin layer of wood","The inlay used was often oval in shape, sometimes only a line and sometimes panels of different woods or matched veneer.  -- Throop, Lucy Abbot"),
                new SimpleList("venerable","profoundly honored","Surely an Evangelical incident attested by so many, such respectable, and such venerable witnesses as these, is clearly above suspicion.  -- Burgon, John William"),
                new SimpleList("venerate","regard with feelings of respect and reverence","As guests of our highly respected and even venerated host, we were visited by nearly all the magistrates of the city.  -- Allen, Thomas Gaskell"),
                new SimpleList("venturesome","disposed to take risks","Brave, reckless, idealistic chaps--careless of peril, unafraid of death--who deliberately sought danger and the venturesome life as found during the war, over there.  -- Chambers, Robert W. (Robert William)"),
                new SimpleList("venue","the scene of any event or action","By tradition Riyadh has no public entertainment - no cinemas, theatres or music - so the only leisure venues are shopping malls and parks.  -- BBC (May 26, 2012)"),
                new SimpleList("veracity","unwillingness to tell lies","Professionally speaking, lawyers have been called legal liars, but compared to stock manipulators they are walking examples of truth and veracity.  -- Munn, Charles Clark"),
                new SimpleList("verbal","of or relating to or formed from words in general","Recognizable quotes are like verbal shorthand, getting across in one or two sentences what normally takes much longer to explain.  -- Inc (Jun 1, 2012)"),
                new SimpleList("verbatim","using exactly the same words","Hence you will need complete sentences taken down verbatim in the exact words of the speaker.  -- Hyde, Grant Milnor"),
                new SimpleList("verbiage","overabundance of words","An American lawyer sets forth in plain direct language what in England would be concealed beneath a mass of puzzling and almost unintelligible verbiage.  -- Mapleson, James H."),
                new SimpleList("verbose","using or containing too many words","There are also other writings reported to be his, verbose and of great length.  -- Besant, Annie Wood"),
                new SimpleList("verdant","characterized by abundance of verdure","Combine fresh greenery, fruit, and flowers for a verdant centerpiece that will last throughout the season.  -- Southern Living (Nov 19, 2010)"),
                new SimpleList("verify","confirm the truth of","The activists' account cannot be independently verified, but twice in the past week UN observers on the ground have corroborated similar claims.  -- BBC (Jun 1, 2012)"),
                new SimpleList("verisimilitude","the appearance of truth; the quality of seeming to be true","It has every appearance of verisimilitude: you truly believe this woman exists and has been filmed at all these various stages of her life.  -- The Guardian (Apr 26, 2010)"),
                new SimpleList("veritable","not counterfeit or copied","In Mr. Bottomley the Georgian era has found an authentic voice--a veritable interpreter.  -- Bottomley, Gordon"),
                new SimpleList("verity","an enduring or necessary ethical or aesthetic truth","Be investigators of reality that you may attain the verity of truth and life.  -- `Abdu'l-Bah�"),
                new SimpleList("vernacular","characteristic of or appropriate to everyday language","But being vernacular and popular in origin, these terms cannot obtain the uniformity and currency of literary names employed and recognised by official authority.  -- Vinogradoff, Paul"),
                new SimpleList("vernal","suggestive of youth; vigorous and fresh","They constitute one among many manifestations of spring and autumn physiological disturbance corresponding with fair precision to the vernal and autumnal equinoxes.  -- Ellis, Havelock"),
                new SimpleList("versatile","competent in many areas and able to turn with ease","The scheme relies on players being versatile and handling myriad assignments out of myriad personnel packages.  -- New York Times (Aug 8, 2011)"),
                new SimpleList("vertex","the point of intersection of lines","This regular solid of four-dimensional space consists of sixteen cells, each a regular tetrahedron, thirty-two triangular faces, twenty-four edges and eight vertices.  -- Bragdon, Claude Fayette"),
                new SimpleList("vertigo","a reeling sensation; a feeling that you are about to fall","A haze of orange light enveloped him, there came a great vertigo and dizziness and pain, he felt himself falling through bottomless spaces....  -- Wandrei, Donald A."),
                new SimpleList("verve","an energetic style","M'Loughlin gave us speed, dash, and verve in our tennis.  -- Tilden, William (Bill) Tatem"),
                new SimpleList("vestige","an indication that something has been present","All inflammation vanished immediately and every vestige of pain disappeared....  -- Dinet, Etienne"),
                new SimpleList("veteran","a person who has served in the armed forces","The study included 182 Vietnam War veterans who had highly localized brain damage caused by penetrating head wounds.  -- US News (Apr 13, 2012)"),
                new SimpleList("veto","a vote that blocks a decision","Even President Wilson could not block it, for a two-thirds vote to overcome his veto was mustered in Congress.  -- Beard, Charles A. (Charles Austin)"),
                new SimpleList("vex","disturb the peace of mind of","Memory kept vexing me sorely; and I, who seldom cried, swallowed tears behind my veil and went along in silence.  -- Rameur, E."),
                new SimpleList("vexation","anger produced by some annoying irritation","The knocking and scratching indicated rage and fury, combined with irritation and vexation on account of having got into a scrape.  -- Various"),
                new SimpleList("viable","capable of being done with means at hand","That's a mistake that some developed countries have made that is neither financially viable nor providing the best care, he said.  -- Seattle Times (Apr 11, 2012)"),
                new SimpleList("vibrant","vigorous and animated","Her vibrantly colored works illustrate the evolution of funk, an African-American cultural and work aesthetic, often sustained through music dating back to Emancipation.  -- Seattle Times (Dec 27, 2011)"),
                new SimpleList("vicarious","experienced at secondhand","Again, people who rated higher on empathy showed greater vicarious embarrassment.  -- Time (May 6, 2011)"),
                new SimpleList("vice","moral weakness"," I do not spend on vices like smoking, drinking or gambling, and have been completely devoted to my family,  he said in the statement.  -- New York Times (Mar 6, 2012)"),
                new SimpleList("vicinity","a surrounding or nearby region","But she hunted around in the vicinity of the cabin, and found some blackberry bushes that were fairly well laden.  -- Penrose, Margaret"),
                new SimpleList("vicissitude","a variation in circumstances or fortune","Charles Macy.--An orphan at thirteen years of age, Mr. Macy's early life was full of changes, adventures and vicissitudes.  -- Folsom, William Henry Carman"),
                new SimpleList("victor","the contestant who wins the contest","All the contestants shall then be collected, and every victor crowned.  -- Cross, Joseph"),
                new SimpleList("vie","compete for something","Monday and stretched nearly three city blocks by the next morning, as residents vied for one of 100 coveted spots on the complex's waiting list.  -- Washington Post (Nov 30, 2011)"),
                new SimpleList("vigilant","carefully observant or attentive","State Department has warned Americans to carefully consider the risks of travel to Fiji and to be vigilant while there.  -- Seattle Times (Dec 19, 2010)"),
                new SimpleList("vignette","a small illustrative sketch","The museum sets out a selection of Civil War era clothing in vignettes depicting women at work on their Sanitary Commission projects.  -- New York Times (Mar 24, 2012)"),
                new SimpleList("vigorous","characterized by forceful and energetic action or activity","The overall arc and momentum sometimes felt distorted, but Ms. Lim's intellectual analysis and emotional engagement resulted in fresh, vigorous interpretations.  -- New York Times (May 21, 2012)"),
                new SimpleList("vile","morally reprehensible","He met a pious little girl, whose feelings he tried to wound by using vile and sinful language.  -- Clement, J. (Jesse)"),
                new SimpleList("vilify","spread negative information about","In this particular article every action of Mary's life is construed unfavorably, and her character shamefully vilified.  -- Pennell, Elizabeth Robins"),
                new SimpleList("villain","the principal bad character in a film or work of fiction","The hero passes through thrilling adventures in his endeavours to rescue his betrothed from the hands of an unscrupulous villain.  -- Gilson, Charles"),
                new SimpleList("vindicate","clear of accusation, blame, or doubt with supporting proof","They were later vindicated when wiretaps played in court proved they were framed by police and corrupt businessmen.  -- Reuters (Oct 6, 2011)"),
                new SimpleList("vindictive","showing malicious ill will and a desire to hurt","There aren't any vindictive contestants stabbing nicer ones in the back.  -- BusinessWeek (May 24, 2012)"),
                new SimpleList("vintage","the oldness of wines","Progress is counted by the annual vintage, and the best wines mature over decades, not years.  -- BBC (Jan 12, 2011)"),
                new SimpleList("virtual","being actually such in almost every respect","The public opinion polls, which registered a virtual dead heat in recent months, are beginning to inch in his favor.  -- Time (May 18, 2012)"),
                new SimpleList("virtue","any admirable quality or attribute","In my defense, there are virtues to being the new guy -- I'm seeing the world through fresh eyes.  -- New York Times (May 11, 2012)"),
                new SimpleList("virtuoso","someone who is dazzlingly skilled in any field","As a virtuoso I think Liszt stood above Rubinstein, for his playing must have possessed amazing, dazzling qualities.  -- Hofmann, Josef"),
                new SimpleList("virulent","extremely poisonous or injurious; producing venom","It is an unusually virulent cancer of white blood cells that are overproduced in bone marrow and invade other parts of the body.  -- New York Times (Feb 11, 2012)"),
                new SimpleList("visage","the human face","Some patients want surgeons to dig deeper, cutting away at bones underneath their faces to create a more perfect visage.  -- Reuters (Jul 20, 2011)"),
                new SimpleList("viscera","internal organs collectively","The viscera are the soft internal organs especially in the abdominal and thoracic cavities.  -- New York Times (Jul 12, 2010)"),
                new SimpleList("visceral","obtained through intuition rather than from reasoning"," It was an overwhelming feeling -- a brutally visceral response -- heartfelt and unmediated by my training or my feminist pro-choice politics,  she wrote.  -- New York Times (Jul 14, 2010)"),
                new SimpleList("viscid","having the sticky properties of an adhesive","This species has a cap two to four inches broad, viscid or sticky when moist.  -- Hard, Miron Elisha"),
                new SimpleList("vital","performing an essential function in the living body","Shanahan passed out, his vital signs quit, his heart stopped beating for a half minute, and a priest gave him last rites.  -- Washington Post (May 31, 2012)"),
                new SimpleList("vitality","the property of being able to survive and grow","Notwithstanding these evidences of vitality, Catharism was rapidly dying out.  -- Lea, Henry Charles"),
                new SimpleList("vitiate","corrupt morally or by intemperance or sensuality","He thought that trial down there, before partisan juries and biased judges, would be a farce which vitiated the whole spirit of justice.  -- Buck, Charles Neville"),
                new SimpleList("vitreous","relating to or resembling or derived from glass","On the one hand, some are completely vitreous, like obsidian, which is a natural glass.  -- Various"),
                new SimpleList("vitriolic","harsh or corrosive in tone","At Rush's urging, hundreds of people flooded her with hateful, vitriolic emails.  -- Time (Apr 10, 2012)"),
                new SimpleList("vituperative","marked by harshly abusive criticism","Much as she obviously condemned me, there was no noisy recrimination, no violent vituperative outburst on her part.  -- Kilpatrick, Florence A. (Florence Antoinette)"),
                new SimpleList("vivacious","vigorous and animated","He adds:-- For the rest, he seemed intelligent, vehement, vivacious and full of life.  -- Zimmern, Helen"),
                new SimpleList("vivid","evoking lifelike images within the mind","Indeed, the footage was vivid, with grass blades, facial lines and soaring mountains appearing luminous and pronounced.  -- Seattle Times (Apr 25, 2012)"),
                new SimpleList("vocation","the particular occupation for which you are trained","Indeed even some who have more than served time in that capacity will admit that it is a dangerous employment, profession, or vocation.  -- Saintsbury, George"),
                new SimpleList("vociferous","conspicuously and offensively loud","The complaints grew so loud and vociferous that even President Obama was forced to address the backlash from Lisbon on Saturday.  -- New York Times (Nov 23, 2010)"),
                new SimpleList("void","an empty area or space","His departure leaves a void in Detroit, a piece of bedrock gone, sort of like waking up to find the Detroit River gone.  -- New York Times (May 31, 2012)"),
                new SimpleList("volatile","substance that changes readily from solid or liquid to vapor","The company also said it expects continuing  challenging conditions  including political and economic instability and volatile raw-material prices.  -- BusinessWeek (Aug 10, 2011)"),
                new SimpleList("voluble","marked by a ready flow of speech","He seemed genuinely surprised, and though normally voluble, he was too overcome to speak.  -- New York Times (Apr 29, 2011)"),
                new SimpleList("voluminous","large in number or quantity","So varied and voluminous are the writings of Mr. Stockton, they may be grouped as Juveniles, Novels, Novelettes and Collected Short Stories.  -- Colles, Julia Keese"),
                new SimpleList("voracious","devouring or craving food in great quantities","In an interview, Ms. Scott said Mr. Rich was a voracious reader, driven throughout his life by a hunger for stories.  -- New York Times (May 30, 2012)"),
                new SimpleList("vortex","a powerful circular current of water","Where they came together was a whirlpool, a tremendous vortex that hushed all surrounding Nature.  -- Comfort, Will Levington"),
                new SimpleList("vulnerable","capable of being wounded or hurt","In high-intensity exercise like football, a player's kidneys are continuously working hard, making them more vulnerable to damage from strong drugs.  -- BBC (Jun 5, 2012)")

        };

        //ListAdapter listAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,simpleList);

        ListAdapter listAdapter=new CustomAdapter_v(this,simpleList);

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

                        Intent i=new Intent(v_main.this,Details.class);
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
                String str="v";
                Intent in = new Intent(v_main.this, quizStats.class);
                in.putExtra("val",str);
                startActivity(in);

            }catch (Exception ex){
                new AlertDialog.Builder(v_main.this).setMessage(""+ex).show();
            }

            return true;
        }else if(id == R.id.action_search){
            // get prompts.xml view
            LayoutInflater layoutInflater = LayoutInflater.from(v_main.this);
            View promptView = layoutInflater.inflate(R.layout.input_dialog, null);
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(v_main.this);
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
                                        new AlertDialog.Builder(v_main.this).setTitle(simpleList[i].words+"                        ").setMessage(simpleList[i].meanings+"    \n").show();
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
                                    new AlertDialog.Builder(v_main.this).setTitle("Word List: Oops                           ").setMessage("Word not in out database \n").show();

                                }

                            }catch (Exception ex)
                            {
                                new AlertDialog.Builder(v_main.this).setTitle("Error").setMessage(""+ex).show();
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
                String val="v";
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
                                    String str="v";
                                    Intent in = new Intent(v_main.this, quiz.class);
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
