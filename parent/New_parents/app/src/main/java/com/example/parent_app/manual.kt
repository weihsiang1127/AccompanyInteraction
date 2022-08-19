package com.example.parent_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_manual.*


class manual : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manual)

        var QAselect = 0
        val whattouse = arrayOfNulls<String>(5)
        whattouse [1] = "孩子的行為主要用於：\n了解孩子的基本狀態"
        whattouse [2] = "孩子最近表現主要用於：\n了解孩子最近情緒狀態的表現"
        whattouse [3] = "您與孩子的互動主要用於：\n1.了解孩子在與家人相處的過程中\n是否有相對改善情緒狀況\n2.家庭狀況對孩子的情緒狀況的影響"
        whattouse [4] = "填寫紀錄：\n主要提供您查看\n1.孩子最近表現\n2.您與孩子的互動\n兩者的以往填寫時間"

        val QA = arrayListOf("孩子的行為","孩子最近的表現","您與孩子的互動","填寫紀錄")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, QA)
        spinner.adapter = adapter
        spinner.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                //Toast.makeText(this@user, "您與孩子的關係: " + ques1[position] , Toast.LENGTH_SHORT).show()
                if (spinner.getSelectedItem().toString() == "孩子的行為"){
                    QAselect = 1
                    imageViewQA.setImageDrawable(getResources().getDrawable(R.drawable.mood))
                    textViewQAtitle.text = "孩子的行為"
                    textViewQA.text = whattouse[1]
                }else if (spinner.getSelectedItem().toString() == "孩子最近的表現")
                {
                    QAselect = 2
                    textViewQAtitle.text = "孩子最近的表現"
                    imageViewQA.setImageDrawable(getResources().getDrawable(R.drawable.playtime));
                    textViewQA.text = whattouse[2]
                }else if (spinner.getSelectedItem().toString() == "您與孩子的互動")
                {
                    QAselect = 3
                    imageViewQA.setImageDrawable(getResources().getDrawable(R.drawable.family));
                    textViewQA.text = whattouse[3]
                    textViewQAtitle.text = "您與孩子的互動"
                }else if (spinner.getSelectedItem().toString() == "填寫紀錄")
                {
                    QAselect = 4
                    imageViewQA.setImageDrawable(getResources().getDrawable(R.drawable.note));
                    textViewQAtitle.text = "填寫紀錄"
                    textViewQA.text = whattouse[4]
                }
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
                Toast.makeText(this@manual, "你沒選擇" , Toast.LENGTH_SHORT).show()
            }


    }
        buttonQA.setOnClickListener {
            finish()
        }
}}