package com.example.dstesing.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.dstesing.Lesson
import com.example.dstesing.OnLessonClickListener
import com.example.dstesing.R
import com.example.dstesing.adapters.RecyclerViewLessonAdapter

class DetailsFragment : Fragment(), OnLessonClickListener  {

    private var num: Int = DetailsFragment().lessonClick

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

   when (num) {
       0 -> return inflater.inflate(R.layout.fragment_details, container, false)
       1 -> return inflater.inflate(R.layout.fragment_details2, container, false)
       2 -> return inflater.inflate(R.layout.fragment_details3, container, false)
   }
        return inflater.inflate(R.layout.fragment_details, container, false)
    }

    override fun lessonClick(lesson: Lesson, position: Int) {
        return position

    }

}

class Testoro() {
    val x = 0

    fun esss (): Int {
        return 2
    }
}