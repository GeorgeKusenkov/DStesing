package com.example.dstesing.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dstesing.*

class RecyclerViewCourseAdapter (private val courseClickListener: OnCourseClickListener) : RecyclerView.Adapter<RecyclerViewCourseAdapter.ViewHolder>() {

    private val courses = DataStorage.getCourseList()

    inner class ViewHolder(itemView: View) :  RecyclerView.ViewHolder(itemView) {
        val itemTitle: TextView = itemView.findViewById(R.id.course_title)
        val itemDetails: TextView = itemView.findViewById(R.id.course_description)
        val itemImage: ImageView = itemView.findViewById(R.id.course_card)

        fun cardBind(course: Course, clickListener: OnCourseClickListener) {
            itemView.setOnClickListener {
                clickListener.cardClick(course, adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.course_card, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemImage.setImageResource(courses[position].images)
        holder.itemTitle.text = courses[position].title
        holder.itemDetails.text = courses[position].details

        val course = courses[position]
        holder.cardBind(course, courseClickListener)
    }

    override fun getItemCount() = courses.size
}