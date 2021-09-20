package com.example.dstesing

import android.content.Context
import android.media.MediaPlayer
import android.widget.Button
import android.widget.Toast
import kotlin.coroutines.coroutineContext

class Music (var button: Button, var audio: MediaPlayer) {

    fun play () {
            audio.setOnCompletionListener {
            button.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_play_arrow,0,0,0)
        }
        if (audio.isPlaying) {
            button.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_play_arrow,0,0,0)
            audio.stop()
            audio.prepare()
        } else {
            audio.start()
            button.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_stop, 0, 0, 0)
        }
    }
}