package com.example.dstesing.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.dstesing.R

class DetailsFragment : Fragment()  {

    val args: DetailsFragmentArgs by navArgs()

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {

        val num = args.position

       when (num+1) {
           1 -> return inflater.inflate(R.layout.fragment_module1_lesson1, container, false)
           2 -> return inflater.inflate(R.layout.fragment_module1_lesson2, container, false)
           3 -> return inflater.inflate(R.layout.fragment_module1_lesson3, container, false)
           4 -> return inflater.inflate(R.layout.fragment_module1_lesson4, container, false)
           5 -> return inflater.inflate(R.layout.fragment_module1_lesson5, container, false)
           6 -> return inflater.inflate(R.layout.fragment_module1_lesson6, container, false)
       }
            return inflater.inflate(R.layout.fragment_module1_lesson1, container, false)
        }
}

