package com.example.dstesing.fragments

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.example.dstesing.DataStorage
import com.example.dstesing.R

class SettingsMenu : Fragment() {

    private var sharedPreferences: SharedPreferences? = null
    private var lessonsModule1Size = DataStorage.getLessonsModule1List().size

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_settings_menu, container, false)

        val resetButton = view.findViewById<Button>(R.id.reset_button)
        sharedPreferences = context?.getSharedPreferences("SETTINGS", Context.MODE_PRIVATE)

        val editor = sharedPreferences?.edit()


        resetButton.setOnClickListener {
            Toast.makeText(context, "Ваш прогресс сброшен", Toast.LENGTH_SHORT).show()
            editor?.apply{
                putInt("user_experience", 0)
                putInt("LESSON_COUNTER", 0)

                var stringsLessons = "CHECK_XP_M1L"
                for (i in 1..lessonsModule1Size) {
                    stringsLessons += i.toString()
                    putBoolean(stringsLessons, false)

                    Log.d("DEDA", "stringsLessons: $stringsLessons")
                    stringsLessons = "CHECK_XP_M1L"
                }

            }?.apply()
        }

        return view
    }




}