package com.example.dummyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnEnglish.setOnClickListener {
            var dataEnglish: Array<String> = resources.getStringArray(R.array.dataArray)
            val context = LocaleHelper.setLocale(this, "en")
            val resources = context.resources
            val adapter = DummyAppAdapter(resources,dataEnglish)
            rvList.adapter = adapter
            rvList!!.layoutManager = LinearLayoutManager(this)

        }
        btnHindi.setOnClickListener {

            val context = LocaleHelper.setLocale(this, "hi")
            val resources = context.resources
            var datahindi:Array<String> = resources.getStringArray(R.array.dataArray)
            val adapter = DummyAppAdapter(resources,datahindi)
            rvList.adapter = adapter
            rvList!!.layoutManager = LinearLayoutManager(this)

        }

    }
}



