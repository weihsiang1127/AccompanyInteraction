package com.example.parent_app

import android.app.AlertDialog
import android.app.DatePickerDialog
import android.content.Intent
import android.icu.text.SimpleDateFormat
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.mysql.jdbc.TimeUtil
import kotlinx.android.synthetic.main.activity_main.*
import java.text.ParseException
import java.util.*

class main : AppCompatActivity() {
    var arrayList = ArrayList<HashMap<String, String>>() //取得所有資料

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //建立共用變數類別
        var gv = applicationContext as GlobalVariable

        val txtdashboard = findViewById (R.id.txtdashboard) as TextView

        val thread1: Thread = object : Thread() {
            override fun run() {
                val con = MysqlCon()
                con.run()
                arrayList = con.getstdname(gv.getuser())
            }
        }
        thread1.start()

        try {
            thread1.join()
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }

        txtdashboard.text =  arrayList.get(0).get("student_name") + "家長"

        signout.setOnClickListener {
            startActivity(Intent(this,login_page::class.java))
        }

    }


    fun user(view: View) {
        startActivity(Intent(this,user2::class.java))
    }

    fun child_emotions(view: View) {
        //建立共用變數類別
        var gv = applicationContext as GlobalVariable
        var cn = ""

        //取資料
        val thread1: Thread = object : Thread() {
            override fun run() {
                val con = MysqlCon()
                con.run()
                cn = con.getsdisorderscount(gv.getuser())
            }
        }

        thread1.start()

        try {
            thread1.join()
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }

        if(cn.equals("1")){
            Toast.makeText(this, "已填寫過孩子的行為" /*這行可直接取得選中內容*/, Toast.LENGTH_SHORT).show()
        }else{
            startActivity(Intent(this,child_emotions::class.java))
        }

    }

    @RequiresApi(Build.VERSION_CODES.N)
    fun child_performance(view: View) {
        //建立共用變數類別
        val gv = applicationContext as GlobalVariable
        var cn = ""

        //判斷是否親子綁定
        val thread1: Thread = object : Thread() {
            override fun run() {
                val con = MysqlCon()
                con.run()
                arrayList = con.getstudent(gv.getuser())
            }
        }

        thread1.start()

        try {
            thread1.join()
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }

        if(arrayList.get(0).get("student_id").equals("null")){
            Toast.makeText(
                this,
                "尚未進行親子綁定",
                Toast.LENGTH_LONG
            ).show()
        }else {
            gv.setstudent(arrayList.get(0).get("student_id"));
           //判斷是否第一次填寫
            val thread1: Thread = object : Thread() {
                override fun run() {
                    val con = MysqlCon()
                    con.run()
                    cn = con.getadaptationcount(gv.getuser())
                }
            }

            thread1.start()

            try {
                thread1.join()
            } catch (e: InterruptedException) {
                e.printStackTrace()
            }

            if (cn.equals("0")) {
                startActivity(Intent(this, child_performance::class.java))
            } else {

                val thread1: Thread = object : Thread() {
                    override fun run() {
                        val con = MysqlCon()
                        con.run()
                        arrayList = con.getmaxdate(gv.getuser())
                    }
                }
                thread1.start()

                try {
                    thread1.join()
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                }

                //定義好時間字串的格式
                val sdf = SimpleDateFormat("yyyy-MM-dd")
                //將字串轉成Date型
                //將字串轉成Date型
                var dt: Date? = null
                try {
                    dt = sdf.parse(arrayList.get(0).get("date"))
                } catch (e: ParseException) {
                    e.printStackTrace()
                }
                //新增一個Calendar,並且指定時間
                //新增一個Calendar,並且指定時間
                val calendar = Calendar.getInstance()
                calendar.time = dt
                val add: Int = arrayList.get(0).get("adaptation_scale")!!.toInt() * 7
                Log.v("DB", "寫入資料完成：$add")
                calendar.add(Calendar.DATE, add) //日期++

                val tdt = calendar.time //取得加減過後的Date


                //依照設定格式取得字串

                //依照設定格式取得字串
                val time = sdf.format(tdt)
                //系統時間
                //系統時間
                val date = sdf.format(Date())

                try {
                    val sdate = sdf.parse(time) //第一個日期（字符串）
                    val edate = sdf.parse(date) //第二個日期（字符串）

                    Log.v("DB", sdate.toString())
                    Log.v("DB", edate.toString())

                    //如果時間到跳出前往量表
                    if (sdate.time <= edate.time) {
                        startActivity(Intent(this, child_performance::class.java))
                    } else {
                        Toast.makeText(
                            this,
                            "下次填寫時間為" + StampToDate(sdate.time, Locale.TAIWAN),
                            Toast.LENGTH_LONG
                        ).show()
                    }
                } catch (e: ParseException) {
                    e.printStackTrace()
                }
            }
        }

    }

    fun child_interaction(view: View) {
        startActivity(Intent(this,child_interaction::class.java))
    }

    fun record(view: View) {
        val gv = applicationContext as GlobalVariable
        val c = Calendar.getInstance()
        val year = c[Calendar.YEAR]
        val month = c[Calendar.MONTH]
        val day = c[Calendar.DAY_OF_MONTH]
        DatePickerDialog(this,
            { view, year, month, dayOfMonth ->
                var month = month
                month = month + 1
                gv.setstatistics("$year-$month-$dayOfMonth")
                val intent = Intent(this, record::class.java)
                startActivity(intent)
            }, year, month, day
        ).show()
    }
    fun manual(view: View) {
        startActivity(Intent(this,manual::class.java))
    }

    fun pie(view: View) {
        val gv = applicationContext as GlobalVariable
        val c = Calendar.getInstance()
        val year = c[Calendar.YEAR]
        val month = c[Calendar.MONTH]
        val day = c[Calendar.DAY_OF_MONTH]
        DatePickerDialog(this,
            { view, year, month, dayOfMonth ->
                var month = month
                month = month + 1
                gv.setstatistics("$year-$month-$dayOfMonth")

                val intent = Intent(this, mood_statistics_activity::class.java)
                startActivity(intent)
            }, year, month, day
        ).show()
    }

    @RequiresApi(Build.VERSION_CODES.N)
    fun StampToDate(time: Long, locale: Locale): String {
        // 進來的time以秒為單位，Date輸入為毫秒為單位，要注意

        val simpleDateFormat = SimpleDateFormat("yyyy-MM-dd", locale)

        return simpleDateFormat.format(Date(time))
    }


}