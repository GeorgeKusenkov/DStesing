package com.example.dstesing

import android.content.Context
import android.content.res.Resources
import android.media.MediaPlayer
import android.util.Log
import android.widget.Button

class Music(var button: Button, val context: Context, val resources: Resources, val Id: Int, var mp: MediaPlayer, var buttonArray: MutableList<Button>, val mpArray: MutableList<MediaPlayer>) {

    fun pause() {
        if (mp.isPlaying) {
            mp.stop()
            mp.release()
        }
    }
    fun play() {
        mp = MediaPlayer.create(context, Id)

        if (buttonArray.size >= 2) {
            buttonArray.removeFirst()
        }

        if (mpArray.size >= 2) {
            mpArray.removeFirst()
        }

        mpArray.add(mp)
        buttonArray.add(button)

        if (mpArray.size == 1 && !mpArray[0].isPlaying) {
            mpArray[0].start()
        } else if (mpArray.size == 2 && buttonArray[0] == buttonArray[1]) {
            if (mpArray[0].isPlaying) {
                mpArray[0].pause()
                mpArray[0].reset()
                mpArray[0].release()
            } else if (!mpArray[1].isPlaying) {
                mpArray[1].start()
            }
        }

        if (mpArray.size == 2 && buttonArray[0] != buttonArray[1]) {
            if (mpArray[0].isPlaying) {
                mpArray[0].pause()
                mpArray[0].reset()
                mpArray[0].release()
                mpArray[1].start()
            } else if (!mpArray[0].isPlaying) {
                mpArray[1].start()
            }
        }
    }
}
//    fun play () {
//        mp = MediaPlayer.create(context, card)
//
//
//        Log.d("deda", "Плеер: $mp")
//        if (buttonArray.size >= 2) {
//            buttonArray.removeFirst()
//        }
//
//        if (mpArray.size >= 2) {
//            mpArray.removeFirst()
//        }
//
//        Log.d("deda", "Добавление плеера в массив")
//        mpArray.add(mp)
//        Log.d("deda", "Массив плеера: $mpArray")
//
//        Log.d("deda", "Добавление кнопки в массив")
//        buttonArray.add(button)
//        Log.d("deda", "Массив кнопок: ${buttonArray}")
//
//        if (mpArray.size == 1) {
//            if (!mpArray[0].isPlaying) {
//                Log.d("deda", "===========УСЛОВИЕ 1-1==========")
//                Log.d("deda", "Плеер не играет. Кнопка нажата в первый раз")
//                Log.d("deda", "Массив плеера: $mpArray")
//                Log.d("deda", "Плеер СТАРТ mpArray[0]: ${mpArray[0]}")
//                mpArray[0].start()
//            }
//        }
//
//        else if (mpArray.size == 2 && buttonArray[0] == buttonArray[1]) {
//            Log.d("deda", "Массив равен 2")
//
//            if (mpArray[0].isPlaying) {
//                Log.d("deda", "===========УСЛОВИЕ 2==========")
//                Log.d("deda", "Плеер играет, нажата текущая кнопка")
//                Log.d("deda", "Плеер: $mp")
//                mpArray[0].pause()
//                mpArray[0].reset()
//                mpArray[0].release()
//            } else if (!mpArray[1].isPlaying ) {
//                Log.d("deda", "===========УСЛОВИЕ 1-2==========")
//                Log.d("deda", "Плеер не играет")
//                Log.d("deda", "Массив плеера: $mpArray")
//                mpArray[1].start()
//                Log.d("deda", "Плеер СТАРТ mpArray[1]: ${mpArray[1]}")
//            }
//        }
//
//        if (mpArray.size == 2 && buttonArray[0] != buttonArray[1]) {
//            if (mpArray[0].isPlaying) {
//                Log.d("deda", "===========УСЛОВИЕ 3==========")
//                Log.d("deda", "Плеер играет, нажата другая кнопка")
//                Log.d("deda", "Плеер: ${mpArray[0]}")
//                mpArray[0].pause()
//                mpArray[0].reset()
//                mpArray[0].release()
//                Log.d("deda", "Предыдущая кнопка ${mpArray[0]} остановилась")
//                mpArray[1].start()
//                Log.d("deda", "Другая кнопка ${mpArray[1]} играет")
//            } else if (!mpArray[0].isPlaying) {
//                Log.d("deda", "===========УСЛОВИЕ 4==========")
//                Log.d("deda", "Плеер не играет, нажата другая кнопка")
//                Log.d("deda", "Плеер: ${mpArray[0]}")
//                mpArray[1].start()
//            }
//        }
//    }

























//            audio.setOnCompletionListener {
//            button.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_play_arrow,0,0,0)
//        }
//        if (audio.isPlaying) {
//            button.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_play_arrow,0,0,0)
//            audio.stop()
//            audio.prepare()
//        } else {
//            audio.start()
//            button.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_stop, 0, 0, 0)
//        }

//
//    fun StopPlay(){
//        Log.d("BABA", "Music: ")
//        mp = MediaPlayer.create(context, Id)
//
//        if (mp.isPlaying) {
//            mp.stop()
//            Log.d("BABA", "Music STOP!")
//        }
//
//    }



//class StopPlayMusic() {
//
//    lateinit var button: Button
//    lateinit var context: Context
//    var card: Int = 0
//    lateinit var mp: MediaPlayer
//    lateinit var buttonArray: MutableList<Button>
//    lateinit var mpArray: MutableList<MediaPlayer>
//
//    constructor(button: Button, context: Context, card: Int, mp: MediaPlayer, buttonArray: MutableList<Button>, mpArray: MutableList<MediaPlayer>) : this() {
//        this.button = button
//        this.context = context
//        this.card = card
//        this.mp = mp
//        this.buttonArray = buttonArray
//        this.mpArray = mpArray
//    }
//}

