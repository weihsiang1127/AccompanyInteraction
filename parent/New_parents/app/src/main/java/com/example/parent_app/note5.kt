package com.example.parent_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class note5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note5)
    }

    fun next(view: View) {
        startActivity(Intent(this,note6::class.java))
    }
    fun back(view: View) {
        startActivity(Intent(this,note4::class.java))
    }
}