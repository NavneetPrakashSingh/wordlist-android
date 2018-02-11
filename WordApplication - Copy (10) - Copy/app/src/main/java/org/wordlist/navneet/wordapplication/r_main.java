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
public class r_main extends ActionBarActivity {
    // private TextView resultText;
    private ListView myList;
    SimpleList simpleList[];
    DatabaseHelper2 db2;
    List<StudentsModel2> list2=new ArrayList<StudentsModel2>();
    // private ArrayList<SimpleList> alist=new ArrayList<SimpleList>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.r_main);

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
                new SimpleList("raconteur","a person skilled in telling anecdotes","He was an excellent raconteur, and his stories had a stamp of their own which would have made them always and everywhere acceptable.  -- Huxley, Leonard"),
                new SimpleList("radical","a person who has revolutionary ideas or opinions","In New York his society was composed of free elements altogether, come-outers, reformers, radicals of every description.  -- Frothingham, Octavius Brooks"),
                new SimpleList("rambunctious","noisy and lacking in restraint or discipline","Once, long ago, award ceremonies were rather unruly and rambunctious affairs.  -- The Guardian (Feb 13, 2012)"),
                new SimpleList("ramification","a development that complicates a situation","Certainly when one gave the hideous experiment full thought, its possible angles of development, its many potential ramifications, were astounding in the extreme.  -- Various"),
                new SimpleList("rampant","unrestrained and violent","Poverty is rampant -- much of the population lives on just a few dollars each day, according to recent estimates -- and unemployment remains high.  -- New York Times (Nov 4, 2011)"),
                new SimpleList("rancor","a feeling of deep and bitter anger and ill-will","They strove with heart and soul to establish the teachings by which divergent people might be brought together and no strife, rancor or hatred prevail.  -- `Abdu'l-Bah�"),
                new SimpleList("rapport","a relationship of mutual understanding between people","Ms. Tindall, 48, did not work for Mr. Stevens, but several people said they had a strong mutual respect and a warm rapport.  -- New York Times (Aug 12, 2010)"),
                new SimpleList("rarefied","of high moral or intellectual value","It is hard to imagine many casual park visitors being captivated by the conceptual systems that gave rise to such rarefied abstractions.  -- New York Times (Aug 19, 2011)"),
                new SimpleList("rationalization","a defense mechanism explaining actions in non-threateningly","The people, she said in an e-mail message,  are tired of the same old rationalizations and excuses.   -- New York Times (Jun 9, 2010)"),
                new SimpleList("ravage","cause extensive destruction or ruin utterly","The heaviest flooding in 50 years ravaged farms, automotive and electronics plants and is thought to have taken 800 lives.  -- The Guardian (Feb 14, 2012)"),
                new SimpleList("ravenous","extremely hungry","You know that makes them ravenous, and they'd eat him out of house and home in time.  -- Doyle, A. Conan"),
                new SimpleList("realm","a domain in which something is dominant","Such questions are generally considered not to belong to the realm of positive physical science, but will before long be annexed to its domain. -- Martin, Thomas Commerford"),
                new SimpleList("reap","get or derive","Every new plaza the city opens, like the recent one on Gansevoort Street, instantly fills up; local shop owners reap the benefits.  -- New York Times (Dec 2, 2011)"),
                new SimpleList("rebellious","resisting control or authority","Their founders also tend to be rebellious types who enjoy challenging authority.  -- Economist (Sep 23, 2010)"),
                new SimpleList("rebuke","an act or expression of criticism and censure","But analysts at banks and brokerages noted that Putin, known for his sharp rebukes of tycoons, avoided direct criticism of the company's owners.  -- Reuters (May 18, 2010)"),
                new SimpleList("rebuttal","the speech act of refuting by offering a contrary argument","If one candidate specifically criticizes another in an answer, the victimized candidate is generally given rebuttal time.  -- Seattle Times (Nov 22, 2011)"),
                new SimpleList("recalcitrant","stubbornly resistant to authority or control","The officials of the state banks especially proved recalcitrant and refused to surrender Government moneys.  -- Various"),
                new SimpleList("recant","formally reject or disavow a formerly held belief","But he quickly recanted and later denied having made the statement at all.  -- Reuters (Aug 26, 2010)"),
                new SimpleList("recapitulate","summarize briefly","He then recapitulated, with rapid but accurate detail, the principal circumstances of my story, bestowing some brief comment on each as he went.  -- Lever, Charles James"),
                new SimpleList("recidivism","habitual relapse into crime","So successful is Buffalo's Veterans Court that it boasts a zero recidivism rate -- none of the participants have been rearrested and returned.  -- Reuters (Jan 9, 2011)"),
                new SimpleList("recipient","a person who is sent something","The society left open the possibility of transplanting hearts into patients over age 70, as long as recipients were otherwise in very good health.  -- New York Times (Apr 23, 2012)"),
                new SimpleList("reciprocate","act, feel, or give mutually or in return","He took some pains, moreover, to reciprocate the civilities he had received, by entertaining his hosts in return.  -- Prescott, William Hickling"),
                new SimpleList("recluse","one who lives in solitude","He must not continue to withdraw himself from their society, they urged, and live the life of a recluse and hermit.  -- Sudermann, Hermann"),
                new SimpleList("recoil","draw back, as with fear or pain","The Reverend Mr. Prattleton literally recoiled at the words, and staggered back a few steps in his dismay.  -- Wood, Mrs. Henry"),
                new SimpleList("recommence","begin again","He was released under the first declaration of indulgence; but as he instantly recommenced his preaching, he was arrested again.  -- Froude, James Anthony"),
                new SimpleList("recompense","payment or reward, as for service rendered","In 1830, the United States government made a large grant of lands to his heirs as a further recompense for his military services.  -- Various"),
                new SimpleList("reconcile","bring into consonance or accord","They split up two weeks later, then reconciled, then split up again.  -- New York Times (Apr 24, 2012)"),
                new SimpleList("recondite","difficult to penetrate","On both sides of Lamb, however, there lie literatures more difficult, more recondite.  -- Bennett, Arnold"),
                new SimpleList("reconnaissance","the act of scouting","This 38 metre-long remotely operated airship is designed to carry communications and monitoring equipment for intelligence, surveillance and reconnaissance missions.  -- Economist (May 6, 2010)"),
                new SimpleList("recrimination","mutual accusations","But despite calls for national unity to face this challenge, Mexico's politicians keep slinging mud and trading mutual recriminations over who is to blame.  -- Time (Aug 21, 2010)"),
                new SimpleList("rectitude","righteousness as a consequence of being honorable and honest","You must be morally upright and of steadfast rectitude.  -- The Guardian (Jan 9, 2011)"),
                new SimpleList("redoubtable","inspiring fear","Then implacable and dangerous pursuits, redoubtable struggles, were the order of their days and nights.  -- Allain, Marcel"),
                new SimpleList("redress","act of correcting an error or a fault or an evil","Some efforts at redress were made; but the remedy proved ineffectual, and the discontent of the Indians increased with every year.  -- Parkman, Francis"),
                new SimpleList("refined","cultivated and genteel","You have seen him becoming more refined and careful day by day, more carefully dressed, less clumsy in the ways and methods of social life.  -- Wells, H. G. (Herbert George)"),
                new SimpleList("refulgent","radiating or as if radiating light","Through the same clear mirror La Fayette saw the sun of freedom reflecting its refulgent rays over Columbia's prolific land.  -- Judson, L. Carroll"),
                new SimpleList("refurbish","make brighter and prettier","She said Kimpton had refurbished many guest rooms to include bigger desks with improved lighting and an ergonomic rolling chair, rather than an armchair.  -- New York Times (Nov 15, 2011)"),
                new SimpleList("refutation","the act of determining that something is false","Whatever falsehoods the counsel for the Crown may advance, and the witnesses swear to, shall meet neither denial nor refutation from me.  -- Lever, Charles James"),
                new SimpleList("regime","the governing authority of a political unit"," Today in the world there is no place for authoritarian administrations, one-party rule, closed regimes,  he said.  -- New York Times (Apr 10, 2012)"),
                new SimpleList("regress","get worse or fall back to a previous condition","Instead of getting better, the team has regressed.  -- Seattle Times (Oct 12, 2010)"),
                new SimpleList("reiterate","to say, state, or perform again","He reiterated the previous rules but added an extra rule related to screen size, measured in inches.  -- New York Times (Apr 4, 2012)"),
                new SimpleList("rejuvenate","return to life; get or give new life or energy","Refresh, renew, rejuvenate yourself by play and pleasant recreation.  -- Marden, Orison Swett"),
                new SimpleList("relapse","a failure to maintain a higher state","With no cure in hand, the goal for most patients with multiple myeloma is to keep treating relapses as long as treatments are available.  -- New York Times (Apr 12, 2010)"),
                new SimpleList("relegate","assign to a lower position","Far from basking in a starring role, New York is relegated once again to the bleachers.  -- New York Times (Apr 24, 2012)"),
                new SimpleList("relent","give in, as to influence or pressure","Mr. Ponomaryov said he initially resisted the inclusion of nationalist leaders, but relented when members agreed to sign a pact denouncing xenophobia and racism.  -- New York Times (Jan 29, 2012)"),
                new SimpleList("relentless","never-ceasing"," It's just been relentless, just nonstop,  city spokesman Allen Marquette said Monday.  -- Washington Post (Jan 10, 2012)"),
                new SimpleList("relevance","the relation of something to the matter at hand","Our hypothesis is that kids will be more interested in science and technology when they see its relevance to their own lives.  -- New York Times (Jul 7, 2010)"),
                new SimpleList("relevant","having a bearing on or connection with the subject at issue","Clinton earns two Pinocchios: He relied on selective data that would support his case while ignoring other relevant numbers.  -- Washington Post (Sep 22, 2011)"),
                new SimpleList("relinquish","turn away from; give up","Emerson's son and biographer some time ago relinquished his medical practice in Concord, and has since devoted himself to art.  -- Wolfe, Theodore F. (Theodore Frelinghuysen)"),
                new SimpleList("relish","spicy or savory condiment","But relish gets no such respect in the food world, Mr. Levine said:  I think sweet relish has become the forgotten condiment.   -- New York Times (Apr 4, 2012)"),
                new SimpleList("remediate","set straight or right","We have made clear that losses associated with improperly executed foreclosures will not be eligible for loss-share arrangements until problems are appropriately remediated, she said.  -- Washington Post (Oct 26, 2010)"),
                new SimpleList("reminiscent","serving to bring to mind","Major deals were completed in Turkey last year and new funds are emerging on a scale reminiscent of the boom times of 2007.  -- New York Times (Mar 14, 2012)"),
                new SimpleList("remorse","a feeling of deep regret, usually for some misdeed"," Defendant has never expressed doubt or regret or remorse,  she said. -- New York Times (Feb 16, 2012)"),
                new SimpleList("remote","inaccessible and sparsely populated","In remote and isolated Manipur, blockades ensure that what little commercial life there is gets choked off.  -- New York Times (Nov 15, 2011)"),
                new SimpleList("remunerate","make payment to; compensate","The annuals, it turned out, did not pay annually, but remunerated their contributors at uncertain periods, varying from two years to ten.  -- Martin, Frederick"),
                new SimpleList("renegade","someone who rebels and becomes an outlaw","This community seemed to be composed of renegades and outlaws from several other communities.  -- Barrows, David Prescott"),
                new SimpleList("renege","fail to fulfill a promise or obligation","But companies often reneged on contracts, German says, and the promised jobs never materialized.  -- Nature (Jun 22, 2011)"),
                new SimpleList("renounce","turn away from; give up","Because my father having renounced his faith, and my mother being uncertain of hers, they had no particular creed to hold us to.  -- Antin, Mary"),
                new SimpleList("renowned","widely known and esteemed","This Mr. Jones was a preacher of extraordinary power, renowned and respected throughout Wales.  -- Sikes, Wirt"),
                new SimpleList("renunciation","the act of sacrificing or giving up or surrendering","In all the stories, however, the virtue of self-sacrifice and of renunciation is strongly painted.  -- Edwards, Clayton"),
                new SimpleList("repent","feel sorry for; be contrite about","There he repented of his errors, was contrite, and reformed himself.  -- Wilson, Epiphanius"),
                new SimpleList("repercussion","a remote or indirect consequence of some action","There's no doubt that there can be grave  repercussions to living thoughtlessly and recklessly online, from endangering college admissions to potential job opportunities.  -- New York Times (Aug 18, 2010)"),
                new SimpleList("repertoire","the range of skills in a particular field or occupation","In Connecticut, Nelson expanded his repertoire, working on his technique and stamina.  -- Seattle Times (May 29, 2011)"),
                new SimpleList("replenish","fill something that had previously been emptied","They arrived at the Cape late in May, and stopped there for thirty-eight days, refitting, replenishing provisions, and refreshing the worn-out crew.  -- Whymper, Frederick"),
                new SimpleList("reprehensible","bringing or deserving severe rebuke or censure","Normally, punitive damages are awarded only when the conduct in question is malicious, unusually reckless, or otherwise reprehensible.  -- Education, United States Department of"),
                new SimpleList("repress","block the action of","Rutherford was manly in his feelings, but he could not repress his starting tears.  -- Roe, Azel Stevens"),
                new SimpleList("reprove","take to task","If he continue to offend his neighbor, the next time he shall be openly reproved and admonished before the Congregation when met together.  -- Berens, Lewis Henry"),
                new SimpleList("repudiate","reject as untrue, unfounded, or unjust","Repudiating the king's claim to unconditional obedience, they declared the Regulating Act unconstitutional, and called on all officers under it to resign their places.  -- French, Allen"),
                new SimpleList("repugnant","offensive to the mind","Such accusations, when made by minors, are generally full of disgusting details, which would be repugnant to any adult.  -- Lombroso, Gina"),
                new SimpleList("reputable","held in high esteem and honor","Youngsters, who might be expected to embrace new ways of doing things, must therefore publish in existing, reputable journals if they want recognition and promotion.  -- Economist (Feb 2, 2012)"),
                new SimpleList("resolute","firm in purpose or belief","Her performance is purposeful and resolute, but she knows when to let Victoria's softness show, too.  -- Salon (Dec 19, 2009)"),
                new SimpleList("resonate","be received or understood","He says that message is increasingly resonating throughout Iowa, particularly in the rural northwest, where his campaign began to catch fire.  -- Washington Post (Jan 1, 2012)"),
                new SimpleList("restitution","a sum of money paid in compensation for loss or injury","Authorities have said in court filings they are looking into using the book proceeds to help repay a $23 million restitution order to his victims.  -- Seattle Times (Nov 7, 2011)"),
                new SimpleList("restive","impatient especially under restriction or delay","The king kept her away from all active warfare, and she grew restive and impatient with her life of inaction.  -- Horne, Charles F. (Charles Francis)"),
                new SimpleList("resurgence","bringing again into activity and prominence","The controversy, however, was by no means ended, and around 1704 it flared again in a resurgence of attacks upon the stage.  -- Anonymous"),
                new SimpleList("resuscitate","cause to regain consciousness","The baby, he said, needed to be resuscitated twice because his heart had stopped beating.  -- New York Times (Mar 21, 2011)"),
                new SimpleList("retaliate","make a counterattack and return like for like","He said, generally speaking, those who sue him are  retaliating for lawsuits he filed against them.  -- Salon (Dec 26, 2010)"),
                new SimpleList("reticent","cool and formal in manner","He was reserved and very reticent, cold in manner and not sympathetic.  -- Various"),
                new SimpleList("retort","answer back","Ay, the men see to that! retorted the good lady, getting the last word and going away delighted.  -- Weyman, Stanley John"),
                new SimpleList("retract","formally reject or disavow a formerly held belief","But no clear motive was ever established, and Mr. Kovalyov later retracted his confession, saying it was extracted under torture.  -- New York Times (Mar 18, 2012)"),
                new SimpleList("retrench","make a reduction, as in one's workforce","Is it, like Channel 4, retrenching into TV programming, cutting back any online project not related to core TV programming?  -- The Guardian (Jan 21, 2011)"),
                new SimpleList("retribution","the act of taking revenge especially in the next life","Whatever may be the retribution for individuals beyond the grave, justice on nations must be done in this world; and here it will be done.  -- Various"),
                new SimpleList("revelation","an enlightening or astonishing disclosure","Then, as revelations of gamblers' dealings with local players became public, L.I.U. lost four consecutive games, all on the road.  -- New York Times (Mar 15, 2012)"),
                new SimpleList("revelry","unrestrained merrymaking","But all this revelry -- dancing, drinks, exuberant youth -- can be hard to manage.  -- New York Times (Jun 4, 2010)"),
                new SimpleList("reverberate","ring or echo with sound","Thunder reverberating through the mountains awakened hoarse echoes on every side.  -- Morgan, Louisa"),
                new SimpleList("revere","love unquestioningly and uncritically or to excess","Have not his countrymen loved, admired, revered, rewarded, nay, almost adored him?  -- Stark, James H."),
                new SimpleList("revile","spread negative information about","Acosta will continue working in Venezuela's foreign service despite, he added, saying she remained an honorable professional despite being  verbally attacked, reviled, demonized.   -- Washington Post (Jan 11, 2012)"),
                new SimpleList("revoke","cancel officially","On average, the agency revokes or denies renewal of 110 licenses annually, records show.  -- Washington Post (Oct 26, 2010)"),
                new SimpleList("revolutionize","change radically"," He revolutionized the way of seeing nature and as a result completely changed how other artists approached landscape painting.   -- New York Times (Jun 15, 2010)"),
                new SimpleList("revulsion","intense aversion","A sick disgust clutched at Rose as she watched--an utter revulsion from the whole loathly business.  -- Crosby, Raymond Moreau"),
                new SimpleList("rhetorical","relating to using language effectively","Of course no two men could possibly be more unlike in the manner of speaking, but the rhetorical vernacular of both has a considerable resemblance.  -- McCarthy, Justin"),
                new SimpleList("rigorous","demanding strict attention to rules and procedures","Consumer advocates pushed for more rigorous regulation, saying that the institutions responsible for wrecking the economy need strict supervision.  -- Washington Post (Dec 12, 2009)"),
                new SimpleList("riveting","capable of arousing and holding the attention","It's formally fascinating -- the 14 dancers sometimes subdivide into five, six or seven sections, with different movements -- and it's dramatically riveting.  -- New York Times (Sep 27, 2010)"),
                new SimpleList("robust","sturdy and strong in form, constitution, or construction","Despite the good news, many economists caution that continued deep declines in the unemployment rate will require more robust economic growth.  -- Washington Post (Apr 5, 2012)"),
                new SimpleList("rousing","capable of stirring enthusiasm or excitement","Still, he played with beautiful colorings and articulate touch, especially in the rousing, high-spirited finale.  -- New York Times (Aug 18, 2011)"),
                new SimpleList("rudimentary","being in the earliest stages of development","The simpler processes must, from their earliest rudimentary beginnings, have been leading up to the later and more complex.  -- Kenealy, Arabella"),
                new SimpleList("ruminate","reflect deeply on a subject","He seemed to ruminate on this thought as if it gave him special cause for reflection.  -- Mulford, Stockton"),
                new SimpleList("rural","living in or characteristic of farming or country life","Graceful farms with white picket fences and horses grazing dot the rural landscape, as do hunting shacks.  -- New York Times (Jan 25, 2012)"),
                new SimpleList("ruse","a deceptive maneuver, especially to avoid capture","I made believe I was flying away, and the Frenchman was deceived by my ruse and came after me, over our positions.  -- Boelcke, Oswald"),
                new SimpleList("rustic","characteristic of rural life","Beautiful high-resolution photographs of farm animals on a rustic background, which produce their respective noises when prodded.  -- The Guardian (Jul 24, 2010)"),
                new SimpleList("ruthless","without mercy or pity","He was not naturally cruel; but he was ruthless if it served his purpose, and could take pitiless vengeance for an insult or a wrong.  -- Horne, Charles F. (Charles Francis)"),

        };

        //ListAdapter listAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,simpleList);

        ListAdapter listAdapter=new CustomAdapter_r(this,simpleList);

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

                        Intent i=new Intent(r_main.this,Details.class);
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
                String str="r";
                Intent in = new Intent(r_main.this, quizStats.class);
                in.putExtra("val",str);
                startActivity(in);

            }catch (Exception ex){
                new AlertDialog.Builder(r_main.this).setMessage(""+ex).show();
            }

            return true;
        }else if(id == R.id.action_search){
            // get prompts.xml view
            LayoutInflater layoutInflater = LayoutInflater.from(r_main.this);
            View promptView = layoutInflater.inflate(R.layout.input_dialog, null);
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(r_main.this);
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
                                        new AlertDialog.Builder(r_main.this).setTitle(simpleList[i].words+"                        ").setMessage(simpleList[i].meanings+"    \n").show();
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
                                    new AlertDialog.Builder(r_main.this).setTitle("Word List: Oops                           ").setMessage("Word not in out database \n").show();

                                }

                            }catch (Exception ex)
                            {
                                new AlertDialog.Builder(r_main.this).setTitle("Error").setMessage(""+ex).show();
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
                String val="r";
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
                                    String str="r";
                                    Intent in = new Intent(r_main.this, quiz.class);
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
