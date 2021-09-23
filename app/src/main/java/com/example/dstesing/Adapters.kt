package com.example.dstesing

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.lang.IllegalArgumentException
import kotlin.math.log

class Adapters(private val cards: List<Card>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

//    override fun getItemViewType(position: Int): Int = when(cards[position]) {
//        is Card.Tag -> 1
//        is Card.Text -> 2
//    }

    override fun getItemViewType(position: Int): Int {
        Log.d("d", "Адаптер 1 = $position")

        return when(cards[position]) {
            is Card.Tag -> 1
            is Card.Text -> 2
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val d = Log.d("d", "Адаптер 2 = $viewType")

        return object : RecyclerView.ViewHolder(
            when(viewType) {
            1 -> LayoutInflater.from(parent.context).inflate(R.layout.in_lesson_tag, parent, false)
            2 -> LayoutInflater.from(parent.context).inflate(R.layout.in_lesson_text, parent, false)
            else -> throw IllegalArgumentException("Error")
            }) {

        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(val card = cards[position]) {
            is Card.Tag -> holder.itemView.findViewById<TextView>(R.id.in_lesson_tag).text = card.tagText
            is Card.Text -> holder.itemView.findViewById<TextView>(R.id.in_lesson_text).text = card.lessonText
        }
    }

    override fun getItemCount() = cards.size
}
