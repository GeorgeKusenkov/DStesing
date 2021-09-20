package com.example.dstesing

import android.content.Context
import android.media.MediaPlayer
import android.view.View
import android.widget.Button

class CreateMusicButton (private val buttonsId: List<Int>, private val musicId: List<Int>, val binding: View, val context: Context){


    fun makeButton () {

        //Подтягивает список с ID кнопок и Аудиофайлов
        for (i in buttonsId.indices) {
            val bt = binding.findViewById<Button>(buttonsId[i])
            val pl = MediaPlayer.create(context, musicId[i])

        //Воспроизведение аудио и смена иконки при воспроизведении
            bt.setOnClickListener{

                //Когда воспроизведение аудио закончилось иконка меняется на соответствующую
                pl.setOnCompletionListener {
                    bt.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_play_arrow,0,0,0)
                }
                if (pl.isPlaying) {
                    bt.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_play_arrow,0,0,0)
                    pl.stop()
                    pl.prepare()
                } else {
                    pl.start()
                    bt.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_stop, 0, 0, 0)
                }
            }
        }



    }


}