package com.example.grid


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.grid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myList = ArrayList<DisplayModel>()
        myList.add(DisplayModel(R.drawable._c, "Jjombwe Nathan", "I have believed", "Today"))
        myList.add(DisplayModel(R.drawable.b, "Jonathan Kevin", "I have it", "Today"))
        myList.add(DisplayModel(R.drawable._d, "mukisa Samuel", "I have overcome", "Today"))
        myList.add(DisplayModel(R.drawable._m2, "Suubi Arnold", "I have made it", "Today"))
        myList.add(DisplayModel(R.drawable.aarn_giri_3tyzjgsbwbk_unsplash, "Kintu Kevin", "I have the best", "Today"))
        myList.add(DisplayModel(R.drawable.ancestors, "Mary Grace", "I have more than enough", "Today"))
        myList.add(DisplayModel(R.drawable.man, "Melanie Angel", "I have Love", "Today"))
        myList.add(DisplayModel(R.drawable.man__1_, "Abigail Angel", "I have God", "Today"))

        val myadapters = MyAdapter(this,myList)
        val grid = binding.grid
        grid.adapter = myadapters


    }
}
