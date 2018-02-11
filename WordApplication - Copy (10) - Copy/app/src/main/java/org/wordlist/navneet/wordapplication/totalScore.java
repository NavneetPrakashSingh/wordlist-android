package org.wordlist.navneet.wordapplication;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.navneet.wordapplication.R;

import org.achartengine.ChartFactory;
import org.achartengine.GraphicalView;
import org.achartengine.model.CategorySeries;
import org.achartengine.model.SeriesSelection;
import org.achartengine.renderer.DefaultRenderer;
import org.achartengine.renderer.SimpleSeriesRenderer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Navneet on 8/15/2015.
 */
public class totalScore extends Activity {


    DatabaseHelper3 db3;
    List<StudentsModel3> list=new ArrayList<StudentsModel3>();
    ArrayList<String> lst=new ArrayList<String>();
    SimpleList2 simpleList2[];
    SimpleList2 simpleList3[];
    List<SimpleList2> mylist=new ArrayList<SimpleList2>();
    List<SimpleList2> lst1=new ArrayList<SimpleList2>();
    int ans=0;

    private static int[] COLORS = new int[] { Color.parseColor("#34495e"), Color.parseColor("#9b59b6"),Color.parseColor("#3498db"),Color.parseColor("#2ecc71"),Color.parseColor("#1abc9c"),Color.parseColor("#f1c40f"),Color.parseColor("#e67e22"),Color.parseColor("#e74c3c"),Color.parseColor("#7eeda2"),Color.parseColor("#fcac3a"),Color.parseColor("#5c3170"),Color.parseColor("#6ab3a8"),Color.parseColor("#ffc89a"),Color.parseColor("#9999ff"),Color.parseColor("#308dd4"),Color.parseColor("#8dd430"),Color.parseColor("#ffd700"),Color.parseColor("#006633"),Color.parseColor("#660033"),Color.parseColor("#003366"),Color.parseColor("#006666"),Color.parseColor("#5c1806"),Color.parseColor("#d41243"),Color.parseColor("#f47835"),Color.parseColor("#a200ff"),Color.parseColor("#00aedb") };

    // need to make changes here, will replace array with a list
    private static double[] VALUES = new double[] { 10, 11, 12, 13 };

    private static String[] NAME_LIST = new String[] { "A", "B", "C", "D" };

    private CategorySeries mSeries = new CategorySeries("");

    private DefaultRenderer mRenderer = new DefaultRenderer();

    private GraphicalView mChartView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.progress_score);





        //for animating to another page
        try {
            Button switchButton = (Button) findViewById(R.id.switchbutton);

            if(ans%2==0){
                switchButton.setText("Your Score");
            }else{
                switchButton.setText("Total Score");
            }

            switchButton.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    Intent intent = new Intent();
                    intent.setClass(totalScore.this, progressScores.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.left_out, R.anim.right_in);
                    ans++;

                }
            });
        }catch (Exception ex){
            new AlertDialog.Builder(this).setMessage(""+ex).show();
        }


        try{
            db3 = new DatabaseHelper3(getApplicationContext());


            list = db3.getAllStudentsList();

            int index=0;
            String str="";
            char ch=' ';
            simpleList3 = new SimpleList2[list.size()];

            try {
                double dd1, dd2;
                boolean checkIfExistsInList;
                int chkIndex;
                for (char n = 'a'; n < 'z'; n++) {
                    //checkIfExistsInList = false;
                    dd1 = 0.0;
                    dd2 = 0.0;
                    chkIndex=0;

                    for (int i = 0; i < list.size(); i++) {
                        // lst1.add(new SimpleList2(list.get(i).id, Double.parseDouble(list.get(i).meaning.toString()), Double.parseDouble(list.get(i).meaning), Double.parseDouble(list.get(i).sentence)));

                        if (list.get(i).word.equals(Character.toString(n))) {
                            // checkIfExistsInList = true;
                            chkIndex++;
                            str = list.get(i).word;
                            dd1 = dd1 + Double.parseDouble(list.get(i).meaning);
                            dd2 = dd2 + Double.parseDouble(list.get(i).sentence);
                            ch = n;
                            //break;
                            //new AlertDialog.Builder(this).setMessage(""+Character.toString(n)+"---"+i+"---"+dd1).show();
                        }
                    }
                    //new AlertDialog.Builder(this).setTitle("Inside for").setMessage("" + dd1 + "----" + dd2).show();
                    if(chkIndex !=0)
                        mylist.add(new SimpleList2(0, str, dd1, dd2));



                }
            }catch (Exception ex){
                new AlertDialog.Builder(this).setMessage(""+ex).show();
            }





            for(int i=0;i<mylist.size();i++){

                simpleList3[i]=new SimpleList2(i,mylist.get(i).words,mylist.get(i).meanings,mylist.get(i).sentence);
                index++;

            }

//           for(int i=0;i<3;i++){
//               new AlertDialog.Builder(this).setMessage(""+simpleList3[i].words+"--"+simpleList2[i].meanings).show();
//           }

            //
            simpleList2 = new SimpleList2[list.size()];
            //   String str = "";

//           Double d1,d2,d3;
//            //simpleList2=new SimpleList2[]{
//            for (int i = 0; i < list.size(); i++) {
//
//                d1=Double.parseDouble(list.get(i).meaning);
//                d2=Double.parseDouble(list.get(i).sentence);
//                simpleList2[i] = new SimpleList2(list.get(i).id,list.get(i).word,d1,d2);
//                //simpleList2[i] = new SimpleList2(list.get(i).id, list.get(i).word, list.get(i).meaning, list.get(i).sentence);
//
//                str = list.get(i).word + "--" + list.get(i).meaning + "---" + list.get(i).sentence;
//
//            }


            if(list.size()==0){
                new AlertDialog.Builder(this).setMessage("Looks like you haven't taken any quiz yet, please do take and come back here to mark your progress").show();
            }

        }catch (Exception ex){
            new AlertDialog.Builder(this).setMessage(""+ex).show();
        }


        mRenderer.setApplyBackgroundColor(true);
        mRenderer.setBackgroundColor(Color.argb(100, 50, 50, 50));
        mRenderer.setChartTitleTextSize(80);
        mRenderer.setLabelsTextSize(50);
        mRenderer.setLegendTextSize(50);
        mRenderer.setMargins(new int[] { 20, 30, 15, 0 });
        mRenderer.setZoomButtonsVisible(true);
        mRenderer.setStartAngle(90);

//        for (int i = 0; i < VALUES.length; i++) {
//            mSeries.add(NAME_LIST[i] + " " + VALUES[i], VALUES[i]);
//            SimpleSeriesRenderer renderer = new SimpleSeriesRenderer();
//            renderer.setColor(COLORS[(mSeries.getItemCount() - 1) % COLORS.length]);
//            mRenderer.addSeriesRenderer(renderer);
//        }
//
//        if (mChartView != null) {
//            mChartView.repaint();
//        }

        Double dd=0.0;
        for (int i = 0; i < mylist.size(); i++) {
            dd=simpleList3[i].sentence;
            mSeries.add(simpleList3[i].words + " " + dd, dd);
            SimpleSeriesRenderer renderer = new SimpleSeriesRenderer();
            renderer.setColor(COLORS[(mSeries.getItemCount() - 1) % COLORS.length]);
            mRenderer.addSeriesRenderer(renderer);
        }

        if (mChartView != null) {
            mChartView.repaint();
        }

    }




    @Override
    protected void onResume() {
        super.onResume();
        //overridePendingTransition(R.anim.left_out, R.anim.right_in);
        if (mChartView == null) {
            LinearLayout layout = (LinearLayout) findViewById(R.id.chart);
            mChartView = ChartFactory.getPieChartView(this, mSeries, mRenderer);
            mRenderer.setClickEnabled(true);
            mRenderer.setSelectableBuffer(10);

            mChartView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    SeriesSelection seriesSelection = mChartView.getCurrentSeriesAndPoint();

                    if (seriesSelection == null) {
                        Toast.makeText(totalScore.this, "No chart element was clicked", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(totalScore.this,"Chart element data point index "+ (seriesSelection.getPointIndex()+1) + " was clicked" + " point value="+ seriesSelection.getValue(), Toast.LENGTH_SHORT).show();
                    }
                }
            });

            mChartView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    SeriesSelection seriesSelection = mChartView.getCurrentSeriesAndPoint();
                    if (seriesSelection == null) {
                        Toast.makeText(totalScore.this,"No chart element was long pressed", Toast.LENGTH_SHORT);
                        return false;
                    } else {
                        Toast.makeText(totalScore.this,"Chart element data point index "+ seriesSelection.getPointIndex()+ " was long pressed",Toast.LENGTH_SHORT);
                        return true;
                    }
                }
            });
            layout.addView(mChartView, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.FILL_PARENT));
        }
        else {
            mChartView.repaint();
        }
    }

    public class SimpleList2{
        public String words;
        public Double meanings;
        public Double sentence;
        public int id;

        public SimpleList2(){}

        public SimpleList2(int id,String word, Double meaning, Double sentence ){
            this.id=id;
            this.words=word;
            this.meanings=meaning;
            this.sentence=sentence;

        }
    }


}
