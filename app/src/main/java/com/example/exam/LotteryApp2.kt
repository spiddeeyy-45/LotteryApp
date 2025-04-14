package com.example.exam

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.Guideline
import java.util.List as List1

class LotteryApp2 : AppCompatActivity() {
    lateinit var mytextview:TextView
    lateinit var resulttext:TextView
    lateinit var My2: Button
    lateinit var my3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.main3)
        my3=findViewById(R.id.sbutton)

        My2 = findViewById(R.id.hbutton)
        My2.setOnClickListener(){
            val explicitf= Intent(this,LotteryApp1::class.java)
            explicitf.putExtra("Back"," ")
            startActivity(explicitf)
        }
        mytextview=findViewById(R.id.lotterynumber)
        resulttext=findViewById(R.id.tex2)


      val generate = generateRandomNumber(6)
        mytextview.text=generate
        var u = reciveUserName()
        my3.setOnClickListener(){
            val share =shareResult(u,generate)

        }


    }
    fun generateRandomNumber(count:Int):String{
        var randomNumber= List(count){
            (0..42).random()

        }
        return randomNumber.joinToString(" ")

    }
    fun reciveUserName():String{
        val  bundle:Bundle?=intent.extras
        val user=bundle?.getString("username").toString()
        return user
    }
    fun shareResult(username:String,generatednum:String){
        var i = Intent(Intent.ACTION_SEND)
        i.setType("Text/Plain")
        i.putExtra(Intent.EXTRA_SUBJECT,"$username Generate this Number")
        i.putExtra(Intent.EXTRA_TEXT ,"generated numbers are : $generatednum")
        startActivity(i)
    }
}