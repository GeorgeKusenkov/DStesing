package com.example.dstesing.fragments

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.navigation.fragment.findNavController
import com.example.dstesing.R

class InfoFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?,): View? {

        val binding = inflater.inflate(R.layout.fragment_info, container, false)
        val scrollView = binding.findViewById<ScrollView>(R.id.fragment_info_layer)

        val button = binding.findViewById<Button>(R.id.points)

//            var check = false
//            var i = 0
//            scrollView.viewTreeObserver.addOnScrollChangedListener {
//                if (!scrollView.canScrollVertically(1) && !check) {
//                    i+=10
//                    check = true
//                }
//            }

        button.setOnClickListener{

        }

        return binding
    }

//    private fun saveData(res: String) {
//        val editor = pref?.edit()
//        editor?.putString("counter", res)
//        editor?.apply()
//    }

}