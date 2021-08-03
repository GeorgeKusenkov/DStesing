package com.example.dstesing.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ScrollView
import androidx.navigation.fragment.navArgs
import com.example.dstesing.R
import com.example.dstesing.Saver

class Module1Lesson2Fragment : Fragment() {

    private val args: DetailsFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = inflater.inflate(R.layout.fragment_module1_lesson2, container, false)
        val scrollView = binding.findViewById<ScrollView>(R.id.fragment_module1_lesson2)
        val position = args.position+1
        binding.setBackgroundResource(R.drawable.linear_layout_radius)

        Saver(position, scrollView, requireContext()).getPoints()
        return binding
    }
}