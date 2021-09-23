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
import com.example.dstesing.CreateMusicButton
import com.example.dstesing.Music
import com.example.dstesing.R
import com.example.dstesing.Saver

class Module1Lesson11Fragment : Fragment() {

    private val args: DetailsFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        val binding = inflater.inflate(R.layout.fragment_module1_lesson11, container, false)
        val button = binding.findViewById<Button>(R.id.btn_next_level)

        val buttonIds = listOf(R.id.audio_c1m1l11_1, R.id.audio_c1m1l11_2, R.id.audio_c1m1l11_3, R.id.audio_c1m1l11_4,
            R.id.audio_c1m1l11_5, R.id.audio_c1m1l11_6, R.id.audio_c1m1l11_7, R.id.audio_c1m1l11_8,R.id.audio_c1m1l11_9,
            R.id.audio_c1m1l11_10,R.id.audio_c1m1l11_11,R.id.audio_c1m1l11_12,R.id.audio_c1m1l11_13, R.id.audio_c1m1l11_15,
            R.id.audio_c1m1l11_16,R.id.audio_c1m1l11_17,R.id.audio_c1m1l11_18,R.id.audio_c1m1l11_19,R.id.audio_c1m1l11_20,
            R.id.audio_c1m1l11_21,R.id.audio_c1m1l11_22,R.id.audio_c1m1l11_23,R.id.audio_c1m1l11_24)

        val playerIds = listOf(R.raw.audio_c1m1l11_1, R.raw.audio_c1m1l11_2, R.raw.audio_c1m1l11_3, R.raw.audio_c1m1l11_4,
            R.raw.audio_c1m1l11_5, R.raw.audio_c1m1l11_6, R.raw.audio_c1m1l11_7, R.raw.audio_c1m1l11_8, R.raw.audio_c1m1l11_9,
            R.raw.audio_c1m1l11_10, R.raw.audio_c1m1l11_11, R.raw.audio_c1m1l11_12, R.raw.audio_c1m1l11_13, 
            R.raw.audio_c1m1l11_15, R.raw.audio_c1m1l11_16, R.raw.audio_c1m1l11_17, R.raw.audio_c1m1l11_18, R.raw.audio_c1m1l11_19,
            R.raw.audio_c1m1l11_20, R.raw.audio_c1m1l11_21, R.raw.audio_c1m1l11_22, R.raw.audio_c1m1l11_23, R.raw.audio_c1m1l11_24)

        val scrollView = binding.findViewById<ScrollView>(R.id.fragment_module1_lesson11)
        val position = args.position+1
        binding.setBackgroundResource(R.drawable.linear_layout_radius)

        button.setOnClickListener{
                    val action = Module1Lesson11FragmentDirections.actionModule1Lesson11FragmentToModule1Lesson12Fragment(position)
                    findNavController().navigate(action)
        }

        CreateMusicButton(buttonIds, playerIds, binding, requireContext()).makeButton()

        Saver(position, scrollView, requireContext()).getPoints()
        return binding
    }

}