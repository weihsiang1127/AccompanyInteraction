package com.example.parent_app;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;

public class record extends AppCompatActivity {
    ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();//取得所有資料

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record);

        //建立共用變數類別
        GlobalVariable gv = (GlobalVariable)getApplicationContext();

        //宣告RadioButton物件
        RadioButton r1 =findViewById(R.id.r1);
        RadioButton r2 =findViewById(R.id.r2);

        //宣告TextView物件
        TextView t1=findViewById(R.id.t1);
        TextView t2=findViewById(R.id.t2);
        TextView t3=findViewById(R.id.t3);
        TextView t4=findViewById(R.id.t4);
        TextView t5=findViewById(R.id.t5);
        TextView t6=findViewById(R.id.t6);
        TextView t7=findViewById(R.id.t7);
        TextView t8=findViewById(R.id.t8);
        TextView t9=findViewById(R.id.t9);
        TextView t10=findViewById(R.id.t10);
        TextView t11=findViewById(R.id.t11);
        TextView t12=findViewById(R.id.t12);
        TextView t13=findViewById(R.id.t13);
        TextView t14=findViewById(R.id.t14);
        TextView t15=findViewById(R.id.t15);
        TextView t16=findViewById(R.id.t16);
        TextView t17=findViewById(R.id.t17);
        TextView t18=findViewById(R.id.t18);
        TextView t19=findViewById(R.id.t19);
        TextView t20=findViewById(R.id.t20);
        TextView t21=findViewById(R.id.t21);
        TextView t22=findViewById(R.id.t22);
        TextView t23=findViewById(R.id.t23);
        TextView t24=findViewById(R.id.t24);
        TextView t25=findViewById(R.id.t25);
        TextView t26=findViewById(R.id.t26);
        TextView t27=findViewById(R.id.t27);
        TextView t28=findViewById(R.id.t28);
        TextView textView=findViewById(R.id.textView);
        TextView textView1=findViewById(R.id.textView1);
        TextView textView2=findViewById(R.id.textView2);
        TextView textView3=findViewById(R.id.textView3);
        TextView textView4=findViewById(R.id.textView4);
        TextView textView5=findViewById(R.id.textView5);
        TextView textView6=findViewById(R.id.textView6);
        TextView textView7=findViewById(R.id.textView7);
        TextView textView8=findViewById(R.id.textView8);
        TextView textView9=findViewById(R.id.textView9);
        TextView textView10=findViewById(R.id.textView10);
        TextView textView11=findViewById(R.id.textView11);
        TextView textView12=findViewById(R.id.textView12);
        TextView textView13=findViewById(R.id.textView13);
        TextView textView14=findViewById(R.id.textView14);
        TextView textView15=findViewById(R.id.textView15);
        TextView textView16=findViewById(R.id.textView16);
        TextView textView17=findViewById(R.id.textView17);
        TextView textView18=findViewById(R.id.textView18);
        TextView textView19=findViewById(R.id.textView19);
        TextView textView20=findViewById(R.id.textView20);
        TextView textView21=findViewById(R.id.textView21);
        TextView textView22=findViewById(R.id.textView22);
        TextView textView23=findViewById(R.id.textView23);
        TextView textView24=findViewById(R.id.textView24);
        TextView textView25=findViewById(R.id.textView25);
        TextView textView26=findViewById(R.id.textView26);
        TextView textView27=findViewById(R.id.textView27);
        TextView textView28=findViewById(R.id.textView28);

        textView.setText(gv.getstatistics()+"填寫紀錄");

        Thread thread1 = new Thread() {
            @Override
            public void run ( ) {
                MysqlCon con = new MysqlCon();
                con.run();
                arrayList=con.getdisorders(gv.getuser());
            };
        };

        thread1.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Log.v("DB", "寫入資料完成：" + arrayList);


        if(arrayList.get(0).get("q1").equals("1")){
            textView1.setText("從不這樣");
        }
        if(arrayList.get(0).get("q1").equals("2")){
            textView1.setText("很少這樣");
        }
        if(arrayList.get(0).get("q1").equals("3")){
            textView1.setText("有時這樣");
        }
        if(arrayList.get(0).get("q1").equals("4")){
            textView1.setText("經常這樣");
        }
        if(arrayList.get(0).get("q1").equals("5")){
            textView1.setText("總是這樣");
        }

        if(arrayList.get(0).get("q2").equals("1")){
            textView2.setText("從不這樣");
        }
        if(arrayList.get(0).get("q2").equals("2")){
            textView2.setText("很少這樣");
        }
        if(arrayList.get(0).get("q2").equals("3")){
            textView2.setText("有時這樣");
        }
        if(arrayList.get(0).get("q2").equals("4")){
            textView2.setText("經常這樣");
        }
        if(arrayList.get(0).get("q2").equals("5")){
            textView2.setText("總是這樣");
        }

        if(arrayList.get(0).get("q3").equals("1")){
            textView3.setText("從不這樣");
        }
        if(arrayList.get(0).get("q3").equals("2")){
            textView3.setText("很少這樣");
        }
        if(arrayList.get(0).get("q3").equals("3")){
            textView3.setText("有時這樣");
        }
        if(arrayList.get(0).get("q3").equals("4")){
            textView3.setText("經常這樣");
        }
        if(arrayList.get(0).get("q3").equals("5")){
            textView3.setText("總是這樣");
        }

        if(arrayList.get(0).get("q4").equals("1")){
            textView4.setText("從不這樣");
        }
        if(arrayList.get(0).get("q4").equals("2")){
            textView4.setText("很少這樣");
        }
        if(arrayList.get(0).get("q4").equals("3")){
            textView4.setText("有時這樣");
        }
        if(arrayList.get(0).get("q4").equals("4")){
            textView4.setText("經常這樣");
        }
        if(arrayList.get(0).get("q4").equals("5")){
            textView4.setText("總是這樣");
        }

        if(arrayList.get(0).get("q5").equals("1")){
            textView5.setText("從不這樣");
        }
        if(arrayList.get(0).get("q5").equals("2")){
            textView5.setText("很少這樣");
        }
        if(arrayList.get(0).get("q5").equals("3")){
            textView5.setText("有時這樣");
        }
        if(arrayList.get(0).get("q5").equals("4")){
            textView5.setText("經常這樣");
        }
        if(arrayList.get(0).get("q5").equals("5")){
            textView5.setText("總是這樣");
        }

        if(arrayList.get(0).get("q6").equals("1")){
            textView6.setText("從不這樣");
        }
        if(arrayList.get(0).get("q6").equals("2")){
            textView6.setText("很少這樣");
        }
        if(arrayList.get(0).get("q6").equals("3")){
            textView6.setText("有時這樣");
        }
        if(arrayList.get(0).get("q6").equals("4")){
            textView6.setText("經常這樣");
        }
        if(arrayList.get(0).get("q6").equals("5")){
            textView6.setText("總是這樣");
        }

        if(arrayList.get(0).get("q7").equals("1")){
            textView7.setText("從不這樣");
        }
        if(arrayList.get(0).get("q7").equals("2")){
            textView7.setText("很少這樣");
        }
        if(arrayList.get(0).get("q7").equals("3")){
            textView7.setText("有時這樣");
        }
        if(arrayList.get(0).get("q7").equals("4")){
            textView7.setText("經常這樣");
        }
        if(arrayList.get(0).get("q7").equals("5")){
            textView7.setText("總是這樣");
        }

        if(arrayList.get(0).get("q8").equals("1")){
            textView8.setText("從不這樣");
        }
        if(arrayList.get(0).get("q8").equals("2")){
            textView8.setText("很少這樣");
        }
        if(arrayList.get(0).get("q8").equals("3")){
            textView8.setText("有時這樣");
        }
        if(arrayList.get(0).get("q8").equals("4")){
            textView8.setText("經常這樣");
        }
        if(arrayList.get(0).get("q8").equals("5")){
            textView8.setText("總是這樣");
        }

        if(arrayList.get(0).get("q9").equals("1")){
            textView9.setText("從不這樣");
        }
        if(arrayList.get(0).get("q9").equals("2")){
            textView9.setText("很少這樣");
        }
        if(arrayList.get(0).get("q9").equals("3")){
            textView9.setText("有時這樣");
        }
        if(arrayList.get(0).get("q9").equals("4")){
            textView9.setText("經常這樣");
        }
        if(arrayList.get(0).get("q9").equals("5")){
            textView9.setText("總是這樣");
        }

        if(arrayList.get(0).get("q10").equals("1")){
            textView10.setText("從不這樣");
        }
        if(arrayList.get(0).get("q10").equals("2")){
            textView10.setText("很少這樣");
        }
        if(arrayList.get(0).get("q10").equals("3")){
            textView10.setText("有時這樣");
        }
        if(arrayList.get(0).get("q10").equals("4")){
            textView10.setText("經常這樣");
        }
        if(arrayList.get(0).get("q10").equals("5")){
            textView10.setText("總是這樣");
        }

        if(arrayList.get(0).get("q11").equals("1")){
            textView11.setText("從不這樣");
        }
        if(arrayList.get(0).get("q11").equals("2")){
            textView11.setText("很少這樣");
        }
        if(arrayList.get(0).get("q11").equals("3")){
            textView11.setText("有時這樣");
        }
        if(arrayList.get(0).get("q11").equals("4")){
            textView11.setText("經常這樣");
        }
        if(arrayList.get(0).get("q11").equals("5")){
            textView11.setText("總是這樣");
        }

        if(arrayList.get(0).get("q12").equals("1")){
            textView12.setText("從不這樣");
        }
        if(arrayList.get(0).get("q12").equals("2")){
            textView12.setText("很少這樣");
        }
        if(arrayList.get(0).get("q12").equals("3")){
            textView12.setText("有時這樣");
        }
        if(arrayList.get(0).get("q12").equals("4")){
            textView12.setText("經常這樣");
        }
        if(arrayList.get(0).get("q12").equals("5")){
            textView12.setText("總是這樣");
        }

        if(arrayList.get(0).get("q13").equals("1")){
            textView13.setText("從不這樣");
        }
        if(arrayList.get(0).get("q13").equals("2")){
            textView13.setText("很少這樣");
        }
        if(arrayList.get(0).get("q13").equals("3")){
            textView13.setText("有時這樣");
        }
        if(arrayList.get(0).get("q13").equals("4")){
            textView13.setText("經常這樣");
        }
        if(arrayList.get(0).get("q13").equals("5")){
            textView13.setText("總是這樣");
        }

        if(arrayList.get(0).get("q14").equals("1")){
            textView14.setText("從不這樣");
        }
        if(arrayList.get(0).get("q14").equals("2")){
            textView14.setText("很少這樣");
        }
        if(arrayList.get(0).get("q14").equals("3")){
            textView14.setText("有時這樣");
        }
        if(arrayList.get(0).get("q14").equals("4")){
            textView14.setText("經常這樣");
        }
        if(arrayList.get(0).get("q14").equals("5")){
            textView14.setText("總是這樣");
        }

        if(arrayList.get(0).get("q15").equals("1")){
            textView15.setText("從不這樣");
        }
        if(arrayList.get(0).get("q15").equals("2")){
            textView15.setText("很少這樣");
        }
        if(arrayList.get(0).get("q15").equals("3")){
            textView15.setText("有時這樣");
        }
        if(arrayList.get(0).get("q15").equals("4")){
            textView15.setText("經常這樣");
        }
        if(arrayList.get(0).get("q15").equals("5")){
            textView15.setText("總是這樣");
        }

        if(arrayList.get(0).get("q16").equals("1")){
            textView16.setText("從不這樣");
        }
        if(arrayList.get(0).get("q16").equals("2")){
            textView16.setText("很少這樣");
        }
        if(arrayList.get(0).get("q16").equals("3")){
            textView16.setText("有時這樣");
        }
        if(arrayList.get(0).get("q16").equals("4")){
            textView16.setText("經常這樣");
        }
        if(arrayList.get(0).get("q16").equals("5")){
            textView16.setText("總是這樣");
        }

        if(arrayList.get(0).get("q17").equals("1")){
            textView17.setText("從不這樣");
        }
        if(arrayList.get(0).get("q17").equals("2")){
            textView17.setText("很少這樣");
        }
        if(arrayList.get(0).get("q17").equals("3")){
            textView17.setText("有時這樣");
        }
        if(arrayList.get(0).get("q17").equals("4")){
            textView17.setText("經常這樣");
        }
        if(arrayList.get(0).get("q17").equals("5")){
            textView17.setText("總是這樣");
        }

        if(arrayList.get(0).get("q18").equals("1")){
            textView18.setText("從不這樣");
        }
        if(arrayList.get(0).get("q18").equals("2")){
            textView18.setText("很少這樣");
        }
        if(arrayList.get(0).get("q18").equals("3")){
            textView18.setText("有時這樣");
        }
        if(arrayList.get(0).get("q18").equals("4")){
            textView18.setText("經常這樣");
        }
        if(arrayList.get(0).get("q18").equals("5")){
            textView18.setText("總是這樣");
        }

        if(arrayList.get(0).get("q19").equals("1")){
            textView19.setText("從不這樣");
        }
        if(arrayList.get(0).get("q19").equals("2")){
            textView19.setText("很少這樣");
        }
        if(arrayList.get(0).get("q19").equals("3")){
            textView19.setText("有時這樣");
        }
        if(arrayList.get(0).get("q19").equals("4")){
            textView19.setText("經常這樣");
        }
        if(arrayList.get(0).get("q19").equals("5")){
            textView19.setText("總是這樣");
        }

        if(arrayList.get(0).get("q20").equals("1")){
            textView20.setText("從不這樣");
        }
        if(arrayList.get(0).get("q20").equals("2")){
            textView20.setText("很少這樣");
        }
        if(arrayList.get(0).get("q20").equals("3")){
            textView20.setText("有時這樣");
        }
        if(arrayList.get(0).get("q20").equals("4")){
            textView20.setText("經常這樣");
        }
        if(arrayList.get(0).get("q20").equals("5")){
            textView20.setText("總是這樣");
        }

        if(arrayList.get(0).get("q21").equals("1")){
            textView21.setText("從不這樣");
        }
        if(arrayList.get(0).get("q21").equals("2")){
            textView21.setText("很少這樣");
        }
        if(arrayList.get(0).get("q21").equals("3")){
            textView21.setText("有時這樣");
        }
        if(arrayList.get(0).get("q21").equals("4")){
            textView21.setText("經常這樣");
        }
        if(arrayList.get(0).get("q21").equals("5")){
            textView21.setText("總是這樣");
        }

        if(arrayList.get(0).get("q22").equals("1")){
            textView22.setText("從不這樣");
        }
        if(arrayList.get(0).get("q22").equals("2")){
            textView22.setText("很少這樣");
        }
        if(arrayList.get(0).get("q22").equals("3")){
            textView22.setText("有時這樣");
        }
        if(arrayList.get(0).get("q22").equals("4")){
            textView22.setText("經常這樣");
        }
        if(arrayList.get(0).get("q22").equals("5")){
            textView22.setText("總是這樣");
        }

        if(arrayList.get(0).get("q23").equals("1")){
            textView23.setText("從不這樣");
        }
        if(arrayList.get(0).get("q23").equals("2")){
            textView23.setText("很少這樣");
        }
        if(arrayList.get(0).get("q23").equals("3")){
            textView23.setText("有時這樣");
        }
        if(arrayList.get(0).get("q23").equals("4")){
            textView23.setText("經常這樣");
        }
        if(arrayList.get(0).get("q23").equals("5")){
            textView23.setText("總是這樣");
        }

        if(arrayList.get(0).get("q24").equals("1")){
            textView24.setText("從不這樣");
        }
        if(arrayList.get(0).get("q24").equals("2")){
            textView24.setText("很少這樣");
        }
        if(arrayList.get(0).get("q24").equals("3")){
            textView24.setText("有時這樣");
        }
        if(arrayList.get(0).get("q24").equals("4")){
            textView24.setText("經常這樣");
        }
        if(arrayList.get(0).get("q24").equals("5")){
            textView24.setText("總是這樣");
        }

        if(arrayList.get(0).get("q25").equals("1")){
            textView25.setText("從不這樣");
        }
        if(arrayList.get(0).get("q25").equals("2")){
            textView25.setText("很少這樣");
        }
        if(arrayList.get(0).get("q25").equals("3")){
            textView25.setText("有時這樣");
        }
        if(arrayList.get(0).get("q25").equals("4")){
            textView25.setText("經常這樣");
        }
        if(arrayList.get(0).get("q25").equals("5")){
            textView25.setText("總是這樣");
        }

        if(arrayList.get(0).get("q26").equals("1")){
            textView26.setText("從不這樣");
        }
        if(arrayList.get(0).get("q26").equals("2")){
            textView26.setText("很少這樣");
        }
        if(arrayList.get(0).get("q26").equals("3")){
            textView26.setText("有時這樣");
        }
        if(arrayList.get(0).get("q26").equals("4")){
            textView26.setText("經常這樣");
        }
        if(arrayList.get(0).get("q26").equals("5")){
            textView26.setText("總是這樣");
        }

        if(arrayList.get(0).get("q27").equals("1")){
            textView27.setText("從不這樣");
        }
        if(arrayList.get(0).get("q27").equals("2")){
            textView27.setText("很少這樣");
        }
        if(arrayList.get(0).get("q27").equals("3")){
            textView27.setText("有時這樣");
        }
        if(arrayList.get(0).get("q27").equals("4")){
            textView27.setText("經常這樣");
        }
        if(arrayList.get(0).get("q27").equals("5")){
            textView27.setText("總是這樣");
        }

        if(arrayList.get(0).get("q28").equals("1")){
            textView28.setText("從不這樣");
        }
        if(arrayList.get(0).get("q28").equals("2")){
            textView28.setText("很少這樣");
        }
        if(arrayList.get(0).get("q28").equals("3")){
            textView28.setText("有時這樣");
        }
        if(arrayList.get(0).get("q28").equals("4")){
            textView28.setText("經常這樣");
        }
        if(arrayList.get(0).get("q28").equals("5")){
            textView28.setText("總是這樣");
        }

        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                t1.setText("1.在群體工作中表現不佳");
                t2.setText("2.被同儕團體排斥或拒絕");
                t3.setText("3.覺得別人找他碴或迫害他");
                t4.setText("4.缺乏社交能力");
                t5.setText("5.避免與他人互動");
                t6.setText("6.不尊重他人或反抗權威");

                //顯示文字
                t7.setVisibility(View.VISIBLE);
                t8.setVisibility(View.VISIBLE);
                t9.setVisibility(View.VISIBLE);
                t10.setVisibility(View.VISIBLE);
                t11.setVisibility(View.VISIBLE);
                t12.setVisibility(View.VISIBLE);
                t13.setVisibility(View.VISIBLE);
                t14.setVisibility(View.VISIBLE);
                t15.setVisibility(View.VISIBLE);
                t16.setVisibility(View.VISIBLE);
                t17.setVisibility(View.VISIBLE);
                t18.setVisibility(View.VISIBLE);
                t19.setVisibility(View.VISIBLE);
                t20.setVisibility(View.VISIBLE);
                t21.setVisibility(View.VISIBLE);
                t22.setVisibility(View.VISIBLE);
                t23.setVisibility(View.VISIBLE);
                t24.setVisibility(View.VISIBLE);
                t25.setVisibility(View.VISIBLE);
                t26.setVisibility(View.VISIBLE);
                t27.setVisibility(View.VISIBLE);
                t28.setVisibility(View.VISIBLE);
                textView7.setVisibility(View.VISIBLE);
                textView8.setVisibility(View.VISIBLE);
                textView9.setVisibility(View.VISIBLE);
                textView10.setVisibility(View.VISIBLE);
                textView11.setVisibility(View.VISIBLE);
                textView12.setVisibility(View.VISIBLE);
                textView13.setVisibility(View.VISIBLE);
                textView14.setVisibility(View.VISIBLE);
                textView15.setVisibility(View.VISIBLE);
                textView16.setVisibility(View.VISIBLE);
                textView17.setVisibility(View.VISIBLE);
                textView18.setVisibility(View.VISIBLE);
                textView19.setVisibility(View.VISIBLE);
                textView20.setVisibility(View.VISIBLE);
                textView21.setVisibility(View.VISIBLE);
                textView22.setVisibility(View.VISIBLE);
                textView23.setVisibility(View.VISIBLE);
                textView24.setVisibility(View.VISIBLE);
                textView25.setVisibility(View.VISIBLE);
                textView26.setVisibility(View.VISIBLE);
                textView27.setVisibility(View.VISIBLE);
                textView28.setVisibility(View.VISIBLE);

                //取資料
                Thread thread1 = new Thread() {
                    @Override
                    public void run ( ) {
                        MysqlCon con = new MysqlCon();
                        con.run();
                        arrayList=con.getdisorders(gv.getuser());
                    };
                };

                thread1.start();

                try {
                    thread1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                Log.v("DB", "寫入資料完成：" + arrayList);


                if(arrayList.get(0).get("q1").equals("1")){
                    textView1.setText("從不這樣");
                }
                if(arrayList.get(0).get("q1").equals("2")){
                    textView1.setText("很少這樣");
                }
                if(arrayList.get(0).get("q1").equals("3")){
                    textView1.setText("有時這樣");
                }
                if(arrayList.get(0).get("q1").equals("4")){
                    textView1.setText("經常這樣");
                }
                if(arrayList.get(0).get("q1").equals("5")){
                    textView1.setText("總是這樣");
                }

                if(arrayList.get(0).get("q2").equals("1")){
                    textView2.setText("從不這樣");
                }
                if(arrayList.get(0).get("q2").equals("2")){
                    textView2.setText("很少這樣");
                }
                if(arrayList.get(0).get("q2").equals("3")){
                    textView2.setText("有時這樣");
                }
                if(arrayList.get(0).get("q2").equals("4")){
                    textView2.setText("經常這樣");
                }
                if(arrayList.get(0).get("q2").equals("5")){
                    textView2.setText("總是這樣");
                }

                if(arrayList.get(0).get("q3").equals("1")){
                    textView3.setText("從不這樣");
                }
                if(arrayList.get(0).get("q3").equals("2")){
                    textView3.setText("很少這樣");
                }
                if(arrayList.get(0).get("q3").equals("3")){
                    textView3.setText("有時這樣");
                }
                if(arrayList.get(0).get("q3").equals("4")){
                    textView3.setText("經常這樣");
                }
                if(arrayList.get(0).get("q3").equals("5")){
                    textView3.setText("總是這樣");
                }

                if(arrayList.get(0).get("q4").equals("1")){
                    textView4.setText("從不這樣");
                }
                if(arrayList.get(0).get("q4").equals("2")){
                    textView4.setText("很少這樣");
                }
                if(arrayList.get(0).get("q4").equals("3")){
                    textView4.setText("有時這樣");
                }
                if(arrayList.get(0).get("q4").equals("4")){
                    textView4.setText("經常這樣");
                }
                if(arrayList.get(0).get("q4").equals("5")){
                    textView4.setText("總是這樣");
                }

                if(arrayList.get(0).get("q5").equals("1")){
                    textView5.setText("從不這樣");
                }
                if(arrayList.get(0).get("q5").equals("2")){
                    textView5.setText("很少這樣");
                }
                if(arrayList.get(0).get("q5").equals("3")){
                    textView5.setText("有時這樣");
                }
                if(arrayList.get(0).get("q5").equals("4")){
                    textView5.setText("經常這樣");
                }
                if(arrayList.get(0).get("q5").equals("5")){
                    textView5.setText("總是這樣");
                }

                if(arrayList.get(0).get("q6").equals("1")){
                    textView6.setText("從不這樣");
                }
                if(arrayList.get(0).get("q6").equals("2")){
                    textView6.setText("很少這樣");
                }
                if(arrayList.get(0).get("q6").equals("3")){
                    textView6.setText("有時這樣");
                }
                if(arrayList.get(0).get("q6").equals("4")){
                    textView6.setText("經常這樣");
                }
                if(arrayList.get(0).get("q6").equals("5")){
                    textView6.setText("總是這樣");
                }

                if(arrayList.get(0).get("q7").equals("1")){
                    textView7.setText("從不這樣");
                }
                if(arrayList.get(0).get("q7").equals("2")){
                    textView7.setText("很少這樣");
                }
                if(arrayList.get(0).get("q7").equals("3")){
                    textView7.setText("有時這樣");
                }
                if(arrayList.get(0).get("q7").equals("4")){
                    textView7.setText("經常這樣");
                }
                if(arrayList.get(0).get("q7").equals("5")){
                    textView7.setText("總是這樣");
                }

                if(arrayList.get(0).get("q8").equals("1")){
                    textView8.setText("從不這樣");
                }
                if(arrayList.get(0).get("q8").equals("2")){
                    textView8.setText("很少這樣");
                }
                if(arrayList.get(0).get("q8").equals("3")){
                    textView8.setText("有時這樣");
                }
                if(arrayList.get(0).get("q8").equals("4")){
                    textView8.setText("經常這樣");
                }
                if(arrayList.get(0).get("q8").equals("5")){
                    textView8.setText("總是這樣");
                }

                if(arrayList.get(0).get("q9").equals("1")){
                    textView9.setText("從不這樣");
                }
                if(arrayList.get(0).get("q9").equals("2")){
                    textView9.setText("很少這樣");
                }
                if(arrayList.get(0).get("q9").equals("3")){
                    textView9.setText("有時這樣");
                }
                if(arrayList.get(0).get("q9").equals("4")){
                    textView9.setText("經常這樣");
                }
                if(arrayList.get(0).get("q9").equals("5")){
                    textView9.setText("總是這樣");
                }

                if(arrayList.get(0).get("q10").equals("1")){
                    textView10.setText("從不這樣");
                }
                if(arrayList.get(0).get("q10").equals("2")){
                    textView10.setText("很少這樣");
                }
                if(arrayList.get(0).get("q10").equals("3")){
                    textView10.setText("有時這樣");
                }
                if(arrayList.get(0).get("q10").equals("4")){
                    textView10.setText("經常這樣");
                }
                if(arrayList.get(0).get("q10").equals("5")){
                    textView10.setText("總是這樣");
                }

                if(arrayList.get(0).get("q11").equals("1")){
                    textView11.setText("從不這樣");
                }
                if(arrayList.get(0).get("q11").equals("2")){
                    textView11.setText("很少這樣");
                }
                if(arrayList.get(0).get("q11").equals("3")){
                    textView11.setText("有時這樣");
                }
                if(arrayList.get(0).get("q11").equals("4")){
                    textView11.setText("經常這樣");
                }
                if(arrayList.get(0).get("q11").equals("5")){
                    textView11.setText("總是這樣");
                }

                if(arrayList.get(0).get("q12").equals("1")){
                    textView12.setText("從不這樣");
                }
                if(arrayList.get(0).get("q12").equals("2")){
                    textView12.setText("很少這樣");
                }
                if(arrayList.get(0).get("q12").equals("3")){
                    textView12.setText("有時這樣");
                }
                if(arrayList.get(0).get("q12").equals("4")){
                    textView12.setText("經常這樣");
                }
                if(arrayList.get(0).get("q12").equals("5")){
                    textView12.setText("總是這樣");
                }

                if(arrayList.get(0).get("q13").equals("1")){
                    textView13.setText("從不這樣");
                }
                if(arrayList.get(0).get("q13").equals("2")){
                    textView13.setText("很少這樣");
                }
                if(arrayList.get(0).get("q13").equals("3")){
                    textView13.setText("有時這樣");
                }
                if(arrayList.get(0).get("q13").equals("4")){
                    textView13.setText("經常這樣");
                }
                if(arrayList.get(0).get("q13").equals("5")){
                    textView13.setText("總是這樣");
                }

                if(arrayList.get(0).get("q14").equals("1")){
                    textView14.setText("從不這樣");
                }
                if(arrayList.get(0).get("q14").equals("2")){
                    textView14.setText("很少這樣");
                }
                if(arrayList.get(0).get("q14").equals("3")){
                    textView14.setText("有時這樣");
                }
                if(arrayList.get(0).get("q14").equals("4")){
                    textView14.setText("經常這樣");
                }
                if(arrayList.get(0).get("q14").equals("5")){
                    textView14.setText("總是這樣");
                }

                if(arrayList.get(0).get("q15").equals("1")){
                    textView15.setText("從不這樣");
                }
                if(arrayList.get(0).get("q15").equals("2")){
                    textView15.setText("很少這樣");
                }
                if(arrayList.get(0).get("q15").equals("3")){
                    textView15.setText("有時這樣");
                }
                if(arrayList.get(0).get("q15").equals("4")){
                    textView15.setText("經常這樣");
                }
                if(arrayList.get(0).get("q15").equals("5")){
                    textView15.setText("總是這樣");
                }

                if(arrayList.get(0).get("q16").equals("1")){
                    textView16.setText("從不這樣");
                }
                if(arrayList.get(0).get("q16").equals("2")){
                    textView16.setText("很少這樣");
                }
                if(arrayList.get(0).get("q16").equals("3")){
                    textView16.setText("有時這樣");
                }
                if(arrayList.get(0).get("q16").equals("4")){
                    textView16.setText("經常這樣");
                }
                if(arrayList.get(0).get("q16").equals("5")){
                    textView16.setText("總是這樣");
                }

                if(arrayList.get(0).get("q17").equals("1")){
                    textView17.setText("從不這樣");
                }
                if(arrayList.get(0).get("q17").equals("2")){
                    textView17.setText("很少這樣");
                }
                if(arrayList.get(0).get("q17").equals("3")){
                    textView17.setText("有時這樣");
                }
                if(arrayList.get(0).get("q17").equals("4")){
                    textView17.setText("經常這樣");
                }
                if(arrayList.get(0).get("q17").equals("5")){
                    textView17.setText("總是這樣");
                }

                if(arrayList.get(0).get("q18").equals("1")){
                    textView18.setText("從不這樣");
                }
                if(arrayList.get(0).get("q18").equals("2")){
                    textView18.setText("很少這樣");
                }
                if(arrayList.get(0).get("q18").equals("3")){
                    textView18.setText("有時這樣");
                }
                if(arrayList.get(0).get("q18").equals("4")){
                    textView18.setText("經常這樣");
                }
                if(arrayList.get(0).get("q18").equals("5")){
                    textView18.setText("總是這樣");
                }

                if(arrayList.get(0).get("q19").equals("1")){
                    textView19.setText("從不這樣");
                }
                if(arrayList.get(0).get("q19").equals("2")){
                    textView19.setText("很少這樣");
                }
                if(arrayList.get(0).get("q19").equals("3")){
                    textView19.setText("有時這樣");
                }
                if(arrayList.get(0).get("q19").equals("4")){
                    textView19.setText("經常這樣");
                }
                if(arrayList.get(0).get("q19").equals("5")){
                    textView19.setText("總是這樣");
                }

                if(arrayList.get(0).get("q20").equals("1")){
                    textView20.setText("從不這樣");
                }
                if(arrayList.get(0).get("q20").equals("2")){
                    textView20.setText("很少這樣");
                }
                if(arrayList.get(0).get("q20").equals("3")){
                    textView20.setText("有時這樣");
                }
                if(arrayList.get(0).get("q20").equals("4")){
                    textView20.setText("經常這樣");
                }
                if(arrayList.get(0).get("q20").equals("5")){
                    textView20.setText("總是這樣");
                }

                if(arrayList.get(0).get("q21").equals("1")){
                    textView21.setText("從不這樣");
                }
                if(arrayList.get(0).get("q21").equals("2")){
                    textView21.setText("很少這樣");
                }
                if(arrayList.get(0).get("q21").equals("3")){
                    textView21.setText("有時這樣");
                }
                if(arrayList.get(0).get("q21").equals("4")){
                    textView21.setText("經常這樣");
                }
                if(arrayList.get(0).get("q21").equals("5")){
                    textView21.setText("總是這樣");
                }

                if(arrayList.get(0).get("q22").equals("1")){
                    textView22.setText("從不這樣");
                }
                if(arrayList.get(0).get("q22").equals("2")){
                    textView22.setText("很少這樣");
                }
                if(arrayList.get(0).get("q22").equals("3")){
                    textView22.setText("有時這樣");
                }
                if(arrayList.get(0).get("q22").equals("4")){
                    textView22.setText("經常這樣");
                }
                if(arrayList.get(0).get("q22").equals("5")){
                    textView22.setText("總是這樣");
                }

                if(arrayList.get(0).get("q23").equals("1")){
                    textView23.setText("從不這樣");
                }
                if(arrayList.get(0).get("q23").equals("2")){
                    textView23.setText("很少這樣");
                }
                if(arrayList.get(0).get("q23").equals("3")){
                    textView23.setText("有時這樣");
                }
                if(arrayList.get(0).get("q23").equals("4")){
                    textView23.setText("經常這樣");
                }
                if(arrayList.get(0).get("q23").equals("5")){
                    textView23.setText("總是這樣");
                }

                if(arrayList.get(0).get("q24").equals("1")){
                    textView24.setText("從不這樣");
                }
                if(arrayList.get(0).get("q24").equals("2")){
                    textView24.setText("很少這樣");
                }
                if(arrayList.get(0).get("q24").equals("3")){
                    textView24.setText("有時這樣");
                }
                if(arrayList.get(0).get("q24").equals("4")){
                    textView24.setText("經常這樣");
                }
                if(arrayList.get(0).get("q24").equals("5")){
                    textView24.setText("總是這樣");
                }

                if(arrayList.get(0).get("q25").equals("1")){
                    textView25.setText("從不這樣");
                }
                if(arrayList.get(0).get("q25").equals("2")){
                    textView25.setText("很少這樣");
                }
                if(arrayList.get(0).get("q25").equals("3")){
                    textView25.setText("有時這樣");
                }
                if(arrayList.get(0).get("q25").equals("4")){
                    textView25.setText("經常這樣");
                }
                if(arrayList.get(0).get("q25").equals("5")){
                    textView25.setText("總是這樣");
                }

                if(arrayList.get(0).get("q26").equals("1")){
                    textView26.setText("從不這樣");
                }
                if(arrayList.get(0).get("q26").equals("2")){
                    textView26.setText("很少這樣");
                }
                if(arrayList.get(0).get("q26").equals("3")){
                    textView26.setText("有時這樣");
                }
                if(arrayList.get(0).get("q26").equals("4")){
                    textView26.setText("經常這樣");
                }
                if(arrayList.get(0).get("q26").equals("5")){
                    textView26.setText("總是這樣");
                }

                if(arrayList.get(0).get("q27").equals("1")){
                    textView27.setText("從不這樣");
                }
                if(arrayList.get(0).get("q27").equals("2")){
                    textView27.setText("很少這樣");
                }
                if(arrayList.get(0).get("q27").equals("3")){
                    textView27.setText("有時這樣");
                }
                if(arrayList.get(0).get("q27").equals("4")){
                    textView27.setText("經常這樣");
                }
                if(arrayList.get(0).get("q27").equals("5")){
                    textView27.setText("總是這樣");
                }

                if(arrayList.get(0).get("q28").equals("1")){
                    textView28.setText("從不這樣");
                }
                if(arrayList.get(0).get("q28").equals("2")){
                    textView28.setText("很少這樣");
                }
                if(arrayList.get(0).get("q28").equals("3")){
                    textView28.setText("有時這樣");
                }
                if(arrayList.get(0).get("q28").equals("4")){
                    textView28.setText("經常這樣");
                }
                if(arrayList.get(0).get("q28").equals("5")){
                    textView28.setText("總是這樣");
                }

            }
        });


        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //隱藏文字
                t7.setVisibility(View.GONE);
                t8.setVisibility(View.GONE);
                t9.setVisibility(View.GONE);
                t10.setVisibility(View.GONE);
                t11.setVisibility(View.GONE);
                t12.setVisibility(View.GONE);
                t13.setVisibility(View.GONE);
                t14.setVisibility(View.GONE);
                t15.setVisibility(View.GONE);
                t16.setVisibility(View.GONE);
                t17.setVisibility(View.GONE);
                t18.setVisibility(View.GONE);
                t19.setVisibility(View.GONE);
                t20.setVisibility(View.GONE);
                t21.setVisibility(View.GONE);
                t22.setVisibility(View.GONE);
                t23.setVisibility(View.GONE);
                t24.setVisibility(View.GONE);
                t25.setVisibility(View.GONE);
                t26.setVisibility(View.GONE);
                t27.setVisibility(View.GONE);
                t28.setVisibility(View.GONE);
                textView7.setVisibility(View.GONE);
                textView8.setVisibility(View.GONE);
                textView9.setVisibility(View.GONE);
                textView10.setVisibility(View.GONE);
                textView11.setVisibility(View.GONE);
                textView12.setVisibility(View.GONE);
                textView13.setVisibility(View.GONE);
                textView14.setVisibility(View.GONE);
                textView15.setVisibility(View.GONE);
                textView16.setVisibility(View.GONE);
                textView17.setVisibility(View.GONE);
                textView18.setVisibility(View.GONE);
                textView19.setVisibility(View.GONE);
                textView20.setVisibility(View.GONE);
                textView21.setVisibility(View.GONE);
                textView22.setVisibility(View.GONE);
                textView23.setVisibility(View.GONE);
                textView24.setVisibility(View.GONE);
                textView25.setVisibility(View.GONE);
                textView26.setVisibility(View.GONE);
                textView27.setVisibility(View.GONE);
                textView28.setVisibility(View.GONE);


                t1.setText("1.減少負面批評");
                t2.setText("2.對於孩子好的表現給予口頭讚美");
                t3.setText("3.表現不好時，先讓他充分表達原因，肯定表現好的部分");
                t4.setText("4.與孩子一起面對問題，討論改善策略");
                t5.setText("5.安排家人共同活動，如外出用餐、假日出遊");
                t6.setText("6.與孩子相處時保持耐心");



                //取資料
                Thread thread1 = new Thread() {
                    @Override
                    public void run ( ) {
                        MysqlCon con = new MysqlCon();
                        con.run();
                        arrayList=con.getinteractive(gv.getuser(),gv.getstatistics());
                    };
                };

                thread1.start();

                try {
                    thread1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                Log.v("DB", "寫入資料完成：" + arrayList);

                if(arrayList.size()==0){
                    textView1.setText(".....");
                    textView2.setText(".....");
                    textView3.setText(".....");
                    textView4.setText(".....");
                    textView5.setText(".....");
                    textView6.setText(".....");
                }else{

                if(arrayList.get(0).get("q1").equals("1")){
                    textView1.setText("從不這樣");
                }
                if(arrayList.get(0).get("q1").equals("2")){
                    textView1.setText("很少這樣");
                }
                if(arrayList.get(0).get("q1").equals("3")){
                    textView1.setText("有時這樣");
                }
                if(arrayList.get(0).get("q1").equals("4")){
                    textView1.setText("經常這樣");
                }
                if(arrayList.get(0).get("q1").equals("5")){
                    textView1.setText("總是這樣");
                }

                if(arrayList.get(0).get("q2").equals("1")){
                    textView2.setText("從不這樣");
                }
                if(arrayList.get(0).get("q2").equals("2")){
                    textView2.setText("很少這樣");
                }
                if(arrayList.get(0).get("q2").equals("3")){
                    textView2.setText("有時這樣");
                }
                if(arrayList.get(0).get("q2").equals("4")){
                    textView2.setText("經常這樣");
                }
                if(arrayList.get(0).get("q2").equals("5")){
                    textView2.setText("總是這樣");
                }

                if(arrayList.get(0).get("q3").equals("1")){
                    textView3.setText("從不這樣");
                }
                if(arrayList.get(0).get("q3").equals("2")){
                    textView3.setText("很少這樣");
                }
                if(arrayList.get(0).get("q3").equals("3")){
                    textView3.setText("有時這樣");
                }
                if(arrayList.get(0).get("q3").equals("4")){
                    textView3.setText("經常這樣");
                }
                if(arrayList.get(0).get("q3").equals("5")){
                    textView3.setText("總是這樣");
                }

                if(arrayList.get(0).get("q4").equals("1")){
                    textView4.setText("從不這樣");
                }
                if(arrayList.get(0).get("q4").equals("2")){
                    textView4.setText("很少這樣");
                }
                if(arrayList.get(0).get("q4").equals("3")){
                    textView4.setText("有時這樣");
                }
                if(arrayList.get(0).get("q4").equals("4")){
                    textView4.setText("經常這樣");
                }
                if(arrayList.get(0).get("q4").equals("5")){
                    textView4.setText("總是這樣");
                }

                if(arrayList.get(0).get("q5").equals("1")){
                    textView5.setText("從不這樣");
                }
                if(arrayList.get(0).get("q5").equals("2")){
                    textView5.setText("很少這樣");
                }
                if(arrayList.get(0).get("q5").equals("3")){
                    textView5.setText("有時這樣");
                }
                if(arrayList.get(0).get("q5").equals("4")){
                    textView5.setText("經常這樣");
                }
                if(arrayList.get(0).get("q5").equals("5")){
                    textView5.setText("總是這樣");
                }

                if(arrayList.get(0).get("q6").equals("1")){
                    textView6.setText("從不這樣");
                }
                if(arrayList.get(0).get("q6").equals("2")){
                    textView6.setText("很少這樣");
                }
                if(arrayList.get(0).get("q6").equals("3")){
                    textView6.setText("有時這樣");
                }
                if(arrayList.get(0).get("q6").equals("4")){
                    textView6.setText("經常這樣");
                }
                if(arrayList.get(0).get("q6").equals("5")){
                    textView6.setText("總是這樣");
                } }

            }
        });



    }
}