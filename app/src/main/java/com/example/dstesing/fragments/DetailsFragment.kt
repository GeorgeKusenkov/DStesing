package com.example.dstesing.fragments

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.Toast
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.RecyclerView
import com.example.dstesing.DataStorage
import com.example.dstesing.R

class DetailsFragment : Fragment()  {

    private val args: DetailsFragmentArgs by navArgs()

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {

        val binding = inflater.inflate(R.layout.fragment_module1_lesson6, container, false)


//    if (!scrollView.canScrollVertically(1)) {
//        Toast.makeText(context, "YEP", Toast.LENGTH_SHORT)
//    }



//
//        val num = args.position                                                                     //Передаем этому фрагменту аргумент с позицией
//        val id = args.id                                                                            //Присваиваем ID элемента в списке
//
//            if(id == "M1L-") {
//                val module1Lessons = DataStorage.getLessonsModule1List()[num].id + (num+1).toString()   //Для читабельности и соответствия ID и уроку прибавляем 1
//                when (module1Lessons) {
//                    "M1L-1" -> return inflater.inflate(R.layout.fragment_module1_lesson1, container, false)
//                    "M1L-2" -> return inflater.inflate(R.layout.fragment_module1_lesson2, container, false)
//                    "M1L-3" -> return inflater.inflate(R.layout.fragment_module1_lesson3, container, false)
//                    "M1L-4" -> return inflater.inflate(R.layout.fragment_module1_lesson4, container, false)
//                    "M1L-5" -> return inflater.inflate(R.layout.fragment_module1_lesson5, container, false)
//                    "M1L-6" -> return inflater.inflate(R.layout.fragment_module1_lesson6, container, false)
//                }
//            }
//
//            if(id == "M2L-") {
//                val module2Lessons = DataStorage.getLessonsModule2List()[num].id + (num+1).toString()      //Присваиваем ID каждого урока
//                when (module2Lessons) {
//                    "M2L-1" -> return inflater.inflate(R.layout.fragment_module2_lesson1, container, false)
//                    "M2L-2" -> return inflater.inflate(R.layout.fragment_module2_lesson2, container, false)
//                    "M2L-3" -> return inflater.inflate(R.layout.fragment_module2_lesson3, container, false)
//                }
//            }

            return binding
    }

}

