package com.example.dstesing

import android.view.ViewGroup

interface OnLessonClickListener {
    fun lessonClick(lesson: Lesson, position: Int)
}