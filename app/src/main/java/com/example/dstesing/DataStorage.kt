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
            Lesson(R.string.lesson1, "Введение",R.drawable.file_58980647,"M1L-"),
            Lesson(R.string.lesson2, "О диджериду",R.drawable.file_58980648,"M1L-"),
            Lesson(R.string.lesson3, "Как выбрать диджериду?",R.drawable.file_58980649,"M1L-"),
            Lesson(R.string.lesson4, "Подготовительные упражнения ч.1",R.drawable.file_58980650,"M1L-"),
            Lesson(R.string.lesson5, "Подготовительные упражнения ч.2",R.drawable.file_58980651,"M1L-"),
            Lesson(R.string.lesson6, "Базовый звук - дрон",R.drawable.file_58980652,"M1L-"),
            Lesson(R.string.lesson7, "Базовый звук - дрон",R.drawable.file_58980653,"M1L-"),
            Lesson(R.string.lesson8, "Задание 1",R.drawable.file_58980654,"M1L-"),
            Lesson(R.string.lesson9, "Обертоны и гармоники",R.drawable.file_58980655,"M1L-"),
            Lesson(R.string.lesson10, "Обертоны и гармоники",R.drawable.file_58980656,"M1L-"),
            Lesson(R.string.lesson11, "Задание 2",R.drawable.file_58980657,"M1L-"),
            Lesson(R.string.lesson12, "Уход за диджериду",R.drawable.file_58980657,"M1L-"),
            Lesson(R.string.lesson13, "Виды диджериду",R.drawable.file_58980658,"M1L-"),
            Lesson(R.string.lesson14, "Где купить диджериду?",R.drawable.file_58980659,"M1L-"),
            Lesson(R.string.lesson15, "Диджериду-музыка, которую вы просто обязаны послушать ч.1 ",R.drawable.file_58980660,"M1L-"),
            Lesson(R.string.lesson16, "Заключение ",R.drawable.file_58980661,"M1L-"),
        )
    }

    //Basic course module 2 lessons
    fun getLessonsModule2List(): Array<Lesson> {
        return arrayOf(
            Lesson(R.string.lesson1, "This is Lesson #1",R.drawable.coala2,"M2L-"),
            Lesson(R.string.lesson2, "This is Lesson #1",R.drawable.coala2,"M2L-"),
            Lesson(R.string.lesson3, "This is Lesson #1",R.drawable.coala2,"M2L-")
        )
    }
}