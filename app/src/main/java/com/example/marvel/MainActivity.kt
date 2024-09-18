package com.example.marvel

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.marvel.MarvelAdapter
import com.example.marvel.R

class MainActivity: AppCompatActivity() {

    lateinit var data: ArrayList<MarvelData>
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView=findViewById(R.id.recycler_view)

        data=ArrayList<MarvelData>()

        data.add(MarvelData("Captain America", R.drawable.img))
        data.add(MarvelData("Captain Marvel", R.drawable.img_1))
        data.add(MarvelData("Doctor Strange", R.drawable.img_2))
        data.add(MarvelData("Spider Man", R.drawable.img_3))
        data.add(MarvelData("Thanos", R.drawable.img_4))



        recyclerView.adapter = MarvelAdapter(this@MainActivity, data)
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}

