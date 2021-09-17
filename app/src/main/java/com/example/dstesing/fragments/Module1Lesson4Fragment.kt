package com.example.dstesing.fragments

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ScrollView
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.dstesing.Music
import com.example.dstesing.R
import com.example.dstesing.Saver
import java.lang.Exception

class Module1Lesson4Fragment : Fragment() {

    private val args: DetailsFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        val binding = inflater.inflate(R.layout.fragment_module1_lesson4, container, false)
        val button = binding.findViewById<Button>(R.id.btn_next_level)
        val mpButton = binding.findViewById<Button>(R.id.btn_music)
        val player = MediaPlayer.create(context, R.raw.audio_c1m1l4)
        val scrollView = binding.findViewById<ScrollView>(R.id.fragment_module1_lesson4)
        val position = args.position+1
        binding.setBackgroundResource(R.drawable.linear_layout_radius)

        button.setOnClickListener{
            val action = Module1Lesson4FragmentDirections.actionModule1Lesson4FragmentToModule1Lesson5Fragment(position)
            findNavController().navigate(action)
        }

        try {
            mpButton.setOnClickListener{
                Music(mpButton, player).play()
            }
        } catch (e: Exception) {
            Toast.makeText(context, "Ошибка: $e", Toast.LENGTH_SHORT).show()
        }


        Saver(position, scrollView, requireContext()).getPoints()
        return binding
    }

}