package com.example.dstesing

import android.content.Context
import android.content.SharedPreferences


class TakeALevel(val context: Context, val id: String) {

    private var sharedPreferences: SharedPreferences? = null
    private var lessonsModule1Id = DataStorage.getLessonsModule1List()[0].id
    private var lessonsModule2Id = DataStorage.getLessonsModule2List()[0].id

    fun changeImage(lessons: Array<Lesson>) {
        sharedPreferences = context.getSharedPreferences("SETTINGS", Context.MODE_PRIVATE)
        val userXp = sharedPreferences?.getInt("user_experience", 0)

        if (id == lessonsModule1Id) {
            if (userXp != null) {
                if (userXp > LevelGradation.LEVEL_0.xp) {
                    lessons[0].images = R.drawable.basic_module1_lesson1
                }

                if (userXp >= LevelGradation.LEVEL_1.xp) {
                    lessons[1].images = R.drawable.basic_module1_lesson2

                }

                if (userXp >= LevelGradation.LEVEL_2.xp) {
                    lessons[2].images = R.drawable.basic_module1_lesson3
                }

                if (userXp >= LevelGradation.LEVEL_3.xp) {
                    lessons[3].images = R.drawable.basic_module1_lesson4
                }

                if (userXp >= LevelGradation.LEVEL_4.xp) {
                    lessons[4].images = R.drawable.basic_module1_lesson5
                }

                if (userXp >= LevelGradation.LEVEL_5.xp) {
                    lessons[5].images = R.drawable.basic_module1_lesson6
                }

                if (userXp >= LevelGradation.LEVEL_6.xp) {
                    lessons[6].images = R.drawable.basic_module1_lesson7
                }

                if (userXp >= LevelGradation.LEVEL_7.xp) {
                    lessons[7].images = R.drawable.basic_module1_lesson8
                }

                if (userXp >= LevelGradation.LEVEL_8.xp) {
                    lessons[8].images = R.drawable.basic_module1_lesson9
                }

                if (userXp >= LevelGradation.LEVEL_9.xp) {
                    lessons[9].images = R.drawable.basic_module1_lesson10
                }

                if (userXp >= LevelGradation.LEVEL_10.xp) {
                    lessons[10].images = R.drawable.basic_module1_lesson11
                }

                if (userXp >= LevelGradation.LEVEL_11.xp) {
                    lessons[11].images = R.drawable.basic_module1_lesson12
                }

                if (userXp >= LevelGradation.LEVEL_12.xp) {
                    lessons[12].images = R.drawable.basic_module1_lesson13
                }

                if (userXp >= LevelGradation.LEVEL_13.xp) {
                    lessons[13].images = R.drawable.basic_module1_lesson14
                }

                if (userXp >= LevelGradation.LEVEL_14.xp) {
                    lessons[14].images = R.drawable.basic_module1_lesson15
                }

                if (userXp >= LevelGradation.LEVEL_15.xp) {
                    lessons[15].images = R.drawable.basic_module1_lesson16
                }

                if (userXp >= LevelGradation.LEVEL_16.xp) {
                    lessons[16].images = R.drawable.basic_module1_lesson17
                }

                if (userXp >= LevelGradation.LEVEL_17.xp) {
                    lessons[17].images = R.drawable.basic_module1_lesson18
                }

                if (userXp >= LevelGradation.LEVEL_18.xp) {
                    lessons[18].images = R.drawable.basic_module1_lesson19
                }

            }
        }


        if (id == lessonsModule2Id) {
            if (userXp != null) {
                if (userXp >= LevelGradation.LEVEL_19.xp)   { lessons[0].images = R.drawable.basic_module1_lesson1 }
                if (userXp >= LevelGradation.LEVEL_20.xp)  { lessons[1].images = R.drawable.basic_module1_lesson2 }
                if (userXp >= LevelGradation.LEVEL_21.xp)  { lessons[2].images = R.drawable.basic_module1_lesson3 }
                if (userXp >= LevelGradation.LEVEL_22.xp)  { lessons[3].images = R.drawable.basic_module1_lesson4 }
                if (userXp >= LevelGradation.LEVEL_23.xp)  { lessons[4].images = R.drawable.basic_module1_lesson5 }
                if (userXp >= LevelGradation.LEVEL_24.xp)  { lessons[5].images = R.drawable.basic_module1_lesson6 }
                if (userXp >= LevelGradation.LEVEL_25.xp)  { lessons[6].images = R.drawable.basic_module1_lesson7 }
                if (userXp >= LevelGradation.LEVEL_26.xp)  { lessons[7].images = R.drawable.basic_module1_lesson8 }
                if (userXp >= LevelGradation.LEVEL_27.xp)  { lessons[8].images = R.drawable.basic_module1_lesson9 }
                if (userXp >= LevelGradation.LEVEL_28.xp)  { lessons[9].images = R.drawable.basic_module1_lesson10 }
                if (userXp >= LevelGradation.LEVEL_29.xp)  { lessons[10].images = R.drawable.basic_module1_lesson11 }

            }
        }

    }
}