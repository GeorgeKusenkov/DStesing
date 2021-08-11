package com.example.dstesing

import android.content.Context
import android.content.SharedPreferences
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import com.example.dstesing.adapters.RecyclerViewModule1Adapter

class TakeALevel(val context: Context) {

    private var sharedPreferences: SharedPreferences? = null


    fun changeImage(lessons: Array<Lesson>) {
        sharedPreferences = context.getSharedPreferences("SETTINGS", Context.MODE_PRIVATE)
        val userXp = sharedPreferences?.getInt("user_experience", 0)


        if (userXp != null) {
            if (userXp > LevelGradation.LEVEL_0.xp) {
                lessons[0].images = R.drawable.elephant
            }

            if (userXp > LevelGradation.LEVEL_1.xp) {
                lessons[1].images = R.drawable.file_58980652
                lessons[2].images = R.drawable.wild_boar
            }

            if (userXp > LevelGradation.LEVEL_2.xp) {
                lessons[3].images = R.drawable.bear
                lessons[4].images = R.drawable.bison
                lessons[5].images = R.drawable.file_58980648
            }
        }
    }

}