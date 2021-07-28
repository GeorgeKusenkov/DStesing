package com.example.dstesing.fragments

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.ContextMenu
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.dstesing.MainActivity
import com.example.dstesing.R

class UserNameFragment : Fragment() {

    var counter = ""
    var pref: SharedPreferences? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

//        Handler(Looper.getMainLooper()).postDelayed({
//            findNavController().navigate(R.id.action_userNameFragment_to_mainFragment)
//        }, 3000)

        val binding = inflater.inflate(R.layout.fragment_user_name, container, false)
        val etText = binding.findViewById<EditText>(R.id.et_user_name)

        pref = context?.getSharedPreferences("TABLE", Context.MODE_PRIVATE)
        counter = pref?.getString("counter", "ЧЕЛОВЕК1")!!

        val button = binding.findViewById<Button>(R.id.button2)

        button.setOnClickListener{
            counter = etText.text.toString()
            saveData(counter)
            findNavController().navigate(R.id.action_userNameFragment_to_mainFragment)
        }

        val isName = false
        if(isName) {
            findNavController().navigate(R.id.action_userNameFragment_to_mainFragment)
        }
        return binding
    }

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
}