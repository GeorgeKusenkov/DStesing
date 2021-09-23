package com.example.dstesing.fragments

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.content.res.Resources
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dstesing.Adapters
import com.example.dstesing.R
import com.example.dstesing.adapters.RecyclerViewModule1Adapter
import com.example.dstesing.parseLesson

class InfoFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?,): View? {

        val binding = inflater.inflate(R.layout.fragment_info, container, false)



        val recyclerView = binding.findViewById<RecyclerView>(R.id. test_list_view)

        recyclerView.layoutManager = LinearLayoutManager(context)

        recyclerView.adapter = Adapters(parseLesson(resources, R.xml.lesson1))




//        val scrollView = binding.findViewById<ScrollView>(R.id.fragment_info_layer)

//            var check = false
//            var i = 0
//            scrollView.viewTreeObserver.addOnScrollChangedListener {
//                if (!scrollView.canScrollVertically(1) && !check) {
//                    i+=10
//                    check = true
//                }
//            }

        return binding
    }

//    private fun saveData(res: String) {
//        val editor = pref?.edit()
//        editor?.putString("counter", res)
//        editor?.apply()
//    }

}