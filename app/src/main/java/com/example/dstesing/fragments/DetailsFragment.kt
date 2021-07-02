package com.example.dstesing.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.navArgs
import com.example.dstesing.DataStorage
import com.example.dstesing.R

class DetailsFragment : Fragment()  {

    private val args: DetailsFragmentArgs by navArgs()

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {

        val num = args.position                                     //Передаем этому фрагменту аргумент с позицией
        val lessons = DataStorage.getLessonsList()[num].id          //Присваиваем ID каждого урока
        val result = lessons + (num+1).toString()                   //Для читабельности и соответствия ID и уроку прибавляем 1

            //Если ID отдельного урока в модуле совпадает, то натягиваем нужный layout
            when (result) {
            "M1L1-1" -> return inflater.inflate(R.layout.fragment_module1_lesson1, container, false)
            "M1L1-2" -> return inflater.inflate(R.layout.fragment_module1_lesson2, container, false)
            "M1L1-3" -> return inflater.inflate(R.layout.fragment_module1_lesson3, container, false)
            "M1L1-4" -> return inflater.inflate(R.layout.fragment_module1_lesson4, container, false)
            "M1L1-5" -> return inflater.inflate(R.layout.fragment_module1_lesson5, container, false)
            "M1L1-6" -> return inflater.inflate(R.layout.fragment_module1_lesson6, container, false)
       }
            return inflater.inflate(R.layout.fragment_module1_lesson1, container, false)
        }
}

