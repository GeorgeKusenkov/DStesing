package com.example.dstesing.fragments

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dstesing.*
import com.example.dstesing.adapters.RecyclerViewCourseAdapter

class MainFragment : Fragment(), OnCourseClickListener {

    private var sharedPreferences: SharedPreferences? = null
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var cardAdapter: RecyclerView.Adapter<RecyclerViewCourseAdapter.ViewHolder>? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = inflater.inflate(R.layout.fragment_main,container,false)

        val button = binding.findViewById<Button>(R.id.button)
        val userName  = binding.findViewById<TextView>(R.id.userName)
        val userExperience = binding.findViewById<TextView>(R.id.experience_main)
        val userLevel = binding.findViewById<TextView>(R.id.user_level)
        val userLessonCounter = binding.findViewById<TextView>(R.id.user_lesson_counter)

        //Достаём значение из SharedPreferences. Заполняем имя пользователя
        sharedPreferences = context?.getSharedPreferences("SETTINGS", Context.MODE_PRIVATE)
        userName.text = sharedPreferences?.getString("user_name", "Абориген")!!
        userExperience.text = sharedPreferences?.getInt("user_experience", 0).toString()
        userLessonCounter.setText(sharedPreferences?.getInt("LESSON_COUNTER", 0).toString())

        val exp = sharedPreferences?.getInt("user_experience", 0)!!

        when (exp) {
            in 0..500 -> userLevel.setText("1")
            in 501..1000 -> userLevel.setText("2")
            in 1001..1500 -> userLevel.setText("3")
            in 1501..2000 -> userLevel.setText("4")
            in 2001..2500 -> userLevel.setText("5")
            in 2501..3000 -> userLevel.setText("6")
            in 3001..3500 -> userLevel.setText("7")
            in 3501..4000 -> userLevel.setText("8")
            in 4001..4500 -> userLevel.setText("9")
            in 4501..5000 -> userLevel.setText("10")
            else -> userLevel.setText("11")
        }

        var isName = sharedPreferences?.getBoolean("is_name", false)!!
        if (!isName) {
            findNavController().navigate(R.id.action_mainFragment_to_userNameFragment)
        }

        val recyclerView = binding.findViewById<RecyclerView>(R.id.module_recycler_view)
        layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
        recyclerView.layoutManager = layoutManager
        cardAdapter = RecyclerViewCourseAdapter(this)
        recyclerView.adapter = cardAdapter

        button.setOnClickListener{view: View ->
            view.findNavController().navigate(R.id.action_mainFragment_to_moduleFragment)
        }

        return binding
    }

    override fun cardClick(course: Course, position: Int) {
        when(position) {
            0 -> findNavController().navigate(R.id.action_mainFragment_to_moduleFragment)
            1 -> findNavController().navigate(R.id.action_mainFragment_to_infoFragment)
//            1 -> Toast.makeText(context, "Этот курс пока что не доступен", Toast.LENGTH_LONG).show()
        }
    }

}