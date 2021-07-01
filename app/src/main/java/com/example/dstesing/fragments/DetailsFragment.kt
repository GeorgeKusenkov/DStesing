package com.example.dstesing.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.navigation.fragment.navArgs
import com.example.dstesing.Lesson
import com.example.dstesing.OnLessonClickListener
import com.example.dstesing.R
import com.example.dstesing.adapters.RecyclerViewLessonAdapter

class DetailsFragment : Fragment()  {


    val args: DetailsFragmentArgs by navArgs()

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {

        val num = args.position
//        Toast.makeText(context,"Position is $num", Toast.LENGTH_SHORT).show()

       when (num) {
           0 -> return inflater.inflate(R.layout.fragment_details, container, false)
           1 -> return inflater.inflate(R.layout.fragment_details2, container, false)
           2 -> return inflater.inflate(R.layout.fragment_details3, container, false)
       }
            return inflater.inflate(R.layout.fragment_details, container, false)
        }
}

