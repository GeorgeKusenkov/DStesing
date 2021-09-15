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

            if (userXp >= LevelGradation.LEVEL_6.xp) {
                lessons[6].images = R.drawable.file_58980649
            }

            if (userXp >= LevelGradation.LEVEL_7.xp) {
                lessons[7].images = R.drawable.file_58980655
            }

            if (userXp >= LevelGradation.LEVEL_8.xp) {
                lessons[8].images = R.drawable.file_58980657
            }

            if (userXp >= LevelGradation.LEVEL_9.xp) {
                lessons[9].images = R.drawable.file_58980661
            }

            if (userXp >= LevelGradation.LEVEL_10.xp) {
                lessons[10].images = R.drawable.file_58980658
            }

            if (userXp >= LevelGradation.LEVEL_11.xp) {
                lessons[11].images = R.drawable.file_58980654
            }

            if (userXp >= LevelGradation.LEVEL_12.xp) {
                lessons[12].images = R.drawable.file_58980651
            }

            if (userXp >= LevelGradation.LEVEL_13.xp) {
                lessons[13].images = R.drawable.file_58980648
            }

            if (userXp >= LevelGradation.LEVEL_14.xp) {
                lessons[14].images = R.drawable.file_58980647
            }

            if (userXp >= LevelGradation.LEVEL_15.xp) {
                lessons[15].images = R.drawable.file_58980649
            }

        }
    }
}