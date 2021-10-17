package com.example.dstesing

import android.content.Context
import android.content.res.Resources
import android.media.MediaPlayer
import android.util.Log
import android.widget.Button

class Music {

    fun play(
        button: Button,
        context: Context,
        Id: Int,
        buttonArray: MutableList<Button>,
        mpArray: MutableList<MediaPlayer>
    ): MediaPlayer {

        if (buttonArray.size >= 2) {
            buttonArray.removeFirst()
        }

        if (mpArray.size >= 2) {
            mpArray.removeFirst()
        }

        mpArray.add(MediaPlayer.create(context, Id))
        buttonArray.add(button)



//        mpArray[1].setOnCompletionListener {
//            buttonArray[0].setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_play_arrow,0,0,0)
//            buttonArray[1].setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_play_arrow,0,0,0)
//        }

        if (mpArray.size == 1 && !mpArray[0].isPlaying) {
            mpArray[0].start()
            button.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_stop, 0, 0, 0)

            mpArray[0].setOnCompletionListener {
                buttonArray[0].setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_play_arrow,0,0,0)
            }

            return mpArray[0]
        } else

            if (mpArray.size == 2 && buttonArray[0] == buttonArray[1]) {
                if (mpArray[0].isPlaying) {
                    button.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_play_arrow,0,0,0)

                    mpArray[0].setOnCompletionListener {
                        buttonArray[0].setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_play_arrow,0,0,0)
                    }

                    mpArray[0].pause()
                    mpArray[0].reset()
                    mpArray[0].release()
                } else if (!mpArray[1].isPlaying) {
                    mpArray[1].setOnCompletionListener {
                        buttonArray[1].setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_play_arrow,0,0,0)
                    }

                    button.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_stop, 0, 0, 0)
                    mpArray[1].start()
                    return mpArray[1]
                }
        }

        if (mpArray.size == 2 && buttonArray[0] != buttonArray[1]) {
            if (mpArray[0].isPlaying) {

                mpArray[1].setOnCompletionListener {
                    buttonArray[1].setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_play_arrow,0,0,0)
                }

                buttonArray[0].setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_play_arrow,0,0,0)
                mpArray[0].pause()
                mpArray[0].reset()
                mpArray[0].release()
                mpArray[1].start()
                buttonArray[1].setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_stop,0,0,0)
                return mpArray[1]
            } else if (!mpArray[0].isPlaying) {
                mpArray[1].setOnCompletionListener {
                    buttonArray[1].setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_play_arrow,0,0,0)
                }

                button.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_stop, 0, 0, 0)
                mpArray[1].start()
                return mpArray[1]
            }
        }

        return MediaPlayer.create(context, Id)
    }
}

