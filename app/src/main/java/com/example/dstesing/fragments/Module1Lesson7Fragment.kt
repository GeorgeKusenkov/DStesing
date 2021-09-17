package com.example.dstesing.fragments

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ScrollView
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.dstesing.Music
import com.example.dstesing.R
import com.example.dstesing.Saver

class Module1Lesson7Fragment : Fragment() {

    private val args: DetailsFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        val binding = inflater.inflate(R.layout.fragment_module1_lesson7, container, false)
        val button = binding.findViewById<Button>(R.id.btn_next_level)
        val mpButton1 = binding.findViewById<Button>(R.id.btn_m1l7_music1)
        val mpButton2 = binding.findViewById<Button>(R.id.btn_m1l7_music2)
        val mpButton3 = binding.findViewById<Button>(R.id.btn_m1l7_music3)
        val mpButton4 = binding.findViewById<Button>(R.id.btn_m1l7_music4)
        val player1 = MediaPlayer.create(context, R.raw.audio_c1m1l7_1)
        val player2 = MediaPlayer.create(context, R.raw.audio_c1m1l7_2)
        val player3 = MediaPlayer.create(context, R.raw.audio_c1m1l7_3)
        val player4 = MediaPlayer.create(context, R.raw.audio_c1m1l7_4)
        val scrollView = binding.findViewById<ScrollView>(R.id.fragment_module1_lesson7)
        val position = args.position+1
        binding.setBackgroundResource(R.drawable.linear_layout_radius)

        button.setOnClickListener{
            val action = Module1Lesson7FragmentDirections.actionModule1Lesson7FragmentToModule1Lesson8Fragment(position)
            findNavController().navigate(action)
        }

        mpButton1.setOnClickListener{Music(mpButton1, player1).play()}
        mpButton2.setOnClickListener{Music(mpButton2, player2).play()}
        mpButton3.setOnClickListener{Music(mpButton3, player3).play()}
        mpButton4.setOnClickListener{Music(mpButton4, player4).play()}

        Saver(position, scrollView, requireContext()).getPoints()
        return binding
    }
}