package com.example.dstesing

object ModuleStorage {
    fun getKoalaList(): Array<Module> {
        return arrayOf(
            Module(
                "Module #1",
                "This is Module #1",
                R.drawable.coala
            ),

            Module(
                "Module #2",
                "This is Module #2",
                R.drawable.coala2
            ),

            Module(
                "Module #3",
                "This is Module #3",
                R.drawable.coala3
            ),

            Module(
                "Module #4",
                "This is Module #4",
                R.drawable.coala4
            ),

            Module(
                "Module #5",
                "This is Module #5",
                R.drawable.coala5
            )
        )
    }
}