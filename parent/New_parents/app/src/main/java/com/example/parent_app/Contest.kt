    package com.example.parent_app

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class Contest : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.contest)

        /*
        val text_viewCONTEST = findViewById<View>(R.id.text_viewCONTEST) as TextView

        Thread {
            val con = MysqlCon()
            con.run()
            val data = con.data
            Log.v("OK", data)
            text_viewCONTEST.post { text_viewCONTEST.text = data}
        }.start()

         */




    }




}