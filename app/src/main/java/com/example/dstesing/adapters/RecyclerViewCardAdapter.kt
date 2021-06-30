package com.example.dstesing.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dstesing.*

class RecyclerViewCardAdapter(private val cardClickListener: OnCardClickListener) : RecyclerView.Adapter<RecyclerViewCardAdapter.ViewHolder>() {

        private val modules = DataStorage.getModuleList()

            inner class ViewHolder(itemView: View) :  RecyclerView.ViewHolder(itemView) {
                val itemTitle: TextView = itemView.findViewById(R.id.module_title)
                val itemDetails: TextView = itemView.findViewById(R.id.module_description)
                val itemImage: ImageView = itemView.findViewById(R.id.module_image)

                fun cardBind(module: Module, clickListener: OnCardClickListener) {
                    itemView.setOnClickListener {
                        clickListener.cardClick(module, adapterPosition)
                    }
                }
            }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.module_card, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemImage.setImageResource(modules[position].images)
        holder.itemTitle.text = modules[position].title
        holder.itemDetails.text = modules[position].details

        val module = modules[position]
        holder.cardBind(module, cardClickListener)
    }

    override fun getItemCount() = modules.size
}