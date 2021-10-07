package com.example.dstesing

import android.content.Context
import android.content.res.Resources
import android.media.MediaPlayer
import android.service.autofill.OnClickAction
import android.text.Html
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.lang.IllegalArgumentException


class Adapters(private val cards: List<Card>, val resources: Resources, val context: Context) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var mp: MediaPlayer = MediaPlayer()
    private var buttonArray = mutableListOf<Button>()
    private var mpArray = mutableListOf<MediaPlayer>()

    override fun getItemViewType(position: Int): Int = when(cards[position]) {
        is Card.Tag -> 1
        is Card.Text -> 2
        is Card.Title -> 3
        is Card.LukaDialogBox -> 4
        is Card.VaryDialogBox -> 5
        is Card.ValyDialogBox -> 6
        is Card.KabikariDialogBox -> 7
        is Card.JarraDialogBox -> 8
        is Card.JackDialogBox -> 9
        is Card.Image -> 10
        is Card.AudioButton -> 11
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return object : RecyclerView.ViewHolder(
            when(viewType) {
                1 -> LayoutInflater.from(parent.context).inflate(R.layout.in_lesson_tag, parent, false)
                2 -> LayoutInflater.from(parent.context).inflate(R.layout.in_lesson_text, parent, false)
                3 -> LayoutInflater.from(parent.context).inflate(R.layout.in_lesson_title, parent, false)
                4 -> LayoutInflater.from(parent.context).inflate(R.layout.dialog_box_luka_card, parent, false)
                5 -> LayoutInflater.from(parent.context).inflate(R.layout.dialog_box_vary_card, parent, false)
                6 -> LayoutInflater.from(parent.context).inflate(R.layout.dialog_box_valy_card, parent, false)
                7 -> LayoutInflater.from(parent.context).inflate(R.layout.dialog_box_kabikari_card, parent, false)
                8 -> LayoutInflater.from(parent.context).inflate(R.layout.dialog_box_jarra_card, parent, false)
                9 -> LayoutInflater.from(parent.context).inflate(R.layout.dialog_box_jack_card, parent, false)
                10 -> LayoutInflater.from(parent.context).inflate(R.layout.in_lesson_image, parent, false)
                11 -> LayoutInflater.from(parent.context).inflate(R.layout.in_lesson_audio_button, parent, false)
                else -> throw IllegalArgumentException("Error")
            }) {
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        when(val card = cards[position]) {
            is Card.Tag -> holder.itemView.findViewById<TextView>(R.id.in_lesson_tag).text = Html.fromHtml(card.tagText)
            is Card.Text -> holder.itemView.findViewById<TextView>(R.id.in_lesson_text).text = Html.fromHtml(card.lessonText)
            is Card.Title -> holder.itemView.findViewById<TextView>(R.id.in_lesson_title).text = Html.fromHtml(card.title)
            is Card.LukaDialogBox -> holder.itemView.findViewById<TextView>(R.id.luka_text).text = Html.fromHtml(card.lukaText)
            is Card.VaryDialogBox -> holder.itemView.findViewById<TextView>(R.id.vary_text).text = Html.fromHtml(card.varyText)
            is Card.ValyDialogBox -> holder.itemView.findViewById<TextView>(R.id.valy_text).text = Html.fromHtml(card.valyText)
            is Card.KabikariDialogBox -> holder.itemView.findViewById<TextView>(R.id.kabikari_text).text = Html.fromHtml(card.kabikariText)
            is Card.JarraDialogBox -> holder.itemView.findViewById<TextView>(R.id.jarra_text).text = Html.fromHtml(card.jarraText)
            is Card.JackDialogBox -> holder.itemView.findViewById<TextView>(R.id.jack_text).text =  Html.fromHtml(card.jackText)
            is Card.Image -> holder.itemView.findViewById<ImageView>(R.id.in_lesson_image).setImageResource(getImageId(card.image))
            is Card.AudioButton -> {

//              ВЫНЕСТИ В ОТДЕЛЬНЫЙ КЛАСС. Проигрыватель создает новые потоки, которые я не могу поймать. ПОэтому пришлось вынести всё сюда.
                val button = holder.itemView.findViewById<Button>(R.id.in_lesson_audio_button)


                button.setOnClickListener {
                    Log.d("deda", "===========КНОПКА НАЖАТА==========")
                    Log.d("deda", "ID: $button")
                    Music(button, context, resources, getAudioId(card.audioButton), mp, buttonArray, mpArray).play()
//                    StopPlayMusic(button, context, getAudioId(card.audioButton), mp, buttonArray, mpArray)

                }
//                button.setOnClickListener {
//
//                    if (buttonArray.size >= 2) {
//                        buttonArray.removeFirst()
//                    }
////                    MediaPlayer.create(context, getAudioId(card.audioButton))
//                    buttonArray.add(button)
//
//
//                    // Если:
//                    // 1. Аудио играет
//                    // 2. Нажата текущая кнопка
//                    // 3. Останавливаем аудио, меняем иконку
//                    if (mp != null && buttonArray[0] == buttonArray[1]) {
//                        buttonArray[0].setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_play_arrow,0,0,0)
//                        mp?.pause()
//                        Log.d("deda", "PAUSED 2")
////                        mp?.prepare()
//                        mp?.reset()
//                        mp?.release()
//                        mp = null
//
//                    // Если:
//                    // 1. Аудио играет
//                    // 2. Нажата другая кнопка
//                    // 3. Меняем иконку у предыдущей кнопки на паузу
//                    // 4. Меняем иконку у текущей кнопки на воспроизведение
//                    }
//                    else if (mp != null && buttonArray[0] != buttonArray[1]) {
//                        Log.d("deda", "================")
//                        Log.d("deda", "MP3 IS ${mp}")
//                        buttonArray[0].setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_play_arrow,0,0,0)
//                        buttonArray[1].setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_stop,0,0,0)
//                        mp?.pause()
////                        Log.d("deda", "PAUSED3")
//                        mp?.reset()
//                        mp?.release()
//                        mp = null
//                        mp = MediaPlayer.create(context, getAudioId(card.audioButton))
//                        mp?.start()
//                        Log.d("deda", "START3")
//
//                    }
//
//                    // Если:
//                    // 1. Аудио не играет
//                    // 2. Нажата другая кнопка
//                    // 3. Меняем иконку у предыдущей кнопки на паузу
//                    // 4. Меняем иконку у текущей кнопки на воспроизведение
//                    //    Иначе иконка поменяется у предыдущей кнопки
//                    else if (mp == null && buttonArray.size == 2 && buttonArray[0] != buttonArray[1] ) {
//                        Log.d("deda", "${mp?.isPlaying == false}")
//                        buttonArray[1].setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_stop, 0, 0, 0)
//                        mp = MediaPlayer.create(context, getAudioId(card.audioButton))
//                        mp?.start()
//                        Log.d("deda", "START5")
//
//                    }
//
//                    // Если аудио не играет.
//                    // 1. Воспроизводим звук
//                    // 2. Меняем иконку
//                    else {
//                        Log.d("deda", "================")
//                        Log.d("deda", "MP IS ${mp}")
//                        buttonArray[0].setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_stop, 0, 0, 0)
//                        mp = MediaPlayer.create(context, getAudioId(card.audioButton))
//                        mp?.start()
//                        Log.d("deda", "START1")
//                    }
//
//                    mp?.setOnCompletionListener {
////                        mp?.pause()
//                        mp?.reset()
//                        mp?.release()
//                        mp = null
//                        if (buttonArray.size == 1) {
//                            buttonArray[0].setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_play_arrow,0,0,0)
//                        } else buttonArray[1].setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_play_arrow,0,0,0)
//
//                    }
////                        stopPlaying(button)
////                        player = MediaPlayer.create(context, getAudioId(card.audioButton))
////                        player?.start()
//                }



            }
        }
    }

//    private fun stopPlaying(button: Button) {
//            if (player != null) {
//                if (player?.isPlaying == true) {
//                    button.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_play_arrow,0,0,0)
//                    player?.stop()
//                    player?.reset()
//                    player?.release()
//                    player = null
//                } else {
//                    button.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_stop, 0, 0, 0)
//                }
//            }
//
//
//    }

    override fun getItemCount() = cards.size

    private fun getImageId(imageElement: String): Int = resources.getIdentifier(imageElement, "drawable", context.packageName)

    private fun getAudioId(audioElement: String): Int = resources.getIdentifier(audioElement, "raw", context.packageName)

//    fun checkHtml(text: String) {
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
//            Html.fromHtml(text, Html.FROM_HTML_MODE_COMPACT)
//        } else {
//            Html.fromHtml(text)
//        }
//    }
}
