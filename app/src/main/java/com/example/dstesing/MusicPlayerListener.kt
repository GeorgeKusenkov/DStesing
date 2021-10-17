package com.example.dstesing

import android.media.MediaPlayer
import android.util.Log

//Реализовать передачу ссылки, играющего медиаплеера через интерфейс.
//
interface MusicPlayerListener {
    fun onMusicPlay(mediaPlayer: MediaPlayer)
}