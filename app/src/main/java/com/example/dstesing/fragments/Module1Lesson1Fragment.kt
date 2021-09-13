package com.example.dstesing.fragments

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ScrollView
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.dstesing.R
import com.example.dstesing.Saver

class Module1Lesson1Fragment : Fragment() {

    private val args: DetailsFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = inflater.inflate(R.layout.fragment_module1_lesson1, container, false)
        val button = binding.findViewById<Button>(R.id.btn_next_level)
        val scrollView = binding.findViewById<ScrollView>(R.id.fragment_module1_lesson1)
        val position = args.position+1
        binding.setBackgroundResource(R.drawable.linear_layout_radius)

        button.setOnClickListener{
            val action = Module1Lesson1FragmentDirections.actionModule1Lesson1FragmentToModule1Lesson2Fragment2(position)
            findNavController().navigate(action)
        }


//        button.setOnClickListener{view: View ->
//            view.findNavController().navigate(R.id.action_module1Lesson1Fragment_to_module1Lesson2Fragment2)
//        }

        Saver(position, scrollView, requireContext()).getPoints()
        return binding
    }

}
