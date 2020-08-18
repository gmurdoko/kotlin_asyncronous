package com.example.exercise_one

fun main() {
    println("Start")
    val customThread = CustomThread()
    customThread.start()
    for(i in 1..20){
        Thread.sleep(1000)
        println("${Thread.currentThread().name} $i")
    }
    println("Stop")
}

class CustomThread: Thread(){
    override fun run(){
        for (i in 1..20){
            sleep(2000)
            println("${Thread.currentThread().name} $i")
        }
    }
}