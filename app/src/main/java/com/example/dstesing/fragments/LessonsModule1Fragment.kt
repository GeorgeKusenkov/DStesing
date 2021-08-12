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

                position == 2 && userXp >= LevelGradation.LEVEL_1.xp -> {
                    val action = LessonsModule1FragmentDirections.actionLessonsModule1FragmentToModule1Lesson3Fragment(position)
                    findNavController().navigate(action)
                }

                position == 3 && userXp >= LevelGradation.LEVEL_2.xp -> {
                    val action = LessonsModule1FragmentDirections.actionLessonsModule1FragmentToModule1Lesson3Fragment(position)
                    findNavController().navigate(action)
                }

                position == 4 && userXp >= LevelGradation.LEVEL_3.xp -> {
                    val action = LessonsModule1FragmentDirections.actionLessonsModule1FragmentToModule1Lesson3Fragment(position)
                    findNavController().navigate(action)
                }

                position == 5 && userXp >= LevelGradation.LEVEL_4.xp -> {
                    val action = LessonsModule1FragmentDirections.actionLessonsModule1FragmentToModule1Lesson3Fragment(position)
                    findNavController().navigate(action)
                }
                else -> Toast.makeText(context, "Не хватает очков опыта", Toast.LENGTH_SHORT).show()
            }
        }

    }
}