package com.example.dstesing.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.Toast
import com.example.dstesing.R

class InfoFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?,): View? {

        val binding = inflater.inflate(R.layout.fragment_info, container, false)


//        val linearLayout = LinearLayout(context)
        val scrollView = binding.findViewById<ScrollView>(R.id.fragment_info_layer)
//
//        if (linearLayout.getChildAt(0).bottom <= (scrollView.height + scrollView.scrollY)) {
//            Toast.makeText(context, "YEP2", Toast.LENGTH_SHORT).show()
//        }


            scrollView.viewTreeObserver.addOnScrollChangedListener {
                if (!scrollView.canScrollVertically(1)) {
                    Toast.makeText(context, "YEP2", Toast.LENGTH_SHORT).show()
                }
            }

        return binding
    }


}