package com.example.dstesing

import android.content.res.Resources
import android.util.Log
import org.xmlpull.v1.XmlPullParser
import java.lang.IllegalArgumentException
import kotlin.math.log


sealed class Card {

    class Tag (val tagText:String) : Card() {

    }

    class Text (val lessonText:String) : Card() {

    }

}

fun parseTag (xmlPullParser: XmlPullParser): Card.Tag {

    var text: String? = null

    repeat(xmlPullParser.attributeCount) {
        when(xmlPullParser.getAttributeName(it)) {
            "text" -> text = xmlPullParser.getAttributeValue(it)

        }
    }
    return Card.Tag(text!!)
}


fun parseLesson(res:Resources, lessonID: Int): List<Card> {
    val xpp = res.getXml(lessonID)

    var eventType: Int = xpp.eventType

    check(eventType == XmlPullParser.START_DOCUMENT)

    Log.d("d", "Парсер 1 = ${xpp.name}")

    while (xpp.next() != XmlPullParser.START_TAG){

    }
    check(xpp.name == "Lesson")

    val cardList = ArrayList<Card> ()

    eventType = xpp.next()
    while (eventType != XmlPullParser.END_DOCUMENT) {
        when (eventType) {
            XmlPullParser.START_TAG -> {
                cardList += when(xpp.name) {
                    "Tag" -> parseTag(xpp)
                    "Text" -> parseTag(xpp)
                    else -> throw IllegalArgumentException ("Bad Tag ${xpp.name}")
                }
                Log.d("d", "Парсер 2 = ${xpp.name}")
            }

            XmlPullParser.TEXT -> {
                throw IllegalArgumentException ("Bad text")
            }
        }

        eventType = xpp.next()
    }
    Log.d("d", "Парсер 3 = $cardList")
    return cardList
}


