package com.example.dstesing

import android.content.res.Resources
import android.content.res.XmlResourceParser
import android.os.Build
import android.text.Html
import android.util.Log
import android.widget.Toast
import org.xmlpull.v1.XmlPullParser
import java.lang.IllegalArgumentException
import kotlin.math.log


sealed class Card {
    class Tag (val tagText:String) : Card()
    class Text (val lessonText:String) : Card()
    class Title (val title:String) : Card()
    class Image(val image:String) : Card()
    class AudioButton (val audioButton:String) : Card()
    class LukaDialogBox (val lukaText:String) : Card()
    class VaryDialogBox (val varyText:String) : Card()
    class ValyDialogBox (val valyText:String) : Card()
    class KabikariDialogBox (val kabikariText:String) : Card()
    class JarraDialogBox (val jarraText:String) : Card()
    class JackDialogBox(val jackText:String) : Card()

}

fun parseLesson(res:Resources, lessonID: Int): List<Card> {
    val xpp = res.getXml(lessonID)
    var eventType: Int = xpp.eventType
    val cardList = ArrayList<Card>()

    check(eventType == XmlPullParser.START_DOCUMENT)

    while (xpp.next() != XmlPullParser.START_TAG) {

    }

    check(xpp.name == "Lesson")

    eventType = xpp.next()
    while (eventType != XmlPullParser.END_DOCUMENT) {
        when (eventType) {
            XmlPullParser.START_TAG -> {
                cardList += when (xpp.name) {
                    "Tag" -> parseTag(xpp)
                    "Text" -> parseText(xpp)
                    "Title" -> parseTitle(xpp)
                    "Image" -> parseImage(xpp)
                    "AudioButton" -> parseAudioButton(xpp)
                    "DialogLuka" -> parseLukaDialogBox(xpp)
                    "DialogVary" -> parseVaryDialogBox(xpp)
                    "DialogValy" -> parseValyDialogBox(xpp)
                    "DialogKabikari" -> parseKabikariDialogBox(xpp)
                    "DialogJarra" -> parseJarraDialogBox(xpp)
                    "DialogJack" -> parseJackDialogBox(xpp)
                    else -> throw IllegalArgumentException("Bad Tag ${xpp.name}")
                }
            }
            XmlPullParser.TEXT -> {
                Card.Text(xpp.text)
            }
        }
        eventType = xpp.next()
    }
    return cardList
}

private fun parseTag (xpp: XmlPullParser): Card.Tag {
    xpp.next()
    return Card.Tag(xpp.text!!)
}

fun parseText (xpp: XmlPullParser): Card.Text {
    xpp.next()
    return Card.Text(xpp.text)
}

fun parseTitle (xpp: XmlPullParser): Card.Title {
    xpp.next()
    return Card.Title(xpp.text)
}

fun parseImage(xpp: XmlResourceParser): Card.Image {
    xpp.next()
    return Card.Image(xpp.text)
}

fun parseAudioButton(xpp: XmlResourceParser): Card.AudioButton {
    xpp.next()
    return Card.AudioButton(xpp.text)
}

fun parseLukaDialogBox (xpp: XmlPullParser): Card.LukaDialogBox {
    xpp.next()
    return Card.LukaDialogBox(xpp.text)
}

fun parseValyDialogBox(xpp: XmlResourceParser): Card.ValyDialogBox {
    xpp.next()
    return Card.ValyDialogBox(xpp.text)
}

fun parseVaryDialogBox(xpp: XmlResourceParser): Card.VaryDialogBox {
    xpp.next()
    return Card.VaryDialogBox(xpp.text)
}

fun parseJarraDialogBox(xpp: XmlResourceParser): Card.JarraDialogBox {
    xpp.next()
    return Card.JarraDialogBox(xpp.text)
}

fun parseKabikariDialogBox(xpp: XmlResourceParser): Card.KabikariDialogBox {
    xpp.next()
    return Card.KabikariDialogBox(xpp.text)
}

fun parseJackDialogBox(xpp: XmlResourceParser): Card.JackDialogBox {
    xpp.next()
    return Card.JackDialogBox(xpp.text)
}






////Чтение данных атрибута
//fun parseLukaDialogBox (xmlPullParser: XmlPullParser): Card.LukaDialogBox {
//
//    var text: String? = null
//
//    repeat(xmlPullParser.attributeCount) {
//        when(xmlPullParser.getAttributeName(it)) {
//            "text" -> text = xmlPullParser.getAttributeValue(it)
//        }
//    }
//    return Card.LukaDialogBox(text!!)
//}



//fun parseListTag (xmlPullParser: Int): Card.Tag {
//
//    var text: String? = null
//
//    repeat(xmlPullParser.attributeCount) {
//        when(xmlPullParser.getAttributeName(it)) {
//            "text" -> text = xmlPullParser.getAttributeValue(it)
//
//        }
//    }
//    return Card.Tag(text!!)
//}

////Чтение данных из массива
//fun parseListOfLessons(): List<Card> {
//    val cardList = ArrayList<Card>()
//    val lessonsMap = mapOf("this is lesson 1" to 1, "this is lesson 2" to 2, "this is lesson 3" to 3, "this is lesson 4" to 1)
//
//    lessonsMap.forEach { (text, id) ->
//        when (id) {
//            1 -> cardList+=Card.Text(text)
//            2 -> cardList+=Card.Tag(text)
//            3 -> cardList+=Card.LukaDialogBox(text)
//            else -> throw IllegalArgumentException("Отсутсвует ID")
//        }
//    }
//    return cardList
//}






