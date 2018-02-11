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
public class l_main extends ActionBarActivity {
    // private TextView resultText;
    private ListView myList;
    SimpleList simpleList[];
    DatabaseHelper2 db2;
    List<StudentsModel2> list2=new ArrayList<StudentsModel2>();
    // private ArrayList<SimpleList> alist=new ArrayList<SimpleList>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.l_main);

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
                new SimpleList("labile","readily undergoing change or breakdown","We are rather like the labile chemical compounds: our molecules readily rearrange themselves.  -- Ellis, Havelock"),
                new SimpleList("lachrymose","showing sorrow","She had got rid of her tears before she came down to dinner, but still she was melancholy and almost lachrymose.  -- Trollope, Anthony"),
                new SimpleList("lackadaisical","idle or indolent especially in a dreamy way","She was rather listless and lackadaisical, but seemed to be well content so that she could lie within sight of the Master and dream.  -- Buxton, Robert Hugh"),
                new SimpleList("lackluster","lacking brilliance or vitality","But his momentum dwindled just as quickly after a pair of lackluster debate performances.  -- Chicago Tribune (Feb 1, 2012)"),
                new SimpleList("laconic","brief and to the point","I thought the circumstances warranted conciseness, and my being laconic, if necessary.  -- Waller, Mary E. (Mary Ella)"),
                new SimpleList("lament","express grief verbally","They went through the passages weeping and lamenting.  -- Colum, Padraic"),
                new SimpleList("lampoon","a composition that imitates or misrepresents a style","Granted, all are outrageously exaggerated, but a discerning eye can detect the truth that lurks behind any satire, parody, or lampoon.  -- Anonymous"),
                new SimpleList("lancet","an acutely pointed Gothic arch","Nothing of the sacred edifice remained, however, but the Gothic front, with its deep portal and grand lancet window, already described.  -- Irving, Washington"),
                new SimpleList("languid","lacking spirit or liveliness","I felt languid, disinclined for all that was serious,--in fact, lazy.  -- Mendelssohn-Bartholdy, Felix"),
                new SimpleList("languish","lose vigor, health, or flesh, as through grief","He would have found production suspended, or languishing.  -- Knight, Charles"),
                new SimpleList("languor","a feeling of lack of interest or energy","Now, on that evening an inexplicable languor made him dreamy; his eyes followed in vain the text; his rebellious thoughts were scattered.  -- Unknown"),
                new SimpleList("lassitude","weakness characterized by a lack of vitality or energy","He told by her very attitude that now there was lassitude, even weariness in her.  -- Blackwood, Algernon"),
                new SimpleList("latent","potentially existing but not presently evident or realized","But the whole future man is already hidden, not yet declared, but latent all the same in the child's heart.  -- Adler, Felix"),
                new SimpleList("latter","referring to the second of two things or persons mentioned","More missiles were fired carefully--not to do damage, but to discourage the intruders; the latter were held at bay for another twelve hours.  -- Gallun, Raymond Z."),
                new SimpleList("laudable","worthy of high praise","In newspaper obituaries, it was long customary to lavish praise on the subjects, noting laudable traits of character.  -- New York Times (Oct 25, 2010)"),
                new SimpleList("lavish","characterized by extravagance and profusion","In Colorado, Blagojevich -- whose penchant for expensive suits and lavish spending were outlined at his first trial -- will have no luxuries.  -- Chicago Tribune (Mar 14, 2012)"),
                new SimpleList("leery","openly distrustful and unwilling to confide","People in China wounded by gunshots are often leery of going to hospitals, fearing that they will face questioning and possibly retaliation by the authorities.  -- New York Times (Jan 23, 2012)"),
                new SimpleList("legacy","a gift of personal property by will","Like other heirs to civil rights legacies, Mr. Boykin finds himself facing expectations he did not seek.  -- New York Times (Feb 11, 2012)"),
                new SimpleList("legerdemain","an illusory feat","Everything short of this is trick, legerdemain, sleight of hand.  -- Stanton, Elizabeth Cady"),
                new SimpleList("legislate","make laws or bills","We will dispense with the conventional wisdom that bigger bills are always better, he said, that fast legislating is good legislating.  -- Slate (Feb 4, 2011)"),
                new SimpleList("legitimacy","undisputed credibility","The Fathers of the Church never called in question the validity or the legitimacy of such Baptisms.  -- Gibbons, James"),
                new SimpleList("legitimate","authorized, sanctioned by, or in accordance with law","To make them seem legitimate, grant applications included the names of real scientists, established research institutes and existing companies, he says.  -- Nature (Jun 15, 2011)"),
                new SimpleList("leisure","time available for ease and relaxation","He says that young Lincoln often called at his office and borrowed books to read at home during leisure hours.  -- Herndon, William H."),
                new SimpleList("leniency","mercifulness as a consequence of being tolerant","There is no more room for leniency or tolerance in enforcing law ...  -- Reuters (Apr 10, 2011)"),
                new SimpleList("lethal","of an instrument of certain death","He was executed by lethal injection at Stateville Correctional Center in 1994.  -- Chicago Tribune (Mar 30, 2012)"),
                new SimpleList("lethargic","deficient in alertness or activity","Then, stolidly, with set mouth, she went on with her work, movements a little slower, perhaps, a bit lethargic, surely, bungling now and then.  -- Titus, Harold"),
                new SimpleList("lethargy","weakness characterized by a lack of vitality or energy","Then he, as it were, awoke, and got up on his legs, but again felt the same lethargy, and fell.  -- Jefferies, Richard"),
                new SimpleList("levee","an embankment built to prevent a river from overflowing","In some cases, levees would be set back farther from rivers, creating flood buffers and shallow flood-plain-style habitat.  -- New York Times (Mar 2, 2012)"),
                new SimpleList("level","a relative position or degree of value in a graded group","Also, the over 80% participation level Sunday means there are few idle voters to mobilize.  -- Time (Apr 23, 2012)"),
                new SimpleList("leverage","strategic advantage; power to act effectively","If things continue to improve faster than expected, Obama could have some leverage in future decisions on budget cutting or further stimulus.  -- BusinessWeek (Feb 14, 2012)"),
                new SimpleList("leviathan","the largest or most massive thing of its kind","Tearing along at well over her contract speed, the 27,500-ton leviathan meant business.  -- Westerman, Percy F. (Percy Francis)"),
                new SimpleList("levity","a manner lacking seriousness","At the same time, avoid jesting, merriment, or undue levity, as it will be out of place, and appear heartless.  -- Hartley, Cecil B."),
                new SimpleList("lexicon","a reference book containing an alphabetical list of words","A grim new noun has entered the lexicon--99ers, people whose 99 weeks of extended jobless benefits have all run dry.  -- BusinessWeek (Aug 12, 2010)"),
                new SimpleList("liability","the quality of being something that holds you back"," There's a PR liability, if not a real liability, if some guy's stoned and messes up on a rig,  he said.  -- BusinessWeek (Jan 5, 2012)"),
                new SimpleList("liaison","a channel for communication between groups","After his parents divorced -- an amicable parting -- Trayvon served as a liaison between them, sending little messages back and forth between us, says Martin.  -- Time (Mar 26, 2012)"),
                new SimpleList("libation","a serving of an alcoholic beverage","By his Falstaffian girth, he appeared a man not averse to good living, nor one to deny himself plentiful libations of American home-brewed ale.  -- Fisher, Harrison"),
                new SimpleList("libel","a false and malicious publication","Libel and slander like racist, fascist, bigot, etc. color every news report of every counter-jihad action.  -- Salon (Aug 23, 2010)"),
                new SimpleList("lilliputian","very small","Despite its Brobdingnagian length, the quartet consists of Lilliputian parcels: succinct gestures, tiny shudders, rising and falling melodic cells.  -- New York Times (Apr 13, 2010)"),
                new SimpleList("limber","capable of moving or bending freely","To stay healthy and limber, the players twist their bodies into a series of poses like pigeon, downward dog and eagle.  -- New York Times (May 1, 2010)"),
                new SimpleList("limpid","clear and bright","However clear and limpid the stream may look, I never forget that its source was in foulness!  -- Lever, Charles James"),
                new SimpleList("lineage","the kinship relation between an individual and progenitors","He has long suspected his Jewish lineage - Judaism is passed down through the mother's side.  -- Washington Post (Jul 30, 2010)"),
                new SimpleList("linger","remain present although waning or gradually dying","The virus spreads easily through the air, and in closed rooms, infected droplets can linger for up to two hours after the sick person leaves.  -- US News (Apr 19, 2012)"),
                new SimpleList("linguistic","consisting of or related to language","Basque separatists have been murdering Spaniards in the name of political, linguistic and cultural independence, just as Franco imprisoned anyone who spoke Basque or Catalan.  -- New York Times (Apr 22, 2010)"),
                new SimpleList("lionize","assign great social importance to","In 2004, when Mr. Foster raised questions about cost estimates by the Bush administration, Democrats lionized him as a paragon of integrity.  -- New York Times (Apr 24, 2010)"),
                new SimpleList("liquidate","convert into cash","Eurex Clearing began liquidating, or selling off, positions after MF Global defaulted, a process it had completed by the following day, November 2.  -- Reuters (Dec 23, 2011)"),
                new SimpleList("lissome","moving and bending with ease","In this garden the musicians played, and the tawny dancers writhed and curved their lissome bodies, in dramatic Eastern dances.  -- Hartley, C. Gasquoine (Catherine Gasquoine)"),
                new SimpleList("listless","lacking zest or vivacity","Always an athletic, outgoing man, he became listless and quiet, sleeping much of the day and avoiding his friends.  -- New York Times (Oct 11, 2010)"),
                new SimpleList("literal","limited to the explicit meaning of a word or text","The problem is that, so far, it is quite literal with its translations and lacks the nuance of someone who speaks the language.  -- BBC (Oct 29, 2010)"),
                new SimpleList("lithe","moving and bending with ease","She put both feet, visible beneath her short skirt, suddenly very close together, and curved her lithe body in an abrupt burlesque bow.  -- Fawcett, Edgar"),
                new SimpleList("litigation","a legal proceeding in a court","On Thursday, after years of litigation, a frustrated judge decided Moroun had obstructed the law once too often, and threw him in jail for contempt.  -- Forbes (Jan 12, 2012)"),
                new SimpleList("livid","furiously angry","He stopped, strangled with passion, his tall figure towering above her, his face livid, his hands clutched in rage.  -- Dixon, Thomas"),
                new SimpleList("loll","be lazy or idle","It was, as is usual with trading posts, surrounded by a number of Indian wigwams, the denizens of which were lazily lolling in the sun.  -- Seville, William P."),
                new SimpleList("longevity","the property of being long-lived","There, on the hill, gazing seaward, where fishing smacks moved, I rubbed the horny bark, envying the tree's longevity and its years ahead.  -- Bartlett, Paul Alexander"),
                new SimpleList("loquacious","full of trivial conversation","A loquacious fellow, who nevertheless finds time to eat and sleep, is continually talking; but a great river flows continuously.  -- Bierce, Ambrose"),
                new SimpleList("lucid","transparently clear; easily understandable","It is an argument -- a sustained, lucid case in which points are made logically and backed by evidence and reason.  -- New York Times (Mar 29, 2012)"),
                new SimpleList("lucrative","producing a sizeable profit","As a professional, Tanner earned more than $2 million and signed lucrative endorsement deals.  -- New York Times (Feb 13, 2012)"),
                new SimpleList("ludicrous","inviting ridicule","At the first blush it had appeared ludicrous--incredible; but, on reflection, there was, he found, nothing so extravagant in it.  -- Trollope, Frances Eleanor"),
                new SimpleList("lugubrious","excessively mournful","In the gay capital of France he led a wretched life, in constant dread of future disaster, and ceaselessly uttering lugubrious prognostications.  -- Baird, Henry Martyn"),
                new SimpleList("lull","make calm or still","Terence, lulled by tears, had fallen asleep long since upon the floor.  -- Wingfield, Lewis"),
                new SimpleList("luminary","a celebrity who is an inspiration to others","Founded in 1947, the group's members have included such luminaries as Walt Disney, Spencer Tracy and another American president, Ronald Reagan.  -- Seattle Times (Apr 11, 2011)"),
                new SimpleList("lunar","of or relating to or associated with the moon","But when the Moon shrinks to a crescent - as it has this week - lunar light pollution is less of an issue.  -- BBC (Jan 4, 2011)"),
                new SimpleList("lurid","horrible in fierceness or savagery","The Ukrainian press, not surprisingly, had a field day with the story, writing thinly sourced expos�s filled with lurid details.  -- New York Times (Nov 18, 2011)"),
                new SimpleList("lurk","lie in wait or behave in a sneaky and secretive manner","The Cape Mounted Rifles went out in skirmishing order, ahead of the infantry, keeping a vigilant look-out for lurking foes.  -- Henty, G. A. (George Alfred)"),
                new SimpleList("lustrous","reflecting light","For instance, in chemical composition the lustrous diamond is nothing but crystallized carbon.  -- Various")

        };

        //ListAdapter listAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,simpleList);

        ListAdapter listAdapter=new CustomAdapter_l(this,simpleList);

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

                        Intent i=new Intent(l_main.this,Details.class);
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
                String str="l";
                Intent in = new Intent(l_main.this, quizStats.class);
                in.putExtra("val",str);
                startActivity(in);

            }catch (Exception ex){
                new AlertDialog.Builder(l_main.this).setMessage(""+ex).show();
            }

            return true;
        }else if(id == R.id.action_search){
            // get prompts.xml view
            LayoutInflater layoutInflater = LayoutInflater.from(l_main.this);
            View promptView = layoutInflater.inflate(R.layout.input_dialog, null);
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(l_main.this);
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
                                        new AlertDialog.Builder(l_main.this).setTitle(simpleList[i].words+"                        ").setMessage(simpleList[i].meanings+"    \n").show();
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
                                    new AlertDialog.Builder(l_main.this).setTitle("Word List: Oops                           ").setMessage("Word not in out database \n").show();

                                }

                            }catch (Exception ex)
                            {
                                new AlertDialog.Builder(l_main.this).setTitle("Error").setMessage(""+ex).show();
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
                String val="l";
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
                                    String str="l";
                                    Intent in = new Intent(l_main.this, quiz.class);
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
