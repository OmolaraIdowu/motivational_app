package com.swancodes.motivationalquotes.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.swancodes.motivationalquotes.R
import com.swancodes.motivationalquotes.model.Motivation

class ItemAdapter(private val context: Context, private val dataSet: List<Motivation>)
    : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>(){

    class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val dailyText : TextView = view.findViewById(R.id.item_title)
        val dailyImage : ImageView = view.findViewById(R.id.item_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataSet[position]
        holder.dailyText.text = context.resources.getString(item.stringResourceId)
        holder.dailyImage.setImageResource(item.imageResourceId)
    }

    override fun getItemCount() = dataSet.size
}