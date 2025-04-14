package com.example.exam

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LotteryApp1 : AppCompatActivity() {
    lateinit var Mybutton:Button
    lateinit var mytextview1: TextView
    lateinit var mytextb:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.main2)
        mytextview1=findViewById(R.id.first)
        mytextb=findViewById(R.id.name)

        Mybutton = findViewById(R.id.NextPage)
        Mybutton.setOnClickListener(){
            var name:String=mytextb.text.toString()
            val i = Intent(this,LotteryApp2::class.java)
            i.putExtra("username",name)
            startActivity(i)

        }


        }
    /*override fun onStart(){
        super.onStart()
        Toast.makeText(this, "onStart is called", Toast.LENGTH_SHORT).show()

    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this,"onResume is called ",Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "onPause is called", Toast.LENGTH_SHORT).show()
    }
    override fun onStop(){
        super.onStop()
       //this will released the all resources utilizing by the app

    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "onRestart is Called", Toast.LENGTH_SHORT).show()
    }
    override fun onDestroy(){
        super.onDestroy()
        //this will do final cleanup as the name says destroy
    }*/
    }

