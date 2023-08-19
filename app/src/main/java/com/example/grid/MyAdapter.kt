package com.example.grid

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView


class MyAdapter( var context: Context, var list : ArrayList<DisplayModel>):BaseAdapter(){
    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(p0: Int): Any {
        return list[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    @SuppressLint("ViewHolder", "InflateParams")
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val view = LayoutInflater.from(context).inflate(R.layout.newlayout,null,false)

        val imageId = view.findViewById<ImageView>(R.id.image)
        val nameId = view.findViewById<TextView>(R.id.name)
        val messageId = view.findViewById<TextView>(R.id.message)
        val dateId = view.findViewById<TextView>(R.id.date)

        nameId.text = list[p0].name
        imageId.setImageResource(list[p0].image)
        messageId.text = list[p0].message
        dateId.text = list[p0].date

        return view
    }

}