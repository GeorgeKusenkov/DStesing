package com.example.dstesing

import android.content.Context
import android.widget.ScrollView
import android.widget.Toast
import androidx.core.widget.NestedScrollView

class Saver (var position: Int, var scrollView: NestedScrollView, var context: Context) {

    private var shared = context.getSharedPreferences("SETTINGS", Context.MODE_PRIVATE)
    private var xp = shared?.getInt("user_experience", 0)!!
    private var checkXP = shared?.getBoolean("CHECK_XP_M1L$position", false)!!
    private var counter = shared?.getInt("LESSON_COUNTER", 0)!!

    private fun saveData() {
        val editor = shared.edit()
        editor?.apply{
            putInt("user_experience", xp)
            putBoolean("CHECK_XP_M1L$position", checkXP)
            putInt("LESSON_COUNTER", counter)
        }?.apply()
    }

    fun getPoints () {
        scrollView.viewTreeObserver.addOnScrollChangedListener {
            if (!scrollView.canScrollVertically(1) && !checkXP) {
                xp+=100
                counter+=1
                checkXP = true
                saveData()
                Toast.makeText(context, "Вы получили $xp очков опыта", Toast.LENGTH_SHORT).show()
            }
        }
    }

}