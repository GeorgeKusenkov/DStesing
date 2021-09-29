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
import com.example.dstesing.adapters.RecyclerViewModule1Adapter
import android.widget.Toast

import org.xmlpull.v1.XmlPullParser
import android.widget.ArrayAdapter
import com.example.dstesing.*
import java.io.IOException
import org.xmlpull.v1.XmlPullParserException

import android.text.TextUtils
import android.util.Log
import org.xmlpull.v1.XmlPullParserFactory


class InfoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = inflater.inflate(R.layout.fragment_info, container, false)


//        val recyclerView = binding.findViewById<RecyclerView>(R.id.lesson1_list_view)
//        recyclerView.layoutManager = LinearLayoutManager(context)
//        recyclerView.adapter = Adapters(parseLesson(resources, R.xml.lesson1))



//        val listView = binding.findViewById(R.id.listView) as ListView
//        val list: ArrayList<String> = ArrayList()
//        val adapter = ArrayAdapter(requireContext(),android.R.layout.simple_list_item_1, list)
//        listView.adapter = adapter



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