package com.example.dstesing.fragments

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dstesing.Lesson
import com.example.dstesing.LevelGradation
import com.example.dstesing.OnLessonClickListener
import com.example.dstesing.R
import com.example.dstesing.adapters.RecyclerViewModule2Adapter
import java.lang.Exception

class LessonsModule2Fragment : Fragment(), OnLessonClickListener {

    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<RecyclerViewModule2Adapter.ViewHolder>? = null
    private var sharedPreferences: SharedPreferences? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = inflater.inflate(R.layout.fragment_module2_lessons, container, false)

        val recyclerView = binding.findViewById<RecyclerView>(R.id.module2_lessons_recycler_view)
        layoutManager = LinearLayoutManager(context)
        recyclerView.layoutManager = layoutManager
        adapter = RecyclerViewModule2Adapter(this)
        recyclerView.adapter = adapter

        return binding
    }

    override fun lessonClick(lesson: Lesson, position: Int) {
        sharedPreferences = context?.getSharedPreferences("SETTINGS", Context.MODE_PRIVATE)
        val userXp = sharedPreferences?.getInt("user_experience", 0)

        try {
            if (userXp != null) {
                when  {
                    position == 0 && userXp >= LevelGradation.LEVEL_19.xp -> {
                        val action = LessonsModule2FragmentDirections.actionLessonsModule2FragmentToModule2Lesson1Fragment(position)
                        findNavController().navigate(action)
                    }

                    position == 1 && userXp >= LevelGradation.LEVEL_20.xp -> {
                        val action = LessonsModule1FragmentDirections.actionLessonsModule1FragmentToModule1Lesson2Fragment(position)
                        findNavController().navigate(action)
                    }

                    position == 2 && userXp >= LevelGradation.LEVEL_21.xp -> {
                        val action = LessonsModule1FragmentDirections.actionLessonsModule1FragmentToModule1Lesson3Fragment(position)
                        findNavController().navigate(action)
                    }

                    position == 3 && userXp >= LevelGradation.LEVEL_22.xp -> {
                        val action = LessonsModule1FragmentDirections.actionLessonsModule1FragmentToModule1Lesson4Fragment(position)
                        findNavController().navigate(action)
                    }

                    position == 4 && userXp >= LevelGradation.LEVEL_23.xp -> {
                        val action = LessonsModule1FragmentDirections.actionLessonsModule1FragmentToModule1Lesson5Fragment(position)
                        findNavController().navigate(action)
                    }

                    position == 5 && userXp >= LevelGradation.LEVEL_24.xp -> {
                        val action = LessonsModule1FragmentDirections.actionLessonsModule1FragmentToModule1Lesson6Fragment(position)
                        findNavController().navigate(action)
                    }

                    position == 6 && userXp >= LevelGradation.LEVEL_25.xp -> {
                        val action = LessonsModule1FragmentDirections.actionLessonsModule1FragmentToModule1Lesson7Fragment(position)
                        findNavController().navigate(action)
                    }

                    position == 7 && userXp >= LevelGradation.LEVEL_26.xp -> {
                        val action = LessonsModule1FragmentDirections.actionLessonsModule1FragmentToModule1Lesson8Fragment(position)
                        findNavController().navigate(action)
                    }

                    position == 8 && userXp >= LevelGradation.LEVEL_27.xp -> {
                        val action = LessonsModule1FragmentDirections.actionLessonsModule1FragmentToModule1Lesson9Fragment(position)
                        findNavController().navigate(action)
                    }

                    position == 9 && userXp >= LevelGradation.LEVEL_28.xp -> {
                        val action = LessonsModule1FragmentDirections.actionLessonsModule1FragmentToModule1Lesson10Fragment(position)
                        findNavController().navigate(action)
                    }

                    position == 10 && userXp >= LevelGradation.LEVEL_29.xp -> {
                        val action = LessonsModule1FragmentDirections.actionLessonsModule1FragmentToModule1Lesson11Fragment(position)
                        findNavController().navigate(action)
                    }


                    else -> Toast.makeText(context, "Не хватает очков опыта", Toast.LENGTH_SHORT).show()
                }
            }
        } catch (e: Exception) {Toast.makeText(context, "Ошибка: $e", Toast.LENGTH_SHORT).show()}
    }
}
