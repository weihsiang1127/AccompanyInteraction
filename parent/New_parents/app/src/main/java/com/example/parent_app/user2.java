package com.example.parent_app;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;

import br.com.simplepass.loading_button_lib.customViews.CircularProgressButton;

public class user2 extends AppCompatActivity {

    ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();//取得所有資料
    String relationship1 ;
    String relationship2 ;
    String relationship3 ;
    String relationship4 ;
    String relationship5 ;
    String relationship6 ;
    String relationship7 ;
    String relationship8 ;
    String relationship9 ;
    ProgressDialog progressDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user2);



        //建立等待畫面
        progressDialog = new ProgressDialog(user2.this);

        //建立共用變數類別
        GlobalVariable gv = (GlobalVariable)getApplicationContext();


        // 宣告CircularProgressButton物件
        CircularProgressButton button9 = (CircularProgressButton)findViewById(R.id.button9);

        // 宣告CircularProgressButton物件
        ImageView imageView10 = (ImageView)findViewById(R.id.imageView10);

        //取資料
        Thread thread1 = new Thread() {
            @Override
            public void run ( ) {
                MysqlCon con = new MysqlCon();
                con.run();
                arrayList=con.getrelationship(gv.getuser());
            };
        };
        thread1.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        // 宣告EditText物件
        EditText editTextTextPersonName = (EditText)findViewById(R.id.editTextTextPersonName);
        //宣告Spinner物件
        Spinner spinner1 = (Spinner)findViewById(R.id.spinner1);
        final String[] lunch = {"請選擇","生父","生母","繼父","繼母","爺爺或外公","奶奶或外婆","其他"};
        ArrayAdapter<String> lunchList = new ArrayAdapter<>(user2.this,
                android.R.layout.simple_spinner_dropdown_item,
                lunch);spinner1.setAdapter(lunchList);

        if(arrayList.get(0).get("relationship").equals("生父")){
            spinner1.setSelection(1, false);
        }else  if(arrayList.get(0).get("relationship").equals("生母")){
            spinner1.setSelection(2, false);
        }else  if(arrayList.get(0).get("relationship").equals("繼父")){
            spinner1.setSelection(3, false);
        } else  if(arrayList.get(0).get("relationship").equals("繼母")){
            spinner1.setSelection(4, false);
        } else  if(arrayList.get(0).get("relationship").equals("爺爺或外公")){
            spinner1.setSelection(5, false);
        }else  if(arrayList.get(0).get("relationship").equals("奶奶或外婆")){
            spinner1.setSelection(6, false);
        }else {
            spinner1.setSelection(7, false);
            editTextTextPersonName.setText(arrayList.get(0).get("relationship"));
        }

        // 宣告EditText物件
        EditText editTextTextPersonName2 = (EditText)findViewById(R.id.editTextTextPersonName2);
        //宣告Spinner物件
        Spinner spinner2 = (Spinner)findViewById(R.id.spinner2);
        final String[] lunch2 = {"請選擇","一直如此","曾經有但現在沒有(同住多久?___年)"};
        ArrayAdapter<String> lunchList2 = new ArrayAdapter<>(user2.this,
                android.R.layout.simple_spinner_dropdown_item,
                lunch2);spinner2.setAdapter(lunchList2);

        if(arrayList.get(0).get("cohabitation").equals("一直如此")){
            spinner2.setSelection(1, false);
        }else {
            spinner2.setSelection(2, false);
            editTextTextPersonName2.setText(arrayList.get(0).get("cohabitation"));
        }

        // 宣告EditText物件
        EditText editTextTextPersonName3 = (EditText)findViewById(R.id.editTextTextPersonName3);
        //宣告Spinner物件
        Spinner spinner3 = (Spinner)findViewById(R.id.spinner3);
        final String[] lunch3 = {"請選擇","父母雙親","父親","母親","爺爺或外公","奶奶或外婆","其他"};
        ArrayAdapter<String> lunchList3 = new ArrayAdapter<>(user2.this,
                android.R.layout.simple_spinner_dropdown_item,
                lunch3);spinner3.setAdapter(lunchList3);

        if(arrayList.get(0).get("discipline").equals("父母雙親")){
            spinner3.setSelection(1, false);
        }else  if(arrayList.get(0).get("discipline").equals("父親")){
            spinner3.setSelection(2, false);
        }else  if(arrayList.get(0).get("discipline").equals("母親")){
            spinner3.setSelection(3, false);
        } else  if(arrayList.get(0).get("discipline").equals("爺爺或外公")){
            spinner3.setSelection(4, false);
        } else  if(arrayList.get(0).get("discipline").equals("奶奶或外婆")){
            spinner3.setSelection(5, false);
        }else {
            spinner3.setSelection(6, false);
            editTextTextPersonName3.setText(arrayList.get(0).get("discipline"));
        }


        // 宣告EditText物件
        EditText editTextTextPersonName4 = (EditText)findViewById(R.id.editTextTextPersonName4);
        //宣告Spinner物件
        Spinner spinner4 = (Spinner)findViewById(R.id.spinner4);
        final String[] lunch4 = {"請選擇","1","2","3","4","5","其他"};
        ArrayAdapter<String> lunchList4 = new ArrayAdapter<>(user2.this,
                android.R.layout.simple_spinner_dropdown_item,
                lunch4);spinner4.setAdapter(lunchList4);

        if(arrayList.get(0).get("home_order").equals("1")){
            spinner4.setSelection(1, false);
        }else  if(arrayList.get(0).get("home_order").equals("2")){
            spinner4.setSelection(2, false);
        }else  if(arrayList.get(0).get("home_order").equals("3")){
            spinner4.setSelection(3, false);
        } else  if(arrayList.get(0).get("home_order").equals("4")){
            spinner4.setSelection(4, false);
        } else  if(arrayList.get(0).get("home_order").equals("5")){
            spinner4.setSelection(5, false);
        }else {
            spinner4.setSelection(6, false);
            editTextTextPersonName4.setText(arrayList.get(0).get("home_order"));
        }

        // 宣告EditText物件
        EditText editTextTextPersonName5 = (EditText)findViewById(R.id.editTextTextPersonName5);
        //宣告Spinner物件
        Spinner spinner4_1 = (Spinner)findViewById(R.id.spinner4_1);
        final String[] lunch5 = {"請選擇","1","2","3","4","5","其他"};
        ArrayAdapter<String> lunchList5 = new ArrayAdapter<>(user2.this,
                android.R.layout.simple_spinner_dropdown_item,
                lunch5);spinner4_1.setAdapter(lunchList5);

        if(arrayList.get(0).get("brothers_sisters").equals("1")){
            spinner4_1.setSelection(1, false);
        }else  if(arrayList.get(0).get("brothers_sisters").equals("2")){
            spinner4_1.setSelection(2, false);
        }else  if(arrayList.get(0).get("brothers_sisters").equals("3")){
            spinner4_1.setSelection(3, false);
        } else  if(arrayList.get(0).get("brothers_sisters").equals("4")){
            spinner4_1.setSelection(4, false);
        } else  if(arrayList.get(0).get("brothers_sisters").equals("5")){
            spinner4_1.setSelection(5, false);
        }else {
            spinner4_1.setSelection(6, false);
            editTextTextPersonName5.setText(arrayList.get(0).get("home_order"));
        }

        // 宣告EditText物件
        EditText editTextTextPersonName6 = (EditText)findViewById(R.id.editTextTextPersonName6);
        //宣告Spinner物件
        Spinner spinner5 = (Spinner)findViewById(R.id.spinner5);
        final String[] lunch6 = {"請選擇","是,藥名","否"};
        ArrayAdapter<String> lunchList6 = new ArrayAdapter<>(user2.this,
                android.R.layout.simple_spinner_dropdown_item,
                lunch6);spinner5.setAdapter(lunchList6);

        if(arrayList.get(0).get("drug").equals("null")){
            spinner5.setSelection(2, false);
        }else {
            spinner5.setSelection(1, false);
            editTextTextPersonName6.setText(arrayList.get(0).get("drug"));
        }

        // 宣告EditText物件
        EditText editTextTextPersonName7 = (EditText)findViewById(R.id.editTextTextPersonName7);
        //宣告Spinner物件
        Spinner spinner6 = (Spinner)findViewById(R.id.spinner6);
        final String[] lunch7 = {"請選擇","父母雙薪","父親","母親","其他"};
        ArrayAdapter<String> lunchList7 = new ArrayAdapter<>(user2.this,
                android.R.layout.simple_spinner_dropdown_item,
                lunch7);spinner6.setAdapter(lunchList7);

        if(arrayList.get(0).get("income").equals("父母雙薪")){
            spinner6.setSelection(1, false);
        }else  if(arrayList.get(0).get("income").equals("父親")){
            spinner6.setSelection(2, false);
        }else  if(arrayList.get(0).get("income").equals("母親")){
            spinner6.setSelection(3, false);
        }else {
            spinner6.setSelection(4, false);
            editTextTextPersonName7.setText(arrayList.get(0).get("income"));
        }


        //宣告Spinner物件
        Spinner spinner7 = (Spinner)findViewById(R.id.spinner7);
        final String[] lunch8 = {"請選擇","不識字","小學","中學","高中/高職","大學/專科","碩士","博士"};
        ArrayAdapter<String> lunchList8 = new ArrayAdapter<>(user2.this,
                android.R.layout.simple_spinner_dropdown_item,
                lunch8);spinner7.setAdapter(lunchList8);

        if(arrayList.get(0).get("f_educate").equals("不識字")){
            spinner7.setSelection(1, false);
        }else  if(arrayList.get(0).get("f_educate").equals("小學")){
            spinner7.setSelection(2, false);
        }else  if(arrayList.get(0).get("f_educate").equals("中學")){
            spinner7.setSelection(3, false);
        }else  if(arrayList.get(0).get("f_educate").equals("高中/高職")){
            spinner7.setSelection(4, false);
        }else  if(arrayList.get(0).get("f_educate").equals("大學/專科")){
            spinner7.setSelection(5, false);
        }else  if(arrayList.get(0).get("f_educate").equals("碩士")){
            spinner7.setSelection(6, false);
        }else  if(arrayList.get(0).get("f_educate").equals("博士")){
            spinner7.setSelection(7, false);
        }

        //宣告Spinner物件
        Spinner spinner8 = (Spinner)findViewById(R.id.spinner8);
        final String[] lunch9 = {"請選擇","不識字","小學","中學","高中/高職","大學/專科","碩士","博士"};
        ArrayAdapter<String> lunchList9 = new ArrayAdapter<>(user2.this,
                android.R.layout.simple_spinner_dropdown_item,
                lunch9);spinner8.setAdapter(lunchList9);

        if(arrayList.get(0).get("m_educate").equals("不識字")){
            spinner8.setSelection(1, false);
        }else  if(arrayList.get(0).get("m_educate").equals("小學")){
            spinner8.setSelection(2, false);
        }else  if(arrayList.get(0).get("m_educate").equals("中學")){
            spinner8.setSelection(3, false);
        }else  if(arrayList.get(0).get("m_educate").equals("高中/高職")){
            spinner8.setSelection(4, false);
        }else  if(arrayList.get(0).get("m_educate").equals("大學/專科")){
            spinner8.setSelection(5, false);
        }else  if(arrayList.get(0).get("m_educate").equals("碩士")){
            spinner8.setSelection(6, false);
        }else  if(arrayList.get(0).get("m_educate").equals("博士")){
            spinner8.setSelection(7, false);
        }




        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //關閉虛擬鍵盤
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(spinner1.getWindowToken(), 0);
                if(parent.getSelectedItem().toString().equals("其他")){
                    relationship1 ="其他";
                }else{
                    relationship1 =parent.getSelectedItem().toString();
                    editTextTextPersonName.setText("");
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });

        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //關閉虛擬鍵盤
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(spinner2.getWindowToken(), 0);
                if(parent.getSelectedItem().toString().equals("曾經有但現在沒有(同住多久?___年)")){
                    relationship2 ="曾經有但現在沒有(同住多久?___年)";
                }else{
                    relationship2 =parent.getSelectedItem().toString();
                    editTextTextPersonName2.setText("");
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });

        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //關閉虛擬鍵盤
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(spinner3.getWindowToken(), 0);
                if(parent.getSelectedItem().toString().equals("其他")){
                    relationship3 ="其他";
                }else{
                    relationship3 =parent.getSelectedItem().toString();
                    editTextTextPersonName3.setText("");
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });

        spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //關閉虛擬鍵盤
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(spinner4.getWindowToken(), 0);
                if(parent.getSelectedItem().toString().equals("其他")){
                    relationship4 ="其他";
                }else{
                    relationship4 =parent.getSelectedItem().toString();
                    editTextTextPersonName4.setText("");
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });

        spinner4_1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //關閉虛擬鍵盤
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(spinner4_1.getWindowToken(), 0);
                if(parent.getSelectedItem().toString().equals("其他")){
                    relationship5 ="其他";
                }else{
                    relationship5 =parent.getSelectedItem().toString();
                    editTextTextPersonName5.setText("");
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });

        spinner5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //關閉虛擬鍵盤
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(spinner5.getWindowToken(), 0);
                if(parent.getSelectedItem().toString().equals("否")){
                    relationship6 =parent.getSelectedItem().toString();
                    editTextTextPersonName6.setText("");
                }else{
                    relationship6 ="是,藥名";
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });

        spinner6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //關閉虛擬鍵盤
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(spinner6.getWindowToken(), 0);
                if(parent.getSelectedItem().toString().equals("其他")){
                    relationship7 ="其他";
                }else{
                    relationship7 =parent.getSelectedItem().toString();
                    editTextTextPersonName7.setText("");
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });

        spinner7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //關閉虛擬鍵盤
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(spinner7.getWindowToken(), 0);
                    relationship8 =parent.getSelectedItem().toString();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });

        spinner8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //關閉虛擬鍵盤
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(spinner8.getWindowToken(), 0);
                relationship9 =parent.getSelectedItem().toString();
                //Toast.makeText(view.getContext(),relationship1[0]+ relationship2[0]+relationship3[0]+ relationship4[0]+relationship5[0]+ relationship6[0]+relationship7[0]+ relationship8[0]+relationship9[0]/*這行可直接取得選中內容*/,Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               /* progressDialog.show();
                progressDialog.setContentView(R.layout.progress_dialog);
                progressDialog.getWindow().setBackgroundDrawableResource(
                        android.R.color.transparent
                );

                progressDialog.setCanceledOnTouchOutside(false);//點擊ProgressDialog外的區域不消失*/

                if(relationship1 != null && relationship1.equals("其他")){
                    relationship1 =editTextTextPersonName.getText().toString();
                }
                if(relationship2 != null && relationship2.equals("曾經有但現在沒有(同住多久?___年)")){
                    relationship2 =editTextTextPersonName2.getText().toString();
                }
                if(relationship3 != null && relationship3.equals("其他")){
                    relationship3 =editTextTextPersonName3.getText().toString();
                }
                if(relationship4 != null && relationship4.equals("其他")){
                    relationship4 =editTextTextPersonName4.getText().toString();
                }
                if(relationship5 != null && relationship5.equals("其他")){
                    relationship5 =editTextTextPersonName5.getText().toString();
                }
                if(relationship6 != null && relationship6.equals("是,藥名")){
                    relationship6 =editTextTextPersonName6.getText().toString();
                }
                if(relationship7 != null &&relationship7.equals("其他")){
                    relationship7 =editTextTextPersonName7.getText().toString();
                }

                Thread thread1 = new Thread() {
                    @Override
                    public void run ( ) {
                        MysqlCon con = new MysqlCon();
                        con.run();
                        con.updaterelationship(gv.getuser(),relationship1,relationship2,relationship3,relationship4,relationship5,relationship6,relationship7,relationship8,relationship9);
                    };
                };
                thread1.start();

                try {
                    thread1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                Toast.makeText(user2.this,"修改完成",Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        imageView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });






    }
}