package com.example.dstesing.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dstesing.Module
import com.example.dstesing.ModuleStorage
import com.example.dstesing.OnCardClickListener
import com.example.dstesing.R

class RecyclerViewAdapter(private var tittle: List<String>,
                          private var details: List<String>,
                          private var images: List<Int>,
                          private val itemClickListener: OnCardClickListener) : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

        private val modules = ModuleStorage.getKoalaList()

            inner class ViewHolder(itemView: View) :  RecyclerView.ViewHolder(itemView) {
                val itemTitle: TextView = itemView.findViewById(R.id.item_title)
                val itemDetails: TextView = itemView.findViewById(R.id.item_detail)
                val itemImage: ImageView = itemView.findViewById(R.id.item_image)

                fun bind(module: Module, clickListener: OnCardClickListener) {
                    itemView.setOnClickListener {
                        clickListener.itemClick(module, adapterPosition)
                    }
                }
            }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_item, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemImage.setImageResource(modules[position].images)
        holder.itemTitle.text = modules[position].title
        holder.itemDetails.text = modules[position].details

        val module = modules[position]
        holder.bind(module, itemClickListener)
    }

    override fun getItemCount() = modules.size
}