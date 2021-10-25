package com.example.dstesing.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.NestedScrollView
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dstesing.Adapters
import com.example.dstesing.R
import com.example.dstesing.Saver
import com.example.dstesing.parseLesson

class Module1Lesson19Fragment : Fragment() {

    private val args: DetailsFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val binding = inflater.inflate(R.layout.fragment_module1_lesson19, container, false)

        val recyclerView = binding.findViewById<RecyclerView>(R.id.lesson19_list_view)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = Adapters(parseLesson(resources,R.xml.basic_module1_lesson19), resources, requireContext())

        val scrollView = binding.findViewById<NestedScrollView>(R.id.fragment_module1_lesson19)
        val position = args.position+1

        Saver(position, scrollView, requireContext(),1).getPoints()

        return binding
    }

}