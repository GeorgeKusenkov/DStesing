package com.example.dstesing.fragments

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.dstesing.R
import java.lang.Exception

class Module1Lesson19Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val binding = inflater.inflate(R.layout.fragment_module1_lesson19, container, false)
        val button = binding.findViewById<Button>(R.id.btn_music)
        val player = MediaPlayer.create(context, R.raw.sample)

        try {
            button.setOnClickListener{
                if (player.isPlaying) {
                    button.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_play_arrow,0,0,0)
                    player.stop()
                    player.prepare()
                } else {
                    player.start()
                    button.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_stop,0,0,0)
                }
            }
        } catch (e: Exception) {
            Toast.makeText(context, "Ошибка: $e", Toast.LENGTH_SHORT).show()
        }
        return binding
    }

}