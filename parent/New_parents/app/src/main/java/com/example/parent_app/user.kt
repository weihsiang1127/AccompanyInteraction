package com.example.parent_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.util.Log
import android.view.View
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_user.*
import kotlinx.android.synthetic.main.login_page.*

class user : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)
        //SPINNER用變數宣告-----------↓↓↓-----------//
        var ques1ans = 0
        var ques1anselse = ""
        var ques2ans = 0
        var ques2anselse = ""
        var ques3ans = 0
        var ques3anselse = ""
        var ques4ans = 0
        var ques4anselse = ""
        var ques4_1ans = 0
        var ques4_1anselse = ""
        var ques5ans = 0
        var ques5anselse = ""
        var ques6ans = 0
        var ques6anselse = ""
        var ques7ans = 0
        var ques8ans = 0
        //SPINNER用變數宣告-----------↑↑↑-----------//

        //---------限制edittext是否可寫----------//
        editTextTextPersonName.setEnabled(false)
        editTextTextPersonName2.setEnabled(false)
        editTextTextPersonName3.setEnabled(false)
        editTextTextPersonName4.setEnabled(false)
        editTextTextPersonName5.setEnabled(false)
        editTextTextPersonName6.setEnabled(false)
        editTextTextPersonName7.setEnabled(false)


        //建立共用變數類別
        val gv = applicationContext as GlobalVariable

        //-----------------------------------↓-SPINNER-↓-------------------------------------//
        //---------------------------Spinner 1 ↓
            val ques1 = arrayListOf("請選擇","生父","生母","繼父","繼母","爺爺或外公","奶奶或外婆","其他")
            val adapter1 = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, ques1)
            spinner1.adapter = adapter1
            spinner1.onItemSelectedListener = object :
                    AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                    //關閉虛擬鍵盤
                    val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
                    imm.hideSoftInputFromWindow(spinner1.windowToken, 0)
                    //Toast.makeText(this@user, "您與孩子的關係: " + ques1[position] , Toast.LENGTH_SHORT).show()
                    if (spinner1.getSelectedItem().toString() == "生父"){
                        ques1ans = 1
                        editTextTextPersonName.setEnabled(false)
                        editTextTextPersonName.text = null
                        gv.setrelationship1("生父")
                    }else if (spinner1.getSelectedItem().toString() == "生母")
                    {
                        ques1ans = 2
                        editTextTextPersonName.setEnabled(false)
                        editTextTextPersonName.text = null
                        gv.setrelationship1("生母")
                    }else if (spinner1.getSelectedItem().toString() == "繼父")
                    {
                        ques1ans = 3
                        editTextTextPersonName.setEnabled(false)
                        editTextTextPersonName.text = null
                        gv.setrelationship1("繼父")
                    }else if (spinner1.getSelectedItem().toString() == "繼母")
                    {
                        ques1ans = 4
                        editTextTextPersonName.setEnabled(false)
                        editTextTextPersonName.text = null
                        gv.setrelationship1("繼母")
                    }else if (spinner1.getSelectedItem().toString() == "爺爺或外公")
                    {
                        ques1ans = 5
                        editTextTextPersonName.setEnabled(false)
                        editTextTextPersonName.text = null
                        gv.setrelationship1("爺爺或外公")
                    }else if (spinner1.getSelectedItem().toString() == "奶奶或外婆")
                    {
                        ques1ans = 6
                        editTextTextPersonName.setEnabled(false)
                        editTextTextPersonName.text = null
                        gv.setrelationship1("奶奶或外婆")
                    }else if (spinner1.getSelectedItem().toString() == "其他")
                    {
                        ques1ans = 7
                        editTextTextPersonName.setEnabled(true)
                        ques1anselse = editTextTextPersonName.text.toString()
                        gv.setrelationship1(editTextTextPersonName.text.toString())
                    }
                    //Toast.makeText(this@user, ques1ans.toString(), Toast.LENGTH_SHORT).show()
                }
                override fun onNothingSelected(parent: AdapterView<*>?) {
                    Toast.makeText(this@user, "你沒選擇" , Toast.LENGTH_SHORT).show()
                }
        }
        //---------------------------Spinner 2 ↓
        val ques2 = arrayListOf("請選擇","一直如此","曾經有但現在沒有(同住多久?___年)")
        val adapter2 = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, ques2)
        spinner2.adapter = adapter2
        spinner2.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                //關閉虛擬鍵盤
                val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
                imm.hideSoftInputFromWindow(spinner2.windowToken, 0)
                //Toast.makeText(this@user, "是否與孩子同住: " + ques2[position], Toast.LENGTH_SHORT).show()
                if (spinner2.getSelectedItem().toString() == "一直如此") {
                    ques2ans = 1
                    editTextTextPersonName2.setEnabled(false)
                    editTextTextPersonName2.text = null
                    gv.setrelationship2("一直如此")
                }else if (spinner2.getSelectedItem().toString() == "曾經有但現在沒有(同住多久?___年)")
                {
                    ques2ans = 2
                    editTextTextPersonName2.setEnabled(true)
                    ques2anselse = editTextTextPersonName2.text.toString()
                    gv.setrelationship2(editTextTextPersonName2.text.toString())
                }
                //Toast.makeText(this@user, ques2ans.toString(), Toast.LENGTH_SHORT).show()
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
                Toast.makeText(this@user, "你沒選擇" , Toast.LENGTH_SHORT).show()
            }
        }
        //---------------------------Spinner 3 ↓
        val ques3 = arrayListOf("請選擇","父母雙親","父親","母親","爺爺或外公","奶奶或外婆","其他")
        val adapter3 = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, ques3)
        spinner3.adapter = adapter3
        spinner3.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                //關閉虛擬鍵盤
                val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
                imm.hideSoftInputFromWindow(spinner3.windowToken, 0)
                //Toast.makeText(this@user, "平常孩子在家由誰照顧和管教? " + ques3[position] , Toast.LENGTH_SHORT).show()
                if (spinner3.getSelectedItem().toString() == "父母雙親"){
                    ques3ans = 1
                    editTextTextPersonName3.setEnabled(false)
                    editTextTextPersonName3.text = null
                    gv.setrelationship3("父母雙親")
                }else if (spinner3.getSelectedItem().toString() == "父親")
                {
                    ques3ans = 2
                    editTextTextPersonName3.setEnabled(false)
                    editTextTextPersonName3.text = null
                    gv.setrelationship3("父親")
                }else if (spinner3.getSelectedItem().toString() == "母親")
                {
                    ques3ans = 3
                    editTextTextPersonName3.setEnabled(false)
                    editTextTextPersonName3.text = null
                    gv.setrelationship3("母親")
                }else if (spinner3.getSelectedItem().toString() == "爺爺或外公")
                {
                    ques3ans = 4
                    editTextTextPersonName3.setEnabled(false)
                    editTextTextPersonName3.text = null
                    gv.setrelationship3("爺爺或外公")
                }else if (spinner3.getSelectedItem().toString() == "奶奶或外婆")
                {
                    ques3ans = 5
                    editTextTextPersonName3.setEnabled(false)
                    editTextTextPersonName3.text = null
                    gv.setrelationship3("奶奶或外婆")
                }else if (spinner3.getSelectedItem().toString() == "其他")
                {
                    ques3ans = 6
                    editTextTextPersonName3.setEnabled(true)
                    ques3anselse = editTextTextPersonName3.text.toString()
                    gv.setrelationship3(editTextTextPersonName3.text.toString())
                }
                //Toast.makeText(this@user, ques3ans.toString(), Toast.LENGTH_SHORT).show()
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
                Toast.makeText(this@user, "你沒選擇" , Toast.LENGTH_SHORT).show()
            }
        }
        //---------------------------Spinner 4 ↓
        val ques4 = arrayListOf("請選擇","第一","第二","第三","第四","第五","其他")
        val adapter4 = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, ques4)
        spinner4.adapter = adapter4
        spinner4.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                //關閉虛擬鍵盤
                val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
                imm.hideSoftInputFromWindow(spinner4.windowToken, 0)
                //Toast.makeText(this@user, "該位孩子在家中排行: " + ques4[position] , Toast.LENGTH_SHORT).show()
                if (spinner4.getSelectedItem().toString() == "第一"){
                    ques4ans = 1
                    editTextTextPersonName4.setEnabled(false)
                    editTextTextPersonName4.text = null
                    gv.setrelationship4("1")
                }else if (spinner4.getSelectedItem().toString() == "第二")
                {
                    ques4ans = 2
                    editTextTextPersonName4.setEnabled(false)
                    editTextTextPersonName4.text = null
                    gv.setrelationship4("2")
                }else if (spinner4.getSelectedItem().toString() == "第三")
                {
                    ques4ans = 3
                    editTextTextPersonName4.setEnabled(false)
                    editTextTextPersonName4.text = null
                    gv.setrelationship4("3")
                }else if (spinner4.getSelectedItem().toString() == "第四")
                {
                    ques4ans = 4
                    editTextTextPersonName4.setEnabled(false)
                    editTextTextPersonName4.text = null
                    gv.setrelationship4("4")
                }else if (spinner4.getSelectedItem().toString() == "第五")
                {
                    ques4ans = 5
                    editTextTextPersonName4.setEnabled(false)
                    editTextTextPersonName4.text = null
                    gv.setrelationship4("5")
                }else if (spinner4.getSelectedItem().toString() == "其他")
                {
                    ques4ans = 6
                    editTextTextPersonName4.setEnabled(true)
                    editTextTextPersonName4.setInputType(EditorInfo.TYPE_CLASS_PHONE);
                    ques4anselse = editTextTextPersonName4.text.toString()
                    gv.setrelationship4(editTextTextPersonName4.text.toString())
                }
                //Toast.makeText(this@user, ques4ans.toString(), Toast.LENGTH_SHORT).show()
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
                Toast.makeText(this@user, "你沒選擇" , Toast.LENGTH_SHORT).show()
            }
        }
        //---------------------------Spinner 4_1 ↓
        val ques4_1 = arrayListOf("請選擇","1","2","3","4","5","其他")
        val adapter4_1 = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, ques4_1)
        spinner4_1.adapter = adapter4_1
        spinner4_1.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                //關閉虛擬鍵盤
                val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
                imm.hideSoftInputFromWindow(spinner4_1.windowToken, 0)
                //Toast.makeText(this@user, "兄弟姊妹人數: " + ques4_1[position] + "人", Toast.LENGTH_SHORT).show()
                if (spinner4_1.getSelectedItem().toString() == "1"){
                    ques4_1ans = 1
                    editTextTextPersonName5.setEnabled(false)
                    editTextTextPersonName5.text = null
                    gv.setrelationship5("1")
                }else if (spinner4_1.getSelectedItem().toString() == "2")
                {
                    ques4_1ans = 2
                    editTextTextPersonName5.setEnabled(false)
                    editTextTextPersonName5.text = null
                    gv.setrelationship5("2")
                }else if (spinner4_1.getSelectedItem().toString() == "3")
                {
                    ques4_1ans = 3
                    editTextTextPersonName5.setEnabled(false)
                    editTextTextPersonName5.text = null
                    gv.setrelationship5("3")
                }else if (spinner4_1.getSelectedItem().toString() == "4")
                {
                    ques4_1ans = 4
                    editTextTextPersonName5.setEnabled(false)
                    editTextTextPersonName5.text = null
                    gv.setrelationship5("4")
                }else if (spinner4_1.getSelectedItem().toString() == "5")
                {
                    ques4_1ans = 5
                    editTextTextPersonName5.setEnabled(false)
                    editTextTextPersonName5.text = null
                    gv.setrelationship5("5")
                }else if (spinner4_1.getSelectedItem().toString() == "其他")
                {
                    ques4_1ans = 6
                    editTextTextPersonName5.setEnabled(true)
                    editTextTextPersonName5.setInputType(EditorInfo.TYPE_CLASS_PHONE);
                    ques4_1anselse = editTextTextPersonName5.text.toString()
                    gv.setrelationship5(editTextTextPersonName5.text.toString())
                }
                //Toast.makeText(this@user, ques4_1ans.toString(), Toast.LENGTH_SHORT).show()
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
                Toast.makeText(this@user, "你沒選擇" , Toast.LENGTH_SHORT).show()
            }
        }
        //---------------------------Spinner 5 ↓
        val ques5 = arrayListOf("請選擇","是,藥名","否")
        val adapter5 = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, ques5)
        spinner5.adapter = adapter5
        spinner5.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                //關閉虛擬鍵盤
                val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
                imm.hideSoftInputFromWindow(spinner5.windowToken, 0)
                //Toast.makeText(this@user, "該孩子目前是否服過動或情緒藥物: " + ques5[position], Toast.LENGTH_SHORT).show()
                if (spinner5.getSelectedItem().toString() == "是,藥名"){
                    ques5ans = 1
                    editTextTextPersonName6.setEnabled(true)
                    ques5anselse = editTextTextPersonName6.text.toString()
                    gv.setrelationship6(editTextTextPersonName6.text.toString())
                }else if (spinner5.getSelectedItem().toString() == "否")
                {
                    ques5ans = 2
                    editTextTextPersonName6.setEnabled(false)
                    editTextTextPersonName6.text = null
                    gv.setrelationship6("否")
                }
                //Toast.makeText(this@user, ques5ans.toString(), Toast.LENGTH_SHORT).show()
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
                Toast.makeText(this@user, "你沒選擇" , Toast.LENGTH_SHORT).show()
            }
        }
        //---------------------------Spinner 6 ↓
        val ques6 = arrayListOf("請選擇","父母雙薪","父親","母親","其他")
        val adapter6 = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, ques6)
        spinner6.adapter = adapter6
        spinner6.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                //關閉虛擬鍵盤
                val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
                imm.hideSoftInputFromWindow(spinner6.windowToken, 0)
                //Toast.makeText(this@user, "家中經濟來源: " + ques6[position], Toast.LENGTH_SHORT).show()
                if (spinner6.getSelectedItem().toString() == "父母雙薪"){
                    ques6ans = 1
                    editTextTextPersonName7.setEnabled(false)
                    editTextTextPersonName7.text = null
                    gv.setrelationship7("父母雙薪")
                }else if (spinner6.getSelectedItem().toString() == "父親")
                {
                    ques6ans = 2
                    editTextTextPersonName7.setEnabled(false)
                    editTextTextPersonName7.text = null
                    gv.setrelationship7("父親")
                }else if (spinner6.getSelectedItem().toString() == "母親")
                {
                    ques6ans = 3
                    editTextTextPersonName7.setEnabled(false)
                    editTextTextPersonName7.text = null
                    gv.setrelationship7("母親")
                }else if (spinner6.getSelectedItem().toString() == "其他")
                {
                    ques6ans = 4
                    editTextTextPersonName7.setEnabled(true)
                    ques6anselse = editTextTextPersonName7.text.toString()
                    gv.setrelationship7(editTextTextPersonName7.text.toString())
                }
                //Toast.makeText(this@user, ques6ans.toString(), Toast.LENGTH_SHORT).show()
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
                Toast.makeText(this@user, "你沒選擇" , Toast.LENGTH_SHORT).show()
            }
        }
        //---------------------------Spinner 7 ↓
        val ques7 = arrayListOf("請選擇","不識字","小學","中學","高中/高職","大學/專科","碩士","博士")
        val adapter7 = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, ques7)
        spinner7.adapter = adapter7
        spinner7.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                //關閉虛擬鍵盤
                val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
                imm.hideSoftInputFromWindow(spinner7.windowToken, 0)
                //Toast.makeText(this@user, "父親教育程度: " + ques7[position], Toast.LENGTH_SHORT).show()
                if (spinner7.getSelectedItem().toString() == "不識字"){
                    ques7ans = 1
                    gv.setrelationship8("不識字")
                }else if (spinner7.getSelectedItem().toString() == "小學")
                {
                    ques7ans = 2
                    gv.setrelationship8("小學")
                }else if (spinner7.getSelectedItem().toString() == "中學")
                {
                    ques7ans = 3
                    gv.setrelationship8("中學")
                }else if (spinner7.getSelectedItem().toString() == "高中/高職")
                {
                    ques7ans = 4
                    gv.setrelationship8("高中/高職")
                }else if (spinner7.getSelectedItem().toString() == "大學/專科")
                {
                    ques7ans = 5
                    gv.setrelationship8("大學/專科")
                }else if (spinner7.getSelectedItem().toString() == "碩士")
                {
                    ques7ans = 6
                    gv.setrelationship8("碩士")
                }else if (spinner7.getSelectedItem().toString() == "博士")
                {
                    ques7ans = 7
                    gv.setrelationship8("博士")
                }

                //Toast.makeText(this@user, ques7ans.toString(), Toast.LENGTH_SHORT).show()
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
                Toast.makeText(this@user, "你沒選擇" , Toast.LENGTH_SHORT).show()
            }
        }
        //---------------------------Spinner 8 ↓
        val ques8 = arrayListOf("請選擇",  "不識字","小學","中學","高中/高職","大學/專科","碩士","博士")
        val adapter8 = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, ques8)
        spinner8.adapter = adapter8
        spinner8.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                //關閉虛擬鍵盤
                val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
                imm.hideSoftInputFromWindow(spinner8.windowToken, 0)
                //Toast.makeText(this@user, "母親教育程度: " + ques8[position], Toast.LENGTH_SHORT).show()
                if (spinner8.getSelectedItem().toString() == "不識字"){
                    ques8ans = 1
                    gv.setrelationship9("不識字")
                }else if (spinner8.getSelectedItem().toString() == "小學")
                {
                    ques8ans = 2
                    gv.setrelationship9("小學")
                }else if (spinner8.getSelectedItem().toString() == "中學")
                {
                    ques8ans = 3
                    gv.setrelationship9("中學")
                }else if (spinner8.getSelectedItem().toString() == "高中/高職")
                {
                    ques8ans = 4
                    gv.setrelationship9("高中/高職")
                }else if (spinner8.getSelectedItem().toString() == "大學/專科")
                {
                    ques8ans = 5
                    gv.setrelationship9("大學/專科")
                }else if (spinner8.getSelectedItem().toString() == "碩士")
                {
                    ques8ans = 6
                    gv.setrelationship9("碩士")
                }else if (spinner8.getSelectedItem().toString() == "博士")
                {
                    ques8ans = 7
                    gv.setrelationship9("博士")
                }

                //Toast.makeText(this@user, ques8ans.toString(), Toast.LENGTH_SHORT).show()
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
                Toast.makeText(this@user, "你沒選擇" , Toast.LENGTH_SHORT).show()
            }
        }
        //-----------------------------------↑-SPINNER-↑-------------------------------------//
        /*var q1   = ""
        val q2   = ""
        val q3   = ""
        val q4   = ""
        val q4_1 = ""
        val q5   = ""
        val q6   = ""
        val q7   = ""
        val q8   = ""

        Thread {
            val con = MysqlCon()
            val first="SELECT parent_id FROM `relationship` where `parent_id`= '"+ gv.getuser()+ "'"
            val record = con.getfirst(first)
            if (record.toString() != "")
            {
                val first = "SELECT relationship FROM `relationship` where `parent_id`= '"+ gv.getuser()+ "'"
                val record = con.getfirst(first)
                q1 = record
                Log.e("re",q1)
            }
        }.start()

         */









        imageView10.setOnClickListener {
            startActivity(Intent(this,main::class.java))
        }

        button9.setOnClickListener {
            //TEST OK [7/18 19:30/20:00]

            /*
            ques1anselse = editTextTextPersonName.text.toString()
            ques2anselse = editTextTextPersonName2.text.toString()
            ques3anselse = editTextTextPersonName3.text.toString()
            ques4anselse = editTextTextPersonName4.text.toString()
            ques4_1anselse = editTextTextPersonName5.text.toString()
            ques5anselse = editTextTextPersonName6.text.toString()
            ques6anselse = editTextTextPersonName7.text.toString()

            //TEST OK [5/14 14:03]

            var bundle = Bundle()
            bundle.putInt("ques1ans",ques1ans.toInt())
            bundle.putString("ques1anselse",ques1anselse.toString())
            bundle.putInt("ques2ans",ques2ans.toInt())
            bundle.putString("ques2anselse",ques2anselse.toString())
            bundle.putInt("ques3ans",ques3ans.toInt())
            bundle.putString("ques3anselse",ques3anselse.toString())
            bundle.putInt("ques4ans",ques4ans.toInt())
            bundle.putString("ques4anselse",ques4anselse.toString())
            bundle.putInt("ques4_1ans",ques4_1ans.toInt())
            bundle.putString("ques4_1anselse",ques4_1anselse.toString())
            bundle.putInt("ques5ans",ques5ans.toInt())
            bundle.putString("ques5anselse",ques5anselse.toString())
            bundle.putInt("ques6ans",ques6ans.toInt())
            bundle.putString("ques6anselse",ques6anselse.toString())
            bundle.putInt("ques7ans",ques7ans.toInt())
            bundle.putInt("ques8ans",ques8ans.toInt())

            var intent = Intent(this@user,for_test::class.java)
            intent.putExtra("bundle",bundle)
            startActivity(intent)

             */
            //關係
            if (spinner1.getSelectedItem().toString() == "其他")
            {
                gv.setrelationship1(editTextTextPersonName.text.toString())
            }
            //誰同住
            if (spinner2.getSelectedItem().toString() == "曾經有但現在沒有(同住多久?___年)")
            {
                gv.setrelationship2(editTextTextPersonName2.text.toString())
            }
            //誰管教
            if (spinner3.getSelectedItem().toString() == "其他")
            {
                gv.setrelationship3(editTextTextPersonName3.text.toString())
            }
            //家中排行
            if (spinner4.getSelectedItem().toString() == "其他")
            {
                gv.setrelationship4(editTextTextPersonName4.text.toString())
            }
            //兄弟姊妹人數
            if (spinner4_1.getSelectedItem().toString() == "其他")
            {
                gv.setrelationship5(editTextTextPersonName5.text.toString())
            }
            //藥物
            if (spinner5.getSelectedItem().toString() == "是,藥名")
            {
                gv.setrelationship6(editTextTextPersonName6.text.toString())
            }
            //經濟來源
            if (spinner6.getSelectedItem().toString() == "其他")
            {
                gv.setrelationship7(editTextTextPersonName7.text.toString())
            }

            Thread {
                val con = MysqlCon()
                con.updaterelationship(
                    gv.getuser(),
                    gv.getrelationship1(),
                    gv.getrelationship2(),
                    gv.getrelationship3(),
                    gv.getrelationship4(),
                    gv.getrelationship5(),
                    gv.getrelationship6(),
                    gv.getrelationship7(),
                    gv.getrelationship8(),
                    gv.getrelationship9()
                )
                val first="SELECT parent_id FROM `mood_disorders_scale_w` where `parent_id`= '"+ gv.getuser()+ "'"
                val record = con.getfirst(first)
                if (record.toString() == null || record.toString() == "")
                {
                    val intent = Intent(this@user, child_emotions::class.java)
                    startActivity(intent)
                }else
                {
                    val intent = Intent(this@user, main::class.java)
                    startActivity(intent)
                }
            }.start()

            /*Toast.makeText(this, "完成", Toast.LENGTH_SHORT).show()
            var intent = Intent(this@user, main::class.java)
            startActivity(intent)

             */



        }

        }

    fun onLoginClick(view: View) {
        startActivity(Intent(this,main::class.java))
    }

    }