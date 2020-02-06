package com.example.myapplication.fundamentos


fun main(args: Array<String>) {
    val a = 1

    //Numero para String
    println(a.toString()+ 3)

    //String para numero
    println("1.9".toDouble()+ 3)

    //tenta converter para inteiro, caso não consiga, retorna null
    println("teste".toIntOrNull())

    //operador elvil retorna um valor padrão
    println("teste".toIntOrNull() ?: 0)
}