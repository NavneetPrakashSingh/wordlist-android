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
public class i_main extends ActionBarActivity {
    // private TextView resultText;
    private ListView myList;
    SimpleList simpleList[];
    DatabaseHelper2 db2;
    List<StudentsModel2> list2=new ArrayList<StudentsModel2>();
    // private ArrayList<SimpleList> alist=new ArrayList<SimpleList>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.i_main);

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
                new SimpleList("iconoclast","someone who attacks cherished ideas or institutions","Jobs is a classic iconoclast, one who aggressively seeks out, attacks, and overthrows conventional ideas.  -- BusinessWeek (Oct 12, 2010)"),
                new SimpleList("idealistic","of high moral or intellectual value","Instructors, of all levels, are fundamentally idealistic people, motivated by a passion for helping the world's young billions achieve their human potential.  -- Forbes (Jan 24, 2012)"),
                new SimpleList("ideological","concerned with or suggestive of ideas","What was once an ideological abstraction --  austerity  -- will have very real effects on everyday life for average Americans.  -- Washington Post (Jul 30, 2011)"),
                new SimpleList("idiom","expression whose meaning cannot be inferred from its words"," Hand down, man down,  he said, repeating a favorite Jackson broadcasting idiom at a news conference Monday to introduce the Warriors' rookies for next season.  -- New York Times (Jun 29, 2011)"),
                new SimpleList("idiosyncrasy","a behavioral attribute peculiar to an individual","My roles in independent films have been fuller, chockablock with all sorts of human idiosyncrasies, kinks and foibles of humanity.  -- Reuters (Jan 20, 2011)"),
                new SimpleList("idle","silly or trivial","Sure, sir, they can know nothing about it; it's just idle talk, and no more.  -- Lever, Charles James"),
                new SimpleList("idyllic","charmingly simple and serene","The scene of this charming, idyllic love story is laid in Central Indiana.  -- Davis, Owen"),
                new SimpleList("ignominious","deserving or bringing disgrace or shame","The sentence passed upon them is that they die a shameful and ignominious death.  -- Hodgson, Edward S."),
                new SimpleList("illustrious","widely known and esteemed","The Trumbull family was the most illustrious in the state, embracing three governors and other distinguished men.  -- White, Horace"),
                new SimpleList("imbibe","take in liquids","For that little beast, having a severe cold, was given whisky-and-milk one day, and, imbibing too freely, became absolutely drunk.  -- Casserly, Gordon"),
                new SimpleList("imbroglio","an intricate and confusing interpersonal situation","And indeed his world is one huge imbroglio of Potentialities and Diplomatic Intricacies, agitating to behold.  -- Carlyle, Thomas"),
                new SimpleList("imminent","close in time; about to occur","He perceived the danger which he had so long warded off now instant and imminent.  -- Rosebery, Archibald Phillip Primrose"),
                new SimpleList("impaired","diminished in strength, quality, or utility"," Thinking could be slowed, attention dulled, judgement impaired, memory muddled.   -- Washington Post (Mar 12, 2012)"),
                new SimpleList("impartial","free from undue bias or preconceived opinions"," We are looking for people who can serve as fair, objective and impartial jurors.   -- Washington Post (Sep 14, 2011)"),
                new SimpleList("impasse","a situation in which no progress can be made","Unfortunately success also depends on an end to the impasse between America and China, whose trade relations seem stuck.  -- Economist (Aug 5, 2010)"),
                new SimpleList("impecunious","not having enough money to pay for necessities","It had been quite in keeping with his ideas that the Thornes should taste the bitters of poverty, and know what being impecunious really meant.  -- Fenn, George Manville"),
                new SimpleList("impediment","something immaterial that interferes with action or progress","He identified several chronic impediments to long-term progress in Brazil, too, including high tax rates, deficient transportation and other infrastructure and a poor education system.  -- New York Times (Apr 7, 2012)"),
                new SimpleList("impending","close in time; about to occur","Davis immediately began preparing food and snacks for his wife's impending arrival.  -- New York Times (Jul 23, 2011)"),
                new SimpleList("imperative","requiring attention or action","Though always important, safety becomes imperative when children are involved.  -- Inc (Jul 15, 2011)"),
                new SimpleList("imperceptible","impossible or difficult to sense","Only a faint, almost imperceptible tinge remained of the ink stains on her face.  -- Wells, Carolyn"),
                new SimpleList("imperious","having or showing arrogant superiority to","He was known as an imperious boss with little patience for weakness, one who launched blistering tirades that left subordinates fuming, or in tears.  -- Chicago Tribune (Oct 6, 2011)"),
                new SimpleList("impetuous","marked by violent force","There are times when all these Yorkshire rivers become impetuous torrents, roaring along in resistless might and majesty.  -- White, Walter"),
                new SimpleList("implicit","being without doubt or reserve","He was accustomed to implicit obedience and was not used to seeing men smile when he uttered a threat.  -- Marshall, Edison"),
                new SimpleList("implode","burst inward","As the graph shows, growth actually slowed and then the whole system imploded into a catastrophic crisis.  -- The Guardian (Jan 1, 2011)"),
                new SimpleList("implore","call upon in supplication","The poor woman continued to implore mercy; and coming nearer to the Lord, She fell down and worshipped him, saying, Lord, help me!  -- Ross, Lady Mary"),
                new SimpleList("imply","express or state indirectly","Smoothing planes are, as the name implies, used to simply smoothen the work surface after it has been trued.  -- Rose, Joshua"),
                new SimpleList("impregnable","immune to attack; incapable of being tampered with","At the same time, the United States would be safeguarded against internal dangers and made impregnable against attack or invasion by any foreign power.  -- Maxwell, George Hebard"),
                new SimpleList("impromptu","without advance preparation","Bauer proposed to Shourd while both were in prison, fashioning an impromptu ring out of threads from his shirt.  -- Washington Post (Nov 14, 2011)"),
                new SimpleList("impudence","the trait of being rude and impertinent","Ichikawa conceded that his arrogance and impudence may have brought on the attack, adding: I won't feel like having a drink for a while.  -- The Guardian (Dec 8, 2010)"),
                new SimpleList("impunity","exemption from punishment or loss","According to Amnesty, some groups of former rebels are committing human rights violations with impunity, unchecked by the interim government.  -- BBC (Feb 16, 2012)"),
                new SimpleList("inalienable","not subject to forfeiture","Men's natural rights are all inherent and inalienable; and therefore cannot be parted with, or delegated, by one person to another.  -- Spooner, Lysander"),
                new SimpleList("inane","devoid of intelligence","And then, again, his asking me his stupid, inane questions, as if I cared what man, and how many.  -- Hutcheson, John C. (John Conroy)"),
                new SimpleList("inanimate","belonging to the class of nouns denoting nonliving things","The moment when the first living beings arose from inanimate matter almost four billion years ago is still shrouded in mystery.  -- Scientific American (Oct 10, 2011)"),
                new SimpleList("inaugurate","commence officially","Continental has ordered 25 Dreamliners and plans to inaugurate them in November 2011 on new, nonstop flights to Auckland, New Zealand, and Lagos, Nigeria.  -- New York Times (Aug 25, 2010)"),
                new SimpleList("incarnation","time passed in a particular bodily form","When America Online came out, that was a very early incarnation of social networking with the instant messaging.  -- Reuters (Oct 1, 2010)"),
                new SimpleList("incendiary","a criminal who illegally sets fire to property","While there the depot was set on fire and burned down, supposed to be the work of an incendiary.  -- Terrill, J. Newton"),
                new SimpleList("inception","an event that is a beginning","They were confident this week, eager to show how much improvement the league has made since its inception in 1996.  -- Seattle Times (Jul 29, 2010)"),
                new SimpleList("inchoate","only partly in existence; imperfectly formed"," But when the law is unsettled, inchoate, undeveloped, let's say, it's natural that judges' political, social and economic views will shape how they see things.   -- New York Times (Dec 16, 2010)"),
                new SimpleList("incipient","only partly in existence; imperfectly formed","As yet, it is in an incipient stage of development and has by no means revealed its full power for evil.  -- Clark, John Bates"),
                new SimpleList("incite","provoke or stir up","He was arrested on charges including inciting a riot and disorderly conduct.  -- Seattle Times (Jun 16, 2011)"),
                new SimpleList("inclement","severe, of weather","Check with your business's insurance policy to make sure it covers any accidents on company property caused by inclement weather conditions.  -- Inc (Jan 31, 2011)"),
                new SimpleList("incognito","without revealing one's identity","Hitherto their security has depended on keeping up their incognito by disguises, and the secrecy of their camping place.  -- Reid, Mayne"),
                new SimpleList("incompetent","not qualified or suited for a purpose","The common people, especially in the villages, know nothing at all of Christian doctrine; and many pastors are quite unfit and incompetent to teach.  -- Just, Gustav"),
                new SimpleList("inconspicuous","not prominent or readily noticeable","Unless Socapa Castle, therefore, is so small and inconspicuous as to have escaped my notice, it must have fallen into ruins or been destroyed.  -- Kennan, George"),
                new SimpleList("incorrigible","impervious to correction by punishment","There are some, however, who maintain that the criminal is incorrigible and that reformatory agencies have invariably failed.  -- Kayll, James Leslie Allan"),
                new SimpleList("incredulous","not disposed or willing to believe; unbelieving","She looked puzzled, half incredulous and perplexed, inclined to smile, blushing somewhat, and all uncertain.  -- Black, William"),
                new SimpleList("increment","the amount by which something increases","The plan also called for quoting prices in decimals, doing away with the one-eighth increments that had long defined Wall Street math.  -- BusinessWeek (Feb 14, 2012)"),
                new SimpleList("incumbent","the official who holds an office","The Democratic incumbent faces no serious primary challenge and his re-election campaign already is well under way.  -- Time (Mar 25, 2012)"),
                new SimpleList("indelible","cannot be removed or erased","The paints were not indelible, consequently they could be easily removed and another application made as circumstances required.  -- Collins, Dennis"),
                new SimpleList("indemnity","protection against future loss","They should pay an indemnity to the state of Guatemala, not just apologize.   -- New York Times (Oct 2, 2010)"),
                new SimpleList("indenture","bind by a contract for work, as an apprentice or servant","Beneath both these classes were the indentured servants, a few of whom were men of ability forced to pay their passage by service.  -- Commons, John R. (John Rogers)"),
                new SimpleList("indifferent","marked by a lack of interest","He leant back in his chair, outwardly indifferent and calm, but throbbing in every nerve and pulse with wild excitement.  -- Gull, Cyril Arthur Edward Ranger"),
                new SimpleList("indigenous","originating where it is found","These deer are not indigenous, but were introduced by the Romans, probably from Asia Minor; and are, as at home, more or less private property.  -- Buck, Walter J."),
                new SimpleList("indigent","poor enough to need help from others","Tarkowski declared himself indigent, and said he could not pay the fines, according to news reports.  -- Chicago Tribune (Feb 4, 2012)"),
                new SimpleList("indignant","angered at something unjust or wrong","In Spain throngs of young people, known as  the indignant ones,  occupied public plazas nationwide, protesting unemployment and exclusionary politics.  -- Forbes (Sep 7, 2011)"),
                new SimpleList("indomitable","impossible to subdue","The very heart of the city was burned out, but nothing could extinguish its indomitable spirit.  -- Mitchell, Broadus"),
                new SimpleList("ineffable","defying expression or description","He had asked questions--never in the form of words but only ineffable yearnings of his soul--and at last it had responded.  -- Marshall, Edison"),
                new SimpleList("inevitable","incapable of being avoided or prevented"," Yes,  she repeated more faintly, as though this was all natural, inevitable, expected.  -- Blackwood, Algernon"),
                new SimpleList("inexorable","not to be placated or appeased or moved by entreaty","He urged, entreated, commanded in vain, Mrs. Fortescue was inexorable.  -- Aguilar, Grace"),
                new SimpleList("infamous","known widely and usually unfavorably","This one line in President George W. Bush's 2003 State of the Union address overshadowed all the others, becoming infamously known as the 16 words.  -- Time (Jan 25, 2011)"),
                new SimpleList("infinitesimal","immeasurably small","Within an infinitesimal period of time, a period too brief to be calculable, both hemispheres are again acting in unison.  -- Ottolengui, Rodrigues"),
                new SimpleList("infirmity","the state of being weak in health or body","Such are death, old age, physical infirmity, loss of worldly honor, final impenitence.  -- Rameur, E."),
                new SimpleList("inflammatory","arousing to action or rebellion","After being fired, Ms. Bartz gave an inflammatory interview to Fortune magazine in which she used an expletive and called Yahoo's board  doofuses.   -- New York Times (Sep 12, 2011)"),
                new SimpleList("infringe","go against, as of rules and laws","He said the order was unlawful and infringed on officers' rights.  -- Reuters (Jan 31, 2012)"),
                new SimpleList("ingratiate","gain favor with somebody by deliberate efforts","Yeah, well� I've seen eyes narrow and ears go back at first meetings -- even when I'm trying to be humble, ingratiating and likable.  -- New York Times (Nov 30, 2010)"),
                new SimpleList("inherent","existing as an essential constituent or characteristic","Action and reaction are, according to him, essential inherent properties of brain matter as such, but consciousness is merely a dependent.  -- Williams, C. M."),
                new SimpleList("iniquity","absence of moral or spiritual values","I have loved justice and hated iniquity, he said in dying, therefore I die in exile.  -- Norway, Arthur H."),
                new SimpleList("innate","not established by conditioning or learning","In other words, one of our most essential abilities as humans--reading--is the product of a combination of innate and learned traits.  -- Time (Dec 9, 2011)"),
                new SimpleList("innocuous","lacking intent or capacity to injure","Yet in confinement, he was docile, compliant and innocuous, they said.  -- New York Times (Oct 31, 2011)"),
                new SimpleList("innovative","being like nothing done or experienced or created before","On display are examples of artists using traditional subjects -- portraits, landscapes, still lifes -- in ways that were new, innovative, and sometimes shocking, at the time.  -- Washington Post (Oct 14, 2011)"),
                new SimpleList("innuendo","an indirect and usually malicious implication","As a genuine Irishman he never used an immodest word, or by gesture, phrase, or innuendo suggested an impure thought.  -- Various"),
                new SimpleList("insatiable","impossible to satisfy","The site branched into movies, foreign cartoons, news programs -- anything to feed viewers' insatiable appetite.  -- New York Times (Jul 23, 2011)"),
                new SimpleList("inscrutable","of an obscure nature","Hearing these words, Nabu-Nahid's face assumed an expression that was unexpectedly complex--a little inscrutable, indeed.  -- Potter, Margaret Horton"),
                new SimpleList("insidious","working or spreading in a hidden and usually injurious way","Its onset is usually insidious, gradually worsening over years and thus easily ignored.  -- New York Times (Jan 16, 2012)"),
                new SimpleList("insolent","marked by casual disrespect","Insolent laughter and mocking shouts were the answer he received.  -- J?kai, M?r"),
                new SimpleList("insolvent","unable to meet or discharge financial obligations","In common parlance, bankruptcy is often used more casually, to mean something like broke or insolvent.  -- New York Times (Sep 2, 2011)"),
                new SimpleList("insouciant","marked by unconcern","I rattled on, insouciant and careless to all appearances, but in reality my heart like lead.  -- Travis, Stuart"),
                new SimpleList("insubordination","defiance of authority","What Keble hated instinctively, says Newman, was heresy, insubordination, resistance to things established, claims of independence, disloyalty, innovation, a critical and censorious spirit.  -- Benson, Arthur Christopher"),
                new SimpleList("insular","suggestive of the isolated life of an island","Describing the tour as  an insular, introverted, isolated world,  Wright said she found no relief during her too-brief trips home.  -- New York Times (Mar 30, 2012)"),
                new SimpleList("insuperable","incapable of being surmounted or excelled","His life is an insuperable force, vivid, inviolable and free, which my heart out of sheer love of him failed to recognize.  -- Marx, Magdeleine"),
                new SimpleList("insurgent","a person who takes part in an armed insurrection","Clashes broke out between the insurgents and government troops in June, with both sides blaming the other for provoking the violence.  -- Reuters (Dec 3, 2011)"),
                new SimpleList("insurrection","organized opposition to authority","More than a decade of civil war left thousands dead after separatists on Bougainville Island began an armed insurrection in 1989.  -- New York Times (Dec 13, 2011)"),
                new SimpleList("intact","undamaged in any way","Questions were raised about the quality of construction in the area, with some buildings having remained completely intact while those next door were destroyed.  -- New York Times (Oct 26, 2011)"),
                new SimpleList("intangible","incapable of being perceived by the senses especially touch","I thought they were all clouds--beautiful, airy intangible shapes.  -- Waddington, Mary Alsop King"),
                new SimpleList("inter","place in a grave or tomb","He was interred with due military honors in a cemetery near his home in Jersey City.  -- Various"),
                new SimpleList("interdict","a court order prohibiting a party from a certain activity","Out-of-door life is interdicted, so to speak; gaiety is out of the question; everything predisposes to industry and thought.  -- O'Rell, Max"),
                new SimpleList("interim","serving during an intermediate interval of time","Chief Financial Officer Anthony Vuolo will serve as interim CEO while the company looks for a permanent replacement.  -- Washington Post (Jan 10, 2012)"),
                new SimpleList("interject","to insert between other elements","Indeed, the book is like an endless string of pearls, with here and there a ruby, a diamond, or a bit of honest glass interjected.  -- Ballou, Maturin Murray"),
                new SimpleList("interloper","someone who intrudes on the privacy or property of another","We look upon them somewhat as interlopers, parasites, occupying a place to which they have no legitimate right.  -- Various"),
                new SimpleList("interminable","tiresomely long; seemingly without end","This duration is eternity: an interminable duration existing all together.  -- Coffey, Peter"),
                new SimpleList("intimation","an indirect suggestion","Saul flinched before the concealed intimation in the words.  -- Miller, Elizabeth"),
                new SimpleList("intransigent","impervious to pleas, persuasion, requests, reason","Cuba's response to recent US efforts to improve relations had revealed an intransigent, entrenched regime in Havana, said the US secretary of state.  -- BBC (Apr 10, 2010)"),
                new SimpleList("intrepid","invulnerable to fear or intimidation","He must be intrepid, persisting through danger to death, laboring for religious truth, neither precipitating peril by audacity nor shrinking from it through timidity.  -- Lea, Henry Charles"),
                new SimpleList("intrinsic","belonging to a thing by its very nature","Roughly speaking, some Christian thinkers believe animals have intrinsic rights to be treated well, like people.  -- New York Times (Oct 14, 2011)"),
                new SimpleList("introspective","given to examining own sensory and perceptual experiences","Some of these artists do show an introspective side, reaching inward to confess their dreams, and what innocent dreams they are.  -- The Guardian (Apr 9, 2010)"),
                new SimpleList("inundated","covered with water","The baffled water stopped, as if reflecting; then it turned back, and rose till it poured over its banks and inundated the fields.  -- Aksakov, S. T. (Sergei Timofeevich)"),
                new SimpleList("inverse","opposite in nature or effect or relation to another quantity","Others showed an inverse relationship, with their activity declining as the value increased.  -- US News (Jan 5, 2011)"),
                new SimpleList("irrelevant","having no bearing on or connection with the subject at issue","His views are irrelevant � he's a tudor historian talking about contemporary urban unrest.  -- New York Times (Aug 13, 2011)"),
                new SimpleList("irreverent","showing lack of due respect or veneration","His humour was cheeky, irreverent, subversive and most definitely not politically correct.  -- The Guardian (Aug 24, 2010)"),
                new SimpleList("itinerant","traveling from place to place to work","The interest extending widely beyond his parish, he spent part of his time in itinerant preaching, going several hundred miles and in every direction.  -- Campbell, Charles")

        };

        //ListAdapter listAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,simpleList);

        ListAdapter listAdapter=new CustomAdapter_i(this,simpleList);

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

                        Intent i=new Intent(i_main.this,Details.class);
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
                String str="i";
                Intent in = new Intent(i_main.this, quizStats.class);
                in.putExtra("val",str);
                startActivity(in);

            }catch (Exception ex){
                new AlertDialog.Builder(i_main.this).setMessage(""+ex).show();
            }

            return true;
        }else if(id == R.id.action_search){
            // get prompts.xml view
            LayoutInflater layoutInflater = LayoutInflater.from(i_main.this);
            View promptView = layoutInflater.inflate(R.layout.input_dialog, null);
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(i_main.this);
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
                                        new AlertDialog.Builder(i_main.this).setTitle(simpleList[i].words+"                        ").setMessage(simpleList[i].meanings+"    \n").show();
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
                                    new AlertDialog.Builder(i_main.this).setTitle("Word List: Oops                           ").setMessage("Word not in out database \n").show();

                                }

                            }catch (Exception ex)
                            {
                                new AlertDialog.Builder(i_main.this).setTitle("Error").setMessage(""+ex).show();
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
                String val="i";
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
                                    String str="i";
                                    Intent in = new Intent(i_main.this, quiz.class);
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
