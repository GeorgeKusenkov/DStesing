package com.example.dstesing.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ScrollView
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.dstesing.R
import com.example.dstesing.Saver

class Module1Lesson13Fragment : Fragment() {

    private val args: DetailsFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        val binding = inflater.inflate(R.layout.fragment_module1_lesson13, container, false)
        val button = binding.findViewById<Button>(R.id.btn_next_level)
        val scrollView = binding.findViewById<ScrollView>(R.id.fragment_module1_lesson13)
        val position = args.position+1
        binding.setBackgroundResource(R.drawable.linear_layout_radius)

        button.setOnClickListener{
            val action = Module1Lesson13FragmentDirections.actionModule1Lesson13FragmentToModule1Lesson14Fragment(position)
            findNavController().navigate(action)
        }

        Saver(position, scrollView, requireContext()).getPoints()
        return binding
    }

}