package com.example.dstesing.fragments

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.fragment.findNavController
import com.example.dstesing.R

class UserNameFragment : Fragment() {

    private var editName = ""
    private var sharedPreferences: SharedPreferences? = null
    private var isName = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = inflater.inflate(R.layout.fragment_user_name, container, false)
        val etText = binding.findViewById<EditText>(R.id.et_user_name)
        val button = binding.findViewById<Button>(R.id.button2)

        sharedPreferences = context?.getSharedPreferences("SETTINGS", Context.MODE_PRIVATE)
        editName = sharedPreferences?.getString("user_name", "ЧЕЛОВЕК1")!!

        //Берем значение из SharePreferences и проверяем вводил ли пользователь имя ранее или нет.
        isName = sharedPreferences?.getBoolean("is_name", false)!!
        if(isName) {
            findNavController().navigate(R.id.action_userNameFragment_to_mainFragment)
        }

        //При нажатии на кнопку сохраняем имя и передаем в SharePreferences, переходим на главный экран.
        button.setOnClickListener{
            editName = etText.text.toString()
            isName = true
            saveData(editName, isName)
            findNavController().navigate(R.id.action_userNameFragment_to_mainFragment)
        }

        return binding
    }

    private fun saveData(userName: String, isName: Boolean) {
        val editor = sharedPreferences?.edit()
        editor?.apply{
            putString("user_name", userName)
            putBoolean("is_name", isName)
        }?.apply()
    }

//    override fun onDestroy() {
//        super.onDestroy()
//        saveData(editName)
//    }
}