package com.example.dstesing.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dstesing.Lesson
import com.example.dstesing.OnLessonClickListener
import com.example.dstesing.R
import com.example.dstesing.adapters.RecyclerViewModule2Adapter

class LessonsModule2Fragment : Fragment(), OnLessonClickListener {

    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<RecyclerViewModule2Adapter.ViewHolder>? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = inflater.inflate(R.layout.fragment_module2_lessons, container, false)

        val recyclerView = binding.findViewById<RecyclerView>(R.id.module2_lessons_recycler_view)
        layoutManager = LinearLayoutManager(context)
        recyclerView.layoutManager = layoutManager
        adapter = RecyclerViewModule2Adapter(this)
        recyclerView.adapter = adapter

        return binding
    }

    override fun lessonClick(lesson: Lesson, position: Int) {
        val action = LessonsModule2FragmentDirections.actionLessonsModule2FragmentToDetailsFragment(position)
        findNavController().navigate(action)
    }
}
