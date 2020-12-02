package com.gunawan.wsshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var follower_count = findViewById<TextView>(R.id.profile_follower_count)
        var btn_ikuti = findViewById<Button>(R.id.btn_follow)
        var follow_count = 150

        follower_count.text = follow_count.toString()
        btn_ikuti.setOnClickListener {
            follow_count++
            follower_count.text = follow_count.toString()
            btn_ikuti.text = "DIIKUTI"

        }


    }
}
