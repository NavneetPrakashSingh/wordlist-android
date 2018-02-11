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
public class s_main extends ActionBarActivity {
    // private TextView resultText;
    private ListView myList;
    SimpleList simpleList[];
    DatabaseHelper2 db2;
    List<StudentsModel2> list2=new ArrayList<StudentsModel2>();
    // private ArrayList<SimpleList> alist=new ArrayList<SimpleList>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.s_main);

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
                new SimpleList("sacrilegious","grossly irreverent toward what is held to be sacred","Some say the artwork blurs the line between church and state; others consider it sacrilegious to have Mexico's patron saint pictured surfing. -- Seattle Times (Jun 8, 2011)"),
                new SimpleList("sacrosanct","must be kept sacred","After decades of being considered politically sacrosanct, why are homeowner mortgage write-offs suddenly on the chopping block?  -- Washington Post (Aug 12, 2011)"),
                new SimpleList("sagacious","acutely insightful and wise","The sagacious painter had a truer insight into this matter than most of our modern educationists.  -- Miller, Hugh"),
                new SimpleList("salubrious","promoting health","The air is extremely salubrious, and the place has long been remarkable for its freedom from epidemics.  -- Holdsworth, J. H."),
                new SimpleList("sardonic","disdainfully or ironically humorous","With unemployment in some parishes above 25 percent, sardonic bumper stickers entered state lore:  Last one out, turn off the lights.   -- New York Times (Aug 8, 2010)"),
                new SimpleList("satiate","fill to satisfaction","That means it's more effective at keeping your blood sugar levels stable, leaving you feeling satiated and less likely to start eating again hours later.  -- US News (Aug 23, 2010)"),
                new SimpleList("satirical","exposing human folly to ridicule","Inevitably there were instant faux feeds on Twitter with satirical commentary about Bin Laden's death, including Ghost Osama and Osama in Hell.  -- New York Times (May 2, 2011)"),
                new SimpleList("saturate","infuse or fill completely","The head was shockingly disfigured, battered by some heavy instrument, and the clothes were saturated with blood.  -- Various"),
                new SimpleList("scarce","deficient in quantity or number compared with the demand","Many Americans reside in food deserts--communities where retailers offering fresh food are scarce but fast-food restaurants and convenience stores selling prepared foods can abound.  -- Scientific American (May 13, 2012)"),
                new SimpleList("scathing","marked by harshly abusive criticism","You sickening little coward--you sneak, said Osmond, with scathing contempt.  -- Reynolds, Mrs. Baillie"),
                new SimpleList("schism","division of a group into opposing factions","After building a market worth at least $6 billion, fair trade is undergoing a schism, with Fair Trade USA splitting off.  -- BusinessWeek (Nov 3, 2011)"),
                new SimpleList("scion","a descendent or heir","Mr. Papandreou, a political scion whose father and grandfather were also prime ministers, took office late last year.  -- New York Times (Feb 7, 2010)"),
                new SimpleList("scornful","expressing extreme contempt","Mr. Gates also was scornful of the top deal makers:  Russian democracy has disappeared, and the government is an oligarchy run by the security services.   -- New York Times (Dec 29, 2010)"),
                new SimpleList("scrupulous","characterized by extreme care and great effort"," His films have a look, an ambience, a setting, that's very real because of his scrupulous attention to detail,  Mr. Jewison added.  -- New York Times (Aug 3, 2010)"),
                new SimpleList("scrutinize","examine carefully for accuracy","Days before Thanksgiving, AT&T's heavyweight lobbying team was busy setting up meetings with antitrust authorities scrutinizing the company's $39 billion acquisition of T-Mobile.  -- Washington Post (Dec 9, 2011)"),
                new SimpleList("seamless","perfectly consistent and coherent","String quartets, made up of four similar instruments that blend seamlessly and resonate together, are the thoroughbreds of chamber music.  -- New York Times (Apr 13, 2012)"),
                new SimpleList("secede","withdraw from an organization or communion","On the 3rd of November a revolution broke out at Panama, and the state seceded from Colombia and declared itself to be an independent republic.  -- Various"),
                new SimpleList("secession","formal separation from an alliance or federation","But southern Sudanese living in northern Sudan were more ambivalent -- 42 percent opted for unity and 58 percent for secession.  -- New York Times (Jan 21, 2011)"),
                new SimpleList("sedentary","requiring sitting or little activity","There is a growing body of research showing that very active women are less likely to develop breast cancer than their sedentary peers.  -- Reuters (Oct 27, 2010)"),
                new SimpleList("seditious","in opposition to a civil authority or government","If stones were thrown at the police and seditious cries were raised, it was no more than might be reasonably expected.  -- Froude, James Anthony"),
                new SimpleList("sedulous","marked by care and persistent effort","For something like eleven summers I've written things that aimed to teach Our careless mealy-mouth�d mummers To be more sedulous of speech.  -- Adams, Franklin P. (Franklin Pierce)"),
                new SimpleList("segregation","the act of keeping apart","In Malaysia, there is no gender segregation; women hold top positions in banks and other companies, and female university students now outnumber men.  -- New York Times (Nov 21, 2011)"),
                new SimpleList("semantics","the study of language meaning","Web semantics developers in recent years have trained computers to classify news topics based on intuitive keywords and recognizable names.  -- Scientific American (Jun 16, 2011)"),
                new SimpleList("seminal","containing seeds of later development","Branches, even trunks might bend and break, but the seminal roots sent up new shoots next season, which in another year, bore fruit scantily.  -- McCulloch-Williams, Martha"),
                new SimpleList("sentient","endowed with feeling and unstructured consciousness","Emotions and intelligence are connected with nerve structures in all sentient beings that we have experience and knowledge of.  -- Brooks, David Marshall"),
                new SimpleList("sentiment","a personal belief or judgment","Every American will read these works with national pride, and have his better feelings and sentiments enkindled and strengthened.--Western literary Messenger.  -- Headley, Joel Tyler"),
                new SimpleList("sequential","in regular succession without gaps","Nissan has taken on a more aggressive marketing approach in recent months in Brazil, where car sales have hit sequential records for four years.  -- Reuters (Mar 24, 2011)"),
                new SimpleList("sequester","set apart from others","Emerson says, The virtue of art lies in detachment, in sequestering one object from the embarrassing variety.  -- Carnagey, Dale"),
                new SimpleList("serendipity","good luck in making unexpected and fortunate discoveries","Serendipity is a recurring theme in Chandler's biography, with one happy accident after another pushing him in a certain direction.  -- The Guardian (Jul 11, 2011)"),
                new SimpleList("serenity","the absence of mental stress or anxiety","The serenity he doubtless enjoys as a Zen monk will probably help.  -- BBC (Jan 14, 2010)"),
                new SimpleList("sibylline","resembling or characteristic of a prophet or prophecy","Their Sibylline books have prophesied the fall of Rome, though they use the name 'Babylon.'  -- Strindberg, August"),
                new SimpleList("simian","relating to or resembling an ape","At least 10 large black-faced langur monkeys are being used at the Delhi Games venues to stop smaller simian monkeys from causing trouble.  -- Children's BBC (Oct 1, 2010)"),
                new SimpleList("simile","a figure of speech expressing a resemblance between things","Then he rushed away without saluting me, and looking as black as the ace of spades--that simile suits my present mood!  -- Fogazzaro, Antonio"),
                new SimpleList("simultaneous","occurring or operating at the same time","Supertaskers can juggle simultaneous tasks without experiencing a drop in attention or focus, which flies against the conventional wisdom about how the human brain functions.  -- Time (Apr 5, 2010)"),
                new SimpleList("slack","not tense or taut","He moved on down toward the cottonwoods and reaching them stood in their shadows, arms at his sides, shoulders slacked as if weakened, irresolute.  -- Titus, Harold"),
                new SimpleList("sobriety","the state of being sober and not intoxicated by alcohol","His lawyer Heather Boxeth has said O'Neal relapsed by drinking alcohol after five years of sobriety and was in rehab.  -- Seattle Times (Feb 4, 2012)"),
                new SimpleList("solace","comfort in disappointment or misery","Hurt/comfort stories revolve -- as you might imagine -- around one character's getting injured physically or emotionally and another character's providing solace.  -- Time (Jul 7, 2011)"),
                new SimpleList("solitude","a state of social isolation","Then, feeling that this sorrow required solitude, one after another slipped away, slowly, gently, and on tiptoe, leaving Helen alone with her husband's body.  -- Dumas, Alexandre"),
                new SimpleList("solvent","a liquid substance capable of dissolving other substances","The alchemist gave up his search for an universal solvent upon being asked in what kind of vessel he expected to keep it when found.  -- Ingersoll, Robert Green"),
                new SimpleList("somatic","characteristic of the body as opposed to the mind or spirit","Nature and the spiritual, without this embodied intelligence, this somatic being, called man or angel or ape, are as ermine on a wax figure.  -- Rihani, Ameen Fares"),
                new SimpleList("sophist","someone whose reasoning is subtle and often specious","This word comes from the Greek sophistes, meaning a sophist, that is to say, one who makes a pretence of being wise.  -- Tagore, Rabindranath"),
                new SimpleList("specious","plausible but false","You might be tempted to think of the biggest airline as the one with the most aircraft, but capacity differences make this reasoning specious.  -- Salon (May 7, 2010)"),
                new SimpleList("spectator","a close observer; someone who looks at something","More than 200 spectators watched aircraft take to the skies on Tuesday at Mona Airfield.  -- BBC (May 16, 2012)"),
                new SimpleList("spectrum","a broad range of related objects or values or qualities","Bisher covered a spectrum of sports -- including football, baseball, horse racing, auto racing and boxing -- that reflected the tastes of his Southern readership.  -- New York Times (Apr 5, 2012)"),
                new SimpleList("speculation","a message expressing an opinion based on incomplete evidence","He said the four conspiracy charges leveled at his client were supported by nothing but   speculation, innuendo and conjecture.   -- New York Times (Nov 1, 2011)"),
                new SimpleList("spontaneous","said or done without having been planned in advance","In his solo concerts since the 1970s, Mr. Jarrett has committed himself to spontaneous improvisation, to ideas that surface in the moment.  -- New York Times (Jan 17, 2011)"),
                new SimpleList("sporadic","recurring in scattered or unpredictable instances","Police have clamped down on demonstrations, and lingering unrest has been sporadic and scattered.  -- Salon (Jan 28, 2011)"),
                new SimpleList("spurious","plausible but false","Sedan.--No genuine stamps ever existed; all were spurious.  -- Johnson, Stanley Currie"),
                new SimpleList("spurn","reject with contempt","Saying that agents and publishers had spurned him 162 times, Mr. Wimmer laid claim to being the most-rejected published novelist in history.  -- New York Times (May 25, 2011)"),
                new SimpleList("squabble","a quarrel about petty points","There was trouble going on here and there, petty wars and political squabbles.  -- MacGrath, Harold"),
                new SimpleList("squalid","foul and run-down and repulsive","There was nothing but poverty-- squalid, disgusting poverty--visible everywhere, and Lucy grew sick and faint at the, to her, unusual sight.  -- Holmes, Mary Jane"),
                new SimpleList("squander","spend extravagantly","He laid up the money that he earned, instead of squandering it, as young men in his situation often do, in transient indulgences.  -- Various"),
                new SimpleList("stagnant","not growing or changing; without force or vitality","In that dull household, where so few events ever disturbed the stagnant quiet, this sudden journey produced an indescribable sensation.  -- Fleming, May Agnes"),
                new SimpleList("stagnate","stand still","Services, accounting for about three quarters of the economy, stagnated with zero growth.  -- BusinessWeek (Jan 25, 2012)"),
                new SimpleList("stalemate","a situation in which no progress can be made","But, in the end, nothing really gets resolved, nobody wins and the stalemate continues.  -- Washington Post (Dec 18, 2011)"),
                new SimpleList("stamina","enduring strength and energy","But these were searching days for everyone, when physical endurance and mental stamina were stretched to their furthest limit.  -- Wilson, S. J."),
                new SimpleList("statutory","prescribed or authorized by or punishable under law","We have eliminated the opposition down our way--perfectly legal and statutory.  -- Fitzgerald, Robert"),
                new SimpleList("steadfast","marked by firm determination or resolution; not shakable","Steadfast in his convictions and imperturbable under pressure, Mr. Miller was the ultimate iconoclast.  -- Wall Street Journal (Nov 18, 2011)"),
                new SimpleList("stoic","seeming unaffected by pleasure or pain; impassive","Then the typically stoic Green Bay Packers coach briefly lost his composure, pausing for several seconds as he choked up with emotion. -- Chicago Tribune (Jan 12, 2012)"),
                new SimpleList("stratification","the act of arranging persons into social classes","People were much the same, she thought, in every class; there was no stratification of either rightness or righteousness.  -- Wells, H. G. (Herbert George)"),
                new SimpleList("striate","mark with stripes of contrasting color","These white streaks give the bird the striated appearance from which it obtains its name.  -- Dewar, Douglas"),
                new SimpleList("stultify","deprive of strength or efficiency; make useless or worthless","Indian humanities and social sciences institutes have been neglected over the years -- stultified by curricular inflexibility, underfinanced and understaffed.  -- New York Times (Apr 8, 2010)"),
                new SimpleList("stupefy","make senseless or dizzy by or as if by a blow","For several seconds he remained standing quite motionless and breathless, staring in stupefied amazement at the dark outline of the enemy.  -- Gilson, Charles"),
                new SimpleList("subdue","put down by force or intimidation","Police officers surrounded the prison grounds while F.B.I. agents and guards tried to subdue the inmates, Sheriff Mayfield said.  -- New York Times (May 23, 2012)"),
                new SimpleList("subjugate","make subservient; force to submit or subdue","The ancient Romans ruled the world by subjugating the remotest nations, pillaging and breaking them down.  -- Garibaldi, Giuseppe"),
                new SimpleList("subliminal","below the threshold of conscious perception","If she was unhappy, her unhappiness lay too deep in subliminal abysses to struggle to the surface of her consciousness.  -- King, Basil"),
                new SimpleList("subordinate","lower in rank or importance","From the earliest times she was regarded as man's inferior and relegated to a subordinate position in society.  -- Zahm, John Augustine"),
                new SimpleList("subservient","compliant and obedient to authority","Ms. Greig, he said, is a meek, subservient woman whom Mr. Bulger ordered around.  -- New York Times (Jul 14, 2011)"),
                new SimpleList("subside","sink to a lower level or form a depression","Once more the waves had subsided, and an almost flat calm prevailed.  -- Westerman, Percy F. (Percy Francis)"),
                new SimpleList("subsidiary","functioning in a supporting capacity","A symbol has a chief meaning, and then various subsidiary meanings related to that chief meaning.  -- Besant, Annie Wood"),
                new SimpleList("subsistence","a means of surviving","But how avoid him while she had no other means of subsistence than working in an open shop?  -- Burney, Fanny"),
                new SimpleList("subversive","in opposition to a civil authority or government","The ideas of the French democracy were in the beginning revolutionary, disorderly, and subversive of national consistency and good faith.  -- Croly, Herbert David"),
                new SimpleList("successor","a person who inherits some title or office","Mr. Stewart has promised to stay on until a successor is hired.  -- New York Times (May 11, 2012)"),
                new SimpleList("succinct","briefly giving the gist of something","The intros to each posting are short, succinct, and witty.  -- BusinessWeek (Feb 14, 2012)"),
                new SimpleList("sully","make dirty or spotty, as by exposure to air","Burning coal sullies the atmosphere and leaves toxic ash mountains.  -- Scientific American (Mar 18, 2012)"),
                new SimpleList("summon","call in an official matter, such as to attend court","Bryce Harper batting seventh in major league debut had no clue why his Class AAA manager summoned him into his office Friday afternoon.  -- Washington Post (Apr 29, 2012)"),
                new SimpleList("sumptuous","rich and superior in quality","The city is rich in antiquities, in historic buildings associated with illustrious names, in works of art and in sumptuous palaces.  -- Hartley, C. Gasquoine (Catherine Gasquoine)"),
                new SimpleList("sundry","consisting of a haphazard assortment of different kinds","In the preparation of this book, old journals, original records and documents, and sundry other trustworthy sources have been diligently consulted and freely utilized.  -- Blaisdell, Albert F."),
                new SimpleList("superannuated","too old to be useful","Law and government must keep pace with the progress of humanity, else the nation itself becomes effete, superannuated, deteriorated.  -- Various"),
                new SimpleList("supercilious","having or showing arrogant superiority to","James is outrageously supercilious, arrogant, conceited and rude.  -- The Guardian (Sep 2, 2010)"),
                new SimpleList("supererogatory","more than is needed, desired, or required","Those arguments are not necessary, they are all supererogatory, like idle words.  -- Brady, Cyrus Townsend"),
                new SimpleList("superficial","of, affecting, or being on or near the surface","In uncivilised times, generally speaking, men were rather quick to observe outward and superficial distinctions, while very slow to discover internal and essential variations.  -- Hara, Katsuro"),
                new SimpleList("superfluous","more than is needed, desired, or required","He looked at them as if further talk were redundant, superfluous, unnecessary, a waste of time, and an insult.  -- Lefevre, Edwin"),
                new SimpleList("superimpose","place on top of","This time, the camera focused only on his face and in editing, his head would be digitally superimposed on Pence's body.  -- Reuters (Dec 31, 2010)"),
                new SimpleList("superlative","the form of an adjective or adverb ending in -est","Qatar's economy offers indicators in superlatives: the world's highest growth rate and highest per capita income.  -- New York Times (Nov 15, 2011)"),
                new SimpleList("supernatural","things that cannot be explained by physical laws","After vampires and shape shifters, now fairies are added to the fun supernatural mix.  -- The Guardian (May 19, 2012)"),
                new SimpleList("supersede","take the place or move into the position of","Comic books, the convention's original focus, have been superseded by movies, video games and action figures.  -- New York Times (Apr 12, 2012)"),
                new SimpleList("supple","readily adaptable","However, humanity is so flexible and supple that, in one way or another, it always overcomes these attempts at prevention.  -- White, Horace"),
                new SimpleList("supplementary","functioning in a supporting capacity","But, after all, these supplementary aids, though valuable, are deficient in guiding power.  -- Palmer, Alice Freeman"),
                new SimpleList("suppliant","one praying humbly for something","I realized the hopelessness of my cause, and found myself facing Mr. Blight again, an humble suppliant for his pardon.  -- Lloyd, Nelson"),
                new SimpleList("suppression","forceful prevention; putting down by power or authority","Bitterly, in blood and heartbreak and long suppression, they had been weighed down under superior force: but now the time of reprisals had come.  -- Reid, George"),
                new SimpleList("surfeit","indulge (one's appetite) to satiety","The law at last is satisfied, satiated, surfeited.  -- Ingersoll, Robert Green"),
                new SimpleList("surreal","characterized by fantastic and incongruous imagery","In this surreal world, music records smell like different colors, foods tastes like specific noises, and sound comes in all varieties of textures and shapes.  -- Scientific American (Feb 28, 2012)"),
                new SimpleList("surreptitious","marked by quiet and caution and secrecy","Truly, there had been some secret, surreptitious flittings in this old mansion.  -- Walk, Charles Edmonds"),
                new SimpleList("sustenance","a source of materials to nourish the body","Furs have renewed my clothing, and I have never wanted for sustenance--chiefly nuts, fruits and vegetables.  -- Paine, Albert Bigelow"),
                new SimpleList("sybaritic","displaying luxury and furnishing gratification to the senses","Ever since, the city has been ravishing visitors with its teeming souks, ornate palaces and sybaritic night life.  -- New York Times (Dec 23, 2010)"),
                new SimpleList("sycophant","a person who tries to please someone to gain an advantage","Sycophants climb over the wall--but their flattery and fawning grow tiresome.  -- Brisbane, Arthur"),
                new SimpleList("symmetry","balance among the parts of something","They all illustrate quaint melodic intervals and an instinct for balance and symmetry.  -- Spalding, Walter Raymond"),
                new SimpleList("synchronous","occurring or existing at the same time","Mrs. Smiley spoke almost at the same moment but never precisely synchronous with Wilbur's whisper.  -- Garland, Hamlin"),
                new SimpleList("synonymous","meaning the same or nearly the same","The two phrases seem synonymous, and might often be used indifferently; but here there is evidently a well marked diversity of meaning.  -- Maclaren, Alexander")

        };

        //ListAdapter listAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,simpleList);

        ListAdapter listAdapter=new CustomAdapter_s(this,simpleList);

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

                        Intent i=new Intent(s_main.this,Details.class);
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
                String str="s";
                Intent in = new Intent(s_main.this, quizStats.class);
                in.putExtra("val",str);
                startActivity(in);

            }catch (Exception ex){
                new AlertDialog.Builder(s_main.this).setMessage(""+ex).show();
            }

            return true;
        }else if(id == R.id.action_search){
            // get prompts.xml view
            LayoutInflater layoutInflater = LayoutInflater.from(s_main.this);
            View promptView = layoutInflater.inflate(R.layout.input_dialog, null);
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(s_main.this);
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
                                        new AlertDialog.Builder(s_main.this).setTitle(simpleList[i].words+"                        ").setMessage(simpleList[i].meanings+"    \n").show();
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
                                    new AlertDialog.Builder(s_main.this).setTitle("Word List: Oops                           ").setMessage("Word not in out database \n").show();

                                }

                            }catch (Exception ex)
                            {
                                new AlertDialog.Builder(s_main.this).setTitle("Error").setMessage(""+ex).show();
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
                String val="s";
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
                                    String str="s";
                                    Intent in = new Intent(s_main.this, quiz.class);
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
