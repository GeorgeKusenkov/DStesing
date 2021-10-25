package com.example.dstesing.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.widget.NestedScrollView
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dstesing.Adapters
import com.example.dstesing.R
import com.example.dstesing.Saver
import com.example.dstesing.parseLesson

class Module2Lesson1Fragment : Fragment() {

    private val args: DetailsFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_module2_lesson1, container, false)
        val button = view.findViewById<Button>(R.id.btn_next_level)
        val scrollView = view.findViewById<NestedScrollView>(R.id.fragment_module2_lesson1)
        val position = args.position+1

        val recyclerView = view.findViewById<RecyclerView>(R.id.lesson1_list_view)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = Adapters(parseLesson(resources,R.xml.basic_module2_lesson1), resources, requireContext())

        button.setOnClickListener{
            val action = Module2Lesson1FragmentDirections.actionModule2Lesson1FragmentToModule2Lesson2Fragment(position)
            findNavController().navigate(action)
        }

        Saver(position, scrollView, requireContext(),2).getPoints()

        return view
    }

}