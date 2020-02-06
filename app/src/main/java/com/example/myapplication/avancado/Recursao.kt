package com.example.myapplication.avancado

import java.lang.IllegalArgumentException

//6! -> 6 fatorial == 6*5*4*3*2*1 ==720

//sempre que entrar no when, deve retornar um valor -> else
fun fatorial(num: Int): Int = when(num){

    //se o num estiver entre 0 e 1, retorna o valor 1
    in 0..1 -> 1

    //se estiver entre 2 e o maximo dos numeros inteiros: retorna num * fatorial -1 -> num 5 = 5 * 4 * 3...
    in 2..Int.MAX_VALUE -> num * fatorial(num -1)

    //se nenhum dos casos, significa que é negativo e nao existe fatorial de negativo
    else -> throw IllegalArgumentException("Numero negativo")
}

fun main(args: Array<String>) {
    println("Resultado: ${fatorial(6)}")
}