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
public class u_main extends ActionBarActivity {
    // private TextView resultText;
    private ListView myList;
    SimpleList simpleList[];
    DatabaseHelper2 db2;
    List<StudentsModel2> list2=new ArrayList<StudentsModel2>();
    // private ArrayList<SimpleList> alist=new ArrayList<SimpleList>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u_main);

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
                new SimpleList("ubiquitous","being present everywhere at once","In the run-up to the launch, Morgan has been ubiquitous, popping up all over the place to promote the show.  -- The Guardian (Jan 7, 2011)"),
                new SimpleList("ulterior","lying beyond what is openly revealed or avowed","Its worth lies in the fact that it is manifestly unprejudiced and advanced by the speaker with no ulterior motive.  -- Spencer, M. Lyle (Matthew Lyle)"),
                new SimpleList("ultimatum","a final peremptory demand","Have issued ultimatum to my own country that, if she does not find fresh countries for me to fight before midnight, war will ensue.  -- Seaman, Owen, Sir"),
                new SimpleList("umbrage","a feeling of anger caused by being offended","Such men are easily offended, take umbrage at trifles, and are unforgiving in their resentments.  -- Sleeper, John Sherburne"),
                new SimpleList("unabashed","not embarrassed","But she looked up into his face with such frank unabashed admiration that I couldn't help laughing--nor could he!  -- Du Maurier, George"),
                new SimpleList("unalterable","not capable of being changed","There were no immovable prejudices, no fixed and unalterable traditions.  -- Frothingham, Octavius Brooks"),
                new SimpleList("unambiguous","having or exhibiting a single clearly defined meaning","A man who is capable of thinking can express himself at all times in clear, comprehensible, and unambiguous words.  -- Schopenhauer, Arthur"),
                new SimpleList("unanimous","in complete agreement","With a couple of exceptions, the president has nominated moderates who receive overwhelming, sometimes unanimous, support once they get a vote.  -- Salon (Sep 6, 2010)"),
                new SimpleList("unappreciated","having value that is not acknowledged","Unappreciated, poor and neglected, it was not until after years of struggle that they attained recognition and success.  -- Various"),
                new SimpleList("unapproachable","discouraging intimacies; reserved","They are apart, unapproachable, unidentified, not to be communicated with though you look into their faces and speak to them.  -- Onions, Oliver [pseud.]"),
                new SimpleList("unassailable","impossible to attack","But the towns, within their strong Roman walls, were unassailable by the light cavalry which formed his only armed strength.  -- Oman, Charles William Chadwick"),
                new SimpleList("unassuming","not arrogant","Quiet and unassuming offstage, Mr. Watson played down his virtuoso guitar playing as nothing more than  country pickin.'    -- New York Times (May 30, 2012)"),
                new SimpleList("unattainable","impossible to achieve","Stick to the world in which you are born, and throw no bouquets at the impossible or the unattainable.  -- Miller, Freeman E. (Freeman Edwin)"),
                new SimpleList("unbiased","without prejudice","When the trusts are controlled, and labor submits its grievances to an impartial, unbiased board of arbitration, then there will be peace and plenty.  -- Warman, Cy"),
                new SimpleList("unbridled","not restrained or controlled","She was afraid of him in his ardent moods, almost as much as when he allowed his unbridled temper free rein.  -- Orczy, Emmuska Orczy, Baroness"),
                new SimpleList("uncanny","surpassing the ordinary or normal","In fact there was nothing unusual, or uncanny in the whole experience.  -- Bangs, John Kendrick"),
                new SimpleList("uncharted","not yet surveyed or investigated"," It's not like this is untested, uncharted territory in some respect,  he said.  -- New York Times (May 31, 2011)"),
                new SimpleList("uncommunicative","not inclined to talk or give information or express opinions","The men, too, sat uncommunicative, silent; whereas their daughters or spouses turned, chattering, laughing, waving a hand to this or that friend.  -- Hough, Emerson"),
                new SimpleList("unconditional","not qualified by reservations","Meanwhile, Peel has said that its offer is now unconditional, meaning it will go ahead whatever the uptake.  -- BBC (Jun 17, 2011)"),
                new SimpleList("unconscionable","greatly exceeding bounds of reason or moderation","United's chapter of the Air Line Pilots Association said the planned reuse of the flight numbers showed  insensitivity and unconscionable disrespect.   -- BusinessWeek (May 18, 2011)"),
                new SimpleList("unconscious","lacking awareness and the capacity for sensory perception","He fell asleep in an unconscious state, after an illness of a week.  -- Kennedy, W. Sloane"),
                new SimpleList("unconventional","not conforming to standards","He said NSF is looking for unusually innovative, unconventional, high-risk, and interdisciplinary proposals without a recognizable home within the foundation.  -- Science Magazine (Nov 9, 2011)"),
                new SimpleList("uncouth","lacking refinement or cultivation or taste","He had not stopped to consider her rough speech and uncouth manners.  -- Johnston, Annie F. (Annie Fellows)"),
                new SimpleList("unction","anointing as part of a religious ceremony or healing ritual","Afterward he administers the sacrament of Extreme Unction--last anointing.  -- Burke, John J. (John James)"),
                new SimpleList("unctuous","unpleasantly and excessively suave or ingratiating","He had become suave and unctuous, a kind of elephantine irony pervading his laborious attempts at conciliation.  -- Orczy, Emmuska Orczy, Baroness"),
                new SimpleList("undaunted","resolutely courageous","He possessed undaunted courage, and blended bold enterprise with much sagacity.  -- Anonymous"),
                new SimpleList("undermine","destroy property or hinder normal operations","Her friends were scattered, her means reduced and her health undermined.  -- Stark, James H."),
                new SimpleList("underscore","give extra weight to","That One Direction topped the American chart underscores how powerful social media sites have become in marketing groups.  -- New York Times (Mar 23, 2012)"),
                new SimpleList("undulate","move in a wavy pattern or with a rising and falling motion","Their accounts are frightening to read: the landscape undulating like a shaken carpet, rising and falling in waves 15 feet high.  -- Washington Post (Jan 30, 2012)"),
                new SimpleList("unencumbered","not burdened with cares or responsibilities","At such times, a man should feel free, unencumbered, and perfectly at his ease in point of straps and suspenders.  -- Melville, Herman"),
                new SimpleList("unequivocal","admitting of no doubt or misunderstanding","His response was clear and unequivocal:  manipulating images is considered tampering with data.   -- Forbes (Jan 16, 2012)"),
                new SimpleList("unexceptionable","completely acceptable; not open to reproach","All cowboys are from necessity good cooks, and the fluffy, golden brown biscuits and fragrant coffee of Red's making were unexceptionable.  -- Mayer, Frank"),
                new SimpleList("unfaltering","marked by firm determination or resolution; not shakable"," Never!  was that word pronounced in a firm unfaltering tone.  -- Reid, Mayne"),
                new SimpleList("unfathomable","resembling an abyss in depth; so deep as to be immeasurable","His Civil List is an unfathomable abyss, into which are thrown untold sums of money.  -- Field, Henry M. (Henry Martyn)"),
                new SimpleList("unfettered","not bound by shackles and chains","Each wants free enterprise unfettered by a meddlesome government, which means promoting lower taxes, less regulation and privatizing public services.  -- Time (Apr 9, 2012)"),
                new SimpleList("unfledged","young and inexperienced","Both were equally sympathetic, and pitied the little unfledged creature, who was by some accident left motherless in his early youth.  -- Brightwen, Elizabeth"),
                new SimpleList("unfounded","without a basis in reason or fact"," The allegations contained in this report are inaccurate and unfounded,  Allen Chan, Sino-Forest's chief executive officer, said in the statement.  -- BusinessWeek (Jun 3, 2011)"),
                new SimpleList("ungainly","lacking grace in movement or posture","They seem ungainly in their clothes, and, apparently, feel awkward and ill at ease in this show.  -- Campbell, R. W."),
                new SimpleList("unguent","preparation applied externally as a remedy or for soothing","Medicated unguents, applied to the skin, containing mercury, iodine, and other substances, are not known to be followed by any better results.  -- Various"),
                new SimpleList("unilateral","involving only one part or side","He said the decision was not unilateral but taken in consultation with France's partners.  -- Reuters (May 29, 2012)"),
                new SimpleList("unimpeachable","beyond doubt or reproach","They were men of the highest courage and of unimpeachable honor.  -- Rahn, A. D."),
                new SimpleList("uninhibited","not restrained","Marigold, the variegated mother of Wilson's award-winning title, is in many ways an amazing parent � dazzlingly creative, uninhibitedly joyous, constantly sidetracked by new ideas.  -- The Guardian (Aug 24, 2011)"),
                new SimpleList("unison","occurring together or simultaneously","Dick made ready for his try, every muscle working in unison, every fiber in his body intent on clearing the bar in safety.  -- Clark, Ellery H."),
                new SimpleList("unity","an undivided or unbroken completeness with nothing wanting","Early on, most of the lyrics were about unity and bringing different cultures together.  -- Salon (May 18, 2012)"),
                new SimpleList("universal","applicable to or common to all members of a group or set","By universal consent, indeed, The Chambered Nautilus is considered the gem of Doctor Holmes' beautiful lyrics.  -- Brown, E. E."),
                new SimpleList("unjust","not fair; marked by injustice or partiality or deception","These evils briefly are: The competitive system is stupid because wasteful and disorderly; it is unnecessarily immoral, unjust and cruel.  -- Kelly, Edmond"),
                new SimpleList("unjustified","lacking authorization","Under the proposal, a rate increase will be considered unreasonable if it is excessive, unjustified or  unfairly discriminatory.   -- New York Times (Dec 22, 2010)"),
                new SimpleList("unkempt","not properly maintained or cared for"," It also had filthy showers, terrible dressing rooms, and was tatty and unkempt.  -- BusinessWeek (Jan 23, 2012)"),
                new SimpleList("unlicensed","lacking official approval","There are serious risks associated with parties in unlicensed locations: In 1990, a fire killed 87 people inside an illegal New York club.  -- New York Times (Dec 27, 2011)"),
                new SimpleList("unmitigated","not diminished or moderated in intensity or severity","When the donkey first bounded off, the feelings of Bob were nothing but pure, unmitigated delight.  -- De Mille, James"),
                new SimpleList("unobtainable","not capable of being acquired","Fresh meat was soon unobtainable, except by those few people who could afford to pay fabulous prices for joints smuggled across the frontier.  -- Reynolds, Francis J. (Francis Joseph)"),
                new SimpleList("unobtrusive","not undesirably noticeable","Be unobtrusive, blend in, and everyone will forget you are there.  -- Time (Aug 4, 2011)"),
                new SimpleList("unorthodox","breaking with convention or tradition","His involvement drew denunciations from some conservatives who accuse him of holding liberal ideas and unorthodox religious beliefs.  -- New York Times (Aug 7, 2010)"),
                new SimpleList("unpack","remove from protective material","The steel plates were unpacked from the boxes in which they were shipped, brushed off, and stacked up ready for painting.  -- Gardner, Henry A."),
                new SimpleList("unparalleled","radically distinctive and without equal","When this unparalleled and matchless royal speech was ended the whole company burst forth into rapturous applause.  -- De Mille, James"),
                new SimpleList("unprecedented","novel","State officials have said the company reported that the Virginia outage was unprecedented, an occurrence never before seen in 1 billion hours of system use.  -- Washington Post (Sep 2, 2010)"),
                new SimpleList("unprepossessing","creating an unfavorable or neutral first impression","Indeed! ejaculated Mrs. Vanderburgh, as he addressed her, and raising her eyebrows with a supercilious glance for his plain, unprepossessing appearance.  -- Sidney, Margaret"),
                new SimpleList("unpretentious","lacking affectation","Yet Norman Wisdom remained that most modest of British superstars, unpretentious, full of humility, despite a dizzying rise to international fame.  -- The Guardian (Oct 5, 2010)"),
                new SimpleList("unprincipled","lacking moral scruples","He was no better, in his unprincipled cravings, than a wild beast.  -- Oxenham, John"),
                new SimpleList("unravel","become undone","I described how one day recently, Matthew's mental state unraveled and he spent hours on the floor of the classroom in tears.  -- New York Times (Mar 12, 2012)"),
                new SimpleList("unregulated","not subject to rule or discipline","The Internet provides an inexpensive, anonymous, geographically unbounded, and largely unregulated virtual haven for terrorists.  -- National Security Council (U.S.)"),
                new SimpleList("unrelenting","never-ceasing","Constant and unrelenting, it streamed steadily upward, as though it drew its volume from central fires that would never cease.  -- Ratcliffe, S. K. (Samuel Kerkham)"),
                new SimpleList("unremitting","uninterrupted in time and indefinitely long continuing","The most unremitting attention and constant care were what the boy required declared the physician when he had made an examination.  -- Madison, Lucy Foster"),
                new SimpleList("unrequited","not returned in kind","As an elderly man looking back, he narrates the story, which turns out to be one of unfulfilled if not actually unrequited love.  -- New York Times (Mar 12, 2011)"),
                new SimpleList("unresponsive","not reacting to some influence or stimulus","All the time Sigurd was strange, remote, moving like a body without a spirit, unresponsive to all her attempts at comfort and cheer.  -- Bates, Katharine Lee"),
                new SimpleList("unrestrained","marked by uncontrolled excitement or emotion","The cook danced, clapped her hands, sat down in a chair, and reeled backward and forward in unrestrained ecstasy.  -- Coffin, Charles Carleton"),
                new SimpleList("unruly","noisy and lacking in restraint or discipline","Once, long ago, award ceremonies were rather unruly and rambunctious affairs.  -- The Guardian (Feb 13, 2012)"),
                new SimpleList("unsavory","morally offensive","For a more disreputable, unsavory, desperate and wicked band of men it would be almost impossible to find.  -- Baker, Willard F."),
                new SimpleList("unscathed","not injured","Ever wondered why mosquitoes eat some people up but leave others relatively unscathed?  -- Scientific American (Jan 4, 2012)"),
                new SimpleList("unscheduled","not planned or on a regular timetable","Secretary of State even made a personal, unscheduled visit to huddle with Mr. Zardari at his hotel.  -- New York Times (May 11, 2010)"),
                new SimpleList("unseemly","not in keeping with accepted standards of what is proper","In a country that has long shunned haggling outside of car dealerships and mattress stores, my behavior may have once appeared unseemly, even crass.  -- Washington Post (Jan 31, 2010)"),
                new SimpleList("unsightly","unpleasant to look at","White paper is laid over black tablecloths -- acceptable when pristine, but it quickly became unsightly with smudges of food.  -- New York Times (Jun 26, 2010)"),
                new SimpleList("unspecified","not stated explicitly or in detail","Two others have unspecified injuries and their conditions are not known.  -- Washington Post (Dec 17, 2011)"),
                new SimpleList("unstable","highly or violently reactive","They can be chaotic, unstable, and at times violent.  -- Reuters (May 24, 2012)"),
                new SimpleList("unsullied","free from blemishes","Only the pure in heart, clean, unsullied thought.  -- Le Gallienne, Richard"),
                new SimpleList("untenable","incapable of being defended or justified","In fact, view it as we will, the whole idea of unlimited Matter is not only untenable, but impossible and preposterous.  -- Poe, Edgar A."),
                new SimpleList("untoward","not in keeping with accepted standards of what is proper","The captain in Lajas is on duty day and night, watching that nothing untoward may happen to man, beast, or property.  -- Lumholtz, Carl"),
                new SimpleList("unveil","make visible","Details will be unveiled during a news conference Tuesday.  -- Washington Post (Apr 24, 2012)"),
                new SimpleList("unwarranted","without a basis in reason or fact","The statement that all amateur journalists are flirts, more or less, is a base and unwarranted libel which we are prepared completely to refute.  -- Lovecraft, H. P. (Howard Phillips)"),
                new SimpleList("unwavering","marked by firm determination or resolution; not shakable","In Bloomah's class alone--as if inspired by her martial determination--the ranks stood firm, unwavering.  -- Zangwill, Israel"),
                new SimpleList("unwieldy","lacking grace in movement or posture","On land, he is unwieldy and awkward; so that, when he is pursued by an enemy, he usually takes to his favorite element.  -- Woodworth, Francis C. (Francis Channing)"),
                new SimpleList("unwitting","not aware or knowing","If this was all, we could easily cope with these unwitting abuses, or even deliberate instances of misuse.  -- La Motte, Ellen Newbold"),
                new SimpleList("unwonted","out of the ordinary","He was continually surprised and taken off his guard by the unwonted and unexpected.  -- Multatuli"),
                new SimpleList("unyielding","resistant to physical force or pressure","When he sought to move, something firm and unyielding about his waist restrained him.  -- Altsheler, Joseph A. (Joseph Alexander)"),
                new SimpleList("upbraid","express criticism towards","Rachel never upbraided her with words,--had never spoken one word of reproach.  -- Trollope, Anthony"),
                new SimpleList("upbringing","helping someone grow up to be a member of the community","His Majesty also left a thousand crowns, which were to be utilized in the education and general upbringing of the child.  -- Spence, Lewis"),
                new SimpleList("upheaval","disturbance usually in protest","If they don't find it, China risks riots and other upheaval.  -- Salon (Jun 21, 2010)"),
                new SimpleList("uphold","stand up for; stick up for; of causes, principles, or ideals","We must be consistent in upholding human rights for all human beings.   -- Time (May 17, 2012)"),
                new SimpleList("uproarious","uncontrollably noisy","One tires of this hurrying, bustling, jostling, uproarious life in the city, and then laziness in the country is considered the greatest of earthly boons.  -- Fleming, May Agnes"),
                new SimpleList("upshot","a phenomenon that is caused by some previous phenomenon","I turned away half bewildered, and went home at once, pondering what was to be the upshot of this new development.  -- Marchmont, Arthur W. (Arthur Williams)"),
                new SimpleList("urban","located in or characteristic of a city or city life","Using data gathered by sensors scattered around an urban area, researchers say they can track changes in a city's carbon dioxide output.  -- Science Magazine (May 14, 2012)"),
                new SimpleList("urbane","showing a high degree of refinement","The concert closed with Bartok's six Romanian Folk Dances, which Ms. Grimaud performed as refined and urbane, contemporaries of Berg's sonata rather than quaintly folksy.  -- New York Times (Feb 1, 2011)"),
                new SimpleList("urchin","poor and often mischievous city child","London, it is calculated, contains ten thousand of these shoeless, homeless, friendless, forsaken, ragged, unwashed, uncombed young urchins of doubtful antecedents.   -- Ritchie, J. Ewing (James Ewing)"),
                new SimpleList("usurp","seize and take control without authority","He had murdered his master, and usurped the throne, without any title to it whatever.  -- Abbott, Jacob"),
                new SimpleList("usury","the act of lending money at an exorbitant rate of interest","There were no laws limiting the rate of interest, and the rich lent to the poor at extravagant rates of usury.  -- Morris, Charles"),
                new SimpleList("utilitarian","having use often to the exclusion of values","He does not, on the other hand, adopt a low utilitarian view of life, allowing value only to that which is practical.  -- Stace, W. T. (Walter Terence)"),
                new SimpleList("utility","the quality of being of practical use","Charles Goodyear, an American inventor, found a way for making it commonly useful, and brought about its practical and widespread utility.  -- Piercy, Willis Duff"),
                new SimpleList("utopian","characterized by or aspiring to impracticable perfection","Thus More gave a new word to our language, and when we think some idea beautiful but impossible we call it  Utopian.  -- Marshall, H. E. (Henrietta Elizabeth)"),
                new SimpleList("utter","express in speech","Mrs. Mandeville spoke as if every word she uttered tortured her.  -- Butler, Maude M."),
                new SimpleList("uxorious","foolishly fond of or submissive to your wife","Yet he became deeply attached to his wife, and proved in fact nearly as uxorious as his father.  -- Various")

        };

        //ListAdapter listAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,simpleList);

        ListAdapter listAdapter=new CustomAdapter_u(this,simpleList);

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

                        Intent i=new Intent(u_main.this,Details.class);
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
                String str="u";
                Intent in = new Intent(u_main.this, quizStats.class);
                in.putExtra("val",str);
                startActivity(in);

            }catch (Exception ex){
                new AlertDialog.Builder(u_main.this).setMessage(""+ex).show();
            }

            return true;
        }else if(id == R.id.action_search){
            // get prompts.xml view
            LayoutInflater layoutInflater = LayoutInflater.from(u_main.this);
            View promptView = layoutInflater.inflate(R.layout.input_dialog, null);
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(u_main.this);
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
                                        new AlertDialog.Builder(u_main.this).setTitle(simpleList[i].words+"                        ").setMessage(simpleList[i].meanings+"    \n").show();
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
                                    new AlertDialog.Builder(u_main.this).setTitle("Word List: Oops                           ").setMessage("Word not in out database \n").show();

                                }

                            }catch (Exception ex)
                            {
                                new AlertDialog.Builder(u_main.this).setTitle("Error").setMessage(""+ex).show();
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
                String val="u";
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
                                    String str="u";
                                    Intent in = new Intent(u_main.this, quiz.class);
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
