package com.example.recyclerviewlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        recyclerView.layoutManager= LinearLayoutManager(this)

        val countrySet = listOf("srilanka","india")
        val countryFlagSet = listOf<Int>(R.drawable.ic_launcher_background,R.drawable.ic_launcher_background)


        recyclerView.adapter= MyAdapter(countrySet,countryFlagSet)

    }
}