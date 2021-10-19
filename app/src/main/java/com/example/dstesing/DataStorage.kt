package com.example.dstesing

import android.content.res.Resources

object DataStorage {
    fun getModuleList(): Array<Module> {
        return arrayOf(
            Module("Модуль 1", "Окунитесь с головой в основы звукоизвлечения",R.drawable.basic_module_1),
            Module("Модуль 2", "Океан похитил все ритмы. Помогите Луке найти их все",R.drawable.basic_module_2),
            Module("Модуль 3", "Лука отправляется в долину кругового дыхания. Духи поведают о древней технике",R.drawable.basic_module_3),
            Module("Модуль 4", "Знакомство со звуками животных и разных техник игры",R.drawable.basic_module_4),
            Module("Модуль 5", "Продвинутые техники игры",R.drawable.basic_module_1)
        )
    }

//    fun getLesson1(): Array<String> {
//
//        val arr = arrayListOf(R.array.day_of_weeks)
//
//        val lessonsMap = mapOf(
//            "TAG"           to arr[1],
//            "TEXT"          to "this is lesson 2",
//            "LUKA_DIALOG"   to "this is lesson 3",
//            "TEXT"          to "this is lesson 4",
//        )
//
//        val mass = R.array.day_of_weeks
//
//    }

    //Basic course Main
    fun getCourseList(): Array<Course> {
        return arrayOf(
            Course("Базовый курс", "Курс для новичков",R.drawable.austalia_uluru),
            Course("Диджериду Pro", "Узнай больше", R.drawable.australia_uluru2),
        )
    }

    //Basic course module 1 lessons
    fun getLessonsModule1List(): Array<Lesson> {
        return arrayOf(
            Lesson(R.string.lesson1, R.string.lesson1_title, R.drawable.ic_lesson_lock,"M1L-"),
            Lesson(R.string.lesson2, R.string.lesson2_title, R.drawable.ic_lesson_lock,"M1L-"),
            Lesson(R.string.lesson3, R.string.lesson3_title, R.drawable.ic_lesson_lock,"M1L-"),
            Lesson(R.string.lesson4, R.string.lesson4_title, R.drawable.ic_lesson_lock,"M1L-"),
            Lesson(R.string.lesson5, R.string.lesson5_title, R.drawable.ic_lesson_lock,"M1L-"),
            Lesson(R.string.lesson6, R.string.lesson6_title, R.drawable.ic_lesson_lock,"M1L-"),
            Lesson(R.string.lesson7, R.string.lesson7_title, R.drawable.ic_lesson_lock,"M1L-"),
            Lesson(R.string.lesson8, R.string.lesson8_title, R.drawable.ic_lesson_lock,"M1L-"),
            Lesson(R.string.lesson9, R.string.lesson9_title, R.drawable.ic_lesson_lock,"M1L-"),
            Lesson(R.string.lesson10, R.string.lesson10_title, R.drawable.ic_lesson_lock,"M1L-"),
            Lesson(R.string.lesson11, R.string.lesson11_title, R.drawable.ic_lesson_lock,"M1L-"),
            Lesson(R.string.lesson12, R.string.lesson12_title, R.drawable.ic_lesson_lock,"M1L-"),
            Lesson(R.string.lesson13, R.string.lesson13_title, R.drawable.ic_lesson_lock,"M1L-"),
            Lesson(R.string.lesson14, R.string.lesson14_title, R.drawable.ic_lesson_lock,"M1L-"),
            Lesson(R.string.lesson15, R.string.lesson15_title, R.drawable.ic_lesson_lock,"M1L-"),
            Lesson(R.string.lesson16, R.string.lesson16_title, R.drawable.ic_lesson_lock,"M1L-"),
            Lesson(R.string.lesson17, R.string.lesson17_title, R.drawable.ic_lesson_lock,"M1L-"),
            Lesson(R.string.lesson18, R.string.lesson18_title, R.drawable.ic_lesson_lock,"M1L-"),
            Lesson(R.string.lesson19, R.string.lesson19_title, R.drawable.ic_lesson_lock,"M1L-"),
        )
    }

    //Basic course module 2 lessons
    fun getLessonsModule2List(): Array<Lesson> {
        return arrayOf(
            Lesson(R.string.lesson1, R.string.lesson1_title,R.drawable.coala2,"M2L-"),
            Lesson(R.string.lesson2, R.string.lesson1_title,R.drawable.coala2,"M2L-"),
            Lesson(R.string.lesson3, R.string.lesson1_title,R.drawable.coala2,"M2L-")
        )
    }
}