package com.example.myapplication.funcoes

//todos os parametros em metodos são constantes e nao se pode reatribuir um valor
fun incremento(num: Int){
  //  num++
}

fun potencia( base: Int =2, expoente: Int =1): Int{
    return Math.pow(base.toDouble(), expoente.toDouble()).toInt()
}

fun main(args: Array<String>) {
    println(potencia(2,3))
    println(potencia(10))
    println(potencia(base = 10))
    println(potencia(expoente = 8))
}