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
public class d_main extends ActionBarActivity {
    // private TextView resultText;
    private ListView myList;
    SimpleList simpleList[];
    DatabaseHelper2 db2;
    List<StudentsModel2> list2=new ArrayList<StudentsModel2>();
    // private ArrayList<SimpleList> alist=new ArrayList<SimpleList>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.d_main);

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
                new SimpleList("dally","waste time","Too long already had the young General dallied, wasting time.  -- Wingfield, Lewis"),
                new SimpleList("dapper","marked by up-to-dateness in dress and manners","Favoring elegant, tailored suits, he was once named one of the best dressed men in America by People magazine for his diplomatically dapper style.  -- Reuters (Mar 20, 2011)"),
                new SimpleList("dauntless","invulnerable to fear or intimidation","He had dauntless courage, unwearied energy, engaging manners, boundless ambition, unsurpassed powers of debate, and strong personal magnetism.  -- Herndon, William H."),
                new SimpleList("dawdle","take one's time; proceed slowly","Being alone, she ate slowly, and deliberately dawdled over the meal, to kill time.  -- Allyn, Jack"),
                new SimpleList("dearth","an insufficient quantity or number","In those arid deserts, they suffered from thirst as well as from dearth of provisions.  -- Dawson, �neas MacDonell"),
                new SimpleList("debacle","a sudden and violent collapse","Meanwhile, for now, Mr. Obama has no major scandals or foreign policy debacles.  -- New York Times (Feb 4, 2012)"),
                new SimpleList("debilitate","make weak","Necropsy reports told of horses that had been running with debilitating ailments: stomach ulcers, degenerative joint diseases, pneumonia, metal screws from previous broken bones.  -- New York Times (Mar 27, 2012)"),
                new SimpleList("debunk","expose while ridiculing","Many examples show that what physicians once accepted as truth has been totally debunked.  -- Scientific American (Mar 25, 2011)"),
                new SimpleList("deduce","conclude by reasoning","These cases, extreme as they are, do not justify, in my judgment, the conclusion deduced from them.  -- Kelly, Edmond"),
                new SimpleList("defame","charge falsely or with malicious intent","Doesn't King know he is going to be smeared and defamed for these hearings no matter what?  -- Salon (Jan 26, 2011)"),
                new SimpleList("defiance","an act boldly resisting authority or an opposing force","At least 10 people were escorted by security out of the building after a systematic protest in defiance of the board's actions.  -- Chicago Tribune (Dec 14, 2011)"),
                new SimpleList("defunct","no longer in force or use; inactive","Gold's has found that its express gyms fit well in spaces vacated by defunct or shrinking retailers.  -- Wall Street Journal (Sep 7, 2011)"),
                new SimpleList("dejected","affected or marked by low spirits","Around the table, the group of men--pallid, gloomy, dejected, disheartened.  -- Colles, Julia Keese"),
                new SimpleList("deleterious","harmful to living things","A number of the species are edible, while others have been recorded as deleterious, poisonous, etc.  -- Taylor, Thomas"),
                new SimpleList("delicacy","something considered choice to eat","The lady soon prepared supper, consisting of broiled chicken, and other delicacies.  -- Aughey, John H."),
                new SimpleList("deluge","the rising of a body of water and its overflowing onto land","Dykes and bridges were washed away in places and roads submerged by the muddy deluge.  -- Reuters (Sep 30, 2011)"),
                new SimpleList("demeanor","the way a person behaves toward other people","Hollande projects a unifying, jovial persona and leadership method that clashes with Sarkozy's dominating, impetuous, controversial, and at times grating demeanor.  -- Time (Feb 3, 2012)"),
                new SimpleList("demographic","a statistic characterizing human populations","In my country, about 70 percent of the citizens are 30 years old or younger, and there are similar demographics in many other developing countries.  -- New York Times (Apr 3, 2012)"),
                new SimpleList("denounce","to accuse or condemn openly as disgraceful","Hundreds of protesters gathered in front of the courthouse, chanting slogans denouncing the perpetrators and demanding justice for victims.  -- New York Times (Apr 5, 2012)"),
                new SimpleList("depict","show in, or as in, a picture","The life-size bronze statue depicts Shannon Stone and his young son wearing baseball caps.  -- Seattle Times (Apr 6, 2012)"),
                new SimpleList("deplete","use up, as resources or materials","Eighty-four percent of the world's fish stocks are fully exploited, overexploited or depleted, according to the U.N.  -- Scientific American (Apr 3, 2012)"),
                new SimpleList("derivation","the source or origin from which something comes","The derivation of the words courteous and courtesy from court is obvious.  -- Milton, John"),
                new SimpleList("descendant","a person considered as coming from some ancestor or race","The families that founded the two groups are closely related to each other through marriages between their descendants.  -- New York Times (Nov 23, 2011)"),
                new SimpleList("descry","catch sight of","Looking off seaward, I could descry no sails.  -- Drake, Samuel Adams"),
                new SimpleList("desolate","providing no shelter or sustenance","The surroundings were barren rocks, gloomy deep valleys, and desolate gullies, the only redeeming feature being a glimpse of the ocean on one hand.  -- Whymper, Frederick"),
                new SimpleList("destitute","poor enough to need help from others","They wandered over muir and fell, in poverty and sorrow, being destitute, afflicted, tormented.  -- Turnbull, Robert"),
                new SimpleList("deter","turn away from by persuasion","Let no sportsman or amateur naturalist be deterred from visiting Patagonia by the discouraging words of Darwin.  -- Spears, John R."),
                new SimpleList("detrimental","causing harm or injury","The damage it's done is just so detrimental to the country.  -- The Guardian (Jan 9, 2011)"),
                new SimpleList("devout","deeply religious","Devout peasants always kneel as the blessed infant passes.  -- Hare, Augustus J. C."),
                new SimpleList("dexterity","adroitness in using the hands","It's not as good as an actual hand, obviously, but it gives you more dexterity because the fingers move independently. -- Seattle Times (Dec 1, 2010)"),
                new SimpleList("diabolical","showing cunning or ingenuity or wickedness","He is ever hankering after forbidden arts, and many have fallen the innocent victims to his diabolical intrigues.  -- Roby, John"),
                new SimpleList("diaphanous","so thin as to transmit light","Watercolour, being transparent but visible, is made for the insubstantial: for painting water, reflection, vapour, sky, the hazy, diaphanous and remote.  -- The Guardian (Feb 20, 2011)"),
                new SimpleList("diatribe","thunderous verbal attack","The grotesquely violent diatribes that the characters sometimes hurl at each other parody the vicious language Lear heaps on his ungrateful daughters, for instance.  -- New York Times (Jan 15, 2010)"),
                new SimpleList("dichotomy","being twofold","The stark dichotomy between their own lives and the projections on the televisions in their living rooms becomes more pronounced.  -- New York Times (Jan 2, 2012)"),
                new SimpleList("didactic","instructive, especially excessively","Min is nothing if not didactic, lecturing to the point of hectoring the reader.  -- Seattle Times (Apr 8, 2010)"),
                new SimpleList("diffident","lacking self-confidence","He had exceedingly good parts, but was somewhat diffident and bashful.  -- Rameur, E."),
                new SimpleList("dilettante","an amateur engaging in an activity without serious intention","For the rest, in practice I am an idler, a dilettante, and a good deal else that is pleasant and utterly useless.  -- Griffith, George Chetwynd"),
                new SimpleList("dire","fraught with extreme danger; nearly hopeless","In Florida, the demand for foster homes was so dire that children were sleeping in child welfare offices as recently as a few years ago.  -- Washington Post (Dec 31, 2011)"),
                new SimpleList("disconcerting","causing an emotional disturbance","There was no drooping of fringed lids, no disconcerting silences; she chatted with ease and piquancy.  -- Rives, Hallie Erminie"),
                new SimpleList("discord","lack of agreement or harmony","For all the alleged discord in this country, there's an amazing amount of real agreement on what  a better America  would look like.  -- Time (Apr 3, 2012)"),
                new SimpleList("discreet","marked by prudence or modesty and wise self-restraint","Sarkozy has attempted to tone down his image, becoming more discreet about his private life.  -- BusinessWeek (Feb 9, 2012)"),
                new SimpleList("discrepancy","a difference between conflicting facts or claims or opinions","The historical discrepancies are sufficiently glaring to make the story more than questionable.  -- Baring-Gould, S. (Sabine)"),
                new SimpleList("disenfranchise","deprive of voting rights","European Union observers said the vote was  marred by avoidable and logistical failures, which led to an unacceptable number of Ugandan citizens being disenfranchised.   -- BusinessWeek (Feb 20, 2011)"),
                new SimpleList("disfigure","mar or spoil the appearance of","A darker scowl changed and disfigured his brow, as he lost hope of gaining me.  -- Weyman, Stanley John"),
                new SimpleList("disgruntled","in a state of sulky dissatisfaction","PA Parenteau breakaway goal less than two minutes later stretched New York's lead and caused a cascade of boos from disgruntled Maple Leafs fans.  -- Seattle Times (Mar 21, 2012)"),
                new SimpleList("disheveled","in disarray; extremely disorderly","The fierce winds blew some walls off some rooms, leaving disheveled beds and misplaced furniture but miraculously no injuries.  -- Chicago Tribune (Mar 1, 2012)"),
                new SimpleList("disingenuous","not straightforward or candid","It feels both flattering and insulting, comforting and unsettling, honest and disingenuous.  -- New York Times (Sep 13, 2011)"),
                new SimpleList("disinter","dig up for reburial or for medical investigation","In the Northern Islands the entire remains are disinterred, carefully cleaned, wrapped up once more, and reburied; here, the skull and jawbone only are retained.  -- Kloss, C. Boden"),
                new SimpleList("disjointed","lacking orderly continuity","His thoughts lost their continuity and became scrappy, disjointed, hazy.  -- Reynolds, Mrs. Baillie"),
                new SimpleList("dismal","causing dejection","Brownsville is a neighborhood so distinguished by negatives that even on a cloudless day, a dismal, enervating tension can take hold.  -- New York Times (Jan 14, 2012)"),
                new SimpleList("dismantle","take apart into its constituent pieces","The Tunny machines, like the Colossus computers they worked alongside, were dismantled and recycled for spare parts after World War II.  -- BBC (May 27, 2011)"),
                new SimpleList("dismay","the feeling of despair in the face of obstacles","She looked at him with dismay, as though lamenting, making him responsible for her misfortune.  -- Blasco Ib??ez, Vicente"),
                new SimpleList("disparage","express a negative opinion of","In pitching for more contracts, AMR publicly tries to avoid disparaging fire departments, even as it criticizes the public business model.  -- Reuters (Apr 15, 2011)"),
                new SimpleList("disparity","inequality or difference in some respect","Nationwide, women's groups point out the glaring gender disparity in public life, noting that there are only 6 female governors and 17 female senators.  -- New York Times (Mar 26, 2012)"),
                new SimpleList("dispassionate","unaffected by strong emotion or prejudice","His words recall to us a windy afternoon on Fifth Avenue, in the days when our Uncle Sam was dispassionate and neutral.  -- Bone, David W. (David William)"),
                new SimpleList("dispatch","the act of sending off something","Messengers were immediately dispatched in every direction, sending the glad tidings on.  -- Headley, Joel Tyler"),
                new SimpleList("dispel","force to go away","The idea that sufferers from heart disease should avoid physical exertion has been dispelled by a noted physiologist who has successfully employed regulated exercise.  -- McCarty, Louis Philippe"),
                new SimpleList("dispense","grant an exemption","Lumber being scarce in that vicinity, floors, doors, as well as sash and glass, were dispensed with.  -- Gray, William Henry"),
                new SimpleList("disperse","cause to separate","They were dispersed by riot police officers but returned a few hours later before being chased away again.  -- New York Times (Feb 13, 2012)"),
                new SimpleList("displace","cause to move, usually with force or pressure","There is a desperate need for food, for shelter and assistance, Johnson said after visiting the affected area and meeting displaced people.  -- Reuters (Jan 7, 2012)"),
                new SimpleList("disposable","designed to be thrown away after use","Sadly, it's also normal to see these disposable cups spewing out of bins and knocking about on pavements.  -- The Guardian (Jan 30, 2011)"),
                new SimpleList("disposition","your usual mood","At this time, he moved in the best society, where his courtly manners and genial disposition made him a general favorite.  -- Stark, James H."),
                new SimpleList("disseminate","cause to become widely known","Few will be surprised if more details are disseminated before the big reveal at Detroit's Cobo Hall.  -- New York Times (Dec 30, 2011)"),
                new SimpleList("dissertation","a treatise advancing a point of view resulting from research","He attended Duke University, won a Rhodes scholarship to Oxford and earned a Ph.D., writing a dissertation on humanitarian movements and relief work.  -- New York Times (May 8, 2011)"),
                new SimpleList("dissident","a person who dissents from some established policy","Just as political dissidents fought the Soviet regime, so, too, did others oppose the educational system.  -- New York Times (Sep 15, 2011)"),
                new SimpleList("dissimilar","not alike","How do two cities so dissimilar in location, size, and environment end up on the same end of the cost-of-living scale?  -- BusinessWeek (Jun 29, 2010)"),
                new SimpleList("dissimulate","hide feelings from other people","He was simply more cautious than is usual in men, and so exceedingly honest that it was impossible for him to dissimulate.  -- Swiggett, Samuel A."),
                new SimpleList("dissipate","to cause to separate and go in different directions","The leaked gas -- mainly methane -- was dissipating in the atmosphere very quickly, Total said.  -- New York Times (Apr 2, 2012)"),
                new SimpleList("dissipated","preoccupied with the pursuit of pleasure","The Prince of Wales also still pursued the most dissipated rounds of pleasure, making his very name hateful to every virtuous ear.  -- Hamilton, Lady Anne"),
                new SimpleList("dissipation","dissolute indulgence in sensual pleasure","But some men mean by college spirit something finer than lawlessness, dissipation, and rowdyism.  -- Addams, Jane"),
                new SimpleList("dissolute","unrestrained by convention or morality","Extravagance, debauchery, and dissolute habits were sure to work out in time the attendant ills of wretchedness, destitution, and penury.  -- Carroll, Mitchell"),
                new SimpleList("dissolution","the termination or disintegration of a relationship","A loosening and final dissolution of old unions, which no longer satisfy all conditions, cannot be recommended until new constellations are within reach.  -- Various"),
                new SimpleList("dissolve","cause to fade away","And then the glittering mass begins to dissolve and fade away.  -- Rameur, E."),
                new SimpleList("dissonance","the auditory experience of sound that lacks musical quality","On that album Wilco opened up its music, letting noise, dissonance and other disruptions transmogrify what had been solid, straightforward roots-rock.  -- New York Times (Sep 26, 2011)"),
                new SimpleList("dissonant","lacking in harmony","He thinks it's a practical joke, because the music is fragmentary, halting, dissonant and weird.  -- The Guardian (Oct 15, 2010)"),
                new SimpleList("dissuade","turn away from by persuasion","Several old miners tried, with the best of intentions, to dissuade Gabe from going to those diggings, saying he would only meet with failure.  -- Webster, Frank V."),
                new SimpleList("distant","located far away spatially","I counted eight peaks, and then, on coming nearer, others, that at first had blended with those higher and more distant ones, detached themselves.  -- Drake, Samuel Adams"),
                new SimpleList("distend","swell from or as if from internal pressure","Some kids said LaNiyah's distended abdomen looked like she was carrying a baby.  -- Seattle Times (Apr 7, 2011)"),
                new SimpleList("distill","remove impurities from and increase the concentration of","He has made his mark by simplifying and distilling his ideas, using as few elements as the conventions of showing art will allow.  -- New York Times (Jun 24, 2011)"),
                new SimpleList("distillation","purifying a liquid by boiling it and condensing its vapors","This process of heating an organic compound in a closed vessel without access of air and collecting the products, is called destructive distillation.  -- Meldola, Raphael"),
                new SimpleList("distort","twist and press out of shape","It was dark and distorted, swollen a great deal, and one of his eyes was closed.  -- Micheaux, Oscar"),
                new SimpleList("distract","draw someone's attention away from something","During the evening he had kept his sorrow at bay as well as he could, distracting his thoughts with passing objects.  -- Weyman, Stanley John"),
                new SimpleList("distraught","deeply agitated especially from emotion","He is plainly distraught, utterly unbalanced by the sad experience he has had.  -- Flotow, Friedrich von"),
                new SimpleList("distress","cause mental pain to","Prissy alone was genuinely distressed, and so affected was she that two big tears of woe trickled down her cheeks.  -- Crockett, S. R. (Samuel Rutherford)"),
                new SimpleList("diverse","many and different","This remains a diverse country, and there are distinct regional differences even within a political party.  -- Washington Post (Mar 7, 2012)"),
                new SimpleList("divest","cease to hold, as an investment","The practice was known as tobashi, and was used to mean hiding bad loans or selling or divesting in unwanted stocks.  -- Wall Street Journal (Nov 8, 2011)"),
                new SimpleList("docile","willing to be taught or led or supervised or directed","The Puma is, however, easily tamed and becomes very docile under kindly treatment.  -- Various"),
                new SimpleList("dogmatic","relating to or involving a religious doctrine","Expect neither theological controversy nor dogmatic discussion of any kind from me.  -- R?ville, Albert"),
                new SimpleList("doleful","filled with or evoking sadness","He never held forth dark threats, nor adopted, like many preachers about him, the doleful tones of grief when he talked about religion.  -- Ballou, Maturin Murray"),
                new SimpleList("domestic","produced in a particular country","At the same time, domestic oil production is actually increasing after decades of decline, meaning we have to import less than before.  -- New York Times (Mar 21, 2012)"),
                new SimpleList("dominant","exercising influence or control","He looked strangely determined and forceful; almost, as she thought of it, dominant.  -- Bindloss, Harold"),
                new SimpleList("dormant","inactive but capable of becoming active","In addition, this past winter was warmer than usual, so normally dormant ticks are active.  -- Scientific American (Mar 23, 2012)"),
                new SimpleList("dreary","causing dejection","Looking out of my window the landscape is cold and dreary.  -- Vay, P?ter"),
                new SimpleList("drudgery","hard monotonous routine work","My worthy employer, however, evidently intends holding on forever, and the sordid, monotonous drudgery has been getting insupportable lately.  -- Bindloss, Harold"),
                new SimpleList("dubious","fraught with uncertainty or doubt","Through online forums, blogs and Twitter, a cottage industry has grown up around instant criticism of dodgy scientific claims and dubious findings.  -- Nature (Dec 7, 2011)"),
                new SimpleList("duplicity","acting in bad faith","Whatever they touched was blighted; whatever they said or preached breathed treachery; wherever they went, vice, crime, and duplicity marked their track.  -- Hogan, William"),
                new SimpleList("durable","capable of withstanding wear and tear and decay","The department said orders for durable goods, manufactured products expected to last three years or more, fell 0.5 percent, a smaller decline than initially estimated.  -- Reuters (Dec 5, 2011)"),
                new SimpleList("dwell","inhabit or live in","They did not dwell in fixed abodes, but wandered hither and thither as inclination and duty led.  -- Ogg, Frederic Austin"),
                new SimpleList("dwindle","become smaller or lose substance","As decades pass, maximum heart rate slows, aerobic capacity wanes, muscle mass tends to dwindle.  -- New York Times (Apr 2, 2012)"),
                new SimpleList("dystopian","of an imaginary place where life is extremely bad","And yet his dystopian vision that humanity's lot, our inescapable fate, will be grinding, desperate poverty, lives on.  -- Salon (Sep 2, 2010)"),

        };

        //ListAdapter listAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,simpleList);

        ListAdapter listAdapter=new CustomAdapter_d(this,simpleList);

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

                        Intent i=new Intent(d_main.this,Details.class);
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
                String str="d";
                Intent in = new Intent(d_main.this, quizStats.class);
                in.putExtra("val",str);
                startActivity(in);

            }catch (Exception ex){
                new AlertDialog.Builder(d_main.this).setMessage(""+ex).show();
            }

            return true;
        }else if(id == R.id.action_search){
            // get prompts.xml view
            LayoutInflater layoutInflater = LayoutInflater.from(d_main.this);
            View promptView = layoutInflater.inflate(R.layout.input_dialog, null);
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(d_main.this);
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
                                        new AlertDialog.Builder(d_main.this).setTitle(simpleList[i].words+"                        ").setMessage(simpleList[i].meanings+"    \n").show();
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
                                    new AlertDialog.Builder(d_main.this).setTitle("Word List: Oops                           ").setMessage("Word not in out database \n").show();

                                }

                            }catch (Exception ex)
                            {
                                new AlertDialog.Builder(d_main.this).setTitle("Error").setMessage(""+ex).show();
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
                String val="d";
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
                                    String str="d";
                                    Intent in = new Intent(d_main.this, quiz.class);
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
