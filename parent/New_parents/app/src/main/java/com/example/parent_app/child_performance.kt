package com.example.parent_app

import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_child_performance.*

class child_performance : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_child_performance)
        var performance_ans1 = 0
        var performance_ans2 = 0
        var performance_ans3 = 0
        var performance_ans4 = 0
        var performance_ans5 = 0
        var performance_ans6 = 0
        var performance_ans7 = 0
        var performance_ans8 = 0
        var performance_ans9 = 0
        var performance_ans10 = 0

        //建立共用變數類別
        val gv = applicationContext as GlobalVariable

        radioButton1_emotions2.setOnClickListener {
            performance_ans1 = 1
            gv.setperformance1("1")
            Toast.makeText(this@child_performance, "從不這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton2_emotions2.setOnClickListener {
            performance_ans1 = 2
            gv.setperformance1("2")
            Toast.makeText(this@child_performance, "很少這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton3.setOnClickListener {
            performance_ans1 = 3
            gv.setperformance1("3")
            Toast.makeText(this@child_performance, "有時這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton4.setOnClickListener {
            performance_ans1 = 4
            gv.setperformance1("4")
            Toast.makeText(this@child_performance, "經常這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton5.setOnClickListener {
            performance_ans1 = 5
            gv.setperformance1("5")
            Toast.makeText(this@child_performance, "總是這樣", Toast.LENGTH_SHORT).show()
        }
        // radiogroup 2 第二題 ↓↓
        radioButton6.setOnClickListener {
            performance_ans2 = 1
            gv.setperformance2("1")
            Toast.makeText(this@child_performance, "從不這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton7.setOnClickListener {
            performance_ans2 = 2
            gv.setperformance2("2")
            Toast.makeText(this@child_performance, "很少這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton8.setOnClickListener {
            performance_ans2 = 3
            gv.setperformance2("3")
            Toast.makeText(this@child_performance, "有時這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton9.setOnClickListener {
            performance_ans2 = 4
            gv.setperformance2("4")
            Toast.makeText(this@child_performance, "經常這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton10.setOnClickListener {
            performance_ans2 = 5
            gv.setperformance2("5")
            Toast.makeText(this@child_performance, "總是這樣", Toast.LENGTH_SHORT).show()
        }
        // radiogroup 3 第三題 ↓↓
        radioButton11.setOnClickListener {
            performance_ans3 = 1
            gv.setperformance3("1")
            Toast.makeText(this@child_performance, "從不這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton12.setOnClickListener {
            performance_ans3 = 2
            gv.setperformance3("2")
            Toast.makeText(this@child_performance, "很少這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton13.setOnClickListener {
            performance_ans3 = 3
            gv.setperformance3("3")
            Toast.makeText(this@child_performance, "有時這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton14.setOnClickListener {
            performance_ans3 = 4
            gv.setperformance3("4")
            Toast.makeText(this@child_performance, "經常這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton15.setOnClickListener {
            performance_ans3 = 5
            gv.setperformance3("5")
            Toast.makeText(this@child_performance, "總是這樣", Toast.LENGTH_SHORT).show()
        }
        // radiogroup 4 第四題 ↓↓
        radioButton16.setOnClickListener {
            performance_ans4 = 1
            gv.setperformance4("1")
            Toast.makeText(this@child_performance, "從不這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton17.setOnClickListener {
            performance_ans4 = 2
            gv.setperformance4("2")
            Toast.makeText(this@child_performance, "很少這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton18.setOnClickListener {
            performance_ans4 = 3
            gv.setperformance4("3")
            Toast.makeText(this@child_performance, "有時這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton19.setOnClickListener {
            performance_ans4 = 4
            gv.setperformance4("4")
            Toast.makeText(this@child_performance, "經常這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton20.setOnClickListener {
            performance_ans4 = 5
            gv.setperformance4("5")
            Toast.makeText(this@child_performance, "總是這樣", Toast.LENGTH_SHORT).show()
        }
        // radiogroup 5 第五題 ↓↓
        radioButton21.setOnClickListener {
            performance_ans5 = 1
            gv.setperformance5("1")
            Toast.makeText(this@child_performance, "從不這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton22_performance.setOnClickListener {
            performance_ans5 = 2
            gv.setperformance5("2")
            Toast.makeText(this@child_performance, "很少這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton23.setOnClickListener {
            performance_ans5 = 3
            gv.setperformance5("3")
            Toast.makeText(this@child_performance, "有時這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton23_emotions2.setOnClickListener {
            performance_ans5 = 4
            gv.setperformance5("4")
            Toast.makeText(this@child_performance, "經常這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton25.setOnClickListener {
            performance_ans5 = 5
            gv.setperformance5("5")
            Toast.makeText(this@child_performance, "總是這樣", Toast.LENGTH_SHORT).show()
        }
        // radiogroup 6 第六題 ↓↓
        radioButton26.setOnClickListener {
            performance_ans6 = 1
            gv.setperformance6("1")
            Toast.makeText(this@child_performance, "從不這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton27.setOnClickListener {
            performance_ans6 = 2
            gv.setperformance6("2")
            Toast.makeText(this@child_performance, "很少這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton28.setOnClickListener {
            performance_ans6 = 3
            gv.setperformance6("3")
            Toast.makeText(this@child_performance, "有時這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton29.setOnClickListener {
            performance_ans6 = 4
            gv.setperformance6("4")
            Toast.makeText(this@child_performance, "經常這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton30.setOnClickListener {
            performance_ans6 = 5
            gv.setperformance6("5")
            Toast.makeText(this@child_performance, "總是這樣", Toast.LENGTH_SHORT).show()
        }
        // radiogroup 7 第七題 ↓↓
        radioButton31.setOnClickListener {
            performance_ans7 = 1
            gv.setperformance7("1")
            Toast.makeText(this@child_performance, "從不這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton32.setOnClickListener {
            performance_ans7 = 2
            gv.setperformance7("2")
            Toast.makeText(this@child_performance, "很少這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton33.setOnClickListener {
            performance_ans7 = 3
            gv.setperformance7("3")
            Toast.makeText(this@child_performance, "有時這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton34.setOnClickListener {
            performance_ans7 = 4
            gv.setperformance7("4")
            Toast.makeText(this@child_performance, "經常這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton35.setOnClickListener {
            performance_ans7 = 5
            gv.setperformance7("5")
            Toast.makeText(this@child_performance, "總是這樣", Toast.LENGTH_SHORT).show()
        }
        // radiogroup 8 第八題 ↓↓
        radioButton36.setOnClickListener {
            performance_ans8 = 1
            gv.setperformance8("1")
            Toast.makeText(this@child_performance, "從不這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton37.setOnClickListener {
            performance_ans8 = 2
            gv.setperformance8("2")
            Toast.makeText(this@child_performance, "很少這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton38.setOnClickListener {
            performance_ans8 = 3
            gv.setperformance8("3")
            Toast.makeText(this@child_performance, "有時這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton39.setOnClickListener {
            performance_ans8 = 4
            gv.setperformance8("4")
            Toast.makeText(this@child_performance, "經常這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton40.setOnClickListener {
            performance_ans8 = 5
            gv.setperformance8("5")
            Toast.makeText(this@child_performance, "總是這樣", Toast.LENGTH_SHORT).show()
        }
        // radiogroup 9 第九題 ↓↓
        radioButton41.setOnClickListener {
            performance_ans9 = 1
            gv.setperformance9("1")
            Toast.makeText(this@child_performance, "從不這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton42.setOnClickListener {
            performance_ans9 = 2
            gv.setperformance9("2")
            Toast.makeText(this@child_performance, "很少這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton43.setOnClickListener {
            performance_ans9 = 3
            gv.setperformance9("3")
            Toast.makeText(this@child_performance, "有時這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton44.setOnClickListener {
            performance_ans9 = 4
            gv.setperformance9("4")
            Toast.makeText(this@child_performance, "經常這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton45.setOnClickListener {
            performance_ans9 = 5
            gv.setperformance9("5")
            Toast.makeText(this@child_performance, "總是這樣", Toast.LENGTH_SHORT).show()
        }
        // radiogroup 10 第十題 ↓↓
        radioButton46.setOnClickListener {
            performance_ans10 = 1
            gv.setperformance10("1")
            Toast.makeText(this@child_performance, "從不這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton47.setOnClickListener {
            performance_ans10 = 2
            gv.setperformance10("2")
            Toast.makeText(this@child_performance, "很少這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton48.setOnClickListener {
            performance_ans10 = 3
            gv.setperformance10("3")
            Toast.makeText(this@child_performance, "有時這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton49.setOnClickListener {
            performance_ans10 = 4
            gv.setperformance10("4")
            Toast.makeText(this@child_performance, "經常這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton50.setOnClickListener {
            performance_ans10 = 5
            gv.setperformance10("5")
            Toast.makeText(this@child_performance, "總是這樣", Toast.LENGTH_SHORT).show()
        }

        button9.setOnClickListener {
            if (performance_ans1 == 0 || performance_ans2 == 0 || performance_ans3 == 0 || performance_ans4 == 0 ||
                    performance_ans5 == 0 || performance_ans6 == 0 || performance_ans7 == 0 || performance_ans8 == 0 ||
                    performance_ans9 == 0 || performance_ans10 == 0
            ) {
                // TEST OK [04/30 14:44]

                AlertDialog.Builder(this)
                        .setMessage("請將題目填完再點選送出")
                        .setTitle("有題目尚未填寫")
                        .setPositiveButton("OK", null)
                        .show()

            } else {
                // 測試
                // TEST OK [04/30 14:45]
                // TEST OK [05/07 14:10]
                // TEST OK [05/07 14:25]
                // TEST OK [05/07 15:55]
                /*
                var bundle = Bundle()
                bundle.putInt("performance_ans1",performance_ans1)
                bundle.putInt("performance_ans2",performance_ans2)
                bundle.putInt("performance_ans3",performance_ans3)
                bundle.putInt("performance_ans4",performance_ans4)
                bundle.putInt("performance_ans5",performance_ans5)
                bundle.putInt("performance_ans6",performance_ans6)
                bundle.putInt("performance_ans7",performance_ans7)
                bundle.putInt("performance_ans8",performance_ans8)
                bundle.putInt("performance_ans9",performance_ans9)
                bundle.putInt("performance_ans10",performance_ans10)
                var intent = Intent(this@child_performance,for_test::class.java)
                intent.putExtra("bundle",bundle)
                startActivity(intent)

                 */

                Thread {
                    val con = MysqlCon()
                    con.adaptation_scale_w(
                        gv.getuser(),
                        gv.getperformance1(),
                        gv.getperformance2(),
                        gv.getperformance3(),
                        gv.getperformance4(),
                        gv.getperformance5(),
                        gv.getperformance6(),
                        gv.getperformance7(),
                        gv.getperformance8(),
                        gv.getperformance9(),
                        gv.getperformance10()
                    )
                }.start()



                /*var intent = Intent(this, main::class.java)
                startActivity(intent)*/

                //實體化layout
                val inflater = layoutInflater
                val textEntryView: View = inflater.inflate(R.layout.custom_dialog3, null)

                //用setView把layout放進去

                //用setView把layout放進去
                val builder = AlertDialog.Builder(this@child_performance)
                builder.setView(textEntryView)

                //創建一個Dialog

                //創建一個Dialog
                val alert = builder.create()

                //layout中Button結束事件

                //layout中Button結束事件
                val finsh = textEntryView.findViewById<View>(R.id.finsh) as Button
                finsh.setOnClickListener {
                    val intent = Intent(this@child_performance, main::class.java)
                    startActivity(intent)
                }
                alert.show()



            }
        }
    }
        fun onLoginClick(view: View) {
            finish()
        }
    }
