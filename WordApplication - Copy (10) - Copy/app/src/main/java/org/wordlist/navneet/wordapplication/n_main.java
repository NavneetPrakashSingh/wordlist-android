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
public class n_main extends ActionBarActivity {
    // private TextView resultText;
    private ListView myList;
    SimpleList simpleList[];
    DatabaseHelper2 db2;
    List<StudentsModel2> list2=new ArrayList<StudentsModel2>();
    // private ArrayList<SimpleList> alist=new ArrayList<SimpleList>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.n_main);

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
                new SimpleList("nadir","the lowest point of anything","No one in that vast audience raised a word of protest, and my spirits fell to their nadir.  -- Gosse, Edmund"),
                new SimpleList("naive","marked by or showing unaffected simplicity","Some have argued that the ministers in question should not have been so naive and foolish as to unburden themselves to complete strangers. -- BBC (Dec 23, 2010)"),
                new SimpleList("naivete","lack of sophistication or worldliness","But there was a sort of freshness and naivete and youthfulness about her which made him use that adjective.  -- Lyall, Edna"),
                new SimpleList("narcissist","someone in love with themselves","Narcissists blame others for failures, take undeserved credit for success, are hypersensitive to negative feedback, and show an exaggerated sense of entitlement.  -- BusinessWeek (Oct 4, 2010)"),
                new SimpleList("narrative","consisting of or characterized by the telling of a story","Mr. Barton is master of the mystery story, and in this absorbing narrative the author has surpassed his best previous successes.  -- Whitehead, Harold"),
                new SimpleList("nascent","being born or beginning","The initiative also invests in nascent solar companies, acting as an incubator for small businesses and entrepreneurs looking to bring disruptive new technologies to market.  -- Scientific American (Feb 29, 2012)"),
                new SimpleList("nationalism","the doctrine that countries should act independently","Populist nationalism also tends to favor protectionist policies that shield American workers and businesses, particularly small businesses, from foreign competition.  -- Salon (Jan 12, 2011)"),
                new SimpleList("native","characteristic of or existing by virtue of geographic origin","The first European colonists in America found there two valuable native products--maize and tobacco.  -- Queensland"),
                new SimpleList("natty","marked by up-to-dateness in dress and manners","These styles are the latest thing, Brought from Paris for the Spring, Neat and natty, trim and cool-- April Fool! cried Amos.  -- Bromhall, Winifred"),
                new SimpleList("naught","a quantity of no importance","Names to him were nothing, and titles naught--assumption always standing back abashed at his cold, intellectual glare.  -- Herndon, William H."),
                new SimpleList("nauseate","upset and make ill","After dialysis, patients can feel weak and nauseated, sometimes experiencing significant head, chest and stomach pain -- and the tears often flow.  -- New York Times (Nov 5, 2011)"),
                new SimpleList("nauseous","causing a sick feeling","I still grew nauseous after eating and experienced other stomach-related disorders such as food Sticking above my stomach and gastrointestinal disturbances.  -- Isaacson, Lauren Ann"),
                new SimpleList("nautical","relating to ships or navigation","For this expedition Henry Hudson--already known as an experienced and intrepid seaman, and well-skilled in nautical science--was chosen commander.  -- Whymper, Frederick"),
                new SimpleList("navigable","able to be sailed on or through safely","This, indeed, is an exaggerated vaunt; but the Flemish stuffs were probably sold wherever the sea or a navigable river permitted them to be carried.  -- Hallam, Henry"),
                new SimpleList("navigate","direct and plot the path and position of a conveyance","Washed out roads grounded trucks in the muck, and precarious mountain passes were in some cases too risky to navigate.  -- New York Times (Dec 27, 2011)"),
                new SimpleList("nebulous","lacking definite form or limits","The time for nebulous, unspecified and non-detailed commitments is gone, Fiat SpA Chief Executive Officer Sergio Marchionne said yesterday in London.  -- BusinessWeek (Sep 21, 2011)"),
                new SimpleList("necessitate","require as useful, just, or proper","Bean's famed hunting boots are seeing a surge in popularity, necessitating the hiring of more than 100 additional employees to make them.  -- Washington Post (Dec 29, 2011)"),
                new SimpleList("necessity","anything indispensable","The rainy season was fairly under way and suitable shelter was an absolute necessity.  -- Denny, Emily Inez"),
                new SimpleList("necromancy","the belief in magical spells that harness occult forces","In necromancy, spirits are summoned by means of spells and incantations.  -- Leuba, James H. (James Henry)"),
                new SimpleList("nectar","a sweet liquid secretion that is attractive to pollinators","Nor was it understood that the beautiful blossom of the flower, with its sweet nectar, was an exceedingly important factor in attracting the bees.  -- Sadler, William S."),
                new SimpleList("nefarious","extremely wicked","To accomplish his nefarious designs the Evil Spirit assumed forms calculated to attain his object.   -- Owen, Elias"),
                new SimpleList("negate","make ineffective by counterbalancing the effect of","Chances are, you'd also wind up paying more for housing in your new digs, potentially negating any money saved with a shorter commute.  -- Time (May 5, 2011)"),
                new SimpleList("negative","having the quality of something harmful or unpleasant","It is also used as means of coping with anxiety or other negative feelings and to relieve stress or pressure.  -- New York Times (Apr 24, 2012)"),
                new SimpleList("neglect","fail to attend to","She found the men were getting sleepy, and neglected the fire, and so she kept awake, and sat up to throw on the wood.  -- Field, Henry M. (Henry Martyn)"),
                new SimpleList("neglected","disregarded","Human health is largely neglected, if not entirely ignored, in debates about climate change, said Margaret Chan, director-general of the World Health Organization.  -- Scientific American (Apr 5, 2012)"),
                new SimpleList("negligence","failure to act with the prudence of a reasonable person","That being the case, he said the spy agency had demonstrated  negligence, ineptitude and failure in failing to detect the world's most wanted man.  -- BBC (May 25, 2011)"),
                new SimpleList("negligent","characterized by neglect and undue lack of concern","With his usual scant sympathy, Arthur, hardly glancing aside at him, gave a lofty negligent little nod by way of recognition, and was passing on.  -- Werner, E. T. C. (Edward Theodore Chalmers)"),
                new SimpleList("negligible","so small as to be meaningless; insignificant","The changes that have taken place in human nature during the historic period are so slight as to be practically negligible.  -- Cohen, Chapman"),
                new SimpleList("negotiable","able to be arranged by compromise","Often both are negotiable, or at least up for discussion.  -- New York Times (Jan 21, 2011)"),
                new SimpleList("negotiate","discuss the terms of an arrangement","Children learn the art of problem solving, negotiating and making compromises.  -- New York Times (Dec 5, 2011)"),
                new SimpleList("negotiation","a discussion intended to produce an agreement","Government negotiations with bankers and insurers broke up without agreement Friday, although officials said more talks are likely next week.  -- Reuters (Jan 14, 2012)"),
                new SimpleList("nemesis","something causing misery or death","The strange nemesis that had pursued them step by step had been permitted to wreck their lives completely.  -- Berger, William Merritt"),
                new SimpleList("neologism","a newly invented word or phrase","Perhaps the solution is to be found in  neologisms, where words are taken from somewhere totally different and given an entirely new meaning.  -- BBC (Mar 8, 2011)"),
                new SimpleList("neophyte","any new participant in some activity","The four first students went out, each escorting a less-accustomed neophyte and all fastened firmly together with space-ropes.  -- Leinster, Murray"),
                new SimpleList("nepotism","favoritism shown to relatives or friends by those in power","Mr Yeddyurappa denies claims by political opponents he committed nepotism by selling government land to his two sons and relatives at throwaway prices.  -- BBC (Jan 24, 2011)"),
                new SimpleList("nestle","move or arrange oneself in a comfortable and cozy position","Father, said Olive, thrusting her hand through the rector's arm and nestling up to his side with the most bewitchingly affectionate gesture. -- Mitford, Bertram"),
                new SimpleList("nether","lower","The latest expeditions have looked at seep communities as deep as 1.7 miles -- far down the continental slope toward the gulf's nether regions.  -- New York Times (Jun 22, 2010)"),
                new SimpleList("nettle","plant having stinging hairs that cause skin irritation","Unlike stinging nettle, which is harder to find in the city, purple dead nettle grows abundantly across the five boroughs.  -- New York Times (Apr 30, 2011)"),
                new SimpleList("network","an interconnected system of things or people","Success depends on personal relations with power, said Mr. Evtushenkov, insisting that a tight personal network is as vital in New York as in Moscow.  -- New York Times (May 4, 2012)"),
                new SimpleList("neurotic","affected with emotional disorder","Why are some left to insanity, psychosomatic disorders or neurotic behavior?  -- Isaacson, Lauren Ann"),
                new SimpleList("neutral","possessing no distinctive quality or characteristics","Pure gelatin is an amorphous, brittle, nearly transparent substance, faintly yellow, tasteless and inodorous, neutral in reaction and unaltered by exposure to dry air.  -- Various"),
                new SimpleList("neutrality","nonparticipation in a dispute or war","After renewed occupation in World War II, Luxembourg abandoned its neutrality and became a front-rank enthusiast for international co-operation.  -- BBC (May 22, 2010)"),
                new SimpleList("neutralization","the removal of a threat by killing or destroying it","Three have been eliminated through incineration or neutralization.  -- Salon (Feb 19, 2010)"),
                new SimpleList("neutralize","oppose and mitigate the effects of by contrary actions","Sweating aids in neutralizing the injurious effects of exposure to high temperatures.  -- Various"),
                new SimpleList("newcomer","a recent arrival","Humans are newcomers to the planet compared to the 165 million years dinosaurs dominated before becoming extinct 65 million years ago.  -- Seattle Times (Mar 1, 2012)"),
                new SimpleList("nexus","the means of connection between things linked in series","For many users, the Web site is an irreplaceable nexus of friends, relatives and colleagues online, making it difficult to abandon.  -- New York Times (May 24, 2010)"),
                new SimpleList("nib","the writing point of a pen","My father began writing with an abominably scratchy nib.  -- Crawford, Jack"),
                new SimpleList("nicety","conformity with some aesthetic standard of correctness","All the little niceties of platform procedure--bowings, exits, dealing with encores--are out of the question.  -- Warner, Frances Lester"),
                new SimpleList("niche","a position well suited to the person who occupies it","Carroll is skilled at finding specific roles and carving out niches for players.  -- Seattle Times (May 1, 2012)"),
                new SimpleList("niggle","worry unnecessarily or excessively","But investors are still jittery, thanks to their niggling anxieties about the bad debts held in Europe's financial institutions.  -- Time (Jul 22, 2010)"),
                new SimpleList("nihilism","the delusion that things do not exist","In her despair she succumbed to a sort of nihilism that made her ask: What is the reason of anything?...  -- Couperus, Louis"),
                new SimpleList("nihilist","someone who rejects all theories of morality","He allied himself with quite another class, making no secret of the fact that he was an out-and-out Socialist, Anti-clerical, Syndicalist, Anarchist, Nihilist.  -- Fisher, Dorothy Canfield"),
                new SimpleList("nimble","moving quickly and lightly","Are not many beasts physically stronger, more nimble and agile than man?  -- Nordau, Max Simon"),
                new SimpleList("nirvana","any place of complete bliss and delight and peace","The wisest among them could not teach him true peace, that profound inward rest, which was already called Nirvana.  -- Bulfinch, Thomas"),
                new SimpleList("noble","having high or elevated character","Honesty, frankness, generosity, and virtue are noble traits.  -- Hartley, Cecil B."),
                new SimpleList("nocturnal","belonging to or active during the night","Bats are a top nocturnal predator, eating night-flying insects that feed on agricultural crops.  -- Washington Post (Mar 14, 2012)"),
                new SimpleList("noetic","of or associated with or requiring the use of the mind","It is a sort of mental equivalent for them, their epistemological function, their value in noetic terms.  -- James, William"),
                new SimpleList("noisome","causing or able to cause nausea","Here the noisome smell of decaying vegetation nauseated us, for the air in those forest depths is deadly.  -- Le Queux, William"),
                new SimpleList("nomad","a member of a people who have no permanent home","These Indians lived the old nomad life, wandering from place to place, setting up their tents like gypsies, wherever they could remain unmolested.  -- Vandercook, Margaret"),
                new SimpleList("nomadic","migratory","They are a nomadic people living by collecting and hunting; the wilder ones will often not remain longer than three days in one place.  -- Haddon, Alfred Court"),
                new SimpleList("nomenclature","a system of words used to name things in a discipline","Technical names of fishes are those that seem to qualify under the International Rules of Zoological Nomenclature.  -- Deacon, James Everett"),
                new SimpleList("nominal","insignificantly small; a matter of form only","The ordinary course of dealings was so completely disorganized in many places that the rates were purely nominal, representing little or no actual transactions.  -- Phillips, Chester Arthur"),
                new SimpleList("nonchalant","marked by blithe unconcern","It's really weird, she said with that nonchalant shrug of her shoulders and go with the flow attitude.  -- Salon (May 20, 2010)"),
                new SimpleList("noncommittal","refusing to bind oneself to a particular course of action","The worst of it was, that he had been so cautious and noncommittal in his declarations, that she could not upbraid him for his perfidy.  -- Bouton, John Bell"),
                new SimpleList("nonconformist","someone refusing to follow established standards of conduct","They are nonconformists, mavericks even, in an age when clubs are burdened by regulation, challenging authority and provocatively crossing the boundaries of accepted behaviour.  -- The Guardian (Sep 30, 2010)"),
                new SimpleList("nonconformity","failure to follow accepted standards of behavior","What society really cares for is harmony; what it dislikes is dissent and nonconformity.  -- Hamerton, Philip Gilbert"),
                new SimpleList("nondescript","lacking distinct or individual characteristics","The centre's own director, Robert Goodman, has described it as  nondescript and characterless.  -- The Guardian (Jul 16, 2010)"),
                new SimpleList("nonentity","a person of no influence","The rest were nonentities, the set who drift through their six years, making no mark, hurting no one, doing little good.  -- Waugh, Alec"),
                new SimpleList("nonetheless","despite anything to the contrary","But these researchers, working in relative obscurity, nonetheless have documented rich and surprisingly diverse communities of organisms in the deep sea.  -- New York Times (Mar 27, 2012)"),
                new SimpleList("nonpareil","colored beads of sugar used as a topping","While the last icing is wet, ornament it with coloured sugar-sand or nonpareils.  -- Leslie, Eliza"),
                new SimpleList("nonplus","be a mystery or bewildering to","This incredible patience, so little in harmony with Martial's usual demeanour, puzzled and nonplussed his aggressors, who looked at each other with amazement.  -- Sue, Eug�ne"),
                new SimpleList("nonplussed","filled with bewilderment","I shook my head and rushed from his presence, completely nonplussed, bewildered, frantic.  -- Cole, E. W. (Edward William)"),
                new SimpleList("nonsensical","having no intelligible meaning","Talking nonsensically is the utterance of words which contradict each other, or which have no meaning, and the like.  -- Acharya, Madhava"),
                new SimpleList("normative","relating to or dealing with norms","Ethics again is concerned with a norm of life, and in this sense it is frequently styled a normative science.  -- Alexander, Archibald B. C."),
                new SimpleList("nostalgia","longing for something past","The sense of exile was almost gone, the nostalgia for his own land no longer keen.  -- Hayward, Rachel"),
                new SimpleList("nostalgic","unhappy about being away and longing for familiar things","Britain, to take one example, habitually wallows in a nostalgic and misleading version of its own past.  -- Economist (Apr 8, 2010)"),
                new SimpleList("nostrum","patent medicine whose efficacy is questionable","These efforts are such conspicuous failures that even the patent medicine man has not found his anti-fat nostrums the happy means to fortune.  -- Dewey, Edward Hooker"),
                new SimpleList("notable","worthy of notice","The Web is all about serendipity--people passing along things that are interesting or notable.  -- Slate (Apr 13, 2012)"),
                new SimpleList("notice","discover or determine the existence, presence, or fact of","The new words came about after the Roger noticed people weren't really singing along to the traditional national anthem.  -- Children's BBC (May 2, 2012)"),
                new SimpleList("notion","a vague idea in which some confidence is placed","The notion that Wall Street needs regulatory relief--rather than greater structural reform--is simply wrong.  -- Slate (Mar 19, 2012)"),
                new SimpleList("notoriety","the state of being known for some unfavorable act or quality","But fear and frustration are on the rise in this small farming community, which has gained unwanted notoriety as Japan's radiation village.  -- New York Times (Apr 6, 2011)"),
                new SimpleList("notorious","known widely and usually unfavorably","The notorious Owen, as is well known, attempted the establishment of an Infidel community at New Harmony, in Indiana, and totally failed.  -- Caswall, Henry"),
                new SimpleList("nourish","give sustenance to","He who swallows abundantly does not digest it, and instead of being nourished and strengthened, he withers insensibly away.  -- Tissot, S. A. D. (Samuel Auguste David)"),
                new SimpleList("novel","an extended fictional work in prose","On Tuesday, Joyce Carol Oates returns to New Fiction shelves when her latest novel, Mudwoman, comes out in hardcover.  -- Time (Mar 19, 2012)"),
                new SimpleList("novelty","originality by virtue of being new and surprising","Yet they strove to gain novelty by inventing fresh situations, giving unexpected turns to dialogue, and varying their action on successive nights.  -- Gozzi, Carlo"),
                new SimpleList("novice","someone new to a field or activity","She speculated: A novice starting a running program will probably jog only two or three times a week, for 15 or 20 minutes.  -- Seattle Times (Dec 9, 2011)"),
                new SimpleList("noxious","injurious to physical or mental health","Investigators initially suspected customers fell ill to noxious fumes from cleaning chemicals.  -- Washington Post (Sep 15, 2011)"),
                new SimpleList("nuance","a subtle difference in meaning or opinion or attitude","Beyond those broad contours, Mr. Muti dealt in nuance, focusing on voicings and details that are often lost in Berlioz's narrative sweep.  -- New York Times (Apr 18, 2011)"),
                new SimpleList("nubile","(of young women) attractive and eligible to marry","Louise, who, although barely nubile, impatiently longed to become a mother, gave birth to her first child after four years of wedded life.  -- Saintsbury, George"),
                new SimpleList("nuclear","of or relating to or constituting the nucleus of an atom","He dove into mainstream topics, working on nuclear and particle physics at Harwell, Britain's civilian atomic energy research center.  -- Scientific American (Jan 30, 2012)"),
                new SimpleList("nugatory","of no real value","If the clause in question does not secure those political rights, it is entirely nugatory, and might as well have been omitted.  -- Anonymous"),
                new SimpleList("nuisance","anything that disturbs, endangers life, or is offensive","But opponents see the birds as a potentially noisy, smelly, predator-attracting nuisance at best, and a health threat at worst.  -- New York Times (Feb 7, 2012)"),
                new SimpleList("null","lacking any legal or binding force","Agreements that Turkey decides to sign with the occupied territories in Cyprus are without any meaning, null and void by definition, he said.  -- Washington Post (Sep 24, 2011)"),
                new SimpleList("nullify","declare invalid","It was announced yesterday that Osayomi has been stripped of her gold medal, and all her results in the Games have been nullified.  -- The Guardian (Oct 13, 2010)"),
                new SimpleList("numismatist","a collector and student of money","The coins, however, are assigned by at least one numismatist to a later date.  -- New, E. H. (Edmund Hort)"),
                new SimpleList("nuptial","of or relating to a wedding","Bates was to escort her on the nuptial journey, and all arrangements for the wedding of the distinguished pair had been completed.  -- Rockwell, Norman"),
                new SimpleList("nuptials","the social event at which the marriage ceremony is performed","Atalanta could now no longer refuse to marry, and her nuptials were soon celebrated.  -- Guerber, H. A. (H?l?ne Adeline)"),
                new SimpleList("nursery","a child's room for a baby","In Germany, the biggest economy in Europe, most schools still finish at lunchtime, and full-time nurseries for children under 3 are scarce.  -- New York Times (Jul 20, 2010)"),
                new SimpleList("nurture","help develop, help grow","But unlike most boys they nurtured and cultivated the passion and it stayed with them to manhood.  -- Abbot, Willis J. (Willis John)"),
                new SimpleList("nutrient","any substance that can be metabolized to give energy","Meat provides nutrients runners need like iron to help maintain energy levels.  -- Washington Post (Apr 2, 2012)")

        };

        //ListAdapter listAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,simpleList);

        ListAdapter listAdapter=new CustomAdapter_n(this,simpleList);

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

                        Intent i=new Intent(n_main.this,Details.class);
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
                String str="n";
                Intent in = new Intent(n_main.this, quizStats.class);
                in.putExtra("val",str);
                startActivity(in);

            }catch (Exception ex){
                new AlertDialog.Builder(n_main.this).setMessage(""+ex).show();
            }

            return true;
        }else if(id == R.id.action_search){
            // get prompts.xml view
            LayoutInflater layoutInflater = LayoutInflater.from(n_main.this);
            View promptView = layoutInflater.inflate(R.layout.input_dialog, null);
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(n_main.this);
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
                                        new AlertDialog.Builder(n_main.this).setTitle(simpleList[i].words+"                        ").setMessage(simpleList[i].meanings+"    \n").show();
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
                                    new AlertDialog.Builder(n_main.this).setTitle("Word List: Oops                           ").setMessage("Word not in out database \n").show();

                                }

                            }catch (Exception ex)
                            {
                                new AlertDialog.Builder(n_main.this).setTitle("Error").setMessage(""+ex).show();
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
                String val="n";
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
                                    String str="n";
                                    Intent in = new Intent(n_main.this, quiz.class);
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
