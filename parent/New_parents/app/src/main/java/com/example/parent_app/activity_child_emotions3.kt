package com.example.parent_app

import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_child_emotions2.*
import kotlinx.android.synthetic.main.activity_child_emotions3.*

class activity_child_emotions3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_child_emotions3)

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

        var emotions_ans14 = 0
        var emotions_ans15 = 0
        var emotions_ans16 = 0
        var emotions_ans17 = 0
        var emotions_ans18 = 0
        var emotions_ans19 = 0
        var emotions_ans20 = 0

        //Toast.makeText(this, emotions_ans1+ emotions_ans2 + emotions_ans3 + emotions_ans4 + emotions_ans5, Toast.LENGTH_SHORT).show()
        //Toast.makeText(this, emotions_ans6 + emotions_ans7 + emotions_ans8 + emotions_ans9 + emotions_ans10 + emotions_ans11 + emotions_ans12 + emotions_ans13 , Toast.LENGTH_SHORT).show()

        // radiogroup 1 第十四題 ↓↓
        radioButton1_emotions3.setOnClickListener {
            emotions_ans14 = 1
            Toast.makeText(this@activity_child_emotions3, "從不這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton2_emotions3.setOnClickListener {
            emotions_ans14 = 2
            Toast.makeText(this@activity_child_emotions3, "很少這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton3.setOnClickListener {
            emotions_ans14 = 3
            Toast.makeText(this@activity_child_emotions3, "有時這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton4.setOnClickListener {
            emotions_ans14 = 4
            Toast.makeText(this@activity_child_emotions3, "經常這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton5.setOnClickListener {
            emotions_ans14 = 5
            Toast.makeText(this@activity_child_emotions3, "總是這樣", Toast.LENGTH_SHORT).show()
        }
        // radiogroup 2 第十五題 ↓↓
        radioButton6.setOnClickListener {
            emotions_ans15 = 1
            Toast.makeText(this@activity_child_emotions3, "從不這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton7.setOnClickListener {
            emotions_ans15 = 2
            Toast.makeText(this@activity_child_emotions3, "很少這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton8.setOnClickListener {
            emotions_ans15 = 3
            Toast.makeText(this@activity_child_emotions3, "有時這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton9.setOnClickListener {
            emotions_ans15 = 4
            Toast.makeText(this@activity_child_emotions3, "經常這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton10.setOnClickListener {
            emotions_ans15 = 5
            Toast.makeText(this@activity_child_emotions3, "總是這樣", Toast.LENGTH_SHORT).show()
        }
        // radiogroup 3 第十六題 ↓↓
        radioButton11.setOnClickListener {
            emotions_ans16 = 1
            Toast.makeText(this@activity_child_emotions3, "從不這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton12.setOnClickListener {
            emotions_ans16 = 2
            Toast.makeText(this@activity_child_emotions3, "很少這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton13.setOnClickListener {
            emotions_ans16 = 3
            Toast.makeText(this@activity_child_emotions3, "有時這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton14.setOnClickListener {
            emotions_ans16 = 4
            Toast.makeText(this@activity_child_emotions3, "經常這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton15.setOnClickListener {
            emotions_ans16 = 5
            Toast.makeText(this@activity_child_emotions3, "總是這樣", Toast.LENGTH_SHORT).show()
        }
        // radiogroup 4 第十七題 ↓↓
        radioButton16.setOnClickListener {
            emotions_ans17 = 1
            Toast.makeText(this@activity_child_emotions3, "從不這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton17.setOnClickListener {
            emotions_ans17 = 2
            Toast.makeText(this@activity_child_emotions3, "很少這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton18.setOnClickListener {
            emotions_ans17 = 3
            Toast.makeText(this@activity_child_emotions3, "有時這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton19.setOnClickListener {
            emotions_ans17 = 4
            Toast.makeText(this@activity_child_emotions3, "經常這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton20.setOnClickListener {
            emotions_ans17 = 5
            Toast.makeText(this@activity_child_emotions3, "總是這樣", Toast.LENGTH_SHORT).show()
        }
        // radiogroup 4 第十七題 ↓↓
        radioButton16.setOnClickListener {
            emotions_ans17 = 1
            Toast.makeText(this@activity_child_emotions3, "從不這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton17.setOnClickListener {
            emotions_ans17 = 2
            Toast.makeText(this@activity_child_emotions3, "很少這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton18.setOnClickListener {
            emotions_ans17 = 3
            Toast.makeText(this@activity_child_emotions3, "有時這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton19.setOnClickListener {
            emotions_ans17 = 4
            Toast.makeText(this@activity_child_emotions3, "經常這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton20.setOnClickListener {
            emotions_ans17 = 5
            Toast.makeText(this@activity_child_emotions3, "總是這樣", Toast.LENGTH_SHORT).show()
        }
        // radiogroup 4 第十七題 ↓↓
        radioButton16.setOnClickListener {
            emotions_ans17 = 1
            Toast.makeText(this@activity_child_emotions3, "從不這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton17.setOnClickListener {
            emotions_ans17 = 2
            Toast.makeText(this@activity_child_emotions3, "很少這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton18.setOnClickListener {
            emotions_ans17 = 3
            Toast.makeText(this@activity_child_emotions3, "有時這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton19.setOnClickListener {
            emotions_ans17 = 4
            Toast.makeText(this@activity_child_emotions3, "經常這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton20.setOnClickListener {
            emotions_ans17 = 5
            Toast.makeText(this@activity_child_emotions3, "總是這樣", Toast.LENGTH_SHORT).show()
        }
        // radiogroup 5 第十八題 ↓↓
        radioButton21.setOnClickListener {
            emotions_ans18 = 1
            Toast.makeText(this@activity_child_emotions3, "從不這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton22.setOnClickListener {
            emotions_ans18 = 2
            Toast.makeText(this@activity_child_emotions3, "很少這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton23.setOnClickListener {
            emotions_ans18 = 3
            Toast.makeText(this@activity_child_emotions3, "有時這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton24_emotions3.setOnClickListener {
            emotions_ans18 = 4
            Toast.makeText(this@activity_child_emotions3, "經常這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton25.setOnClickListener {
            emotions_ans18 = 5
            Toast.makeText(this@activity_child_emotions3, "總是這樣", Toast.LENGTH_SHORT).show()
        }
        // radiogroup 6 第十九題 ↓↓
        radioButton26.setOnClickListener {
            emotions_ans19 = 1
            Toast.makeText(this@activity_child_emotions3, "從不這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton27.setOnClickListener {
            emotions_ans19 = 2
            Toast.makeText(this@activity_child_emotions3, "很少這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton28.setOnClickListener {
            emotions_ans19 = 3
            Toast.makeText(this@activity_child_emotions3, "有時這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton29.setOnClickListener {
            emotions_ans19 = 4
            Toast.makeText(this@activity_child_emotions3, "經常這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton30.setOnClickListener {
            emotions_ans19 = 5
            Toast.makeText(this@activity_child_emotions3, "總是這樣", Toast.LENGTH_SHORT).show()
        }
        // radiogroup 7 第二十題 ↓↓
        radioButton31.setOnClickListener {
            emotions_ans20 = 1
            Toast.makeText(this@activity_child_emotions3, "從不這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton32.setOnClickListener {
            emotions_ans20 = 2
            Toast.makeText(this@activity_child_emotions3, "很少這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton33.setOnClickListener {
            emotions_ans20 = 3
            Toast.makeText(this@activity_child_emotions3, "有時這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton34.setOnClickListener {
            emotions_ans20 = 4
            Toast.makeText(this@activity_child_emotions3, "經常這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton35.setOnClickListener {
            emotions_ans20 = 5
            Toast.makeText(this@activity_child_emotions3, "總是這樣", Toast.LENGTH_SHORT).show()
        }


        cirRegisterButton3.setOnClickListener {
            if (emotions_ans14 == 0 || emotions_ans15 == 0 || emotions_ans16 == 0 || emotions_ans17 == 0 || emotions_ans18 == 0 ||
                    emotions_ans19 == 0 || emotions_ans20 ==0  )
            {
                AlertDialog.Builder(this)
                        .setMessage("請將題目填完再點選NEXT")
                        .setTitle("有題目尚未填寫")
                        .setPositiveButton("OK", null)
                        .show()
            }else {            // 測試
                // TEST OK [05/07 16:34]

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
                var intent = Intent(this@activity_child_emotions3, activity_child_emotions4::class.java)
                intent.putExtra("bundle", bundle)
                startActivity(intent)


            }
        }
    }
    fun onLoginClick(view: View) {
        startActivity(Intent(this,activity_child_emotions2::class.java))
    }

}