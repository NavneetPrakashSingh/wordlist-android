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
public class p_main extends ActionBarActivity {
    // private TextView resultText;
    private ListView myList;
    SimpleList simpleList[];
    DatabaseHelper2 db2;
    List<StudentsModel2> list2=new ArrayList<StudentsModel2>();
    // private ArrayList<SimpleList> alist=new ArrayList<SimpleList>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p_main);


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
                new SimpleList("pacifist","someone opposed to violence as a means of settling disputes","War to the pacifists is wrong, unholy, morally sinful, biologically and economically and in every other way evil.  -- Partridge, G.E."),
                new SimpleList("palliative","moderating pain or sorrow by making it easier to bear","In advanced cases, it is only possible to relieve the patient's suffering by palliative measures.  -- Miles, Alexander"),
                new SimpleList("palpable","able to be felt by tactile examination","Its almost palpable music: blocks of sound with shape and density.  -- New York Times (Jan 10, 2011)"),
                new SimpleList("panacea","hypothetical remedy for all ills or diseases","The city fathers speak of binglang as if it were a panacea for all of Xiangtans ills, from curing tapeworm to solving unemployment.  -- New York Times (Aug 20, 2010)"),
                new SimpleList("pandemic","an epidemic that is geographically widespread","The World Health Organization in 2009 declared swine flu the first global flu pandemic in 40 years.  -- Seattle Times (Feb 1, 2012)"),
                new SimpleList("pandemonium","a state of extreme confusion and disorder","Chief Godbee described the scene as one of  utter chaos and pandemonium.   -- New York Times (Jan 24, 2011)"),
                new SimpleList("paradigm","a standard or typical example","Since, our method has become a paradigm for guiding scientists to the genetic basis of other human diseases.  -- New York Times (Jun 21, 2010)"),
                new SimpleList("paradox","a statement that contradicts itself","It seems like a paradox or contradiction to say that self-denial can harmonize with enjoyment; and yet it is true.  -- Howard, Thomas Henry"),
                new SimpleList("paragon","model of excellence or perfection of a kind","She would tread her enemies under foot and emerge from the conflict victorious, untrammelled, a paragon of virtues.  -- Horrell, Charles"),
                new SimpleList("parody","a composition that imitates or misrepresents a style","Granted, all are outrageously exaggerated, but a discerning eye can detect the truth that lurks behind any satire, parody, or lampoon.  -- Anonymous"),
                new SimpleList("parsimonious","excessively unwilling to spend","In allusion to greedy, parsimonious people, who would rather be put to a great deal of trouble than incur a trifling expense.  -- Hislop, Alexander"),
                new SimpleList("partisan","devoted to a cause or party","Exxon has been extremely partisan, its political action committee essentially acting as a finance arm of the Republican Party.  -- Time (May 1, 2012)"),
                new SimpleList("pastoral","idyllically rustic","He made a considerable reputation as an accomplished painter of quiet pastoral subjects and carefully elaborated landscapes with cattle.  -- Various"),
                new SimpleList("patriarchal","of a social organization with the male as the family head","The old patriarchal system is gone; the father is no longer an autocratic ruler in his small world.  -- Bray, Reginald Arthur"),
                new SimpleList("patrician","befitting a person of noble origin","Caesar was, by birth, patrician, having descended from a long line of noble ancestors.  -- Abbott, Jacob"),
                new SimpleList("patriotism","love of country and willingness to sacrifice for it","In short, he felt the inspiration of patriotism, that noble sentiment which nerves men to do, and dare, unto the death, for their native soil.  -- Semmes, Raphael"),
                new SimpleList("patronizing","characteristic of those who treat others with arrogance","Others, proud of their husbands' standing and of their wealth, could not invent enough unspoken affronts and patronizing phrases to humiliate the little parvenue.  -- Daudet, Alphonse"),
                new SimpleList("paucity","an insufficient quantity or number","The paucity of reptiles in Ireland is remarkable, but they are not altogether absent.  -- Various"),
                new SimpleList("pecuniary","relating to or involving money","In this pecuniary distress, two men offered to loan the necessary funds, and two hundred and fifty dollars were gratefully accepted from each.  -- Bolton, Sarah Knowles"),
                new SimpleList("pedagogy","the principles and methods of instruction","What type of pedagogy, or teaching method, makes me thrive?  -- New York Times (Jan 13, 2011)"),
                new SimpleList("pedantic","marked by a narrow focus on or display of learning","To make a classical quotation in a mixed company is considered pedantic and out of place, as is also an ostentatious display of your learning.  -- Young, John H."),
                new SimpleList("penitent","feeling or expressing remorse for misdeeds","He was penitent at once, and full of promises never to ask her again to do anything that might cause an instant's remorse.  -- MacKenzie, Compton"),
                new SimpleList("penurious","excessively unwilling to spend","He lived a penurious life, eating little, avoiding luxury and dressing in threadbare clothing that he often bought at the Salvation Army and Goodwill.  -- New York Times (Jun 3, 2011)"),
                new SimpleList("perfidious","tending to betray","Any one who studied her treacherous and perfidious countenance would detect therein craft and cruelty.  -- Sue, Eug�ne"),
                new SimpleList("perilous","fraught with danger","They were ever in the most perilous situations, did the most dangerous service, and acknowledged no leader other than their own free will.  -- Ellis, Edward Sylvester"),
                new SimpleList("perish","pass from physical life","Walter Bell's own brother died in a mining accident -- in the same spot where an elder relative perished years earlier.  -- Seattle Times (Apr 19, 2012)"),
                new SimpleList("pernicious","exceedingly harmful","All these experiments, however, are in general not only useless but pernicious, and frequently prove fatal.  -- Millingen, J. G. (John Gideon)"),
                new SimpleList("perpetuate","cause to continue or prevail","The so-called Confederate States, the new power, organized for the avowed purpose of extending and perpetuating African slavery, was now in full blast.  -- Aughey, John H."),
                new SimpleList("personification","someone who represents an abstract quality","He was the personification of determination and never giving up - he inspired so many people, Kidd said in release from the U.S.  -- Washington Post (Feb 9, 2010)"),
                new SimpleList("pertinent","having precise or logical relevance to the matter at hand","You can see how much everyone makes, their performance reports � everything that is pertinent to their employment.  -- Inc (May 3, 2010)"),
                new SimpleList("peruse","examine or consider with attention and in detail","The first he opened, and drawing near the light, perused its contents attentively.  -- James, G. P. R. (George Payne Rainsford)"),
                new SimpleList("pervasive","spreading or spread throughout","Visual Culture Out of Africa Africa is everywhere, so pervasive in our lives that we barely see it.  -- New York Times (Dec 3, 2010)"),
                new SimpleList("philanthropist","someone who makes charitable donations","He was perhaps best known as a philanthropist: just this month he donated more than $15 million to the Leeds Community Foundation.  -- Inc (Sep 27, 2010)"),
                new SimpleList("pillage","steal goods; take as spoils","United Nations officials said that several waves of looters had pillaged Abyei and that there was even a market in town now for looted goods.  -- New York Times (Jun 2, 2011)"),
                new SimpleList("pinnacle","the highest level or degree attainable","One man had lifted them from the lowest ebb almost to the pinnacle of success.  -- Morris, Charles"),
                new SimpleList("pithy","concise and full of meaning","As we are hastily reading books and papers we continually come across maxims, epigrams, and short, pithy sayings that attract us.  -- McCarty, Louis Philippe"),
                new SimpleList("placate","cause to be more favorably inclined","My clients were soon grumbling, but Woodruff handled them well, placating them with excuses that soothed their annoyance to discontented silence.  -- Ashe, E. M."),
                new SimpleList("placid","free from disturbance by heavy waves","The old father, calm and placid looking, is sitting on his heels near the tiller smoking a long bamboo pipe.  -- Macgowan, J. (John)"),
                new SimpleList("plausible","apparently reasonable and valid, and truthful","Your manner was earnest, your argument plausible and at first blush, convincing; but you are wrong.  -- Holt, Mathew Joseph"),
                new SimpleList("plebeian","one of the common people","All of them quite common men! said the provost carelessly--country rustics-- plebeians!  -- Barr, Amelia Edith Huddleston"),
        new SimpleList("plethora","extreme excess","Ive spent a plethora of times going through my essays, over and over and over again.  -- New York Times (Dec 20, 2010)"),
                new SimpleList("pliable","capable of being bent or flexed or twisted without breaking","Worse, the tissues are less pliable, less flexible.  -- Seattle Times (Dec 19, 2011)"),
                new SimpleList("plight","a situation from which extrication is difficult","Although one oncologist waived her fees after hearing about the familys plight, other creditors have demanded payment, and bankruptcy remains a possibility.  -- New York Times (Mar 29, 2010)"),
                new SimpleList("plummet","drop sharply","For one thing, even while video games have skyrocketed, youth violence plummeted to its lowest levels in 40 years according to government statistics.  -- Time (Dec 7, 2011)"),
                new SimpleList("plunder","destroy and strip of its possession","So bold had these robbers become that they did not hesitate to raid the coasts of Italy and to plunder Ostia.  -- Boak, Arthur Edward Romilly"),
                new SimpleList("plutocracy","a political system governed by the wealthy people"," Plutocracy means control by those who own wealth.  -- Nearing, Scott"),
                new SimpleList("poignant","keenly distressing to the mind or feelings","Thus, for example, could I ever have imagined the poignant and terrible suffering of never being alone even for one minute during ten years?  -- Dostoyevsky, Fyodor"),
                new SimpleList("polarize","become divided in a conflict or contrasting situation","Looking at America Mr. Murray sees a country increasingly polarized into two culturally and geographically isolated demographics.  -- New York Times (Feb 5, 2012)"),
                new SimpleList("pompous","puffed up with vanity","A pompous, boasting sort of man, I did not like him at all.  -- Wood, Mrs. Henry"),
                new SimpleList("portentous","of momentous or ominous significance","It grew awfully dark-- portentous omen!--and some enormous drops of rain, as big as bullets, came smacking down upon the window-stone.  -- Le Fanu, Joseph Sheridan"),
                new SimpleList("posterity","all future generations","Our posterity will be the living public of a future generation.  -- Rhys, Ernest"),
                new SimpleList("potent","having a strong physiological or chemical effect","Yet potent as the medicine might be, it was not powerful enough to keep Edward Armstrong asleep all night.  -- Paull, H. B."),
                new SimpleList("potentate","a ruler who is unconstrained by law","The land is ablaze with kings and potentates on golden thrones under canopies of angels.  -- Synge, M. B. (Margaret Bertha)"),
                new SimpleList("pragmatic","concerning a theory of observable practical consequences","The pragmatic method in such cases is to try to interpret each notion by tracing its respective practical consequences.  -- James, William"),
                new SimpleList("preamble","a preliminary introduction to a statute or constitution","It has no preamble, but is simply introduced by the enacting clause.  -- Shambaugh, Benjamin F."),
                new SimpleList("precarious","fraught with danger","It pines for that precarious life; its very dangers and privations fill its breast with desire.  -- Lane, Mary E. Bradley"),
                new SimpleList("precedent","an example that is used to justify similar occurrences","Canada and Newfoundland, following the precedent of the United States, require copyright notice in statutory form.  -- Bowker, Richard Rogers"),
                new SimpleList("precocious","characterized by exceptionally early development","He had been a precocious child, advanced beyond his years in all the studies of the schools.  -- Burns, Elmer Ellsworth"),
                new SimpleList("precursor","something indicating the approach of something or someone","In theory, learning to detect the precursors of environmental distress could help raise the alarm before any damage is irreversible.  -- Science Magazine (Apr 28, 2011)"),
                new SimpleList("predator","any animal that lives by preying on other animals"," Polar bears are very much of a predator bear, having evolved rapidly to become a specialist in hunting seals.  -- New York Times (May 11, 2011)"),
                new SimpleList("predecessor","one who precedes you in time","His works in the tinted manner are full of poetic beauty, and exhibit a marked improvement on those of his predecessors.  -- Koehler, S. R."),
                new SimpleList("predominance","the state of having superior power and influence over others","Below the line, among backboneless animals, there is much greater constancy of superiority among the females, and this predominance persists in many higher types.  -- Hartley, C. Gasquoine (Catherine Gasquoine)"),
                new SimpleList("premonition","a feeling of evil to come","No foreboding of evil haunted him; no slightest premonition of danger clouded his sky.  -- Harvey, James Clarence"),
                new SimpleList("preponderance","exceeding in heaviness; having greater weight","Until representatives from all sections are heard from, however, it will be impossible to say what the preponderance of opinion really is.  -- Various"),
                new SimpleList("preposterous","inviting ridicule","It is ridiculous, preposterous even, certainly wrong, a sugary pudding of groans and cliches.  -- The Guardian (Aug 20, 2010)"),
                new SimpleList("prerequisite","something that is required in advance","For anyone wanting a job in politics, unpaid work experience has become an essential - but often very hard to come by - prerequisite.  -- BBC (Jun 8, 2011)"),
                new SimpleList("prerogative","a right reserved exclusively by a person or group","This was the right of search claimed by Great Britain as one of her prerogatives.  -- Comfield, Amelia Stratton"),
                new SimpleList("prescience","the power to foresee the future","We have never been good at foretelling the future, but when the news is favorable, others forgive our lack of prescience.  -- New York Times (Mar 27, 2010)"),
                new SimpleList("prevalent","most frequent or common","The practice is most prevalent in Pakistani communities, but it's also common among some Middle Eastern and east African groups.  -- The Guardian (Aug 23, 2010)"),
                new SimpleList("prevaricate","be deliberately ambiguous or unclear","Tell your story straight, and dont conceal aught, or prevaricate.  -- Reid, Mayne"),
                new SimpleList("primitive","belonging to an early stage of technical development","Starting millions of years ago, the evolutionary ancestors of humans figured out how to use primitive stone tools in a systematic way.  -- Time (Aug 12, 2010)"),
                new SimpleList("pristine","completely free from dirt or contamination","Luckily though, the number of overall visitors will remain restricted, guaranteeing, it is hoped, at least another 100 years of relative isolation and pristine wilderness.  -- New York Times (Jan 6, 2012)"),
                new SimpleList("privation","act of depriving someone of food or money or rights","This was rolling in riches of luxury, after nearly starving of privation, and dying from thirst.  -- Drayson, A. W. (Alfred Wilks)"),
                new SimpleList("prodigal","recklessly wasteful","In times of plenty his diet is not improved, because he wastes his surplus in prodigal feasting.  -- Thomson, Basil"),
                new SimpleList("prodigious","so great in size or force or extent as to elicit awe","Absorbing in scope and expressive in detail, the piece offered compelling evidence of Mr. Lewiss prodigious imagination and persuasive skill.  -- New York Times (Nov 14, 2011)"),
                new SimpleList("prodigy","an unusually gifted or intelligent person","The former child prodigy entered Bard College at age 11, and was accepted by Yale Law at 16.  -- Reuters (Nov 21, 2011)"),
                new SimpleList("prognosticate","make a prediction about; tell in advance","How strange it is that our dreams often prognosticate coming events! -- Huth, Alexander"),
                new SimpleList("prolific","intellectually productive","He was prolific, directing more than 40 movies, and was versatile, dabbling in many different film genres.  -- Reuters (Apr 10, 2011)"),
                new SimpleList("prolix","tediously prolonged or tending to speak or write at length","What we now regard as tedious and prolix was looked upon as so much linked sweetness long drawn out.  -- Rudd, John"),
                new SimpleList("prominent","having a quality that thrusts itself into attention","Its rounded facade of colored glass juts out over the sidewalk, making the building on Orleans Street a prominent new landmark in East Baltimore.  -- Washington Post (May 7, 2012)"),
                new SimpleList("propel","cause to move forward with force","Propelled by winds and high temperatures, it burned for 10 days, charring more than 250 acres of land.  -- Scientific American (Apr 9, 2012)"),
                new SimpleList("propensity","a natural inclination","But really, cousin, don't you think that this way of contradicting our natures and propensities is very wrong?  -- Bloomfield, Robert"),
                new SimpleList("prophecy","knowledge of the future, as from a divine source","His highest office was prophecy, and in all his temples the priestesses gave mystic revelations of the future.  -- Hurll, Estelle M. (Estelle May)"),
                new SimpleList("propitious","presenting favorable circumstances","It was by favor of these propitious conditions that many of the great fortunes, based upon land, were founded.  -- Gustavus, Myers"),
                new SimpleList("proportional","properly related in size or degree","Relative to the size of its economy, the total Greek spending cuts now being contemplated are proportional to the United States government cutting $1.75 trillion.  -- New York Times (Jul 9, 2011)"),
                new SimpleList("proprietor","someone who owns a business","He was a thriving business man, the proprietor of two plantations and a mill, and kept a large number of hands engaged at work.  -- Anonymous"),
                new SimpleList("propriety","correct behavior","She still hoped, that when removed from the bad influence of the Captain, she would behave herself with more propriety.  -- Moodie, Susanna"),
                new SimpleList("prosaic","not challenging; dull and lacking excitement","Cats is an exceedingly dull and prosaic writer, whose alexandrines roll smoothly on without any power of riveting the attention or delighting the fancy.  -- Various"),
                new SimpleList("prosperity","the condition of having good fortune","In Asian lore, the crane represents endurance as well as good fortune and prosperity.  -- Seattle Times (Mar 7, 2012)"),
                new SimpleList("prostrate","lying face downward","There, she saw, lying on his face, the prostrate form of a man.  -- Fleming, May Agnes"),
                new SimpleList("protege","a person who receives support from an influential patron","The mentor/ protege program was intended to enable small businesses to learn from large, established ones.  -- Washington Post (Oct 1, 2010)"),
                new SimpleList("prototype","a standard or typical example","Babbage never completed his prototype, but several different working models have been constructed since.  -- Forbes (Mar 12, 2011)"),
                new SimpleList("proverbial","relating to or resembling a condensed but memorable saying","Footnote 1: Even bird's milk is not lacking, a Polish proverbial expression signifying abundance, living in clover.  -- Sienkiewicz, Henryk"),
        new SimpleList("provocative","serving or tending to excite or stimulate","Festival play is all that can be expected outside of Europe, but Berlin '36' does make a provocative selection certain to stir debate.  -- Reuters (Jan 11, 2010)"),
        new SimpleList("prowess","a superior skill learned by study and practice","Sometimes more than two bulls are used, thus making the sport more exciting and the measure of the warrior's prowess greater--if he wins.  -- O'Neil, Owen Rowe"),
                new SimpleList("puerile","displaying or suggesting a lack of maturity","You must take part in the pleasures of children, but never accommodate them with a childish language or with foolish or puerile ways.  -- Hugo Paul Thieme"),
                new SimpleList("pugilist","someone who fights with his fists for sport","She said Mandela remains an avid boxing fan and will be watching Filipino pugilist Manny Pacquiao's next world title defence on 7 May.  -- The Guardian (Feb 11, 2011)"),
                new SimpleList("pugnacious","ready and able to resort to force or violence","On this final of three debates all three men seemed pugnacious, combative -- fighting for very high stakes with the gloves off.  -- New York Times (Apr 29, 2010)"),
                new SimpleList("puissant","powerful","The land was some deal emptied of the most puissant and the strongest, for they were dead along with their lord.  -- Evans, Sebastian"),
                new SimpleList("pusillanimous","lacking in courage and manly strength and resolution","The public is pusillanimous and cowardly, because it is weak.  -- Rhys, Ernest"),

        };

        //ListAdapter listAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,simpleList);

        ListAdapter listAdapter=new CustomAdapter_p(this,simpleList);

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

                        Intent i=new Intent(p_main.this,Details.class);
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
                String str="p";
                Intent in = new Intent(p_main.this, quizStats.class);
                in.putExtra("val",str);
                startActivity(in);

            }catch (Exception ex){
                new AlertDialog.Builder(p_main.this).setMessage(""+ex).show();
            }

            return true;
        }else if(id == R.id.action_search){
            // get prompts.xml view
            LayoutInflater layoutInflater = LayoutInflater.from(p_main.this);
            View promptView = layoutInflater.inflate(R.layout.input_dialog, null);
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(p_main.this);
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
                                        new AlertDialog.Builder(p_main.this).setTitle(simpleList[i].words+"                        ").setMessage(simpleList[i].meanings+"    \n").show();
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
                                    new AlertDialog.Builder(p_main.this).setTitle("Word List: Oops                           ").setMessage("Word not in out database \n").show();

                                }

                            }catch (Exception ex)
                            {
                                new AlertDialog.Builder(p_main.this).setTitle("Error").setMessage(""+ex).show();
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
                String val="p";
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
                                    String str="p";
                                    Intent in = new Intent(p_main.this, quiz.class);
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
