package edu.temple.simplerecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        val numberArray = Array(50){
            i -> (i + 1) * 2
        }

        recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)

        recyclerView.adapter = NumberDisplayAdapter(numberArray)
    }
}