package com.example.parent_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_for_test.*

class for_test : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_for_test)

        ////////FOR user TEST
        var get_ques1ans = intent.getBundleExtra("bundle")?.getInt("ques1ans").toString()
        var get_ques1anselse = intent.getBundleExtra("bundle")?.getString("ques1anselse")
        var get_ques2ans = intent.getBundleExtra("bundle")?.getInt("ques2ans").toString()
        var get_ques2anselse = intent.getBundleExtra("bundle")?.getString("ques2anselse")
        var get_ques3ans = intent.getBundleExtra("bundle")?.getInt("ques3ans").toString()
        var get_ques3anselse = intent.getBundleExtra("bundle")?.getString("ques3anselse")
        var get_ques4ans = intent.getBundleExtra("bundle")?.getInt("ques4ans").toString()
        var get_ques4anselse = intent.getBundleExtra("bundle")?.getString("ques4anselse")
        var get_ques4_1ans = intent.getBundleExtra("bundle")?.getInt("ques4_1ans").toString()
        var get_ques4_1anselse = intent.getBundleExtra("bundle")?.getString("ques4_1anselse")
        var get_ques5ans = intent.getBundleExtra("bundle")?.getInt("ques5ans").toString()
        var get_ques5anselse = intent.getBundleExtra("bundle")?.getString("ques5anselse")
        var get_ques6ans = intent.getBundleExtra("bundle")?.getInt("ques6ans").toString()
        var get_ques6anselse = intent.getBundleExtra("bundle")?.getString("ques6anselse")
        var get_ques7ans = intent.getBundleExtra("bundle")?.getInt("ques7ans").toString()
        var get_ques8ans = intent.getBundleExtra("bundle")?.getInt("ques8ans").toString()

        textView_user1.text = get_ques1ans
        //textView_user1.text = get_ques1anselse
        textView_user2.text = get_ques2ans
        //textView_user2.text = get_ques2anselse
        //textView_user3.text = get_ques3ans
        textView_user3.text = get_ques3anselse
        //textView_user4.text = get_ques4ans
        textView_user4.text = get_ques4anselse
        //textView_user4_1.text = get_ques4_1ans
        textView_user4_1.text = get_ques4_1anselse
        //textView_user5.text = get_ques5ans
        textView_user5.text = get_ques5anselse
        //textView_user6.text = get_ques6ans
        textView_user6.text = get_ques6anselse
        textView_user7.text = get_ques7ans
        textView_user8.text = get_ques8ans

        ////////FOR interaction TEST
        var get_interaction_ans1 = intent.getBundleExtra("bundle")?.getInt("interaction_ans1").toString()
        var get_interaction_ans2 = intent.getBundleExtra("bundle")?.getInt("interaction_ans2").toString()
        var get_interaction_ans3 = intent.getBundleExtra("bundle")?.getInt("interaction_ans3").toString()
        var get_interaction_ans4 = intent.getBundleExtra("bundle")?.getInt("interaction_ans4").toString()
        var get_interaction_ans5 = intent.getBundleExtra("bundle")?.getInt("interaction_ans5").toString()
        var get_interaction_ans6 = intent.getBundleExtra("bundle")?.getInt("interaction_ans6").toString()

        textView_fortest1.text = get_interaction_ans1
        textView_fortest2.text = get_interaction_ans2
        textView_fortest3.text = get_interaction_ans3
        textView_fortest4.text = get_interaction_ans4
        textView_fortest5.text = get_interaction_ans5
        textView_fortest6.text = get_interaction_ans6

        ////////FOR performance TEST
        var get_performance_ans1 = intent.getBundleExtra("bundle")?.getInt("performance_ans1").toString()
        var get_performance_ans2 = intent.getBundleExtra("bundle")?.getInt("performance_ans2").toString()
        var get_performance_ans3 = intent.getBundleExtra("bundle")?.getInt("performance_ans3").toString()
        var get_performance_ans4 = intent.getBundleExtra("bundle")?.getInt("performance_ans4").toString()
        var get_performance_ans5 = intent.getBundleExtra("bundle")?.getInt("performance_ans5").toString()
        var get_performance_ans6 = intent.getBundleExtra("bundle")?.getInt("performance_ans6").toString()
        var get_performance_ans7 = intent.getBundleExtra("bundle")?.getInt("performance_ans7").toString()
        var get_performance_ans8 = intent.getBundleExtra("bundle")?.getInt("performance_ans8").toString()
        var get_performance_ans9 = intent.getBundleExtra("bundle")?.getInt("performance_ans9").toString()
        var get_performance_ans10 = intent.getBundleExtra("bundle")?.getInt("performance_ans10").toString()

        textView_fortest7.text = get_performance_ans1
        textView_fortest8.text = get_performance_ans2
        textView_fortest9.text = get_performance_ans3
        textView_fortest10.text = get_performance_ans4
        textView_fortest11.text = get_performance_ans5
        textView_fortest12.text = get_performance_ans6
        textView_fortest13.text = get_performance_ans7
        textView_fortest14.text = get_performance_ans8
        textView_fortest15.text = get_performance_ans9
        textView_fortest16.text = get_performance_ans10

        ////////FOR emotion TEST

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
        var get_emotions_ans21 = intent.getBundleExtra("bundle")?.getInt("emotions_ans21")
        var get_emotions_ans22 = intent.getBundleExtra("bundle")?.getInt("emotions_ans22")
        var get_emotions_ans23 = intent.getBundleExtra("bundle")?.getInt("emotions_ans23")
        var get_emotions_ans24 = intent.getBundleExtra("bundle")?.getInt("emotions_ans24")
        var get_emotions_ans25 = intent.getBundleExtra("bundle")?.getInt("emotions_ans25")
        var get_emotions_ans26 = intent.getBundleExtra("bundle")?.getInt("emotions_ans26")
        var get_emotions_ans27 = intent.getBundleExtra("bundle")?.getInt("emotions_ans27")
        var get_emotions_ans28 = intent.getBundleExtra("bundle")?.getInt("emotions_ans28")

        textView_emotions1.text = get_emotions_ans1.toString()
        textView_emotions2.text = get_emotions_ans2.toString()
        textView_emotions3.text = get_emotions_ans3.toString()
        textView_emotions4.text = get_emotions_ans4.toString()
        textView_emotions5.text = get_emotions_ans5.toString()
        textView_emotions6.text = get_emotions_ans6.toString()
        textView_emotions7.text = get_emotions_ans7.toString()
        textView_emotions8.text = get_emotions_ans8.toString()
        textView_emotions9.text = get_emotions_ans9.toString()
        textView_emotions10.text = get_emotions_ans10.toString()
        textView_emotions11.text = get_emotions_ans11.toString()
        textView_emotions12.text = get_emotions_ans12.toString()
        textView_emotions13.text = get_emotions_ans13.toString()
        textView_emotions14.text = get_emotions_ans14.toString()
        textView_emotions15.text = get_emotions_ans15.toString()
        textView_emotions16.text = get_emotions_ans16.toString()
        textView_emotions17.text = get_emotions_ans17.toString()
        textView_emotions18.text = get_emotions_ans18.toString()
        textView_emotions19.text = get_emotions_ans19.toString()
        textView_emotions20.text = get_emotions_ans20.toString()
        textView_emotions21.text = get_emotions_ans21.toString()
        textView_emotions22.text = get_emotions_ans22.toString()
        textView_emotions23.text = get_emotions_ans23.toString()
        textView_emotions24.text = get_emotions_ans24.toString()
        textView_emotions25.text = get_emotions_ans25.toString()
        textView_emotions26.text = get_emotions_ans26.toString()
        textView_emotions27.text = get_emotions_ans27.toString()
        textView_emotions28.text = get_emotions_ans28.toString()


    }
}