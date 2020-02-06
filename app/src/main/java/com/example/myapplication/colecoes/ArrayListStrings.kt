package com.example.myapplication.colecoes

fun main(args: Array<String>) {
    val strings = arrayListOf("Carro", "Moto", "Barco", "Avião")

    for (item in strings)
        //toUpperCasa converte para maiusculo
        println(item.toUpperCase())
}