package com.example.dstesing.fragments

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.ContextMenu
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.dstesing.R

class UserNameFragment : Fragment() {

    var userName = ""
    var sharedPreferences: SharedPreferences? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val insertedTextField = this.activity?.findViewById<EditText>(R.id.et_user_name)
        val textField = this.activity?.findViewById<TextView>(R.id.tv_text)
        textField?.text = insertedTextField?.text.toString()
        sharedPreferences = context?.getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)
        userName = sharedPreferences?.getString("USER_NAME", "ЧЕЛОВЕК")!!
        val binding = inflater.inflate(R.layout.fragment_user_name, container, false)


        val button = binding.findViewById<Button>(R.id.button2)
        button.setOnClickListener{

        }

        return binding
    }

    private fun saveData(res: String) {
        val editor = sharedPreferences?.edit()
        editor?.apply{
            putString("USER_NAME", res)
        }?.apply()

    }

    override fun onDestroy() {
        super.onDestroy()
        saveData(counter)
    }


}