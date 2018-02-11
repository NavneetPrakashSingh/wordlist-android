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
public class z_main extends ActionBarActivity {
    // private TextView resultText;
    private ListView myList;
    SimpleList simpleList[];
    DatabaseHelper2 db2;
    List<StudentsModel2> list2=new ArrayList<StudentsModel2>();
    // private ArrayList<SimpleList> alist=new ArrayList<SimpleList>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.z_main);

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
//        setContentView(R.layout.activitz_main);

        // bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#3498db")));
//            bar.setBackgroundDrawable(new ColorDrawable(0xff00DDED));
//            bar.setDisplayShowTitleEnabled(false);
//            bar.setDisplayShowTitleEnabled(true);


        simpleList =new SimpleList[]{
                new SimpleList("zany","ludicrous, foolish","Style: Pleasantly earnest overall; on occasion displayed his goofy and zany side.  -- Time (Feb 22, 2012)"),
                new SimpleList("zeal","a feeling of strong eagerness","While many states, particularly in the West, have nonrestrictive gun laws, Arizona's zeal for weapons has often made headlines.  -- New York Times (Jan 9, 2011)"),
                new SimpleList("zealot","a fervent and even militant proponent of something","Finally having conquered his irritable bowel syndrome, he worked out like a zealot all winter, adding about 17 pounds of solid muscle.  -- Seattle Times (Feb 29, 2012)"),
                new SimpleList("zealous","marked by active interest and enthusiasm","You are so willing and zealous; but for that very reason I must guard against your enthusiasm carrying you too far.  -- Madison, Lucy Foster"),
                new SimpleList("zenith","the point above the observer directly opposite the nadir","Zenith, the point in the celestial sphere directly overhead.  -- Warren, Henry White"),
                new SimpleList("zephyr","a slight wind","Nor I. On the contrary, all the allusions to the winds are of the gentler kind,--balmy Zephyrs, whispering breezes and so forth.  -- Pope, Alexander"),
                new SimpleList("zest","vigorous and enthusiastic enjoyment","So I pursued my studies with zest and unabated enthusiasm.  -- Farrar, Geraldine"),
                new SimpleList("zabaglione	","frothy custard","- -"),
                new SimpleList("zabernism	","misuse of military authority; bullying","- -"),
                new SimpleList("zabra	","small Spanish sailing vessel","- -"),
                new SimpleList("zabuton	","flat Japanese cushion for kneeling or sitting","- -"),
                new SimpleList("zaffre	","impure cobalt oxide","- -"),
                new SimpleList("zaftig	","having a full; rounded figure","- -"),
                new SimpleList("zaitech	","investment in financial markets by a company in order to boost profits","- -"),
                new SimpleList("zakuska	","hors d'oeuvre; snack","- -"),
                new SimpleList("zalambdodont	","having molar teeth with V-shaped ridges","- -"),
                new SimpleList("zamacueca	","Chilean dance where partners move around each other","- -"),
                new SimpleList("zamarra	","sheepskin jacket","- -"),
                new SimpleList("zambomba	","Spanish percussion instrument","- -"),
                new SimpleList("zambra	","Spanish dance","- -"),
                new SimpleList("zampogna	","Italian bagpipe","- -"),
                new SimpleList("zampone	","stuffed pigs' trotter sausage","- -"),
                new SimpleList("zander	","a variety of European perch","- -"),
                new SimpleList("zanella	","mixed twilled umbrella fabric","- -"),
                new SimpleList("zanjero	","supervisor of irrigation canals","- -"),
                new SimpleList("zanyism	","buffoonery","- -"),
                new SimpleList("zanze	","African musical instrument like castanets","- -"),
                new SimpleList("zapata	","flowing, drooping moustache","- -"),
                new SimpleList("zapateado	","Latin-American dance with rhythmic tapping of the feet","- -"),
                new SimpleList("zappy	","lively; entertaining","- -"),
                new SimpleList("zarf	","ornamental holder for hot coffee cup","- -"),
                new SimpleList("zari	","Indian gold and silver brocade","- -"),
                new SimpleList("zariba	","square fence of thorn-bushes; fortified camp","- -"),
                new SimpleList("zarzuela	","traditional Spanish vaudeville show; fish and shellfish stew","- -"),
                new SimpleList("zatch	","female genitalia","- -"),
                new SimpleList("zati	","Indian macaque with large tuft on the back of the head","- -"),
                new SimpleList("zayat	","Burmese public meeting-hall or house of worship","- -"),
                new SimpleList("zazzy	","flashy; stylish","- -"),
                new SimpleList("zebrine	","of, like or pertaining to zebras","- -"),
                new SimpleList("zebrinny	","offspring of male horse and female zebra","- -"),
                new SimpleList("zebroid	","like or resembling a zebra","- -"),
                new SimpleList("zebrule	","hybrid offspring of male zebra and female horse","- -"),
                new SimpleList("zebu	","ox with hump and dewlap","- -"),
                new SimpleList("zedoary	","aromatic root resembling ginger","- -"),
                new SimpleList("zegedine	","silver drinking-cup","- -"),
                new SimpleList("zeitgeber	","rhythmically occurring event that cues organisms' biological rhythms","- -"),
                new SimpleList("zek	","inmate of prison labour camp","- -"),
                new SimpleList("zel	","form of Oriental cymbal","- -"),
                new SimpleList("zelator	","sister in a convent in charge of checking on conduct of other nuns","- -"),
                new SimpleList("zelatrix	","older nun in charge of disciplining younger nuns","- -"),
                new SimpleList("zelophobia	","irrational or fear of jealousy","- -"),
                new SimpleList("zelotic	","of the nature of a zealot","- -"),
                new SimpleList("zelotypia	","jealousy; excessive zeal in carrying out a project","- -"),
                new SimpleList("zeme	","Caribbean idol or totem","- -"),
                new SimpleList("zemindar	","in colonial India, an indigenous revenue collector or landholder","- -"),
                new SimpleList("zemirah	","Hebrew religious song sung at Sabbath meals","- -"),
                new SimpleList("zemni	","blind mole-rat","- -"),
                new SimpleList("zenana	","system of segregating women away from men in harems","- -"),
                new SimpleList("zendalet	","large black woollen shawl worn over the head or shoulders","- -"),
                new SimpleList("zendik	","heretic; magician","- -"),
                new SimpleList("zendo	","hall for Zen Buddhist meditation","- -"),
                new SimpleList("zenocentric	","measured with reference to the planet Jupiter","- -"),
                new SimpleList("zenography	","study of the planet Jupiter","- -"),
                new SimpleList("zenzic	","square of a number","- -"),
                new SimpleList("zenzizenzizenzic	","eighth power of a number","- -"),
                new SimpleList("zep	","large sandwich made on a long crusty roll","- -"),
                new SimpleList("zephyr	","lightweight wool or worsted fabric; the west wind","- -"),
                new SimpleList("zeppole	","a variety of doughnut","- -"),
                new SimpleList("zeren	","light brown Mongolian gazelle","- -"),
                new SimpleList("zeroable	","able to be omitted from a sentence without any loss of meaning","- -"),
                new SimpleList("zeta	","small room or closet in a church","- -"),
                new SimpleList("zetetic	","proceeding by inquiry; a search or investigation","- -"),
                new SimpleList("zeugma	","use of a word to modify two or more words in different ways","- -"),
                new SimpleList("zeugmatography	","imaging using nuclear magnetic resonance to study soft tissue","- -"),
                new SimpleList("zeze	","stringed instrument resembling a zither","- -"),
                new SimpleList("zho	","cross between a yak and a cow","- -"),
                new SimpleList("ziamet	","large ancient Turkish fiefdom","- -"),
                new SimpleList("zibeline	","of, like or pertaining to the sable","- -"),
                new SimpleList("zibeline	","soft piled wool","- -"),
                new SimpleList("zibib	","colourless alcoholic drink made from raisins","- -"),
                new SimpleList("ziganka	","Russian country dance","- -"),
                new SimpleList("ziggurat	","Mesopotamian step pyramid","- -"),
                new SimpleList("zill	","finger cymbals used in belly dancing","- -"),
                new SimpleList("zimocca	","bath-sponge","- -"),
                new SimpleList("zincic	","of, pertaining to or containing zinc","- -"),
                new SimpleList("zinciferous	","bearing zinc","- -"),
                new SimpleList("zincography	","process of engraving or etching on zinc","- -"),
                new SimpleList("zineb	","white powder used as fungicide","- -"),
                new SimpleList("zingaro	","gypsy","- -"),
                new SimpleList("zingiber	","ginger","- -"),
                new SimpleList("zinke	","old wind instrument resembling the cornet","- -"),
                new SimpleList("zinkiferous	","bearing zinc","- -"),
                new SimpleList("zinnia	","brightly coloured annual flower","- -"),
                new SimpleList("zinnober	","chrome green","- -"),
                new SimpleList("ziraleet	","expression of joy among Arab women","- -"),
                new SimpleList("zirconic	","of or pertaining to zirconium","- -"),
                new SimpleList("zitella	","young girl; maiden","- -"),
                new SimpleList("zither	","musical instrument with strings laid over horizontal board","- -"),
                new SimpleList("ziti	","pasta shaped like large macaroni","- -"),
                new SimpleList("zizel	","chipmunk","- -"),
                new SimpleList("zizyphus	","spiny fruit-bearing shrub","- -"),
                new SimpleList("zizz	","sparkle; vim","- -"),
                new SimpleList("zoanthropy	","delusion that one is an animal","- -"),
                new SimpleList("zoarium	","supporting structure for a polyp colony","- -"),
                new SimpleList("zodiographer	","one who writes about animals","- -"),
                new SimpleList("zoetic	","living; vital","- -"),
                new SimpleList("zoetrope	","slotted rotating cylinder producing primitive animation","- -"),
                new SimpleList("zograscope	","optical device for viewing stereoscopic images","- -"),
                new SimpleList("zoiatrics	","veterinary surgery","- -"),
                new SimpleList("zoic	","of, like or pertaining to animals; containing evidence of life","- -"),
                new SimpleList("zoilism	","carping and unjust criticism","- -"),
                new SimpleList("zoism	","doctrine that life originates from a single vital principle","- -"),
                new SimpleList("zokor	","central Asian mole-like burrowing rodent","- -"),
                new SimpleList("zol	","hand-rolled cannabis cigarette","- -"),
                new SimpleList("zollverein	","customs union","- -"),
                new SimpleList("zolotnik	","old Russian unit of weight equal to 1/6 of an ounce","- -"),
                new SimpleList("zomotherapy	","medical treatment using raw meat","- -"),
                new SimpleList("zona	","girdle or belt; patch or band","- -"),
                new SimpleList("zonal	","of or like a zone; arranged in zones","- -"),
                new SimpleList("zonarious	","of or pertaining to a girdle or purse","- -"),
                new SimpleList("zonary	","of or like a zone; arranged in zones","- -"),
                new SimpleList("zonelet	","a little zone","- -"),
                new SimpleList("zonoid	","like a zone","- -"),
                new SimpleList("zonule	","small zone","- -"),
                new SimpleList("zonulet	","a small belt or girdle","- -"),
                new SimpleList("zonure	","small South African lizard","- -"),
                new SimpleList("zooarchaeology	","study of animal remains of archaeological sites","- -"),
                new SimpleList("zoocentric	","centred on the animal world","- -"),
                new SimpleList("zoocephalic	","animal-headed","- -"),
                new SimpleList("zoochemistry	","chemistry of animals","- -"),
                new SimpleList("zoochorous	","of seeds or spores spread by animals","- -"),
                new SimpleList("zoochory	","spread of plant seeds or spores by animals","- -"),
                new SimpleList("zooculture	","domestication of animals","- -"),
                new SimpleList("zoocytium	","a hollow vessel","- -"),
                new SimpleList("zoodikers	","an exclamation","- -"),
                new SimpleList("zoodynamics	","dynamics of animal bodies","- -"),
                new SimpleList("zoogamy	","sexual reproduction of animals","- -"),
                new SimpleList("zoogenic	","produced from animals","- -"),
                new SimpleList("zoogeography	","study of geographic distribution of animals","- -"),
                new SimpleList("zoogeology	","study of fossil animal remains","- -"),
                new SimpleList("zoogonous	","giving birth to live offspring","- -"),
                new SimpleList("zoograft	","tissue from an animal grafted to a human","- -"),
                new SimpleList("zoography	","the painting or description of animals","- -"),
                new SimpleList("zoogyroscope	","device for depicting the movement of animals through rotating images","- -"),
                new SimpleList("zooid	","asexually produced organism resembling an animal","- -"),
                new SimpleList("zoolatry	","excessive devotion to animals or pets","- -"),
                new SimpleList("zoolite	","fossil animal","- -"),
                new SimpleList("zoomagnetism	","animal magnetism","- -"),
                new SimpleList("zoomancy	","divination by observing animals","- -"),
                new SimpleList("zoomania	","insane fondness for animals","- -"),
                new SimpleList("zoometry	","measurement of animals","- -"),
                new SimpleList("zoomimetic	","imitating an animal or part of an animal","- -"),
                new SimpleList("zoomorphic	","having the form or shape of an animal","- -"),
                new SimpleList("zoomorphism	","conception of a god or man in animal form","- -"),
                new SimpleList("zoon	","organism regarded as a complete animal","- -"),
                new SimpleList("zoonic	","of, like or pertaining to or derived from animals","- -"),
                new SimpleList("zoonomy	","animal physiology","- -"),
                new SimpleList("zoonosis	","disease of animals which can be transmitted to humans","- -"),
                new SimpleList("zoonosology	","study of animal diseases","- -"),
                new SimpleList("zoopathology	","study of animal diseases","- -"),
                new SimpleList("zoopery	","experimentation on animals","- -"),
                new SimpleList("zoophagy	","eating animals","- -"),
                new SimpleList("zoophilia	","loving or caring for animals; bestiality","- -"),
                new SimpleList("zoophily	","loving or caring for animals; bestiality","- -"),
                new SimpleList("zoophobia	","fear of animals","- -"),
                new SimpleList("zoophorus	","continuous frieze depicting humans and animals","- -"),
                new SimpleList("zoophysics	","physics of animal bodies","- -"),
                new SimpleList("zoophysiology	","study of physiology of animals","- -"),
                new SimpleList("zoophyte	","plant-like animal such as coral","- -"),
                new SimpleList("zoophytology	","study of plant-like animals","- -"),
                new SimpleList("zoopraxiscope	","device for depicting the movement of animals through rotating images","- -"),
                new SimpleList("zooscopy	","hallucination that one is seeing animals","- -"),
                new SimpleList("zoosemiotics	","study of animal communication","- -"),
                new SimpleList("zoosophy	","knowledge or learning concerning animals","- -"),
                new SimpleList("zootaxy	","science of classifying animals","- -"),
                new SimpleList("zootechnics	","science of breeding animals","- -"),
                new SimpleList("zoothapsis	","premature burial","- -"),
                new SimpleList("zootheism	","attribution of divine qualities to animals","- -"),
                new SimpleList("zootherapy	","veterinary therapeutics","- -"),
                new SimpleList("zootomy	","dissection of animals; comparative anatomy","- -"),
                new SimpleList("zootoxin	","poison derived from animal","- -"),
                new SimpleList("zootrophy	","feeding or tending of animals","- -"),
                new SimpleList("zootype	","animal serving as a type; figure of an animal used to represent a deity","- -"),
                new SimpleList("zopissa	","combination of wax and pitch used for medicinal purposes","- -"),
                new SimpleList("zoppa	","syncopated; limping (in music)","- -"),
                new SimpleList("zoppetto	","medieval Italian limping hop dance","- -"),
                new SimpleList("zori	","Japanese thonged sandals","- -"),
                new SimpleList("zorino	","euphemism for skunk fur","- -"),
                new SimpleList("zoster	","a girdle","- -"),
                new SimpleList("zosteriform	","shaped like a girdle","- -"),
                new SimpleList("zosterops	","small tropical bird with a ring of white feathers around the eyes","- -"),
                new SimpleList("zouk	","Caribbean disco dance and corresponding type of fast rhythmic music","- -"),
                new SimpleList("zounds	","mild oath","- -"),
                new SimpleList("zoysia	","perennial subtropical grass","- -"),
                new SimpleList("zubrowka	","vodka flavoured with sweet-grass","- -"),
                new SimpleList("zucca	","gourd","- -"),
                new SimpleList("zucchetto	","ground skullcap worn by Catholic clergy to indicate rank","- -"),
                new SimpleList("zuche	","tree stump","- -"),
                new SimpleList("zufolo	","small flute used to train songbirds","- -"),
                new SimpleList("zug	","waterproof leather used for boots","- -"),
                new SimpleList("zugtrompete	","slide trumpet","- -"),
                new SimpleList("zugzwang	","chess blockade","- -"),
                new SimpleList("zule	","in heraldry, a chess rook","- -"),
                new SimpleList("zumbador	","South American hummingbird","- -"),
                new SimpleList("zumbooruk	","small cannon carried on the back of a camel","- -"),
                new SimpleList("zuppa	","fish soup","- -"),
                new SimpleList("zurla	","Yugoslavian shawm","- -"),
                new SimpleList("zurna	","Turkish bagpipe or shawm","- -"),
                new SimpleList("zwieback	","sweet toasted biscuit","- -"),
                new SimpleList("zwischenzug	","chess move made to play for time","- -"),
                new SimpleList("zwitterion	","ion carrying both a positive and negative charge","- -"),
                new SimpleList("zydeco	","Louisiana Creole dance music","- -"),
                new SimpleList("zygal	","formed like the letter H; of, like or pertaining to a yoke or union","- -"),
                new SimpleList("zygnomic	","legally supported constraint on human freedom","- -"),
                new SimpleList("zygodactylic	","having two toes in front and two behind","- -"),
                new SimpleList("zygology	","science of joining and fastening","- -"),
                new SimpleList("zygoma	","bony arch on the side of the skull","- -"),
                new SimpleList("zygomorphic	","bilaterally symmetrical","- -"),
                new SimpleList("zygon	","connecting bar","- -"),
                new SimpleList("zygopleural	","bilaterally symmetrical","- -"),
                new SimpleList("zygosis	","conjugation","- -"),
                new SimpleList("zymic	","of, like or pertaining to fermentation","- -"),
                new SimpleList("zymite	","priest using leavened bread during communion","- -"),
                new SimpleList("zymogenic	","causing fermentation","- -"),
                new SimpleList("zymology	","science of fermentation","- -"),
                new SimpleList("zymometer	","instrument for measuring fermentation","- -"),
                new SimpleList("zymosimeter	","instrument for measuring fermentation","- -"),
                new SimpleList("zymosis	","fermentation","- -"),
                new SimpleList("zymotechnics	","the art of fermentation","- -"),
                new SimpleList("zymotic	","of, like or pertaining to fermentation","- -"),
                new SimpleList("zymurgy	","branch of chemistry dealing with brewing and distilling","- -"),
                new SimpleList("zythum	","ancient Egyptian beer","- -"),
                new SimpleList("zyzzyva	","South American weevil","- -")

        };

        //ListAdapter listAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,simpleList);

        ListAdapter listAdapter=new CustomAdapter_z(this,simpleList);

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

                        Intent i=new Intent(z_main.this,Details.class);
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
                String str="z";
                Intent in = new Intent(z_main.this, quizStats.class);
                in.putExtra("val",str);
                startActivity(in);

            }catch (Exception ex){
                new AlertDialog.Builder(z_main.this).setMessage(""+ex).show();
            }

            return true;
        }else if(id == R.id.action_search){
            // get prompts.xml view
            LayoutInflater layoutInflater = LayoutInflater.from(z_main.this);
            View promptView = layoutInflater.inflate(R.layout.input_dialog, null);
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(z_main.this);
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
                                        new AlertDialog.Builder(z_main.this).setTitle(simpleList[i].words+"                        ").setMessage(simpleList[i].meanings+"    \n").show();
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
                                    new AlertDialog.Builder(z_main.this).setTitle("Word List: Oops                           ").setMessage("Word not in out database \n").show();

                                }

                            }catch (Exception ex)
                            {
                                new AlertDialog.Builder(z_main.this).setTitle("Error").setMessage(""+ex).show();
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
                String val="z";
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
                                    String str="z";
                                    Intent in = new Intent(z_main.this, quiz.class);
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
