package com.example.dstesing.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.recyclerview.widget.RecyclerView
import com.example.dstesing.*

class RecyclerViewModule1Adapter (private val lessonClickListener: OnLessonClickListener) : RecyclerView.Adapter<RecyclerViewModule1Adapter.ViewHolder>() {

    private var lessons = DataStorage.getLessonsModule1List()

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemTitle: TextView = itemView.findViewById(R.id.lesson_title)
        val itemDetails: TextView = itemView.findViewById(R.id.lesson_description)
        val itemImage: ImageView = itemView.findViewById(R.id.lesson_image)

        fun lessonBind(lesson: Lesson, clickListener: OnLessonClickListener, id: String) {
            itemView.setOnClickListener {
                clickListener.lessonClick(lesson, adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.lesson_card, parent, false)
        TakeALevel(parent.context, lessons[0].id).changeImage(lessons)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemImage.setImageResource(lessons[position].images)
        holder.itemTitle.setText(lessons[position].title)
        holder.itemDetails.setText(lessons[position].details)

        val id = lessons[position].id
        val lesson = lessons[position]
        holder.lessonBind(lesson, lessonClickListener, id)
    }

    override fun getItemCount() = lessons.size
}