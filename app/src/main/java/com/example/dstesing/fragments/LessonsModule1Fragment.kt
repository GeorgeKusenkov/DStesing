package com.example.dstesing.fragments

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dstesing.Lesson
import com.example.dstesing.LevelGradation
import com.example.dstesing.OnLessonClickListener
import com.example.dstesing.R
import com.example.dstesing.adapters.RecyclerViewModule1Adapter
import java.lang.Exception

class LessonsModule1Fragment : Fragment(), OnLessonClickListener {

    private var sharedPreferences: SharedPreferences? = null
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<RecyclerViewModule1Adapter.ViewHolder>? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = inflater.inflate(R.layout.fragment_module1_lessons, container, false)
        val recyclerView = binding.findViewById<RecyclerView>(R.id.module1_lessons_recycler_view)

        layoutManager = LinearLayoutManager(context)
        recyclerView.layoutManager = layoutManager
        adapter = RecyclerViewModule1Adapter(this)
        recyclerView.adapter = adapter

        return binding
    }

    override fun lessonClick(lesson: Lesson, position: Int) {
        sharedPreferences = context?.getSharedPreferences("SETTINGS", Context.MODE_PRIVATE)
        val userXp = sharedPreferences?.getInt("user_experience", 0)

//        when(position) {
//            0 -> findNavController().navigate(R.id.action_lessonsModule1Fragment_to_module1Lesson1Fragment)
//            1 -> findNavController().navigate(R.id.action_lessonsModule1Fragment_to_module1Lesson2Fragment)
//        }

//        val action = LessonsModule1FragmentDirections.actionLessonsModule1FragmentToDetailsFragment(position, id)
//        findNavController().navigate(action)

        try {


        if (userXp != null) {
            when  {
                position == 0 && userXp > LevelGradation.LEVEL_0.xp -> {
                    val action = LessonsModule1FragmentDirections.actionLessonsModule1FragmentToModule1Lesson1Fragment(position)
                    findNavController().navigate(action)
                }

                position == 1 && userXp >= LevelGradation.LEVEL_1.xp -> {
                    val action = LessonsModule1FragmentDirections.actionLessonsModule1FragmentToModule1Lesson2Fragment(position)
                    findNavController().navigate(action)
                }

                position == 2 && userXp >= LevelGradation.LEVEL_2.xp -> {
                    val action = LessonsModule1FragmentDirections.actionLessonsModule1FragmentToModule1Lesson3Fragment(position)
                    findNavController().navigate(action)
                }

                position == 3 && userXp >= LevelGradation.LEVEL_3.xp -> {
                    val action = LessonsModule1FragmentDirections.actionLessonsModule1FragmentToModule1Lesson4Fragment(position)
                    findNavController().navigate(action)
                }

                position == 4 && userXp >= LevelGradation.LEVEL_4.xp -> {
                    val action = LessonsModule1FragmentDirections.actionLessonsModule1FragmentToModule1Lesson5Fragment(position)
                    findNavController().navigate(action)
                }

                position == 5 && userXp >= LevelGradation.LEVEL_5.xp -> {
                    val action = LessonsModule1FragmentDirections.actionLessonsModule1FragmentToModule1Lesson6Fragment(position)
                    findNavController().navigate(action)
                }

                position == 6 && userXp >= LevelGradation.LEVEL_6.xp -> {
                    val action = LessonsModule1FragmentDirections.actionLessonsModule1FragmentToModule1Lesson7Fragment(position)
                    findNavController().navigate(action)
                }

                position == 7 && userXp >= LevelGradation.LEVEL_7.xp -> {
                    val action = LessonsModule1FragmentDirections.actionLessonsModule1FragmentToModule1Lesson8Fragment(position)
                    findNavController().navigate(action)
                }

                position == 8 && userXp >= LevelGradation.LEVEL_8.xp -> {
                    val action = LessonsModule1FragmentDirections.actionLessonsModule1FragmentToModule1Lesson9Fragment(position)
                    findNavController().navigate(action)
                }

                position == 9 && userXp >= LevelGradation.LEVEL_9.xp -> {
                    val action = LessonsModule1FragmentDirections.actionLessonsModule1FragmentToModule1Lesson10Fragment(position)
                    findNavController().navigate(action)
                }

                position == 10 && userXp >= LevelGradation.LEVEL_10.xp -> {
                    val action = LessonsModule1FragmentDirections.actionLessonsModule1FragmentToModule1Lesson11Fragment(position)
                    findNavController().navigate(action)
                }

                position == 11 && userXp >= LevelGradation.LEVEL_11.xp -> {
                    val action = LessonsModule1FragmentDirections.actionLessonsModule1FragmentToModule1Lesson12Fragment(position)
                    findNavController().navigate(action)
                }

                position == 12 && userXp >= LevelGradation.LEVEL_12.xp -> {
                    val action = LessonsModule1FragmentDirections.actionLessonsModule1FragmentToModule1Lesson13Fragment(position)
                    findNavController().navigate(action)
                }

                position == 13 && userXp >= LevelGradation.LEVEL_13.xp -> {
                    val action = LessonsModule1FragmentDirections.actionLessonsModule1FragmentToModule1Lesson14Fragment(position)
                    findNavController().navigate(action)
                }

                position == 14 && userXp >= LevelGradation.LEVEL_14.xp -> {
                    val action = LessonsModule1FragmentDirections.actionLessonsModule1FragmentToModule1Lesson15Fragment(position)
                    findNavController().navigate(action)
                }

                position == 15 && userXp >= LevelGradation.LEVEL_15.xp -> {
                    val action = LessonsModule1FragmentDirections.actionLessonsModule1FragmentToModule1Lesson16Fragment(position)
                    findNavController().navigate(action)
                }

                position == 16 && userXp >= LevelGradation.LEVEL_16.xp -> {
                    val action = LessonsModule1FragmentDirections.actionLessonsModule1FragmentToModule1Lesson17Fragment(position)
                    findNavController().navigate(action)
                }

                position == 17 && userXp >= LevelGradation.LEVEL_17.xp -> {
                    val action = LessonsModule1FragmentDirections.actionLessonsModule1FragmentToModule1Lesson18Fragment(position)
                    findNavController().navigate(action)
                }

                position == 18 && userXp >= LevelGradation.LEVEL_18.xp -> {
                    val action = LessonsModule1FragmentDirections.actionLessonsModule1FragmentToModule1Lesson19Fragment(position)
                    findNavController().navigate(action)
                }

                else -> Toast.makeText(context, "Не хватает очков опыта", Toast.LENGTH_SHORT).show()
            }
        }
        } catch (e: Exception) {Toast.makeText(context, "Ошибка: $e", Toast.LENGTH_SHORT).show()}
    }
}