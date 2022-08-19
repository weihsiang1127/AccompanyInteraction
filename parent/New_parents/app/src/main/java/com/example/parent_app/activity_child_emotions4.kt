package com.example.parent_app

import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_child_emotions3.*
import kotlinx.android.synthetic.main.activity_child_emotions4.*
import kotlinx.android.synthetic.main.activity_child_emotions4.radioButton3
import kotlinx.android.synthetic.main.activity_child_emotions4.radioButton4
import kotlinx.android.synthetic.main.activity_child_emotions4.radioButton5

class activity_child_emotions4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_child_emotions4)

        var get_emotions_ans1 = intent.getBundleExtra("bundle")?.getInt("emotions_ans1")
        var get_emotions_ans2 = intent.getBundleExtra("bundle")?.getInt("emotions_ans2")
        var get_emotions_ans3 = intent.getBundleExtra("bundle")?.getInt("emotions_ans3")
        var get_emotions_ans4 = intent.getBundleExtra("bundle")?.getInt("emotions_ans4")
        var get_emotions_ans5 = intent.getBundleExtra("bundle")?.getInt("emotions_ans5")
        var get_emotions_ans6 = intent.getBundleExtra("bundle")?.getInt("emotions_ans6")
        var get_emotions_ans7 = intent.getBundleExtra("bundle")?.getInt("emotions_ans7")
        var get_emotions_ans8 = intent.getBundleExtra("bundle")?.getInt("emotions_ans8")
        var get_emotions_ans9 = intent.getBundleExtra("bundle")?.getInt("emotions_ans9")
        var get_emotions_ans10 = intent.getBundleExtra("bundle")?.getInt("emotions_ans10")
        var get_emotions_ans11 = intent.getBundleExtra("bundle")?.getInt("emotions_ans11")
        var get_emotions_ans12 = intent.getBundleExtra("bundle")?.getInt("emotions_ans12")
        var get_emotions_ans13 = intent.getBundleExtra("bundle")?.getInt("emotions_ans13")
        var get_emotions_ans14 = intent.getBundleExtra("bundle")?.getInt("emotions_ans14")
        var get_emotions_ans15 = intent.getBundleExtra("bundle")?.getInt("emotions_ans15")
        var get_emotions_ans16 = intent.getBundleExtra("bundle")?.getInt("emotions_ans16")
        var get_emotions_ans17 = intent.getBundleExtra("bundle")?.getInt("emotions_ans17")
        var get_emotions_ans18 = intent.getBundleExtra("bundle")?.getInt("emotions_ans18")
        var get_emotions_ans19 = intent.getBundleExtra("bundle")?.getInt("emotions_ans19")
        var get_emotions_ans20 = intent.getBundleExtra("bundle")?.getInt("emotions_ans20")

        var emotions_ans1 = get_emotions_ans1.toString()
        var emotions_ans2 = get_emotions_ans2.toString()
        var emotions_ans3 = get_emotions_ans3.toString()
        var emotions_ans4 = get_emotions_ans4.toString()
        var emotions_ans5 = get_emotions_ans5.toString()
        var emotions_ans6 = get_emotions_ans6.toString()
        var emotions_ans7 = get_emotions_ans7.toString()
        var emotions_ans8 = get_emotions_ans8.toString()
        var emotions_ans9 = get_emotions_ans9.toString()
        var emotions_ans10 = get_emotions_ans10.toString()
        var emotions_ans11 = get_emotions_ans11.toString()
        var emotions_ans12 = get_emotions_ans12.toString()
        var emotions_ans13 = get_emotions_ans13.toString()
        var emotions_ans14 = get_emotions_ans14.toString()
        var emotions_ans15 = get_emotions_ans15.toString()
        var emotions_ans16 = get_emotions_ans16.toString()
        var emotions_ans17 = get_emotions_ans17.toString()
        var emotions_ans18 = get_emotions_ans18.toString()
        var emotions_ans19 = get_emotions_ans19.toString()
        var emotions_ans20 = get_emotions_ans20.toString()

        var emotions_ans21 = 0
        var emotions_ans22 = 0
        var emotions_ans23 = 0
        var emotions_ans24 = 0
        var emotions_ans25 = 0
        var emotions_ans26 = 0
        var emotions_ans27 = 0
        var emotions_ans28 = 0

        //建立共用變數類別
        val gv = applicationContext as GlobalVariable

        //Toast.makeText(this, emotions_ans1+ emotions_ans2 + emotions_ans3 + emotions_ans4 + emotions_ans5, Toast.LENGTH_SHORT).show()
        //Toast.makeText(this, emotions_ans6 + emotions_ans7 + emotions_ans8 + emotions_ans9 + emotions_ans10 + emotions_ans11 + emotions_ans12 + emotions_ans13 , Toast.LENGTH_SHORT).show()
        //Toast.makeText(this, emotions_ans14 + emotions_ans15 + emotions_ans16 + emotions_ans17 + emotions_ans18 + emotions_ans19 + emotions_ans20 , Toast.LENGTH_SHORT).show()

        // radiogroup 1 第二一題 ↓↓
        radioButton1_emotions4.setOnClickListener {
            emotions_ans21 = 1
            Toast.makeText(this@activity_child_emotions4, "從不這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton2_emotions4.setOnClickListener {
            emotions_ans21 = 2
            Toast.makeText(this@activity_child_emotions4, "很少這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton3.setOnClickListener {
            emotions_ans21 = 3
            Toast.makeText(this@activity_child_emotions4, "有時這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton4.setOnClickListener {
            emotions_ans21 = 4
            Toast.makeText(this@activity_child_emotions4, "經常這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton5.setOnClickListener {
            emotions_ans21 = 5
            Toast.makeText(this@activity_child_emotions4, "總是這樣", Toast.LENGTH_SHORT).show()
        }
        // radiogroup 2 第二二題 ↓↓
        radioButton6_emotions4.setOnClickListener {
            emotions_ans22 = 1
            Toast.makeText(this@activity_child_emotions4, "從不這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton7_emotions4.setOnClickListener {
            emotions_ans22 = 2
            Toast.makeText(this@activity_child_emotions4, "很少這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton8_emotions4.setOnClickListener {
            emotions_ans22 = 3
            Toast.makeText(this@activity_child_emotions4, "有時這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton9_emotions4.setOnClickListener {
            emotions_ans22 = 4
            Toast.makeText(this@activity_child_emotions4, "經常這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton10_emotions4.setOnClickListener {
            emotions_ans22 = 5
            Toast.makeText(this@activity_child_emotions4, "總是這樣", Toast.LENGTH_SHORT).show()
        }
        // radiogroup 3 第二三題 ↓↓
        radioButton11_emotions4.setOnClickListener {
            emotions_ans23 = 1
            Toast.makeText(this@activity_child_emotions4, "從不這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton12_emotions4.setOnClickListener {
            emotions_ans23 = 2
            Toast.makeText(this@activity_child_emotions4, "很少這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton13_emotions4.setOnClickListener {
            emotions_ans23 = 3
            Toast.makeText(this@activity_child_emotions4, "有時這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton14_emotions4.setOnClickListener {
            emotions_ans23 = 4
            Toast.makeText(this@activity_child_emotions4, "經常這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton15_emotions4.setOnClickListener {
            emotions_ans23 = 5
            Toast.makeText(this@activity_child_emotions4, "總是這樣", Toast.LENGTH_SHORT).show()
        }
        // radiogroup 4 第二四題 ↓↓
        radioButton16_emotions4.setOnClickListener {
            emotions_ans24 = 1
            Toast.makeText(this@activity_child_emotions4, "從不這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton17_emotions4.setOnClickListener {
            emotions_ans24 = 2
            Toast.makeText(this@activity_child_emotions4, "很少這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton18_emotions4.setOnClickListener {
            emotions_ans24 = 3
            Toast.makeText(this@activity_child_emotions4, "有時這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton19_emotions4.setOnClickListener {
            emotions_ans24 = 4
            Toast.makeText(this@activity_child_emotions4, "經常這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton20_emotions4.setOnClickListener {
            emotions_ans24 = 5
            Toast.makeText(this@activity_child_emotions4, "總是這樣", Toast.LENGTH_SHORT).show()
        }
        // radiogroup 5 第二五題 ↓↓
        radioButton21_emotions4.setOnClickListener {
            emotions_ans25 = 1
            Toast.makeText(this@activity_child_emotions4, "從不這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton22_emotions4.setOnClickListener {
            emotions_ans25 = 2
            Toast.makeText(this@activity_child_emotions4, "很少這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton23_emotions4.setOnClickListener {
            emotions_ans25 = 3
            Toast.makeText(this@activity_child_emotions4, "有時這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton24_emotions4.setOnClickListener {
            emotions_ans25 = 4
            Toast.makeText(this@activity_child_emotions4, "經常這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton25_emotions4.setOnClickListener {
            emotions_ans25 = 5
            Toast.makeText(this@activity_child_emotions4, "總是這樣", Toast.LENGTH_SHORT).show()
        }
        // radiogroup 6 第二六題 ↓↓
        radioButton26_emotions4.setOnClickListener {
            emotions_ans26 = 1
            Toast.makeText(this@activity_child_emotions4, "從不這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton27_emotions4.setOnClickListener {
            emotions_ans26 = 2
            Toast.makeText(this@activity_child_emotions4, "很少這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton28_emotions4.setOnClickListener {
            emotions_ans26 = 3
            Toast.makeText(this@activity_child_emotions4, "有時這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton29_emotions4.setOnClickListener {
            emotions_ans26 = 4
            Toast.makeText(this@activity_child_emotions4, "經常這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton30_emotions4.setOnClickListener {
            emotions_ans26 = 5
            Toast.makeText(this@activity_child_emotions4, "總是這樣", Toast.LENGTH_SHORT).show()
        }
        // radiogroup 7 第二七題 ↓↓
        radioButton31_emotions4.setOnClickListener {
            emotions_ans27 = 1
            Toast.makeText(this@activity_child_emotions4, "從不這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton32_emotions4.setOnClickListener {
            emotions_ans27 = 2
            Toast.makeText(this@activity_child_emotions4, "很少這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton33_emotions4.setOnClickListener {
            emotions_ans27 = 3
            Toast.makeText(this@activity_child_emotions4, "有時這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton34_emotions4.setOnClickListener {
            emotions_ans27 = 4
            Toast.makeText(this@activity_child_emotions4, "經常這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton35_emotions4.setOnClickListener {
            emotions_ans27 = 5
            Toast.makeText(this@activity_child_emotions4, "總是這樣", Toast.LENGTH_SHORT).show()
        }
        // radiogroup 8 第二八題 ↓↓
        radioButton36_emotions4.setOnClickListener {
            emotions_ans28 = 1
            Toast.makeText(this@activity_child_emotions4, "從不這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton37_emotions4.setOnClickListener {
            emotions_ans28 = 2
            Toast.makeText(this@activity_child_emotions4, "很少這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton38_emotions4.setOnClickListener {
            emotions_ans28 = 3
            Toast.makeText(this@activity_child_emotions4, "有時這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton39_emotions4.setOnClickListener {
            emotions_ans28 = 4
            Toast.makeText(this@activity_child_emotions4, "經常這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton40_emotions4.setOnClickListener {
            emotions_ans28 = 5
            Toast.makeText(this@activity_child_emotions4, "總是這樣", Toast.LENGTH_SHORT).show()
        }


        cirRegisterButton4.setOnClickListener {
            if (emotions_ans21 == 0 || emotions_ans22 == 0 || emotions_ans23 == 0 || emotions_ans24 == 0 || emotions_ans25 == 0 ||
                    emotions_ans26 == 0 || emotions_ans27 ==0 || emotions_ans28 == 0 )
            {
                AlertDialog.Builder(this)
                        .setMessage("請將題目填完再點選NEXT")
                        .setTitle("有題目尚未填寫")
                        .setPositiveButton("OK", null)
                        .show()
            }else {
                //TEST OK [5/14 14:10]
                /*
                var bundle = Bundle()
                bundle.putInt("emotions_ans1", emotions_ans1.toInt())
                bundle.putInt("emotions_ans2", emotions_ans2.toInt())
                bundle.putInt("emotions_ans3", emotions_ans3.toInt())
                bundle.putInt("emotions_ans4", emotions_ans4.toInt())
                bundle.putInt("emotions_ans5", emotions_ans5.toInt())


                bundle.putInt("emotions_ans6", emotions_ans6.toInt())
                bundle.putInt("emotions_ans7", emotions_ans7.toInt())
                bundle.putInt("emotions_ans8", emotions_ans8.toInt())
                bundle.putInt("emotions_ans9", emotions_ans9.toInt())
                bundle.putInt("emotions_ans10", emotions_ans10.toInt())
                bundle.putInt("emotions_ans11", emotions_ans11.toInt())
                bundle.putInt("emotions_ans12", emotions_ans12.toInt())
                bundle.putInt("emotions_ans13", emotions_ans13.toInt())

                bundle.putInt("emotions_ans14", emotions_ans14.toInt())
                bundle.putInt("emotions_ans15", emotions_ans15.toInt())
                bundle.putInt("emotions_ans16", emotions_ans16.toInt())
                bundle.putInt("emotions_ans17", emotions_ans17.toInt())
                bundle.putInt("emotions_ans18", emotions_ans18.toInt())
                bundle.putInt("emotions_ans19", emotions_ans19.toInt())
                bundle.putInt("emotions_ans20", emotions_ans20.toInt())
                bundle.putInt("emotions_ans21", emotions_ans21.toInt())
                bundle.putInt("emotions_ans22", emotions_ans22.toInt())
                bundle.putInt("emotions_ans23", emotions_ans23.toInt())
                bundle.putInt("emotions_ans24", emotions_ans24.toInt())
                bundle.putInt("emotions_ans25", emotions_ans25.toInt())
                bundle.putInt("emotions_ans26", emotions_ans26.toInt())
                bundle.putInt("emotions_ans27", emotions_ans27.toInt())
                bundle.putInt("emotions_ans28", emotions_ans28.toInt())

                var intent = Intent(this@activity_child_emotions4, for_test::class.java)
                intent.putExtra("bundle", bundle)
                startActivity(intent)

                 */
                gv.setemotions1(emotions_ans1.toString())
                gv.setemotions2(emotions_ans2.toString())
                gv.setemotions3(emotions_ans3.toString())
                gv.setemotions4(emotions_ans4.toString())
                gv.setemotions5(emotions_ans5.toString())
                gv.setemotions6(emotions_ans6.toString())
                gv.setemotions7(emotions_ans7.toString())
                gv.setemotions8(emotions_ans8.toString())
                gv.setemotions9(emotions_ans9.toString())
                gv.setemotions10(emotions_ans10.toString())
                gv.setemotions11(emotions_ans11.toString())
                gv.setemotions12(emotions_ans12.toString())
                gv.setemotions13(emotions_ans13.toString())
                gv.setemotions14(emotions_ans14.toString())
                gv.setemotions15(emotions_ans15.toString())
                gv.setemotions16(emotions_ans16.toString())
                gv.setemotions17(emotions_ans17.toString())
                gv.setemotions18(emotions_ans18.toString())
                gv.setemotions19(emotions_ans19.toString())
                gv.setemotions20(emotions_ans20.toString())
                gv.setemotions21(emotions_ans21.toString())
                gv.setemotions22(emotions_ans22.toString())
                gv.setemotions23(emotions_ans23.toString())
                gv.setemotions24(emotions_ans24.toString())
                gv.setemotions25(emotions_ans25.toString())
                gv.setemotions26(emotions_ans26.toString())
                gv.setemotions27(emotions_ans27.toString())
                gv.setemotions28(emotions_ans28.toString())



                Thread {
                    val con = MysqlCon()
                    con.mood_disorders_scale_w(
                        gv.getuser(),
                        gv.getemotion1(),gv.getemotion2(),gv.getemotion3(),gv.getemotion4(),gv.getemotion5(),
                        gv.getemotion6(),gv.getemotion7(),gv.getemotion8(),gv.getemotion9(),gv.getemotion10(),
                        gv.getemotion11(),gv.getemotion12(),gv.getemotion13(),gv.getemotion14(),gv.getemotion15(),
                        gv.getemotion16(),gv.getemotion17(),gv.getemotion18(),gv.getemotion19(),gv.getemotion20(),
                        gv.getemotion21(),gv.getemotion22(),gv.getemotion23(),gv.getemotion24(),gv.getemotion25(),
                        gv.getemotion26(),gv.getemotion27(),gv.getemotion28()
                    )
                }.start()


                /*var intent = Intent(this@activity_child_emotions4, main::class.java)
                startActivity(intent)*/
                //實體化layout

                //實體化layout
                val inflater = layoutInflater
                val textEntryView: View = inflater.inflate(R.layout.custom_dialog1, null)

                //用setView把layout放進去

                //用setView把layout放進去
                val builder = AlertDialog.Builder(this@activity_child_emotions4)
                builder.setView(textEntryView)

                //創建一個Dialog

                //創建一個Dialog
                val alert = builder.create()

                //layout中Button結束事件

                //layout中Button結束事件
                val finsh = textEntryView.findViewById<View>(R.id.finsh) as Button
                finsh.setOnClickListener {
                    val intent = Intent(this@activity_child_emotions4, main::class.java)
                    startActivity(intent)
                }
                alert.show()
            }

        }

    }
    fun onLoginClick(view: View) {
        startActivity(Intent(this,activity_child_emotions3::class.java))
    }


}