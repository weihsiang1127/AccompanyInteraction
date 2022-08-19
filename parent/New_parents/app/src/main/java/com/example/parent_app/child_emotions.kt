package com.example.parent_app

import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_child_emotions.*

class child_emotions : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_child_emotions)
        var emotions_ans1 = 0
        var emotions_ans2 = 0
        var emotions_ans3 = 0
        var emotions_ans4 = 0
        var emotions_ans5 = 0

        //建立共用變數類別
        val gv = applicationContext as GlobalVariable

        // radiogroup 1 第一題 ↓↓
        radioButton1.setOnClickListener {
            emotions_ans1 = 1
            gv.setemotions1("1")
            Toast.makeText(this@child_emotions, "從不這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton2.setOnClickListener {
            emotions_ans1 = 2
            gv.setemotions1("2")
            Toast.makeText(this@child_emotions, "很少這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton3.setOnClickListener {
            emotions_ans1 = 3
            gv.setemotions1("3")
            Toast.makeText(this@child_emotions, "有時這樣" , Toast.LENGTH_SHORT).show()
        }
        radioButton4.setOnClickListener {
            emotions_ans1 = 4
            gv.setemotions1("4")
            Toast.makeText(this@child_emotions, "經常這樣" , Toast.LENGTH_SHORT).show()
        }
        radioButton5.setOnClickListener {
            emotions_ans1 = 5
            gv.setemotions1("5")
            Toast.makeText(this@child_emotions, "總是這樣", Toast.LENGTH_SHORT).show()
        }
        // radiogroup 2 第二題 ↓↓
        radioButton6.setOnClickListener {
            emotions_ans2 = 1
            gv.setemotions2("1")
            Toast.makeText(this@child_emotions, "從不這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton7.setOnClickListener {
            emotions_ans2 = 2
            gv.setemotions2("2")
            Toast.makeText(this@child_emotions, "很少這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton8.setOnClickListener {
            emotions_ans2 = 3
            gv.setemotions2("3")
            Toast.makeText(this@child_emotions, "有時這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton9.setOnClickListener {
            emotions_ans2 = 4
            gv.setemotions2("4")
            Toast.makeText(this@child_emotions, "經常這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton10.setOnClickListener {
            emotions_ans2 = 5
            gv.setemotions2("5")
            Toast.makeText(this@child_emotions, "總是這樣", Toast.LENGTH_SHORT).show()
        }
        // radiogroup 3 第三題 ↓↓
        radioButton11.setOnClickListener {
            emotions_ans3 = 1
            gv.setemotions3("1")
            Toast.makeText(this@child_emotions, "從不這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton12.setOnClickListener {
            emotions_ans3 = 2
            gv.setemotions3("2")
            Toast.makeText(this@child_emotions, "很少這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton13.setOnClickListener {
            emotions_ans3 = 3
            gv.setemotions3("3")
            Toast.makeText(this@child_emotions, "有時這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton14.setOnClickListener {
            emotions_ans3 = 4
            gv.setemotions3("4")
            Toast.makeText(this@child_emotions, "經常這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton15.setOnClickListener {
            emotions_ans3 = 5
            gv.setemotions3("5")
            Toast.makeText(this@child_emotions, "總是這樣", Toast.LENGTH_SHORT).show()
        }
        // radiogroup 4 第四題 ↓↓
        radioButton16.setOnClickListener {
            emotions_ans4 = 1
            gv.setemotions4("1")
            Toast.makeText(this@child_emotions, "從不這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton17.setOnClickListener {
            emotions_ans4 = 2
            gv.setemotions4("2")
            Toast.makeText(this@child_emotions, "很少這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton18.setOnClickListener {
            emotions_ans4 = 3
            gv.setemotions4("3")
            Toast.makeText(this@child_emotions, "有時這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton19.setOnClickListener {
            emotions_ans4 = 4
            gv.setemotions4("4")
            Toast.makeText(this@child_emotions, "經常這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton20.setOnClickListener {
            emotions_ans4 = 5
            gv.setemotions4("5")
            Toast.makeText(this@child_emotions, "總是這樣", Toast.LENGTH_SHORT).show()
        }
        // radiogroup 5 第五題 ↓↓
        radioButton21.setOnClickListener {
            emotions_ans5 = 1
            gv.setemotions5("1")
            Toast.makeText(this@child_emotions, "從不這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton22.setOnClickListener {
            emotions_ans5 = 2
            gv.setemotions5("2")
            Toast.makeText(this@child_emotions, "很少這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton23.setOnClickListener {
            emotions_ans5 = 3
            gv.setemotions5("3")
            Toast.makeText(this@child_emotions, "有時這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton24.setOnClickListener {
            emotions_ans5 = 4
            gv.setemotions5("4")
            Toast.makeText(this@child_emotions, "經常這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton25.setOnClickListener {
            emotions_ans5 = 5
            gv.setemotions5("5")
            Toast.makeText(this@child_emotions, "總是這樣", Toast.LENGTH_SHORT).show()
        }

        cirRegisterButton2.setOnClickListener {
            if (emotions_ans1 == 0 || emotions_ans2 == 0 || emotions_ans3 == 0 || emotions_ans4 == 0 || emotions_ans5 == 0)
            {
                AlertDialog.Builder(this)
                    .setMessage("請將題目填完再點選NEXT")
                    .setTitle("有題目尚未填寫")
                    .setPositiveButton("OK", null)
                    .show()
            }else
            {
                // 測試
                // TEST OK [05/07 16:34]

                var bundle = Bundle()
                bundle.putInt("emotions_ans1",emotions_ans1)
                bundle.putInt("emotions_ans2",emotions_ans2)
                bundle.putInt("emotions_ans3",emotions_ans3)
                bundle.putInt("emotions_ans4",emotions_ans4)
                bundle.putInt("emotions_ans5",emotions_ans5)
                var intent = Intent(this@child_emotions,activity_child_emotions2::class.java)
                intent.putExtra("bundle",bundle)
                startActivity(intent)

            }
        }
    }
        fun onLoginClick(view: View) {
            startActivity(Intent(this, main::class.java))

        }

}

