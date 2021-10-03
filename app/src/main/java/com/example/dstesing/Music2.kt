package com.example.dstesing

import android.content.Context
import android.content.res.Resources
import android.media.MediaPlayer
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlin.coroutines.coroutineContext

class Music2(val button: Button, val context: Context, val resources: Resources, val card: String) {

   var audio: MediaPlayer? = null

    var audioList = arrayListOf(audio)

    fun play () {

            Log.d("deda", "АУДИОЛИСТ = $audioList")

            Log.d("deda", "НАЖАТА КНОПКА")
            Log.d("deda", "КНОПКА ID = $audio")
            Log.d("deda", "КНОПКА ИГРАЕТ? = ${audio?.isPlaying}")

            stopPlaying()
            audio = MediaPlayer.create(context, getAudioId(card))
            audioList.add(audio)
            Log.d("deda", "КНОПКА НОВЫЙ ID = $audio")
            Log.d("deda", "\n")
            audio?.start()

            audio?.setOnCompletionListener {
                button.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_play_arrow,0,0,0)
            }

//
//            if (audio!!.isPlaying && audio != null) {
//                audio?.stop()
//                audio?.prepare()
//                audio = null
//                button.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_play_arrow,0,0,0)
//
//            }
//
//            else {
//                audio?.start()
//                button.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_stop, 0, 0, 0)
//            }
//
//
//
//            audio?.setOnCompletionListener {
//                button.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_play_arrow,0,0,0)
//            }


    }
    private fun getAudioId(audioElement: String): Int = resources.getIdentifier(audioElement, "raw", context.packageName)


    private fun stopPlaying() {
//        Log.d("d", "2 Audio Player is $audio")
//        Log.d("d", "2 Audio Player isPlaying ${audio?.isPlaying}")
        if (audio != null) {
            if (audio?.isPlaying == true) {
                audio?.stop()
                audio?.reset()
                audio?.release()
                audio = null
            }
        }

    }


}
