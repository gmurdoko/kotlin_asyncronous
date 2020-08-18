package com.example.exercise_one

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main()= runBlocking {
    println("Start")

    GlobalScope.launch {
        for (i in 1..30){
            delay(1000)
            println("$this $i")
        }

    }
    GlobalScope.launch {
        for (i in 1..30){
            delay(1000)
            println("$this $i")
        }
    }
    println("Stop")
    delay(3000)
}

