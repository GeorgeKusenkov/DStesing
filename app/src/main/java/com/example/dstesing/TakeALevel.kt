package com.example.dstesing

class TakeALevel {

    val xpLeve1 = 100
    val xpLeve2 = 200
    val xpLeve3 = 300
    val xpLeve4 = 400
    val xpLeve5 = 500
    val xpLeve6 = 600
    val xpLeve7 = 700
    val xpLeve8 = 800
    val xpLeve9 = 900
    val xpLeve10 = 1000

    fun changeImage(lessons: Array<Lesson>) {
        val xp = 101           //Реализовать подтягивание опыта из Shared Pref

        if (xp > 0) {
            lessons[0].images = R.drawable.elephant
        }

        if (xp > xpLeve1) {
            lessons[1].images = R.drawable.file_58980652
            lessons[2].images = R.drawable.wild_boar
        }

        if (xp > xpLeve2) {
            lessons[3].images = R.drawable.bear
            lessons[4].images = R.drawable.bison
            lessons[5].images = R.drawable.file_58980648
        }
    }

}