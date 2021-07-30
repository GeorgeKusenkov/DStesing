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

class Module1Lesson1Fragment : Fragment() {

//    private var userExperience = 0
    private var sharedPreferences: SharedPreferences? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = inflater.inflate(R.layout.fragment_module1_lesson1, container, false)
        val scrollView = binding.findViewById<ScrollView>(R.id.fragment_module1_lesson1)

        sharedPreferences = context?.getSharedPreferences("SETTINGS", Context.MODE_PRIVATE)
        var userExperience = sharedPreferences?.getInt("user_experience", 0)!!
        var checkXP = sharedPreferences?.getBoolean("CHECK_XP_M1L1", false)!!
        var lessonCounter = sharedPreferences?.getInt("LESSON_COUNTER", 0)!!

        binding.setBackgroundResource(R.drawable.linear_layout_radius)

        scrollView.viewTreeObserver.addOnScrollChangedListener {
            if (!scrollView.canScrollVertically(1) && !checkXP) {
                userExperience+=450
                lessonCounter+=1
                checkXP = true
                saveData(userExperience, checkXP, lessonCounter)
                Toast.makeText(context, "XP: $userExperience, Lesson: $lessonCounter", Toast.LENGTH_SHORT).show()
            }
        }
        return binding
    }

    private fun saveData(xp: Int, checkXP: Boolean, counter: Int) {
        val editor = sharedPreferences?.edit()
        editor?.apply{
            putInt("user_experience", xp)
            putBoolean("CHECK_XP_M1L1", checkXP)
            putInt("LESSON_COUNTER", counter)
        }?.apply()
    }

}