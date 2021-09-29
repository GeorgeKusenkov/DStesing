package com.example.dstesing.fragments

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dstesing.Adapters
import com.example.dstesing.R
import com.example.dstesing.parseLesson
import java.lang.Exception

class Module1Lesson19Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val binding = inflater.inflate(R.layout.fragment_module1_lesson19, container, false)

        val recyclerView = binding.findViewById<RecyclerView>(R.id.lesson19_list_view)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = Adapters(parseLesson(resources,R.xml.basic_module1_lesson19), resources, requireContext())

        return binding
    }

}