package com.example.dstesing.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dstesing.*
import com.example.dstesing.fragments.DetailsFragment

class RecyclerViewLessonAdapter (private val lessonClickListener: OnLessonClickListener) : RecyclerView.Adapter<RecyclerViewLessonAdapter.ViewHolder>() {

    private val lessons = DataStorage.getLessonsList()

    inner class ViewHolder(itemView: View) :  RecyclerView.ViewHolder(itemView) {
        val itemTitle: TextView = itemView.findViewById(R.id.lesson_title)
        val itemDetails: TextView = itemView.findViewById(R.id.lesson_description)
        val itemImage: ImageView = itemView.findViewById(R.id.lesson_image)

        fun lessonBind(lesson: Lesson, clickListener: OnLessonClickListener) {
            itemView.setOnClickListener {
                clickListener.lessonClick(lesson, adapterPosition)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.lesson_card, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemImage.setImageResource(lessons[position].images)
        holder.itemTitle.text = lessons[position].title
        holder.itemDetails.text = lessons[position].details

        val lesson = lessons[position]
        holder.lessonBind(lesson, lessonClickListener)
    }

    override fun getItemCount() = lessons.size
}