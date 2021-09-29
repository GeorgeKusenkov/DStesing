package com.example.dstesing

import android.os.Build
import org.junit.Test

import org.junit.Assert.*
import org.w3c.dom.Element

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
        parseListOfLessons()
    }

    private fun parseListOfLessons()  {
//    val cardList = ArrayList<Card>()
//    var arrayCards = ArrayList()

        val lessonsMap = mapOf("this is lesson 1" to 1, "this is lesson 2" to 2, "this is lesson 3" to 3, "this is lesson 4" to 1)

        val arrayList = lessonsMap.values
        val arrayList2 = ArrayList<Int>()
        println("1000000000000000000000000")


            lessonsMap.forEach { (text, id) ->
                when (id) {
                    1 -> println(text)
                    2 -> println(text)
                    else -> println(text)
                }
            }



//            arrayList.forEach { i ->
//                when (i) {
//                    1 -> println("ODIN")
//                    2 -> println("DVA")
//                    else -> println("SUKA")
//                }
//            }



//    when(lessonsMap.values) {
//        1 -> Card.Text(lessonsMap.key)
//    }



//    for (i in lessonsMap.values) {
//        arrayCards = lessonsMap.values
//    }

    }

}