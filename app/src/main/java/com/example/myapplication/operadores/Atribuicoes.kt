package com.example.myapplication.operadores

fun main(args: Array<String>) {
    val executouTrabalo1: Boolean = true
    val executouTrabalo2: Boolean = true

    val comprouSorvete: Boolean = executouTrabalo1 || executouTrabalo2
    val comprouTv50: Boolean = executouTrabalo2 && executouTrabalo1

    // &&: e / || : ou
    //xor : ou exlusivo
    val comprouTv32: Boolean = executouTrabalo1 xor executouTrabalo2

    println(comprouSorvete)
    println(comprouTv50)
    println(comprouTv32)

    // ! operador unário
    if (!comprouSorvete)
        println("A saude agradece")



}