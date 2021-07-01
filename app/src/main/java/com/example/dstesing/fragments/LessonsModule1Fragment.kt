package com.example.dstesing.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.FragmentTransaction
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dstesing.Lesson
import com.example.dstesing.OnLessonClickListener
import com.example.dstesing.R
import com.example.dstesing.adapters.RecyclerViewLessonAdapter

class LessonsModule1Fragment : Fragment(), OnLessonClickListener {

    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<RecyclerViewLessonAdapter.ViewHolder>? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = inflater.inflate(R.layout.fragment_module1_lessons, container, false)

        val recyclerView = binding.findViewById<RecyclerView>(R.id.lesson_recycler_view)
        layoutManager = LinearLayoutManager(context)
        recyclerView.layoutManager = layoutManager
        adapter = RecyclerViewLessonAdapter(this)
        recyclerView.adapter = adapter

        return binding
    }

    override fun lessonClick(lesson: Lesson, position: Int) {
        var bundle = Bundle()
        bundle.putInt("POSITION", position)

        var transaction = this.parentFragmentManager.beginTransaction()
        var fragment = DetailsFragment()
        fragment.arguments = bundle
        transaction.replace(R.id.lesson_recycle_layout, fragment).commit()

        findNavController().navigate(R.id.action_lessonsModule1Fragment_to_detailsFragment)

    }
}