package com.example.dstesing

object DataStorage {
    fun getModuleList(): Array<Module> {
        return arrayOf(
            Module("Module #1", "This is Module #1",R.drawable.coala),
            Module("Module #2", "This is Module #2",R.drawable.coala2),
            Module("Module #3", "This is Module #3",R.drawable.coala3),
            Module("Module #4", "This is Module #4",R.drawable.coala4),
            Module("Module #5", "This is Module #5",R.drawable.coala5)
        )
    }

    //Basic course module 1 lessons
    fun getLessonsModule1List(): Array<Lesson> {
        return arrayOf(
            Lesson("О диджериду", "Познакомьтесь с инструментом поближе",R.drawable.idge_logo,"M1L-"),
            Lesson("Базовйы звук - дрон", "Как извлечь основной звук?",R.drawable.drone_image,"M1L-"),
            Lesson("Lesson #3", "This is Lesson #3",R.drawable.coala5,"M1L-"),
            Lesson("Lesson #4", "This is Lesson #4",R.drawable.coala5,"M1L-"),
            Lesson("Lesson #5", "This is Lesson #5",R.drawable.coala5,"M1L-"),
            Lesson("Lesson #6", "This is Lesson #6",R.drawable.coala5,"M1L-"),
        )
    }

    //Basic course module 2 lessons
    fun getLessonsModule2List(): Array<Lesson> {
        return arrayOf(
            Lesson("Lesson #1", "This is Lesson #1",R.drawable.coala2,"M2L-"),
            Lesson("Lesson #2", "This is Lesson #1",R.drawable.coala2,"M2L-"),
            Lesson("Lesson #3", "This is Lesson #1",R.drawable.coala2,"M2L-")
        )
    }
}