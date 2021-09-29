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
import com.example.dstesing.*

class Module1Lesson3Fragment : Fragment() {

    private val args: DetailsFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = inflater.inflate(R.layout.fragment_module1_lesson3, container, false)
        val button = binding.findViewById<Button>(R.id.btn_next_level)
        val scrollView = binding.findViewById<NestedScrollView>(R.id.fragment_module1_lesson3)
        val position = args.position+1

        val recyclerView = binding.findViewById<RecyclerView>(R.id.lesson3_list_view)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = Adapters(parseLesson(resources,R.xml.basic_module1_lesson3), resources, requireContext())

        button.setOnClickListener{
            val action = Module1Lesson3FragmentDirections.actionModule1Lesson3FragmentToModule1Lesson4Fragment(position)
            findNavController().navigate(action)
        }

        Saver(position, scrollView, requireContext()).getPoints()
        return binding
    }
}