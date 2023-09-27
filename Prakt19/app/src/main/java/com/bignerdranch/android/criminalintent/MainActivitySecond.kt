package com.bignerdranch.android.criminalintent

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*


class MainActivitySecond : AppCompatActivity() {
    lateinit var texts:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_second)
        texts=findViewById(R.id.text)
        var date=getString(R.string.date)
        var cont = findViewById<View>(android.R.id.content)
        val currentDate = Date()

            val dateFormat: DateFormat = SimpleDateFormat(date, Locale.getDefault())
            val dateText = dateFormat.format(currentDate)
            texts.setText(dateText)

        var snack=Snackbar.make(cont,R.string.crime,Snackbar.LENGTH_INDEFINITE)
        snack.setAction("OK",View.OnClickListener {
            var intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }).show()
    }
}