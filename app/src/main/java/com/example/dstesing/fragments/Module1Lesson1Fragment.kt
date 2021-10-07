package com.example.dstesing.fragments

import android.media.MediaPlayer
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.widget.NestedScrollView
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dstesing.*

class Module1Lesson1Fragment : Fragment() {

    private val args: DetailsFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = inflater.inflate(R.layout.fragment_module1_lesson1, container, false)

        val scrollView = binding.findViewById<NestedScrollView>(R.id.fragment_module1_lesson1)
        val position = args.position+1
        binding.setBackgroundResource(R.drawable.background_gradient)

        val recyclerView = binding.findViewById<RecyclerView>(R.id.lesson1_list_view)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = Adapters(parseLesson(resources,R.xml.basic_module1_lesson1), resources, requireContext())


        Saver(position, scrollView, requireContext()).getPoints()
        return binding
    }


















//    button3.setOnClickListener {
////        Log.d("deda", "BUTTON 4 CLICkED")
////        Log.d("deda", "BUTTON 4 IS PLAY?: ${mp?.isPlaying}")
////        Log.d("deda", "BUTTON 4 MP: ${mp}")
//        if (mp != null) {
//            for (array in audioArray) {
//                array?.pause()
//                array?.reset()
//                array?.release()
//            }
//        }
//        audioArray.clear()
//        mp = null
//        Log.d("deda", "ARRAY IS CLEAR")
//    }

//    button1.setOnClickListener {
//
//        if (mp != null && btnId == 1) {
//            Log.d("deda", "=========================================")
//            Log.d("deda", "STOP BTN1")
//            Log.d("deda", "BTN1 ID = $btnId")
//            button1.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_play_arrow,0,0,0)
//            mp?.stop()
//            mp?.release()
//            mp = null
//        } else if (mp != null && btnId == 2) {
//            Log.d("deda", "=========================================")
//            Log.d("deda", "CLICK BUTTON1")
//            Log.d("deda", "STOP ANOTHER BUTTON")
//            Log.d("deda", "BTN ID = $btnId")
//            button2.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_play_arrow,0,0,0)
//            button1.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_stop,0,0,0)
//            mp?.stop()
//            mp?.release()
//            mp = MediaPlayer.create(context, R.raw.audio_c1m1l11_1)
//            mp?.start()
//            btnId = 1
//        }
//
//
//        else {
//            Log.d("deda", "=========================================")
//            Log.d("deda", "START BTN1")
//            btnId = 1
//            Log.d("deda", "BTN1 ID = $btnId")
//            button1.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_stop, 0, 0, 0)
//            mp = MediaPlayer.create(context, R.raw.audio_c1m1l11_1)
//
////            audioArray.add(mp)
//            mp?.start()
//        }
//
//        mp?.setOnCompletionListener {
//            mp?.pause()
//            mp?.reset()
//            mp?.release()
////            audioArray.clear()
//            mp = null
//        }
//    }
//
//        button2.setOnClickListener {
//
//            if (mp != null && btnId == 2) {
//                Log.d("deda", "=========================================")
//                Log.d("deda", "STOP BTN2")
//                Log.d("deda", "BTN1 ID = $btnId")
////                for (array in audioArray) {
////                    array?.pause()
////                    array?.reset()
////                    array?.release()
////                }
////                audioArray.clear()
//                button2.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_play_arrow,0,0,0)
//                mp?.stop()
//                mp?.release()
//                mp = null
//            } else if (mp != null && btnId == 1) {
//                Log.d("deda", "=========================================")
//                Log.d("deda", "CLICK BUTTON2")
//                Log.d("deda", "STOP ANOTHER BUTTON")
//                Log.d("deda", "BTN ID = $btnId")
//                button1.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_play_arrow,0,0,0)
//                button2.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_stop,0,0,0)
//                mp?.stop()
//                mp?.release()
//                mp = MediaPlayer.create(context, R.raw.audio_c1m1l11_2)
//                mp?.start()
//                btnId = 2
//            } else {
//                Log.d("deda", "=========================================")
//                Log.d("deda", "START BTN2")
//                btnId = 2
//                Log.d("deda", "BTN2 ID = $btnId")
//                button2.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_stop, 0, 0, 0)
//                mp = MediaPlayer.create(context, R.raw.audio_c1m1l11_2)
////                audioArray.add(mp)
//                mp?.start()
//            }
//
//            mp?.setOnCompletionListener {
//                mp?.pause()
//                mp?.reset()
//                mp?.release()
////                audioArray.clear()
//                mp = null
//            }
//        }




//
//
//    button4.setOnClickListener {
//
//        Log.d("deda", "BUTTON 4 CLICkED")
//        Log.d("deda", "BUTTON 4 IS PLAY?: ${mp?.isPlaying}")
//        Log.d("deda", "BUTTON 4 MP: ${mp}")
//        if (mp != null) {
//            for (array in audioArray) {
//                array?.stop()
//                array?.reset()
//                array?.release()
//            }
//        }
//        audioArray.clear()
//    }
//
//    button2.setOnClickListener {
//
//        val mp: MediaPlayer = MediaPlayer.create(context, R.raw.audio_c1m1l11_1)
//        val audioArray = arrayListOf(mp)
//
//        mp = MediaPlayer.create(context, R.raw.audio_c1m1l11_1)
//        audioArray.add(mp)
//        Log.d("deda", "ARRAY: $audioArray")
//        if (mp?.isPlaying == true) {
//            mp?.stop()
//            mp?.release()
//            mp = null
//        }
//
//
//        if (mp?.isPlaying == false) {
//            mp?.start()
//        }
//
////            if (mp != null) {
////                mp?.stop();
////                mp?.release();
////                mp = null;
////            }
////            audioArray.add(mp)
////            Log.d("deda", "ARRAY: $audioArray")
//
////            if (mp != null) {
////                mp?.stop()
////                mp?.prepare()
////            } else {
////                mp?.start()
////            }
//
//
//
//
////            button3.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_play_arrow,0,0,0)
////            if (mp != null && mp?.isPlaying == true) {
////                mp?.stop()
////                mp?.reset()
////                mp?.release()
////                mp = null
////                button2.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_play_arrow,0,0,0)
//////                mp?.stop()
//////                mp?.prepare()
////            } else {
////                mp = MediaPlayer.create(context, R.raw.audio_c1m1l11_1)
////                mp?.start()
////                button2.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_stop, 0, 0, 0)
////
////                mp?.setOnCompletionListener {
////                    mp?.release();
////                    mp = null;
////                    button2.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_play_arrow,0,0,0)
////                }
////
////            }
//    }
//
//    button3.setOnClickListener {
//        mp = MediaPlayer.create(context, R.raw.audio_c1m1l11_2)
//        audioArray.add(mp)
//        Log.d("deda", "ARRAY: $audioArray")
//
//        mp?.start()
////            button2.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_play_arrow,0,0,0)
////            if (mp != null && mp?.isPlaying == true) {
////                mp?.stop()
////                mp?.reset()
////                mp?.release()
////                mp = null
////                button3.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_play_arrow,0,0,0)
//////                mp?.stop()
//////                mp?.prepare()
////            } else {
////                mp = MediaPlayer.create(context, R.raw.audio_c1m1l11_2)
////                mp?.start()
////                button3.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_stop, 0, 0, 0)
////
////                mp?.setOnCompletionListener {
////                    mp?.release();
////                    mp = null;
////                    button3.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_play_arrow,0,0,0)
////                }
////
////            }
//    }
//
////        button2.setOnClickListener {
////
////
////            stopPlaying()
////            mp = MediaPlayer.create(context, R.raw.audio_c1m1l11_1)
////            audioArray.add(mp)
////            Log.d("deda", "ARRAY: $audioArray")
////            mp?.start()
////         }
////
////        button3.setOnClickListener {
////            stopPlaying()
////            mp = MediaPlayer.create(context, R.raw.audio_c1m1l11_2)
////            mp?.start()
////        }
//
//
//
//
//
//
//    button.setOnClickListener{
//        val action = Module1Lesson1FragmentDirections.actionModule1Lesson1FragmentToModule1Lesson2Fragment2(position)
//        findNavController().navigate(action)
//
//    }
//
//
//
//
////        for (i in mas) {
////            val resId = resources.
////        }
//
////        button.setOnClickListener{view: View ->
////            view.findNavController().navigate(R.id.action_module1Lesson1Fragment_to_module1Lesson2Fragment2)
////        }



















//    private fun stopPlaying() {
//        if (mp != null) {
//            mp?.stop();
//            mp?.release();
//            mp = null;
//        }
//    }
//
//    override fun onPause() {
//        super.onPause()
//        mp?.stop()
//    }

}


