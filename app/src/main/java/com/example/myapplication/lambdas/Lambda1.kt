package com.example.myapplication.lambdas


//lambda sempre retorna a ultima sentenca
fun main(args: Array<String>) {
    val soma = { x: Int, y: Int -> x+y }
    println(soma(4,6))
}