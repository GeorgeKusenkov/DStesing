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

    fun getLessonsList(): Array<Lesson> {
        return arrayOf(
            Lesson("Lesson #1", "This is Module #1",R.drawable.coala5),
            Lesson("Lesson #2", "This is Module #2",R.drawable.coala5),
            Lesson("Lesson #3", "This is Module #3",R.drawable.coala5),
            Lesson("Lesson #4", "This is Module #4",R.drawable.coala5),
            Lesson("Lesson #5", "This is Module #5",R.drawable.coala5),
            Lesson("Lesson #5", "This is Module #6",R.drawable.coala5)
        )
    }
}