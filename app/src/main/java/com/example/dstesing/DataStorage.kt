package com.example.dstesing

object DataStorage {
    fun getModuleList(): Array<Module> {
        return arrayOf(
            Module("Занятие 1", "Окунитесь с головой в основы звукоизвлечения",R.drawable.bear),
            Module("Занятие 2", "This is Module #2",R.drawable.elephant),
            Module("Занятие 3", "This is Module #3",R.drawable.wild_boar),
            Module("Занятие 4", "This is Module #4",R.drawable.hedgehog),
            Module("Занятие 5", "This is Module #5",R.drawable.bison)
        )
    }

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
            Lesson(R.string.lesson3, R.string.lesson1_title, R.drawable.ic_lesson_lock,"M1L-"),
            Lesson(R.string.lesson4, R.string.lesson1_title, R.drawable.ic_lesson_lock,"M1L-"),
            Lesson(R.string.lesson5, R.string.lesson1_title, R.drawable.ic_lesson_lock,"M1L-"),
            Lesson(R.string.lesson6, R.string.lesson1_title, R.drawable.ic_lesson_lock,"M1L-"),
            Lesson(R.string.lesson7, R.string.lesson1_title, R.drawable.ic_lesson_lock,"M1L-"),
            Lesson(R.string.lesson8, R.string.lesson1_title, R.drawable.ic_lesson_lock,"M1L-"),
            Lesson(R.string.lesson9, R.string.lesson1_title, R.drawable.ic_lesson_lock,"M1L-"),
            Lesson(R.string.lesson10, R.string.lesson1_title, R.drawable.ic_lesson_lock,"M1L-"),
            Lesson(R.string.lesson11, R.string.lesson1_title, R.drawable.ic_lesson_lock,"M1L-"),
            Lesson(R.string.lesson12, R.string.lesson1_title, R.drawable.ic_lesson_lock,"M1L-"),
            Lesson(R.string.lesson13, R.string.lesson1_title, R.drawable.ic_lesson_lock,"M1L-"),
            Lesson(R.string.lesson14, R.string.lesson1_title, R.drawable.ic_lesson_lock,"M1L-"),
            Lesson(R.string.lesson15, R.string.lesson1_title, R.drawable.ic_lesson_lock,"M1L-"),
            Lesson(R.string.lesson16, R.string.lesson1_title, R.drawable.ic_lesson_lock,"M1L-"),
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