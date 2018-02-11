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
public class w_main extends ActionBarActivity {
    // private TextView resultText;
    private ListView myList;
    SimpleList simpleList[];
    DatabaseHelper2 db2;
    List<StudentsModel2> list2=new ArrayList<StudentsModel2>();
    // private ArrayList<SimpleList> alist=new ArrayList<SimpleList>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.w_main);

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
                new SimpleList("wade","walk through relatively shallow water","At times it was even needful to take out the loads and, wading knee-deep in the ice-cold waters, drag the boats across the many shoals.  -- Greely, Adolphus W."),
                new SimpleList("waffle","pancake batter baked in an iron","Emmy Lou getting down from the breakfast table, her still unfinished waffle abandoned for all time now, was dumbfounded.  -- Martin, George Madden"),
                new SimpleList("waft","be driven or carried along, as by the air","We were again wafted through the air, and were once more moving over the tops of countless houses on the way.  -- Suyematsu, Baron Kencho"),
                new SimpleList("waggish","witty or joking","Dinner, however, came, and the little waggish doctor could not, for the life of him, avoid his jokes.  -- Carleton, William"),
                new SimpleList("waif","a homeless child especially one forsaken or orphaned","Had they not been poor children, little waifs, they would not have been locked in the cabin to perish like rats.  -- Debs, Eugene V."),
                new SimpleList("wail","a cry of sorrow and grief"," Is our house going to be covered in mud forever?  she wailed, tears streaming down her cheeks.  -- New York Times (Sep 11, 2011)"),
                new SimpleList("waive","do without or cease to hold or adhere to","Before Australian authorities would release Watson to the United States, Alabama had to agree to waive the death penalty as a possible punishment, prosecutors said.  -- Reuters (Feb 13, 2012)"),
                new SimpleList("waiver","a formal written statement of relinquishment","The new federal health care law prohibits lowering Medicaid eligibility, and only a few states have received waivers to do so on a limited basis.  -- New York Times (Dec 23, 2011)"),
                new SimpleList("wallow","devote oneself entirely to something","It was a crushing blow, but instead of wallowing in depression and giving up on being active, Irish started biking more.  -- Seattle Times (Aug 17, 2011)"),
                new SimpleList("wan","lacking vitality as from weariness or illness or unhappiness","Tom was leaning back, pale and exhausted, his breath was short, his face gray, wan and wasted.  -- Wood, Mrs. Henry"),
                new SimpleList("wanderlust","very strong or irresistible impulse to travel","Perhaps a trip like this would have satisfied his wanderlust.  -- Ferber, Edna"),
                new SimpleList("wane","a gradual decline (in size or strength or power or number)","India's biggest producer, reported an 89 percent decline in second-quarter group profit because of waning demand and higher raw material costs at its European operations.  -- BusinessWeek (Nov 10, 2011)"),
                new SimpleList("wangle","accomplishing something by scheming or trickery","You went sick When orders looked unwholesome: then, with trick And lie, you wangled home.  -- Sassoon, Siegfried"),
                new SimpleList("wanton","spend wastefully","A hundred eighty days continuous feast He has oppressed the people of his rule With drunken revels and with wanton waste.  -- Noe, Cotton"),
                new SimpleList("warble","sing or play with trills","Any singer who could warble away at runs and trills was a great artist. -- Cooke, James Francis"),
                new SimpleList("wardrobe","collection of clothing belonging to one person","Betty wore amazingly costly clothes, paying for a single dress far more than for her year's wardrobe in Rhode Island.  -- Terhune, Albert Payson"),
                new SimpleList("warrant","show to be reasonable or provide adequate ground for","An inmate needs additional evidence of a separate constitutional violation to warrant a federal court's involvement, the high court ruled.  -- BusinessWeek (Feb 27, 2012)"),
                new SimpleList("warranty","written assurance that a product or service will be provided","Such sales to investors typically came with promises, known as representations and warranties, to buy back defective loans.  -- BusinessWeek (Feb 8, 2012)"),
                new SimpleList("warren","a series of underground tunnels occupied by rabbits","Their entrances were cunningly contrived to look like rabbit holes, so that strangers might think they led to nothing more than some sandy warren.  -- Gask, Lilian"),
                new SimpleList("wary","openly distrustful and unwilling to confide","Many chronic homeless people, however, after years on the street, become wary of shelters and sleeping near others.  -- New York Times (Jan 5, 2012)"),
                new SimpleList("watershed","the geographical area drained by a river and its tributaries","The Coles Hill watershed eventually drains into the drinking water supply for coastal cities.  -- New York Times (Dec 1, 2011)"),
                new SimpleList("waver","be unsure or weak","Those among the tribes who had thus far stood neutral, wavering between the French and English, now hesitated no longer.  -- Parkman, Francis"),
                new SimpleList("wax","go up or advance","Carols had existed for centuries, though their popularity waxed and waned as different governments and religious movements periodically declared them sinful.  -- Time (Dec 12, 2011)"),
                new SimpleList("waylay","wait in hiding to attack","Some of them even waited until I ventured from the house, and waylaid me on the road.  -- Bartlett, Frederick Orin"),
                new SimpleList("wayward","resistant to guidance or discipline","Substance addiction and wayward behaviour are not unheard of in someone with such a stormy family background.  -- The Guardian (Jul 7, 2010)"),
                new SimpleList("wean","gradually deprive of mother's milk","If the mother becomes pregnant it will be necessary to wean, because pregnancy invariably affects the quality of the milk.  -- Hague, W. Grant (William Grant)"),
                new SimpleList("weary","physically and mentally fatigued","The tired, wearied, exhausted cattle refused to struggle through the snow-mountains any longer.  -- Harper, Charles G. (Charles George)"),
                new SimpleList("welfare","governmental provision of assistance to persons in need","High welfare costs in an impoverished country also ensure that the government does not have enough funds to spend on primary education and infrastructure.  -- New York Times (May 23, 2012)"),
                new SimpleList("welter","a confused multitude of things","Of the nonseafood starters, artichoke hearts were slightly lost in a welter of cherry peppers, cubed eggplant, pine nuts and bits of ch�vre. -- New York Times (Apr 7, 2012)"),
                new SimpleList("wend","direct one's course or way","I thought a night of peace and quietness preferable, although perhaps very unsportsmanlike, and so we wended our way homeward.  -- Various"),
                new SimpleList("wharf","a platform from the shore that provides access to ships","They would wonder why she was not on the wharf when the boat got in, to meet them.  -- Prichard, Katharine Susannah"),
                new SimpleList("wheedle","influence or urge by gentle urging, caressing, or flattering","Horace knew exactly the right way to wheedle his mother, and very soon persuaded her to allow them to start on their expedition.  -- Dixon, Arthur A."),
                new SimpleList("whelp","young of any of various canines such as a dog or wolf","The wolf must have had several litters of whelps during the six or seven years that the boy was with her.  -- Sleeman, William"),
                new SimpleList("whet","make keen or more acute","How good that dinner did smell to the hungry boys with appetites whetted by exercise in the keen air!  -- Burgess, Thornton W. (Thornton Waldo)"),
                new SimpleList("whiff","perceive by inhaling through the nose","Perhaps he had even got a whiff of the sweet on the spring air, and his nose had told him what was going on.  -- Copeland, Charles"),
                new SimpleList("whim","a sudden desire","Too many frivolous youngsters were falling in love and eloping on a whim, only to have their marriages end in divorce.  -- New York Times (Jul 11, 2011)"),
                new SimpleList("whimsical","determined by chance or impulse rather than by necessity","Norway has bragged about her prerogatives without any feeling of responsibility, like an unreasoning whimsical child.  -- Nordlund, Karl"),
                new SimpleList("whit","a tiny or scarcely detectable amount","Now, we are exactly what and where we used to be: not a whit wiser nor better, poorer nor prouder.  -- Lever, Charles James"),
                new SimpleList("whittle","cut small bits or pare shavings from","Too bad your horse fell, he remarked stupidly, gathering up the handful of shavings he had whittled from a piece of pine board.  -- Bower, B. M."),
                new SimpleList("wholly","to the full or entire extent","Dalmatia has been possessed wholly or in part by Romans, Goths, Slavs, Hungarians, Turks, Venetians.  -- Hichens, Robert (Robert Smythe)"),
                new SimpleList("whorl","a round shape formed by a series of concentric circles","Univalves are conical and spiraling, with a series of whorls coming down like widening steps from the tiny nucleus on top.  -- Shell Union Oil Corporation"),
                new SimpleList("widespread","distributed over a considerable extent","As more women share their experiences, it is clear how widespread domestic violence is, cutting across community, caste and economic lines.  -- New York Times (Mar 27, 2012)"),
                new SimpleList("wield","handle effectively","For all a chimpanzee's impressive arm strength, he said, humans are much better at wielding a hammer to crack open a nut.  -- New York Times (Feb 27, 2012)"),
                new SimpleList("willful","done by design","It was a plain case of willful, deliberate and premeditated murder.  -- Post, Melville Davisson"),
                new SimpleList("wily","marked by skill in deception","Thank you, my kind friend; and the wily villain continued his deceiving tale, with an eloquence we will not trouble ourselves to repeat.  -- Aguilar, Grace"),
                new SimpleList("wince","the facial expression of sudden pain","His fingers buried themselves in Meredith's shoulder, till the pale face winced with pain.  -- Goodchild, George"),
                new SimpleList("windfall","a sudden happening that brings good fortune","House prices doubled in the golden decade but that unearned windfall for the lucky generation went untaxed.  -- The Guardian (Oct 25, 2010)"),
                new SimpleList("winnow","the act of separating grain from chaff","Mr. Thompson winnowed out the chaff from the heap, and has given us the golden grain in this volume.  -- Upton, George P. (George Putnam)"),
                new SimpleList("winsome","charming in a childlike or naive way","She was an awkward-looking girl about fourteen, all arms and elbows, but with a rather winsome face lighted by big, serious eyes.  -- Halsey, Rena I."),
                new SimpleList("wispy","thin and weak","He was a little dark man, with a very big forehead, thin, wispy hair, and sad, large eyes.  -- Lawrence, D. H. (David Herbert)"),
                new SimpleList("wistful","showing pensive sadness","She watched the firelight dancing on Al's sombre face, softening its hardness, making it almost wistful when he gazed thoughtfully into the coals.  -- Bower, B. M."),
                new SimpleList("wistfully","in a pensively sad manner","While deeply absorbed in sad reflection, Dorothy stole to his side and, looking up, wistfully, in his face, said:  Dear papa, isn't mama here, either?   -- Rice, Alfred Ernest"),
                new SimpleList("wit","verbal skill that has the power to evoke laughter","So saying, the duke, as if charmed with his own wit, burst into a loud and long peal of laughter.  -- Sue, Eug�ne"),
                new SimpleList("withdraw","remove (a commodity) from (a supply source)","As most shops and businesses stayed closed in Cairo, people rushed to withdraw money from bank cash machines.  -- BBC (Jan 30, 2011)"),
                new SimpleList("withdrawal","the act of ceasing to participate in an activity","Starting in the early 20th century, another key factor in diagnosing addiction was the occurrence of physical withdrawal symptoms upon quitting the substance in question.  -- New York Times (Jun 5, 2012)"),
                new SimpleList("withdrawn","tending to reserve or introspection","But they were worried that their son, whose sister was eight years younger, was too solitary and withdrawn.  -- The Guardian (Aug 8, 2010)"),
                new SimpleList("wither","shrink, as with a loss of moisture","While summer withered some crops, a hillside dip or rock outcropping might shelter just enough moisture for other plants to survive.  -- US News (Dec 7, 2011)"),
                new SimpleList("withered","lean and wrinkled by shrinkage as from age or illness","My old, withered, dry eyes are full of tears yet.  -- Herndon, William H."),
                new SimpleList("withhold","retain and refrain from disbursing, of payments","David A. Paterson, arguing that his decision to unilaterally withhold hundreds of millions of dollars in scheduled payments to school districts violated New York's Constitution.  -- New York Times (Dec 17, 2009)"),
                new SimpleList("withstand","resist or confront with resistance","Winter is coming and the scramble is on to amass enough warm sleeping bags and clothing so that the occupiers could withstand below freezing temperatures.  -- Time (Oct 25, 2011)"),
                new SimpleList("witless","lacking sense or understanding or judgment","Wah! they were like a flock of sheep, witless, huddling together, springing this way and that without any sense.  -- Strang, Herbert"),
                new SimpleList("witticism","a message whose ingenuity has the power to evoke laughter","We laughed amazingly at your epigrammatic witticisms; your reputation is already established here.  -- Various"),
                new SimpleList("witty","combining clever conception and facetious expression","I accept the augury, cried Frederick, laughing heartily at the witty misapplication of the phrase, and resumed his seat once more.  -- Lever, Charles James"),
                new SimpleList("wizardry","exceptional creative ability","When it came to word wizardry, he had Billy Sunday, master of slang and argot of one language, skinned by miles.  -- London, Jack"),
                new SimpleList("wizened","lean and wrinkled by shrinkage as from age or illness","Old Harry grinned, crinkling up his wizened face in a mass of fine wrinkles.  -- Garrett, Randall"),
                new SimpleList("woe","misery resulting from affliction","Big businesses that have gone bankrupt: Facing scandal, shrinking profits or other woes, these big-name firms have filed for Chapter 11 bankruptcy in recent months.  -- Washington Post (May 14, 2012)"),
                new SimpleList("wondrous","extraordinarily good or great","Looking at his work now, though, it strikes me that what he actually did, more often than not, was make the commonplace wondrous and beautiful.  -- The Guardian (Aug 18, 2010)"),
                new SimpleList("wont","an established custom","In the queen's time he was wont to go out of town every Saturday at ten o'clock, or on holiday eves.  -- Hindley, Charles"),
                new SimpleList("worldly","characteristic of secularity rather than spirituality","Not far away were all their worldly possessions, a rusty stove, two cots, bedding and a box of cooking pans.  -- Wirt, Mildred A. (Mildred Augustine)"),
                new SimpleList("wraith","a mental representation of some haunting experience","R. R. is dead, thank God, and her unhappy wraith will haunt your path no more.  -- Caine, Hall, Sir"),
                new SimpleList("wrangle","an instance of intense argument, as in bargaining","Their women are quarrelsome, and wrangle over payment when selling their wares.  -- Russell, R. V. (Robert Vane)"),
                new SimpleList("wrath","intense anger, usually on an epic scale","  Wrath  differs from  anger  in so far as it may be called anger boiling over.  -- Maclaren, Alexander"),
                new SimpleList("wreak","cause to happen or to occur as a consequence","Giant solar storms can wreak havoc on satellites and power grids.  -- New York Times (Mar 8, 2012)"),
                new SimpleList("wrench","a hand tool that is used to hold or twist a nut or bolt","The housewife watched him as he gave the nut a final twist with his wrench and stood up.  -- Knight, David C."),
                new SimpleList("wrest","obtain by seizing forcibly or violently, also metaphorically","The crazed strikers fought without weapons, except such as they could wrest from the soldiers.  -- Stocking, Charles Francis"),
                new SimpleList("wretched","deserving or inciting pity","She says,  No.   Do have pity--I am so wretched; it is only a little favour I ask of you.   -- Webster, Wentworth"),
                new SimpleList("wring","twist, squeeze, or compress in order to extract liquid","When it had been finished, everyone was, in spite of slickers and gas suits, so drenched that water could be wrung out of every garment.  -- Kilner, Frederic R."),
                new SimpleList("writ","a legal document issued by a court or judicial officer","The court publicly decided against the writs but secretly issued them.  -- Judson, L. Carroll"),
                new SimpleList("writhe","to move in a twisting or contorted motion","His writhing, squirming twists would have made a circus contortionist gasp.  -- Standish, Burt L."),
                new SimpleList("wrought","shaped to fit by altering the contours of a pliable mass","Forging and Welding.--The process of pressing or hammering wrought iron when at a red or white heat into any desired shape is called forging.  -- Low, David Allan"),
                new SimpleList("wack	","old name for decomposed basalt","- -"),
                new SimpleList("wadmal	","thick coarse wool","- -"),
                new SimpleList("waftage	","transportation through water or air","- -"),
                new SimpleList("wafture	","act of waving or wafting","- -"),
                new SimpleList("wagonette	","carriage with one crosswise seat in front, two seats in back","- -"),
                new SimpleList("wagtail	","an obsequious person; a harlot","- -"),
                new SimpleList("wainage	","team and implements needed for cultivation of land","- -"),
                new SimpleList("wainscot	","to line with boards or panels; fine oak panelling","- -"),
                new SimpleList("wair	","timber of six feet in length and one foot in width","- -"),
                new SimpleList("waits	","musicians employed to play on ceremonial occasions","- -"),
                new SimpleList("wakerife	","wakeful; indisposed to sleep","- -"),
                new SimpleList("waldflute	","organ flute stop of 4 feet in length","- -"),
                new SimpleList("waldgrave	","old German title of nobility","- -"),
                new SimpleList("waldhorn	","French valveless hunting horn","- -"),
                new SimpleList("wale	","to choose; the act of choosing","- -"),
                new SimpleList("walleteer	","one who carries a wallet","- -"),
                new SimpleList("wallfish	","snail","- -"),
                new SimpleList("wallflower	","yellowish-red","- -"),
                new SimpleList("wallydrag	","feeble or worthless person or animal","- -"),
                new SimpleList("walm	","to spout; to boil up","- -"),
                new SimpleList("walty	","inclined to tip over or lean","- -"),
                new SimpleList("wamble	","churning of the stomach; wobbling or rolling motion","- -"),
                new SimpleList("wame	","the womb or belly; a protuberant hollow part","- -"),
                new SimpleList("wamus	","cardigan or jacket buttoned at neck and wrists","- -"),
                new SimpleList("wanchancy	","unlucky; uncanny","- -"),
                new SimpleList("wang	","the cheek; a molar","- -"),
                new SimpleList("wanhope	","despair","- -"),
                new SimpleList("wanigan	","pay office in a lumber camp","- -"),
                new SimpleList("wanion	","ill luck; misfortune","- -"),
                new SimpleList("wankle	","unstable or unsteady","- -"),
                new SimpleList("wantage	","deficiency; shortage","- -"),
                new SimpleList("wanze	","to decrease; to waste away","- -"),
                new SimpleList("wapenshaw	","periodic gathering to evaluate readiness of men for combat","- -"),
                new SimpleList("wapentake	","archaic sub-division of certain counties","- -"),
                new SimpleList("wapiti	","elk","- -"),
                new SimpleList("waqf	","charitable donation for Islamic religious purposes","- -"),
                new SimpleList("warble	","small tumour suffered by horses under the saddle area","- -"),
                new SimpleList("wardcorn	","payment of corn in place of military service","- -"),
                new SimpleList("warden	","kind of pear used in cooking","- -"),
                new SimpleList("wardmote	","meeting of a ward or a court of a ward","- -"),
                new SimpleList("wardroom	","quarters for ship's officers","- -"),
                new SimpleList("warison	","wealth; reward; punishment","- -"),
                new SimpleList("warrantise	","the act of guaranteeing or warranting; an assurance","- -"),
                new SimpleList("warray	","to make war on","- -"),
                new SimpleList("warren	","heart-shaped hoe","- -"),
                new SimpleList("warrener	","keeper of a warren of rabbits","- -"),
                new SimpleList("wase	","small bundle of hay or straw for resting one's head","- -"),
                new SimpleList("washball	","ball of toilet soap","- -"),
                new SimpleList("washboard	","broad thin plank along ship's gunwale to keep out sea water","- -"),
                new SimpleList("washery	","location where industrial washing takes place","- -"),
                new SimpleList("washeteria	","laundromat or launderette","- -"),
                new SimpleList("washland	","area periodically flooded by river","- -"),
                new SimpleList("wasm	","an outdated policy, doctrine or theory","- -"),
                new SimpleList("wassail	","toast to someone's health; to go caroling or carousing; spiced ale","- -"),
                new SimpleList("wasserman	","man-shaped sea monster","- -"),
                new SimpleList("wastel	","sweet flaky bread made with fine flour and butter","- -"),
                new SimpleList("wastelot	","unused lot of land in a built-up area","- -"),
                new SimpleList("waster	","wooden sword used for practicing fencing","- -"),
                new SimpleList("wastive	","liable to waste","- -"),
                new SimpleList("watchet	","pale blue","- -"),
                new SimpleList("watchglass	","small dish used for holding small amounts of a solution","- -"),
                new SimpleList("watching	","fully afloat","- -"),
                new SimpleList("waterage	","fee paid for travelling on water","- -"),
                new SimpleList("waterish	","resembling or filled with water; insipid or diluted","- -"),
                new SimpleList("waterman	","boatman or ferryman","- -"),
                new SimpleList("waterwork	","piece of fabric painted to resemble a tapestry","- -"),
                new SimpleList("wattmeter	","instrument for measuring electrical power","- -"),
                new SimpleList("waulk	","to full cloth","- -"),
                new SimpleList("waulker	","cloth fuller","- -"),
                new SimpleList("wavemeter	","instrument for measuring wavelengths","- -"),
                new SimpleList("waveson	","goods floating on the sea after a shipwreck","- -"),
                new SimpleList("waxcloth	","oilcloth; linoleum","- -"),
                new SimpleList("wayboard	","thin geological seam separating larger strata","- -"),
                new SimpleList("waygone	","exhausted from long travels","- -"),
                new SimpleList("wayment	","lamentation; grief","- -"),
                new SimpleList("waywiser	","instrument for measuring distance travelled","- -"),
                new SimpleList("wayzgoose	","annual employees' dinner or outing","- -"),
                new SimpleList("wear	","to turn a ship's stern to windward to alter its course","- -"),
                new SimpleList("wearish	","tasteless; savourless","- -"),
                new SimpleList("weasand	","the gullet or windpipe","- -"),
                new SimpleList("weatherboard	","weather side of a ship","- -"),
                new SimpleList("weatherly	","able to sail close to the wind with little leeway","- -"),
                new SimpleList("weatherometer	","instrument for measuring weather-resisting properties of paint","- -"),
                new SimpleList("webcast	","live broadcast transmitted on the World Wide Web","- -"),
                new SimpleList("weber	","unit of magnetic flux equal to 100 million maxwells","- -"),
                new SimpleList("webster	","a female weaver","- -"),
                new SimpleList("webwheel	","wheel in which spokes, rim and centre made from one piece of material","- -"),
                new SimpleList("wedeln	","skiing in a swiveling motion with skis close together","- -"),
                new SimpleList("weed	","garment or outfit worn during mourning","- -"),
                new SimpleList("weedicide	","something that kills weeds","- -"),
                new SimpleList("weedy	","dressed in widow's mourning clothes","- -"),
                new SimpleList("weftage	","texture","- -"),
                new SimpleList("wegotism	","excessive use of the pronoun 'we' in speech or writing","- -"),
                new SimpleList("weighage	","fee paid for weighing goods","- -"),
                new SimpleList("weirdward	","bordering upon the supernatural","- -")

        };

        //ListAdapter listAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,simpleList);

        ListAdapter listAdapter=new CustomAdapter_w(this,simpleList);

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

                        Intent i=new Intent(w_main.this,Details.class);
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
                String str="w";
                Intent in = new Intent(w_main.this, quizStats.class);
                in.putExtra("val",str);
                startActivity(in);

            }catch (Exception ex){
                new AlertDialog.Builder(w_main.this).setMessage(""+ex).show();
            }

            return true;
        }else if(id == R.id.action_search){
            // get prompts.xml view
            LayoutInflater layoutInflater = LayoutInflater.from(w_main.this);
            View promptView = layoutInflater.inflate(R.layout.input_dialog, null);
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(w_main.this);
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
                                        new AlertDialog.Builder(w_main.this).setTitle(simpleList[i].words+"                        ").setMessage(simpleList[i].meanings+"    \n").show();
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
                                    new AlertDialog.Builder(w_main.this).setTitle("Word List: Oops                           ").setMessage("Word not in out database \n").show();

                                }

                            }catch (Exception ex)
                            {
                                new AlertDialog.Builder(w_main.this).setTitle("Error").setMessage(""+ex).show();
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
                String val="w";
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
                                    String str="w";
                                    Intent in = new Intent(w_main.this, quiz.class);
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
