package com.example.dstesing.fragments

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ScrollView
import android.widget.Toast
import com.example.dstesing.R

class Module1Lesson2Fragment : Fragment() {

    private var userExperience = 0
    private var sharedPreferences: SharedPreferences? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = inflater.inflate(R.layout.fragment_module1_lesson2, container, false)
        val scrollView = binding.findViewById<ScrollView>(R.id.fragment_module1_lesson2)

        sharedPreferences = context?.getSharedPreferences("SETTINGS", Context.MODE_PRIVATE)
        userExperience = sharedPreferences?.getInt("user_experience", 0)!!
        var checkXP = sharedPreferences?.getBoolean("check_xp_m1l2", false)!!

        scrollView.viewTreeObserver.addOnScrollChangedListener {
            if (!scrollView.canScrollVertically(1) && !checkXP) {
                userExperience+=100
                checkXP = true
                saveData(userExperience, checkXP)
                Toast.makeText(context, "XP: $userExperience", Toast.LENGTH_SHORT).show()
            }
        }

        return binding
    }

    private fun saveData(xp: Int, checkXP: Boolean) {
        val editor = sharedPreferences?.edit()
        editor?.apply{
            putInt("user_experience", xp)
            putBoolean("check_xp_m1l2", checkXP)
        }?.apply()
    }
}