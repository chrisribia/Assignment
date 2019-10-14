package com.example.assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_accept.setOnClickListener{

            var text : String = "Accepted"+"\n"+heading.text.toString()  + "\n" + details.text.toString()
            Toast.makeText(this,text,Toast.LENGTH_LONG).show()
        }
    }
}
