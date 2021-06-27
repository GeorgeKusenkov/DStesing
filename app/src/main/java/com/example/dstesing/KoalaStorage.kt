package com.example.dstesing

object KoalaStorage {
    fun getKoalaList(): Array<Koala> {
        return arrayOf(
            Koala(
                "Koala #1",
                "This is Koala #1",
                R.drawable.coala
            ),

            Koala(
                "Koala #2",
                "This is Koala #2",
                R.drawable.coala2
            ),

            Koala(
                "Koala #3",
                "This is Koala #3",
                R.drawable.coala3
            ),

            Koala(
                "Koala #4",
                "This is Koala #4",
                R.drawable.coala4
            ),

            Koala(
                "Koala #5",
                "This is Koala #5",
                R.drawable.coala5
            )
        )
    }
}