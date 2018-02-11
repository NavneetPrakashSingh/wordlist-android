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
public class b_main extends ActionBarActivity {
    // private TextView resultText;
    private ListView myList;
    SimpleList simpleList[];
    DatabaseHelper2 db2;
    List<StudentsModel2> list2=new ArrayList<StudentsModel2>();
    // private ArrayList<SimpleList> alist=new ArrayList<SimpleList>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.b_main);



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
                new SimpleList("baffle","be a mystery or bewildering to","It baffles her physician as well, and has got doctors increasingly worried.  -- Time (Mar 23, 2012)"),
                new SimpleList("baleful","deadly or sinister","His glance fell on Van Bleit, pallid, red-eyed, obviously suffering, observing him with the baleful look of some savage captive beast.  -- Young, F.E. Mills"),
                new SimpleList("balk","refuse to comply","Congressional Republicans, particularly in the House of Representatives, have balked at raising the debt ceiling unless it is accompanied by significant spending cuts.  -- Reuters (Jun 19, 2011)"),
                new SimpleList("ballad","a narrative song with a recurrent refrain","And in the encore there was a new ballad,  Silent Treatment,  which Ms. Bryan sang gently, backed only by Mr. Dafydd on acoustic guitar.  -- New York Times (Apr 1, 2012)"),
                new SimpleList("ban","prohibit especially by law or social pressure","That's why gambling and wagers are heavily regulated or banned outright in nearly every country.  -- Slate (Apr 4, 2012)"),
                new SimpleList("banal","repeated too often; overfamiliar through overuse","Not bare or messy -- that might be interesting -- just banal.  -- New York Times (Mar 8, 2011)"),
                new SimpleList("bane","something causing misery or death","Knee pain is the bane of many runners, sometimes causing them to give up altogether.  -- Seattle Times (Jun 7, 2010)"),
                new SimpleList("banish","expel, as if by official decree","He, however, was destined never to return but was proscribed and banished.  -- Stark, James H."),
                new SimpleList("banter","be silly or tease one another","Instead, they bantered, enthused, tripped over each other's words and generally offered their audience the warmest welcome imaginable.  -- Seattle Times (Jan 25, 2011)"),
                new SimpleList("barbaric","without civilizing influences","The law was immediately hailed as a victory by animal welfare groups over what they consider to be a barbaric and outdated practice.  -- New York Times (Jul 28, 2010)"),
                new SimpleList("barrage","the heavy fire of artillery to saturate an area","They destroyed army communications, local cellphone towers and laid down a barrage of mortar fire.  -- Reuters (Feb 10, 2012)"),
                new SimpleList("barren","providing no shelter or sustenance","New homes are sprouting from farmland once irrigated by the nearby Tigris River but rendered barren by war and neglect.  -- New York Times (Mar 14, 2012)"),
                new SimpleList("bastion","projecting part of a rampart or other fortification","Dinner over, melons disposed of, fort, stores, and quarters examined, arrangements were made for sleeping in the various sheds and bastions of the fort.  -- Gray, William Henry"),
                new SimpleList("bathetic","effusively or insincerely emotional","Taken together, her tribulations have the makings of bathetic melodrama.  -- New York Times (Jul 14, 2011)"),
                new SimpleList("bearing","characteristic way of holding one's body","He thought her face, her whole bearing, singularly composed in view of his announcement.  -- Weyman, Stanley John"),
                new SimpleList("beckon","summon with a wave, nod, or some other gesture","Ten minutes more and the orderly opened the door, and, obedient to my beckoning finger, stepped out as the lady was ushered in.  -- King, Charles"),
                new SimpleList("bedlam","a state of extreme confusion and disorder","With more than 190 people killed and hundreds wounded just three days before the country's general election, Spain was thrown into political bedlam.  -- Newsweek (May 5, 2011)"),
                new SimpleList("befuddle","be confusing or perplexing to","But regulators are profiling data to help find patterns in trading activity that previously would have left regulators befuddled and scratching their heads.  -- Reuters (Apr 20, 2011)"),
                new SimpleList("beguile","attract; cause to be enamored","This is such an entertaining, beguiling, charming and exciting picture.  -- The Guardian (Jul 14, 2011)"),
                new SimpleList("behemoth","someone or something that is abnormally large and powerful","Behemoths like JPMorgan Chase, Wells Fargo, Morgan Stanley Smith Barney and UBS have snapped up numerous small firms to create industry giants.  -- Reuters (Jul 19, 2010)"),
                new SimpleList("beholden","under a moral obligation to someone","Now, this obligation has offended me very much, because I am proud, and do not like to be beholden to people.  -- Thackeray, William Makepeace"),
                new SimpleList("behoove","be appropriate or necessary","The Hamburg magistrates had offered one hundred thalers for my arrest; consequently it behooved me to be very cautious.  -- J?kai, M?r"),
                new SimpleList("belie","be in contradiction with","Tang's congenial and accommodating administrative style, however, sometimes belies a harder edge.  -- Reuters (Nov 26, 2011)"),
                new SimpleList("belittle","lessen the authority, dignity, or reputation of","A splendid or an affecting story may be degraded or belittled by being told in an unworthy style.  -- Various"),
                new SimpleList("bellicose","having or showing a ready disposition to fight","So far from unduly fostering a bellicose spirit tending to war, these would be tactful preventives of wasteful foreign and civil broils.  -- Lee, Carson Jay"),
                new SimpleList("belligerent","characteristic of an enemy or one eager to fight","He was carrying his war tools and stood facing me for an instant in quite a belligerent attitude.  -- O'Neil, Owen Rowe"),
                new SimpleList("bemoan","regret strongly","Facing life-threatening surgery, Adam calls his therapist and bemoans all the things he's never done.  -- BusinessWeek (Sep 30, 2011)"),
                new SimpleList("bemused","perplexed by many conflicting situations or statements","Alternately bemused, puzzled, and intrigued, he read it over again and again.  -- Scientific American (Jan 30, 2012)"),
                new SimpleList("benefactor","a person who helps people or institutions","Even world-class universities such as Oxford and Cambridge live off  old money  from property assets and a few key benefactors.  -- BusinessWeek (May 12, 2011)"),
                new SimpleList("benevolent","showing or motivated by sympathy and understanding","Invariably gentle, attentive, serious, benevolent, easily satisfied, he remained serene and peaceful.  -- Leonard, Arthur Glyn"),
                new SimpleList("benign","not dangerous to health; not recurrent or progressive","But its images cannot distinguish malignant tumors from benign growths filled with harmless breast tissue.  -- Scientific American (May 10, 2011)"),
                new SimpleList("bequeath","leave or give by will after one's death","The widow lived for a few years, and, at her death, he bequeathed upon the daughter of his adoption all that his mother possessed.  -- Various"),
                new SimpleList("berate","censure severely or angrily","At almost every move through the drill he berated them caustically, though in such faultless military language of reproof as to keep him from censure.  -- Hancock, H. Irving (Harrie Irving)"),
                new SimpleList("bereavement","state of sorrow over the death or departure of a loved one","The team also helps the patients' families, instructing them in caring techniques and providing bereavement counseling after death.  -- Washington Post (Sep 7, 2010)"),
                new SimpleList("beseech","ask for or request earnestly","Mr. Binney pleaded and besought, but all to no avail, and left his Tutor's presence at last, a disgraced and despairing man.  -- Marshall, Archibald"),
                new SimpleList("besiege","surround so as to force to give up","The troops in the Potomac army were all lying in front of Petersburg, under fire day and night, preparing to besiege the place.  -- Terrill, J. Newton"),
                new SimpleList("besmirch","smear so as to make dirty or stained","Because the dealer, widely respected in the Zurich art world, did not want his reputation besmirched, he agreed to settle the claim out of court.  -- New York Times (Sep 24, 2010)"),
                new SimpleList("bestow","present","There was stillness in the room--utter stillness as at last Percivale laid his sleeping wife down, and, bending over her, bestowed a parting kiss.  -- Reynolds, Mrs. Baillie"),
                new SimpleList("betrothed","the person to whom you are engaged","Perhaps he thinks an engaged young lady should be demure and dutiful, having no eyes or ears for any one except her betrothed.  -- Harland, Marion"),
                new SimpleList("bewildered","perplexed by many conflicting situations or statements","Only the most commonplace things were said, and yet she puzzled him, bewildered him.  -- Hocking, Joseph"),
                new SimpleList("bias","influence in an unfair way","Analytical thinking happens in the left hemisphere of the brain and is essential to making more objective, less biased decisions.  -- Inc (Dec 9, 2011)"),
                new SimpleList("bicker","argue over petty things","At times it felt like the candidates had already talked themselves out on the big themes and could only bicker over table scraps.  -- Slate (Feb 23, 2012)"),
                new SimpleList("bifurcated","divided into or made up of two parts","Like Lost, it's story, at least at first, is bifurcated, taking place half in the magical world, half in ours.  -- Time (Oct 21, 2011)"),
                new SimpleList("bilateral","affecting or undertaken by two parties","Economic issues took up about half of the bilateral talks between the two leaders, said a U.S. official who spoke on condition of anonymity.  -- Reuters (Jan 20, 2011)"),
                new SimpleList("billowing","characterized by great swelling waves or surges","It was here that the Army cooked up chemical weapons, launched poison-packed mortar shells and sent gas clouds billowing over the fields.  -- New York Times (Mar 17, 2012)"),
                new SimpleList("binge","an occasion for excessive eating or drinking","The government surveys showed binge drinking -- having more than five drinks in one day -- increased among all ethnic groups and genders, but particularly among men.  -- Seattle Times (Dec 22, 2010)"),
                new SimpleList("blanch","turn pale, as if in fear","Officers and men stood aghast, with blanched faces, scarce knowing how to act.  -- Le Queux, William"),
                new SimpleList("bland","lacking stimulating characteristics; uninteresting","Many critics were less than enamored with the kind of  easy listening  Mr. Williams embodied, deriding his approach as bland and unchallenging.  -- New York Times (Oct 9, 2011)"),
                new SimpleList("blandishment","flattery intended to persuade","He had expected coaxings, blandishments, the pleadings and wiles with which Virginia the elder had made him so intimately acquainted.  -- Reynolds, Mrs. Baillie"),
                new SimpleList("blare","make a strident sound","First there were trumpets; then brasses blared and drums rumbled.  -- Broun, Heywood"),
                new SimpleList("blase","uninterested because of frequent exposure or indulgence","Dull-eyed, blase, frayed by the social whirl, worn out, pulseless, all of them.  -- Reynolds, Francis J. (Francis Joseph)"),
                new SimpleList("blasphemy","profane language","Instead of becoming silent, he poured forth a fresh storm of blasphemy; and continued cursing all the time I remained within hearing.  -- Beach, Charles A."),
                new SimpleList("blatant","conspicuously and offensively loud","Then there was great shouting among the Sophomores, with much blatant, exultant cheering.  -- Williams, Jesse Lynch"),
                new SimpleList("bleak","offering little or no hope","Although the situation looks bleak, there's still room for hope, he said.  -- Washington Post (Dec 31, 2011)"),
                new SimpleList("blemish","a mark or flaw that spoils the appearance of something","Fine red lines often can be seen just under the skin, and some people also experience pimplelike blemishes.  -- Seattle Times (Jan 19, 2011)"),
                new SimpleList("blithe","carefree and happy and lighthearted","Deep down inside her being something sang; outside, the carolling of the lark continued, blithe and joyous in the breaking dawn.  -- Blackwood, Algernon"),
                new SimpleList("blunder","an embarrassing mistake","The candidate's first name was misspelled  John  on media badges, a blunder later repeated in some campaign mailings.  -- Reuters (Nov 7, 2011)"),
                new SimpleList("blunt","characterized by directness in manner or speech","Even my lady, so blunt and outspoken by nature, had shrunk from trying to question the Dutch girl about her lover.  -- Weyman, Stanley John"),
                new SimpleList("blurt","utter impulsively","But after that momentary pause he blurted out,  Is everything all right, Benny?   -- Titus, Harold"),
                new SimpleList("bluster","act in an arrogant, overly self-assured, or conceited manner","Ling was no longer an incarnate monster, a blustering, boisterous bully.  -- Strang, Herbert"),
                new SimpleList("boast","wear or display in an ostentatious or proud manner","A pompous, boasting sort of man, I did not like him at all.  -- Wood, Mrs. Henry"),
                new SimpleList("bode","indicate by signs"," Her early recovery is very promising,  and bodes well for further improvement, he said.  -- Seattle Times (Jan 20, 2011)"),
                new SimpleList("bogus","fraudulent; having a misleading appearance","Also, Tello allegedly put the wrong address on the letter and included fake bar codes and bogus fax and telephone numbers, they said.  -- New York Times (Jan 11, 2012)"),
                new SimpleList("bohemian","a nonconformist who lives an unconventional life","Bohemians were typically urban, liberal in outlook, but with few visible political passions and, above all, creative.  -- BBC (Mar 11, 2011)"),
                new SimpleList("boisterous","noisy and lacking in restraint or discipline","Boys drinking champagne at adjacent tables were calling across to each other with boisterous merriment.  -- Matthews, Brander"),
                new SimpleList("bolster","support and strengthen","Manufacturing bolstered the nation's economic recovery in March, according to data released Monday, with companies reporting strong gains in production and employment.  -- Washington Post (Apr 3, 2012)"),
                new SimpleList("bombardment","an attack by dropping bombs","He made up air raids and heavy bombardments and fairly tore up the village in which he was living.  -- Broun, Heywood"),
                new SimpleList("bombastic","ostentatiously lofty in style","Once, only, your workmanship was not marred by schemes for titillating effects, for sensational contrasts, for grandiose and bombastic expression.  -- Rosenfeld, Paul"),
                new SimpleList("boon","a desirable state","The drilling has been an economic boon -- creating jobs and reducing dependence on foreign energy.  -- New York Times (Mar 18, 2012)"),
                new SimpleList("boorish","ill-mannered and coarse in behavior or appearance","He becomes boorish, subject to fits of passion, violent and unaccountable.  -- Zweig, Stefan"),
                new SimpleList("bountiful","producing in abundance","The wheat harvest that year was so bountiful that grain overflowed storage facilities.  -- Wall Street Journal (Feb 23, 2010)"),
                new SimpleList("bourgeois","being of the property-owning class","This future son-in-law is very young, and remarkably good looking; he belongs to the upper bourgeois, even bordering on the nobility.  -- Sue, Eug?ne"),
                new SimpleList("bout","a period of illness","While out of work, struggling financially, and single-handedly responsible for three children, Pauline had several bouts of depression during which she felt completely isolated.  -- BBC (Jan 30, 2012)"),
                new SimpleList("bovine","any of various wild or domestic cattle","We can see handsome bovines at any fat cattle show.  -- Lynch, Lawrence L."),
                new SimpleList("bowdlerize","edit by omitting or modifying parts considered indelicate","Being an iconic classic, however, hasn't protected  Adventures of Huckleberry Finn  from being banned, bowdlerized and bleeped.  -- New York Times (Jan 7, 2011)"),
                new SimpleList("boycott","refuse to sponsor; refuse to do business with","In what became known as the Chilean Winter, students at university campuses and high schools across the country organized strikes, boycotted classes and occupied buildings.  -- New York Times (Apr 5, 2012)"),
                new SimpleList("brackish","slightly salty","The waters of West Africa, salt, brackish, and fresh abound with fish, and many kinds are, if properly cooked, excellent eating.  -- Kingsley, Mary Henrietta"),
                new SimpleList("braggadocio","vain and empty boasting","Biggie talks about money and drugs, but  Juicy  contains no braggadocio, no empty boasts.  -- Time (Oct 24, 2011)"),
                new SimpleList("braggart","a very boastful and talkative person","In his cups he was a witty, though arrogant, braggart.  -- Stocking, Charles Francis"),
                new SimpleList("brandish","exhibit aggressively","Yelling, shouting, and brandishing their weapons, the insurgents poured down.  -- Henty, G. A. (George Alfred)"),
                new SimpleList("brash","offensively bold","Mr. Lancman, 43, is known for his brash, relentless and ambitious style.  -- New York Times (Mar 19, 2012)"),
                new SimpleList("bravado","a swaggering show of courage","All their courage and bravado was gone, and now, like the miserable cowards that they were, they had sought safety in flight.  -- Pinkerton, Allan"),
                new SimpleList("brawl","a noisy fight in a crowd","The slightest quarrel, the most commonplace street brawl are pretexts for rival factions to come out in battle array.  -- Bastide, Charles"),
                new SimpleList("brawn","possessing muscular strength","He believes Hollywood has often have had an over-reliance on physical brawn as the deciding factor for portraying a strong man.  -- Reuters (Jul 10, 2010)"),
                new SimpleList("brazen","unrestrained by convention or propriety","House has saved two lives, but Foreman is furious at his brazen disregard for the rules.  -- Time (Nov 22, 2011)"),
                new SimpleList("breach","make an opening or gap in","Just look at how hackers breached the accounts of Google's mail service in the past year, other RIM executives have noted.  -- Washington Post (Apr 4, 2012)"),
                new SimpleList("breadth","the extent of something from side to side","On the left side were also two store-houses, each thirty-six paces long by twelve in breadth, covered with shingles.  -- Drake, Samuel Adams"),
                new SimpleList("brevity","the attribute of being brief or fleeting","Brevity is key; journalists do not have a lot of time.  -- Inc (Feb 13, 2012)"),
                new SimpleList("brink","the limit beyond which something happens or changes","Patterson often asked Groce to ease up in Taylor's demanding timed conditioning drills, noticing he was on the brink of hyperventilating from pushing his limits.  -- Chicago Tribune (Mar 31, 2012)"),
                new SimpleList("brisk","quick and energetic","The rooms were scrupulously clean, the table service brisk and punctual.  -- Boyd, Mary Stuart"),
                new SimpleList("broach","bring up a topic for discussion","Funeral directors must also navigate a topic that, even under normal circumstances, can prove uncomfortable to broach: money.  -- New York Times (Dec 29, 2011)"),
                new SimpleList("brood","hang over, as of something threatening, dark, or menacing","In fact, a daunting quietness brooded over the spot.  -- Bindloss, Harold"),
                new SimpleList("browbeat","discourage or frighten with threats or a domineering manner","For ten minutes he bullied and browbeat the luckless sergeant, whose men had not been responsible for opening fire.  -- Westerman, Percy F. (Percy Francis)"),
                new SimpleList("brunt","main force of a blow etc","While Texas, an epicenter now for wildfires and crop losses, is taking the brunt of the drought, surrounding states are also suffering.  -- Reuters (May 12, 2011)"),
                new SimpleList("bucolic","idyllically rustic","He is glad when he sees men busy fishing, planting, and hunting, and engaged in all manner of bucolic occupations.  -- Vondel, Joost van den"),
                new SimpleList("buffoon","a rude or vulgar fool","They were sluggards, buffoons, dimwits, liars, brutes, and--without exception--drunks.  -- The New Yorker (Aug 2, 2010)"),
                new SimpleList("buoyant","characterized by liveliness and lightheartedness","By nature he was sunny and buoyant, taking life as he found it.  -- Penny, F. E."),
                new SimpleList("burden","an onerous or difficult concern","Reconstruction spending is adding to the nation's huge debt burden.  -- Wall Street Journal (Mar 9, 2012)"),
                new SimpleList("bureaucracy","an organization obstructing action by unnecessary procedures","Professors and graduate students have benefited from improved working conditions, quicker turnaround for photocopying and scanning, and decreased bureaucracy and red tape.  -- New York Times (Mar 21, 2012)"),
                new SimpleList("burgeon","grow and flourish","Elsewhere, rising prices highlight a more basic problem: making sure farm productivity keeps pace with burgeoning populations.  -- Seattle Times (Jun 6, 2010)")

        };

        //ListAdapter listAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,simpleList);

        ListAdapter listAdapter=new CustomAdapter_b(this,simpleList);

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

                        Intent i=new Intent(b_main.this,Details.class);
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
                String str="b";
                Intent in = new Intent(b_main.this, quizStats.class);
                in.putExtra("val",str);
                startActivity(in);

            }catch (Exception ex){
                new AlertDialog.Builder(b_main.this).setMessage(""+ex).show();
            }

            return true;
        }else if(id == R.id.action_search){
            // get prompts.xml view
            LayoutInflater layoutInflater = LayoutInflater.from(b_main.this);
            View promptView = layoutInflater.inflate(R.layout.input_dialog, null);
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(b_main.this);
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
                                        new AlertDialog.Builder(b_main.this).setTitle(simpleList[i].words+"                        ").setMessage(simpleList[i].meanings+"    \n").show();
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
                                    new AlertDialog.Builder(b_main.this).setTitle("Word List: Oops                           ").setMessage("Word not in out database \n").show();

                                }

                            }catch (Exception ex)
                            {
                                new AlertDialog.Builder(b_main.this).setTitle("Error").setMessage(""+ex).show();
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
                //we need to check explictly for other pages as well
                String str="";
                String val="b";
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
                                    String str="b";
                                    Intent in = new Intent(b_main.this, quiz.class);
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
