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

    var counter = ""
    var pref: SharedPreferences? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?,): View? {

        val binding = inflater.inflate(R.layout.fragment_info, container, false)
        val scrollView = binding.findViewById<ScrollView>(R.id.fragment_info_layer)
        val tvText = binding.findViewById<TextView>(R.id.textViewRes)
        val etText = binding.findViewById<EditText>(R.id.ed_view)
        pref = context?.getSharedPreferences("TABLE", Context.MODE_PRIVATE)
        counter = pref?.getString("counter", "ЧЕЛОВЕК")!!
        tvText.text = counter

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
            counter = etText.text.toString()
            tvText.text = counter
        }

        return binding
    }

//    private fun saveData(res: String) {
//        val editor = pref?.edit()
//        editor?.putString("counter", res)
//        editor?.apply()
//    }

    private fun saveData(res: String) {
        val editor = pref?.edit()
        editor?.apply{
            putString("counter", res)
        }?.apply()
    }

    override fun onDestroy() {
        super.onDestroy()
        saveData(counter)
    }

    override fun onResume() {
        super.onResume()
        saveData(counter)
    }
}