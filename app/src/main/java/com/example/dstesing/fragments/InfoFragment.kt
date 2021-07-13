package com.example.dstesing.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.dstesing.R

class InfoFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?,): View? {

        val binding = inflater.inflate(R.layout.fragment_info, container, false)


//        val linearLayout = LinearLayout(context)
        val scrollView = binding.findViewById<ScrollView>(R.id.fragment_info_layer)
        if (scrollView == null) {
            Toast.makeText(context, "scrNLL", Toast.LENGTH_SHORT).show()
        }
//
//        if (linearLayout.getChildAt(0).bottom <= (scrollView.height + scrollView.scrollY)) {
//            Toast.makeText(context, "YEP2", Toast.LENGTH_SHORT).show()
//        }

        val button = binding.findViewById<Button>(R.id.points)


            var check = false
            var i = 0
            scrollView.viewTreeObserver.addOnScrollChangedListener {
                if (!scrollView.canScrollVertically(1) && !check) {
                    i+=10
                    check = true
                }
            }

        button.setOnClickListener{

        }

        return binding
    }

}