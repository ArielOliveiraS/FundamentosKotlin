package com.example.myapplication.colecoes

fun main(args: Array<String>) {
    val numeros= Array<Int>(10){i -> i * 10}

    for (numero in numeros){
        println(numero)
    }
    println(numeros.get(1))
    println(numeros[2])
    println(numeros.size)
    numeros.set(1,1234)
    println(numeros[1])
}