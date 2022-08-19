package com.example.parent_app

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_manual.*

class give_back : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.give_back)



        var imggiveback: ImageView
        imggiveback = findViewById(R.id.imageView_giveback)
        val num = (1..3).random()
        if ( num == 1 )
        {
            imggiveback.setImageDrawable(getResources().getDrawable(R.drawable.give_back1))
        }
        if ( num == 2 )
        {
            imggiveback.setImageDrawable(getResources().getDrawable(R.drawable.give_back2))
        }
        if ( num == 3 )
        {
            imggiveback.setImageDrawable(getResources().getDrawable(R.drawable.give_back3))
        }
        imggiveback.setOnClickListener {
            Toast.makeText(this, "完成", Toast.LENGTH_SHORT).show()
            var intent = Intent(this@give_back,main::class.java)
            startActivity(intent)


        }
    }
}