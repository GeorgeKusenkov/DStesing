package com.example.dstesing

import android.content.Context
import android.content.SharedPreferences


class TakeALevel(val context: Context) {

    private var sharedPreferences: SharedPreferences? = null

    fun changeImage(lessons: Array<Lesson>) {
        sharedPreferences = context.getSharedPreferences("SETTINGS", Context.MODE_PRIVATE)
        val userXp = sharedPreferences?.getInt("user_experience", 0)

        if (userXp != null) {
            if (userXp > LevelGradation.LEVEL_0.xp) {
                lessons[0].images = R.drawable.elephant
            }

            if (userXp >= LevelGradation.LEVEL_1.xp) {
                lessons[1].images = R.drawable.file_58980652

            }

            if (userXp >= LevelGradation.LEVEL_2.xp) {
                lessons[2].images = R.drawable.wild_boar
            }

            if (userXp >= LevelGradation.LEVEL_3.xp) {
                lessons[3].images = R.drawable.bear
            }

            if (userXp >= LevelGradation.LEVEL_4.xp) {
                lessons[4].images = R.drawable.bison
            }

            if (userXp >= LevelGradation.LEVEL_5.xp) {
                lessons[5].images = R.drawable.file_58980656
            }
        }
    }
}