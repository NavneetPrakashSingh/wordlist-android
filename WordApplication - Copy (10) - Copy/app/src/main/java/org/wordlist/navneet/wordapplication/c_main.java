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
public class c_main extends ActionBarActivity {
    // private TextView resultText;
    private ListView myList;
    SimpleList simpleList[];
    DatabaseHelper2 db2;
    List<StudentsModel2> list2=new ArrayList<StudentsModel2>();
    // private ArrayList<SimpleList> alist=new ArrayList<SimpleList>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.c_main);




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
                new SimpleList("cacophonous","having an unpleasant sound","Shoppers mingle, traders peddle their wares and children play in the street, all to a cacophonous backdrop of roaring motorbikes and honking cars.  -- Reuters (May 28, 2010)"),
                new SimpleList("cadaverous","of or relating to a corpse","These dreary, cadaverous corpses are supported in the positions which they are made to assume by means of steel wires hidden beneath their scanty robes.  -- Ballou, Maturin Murray"),
                new SimpleList("calamity","an event resulting in great loss and misfortune","In that memorable calamity seventeen lives were lost and forty persons seriously injured.  -- Hungerford, Edward"),
                new SimpleList("callow","young and inexperienced"," Marston,  he began,  drifted into the Paris ateliers from your country, callow, morbid, painfully young and totally inexperienced.  -- Buck, Charles Neville"),
                new SimpleList("candid","openly straightforward and direct without secretiveness","Mr. Obama, in an unusually candid public discussion of the Central Intelligence Agency's covert program, said the drone strikes had not inflicted huge civilian casualties.  -- New York Times (Jan 31, 2012)"),
                new SimpleList("capitulate","surrender under agreed conditions"," Alas, no,  said Bergfeld, mournfully,  the day after the battle our brave soldiers were surrounded by overwhelming forces and obliged to capitulate.   -- Meding, Johann Ferdinand Martin Oskar"),
                new SimpleList("capricious","determined by chance or impulse rather than by necessity","She remained remote and wild, suddenly breaking off our talks and displaying, where I was concerned, the most capricious and inexplicable moods.  -- Leblanc, Maurice"),
                new SimpleList("caricature","represent a person with comic exaggeration","Mrs. Strong subsequently caricatured our progress by representing me very tall with an extremely tight waistband, and Stevenson looking upward from his diminutive steed.  -- Child-Villiers, Margaret Elizabeth Leigh"),
                new SimpleList("cartographer","a person who makes maps","This monk was an excellent cartographer, or map-maker, and Christopher wished to talk with him about the western lands.  -- Byne, Mildred Stapley"),
                new SimpleList("castigate","censure severely","In particular, Kucinich castigated Obama for pursuing military intervention in Libya without congressional authorization: President Obama moved forward without Congress approving.  -- Salon (Mar 23, 2011)"),
                new SimpleList("catharsis","purging of emotional tensions","Not enough people use evenings out as an opportunity for catharsis.  -- The Guardian (Dec 9, 2010)"),
                new SimpleList("caustic","capable of destroying or eating away by chemical action","Though the mud only came up to ankle height, its caustic ingredients continue to eat away the foundations.  -- BBC (Dec 24, 2010)"),
                new SimpleList("cease","put an end to a state or an activity","The firing ceased; the smoke slowly cleared away, revealing the two fleets commingled, shattered, and torn, and strewed with dead.  -- Headley, Joel Tyler"),
                new SimpleList("cede","relinquish possession or control over","He ceded some of his powers to elected officials, while keeping the final say on issues of defense, national security and religion.  -- Reuters (Nov 26, 2011)"),
                new SimpleList("chagrin","strong feelings of embarrassment","He watched his chance, and, at length, escaped, much to his enemies' chagrin.  -- Stratemeyer, Edward"),
                new SimpleList("charisma","personal attractiveness that enables you to influence others","Egypt's al-Zawahri likely to succeed bin Laden For years, Osama bin Laden's charisma kept al-Qaida's ranks filled with zealous recruits.  -- Salon (May 2, 2011)"),
                new SimpleList("charlatan","a flamboyant deceiver","Like most charlatans who find it necessary to deceive the world, the physician tried to cover up his shortcomings by noisy bluster.  -- Hornblow, Arthur"),
                new SimpleList("chastise","censure severely","Secretary of State Hillary Rodham Clinton recently chastised China in a speech she gave in which she decried Internet censorship.  -- New York Times (Feb 2, 2010)"),
                new SimpleList("chimerical","produced by a wildly fanciful imagination","Indeed during his wild and chimerical attempts for finding out a golden country, it is not improbable that this brave adventurer visited many different places.  -- Hewatt, Alexander"),
                new SimpleList("chronic","long-lasting or characterized by long suffering","Howard is expected to remain out until at least June, while Utley, battling chronic knee injuries, may not return until May.  -- Washington Post (Apr 3, 2012)"),
                new SimpleList("circuitous","deviating from a straight course","It has taken five hours to get here from Cairo via a circuitous route to avoid the Egyptian police checkpoints.  -- BBC (Dec 31, 2010)"),
                new SimpleList("circumlocution","an indirect way of expressing something","He got his message out bunglingly, with embarrassed circumlocution and repetition; but this was what it came to in the end.  -- Howells, William Dean"),
                new SimpleList("circumspect","heedful of potential consequences","As Kaufman writes: On the strategy front, some of these groups are becoming more circumspect in campaigning against global warming, mindful of mixed public sentiment.  -- Time (Dec 19, 2011)"),
                new SimpleList("clandestine","conducted with or marked by hidden aims or methods"," All of this is done in a very clandestine way,  said Paddick, who said he had never personally seen money being exchanged.  -- Seattle Times (Jul 7, 2011)"),
                new SimpleList("clemency","leniency and compassion shown toward offenders","Then on Tuesday, his last day in office, he granted clemency or suspended sentences to more than 200 other convicts.  -- Reuters (Jan 13, 2012)"),
                new SimpleList("clique","an exclusive circle of people with a common purpose","This little clique, this group admired her and instinctively adopted the tone which she set.  -- Couperus, Louis"),
                new SimpleList("coercion","using force to cause something to occur","Authorities are still trying to determine whether Savannah was forced to run by physical coercion or by verbal commands.  -- Time (Feb 23, 2012)"),
                new SimpleList("cogent","powerfully persuasive","The supposition is so very probable, that nothing short of very cogent reasons could induce us to abandon it.  -- Hengstenberg, Ernst Wilhelm"),
                new SimpleList("cognizant","having or showing knowledge or understanding or realization"," You have to be cognizant of the evidence out there and learn from what has been published.  -- New York Times (Jan 4, 2011)"),
                new SimpleList("colloquial","characteristic of informal spoken language or conversation","Perhaps not elegant classical Latin, but good, everyday, useful, colloquial stuff.   -- Fenn, George Manville"),
                new SimpleList("collusion","secret agreement","Then, unless there were collusion on the part of the sentries, he must have slipped through some window, said Davies to himself.  -- Cox, C. B."),
                new SimpleList("colossal","so great in size or force or extent as to elicit awe","In the galleries are colossal figures of dragons, gods, goddesses, and heroes, groups being often carved out of one gigantic monolith.  -- Child-Villiers, Margaret Elizabeth Leigh"),
                new SimpleList("commence","set in motion, cause to start","Reaching this just at evening, he encamped there all night, and the next morning commenced crossing.  -- Headley, Joel Tyler"),
                new SimpleList("commiserate","to feel or express sympathy or compassion","We had spent countless hours together drinking wine and commiserating about child-rearing, long Wisconsin winters and interrupted sleep.  -- New York Times (Mar 24, 2011)"),
                new SimpleList("commodious","large and roomy","When done their building was quite commodious, being twenty-two feet by fourteen.  -- Mudge, Zachariah Atwell"),
                new SimpleList("compelling","driving or forcing","The South African site has some compelling advantages: construction costs are lower, and it sits at a higher altitude.  -- Scientific American (Mar 12, 2012)"),
                new SimpleList("compensation","something given or received as payment or reparation","The Home Office is understood to have paid more than �1m in compensation to 40 children wrongly held in adult detention centres while seeking asylum.  -- BBC (Feb 18, 2012)"),
                new SimpleList("complacent","contented to a fault with oneself or one's actions","He added:  Like being a pioneer in anything, I suppose, you get complacent...We're waking up to the fact that we are lagging behind.  -- Wall Street Journal (Dec 8, 2010)"),
                new SimpleList("compliant","disposed to act in accordance with someone's wishes","Romar said the freshmen are  such a compliant group  and  willing learner  more than any other incoming class he's had at Washington.  -- Seattle Times (Oct 19, 2011)"),
                new SimpleList("composure","steadiness of mind under stress","His heart was beating furiously under his waistcoat, but, taken aback as he was, he maintained outward composure.  -- Weyman, Stanley J."),
                new SimpleList("compulsory","required by rule","While military service is compulsory on all Mohammedans over eighteen years of age, there are some exemptions, and substitution is allowed.  -- Alden, John B."),
                new SimpleList("concede","admit to a wrongdoing","He spent months defending his televised  Decision,  before finally conceding that it might not have been the greatest idea.  -- New York Times (Dec 31, 2011)"),
                new SimpleList("conceited","having an exaggerated sense of self-importance","What wonder, then, that he thought of them as conceited, vain, full of pride, without merit?  -- Morris, Clara"),
                new SimpleList("concentric","having a common center","The inner bark consists of numerous concentric layers of fibers, which interlace in all directions, and thus present a great resemblance to lace. -- Saunders, William"),
                new SimpleList("conciliatory","making or willing to make concessions","Mr. Cox was conciliatory at other moments, but politely stood firm on the basics of the bureau's  economic model.  -- New York Times (Apr 9, 2011)"),
                new SimpleList("concise","expressing much in few words","For some purposes, concise, exactly worded definitions are needed; for other purposes, more extended descriptions are required.  -- Pag?, Victor Wilfred"),
                new SimpleList("conclave","a confidential or secret meeting"," The door is closed now, and we're in secret conclave.   -- Fenn, George Manville"),
                new SimpleList("concord","a harmonious state of things and of their properties"," I take it, then, that we are working in unison,--at least, in concord?   -- Wells, Carolyn"),
                new SimpleList("concurrent","occurring or operating at the same time","St. Croix river being the boundary line between two states, the Wisconsin authorities claimed concurrent jurisdiction.  -- Folsom, William Henry Carman"),
                new SimpleList("condone","excuse, overlook, or make allowances for","Many frown on the mixing of the sexes, refusing to shake hands with women let alone condoning any sort of political activity by them.  -- New York Times (Dec 3, 2011)"),
                new SimpleList("confine","place limits on","Work in synthetic biology is still confined to laboratories, but researchers see potential for advances in energy production, medicine and other fields.  -- Washington Post (Mar 14, 2012)"),
                new SimpleList("conflagration","a very intense and uncontrolled fire","We view Europe as covering at present a smothered fire, which may shortly burst forth and produce general conflagration.  -- Chinard, Gilbert"),
                new SimpleList("conflate","mix together different elements","Cain said his rivals were wrongly attempting to conflate his plan with existing state sales taxes, saying it was like comparing apples and oranges.  -- BusinessWeek (Oct 19, 2011)"),
                new SimpleList("confluence","a place where things merge or flow together","Memphis is situated at the confluence of the Mississippi and Ohio rivers.  -- Kennard, Nina H."),
                new SimpleList("conformity","correspondence in form or appearance","Heretics were frightened into conformity or punished; some were driven out of the country, a few were burned to death.  -- Sedgwick, Henry Dwight"),
                new SimpleList("confound","mistake one thing for another","He is apt to denominate, however, his whole gain, profit, and thus confounds rent with profit, at least in common language.  -- Garnier, Germain"),
                new SimpleList("conglomerate","a group of diverse companies under common ownership","During his time in office, the conglomerates have added more subsidiaries and expanded into sectors usually occupied by smaller companies, like food and retail.  -- New York Times (Feb 6, 2012)"),
                new SimpleList("conjecture","a hypothesis that has been formed by speculating","He guessed how Elbel was occupied, and his conjecture was confirmed by Samba, who at once resumed his scouting work.  -- Strang, Herbert"),
                new SimpleList("connotation","an idea that is implied or suggested"," Expand  is a word with potentially positive connotations, but also virtually an infinite number of negative connotations, including violence and aggression.  -- New York Times (Aug 9, 2010)"),
                new SimpleList("consensus","agreement in the judgment reached by a group as a whole","Mr. Farmer had originally hoped to form a consensus, but later announced that he was prepared to cast the tie-breaking vote.  -- New York Times (Dec 24, 2011)"),
                new SimpleList("conserve","use cautiously and frugally","But by not making body parts they don't need, parasites conserve energy, which they can invest in other efforts like reproduction.  -- Scientific American (Jan 16, 2012)"),
                new SimpleList("consolation","the act of giving relief in affliction","Words of consolation are but empty sounds, for to time alone it belongs to wear out the tears of affliction.  -- Marshall, Florence A. Thomas"),
                new SimpleList("consolidate","bring together into a single whole or system","The Chinese government is now trying to consolidate dozens of small rare earth mining companies into three state-owned giants.  -- New York Times (Mar 9, 2012)"),
                new SimpleList("conspicuous","obvious to the eye or mind","Their clothes are never conspicuous; they detract rather than attract attention.  -- Bok, Edward W."),
                new SimpleList("consternation","fear resulting from the awareness of danger","He lifted himself up on his right elbow; to his horror and consternation, there were two or three spots of blood upon the white sheet.  -- Jones, P."),
                new SimpleList("consummate","having or revealing supreme mastery or skill","Recipes are all thoroughly tested in consummate Cook's Illustrated style, which means you won't be wasting time with any duds.  -- Seattle Times (Dec 18, 2010)"),
                new SimpleList("contaminate","make impure","Some wells and springs are still contaminated with uranium and other toxic heavy metals, a legacy of 40 years of mining.  -- New York Times (Apr 6, 2012)"),
                new SimpleList("contemplate","consider as a possibility","He had never liked him in the old days, but he was far too good-natured to contemplate any serious bloodshed.  -- Heyer, Georgette"),
                new SimpleList("contemporaneous","occurring in the same period of time","In all cases, these materials have been introduced into the cave at some period subsequent to, or contemporaneous with, the formation of the cave.  -- Nicholson, Henry Alleyne"),
                new SimpleList("contrite","feeling or expressing pain or sorrow for sins or offenses","At his death he was very contrite for the sins that he had committed against God before and after his baptism.  -- Robertson, James Alexander"),
                new SimpleList("contrived","showing effects of planning or manipulation","Here, team spirit feels neither corny nor contrived.  -- New York Times (Nov 5, 2011)"),
                new SimpleList("controversial","marked by or capable of arousing disagreement","Both are taking staunchly conservative positions on controversial science issues: they are against regulating carbon emissions and oppose embryonic stem-cell research.  -- Nature (Jan 25, 2012)"),
                new SimpleList("conundrum","a difficult problem","This could solve a conundrum for beekeepers - how to tackle the mites without damaging the bees they live so intimately with.  -- BBC (Dec 22, 2010)"),
                new SimpleList("converse","carry on a discussion","They conversed in French, but the snake made no movement.  -- Various"),
                new SimpleList("convivial","occupied with or fond of the pleasures of good company","Large family groups and neighborhood regulars fill the dining room and the long, convivial bar.  -- New York Times (Jul 25, 2010)"),
                new SimpleList("copious","large in number or quantity","During hot dry summers especially, copious waterings should be given.  -- Weathers, John"),
                new SimpleList("cordial","politely warm and friendly","My personal relations with Mr. Taft had of course always been most cordial and agreeable.  -- Straus, Oscar S."),
                new SimpleList("correlation","a statistical relation between two or more variables","The analysis did not prove that sleeping pills cause death, critics noted, only that there may be a correlation between the two.  -- New York Times (Mar 12, 2012)"),
                new SimpleList("corroborate","support with evidence or authority or make more certain","Such resemblances can prove little or nothing unless they are corroborated by evidence based on historical grounds.  -- Nicholson, Reynold"),
                new SimpleList("countenance","the appearance conveyed by a person's face","On looking on the countenance of Mr. Barry at this moment, Mrs. Palmer was surprised to see it deadly pale.  -- Cobbold, Richard"),
                new SimpleList("coup","a sudden and decisive change of government by force","Ex-president Mohamed Nasheed says he has been forced out in a coup.  -- BBC (Feb 11, 2012)"),
                new SimpleList("covert","secret or hidden","Covert channels are used to transfer sensitive information outside of the enterprise without being detected by gateway security solutions.  -- Forbes (Dec 23, 2011)"),
                new SimpleList("coveted","greatly desired","Among other things of Chinese provenance earnestly coveted by us, perhaps the most desired were books.  -- Hara, Katsuro"),
                new SimpleList("cower","show submission or fear","And there, in one corner, frightened, with guilt writ plain all over her, cowered Lady.  -- Terhune, Albert Payson"),
                new SimpleList("craven","lacking even the rudiments of courage; abjectly fearful","Was it for them to follow the craven footsteps of a cowardly generation?  -- Robinson, Victor"),
                new SimpleList("credence","the mental attitude that something is believable"," I am surprised that plaintiffs' hyperbolic allegations and inflated damage claims are given any credence,  said the bank's top lawyer, Gary Lynch.  -- New York Times (Aug 26, 2011)"),
                new SimpleList("credible","appearing to merit belief or acceptance","So far, no credible studies have linked exposure to radio waves to cancer.  -- Forbes (Nov 16, 2011)"),
                new SimpleList("crestfallen","brought low in spirit","Week after week, he roamed the streets of New York, looking for work, and every night returned to Hoboken, crestfallen and disappointed.  -- Gilson, Charles"),
                new SimpleList("criterion","the ideal in terms of which something can be judged","Each has promised to limit child-directed advertising of its least-healthy products, focusing instead on healthier options meeting nutritional criteria that each company established independently.  -- Chicago Tribune (Mar 5, 2012)"),
                new SimpleList("cryptic","having a secret or hidden meaning"," Lost  represented his most intricate, steadfastly cryptic mystery box, a drawn-out tease during which questions multiplied twice as fast as answers.  -- New York Times (May 29, 2011)"),
                new SimpleList("culminate","end, especially to reach a final or climactic stage","Following Nevada, there are five nomination contests in February, including caucuses in Maine that started this weekend and will culminate later next week.  -- BusinessWeek (Feb 5, 2012)"),
                new SimpleList("culpable","deserving blame or censure as being wrong or injurious","May even the culpable be pardoned; they are punished sufficiently by remorse.  -- Garibaldi, Giuseppe"),
                new SimpleList("cultivate","prepare for crops","A farmer living in rural Ethiopia, for example, will often cultivate all of the food his family needs, selling only if there is a surplus.  -- Scientific American (Apr 6, 2012)"),
                new SimpleList("cultivated","marked by refinement in taste and manners","Dorothy admired Mrs. Faulkner's lovely gracious disposition, and her clever cultivated mind.  -- Wells, Carolyn"),
                new SimpleList("cumbersome","difficult to handle or use because of size or weight","Shabby infrastructure, cumbersome bureaucracy, a meandering tax regime and a nascent local supplier base are holding back industrial growth and more foreign investment.  -- Reuters (Jun 13, 2011)"),
                new SimpleList("cumulative","increasing by successive addition","The unemployment rate has declined for four straight months, falling a cumulative 0.6 percentage point.  -- Reuters (Feb 1, 2012)"),
                new SimpleList("cursory","hasty and without attention to detail; not thorough","He also said department examinations were often cursory, even though widely accepted protocols recommend detailed testing.  -- New York Times (Jul 13, 2010)"),
                new SimpleList("curtail","terminate or abbreviate before its intended or proper end","Deep-rooted corruption was curtailing justice in Pakistan, he added.  -- New York Times (Jan 23, 2012)"),
                new SimpleList("cyclical","recurring in a repeated sequence of events"," These things are cyclical, there are some years that are happier than others,  he said.  -- New York Times (May 15, 2011)"),
                new SimpleList("cynical","believing the worst of human nature and motives","He tried not to become jaded or cynical, he said, and retained hope that people who had made mistakes could turn their lives around.  -- New York Times (Oct 7, 2011)")

        };

        //ListAdapter listAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,simpleList);

        ListAdapter listAdapter=new CustomAdapter_c(this,simpleList);

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

                        Intent i=new Intent(c_main.this,Details.class);
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
                String str="c";
                Intent in = new Intent(c_main.this, quizStats.class);
                in.putExtra("val",str);
                startActivity(in);

            }catch (Exception ex){
                new AlertDialog.Builder(c_main.this).setMessage(""+ex).show();
            }

            return true;
        }else if(id == R.id.action_search){
            // get prompts.xml view
            LayoutInflater layoutInflater = LayoutInflater.from(c_main.this);
            View promptView = layoutInflater.inflate(R.layout.input_dialog, null);
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(c_main.this);
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
                                        new AlertDialog.Builder(c_main.this).setTitle(simpleList[i].words+"                        ").setMessage(simpleList[i].meanings+"    \n").show();
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
                                    new AlertDialog.Builder(c_main.this).setTitle("Word List: Oops                           ").setMessage("Word not in out database \n").show();

                                }

                            }catch (Exception ex)
                            {
                                new AlertDialog.Builder(c_main.this).setTitle("Error").setMessage(""+ex).show();
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
                String val="c";
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
                                    String str="c";
                                    Intent in = new Intent(c_main.this, quiz.class);
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
