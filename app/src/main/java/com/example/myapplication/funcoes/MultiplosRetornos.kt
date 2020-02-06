package com.example.myapplication.funcoes

import java.lang.reflect.Array.get
import java.util.*
import java.util.Calendar.*

data class Horario(val hora: Int, val minuto: Int, val segundo: Int)

fun agora(): Horario{
    val agora = Calendar.getInstance()
    with(agora){
        return Horario(get(Calendar.HOUR), get(Calendar.MINUTE), get(Calendar.SECOND))
    }
}

fun main(args: Array<String>) {
    val (h,m,s) = agora()
    println("$h : $m : $s")
}