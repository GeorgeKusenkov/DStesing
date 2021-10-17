package com.example.dstesing.fragments

import android.media.MediaPlayer
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import androidx.core.widget.NestedScrollView
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dstesing.*

class Module1Lesson11Fragment : Fragment() {

    private val args: DetailsFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        val binding = inflater.inflate(R.layout.fragment_module1_lesson11, container, false)
        val button = binding.findViewById<Button>(R.id.btn_next_level)
        val scrollView = binding.findViewById<NestedScrollView>(R.id.fragment_module1_lesson11)
        val position = args.position+1
        val recyclerView = binding.findViewById<RecyclerView>(R.id.lesson11_list_view)

        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = Adapters(parseLesson(resources,R.xml.basic_module1_lesson11), resources, requireContext())

        button.setOnClickListener{
                    val action = Module1Lesson11FragmentDirections.actionModule1Lesson11FragmentToModule1Lesson12Fragment(position)
                    findNavController().navigate(action)
        }
        Log.d("BABA", "FRAGMENT Mediaplayer is: ${Adapters.MediaPlayerSingleton.m}")
        Saver(position, scrollView, requireContext()).getPoints()
        return binding
    }

    override fun onPause() {
        super.onPause()
        Log.d("BABA", "=======OnPause======")
        Log.d("BABA", "FRAGMENT on pause Mediaplayer1 is: ${Adapters.MediaPlayerSingleton.m}")

        val mediaPlayer = Adapters.MediaPlayerSingleton.m

        Log.d("BABA", "FRAGMENT on pause Mediaplayer2 is: $mediaPlayer")

        Log.d("BABA", "FRAGMENT MEDIA PLAY?: ${mediaPlayer?.isPlaying}")

        mediaPlayer?.pause()
        mediaPlayer?.reset()
        mediaPlayer?.release()

        Log.d("BABA", "FRAGMENT on pause Mediaplayer3 is: ${Adapters.MediaPlayerSingleton.m}")
    }
}