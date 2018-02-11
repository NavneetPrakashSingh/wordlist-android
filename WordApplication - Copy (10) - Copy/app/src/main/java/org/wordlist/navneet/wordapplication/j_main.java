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
public class j_main extends ActionBarActivity {
    // private TextView resultText;
    private ListView myList;
    SimpleList simpleList[];
    DatabaseHelper2 db2;
    List<StudentsModel2> list2=new ArrayList<StudentsModel2>();
    // private ArrayList<SimpleList> alist=new ArrayList<SimpleList>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.j_main);

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
                new SimpleList("jaded","dulled by surfeit","After so long on the road, beaches and ruins might have left me jaded, and breathtaking views might no longer take my breath away.  -- New York Times (Jul 26, 2011)"),
                new SimpleList("jargon","technical terminology characteristic of a particular subject","He has complained that officials' speeches and writings were clogged with Party jargon and demanded more plain speaking.  -- Reuters (Feb 8, 2012)"),
                new SimpleList("jaunt","a journey taken for pleasure","He got the idea during afternoon jaunts around the neighborhood with his daughter, Iris, then 9, who rode her bicycle while Mr. Cronin jogged.  -- New York Times (Jun 2, 2010)"),
                new SimpleList("jaunty","having a cheerful, lively, and self-confident air","Yet his mood was jaunty and he cheerfully claimed to have achieved his ambition, thus far, of getting through February without touching alcohol.  -- The Guardian (Feb 24, 2011)"),
                new SimpleList("jeer","laugh at with contempt and derision","The mob jeered, and derided, and insulted her in every conceivable way.  -- Abbott, John S. C. (John Stevens Cabot)"),
                new SimpleList("jejune","lacking interest or significance or impact","The works called good are dry and jejune, soon consummated, often of questionable value, and leaving behind them when finished a sense of vacuity.  -- Jefferies, Richard"),
                new SimpleList("jeopardize","pose a threat to; present a danger to","Furthermore, Facebook could jeopardize Google's online dominance by developing its own search capabilities.   -- Forbes (Dec 30, 2011)"),
                new SimpleList("jest","activity characterized by good humor","Everybody was in the highest spirits; every jest or bit of fun was caught, bandied back and forth, and passed on with new trimmings.  -- Kelly, Florence Finch"),
                new SimpleList("jettison","throw away, of something encumbering","In the editing room, they jettisoned material they had once deemed essential but came to view as extraneous.  -- Seattle Times (Feb 20, 2012)"),
                new SimpleList("jibe","an aggressive remark directed at a person","We would jibe one another, laugh at a fellow to his chagrin, and when we were angry bawl each other out unmercifully.  -- Davis, James J. (James John)"),
                new SimpleList("jingoist","an extreme bellicose nationalist","And, hell, I'm no jingoist, but surely we can do better in this country than importing our drugs from Mexico, right?  -- Salon (May 25, 2010)"),
                new SimpleList("jocular","characterized by jokes and good humor","Maria saw every thing, and marked well the expression of Mr. Stokes's face, so serious, so unlike his usual jocular tone.  -- Newby, Emma"),
                new SimpleList("jollity","feeling jovial and full of good humor","Smiling faces, mirth, and jollity abound everywhere, and good feeling unites all men as brethren on this most popular of all the Dutch festivals.  -- Hough, P. M."),
                new SimpleList("jostle","make one's way by pushing or shoving","This morning there was a lot of people trying to jostle and barge into the queue, but fortunately everyone had a number, he said.  -- The Guardian (Apr 15, 2010)"),
                new SimpleList("jovial","full of or showing high-spirited merriment","He looked a gentleman all over, and his merry laugh and jovial manner made one certain at once that he was a general favourite.  -- Brereton, F. S. (Frederick Sadleir)"),
                new SimpleList("jubilant","full of high-spirited delight","As the results poured in, a jubilant, well-heeled crowd thronged the street outside the party's headquarters, dancing and cheering.  -- BBC (May 23, 2011)"),
                new SimpleList("judicious","marked by the exercise of good judgment in practical matters","It is judicious to consult a physician immediately, in punctured or lacerated wounds, because they often induce the most dangerous diseases.  -- Cutter, Calvin"),
                new SimpleList("juggernaut","a massive inexorable force","Welch transformed GE into a sleek juggernaut that dominated market segments from jet engines and locomotives to finance.  -- Washington Post (Aug 1, 2010)"),
                new SimpleList("juncture","a point in time when a critical decision must be made","At critical junctures throughout the crisis, Mrs. Merkel has resisted appeals to appease the financial markets by lowering borrowing costs.  -- New York Times (Dec 7, 2011)"),
                new SimpleList("junket","a trip taken by an official at public expense","Mr. Abramoff arranged for junkets, including foreign golfing destinations, for the members of Congress he was trying to influence.  -- New York Times (Feb 27, 2010)"),
                new SimpleList("junta","a group of officers who rule a country after seizing power","The stock soared 10.2% in London after Mali's military junta agreed to reinstate the country's constitution following last month's coup.  -- Wall Street Journal (Apr 10, 2012)"),
                new SimpleList("jurisdiction","the territory within which power can be exercised","Governments are exercising power over people outside their jurisdictions through global Internet companies.  -- Slate (Jan 30, 2012)"),
                new SimpleList("jurisprudence","the collection of rules imposed by authority","And American jurisprudence is supposed to be guided by lofty ideals, not the bottom line; our laws should be moral, not mercenary.  -- New York Times (Apr 17, 2010)"),
                new SimpleList("justify","defend, explain, or make excuses for by reasoning"," He still relies on his dead father's authority to justify his rule.   -- New York Times (Apr 15, 2012)"),
                new SimpleList("juxtapose","place side by side","In other words, black and white, when juxtaposed, mutually reinforce each other.  -- Luckiesh, Matthew"),
                new SimpleList("joypad","an input device for a computer games console","- -"),
                new SimpleList("joypop ","to take addictive drugs occasionally without becoming addicted","- -"),
                new SimpleList("joypopper","a person who takes addictive drugs occasionally without becoming addicted","- -"),
                new SimpleList("joyride","a ride taken for pleasure in a car, esp in a stolen car driven recklessly","- -"),
                new SimpleList("Jain","an adherent of Jainism","- -"),
                new SimpleList("jakey"," a homeless alcoholic","- -"),
                new SimpleList("jalap ","a Mexican convolvulaceous plant","- -"),
                new SimpleList("Jalapa","a city in E central Mexico, capital of Veracruz State, at an altitude of 1427 m (4681 ft): resort","- -"),
                new SimpleList("jalapeno","very hot type of green chilli pepper, used esp in Mexican cookery","- -"),
                new SimpleList("jamaat","an Islamic council or assembly","- -"),
                new SimpleList("jamahiriya","an Arab socialist state","- -"),
                new SimpleList("Jamaica","an island and state in the Caribbean: colonized by the Spanish from 1494 onwards, large numbers of Black slaves being imported; captured by the British in 1655 and established as a colony in 1866","- -"),
                new SimpleList("Jamaican","of or relating to Jamaica or its inhabitants","- -"),
                new SimpleList("jalouse","to suspect; infer","- -"),
                new SimpleList("jalousie","a window blind or shutter constructed from angled slats of wood, plastic, etc","- -"),
                new SimpleList("jambiya","a curved, double-edged dagger that is worn in the belt in the Middle East, esp in Yemen","- -"),
                new SimpleList("jambier","a greave","- -"),
                new SimpleList("Jambi","a port in W Indonesia, in SE Sumatra on the Hari River.","- -"),
                new SimpleList("jambee"," a light cane or walking stick that was fashionable in the 18th century","- -")

        };

        //ListAdapter listAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,simpleList);

        ListAdapter listAdapter=new CustomAdapter_j(this,simpleList);

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

                        Intent i=new Intent(j_main.this,Details.class);
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
                String str="j";
                Intent in = new Intent(j_main.this, quizStats.class);
                in.putExtra("val",str);
                startActivity(in);

            }catch (Exception ex){
                new AlertDialog.Builder(j_main.this).setMessage(""+ex).show();
            }

            return true;
        }else if(id == R.id.action_search){
            // get prompts.xml view
            LayoutInflater layoutInflater = LayoutInflater.from(j_main.this);
            View promptView = layoutInflater.inflate(R.layout.input_dialog, null);
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(j_main.this);
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
                                        new AlertDialog.Builder(j_main.this).setTitle(simpleList[i].words+"                        ").setMessage(simpleList[i].meanings+"    \n").show();
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
                                    new AlertDialog.Builder(j_main.this).setTitle("Word List: Oops                           ").setMessage("Word not in out database \n").show();

                                }

                            }catch (Exception ex)
                            {
                                new AlertDialog.Builder(j_main.this).setTitle("Error").setMessage(""+ex).show();
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
                String val="j";
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
                                    String str="j";
                                    Intent in = new Intent(j_main.this, quiz.class);
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
