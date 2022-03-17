package com.example.programminglanguagesapp

import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_row.view.*


class RecyclerAdapter(val languageList : ArrayList<String>, val languageImages : ArrayList<Bitmap>) : RecyclerView.Adapter<RecyclerAdapter.LanguageVH>() {

    class LanguageVH(itemView : View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LanguageVH {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recycler_row, parent, false)
        return LanguageVH(itemView)
    }

    override fun onBindViewHolder(holder: LanguageVH, position: Int) {
        holder.itemView.recyclerViewTextView.text = languageList.get(position)
    }

    override fun getItemCount(): Int {
        return languageList.size

    }
}





