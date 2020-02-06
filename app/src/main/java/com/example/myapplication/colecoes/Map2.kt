package com.example.myapplication.colecoes

fun main(args: Array<String>) {
    val map = hashMapOf(1 to "Gui", 2 to "Receba", 3 to "Ariel")

    for ((id, nome) in map){
        println("$id - $nome")
    }
}