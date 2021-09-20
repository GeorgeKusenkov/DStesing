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

        val buttonIds = listOf(R.id.audio_c1m1l11_1, R.id.audio_c1m1l11_2, R.id.audio_c1m1l11_3, R.id.audio_c1m1l11_4)
        val playerIds = listOf(R.raw.audio_c1m1l11_1, R.raw.audio_c1m1l11_2, R.raw.audio_c1m1l11_3, R.raw.audio_c1m1l11_4)
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