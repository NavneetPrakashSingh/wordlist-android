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
public class e_main extends ActionBarActivity {
    // private TextView resultText;
    private ListView myList;
    SimpleList simpleList[];
    DatabaseHelper2 db2;
    List<StudentsModel2> list2=new ArrayList<StudentsModel2>();
    // private ArrayList<SimpleList> alist=new ArrayList<SimpleList>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.e_main);

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
                new SimpleList("ebullient","joyously unrestrained","The piece opened with ebullient bursts of energy and color that scampered over harmonica drones played by one or more members.  -- New York Times (May 10, 2010)"),
                new SimpleList("eclectic","selecting what seems best of various styles or ideas","A former student of fine art, Mr Scruff's eclectic selections are accompanied by animations of the trademark potato people who humorously narrate his musical journey.  -- The Guardian (Aug 13, 2011)"),
                new SimpleList("edible","suitable for use as food","Nevertheless, hunger increased so much that many ventured out into woods along the river seeking edible roots, and with some success.  -- Spears, John R."),
                new SimpleList("edify","make understand","Then Miss Fairbairn held one of her little discourses, with which now and then she endeavoured to edify her pupils.  -- Warner, Susan"),
                new SimpleList("efface","remove by or as if by rubbing or erasing","Her rich beauty was wiped out as an acid-soaked sponge might efface a portrait.  -- Terhune, Albert Payson"),
                new SimpleList("effervescent","marked by high spirits or excitement","When he ran for president, Barack Obama's effervescent campaign was about hope, optimism, national unity, and, above all, the future.  -- Newsweek (May 17, 2010)"),
                new SimpleList("effulgent","radiating or as if radiating light","Ere another year be passed, we hope to see its effulgent rays light up all the dark corners of our land.  -- Cutter, Orlando P."),
                new SimpleList("egalitarian","favoring social equality"," We are living in an egalitarian society where everyone is equal,  he said.  -- BusinessWeek (Dec 2, 2011)"),
                new SimpleList("egotistical","having an inflated idea of one's own importance","I have lived an entirely egotistical life, for myself alone.  -- The Guardian (Jan 3, 2011)"),
                new SimpleList("egregious","conspicuously and outrageously bad or reprehensible"," His comments were so egregious, naturally advertisers will have doubts about being associated with Limbaugh's brand of hate,  Mr. Boehlert said in an e-mail message.  -- New York Times (Mar 5, 2012)"),
                new SimpleList("elated","full of high-spirited delight","Young Barry returned from his parting walk with his brother in high spirits, elated with hope, and better both in mind and body.  -- Cobbold, Richard"),
                new SimpleList("eloquent","expressing yourself readily, clearly, effectively","But, so far as the best selection of words, the clearest style, the most coherent and convincing argument can constitute eloquence, Mill's speeches are eloquent.  -- McCarthy, Justin"),
                new SimpleList("elucidate","make clear and comprehensible","Improving the understanding of why tissues in bar-headed geese are so adept at taking up oxygen might elucidate human respiration as well. -- Scientific American (Nov 5, 2011)"),
                new SimpleList("elude","escape, either physically or mentally","Gregory Standifer was arrested at the scene after allegedly attempting to elude police by jumping out of a window, police said.  -- Chicago Tribune (Sep 4, 2011)"),
                new SimpleList("elusive","skillful at evading capture","They are an elusive lot and Don Ramon would soon wear out his troops hunting them in the bush.  -- Bindloss, Harold"),
                new SimpleList("emancipate","free from slavery or servitude","The Civil War came to an end, leaving the slave not only emancipated but endowed with the full dignity of citizenship.  -- Elliott, Maud Howe"),
                new SimpleList("embellish","make more attractive, as by adding ornament or color","At Saks, reedy shapes and flared minis, and more vanguard looks like Marc Jacobs's sports-inspired skirts embellished with a racing stripe, are projected best sellers.  -- New York Times (Mar 21, 2012)"),
                new SimpleList("embody","represent in bodily form","He was a can-do optimist who, despite many years in the environs of Hollywood, identified with and embodied American values.  -- New York Times (Jan 29, 2012)"),
                new SimpleList("embryonic","of an organism prior to birth or hatching","Human embryonic stem cells typically come from fertilized eggs.  -- Scientific American (Nov 4, 2011)"),
                new SimpleList("eminent","standing above others in quality or position","The daring aviator was heartily congratulated again by the President and other eminent men who thronged about him.  -- Galbreath, C. B. (Charles Burleigh)"),
                new SimpleList("emphatic","forceful and definite in expression or action","Miss Penny repeated my question in her loud, emphatic voice.  -- Huxley, Aldous"),
                new SimpleList("empirical","derived from experiment and observation rather than theory","So far, no one has reported empirical evidence from real city-traffic data that the transition Kerner predicted actually occurs, Davis pointed out.  -- US News (Oct 18, 2011)"),
                new SimpleList("emulate","strive to equal or match, especially by imitating","People in the technology field described Mr. Jobs as someone they could only look up to -- and try to emulate.  -- New York Times (Oct 6, 2011)"),
                new SimpleList("enamor","attract","Not long ago I fell in love, But unreturned is my affection-- The girl that I'm enamored of Pays little heed in my direction.  -- Morley, Christopher"),
                new SimpleList("encumber","hold back","Two others were making slower progress for the reason that each was encumbered by supporting a disabled man.  -- Westerman, Percy F. (Percy Francis)"),
                new SimpleList("endearing","lovable especially in a childlike or naive way"," They have goofy and lovable personalities that are incredibly endearing,  she said.  -- New York Times (Nov 23, 2011)"),
                new SimpleList("endeavor","attempt by employing effort","A few men endeavored to win popularity by pursuing a few others, and thus far they have been conspicuous failures.  -- Ingersoll, Robert Green"),
                new SimpleList("endemic","of a disease constantly present in a particular locality","An endemic disease, due to local causes and spreading by intercommunication.  -- Various"),
                new SimpleList("enigma","something that baffles understanding and cannot be explained","Tails are often an enigma; many creatures have them, but scientists know little about their function, particularly for extinct species.  -- Science Magazine (Jan 4, 2012)"),
                new SimpleList("enmity","a state of deep-seated ill-will","He looked at the young man with enmity, while his face every day grew harder, more angry, and stern, like iron.  -- Lathrop, George Parsons"),
                new SimpleList("ennui","the feeling of being bored by something tedious"," You are in the Land of Pleasure, and in yonder castle lives a horrid Giant called Ennui, who bores everybody he catches to death.   -- Taylor, Bert Leston"),
                new SimpleList("enthrall","hold spellbound","But despite the bottomless spate of new Housewives series that Bravo keeps trotting out, the Real Housewives franchise still fascinates and enthralls me.  -- Salon (Oct 4, 2010)"),
                new SimpleList("entice","provoke someone to do something through persuasion","My new acquisition, Boy, insisted on being petted, and his winning and enticing ways are irresistible.  -- Bird, Isabella L. (Isabella Lucy)"),
                new SimpleList("entomology","the branch of zoology that studies insects","From the department of entomology you expect to learn something about the troublesome insects, which are so universal an annoyance.  -- Latham, A. W."),
                new SimpleList("entreat","ask for or request earnestly","Let me go now, please, she entreated, her eyes unable to meet his any longer.  -- Hope, Anthony"),
                new SimpleList("entrepreneur","someone who organizes a business venture","Mr. Boehner said it would be  good news for entrepreneurs and aspiring small businesspeople struggling to overcome government barriers to job creation.   -- New York Times (Apr 6, 2012)"),
                new SimpleList("enumerate","determine the number or amount of","The houses in this street are not enumerated beyond forty-five, all told.   -- Allbut, Robert"),
                new SimpleList("enunciate","express or state clearly","On the second floor, kindergarten children stand together in a circle, clapping while learning how to enunciate different words.  -- New York Times (Dec 31, 2011)"),
                new SimpleList("ephemeral","anything short-lived, as an insect that lives only for a day","Such larger political structures as the tyrants of Syracuse built up by the subjugation of other cities were purely ephemeral, barely outliving their founders.  -- Boak, Arthur Edward Romilly"),
                new SimpleList("epiphany","a divine manifestation","But at least he's acting as the father of his child, and that, rather than any epiphany or miraculous transformation, is the point.  -- Salon (Dec 21, 2010)"),
                new SimpleList("epitome","a standard or typical example","Ms. Netrebko, in particular, riveted all eyes and ears, the epitome of star-crossed glamour in her black bob and sick-rose-red cocktail dress.  -- New York Times (Dec 26, 2010)"),
                new SimpleList("epoch","a period marked by distinctive character","The best authorities put the climax of the last glacial epoch between twenty-five and thirty thousand years ago.  -- Huntington, Ellsworth"),
                new SimpleList("equestrian","of or relating to or featuring horseback riding","While some racehorses peak in their younger years and move on to breeding, equestrian horses tend to be older and require complex training.  -- Seattle Times (Jan 20, 2012)"),
                new SimpleList("equitable","fair to all parties as dictated by reason and conscience","I suggested, as a more equitable adjustment, an equal division of profits; and to that Mr. Gye at last agreed.  -- Mapleson, James H."),
                new SimpleList("equivocate","be deliberately ambiguous or unclear","Beaten in the open field, the church began to equivocate, to evade, and to give new meanings to inspired words.  -- Ingersoll, Robert Green"),
                new SimpleList("eradicate","kill in large numbers","Some people are misusing poisonous chemicals in a desperate bid to eradicate the pests, federal officials said Thursday.  -- New York Times (Sep 23, 2011)"),
                new SimpleList("erode","become ground down or deteriorate","Prime Minister Silvio Berlusconi lost his absolute majority in the Italian parliament in a vote today on last year's budget, further eroding his authority.  -- BusinessWeek (Nov 8, 2011)"),
                new SimpleList("erratic","liable to sudden unpredictable change","The U.S. officials stressed that North Korea's past behavior has been notoriously erratic, making predictions about its intentions difficult.  -- Washington Post (Dec 19, 2011)"),
                new SimpleList("erudite","having or showing profound knowledge","In countless deft, darting, erudite essays, it has enabled him to explain the unexpected continuities and awkward breaks of literary history.  -- The Guardian (Jul 4, 2010)"),
                new SimpleList("eschew","avoid and stay away from deliberately","Vegans eschew all animal products, including dairy and eggs, so their iodine sources may be few.  -- Reuters (Jan 17, 2012)"),
                new SimpleList("esoteric","understandable only by an enlightened inner circle","But researchers can get lost in their genius, drilling into ever more esoteric questions.  -- Scientific American (Feb 7, 2012)"),
                new SimpleList("etymology","a history of a word","Its  suggested  etymology or word origin is Latin serpens meaning  a snake  and French sortir meaning  come out of, to leave.   -- New York Times (May 17, 2010)"),
                new SimpleList("euphemism","an inoffensive expression substituted for an offensive one","It is an oddly polite term--a euphemism--that conceals varying degrees of fear, loathing, and admiration.  -- New York Times (Mar 30, 2010)"),
                new SimpleList("euphoria","a feeling of great elation","Popular euphoria and joy at their leaders' departure has given way to frustration, grievance and fear.  -- Reuters (Dec 22, 2011)"),
                new SimpleList("evanescent","tending to vanish like vapor","Time seems stopped but it is moving on, and every glimmer of light is evanescent, flitting.  -- The Guardian (Apr 15, 2010)"),
                new SimpleList("evasive","deliberately vague or ambiguous","I anticipated finding them deceitful and evasive: furtive people, wandering in devious ways and disappearing into mysterious houses, at dead of night.  -- Street, Julian"),
                new SimpleList("evince","give expression to","Together, the performers evince an easy, humorous energy, like affectionate but mischievous siblings.  -- New York Times (Mar 16, 2012)"),
                new SimpleList("evoke","call forth, as an emotion, feeling, or response","Tropical fish tanks in restaurants, hospitals and homes evoke feelings of tranquility and beauty.  -- Scientific American (Apr 6, 2012)"),
                new SimpleList("evolve","undergo development","In its 166+ year history, Scientific American has changed and evolved in different directions many times.  -- Scientific American (Apr 2, 2012)"),
                new SimpleList("exacerbate","make worse","Politicians have argued that further austerity will only exacerbate the country's economic death spiral by deepening its worse than expected recession.  -- The Guardian (Feb 12, 2012)"),
                new SimpleList("exalt","fill with sublime emotion","But this woman's beauty was glorified by eyes that spoke of exalted thoughts, passionate longings, lofty emotions.  -- Hocking, Joseph"),
                new SimpleList("excavate","recover through digging","With many of Caligula's monuments destroyed after he was killed by his Praetorian guard at 28, archaeologists are eager to excavate for his remains.  -- The Guardian (Jan 17, 2011)"),
                new SimpleList("excoriate","express strong disapproval of","The landlord had another excoriating remark, which he might have flung at the young man and finished him up, but he magnanimously forbore.  -- Bouton, John Bell"),
                new SimpleList("exculpate","pronounce not guilty of criminal charges","Stepan did not try to exculpate himself, and bore patiently his sentence which was three days in the punishment-cell, and after that solitary confinement.  -- Tolstoy, Leo, graf"),
                new SimpleList("execrate","curse or declare to be evil or anathema","Even the crimes of monsters, whom we execrate, are to be traced to madness and intoxication, more than to natural fierceness and wickedness.  -- Lord, John"),
                new SimpleList("exemplify","clarify by giving an illustration of","He brought up reality television -- specifically, the garish sort of reality exemplified by Bravo's  Real Housewives  steamroller.  -- New York Times (Aug 27, 2011)"),
                new SimpleList("exhort","force or impel in an indicated direction","A proclamation was put up on shore, exhorting the people to keep quiet, attend to their avocations, and bring in presents as obedient subjects.  -- Lindley, Augustus F."),
                new SimpleList("existential","relating to or dealing with the state of being","Jindal, by contrast, has treated the spill as an existential threat, saying repeatedly that what's at stake is a way of life for us.  -- Washington Post (May 18, 2010)"),
                new SimpleList("exodus","a journey by a group to escape from a hostile environment","It said the flight of Christians to other parts of Iraq and abroad has become a slow but steady exodus.  -- BBC (Dec 17, 2010)"),
                new SimpleList("exonerate","pronounce not guilty of criminal charges"," He was, if not exonerated, never proven guilty,  Elizabeth Hecht said in an interview on Thursday.  -- New York Times (Feb 10, 2012)"),
                new SimpleList("exorbitant","greatly exceeding bounds of reason or moderation","Rents are exorbitant; but ordinary living and bad liquors are cheap.  -- Whymper, Frederick"),
                new SimpleList("expatiate","add details, as to an account or idea","He then expatiated on his own miseries, which he detailed at full length.  -- Manzoni, Alessandro"),
                new SimpleList("expatriate","a person who is voluntarily absent from home or country","She and Jack Hemingway, also known as Bumby, were toddlers at the time, living with their expatriate American parents in Paris.  -- New York Times (Mar 31, 2012)"),
                new SimpleList("expectation","anticipating with confidence of fulfillment","Every plan had proved abortive, every expectation been disappointed.  -- Headley, Joel Tyler"),
                new SimpleList("expectorate","discharge from the lungs and out of the mouth","No, they don't care to go, expectorating the tobacco juice from their mouths into the fire at the same time.  -- Various"),
                new SimpleList("expedient","a means to an end","In his youth he had apparently settled the problem once for all; but the solution then found was scarcely more than a temporary expedient.  -- Chinard, Gilbert"),
                new SimpleList("expedite","process fast and efficiently","First-class customers generally have access to priority check-in and boarding, expedited baggage service and faster security lines at some airports.  -- BusinessWeek (Aug 4, 2011)"),
                new SimpleList("expenditure","money paid out; an amount spent","Unless income also rises -- which isn't happening for many people now -- higher fuel costs will eventually displace other expenditures.  -- New York Times (Mar 3, 2012)"),
                new SimpleList("expiate","make amends for","Yes, I was so far guilty, and I make the confession in hopes that some portion of my errors may be expiated by repentance.  -- Various"),
                new SimpleList("explicit","precisely and clearly expressed or readily observable","Just as medical researchers once uncovered the link between cigarettes and lung cancer, researchers are now making the explicit connection between air pollution and asthma.  -- Time (Mar 29, 2012)"),
                new SimpleList("exploitation","an act that victimizes someone","But this profit rested on intensive exploitation and domination: whole families worked in the mills, including children.  -- Salon (Feb 17, 2011)"),
                new SimpleList("expository","serving to expound or set forth","Several characters are required to make long expository speeches in which the play's themes are clumsily disclosed.  -- The Guardian (Feb 24, 2011)"),
                new SimpleList("expulsion","the act of forcing out someone or something"," She is very near expulsion, not suspension,  said the principal, gravely.  -- Morrison, Gertrude W."),
                new SimpleList("expunge","remove by erasing or crossing out or as if by drawing a line","If he stays out of a trouble for a year the incident will be expunged from his record.  -- Seattle Times (Aug 4, 2010)"),
                new SimpleList("exquisite","delicately beautiful","Constance lifted up her exquisite voice untiringly, weaving her magic spell about her eager listeners.  -- Lester, Pauline"),
                new SimpleList("extant","still in existence; not extinct or destroyed or lost","She then wrote her last will, which is still extant, and consists of four pages, closely written, in a neat, firm hand.  -- Goodrich, Samuel G. (Samuel Griswold)"),
                new SimpleList("extemporaneous","with little or no preparation or forethought","His friends sometimes held an extemporaneous concert in his room, without preparation, programme, or audience.  -- Various"),
                new SimpleList("extend","stretch out over a distance, space, time, or scope","One map showed a runway system extending across 140 square meters and including 12 underground burrows.  -- Martin, Edwin P."),
                new SimpleList("extension","a delay in the date set for the completion of something","Chalk River's license expired last year, but it was given a single five-year extension; the Dutch reactor's lifetime is less certain but also limited.  -- New York Times (Feb 7, 2012)"),
                new SimpleList("extirpate","destroy completely, as if down to the roots","The last wolf was killed in Great Britain two hundred years ago, and the bear was extirpated from that island still earlier.  -- Marsh, George P."),
                new SimpleList("extol","praise, glorify, or honor","How I praised the duck at that first dinner, and extolled Madame's skill in cookery!  -- Warren, Arthur"),
                new SimpleList("extort","obtain by coercion or intimidation","An instrument of torture for the leg, formerly used to extort confessions, particularly in Scotland.  -- Webster, Noah"),
                new SimpleList("extraneous","not pertinent to the matter under consideration","As a general rule, he explained, rulings other than the one being honored had been removed as extraneous.  -- Slate (Feb 22, 2012)"),
                new SimpleList("extrapolate","draw from specific cases for more general cases","Earlier studies, extrapolating from recessions in the 1970s and 1980s, found larger effects.  -- BusinessWeek (Feb 27, 2012)"),
                new SimpleList("extricate","release from entanglement of difficulty","There was a prickly pear on top, the thorns of which caught him so that at first he could not extricate himself.  -- Reed, Helen Leah"),
                new SimpleList("extrinsic","not forming an essential part of a thing","There are no external or extrinsic influences--resulting from weariness or interruption.  -- Hamilton, Clayton Meeker"),
                new SimpleList("extrovert","a person directed toward others as opposed to the self","The extrovert is the typical active; always leaning out of the window and setting up contacts with the outside world.  -- Underhill, Evelyn"),
                new SimpleList("exuberant","joyously unrestrained","All these prose works were marked by an exuberant, vivid, poetic, impassioned style.  -- Lowell, James Russell"),
                new SimpleList("exude","make apparent by one's mood or behavior","Rizzo said many prospects exude outward confidence but lack it inwardly.  -- New York Times (Mar 3, 2012)"),
                new SimpleList("exult","feel extreme happiness or elation","Like a soldier going into battle, exulted and fired by a high and lofty purpose, his heart sang within him.  -- Standish, Burt L.")

        };

        //ListAdapter listAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,simpleList);

        ListAdapter listAdapter=new CustomAdapter_e(this,simpleList);

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

                        Intent i=new Intent(e_main.this,Details.class);
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
                String str="e";
                Intent in = new Intent(e_main.this, quizStats.class);
                in.putExtra("val",str);
                startActivity(in);

            }catch (Exception ex){
                new AlertDialog.Builder(e_main.this).setMessage(""+ex).show();
            }

            return true;
        }else if(id == R.id.action_search){
            // get prompts.xml view
            LayoutInflater layoutInflater = LayoutInflater.from(e_main.this);
            View promptView = layoutInflater.inflate(R.layout.input_dialog, null);
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(e_main.this);
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
                                        new AlertDialog.Builder(e_main.this).setTitle(simpleList[i].words+"                        ").setMessage(simpleList[i].meanings+"    \n").show();
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
                                    new AlertDialog.Builder(e_main.this).setTitle("Word List: Oops                           ").setMessage("Word not in out database \n").show();

                                }

                            }catch (Exception ex)
                            {
                                new AlertDialog.Builder(e_main.this).setTitle("Error").setMessage(""+ex).show();
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
                String val="e";
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
                                    String str="e";
                                    Intent in = new Intent(e_main.this, quiz.class);
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
