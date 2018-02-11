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
public class m_main extends ActionBarActivity {
    // private TextView resultText;
    private ListView myList;
    SimpleList simpleList[];
    DatabaseHelper2 db2;
    List<StudentsModel2> list2=new ArrayList<StudentsModel2>();
    // private ArrayList<SimpleList> alist=new ArrayList<SimpleList>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m_main);

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
                new SimpleList("macabre","shockingly repellent; inspiring horror","Thus was uncovered one of history's most macabre bouts of serial killing.  -- New York Times (Oct 9, 2011)"),
                new SimpleList("machination","a crafty and involved plot to achieve your ends","With life experiences like those behind her, the extreme plot machinations of Hollywood melodrama must have possessed an everyday familiarity for Stanwyck.  -- New York Times (Apr 24, 2010)"),
                new SimpleList("maculate","spot, stain, or pollute","It fell upon their faces, touching their whiteness with a ruddy tinge, accentuating the stains with which so many of them were freaked and maculated.  -- Bierce, Ambrose"),
                new SimpleList("maelstrom","a powerful circular current of water","The entire bowl was now a maelstrom of swirling bodies, legs and arms.  -- Browne, Howard"),
                new SimpleList("magnanimous","noble and generous in spirit","She will love to dwell on that large, generous, magnanimous, open, forgiving heart.  -- Various"),
                new SimpleList("magniloquent","lofty in style","The day was spent in magniloquent addresses, which affected the style of ancient types, urgent exhortations to war, poetical orations, rounds of applause, rapturous demonstrations.  -- Dawson, neas MacDonell"),
                new SimpleList("magnitude","the property of relative size or extent","But an aftershock of almost the same magnitude, less deep that the first quake, hit soon after he finished speaking.  -- Chicago Tribune (Apr 11, 2012)"),
                new SimpleList("maim","injure or wound seriously and leave permanent disfiguration","Think of the maimed, the mutilated, the mangled!  -- Ingersoll, Robert Green"),
                new SimpleList("majestic","having or displaying great dignity or nobility","By-and-by the three temples loomed into view, standing in all their beauty on the barren waste, majestic, uninjured, extraordinary.  -- Woolson, Constance Fenimore"),
                new SimpleList("malady","any unwholesome or desperate condition","As with most of the infectious maladies, scarlet fever extended to the Western World through European shipping.  -- Various"),
                new SimpleList("malaise","physical discomfort, as mild sickness or depression","Sammy was placed on antibiotics in case a bacterial infection was causing his fever and malaise.  -- Seattle Times (Dec 19, 2011)"),
                new SimpleList("malapropism","misuse of a word by confusion with one that sounds similar","New words are eagerly seized; hence the malapropisms and solecisms so frequently made fun of, without appreciation of their cause.  -- Reynolds, Stephen Sydney"),
                new SimpleList("malevolent","wishing or appearing to wish evil to others","They are malevolent and murderous and may be summoned by black magic.  -- The Guardian (Dec 24, 2010)"),
                new SimpleList("malice","feeling a need to see others suffer","But it would have been easy enough to simply say that no malice was intended and she regretted if anyone was offended by the phrase.  -- Time (Jan 18, 2011)"),
                new SimpleList("malignant","dangerous to health","The latest growth is  most likely malignant,  Chvez conceded  aggressively so, medical experts are suggesting  leaving him  preparing to face the worst.   -- Time (Feb 27, 2012)"),
                new SimpleList("malingerer","someone shirking duty by feigning illness or incapacity","On the other hand, the malingerer may actually produce injuries on his person either to excite commiseration or to escape from work.  -- Robertson, W. G. Aitchison (William George Aitchison )"),
                new SimpleList("malleable","easily influenced","Laws are malleable, and courts can be purchased or influenced to a local's advantage.  -- New York Times (Dec 22, 2010)"),
                new SimpleList("manifestation","an indication of the existence of some person or thing","Nay, the process was going on within, though its visible manifestations may have ceased.  -- Various"),
                new SimpleList("manifold","many and varied; having many features or forms","Then, too, there are innumerable separate agencies, working in ways manifold and diverse.  -- Field, Henry M. (Henry Martyn)"),
                new SimpleList("manipulate","influence or control shrewdly or deviously","It says Google manipulated Safari users into believing they could permanently opt out of targeted advertising, when in reality they couldn't.  -- New York Times (Feb 17, 2012)"),
                new SimpleList("manumit","free from slavery or servitude","The slave, now free, would lay down his life for the man who has manumitted him.  -- Reid, Mayne"),
                new SimpleList("mar","render imperfect","This energetic and clear-textured approach allowed for plenty of striking details of percussion and phrasing, marred only by a few brass blemishes.  -- New York Times (Mar 10, 2012)"),
                new SimpleList("marital","of or relating to the state of marriage","In many jurisdictions, if your separately owned property increases in value during the marriage, that increase is also considered marital property.  -- Inc (May 25, 2010)"),
                new SimpleList("maritime","relating to ships or navigation","In any case, the report argues, international maritime law in theory obligates ships to come to the assistance of those in trouble at sea.  -- Time (Apr 17, 2012)"),
                new SimpleList("martyr","one who suffers for the sake of principle","Despite the pounding summer sun, Protesters turned out to demand justice for those killed during the revolution, who are seen as martyrs for democracy.  -- New York Times (Jul 1, 2011)"),
                new SimpleList("materialistic","marked by a desire for wealth and possessions","Moreover, in contrast to the dominant thinking of our age, which is materialistic, King's philosophy is spiritual and religious.  -- King, Basil"),
                new SimpleList("materialize","come into being; become reality","As ties warmed, the two countries discussed joint ventures, though most haven't materialized.  -- BusinessWeek (Feb 3, 2012)"),
                new SimpleList("maternal","characteristic of a mother","Maternal mortality rates are also high, with 85 women dying in childbirth for every 100,000 live births, Tidey said.  -- Reuters (Nov 1, 2011)"),
                new SimpleList("matriarchy","social organization in which a female is the family head","In effect, however, women owned the country and women governed it; suddenly the matriarchy existed.  -- Cox, Irving E."),
                new SimpleList("matrix","an enclosure within which something originates or develops","Today, Web music services are spread across the entire range of the price/convenience/permanence matrix.  -- New York Times (Jul 27, 2011)"),
                new SimpleList("maturation","the process of an individual organism growing organically","Again, that is a very fast maturation rate, making it efficient for breeding in the lab.  -- Scientific American (Dec 28, 2011)"),
                new SimpleList("maudlin","effusively or insincerely emotional","He detested the florid sentimentality of some other universities, the maudlin old grads singing of bright college years!  -- Canfield, Dorothy"),
                new SimpleList("maul","injure badly","Or if Sleepless in Seattle ended with Meg Ryan being graphically mauled to death by an escaped tiger.  -- The Guardian (Aug 13, 2010)"),
                new SimpleList("maven","someone who is dazzlingly skilled in any field","The Deadhead community boasts any number of recording engineers, lighting experts, rock video mavens, electronic technicians of all descriptions.  -- Sterling, Bruce"),
                new SimpleList("maverick","independent in behavior or thought","He's still the same maverick, independent spirit he has always been.  -- The Guardian (Jan 26, 2011)"),
                new SimpleList("mawkish","effusively or insincerely emotional","Herself full of mawkish sentimentality, her verses could not fail to be foolish, their whole impulse being the ambition that springs from self-admiration.  -- MacDonald, George"),
                new SimpleList("maxim","a saying that is widely accepted on its own merits","As we are hastily reading books and papers we continually come across maxims, epigrams, and short, pithy sayings that attract us.  -- McCarty, Louis Philippe"),
                new SimpleList("mayhem","violent and needless disturbance","Although some graffiti had already been removed, evidence of the previous night's mayhem was visible in broken display cases.  -- Chicago Tribune (Jan 30, 2012)"),
                new SimpleList("meager","deficient in amount or quality or extent","Prime Minister John Key said he was spreading his Marmite more thinly to stretch his meager and dwindling supply.  -- New York Times (Mar 21, 2012)"),
                new SimpleList("meander","to move or cause to move in a sinuous or circular course","That route turns out to be a long and meandering one, ending up at an ambiguous, or at least ambivalent, conclusion.  -- New York Times (Feb 3, 2012)"),
                new SimpleList("mediate","act between parties with a view to reconciling differences","The United States has waded into the conflict in recent months saying it was willing to mediate disputes between smaller countries and China.  -- New York Times (Nov 19, 2011)"),
                new SimpleList("melancholy","characterized by or causing or expressing sadness","I heard a melancholy murmuring, something like suppressed sighing and sobbing, with words between that I could not make out.  -- Palacio Vald?s, Armando"),
                new SimpleList("melee","a noisy riotous fight","The Washington Post said the melee broke out in the fourth quarter as members of both teams tackled and threw punches at one another.  -- Newsweek (Aug 18, 2011)"),
                new SimpleList("mellifluous","pleasing to the ear","There was much of this in our great man, whose voice became of the sweetest and most mellifluous key, as he bent before the peer.  -- Fitzgerald, Percy Hethrington"),
                new SimpleList("melodramatic","characteristic of acting or a stage performance","Its melodramatic characters striking theatrical postures are uninspiring, to put it mildly.  -- New York Times (Dec 10, 2010)"),
                new SimpleList("memorabilia","a record of things worth remembering","Construction workers on Thursday buried a stainless steel time capsule with memorabilia relating to President Franklin D. Roosevelt at Four Freedoms Park on Roosevelt Island.  -- New York Times (Apr 13, 2012)"),
                new SimpleList("menace","express a threat either by an utterance or a gesture","And raising her stick in her shaking hand, she made a gesture so menacing that, fearing she would strike him, my lord stepped back.  -- Weyman, Stanley J."),
                new SimpleList("menagerie","a collection of live animals for study or display","If my cell were big enough, I should walk round and round as I have seen the caged animals do in menageries.  -- Osborne, Thomas Mott"),
                new SimpleList("mendacious","intentionally untrue","He is tempted to make ambiguous statements; pledges, with secret passages of escape; contracts, with fraudulent constructions; lying excuses, and more mendacious promises.  -- Beecher, Henry Ward"),
                new SimpleList("mendicant","a pauper who lives by begging","In others are the broken-down mendicants who live on soup-kitchens and begging.   -- Ritchie, J. Ewing (James Ewing)"),
                new SimpleList("menial","used of unskilled work, especially domestic work","He can always get work at unskilled manual labour, or personal or domestic service--in other words, at menial employment.  -- Grayson, David"),
                new SimpleList("mercantile","relating to or characteristic of trade or traders","But external trade is regulated by governments on the principles of the mercantile system.  -- Various"),
                new SimpleList("mercenary","a person hired to fight for another country than their own","The Expendables revolves around a group of mercenaries hired to overthrow a South American dictator.  -- Reuters (Aug 13, 2010)"),
                new SimpleList("mercurial","liable to sudden unpredictable change","Wind energy is notoriously mercurial, with patterns shifting drastically over the course of years, days, even minutes.  -- Scientific American (Jan 4, 2012)"),
                new SimpleList("meretricious","tastelessly showy","Education and extensive reading have preserved them from faults of gaudiness and meretricious ornament.  -- Various"),
                new SimpleList("mesmerize","attract strongly, as if with a magnet","The range of Ms. Traor's performance as Barbary -- her rich and mesmerizing voice, regal bearing and fluid movement -- has enchanted critics.  -- New York Times (Oct 25, 2011)"),
                new SimpleList("metamorphosis","striking change in appearance or character or circumstances","In the film Nina goes through a metamorphosis onstage, from sweet swan to a thrashing, rabid, seething one, complete with feathers.  -- Seattle Times (Dec 2, 2010)"),
                new SimpleList("metaphor","a figure of speech that suggests a non-literal similarity","We kept coming back to a metaphor of a big-game hunter looking for  ideas  instead of animals.  -- Forbes (Aug 30, 2011)"),
                new SimpleList("metaphysical","highly abstract and overly theoretical","At the same time it is, when formulated, an abstract and metaphysical statement, which one cannot grasp at once, but to which one must grow.  -- Wiggin, Kate Douglas Smith"),
                new SimpleList("methodical","characterized by orderliness","Like most men who get through much work, Spencer was very methodical and orderly.  -- Thomson, J. Arthur (John Arthur)"),
                new SimpleList("meticulous","marked by precise accordance with details","Kuhn kept meticulous records, documenting all paintings, exhibits and sales.  -- Reuters (Oct 6, 2011)"),
                new SimpleList("mettle","the courage to carry on","That was a task which tried their mettle, but once met and overcome, it fortified their courage to meet other ordeals.  -- Adams, Andy"),
                new SimpleList("microcosm","a miniature model of something","In some ways what is playing out in this Ulster County town is a more colorful microcosm of affordable housing controversies elsewhere.  -- New York Times (Sep 14, 2011)"),
                new SimpleList("mien","dignified manner or conduct","Then Essex, majestic in mien and regal-looking in demeanour, and seeming to carry on his dress the cost of whole manors.  -- Curling, Henry"),
                new SimpleList("migration","the periodic passage of groups of animals","Wheatears complete this 14,500 kilometer journey in nearly 90 days, too, a marathon migration very rare for such little birds.  -- Science Magazine (Feb 15, 2012)"),
                new SimpleList("milieu","the environmental condition","Adams is particularly good at capturing the rivalries, power struggles and pecking order in the newsroom, a milieu she knows intimately.  -- New York Times (Feb 19, 2010)"),
                new SimpleList("militant","a reformer disposed to warfare or hard-line policies","Militants holed up in a tall building were firing rockets in different directions, according to an Associated Press reporter at the scene.  -- Time (Apr 15, 2012)"),
                new SimpleList("minion","a servile or fawning dependant","They were common clay, mere ephemeral puppets, without hope of command, minions to take orders, necessary evils in an age of mechanism and high-speed commerce.  -- McFee, William"),
                new SimpleList("minuscule","very small","The isotopes detected in Western states have been found in minuscule amounts, officials say, much too small to threaten health.  -- Forbes (Mar 28, 2011)"),
                new SimpleList("mirth","great merriment","At times he was as silent and mysterious as the sphinx, at other times brimming over with mirth and merriment.  -- Hocking, Silas K. (Silas Kitto)"),
                new SimpleList("misanthrope","someone who dislikes people in general","The misanthropes pretend that they despise humanity for its weakness.  -- Chesterton, G. K. (Gilbert Keith)"),
                new SimpleList("misconstrue","interpret in the wrong way","Unconsciously and boy-like, he did things which were often misconstrued as downright badness, whereas the boy had not the slightest intention of doing anything wrong.  -- Cody, H. A. (Hiram Alfred)"),
                new SimpleList("miscreant","a person without moral scruples","Among such characters there will be miscreants capable of any crime, and therefore there is always danger.  -- Forester, Thomas"),
                new SimpleList("misnomer","an incorrect or unsuitable name","Boiled custard is rather a misnomer as on no account must the boiling point be reached in cooking, for if the custard bubbles it curdles.  -- McClure, Mary Jane"),
                new SimpleList("mitigate","lessen or to try to lessen the seriousness or extent of","Affliction is allayed, grief subsides, sorrow is soothed, distress is mitigated.  -- Webster, Noah"),
                new SimpleList("mnemonic","of or relating to the practice of aiding the memory","He was able to beef up his memory by learning mnemonic techniques.  -- Scientific American (Mar 25, 2011)"),
                new SimpleList("modest","limited in size or scope","For women's coaches, however, third-party funds are modest, if they exist at all.  -- New York Times (Apr 3, 2012)"),
                new SimpleList("modicum","a small or moderate or token amount","He volunteered a modicum of advice, limited in quantity, but valuable. -- Bolderwood, Rolf"),
                new SimpleList("mollify","cause to be more favorably inclined","Some cups of very good coffee had somewhat mollified him, and he came out smiling and talking in tolerably restored humor.  -- Child, Lydia Maria Francis"),
                new SimpleList("momentous","of very great significance","By this momentous act Lewis XVI., without being conscious of its significance, went over to the democracy.  -- Figgis, John Neville"),
                new SimpleList("monetary","relating to or involving money","The world's major central banks are opening up the monetary spigots once again, pumping new money into their economies to bolster growth.  -- Wall Street Journal (Feb 15, 2012)"),
                new SimpleList("moniker","a familiar name for a person","He has been going by his childhood moniker for so long, it is the only name most people know.  -- Seattle Times (Apr 10, 2012)"),
                new SimpleList("monolithic","characterized by massiveness and rigidity and uniformity","The two layers are placed within 10 minutes of each other, the purpose being to secure a monolithic or one-piece slab.  -- Gillette, Halbert Powers"),
                new SimpleList("monotheism","belief in a single God","From that it passes on to monotheism, the belief in one God, who is the sole author and creator of the universe.  -- Stace, W. T. (Walter Terence)"),
                new SimpleList("monotonous","sounded or spoken in a tone unvarying in pitch","The old man stopped suddenly, having told all his story in a dull, monotonous voice, with little feeling and no dramatic display.  -- Allen, Grant"),
                new SimpleList("moot","of no legal significance, as having been previously decided","Emanuel also declined to say whether he will consider a write-in campaign -- a moot point if the high court deems him ineligible.  -- BusinessWeek (Jan 25, 2011)"),
                new SimpleList("moratorium","suspension of an ongoing activity","Drilling activity was suspended on June 12 under a moratorium the U.S. placed on exploration in waters deeper than 500 feet.  -- Washington Post (Feb 28, 2011)"),
                new SimpleList("morbid","suggesting the horror of death and decay","I have been attending a lot of funerals recently and this has brought back to the fore my morbid fascination with funerals.  -- BBC (Mar 30, 2010)"),
                new SimpleList("mores","the conventions embodying the fundamental values of a group","Societal attitudes toward servants are often shaped by ingrained mores about caste and class.  -- New York Times (Apr 5, 2012)"),
                new SimpleList("morose","showing a brooding ill humor","He was never jolly now, but always discontented, and generally querulous, morose, or violently angry.  -- Maxwell, W. B. (William Babington)"),
                new SimpleList("mortify","cause to feel shame","She could have wished that there should never be moonlight more, so shamed and mortified and humiliated did she feel.  -- Oliphant, Mrs. (Margaret)"),
                new SimpleList("motif","a design that consists of recurring shapes or colors","Mr. Dine's other recurring motifs -- hearts, tools and Venuses -- are scattered throughout the other galleries and the museum grounds.  -- New York Times (Apr 14, 2012)"),
                new SimpleList("motley","consisting of a haphazard assortment of different kinds","All sorts and conditions of men were represented in the huge and motley throng.  -- Brady, Cyrus Townsend"),
                new SimpleList("mull","reflect deeply on a subject","Thinkers like Aristotle have mulled over such questions for centuries, says philosopher Mark Vernon in the Magazine's series on modern ethical dilemmas.  -- BBC (Jan 25, 2011)"),
                new SimpleList("multitudinous","too numerous to be counted","Here, along the lines of multitudinous houses, up one street and down another, he wondered which of them might be occupied by her.  -- London, Jack"),
                new SimpleList("mundane","found in the ordinary course of events","But researchers say one thing has not changed and spans the divides - the temporary escape from the mundane routine of everyday life.  -- BBC (May 21, 2010)"),
                new SimpleList("munificent","very generous","My munificent, generous angel will come now and then, and from her cornucopia shower her gifts upon me.  -- Sienkiewicz, Henryk"),
                new SimpleList("mutiny","open rebellion against constituted authority","Slaves make insurrection; soldiers or sailors break out in mutiny; subject provinces rise in revolt.  -- Fernald, James Champlin"),
                new SimpleList("myriad","a large indefinite number","In this case, hundreds of drugs are involved, each with myriad approved uses in various animals.  -- New York Times (Apr 12, 2012)"),
                new SimpleList("mythical","based on or told of in traditional stories","Dating back to classical antiquity, Corinth was reputedly the home of Pegasus, the winged mythical horse.  -- Reuters (Jul 11, 2011)"),

        };

        //ListAdapter listAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,simpleList);

        ListAdapter listAdapter=new CustomAdapter_m(this,simpleList);

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

                        Intent i=new Intent(m_main.this,Details.class);
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
                String str="m";
                Intent in = new Intent(m_main.this, quizStats.class);
                in.putExtra("val",str);
                startActivity(in);

            }catch (Exception ex){
                new AlertDialog.Builder(m_main.this).setMessage(""+ex).show();
            }

            return true;
        }else if(id == R.id.action_search){
            // get prompts.xml view
            LayoutInflater layoutInflater = LayoutInflater.from(m_main.this);
            View promptView = layoutInflater.inflate(R.layout.input_dialog, null);
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(m_main.this);
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
                                        new AlertDialog.Builder(m_main.this).setTitle(simpleList[i].words+"                        ").setMessage(simpleList[i].meanings+"    \n").show();
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
                                    new AlertDialog.Builder(m_main.this).setTitle("Word List: Oops                           ").setMessage("Word not in out database \n").show();

                                }

                            }catch (Exception ex)
                            {
                                new AlertDialog.Builder(m_main.this).setTitle("Error").setMessage(""+ex).show();
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
                String val="m";
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
                                    String str="m";
                                    Intent in = new Intent(m_main.this, quiz.class);
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
