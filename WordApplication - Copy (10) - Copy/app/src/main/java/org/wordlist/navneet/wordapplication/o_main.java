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
public class o_main extends ActionBarActivity {
    // private TextView resultText;
    private ListView myList;
    SimpleList simpleList[];
    DatabaseHelper2 db2;
    List<StudentsModel2> list2=new ArrayList<StudentsModel2>();
    // private ArrayList<SimpleList> alist=new ArrayList<SimpleList>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.o_main);

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
                new SimpleList("oasis","a shelter serving as a place of safety or sanctuary","In August, editor-at-large Leigh Buchanan and I traveled to the foundation's headquarters, an oasis of greenery and glass in sweltering Kansas City, Missouri.  -- Inc (Sep 27, 2011)"),
                new SimpleList("obdurate","showing unfeeling resistance to tender feelings","Mr. Oldstone, in particular, exhausted all his powers of persuasion to yet delay his departure, but he found him obdurate.  -- M. Y. Halidom (pseud. Dryasdust)"),
                new SimpleList("obedient","dutifully complying with the commands of those in authority"," With all due respect, I have the honor to be, Sir,  Your most obedient and humble servant.'  -- Semmes, Raphael"),
                new SimpleList("obeisance","bending the head or body in reverence or submission","All heads were inclined in an obeisance of deep homage.  -- Sienkiewicz, Henryk"),
                new SimpleList("obfuscate","make obscure or unclear","Yet as we tried to understand, there always seemed to be an obfuscating layer: something or someone was working against comprehension.  -- Time (Dec 11, 2010)"),
                new SimpleList("objective","the goal intended to be attained","Our main objective is to maintain a balance between market share and profitability, Chief Executive Officer Marco Antonio Bologna said in the earnings statement.  -- Reuters (Feb 13, 2012)"),
                new SimpleList("obligation","the state of being bound to do or pay something","I considered myself as a married man and under obligation to alter my way of living, and I stopped playing.  -- Seingalt, Jacques Casanova de"),
                new SimpleList("oblique","indirect in departing from the accepted or proper way","An old man, of monstrous obesity, seated on a wooden chair, devoured his pittance with animal voracity, casting on either side oblique angry glances.  -- Sue, Eugne"),
                new SimpleList("oblivious","lacking conscious awareness of","They were lying down and apparently oblivious to my approach--perhaps asleep.  -- Various"),
                new SimpleList("obloquy","state of disgrace resulting from public abuse","Thus public men are content to leave their reputation to posterity; great reactions take place in opinion; nay, sometimes men outlive opposition and obloquy.  -- Newman, John Henry Cardinal"),
                new SimpleList("obscure","not clearly understood or expressed","Nor has any obscure, mysterious, or illusive point in history been cleared up by the spirits.  -- Flammarion, Camille"),
                new SimpleList("obsequious","attentive in an ingratiating or servile manner","The man had been eager in his attentions, deferential, almost obsequious.  -- Packard, Frank L. (Frank Lucius)"),
                new SimpleList("obsolete","no longer in use","Over the past dozen or so years, hospitals across the country have gone digital, leading to better patient outcomes and making hangar-size file-storage facilities obsolete.  -- Slate (Apr 9, 2012)"),
                new SimpleList("obstinate","marked by tenacious unwillingness to yield","No opposition was so great, no difficulty so stubborn and obstinate, which he did not conquer by his beloved Son, the author of our salvation.  -- Arndt, Johann"),
                new SimpleList("obstreperous","noisily and stubbornly defiant","If particularly wild, obstinate, or obstreperous, he still keeps breaking away, and refusing to come into camp.  -- Shields, George O."),
                new SimpleList("obstruct","block passage through","Through Icy Sound we found some difficulty in penetrating, as the channel was much obstructed by ice.  -- Fitzroy, Robert"),
                new SimpleList("obtain","come into possession of","Nine years later, Napoleon managed, by skilful intrigues, to obtain quiet possession of Malta.  -- Whymper, Frederick"),
                new SimpleList("obtrusive","undesirably noticeable"," We've done research, and the ads are considered annoying, irritating and obtrusive,  Mr. Norris said after watching Barnes & Noble's presentation.  -- New York Times (Nov 7, 2011)"),
                new SimpleList("obtuse","slow to learn or understand; lacking intellectual acuity","The affair had been mentioned so plainly that it was impossible for the most dense and obtuse person not to have understood the allusion.  -- Brazil, Angela"),
                new SimpleList("obviate","prevent the occurrence of; prevent from happening","Fevers are at present alarmingly prevalent, arising from causes which judicious attention and sanitary means would easily obviate.  -- Ballou, Maturin Murray"),
                new SimpleList("occlude","block passage through","In many cases we can dissolve the clot that is occluding the artery or blood vessel in the brain and restore normal flow.  -- Seattle Times (Nov 29, 2010)"),
                new SimpleList("occult","supernatural practices and techniques","He studied magic, and his thirst for knowledge of the occult sciences grew.  -- Butterworth, Hezekiah"),
                new SimpleList("occupy","live in","Another reason sales have fallen is that previously occupied homes have become a better deal than new homes.  -- Time (Apr 17, 2012)"),
                new SimpleList("odious","unequivocally detestable","Hideous and odious, revolting beyond all expression, the underground war finished by becoming impossible.  -- Tarde, Gabriel"),
                new SimpleList("odium","hate coupled with disgust","Week after week, the seceders were held up to public odium, derision and scorn.  -- Doheny, Michael"),
                new SimpleList("odoriferous","having a natural fragrance","Some odoriferous substances are fragrant for many years, exhaling continually, yet are not quickly consumed.  -- Gilbert, William"),
                new SimpleList("odyssey","a long wandering and eventful journey","He hit six rodeos in seven days, an odyssey that took him to stops in Texas, Arkansas, New Mexico and California.  -- Newsweek (Dec 10, 2010)"),
                new SimpleList("offend","cause to feel resentment or indignation","The research said milder expressions should be used to avoid offending the public and stoking social tensions.  -- BBC (Feb 27, 2012)"),
                new SimpleList("officious","intrusive in a meddling or offensive manner","Be kind, of course; that's only your duty, but I call it officious and presumptuous to interfere in other people's lives.  -- Earnshaw, Elizabeth"),
                new SimpleList("offset","compensate for or counterbalance","The chain has been raising prices on some drinks to help offset higher costs for commodities like coffee and milk.  -- New York Times (Jan 27, 2012)"),
                new SimpleList("ogle","look at with amorous intentions"," This simple food keeps you in beautiful health, Father,  said Mistletoe, ogling the swarthy face of the Abbot with an affection that he duly noted.  -- Stewardson, John"),
                new SimpleList("olfactory","of or relating to the sense of smell","The human brain's olfactory bulb is activated differently depending on where a smell hits the nostril, indicating that odor receptor organization is not uniform.  -- Scientific American (Sep 26, 2011)"),
                new SimpleList("oligarchy","a political system governed by a few people","The track management of this particular university was an oligarchy; was governed by a few absolute individuals.  -- Marchand, J. N."),
                new SimpleList("omen","a sign of a thing about to happen","Pale-faced, wide-eyed, statuesque, their presence, interpreted by a vivid imagination, might have been regarded as an omen of impending misfortune.  -- Harris, Joel Chandler"),
                new SimpleList("ominous","threatening or foreshadowing evil or tragic developments","He knew there was something ominous in her silence, like gathering thunder.  -- Canfield, Dorothy"),
                new SimpleList("omit","leave undone or leave out","Titles are abbreviated, mottoes dropped, foot notes cut out, and many earlier poems reduced, or omitted entirely.  -- Freneau, Philip"),
                new SimpleList("omnipotent","having unlimited power","We can still call Him Omnipotent in the sense that He possesses all the power there is.  -- Rashdall, Hastings"),
                new SimpleList("omnipresent","existing everywhere at once","He is here, there, and everywhere; he is omnipresent--this curse of Finland.  -- Alec-Tweedie, Mrs. (Ethel)"),
                new SimpleList("omniscient","infinitely wise","The Omniscient Being alone can have perfect knowledge of all beings and things as they are.  -- Peabody, Andrew P. (Andrew Preston)"),
                new SimpleList("omnivorous","feeding on both plants and animals","Rats and mice are practically omnivorous, feeding upon all kinds of animal and vegetable matter.  -- Lantz, David E."),
                new SimpleList("onerous","not easily borne; wearing","The charge was an onerous one, requiring constant and severe labor, as well as the exercise of patience, prudence, and good judgment.  -- Richardson, James D. (James Daniel)"),
                new SimpleList("onomatopoeia","using words that imitate the sound they denote","This correspondence of sound and sense is called onomatopoeia.  -- Baum, Paull Franklin"),
                new SimpleList("onslaught","the rapid and continuous delivery of communication","Most companies are facing an onslaught of information about customers from social networks, the Internet, and mobile devices.  -- BusinessWeek (Sep 6, 2011)"),
                new SimpleList("onus","an onerous or difficult concern","With Xavi out injured, the onus was on Alonso to supply his forward line and he excelled at the task.  -- The Guardian (Oct 13, 2010)"),
                new SimpleList("opalescent","having a play of lustrous rainbow colors","It is a picture beautiful as the opalescent colors of a soap bubble.  -- Leacock, Stephen"),
                new SimpleList("opaque","not transmitting or reflecting light or radiant energy","Comets differ from the bodies which we have just been describing in that they appear filmy and transparent, whereas the others are solid and opaque.  -- Dolmage, Cecil Goodrich Julius"),
                new SimpleList("operative","a person secretly employed in espionage for a government","I am a Secret Service operative seeking information about Cheney.  -- Taft, William Nelson"),
                new SimpleList("opiate","a narcotic drug that contains opium or an opium derivative","Signs of opiate drug use include pinpoint pupils, too much sleep, too little motivation, unexplained absences and worsening grades, counselors say.  -- Seattle Times (Oct 1, 2011)"),
                new SimpleList("opponent","someone who offers resistance","Sarkozy has been criticized by opponents and even some allies for his sometimes brutal manner of pushing through decisions.  -- Time (Apr 23, 2012)"),
                new SimpleList("opportune","suitable or advantageous especially for a particular purpose","Most viewed the budget surplus as opportune: a chance to pay down the national debt, cut taxes, shore up entitlements or pursue new spending programs.  -- Washington Post (Feb 19, 2012)"),
                new SimpleList("opportunist","a person who places expediency above principle","A Rangoon resident told the BBC that some of these groups were seen as opportunists playing along with the junta for personal gain.  -- BBC (Mar 30, 2010)"),
                new SimpleList("opposition","a body of people united against something","Medical Missions in Persia have already worked wonders, breaking down opposition, winning friends even amongst the most fanatical.  -- Hume-Griffith, A."),
                new SimpleList("oppressive","marked by unjust severity or arbitrary behavior","The consequences flowing from this unjust and oppressive system of taxation are appalling.  -- Cloud, D. C."),
                new SimpleList("opprobrium","state of disgrace resulting from public abuse","They know how easily the taunting of Mr Brown over bullying allegations and ill-scripted condolence letters engendered public sympathy rather than opprobrium.  -- BBC (Apr 28, 2010)"),
                new SimpleList("optimist","a person disposed to take a favorable view of things","Ms. McCarthy remains hopeful about the future of public education:  I'm forever an optimist.  -- New York Times (Apr 9, 2010)"),
                new SimpleList("optional","possible but not necessary; left to personal choice","All other laws, it is optional with each man to obey, or not, as he may choose.  -- Spooner, Lysander"),
                new SimpleList("opulent","rich and superior in quality","The count was rich in land, but his income could not be compared with that of the opulent Garnet.  -- Palacio Vald�s, Armando"),
                new SimpleList("opus","a musical work that has been created","Barnes will perform his opus, Acknowledgment of a Celebration, which he debuted at last fall's Earshot Jazz Festival.  -- Seattle Times (May 31, 2010)"),
                new SimpleList("oracle","an authoritative person who divines the future","Dionysus further possessed the prophetic gift, and his oracle at Delphi was as important as that of Apollo.  -- Various"),
                new SimpleList("oracular","of or relating to a prophet","Nor does his philosophic attitude exclude the possibility of a certain faith in oracular foresight and divination.  -- Dill, Samuel"),
                new SimpleList("orator","a person who delivers a speech","As an orator Senator Evarts stood in the foremost rank, and some of his best speeches were published.  -- Various"),
                new SimpleList("ordinance","an authoritative rule","Police say officers began patrolling parks near the stadium Monday night to make sure no park ordinances are violated, especially those related to alcohol.  -- Seattle Times (Apr 10, 2012)"),
                new SimpleList("ordinary","lacking special distinction, rank, or status","While the government and the developers are doing well, many ordinary people are hurt by the high cost of living.  -- Time (Apr 3, 2012)"),
                new SimpleList("ordination","the status of being sworn into a sacred office","Some forty English students are educated for the priesthood and return on their ordination for work in their native land.  -- O'Reilly, Elizabeth Boyle"),
                new SimpleList("organic","of foodstuff grown or raised without synthetic fertilizers","And because she has an organic farm, she does not use spray pesticides, experimenting with spraying soapy water.  -- Washington Post (Sep 24, 2010)"),
                new SimpleList("orientation","a course introducing a new situation or environment","To reduce the number of dropouts, it is offering students a three-week   orientation  during which they can quit without charge.  -- Economist (Sep 9, 2010)"),
                new SimpleList("orifice","an opening, especially one that opens into a bodily cavity","The mouth, a round, lipless orifice, contracted or dilated at will; from it came whistling words.  -- Diffin, Charles Willard"),
                new SimpleList("origin","the source of something's existence or from which it derives","British, but especially English, place names are, in a vast majority of cases, either of Saxon, Norse, or Celtic origin.  -- Russell, T. O."),
                new SimpleList("originate","come into existence; take on form or shape","Some plants, such as the sweet potato, originated in the Andes Mountains but apparently spread across the Pacific Ocean before the arrival of Columbus.  -- Science Magazine (Feb 6, 2012)"),
                new SimpleList("ornate","marked by elaborate rhetoric and elaborated with details","Unlike his literary icon, Herman Melville, he doesn't adorn his writing with ornate flourishes or complicated scaffolding.  -- Scientific American (Dec 20, 2011)"),
                new SimpleList("ornithologist","a scientist who studies birds","Besides the structural resemblances, which are, of course, the only ones considered by ornithologists in classifying birds, the indigo buntings have several sparrow-like traits.  -- Blanchan, Neltje"),
                new SimpleList("orotund","full and rich, of sounds","The answer came back in a deep, orotund, sing-song voice.  -- Ward, Herbert D. (Herbert Dickinson)"),
                new SimpleList("orthodox","adhering to what is commonly accepted","His opinions, clashing as they did with orthodox creeds, were given in a tentative, questioning fashion, so that where ecclesiastical censure fell, retreat was easier.  -- Clodd, Edward"),
                new SimpleList("orthogonal","meeting at right angles","His love of the orthogonal, which like 1980s dance moves once verged on the robotic, is relaxing into less pure angles.  -- The Guardian (Sep 19, 2010)"),
                new SimpleList("oscillate","move or swing from side to side regularly","When the polariton flow was excited with two laser beams, the quantum fluid began to oscillate backwards and forwards in ways predicted by quantum mechanics.  -- Forbes (Jan 9, 2012)"),
                new SimpleList("osseous","composed of or containing bone","But the osseous outgrowth, the bones, you know, complicate things.  -- Wells, H. G. (Herbert George)"),
                new SimpleList("ossify","make rigid and set into a conventional pattern","Looking at it out of the corner of my eye, I could think about being a teenager, before roles were ossified and boundaries set.  -- New York Times (Nov 24, 2010)"),
                new SimpleList("ostensible","appearing as such but not necessarily so","This already-exhaustive book is studded with diary entries, academic papers and other ostensible evidence that its fictitious stories of destruction are true.  -- New York Times (Jun 6, 2010)"),
                new SimpleList("ostentatious","tawdry or vulgar","He was frugal and dressed in plain, ordinary clothes rather than extravagant or ostentatious ones.  -- Reilly, S. A."),
                new SimpleList("ostracize","expel from a community or group","Although she may have been more sinned against than sinning, she is cast out and ostracized by society.  -- Moody, Dwight Lyman"),
                new SimpleList("otiose","serving no useful purpose; having no excuse for being","There is no superfluous ornament in his orations, nothing tawdry, nothing otiose.  -- Lincoln, Abraham"),
                new SimpleList("oust","remove from a position or office","Maldives' torture- addicted previous president was ousted and a more democratic government was established.  -- Seattle Times (May 3, 2012)"),
                new SimpleList("outcome","something that results","Very frustrating process, but a great outcome in the end, Moore told The Idaho Statesman.  -- Seattle Times (May 1, 2012)"),
                new SimpleList("outlandish","conspicuously or grossly unconventional or unusual","His outsized personality and outlandish comments - maybe not so absurd given what Ryan's New York Jets have achieved - draw notice no matter the situation.  -- Seattle Times (Jan 23, 2011)"),
                new SimpleList("outrage","strike with disgust or revulsion","Every single time reporters, analysts, and citizens are astonished, outraged, shocked anew that the politician didn't just go ahead and admit what he did.  -- Slate (Nov 9, 2011)"),
                new SimpleList("outrageous","grossly offensive to decency or morality; causing horror"," The suffering and bloodshed is outrageous and it is unacceptable,  Mr. Obama said at the White House, after meeting with Mrs. Clinton.  -- New York Times (Feb 24, 2011)"),
                new SimpleList("outskirts","outlying areas, as of a city or town","Security forces were checking cars inside the city and in its outskirts.  -- BusinessWeek (May 2, 2011)"),
                new SimpleList("outspoken","given to expressing yourself freely or insistently","Even my lady, so blunt and outspoken by nature, had shrunk from trying to question the Dutch girl about her lover.  -- Weyman, Stanley John"),
                new SimpleList("outwit","beat through cleverness and wit","To top it all off, he regularly outwits his elders, showing natural positional sense and finishing moves with the poise and intelligence of an expert.  -- The Guardian (Apr 1, 2010)"),
                new SimpleList("ovation","enthusiastic recognition","Buster Poster, receiving rousing ovations from fans every time his name was announced, cleared another milestone with an RBI single in the first.  -- Seattle Times (Apr 5, 2012)"),
                new SimpleList("overbearing","having or showing arrogant superiority to","He who had been so unprincipled and arrogant, so insolent and overbearing, his cleverness no longer needed, was tossed aside by his employers.  -- Wingfield, Lewis"),
                new SimpleList("overcome","win a victory over","Abbott said he learned a lot by winning, by overcoming the odds.  -- New York Times (Apr 30, 2012)"),
                new SimpleList("oversight","management by watching and directing a person or group","The former Pennsylvania senator defended the practice by saying that Congress has an important oversight role in shaping the federal budget.  -- Chicago Tribune (Feb 23, 2012)"),
                new SimpleList("overt","open and observable; not secret or hidden","In this music, the Caribbean element often isn't overt but is coded in the relationship between rhythm and melody.  -- New York Times (Mar 6, 2010)"),
                new SimpleList("overthrow","cause the downfall of","Just two weeks ago, Mali's 1991 revolution was reversed when mutinous soldiers overthrew a democratically elected government.  -- New York Times (Apr 6, 2012)"),
                new SimpleList("overweening","presumptuously arrogant","There were crack riders and ropers who, just because they felt such overweening pride in their own prowess, were not really very valuable men.  -- Roosevelt, Theodore"),
                new SimpleList("overwhelming","very intense","I think I was not so much afraid as oppressed by an almost overwhelming sense of loneliness.  -- Gilson, Charles"),
                new SimpleList("overwrought","deeply agitated especially from emotion","Belshazzar, pale-faced and utterly overwrought, physically exhausted, mentally apprehensive, followed his father, walking alone.  -- Potter, Margaret Horton"),
                new SimpleList("overzealous","marked by excessive enthusiasm for a cause or idea","He sat scared in Greece on his team's bus as it was attacked by overzealous fans.  -- Washington Post (Aug 31, 2011)"),
                new SimpleList("oxymoron","conjoining contradictory terms","As oxymorons go, the silent disco is right up there, along with vegan bacon, jumbo shrimps and the living dead.  -- The Guardian (Jan 29, 2011)")

        };

        //ListAdapter listAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,simpleList);

        ListAdapter listAdapter=new CustomAdapter_o(this,simpleList);

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

                        Intent i=new Intent(o_main.this,Details.class);
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
                String str="o";
                Intent in = new Intent(o_main.this, quizStats.class);
                in.putExtra("val",str);
                startActivity(in);

            }catch (Exception ex){
                new AlertDialog.Builder(o_main.this).setMessage(""+ex).show();
            }

            return true;
        }else if(id == R.id.action_search){
            // get prompts.xml view
            LayoutInflater layoutInflater = LayoutInflater.from(o_main.this);
            View promptView = layoutInflater.inflate(R.layout.input_dialog, null);
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(o_main.this);
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
                                        new AlertDialog.Builder(o_main.this).setTitle(simpleList[i].words+"                        ").setMessage(simpleList[i].meanings+"    \n").show();
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
                                    new AlertDialog.Builder(o_main.this).setTitle("Word List: Oops                           ").setMessage("Word not in out database \n").show();

                                }

                            }catch (Exception ex)
                            {
                                new AlertDialog.Builder(o_main.this).setTitle("Error").setMessage(""+ex).show();
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
                String val="o";
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
                                    String str="o";
                                    Intent in = new Intent(o_main.this, quiz.class);
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
