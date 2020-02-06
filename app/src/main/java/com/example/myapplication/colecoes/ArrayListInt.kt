package com.example.myapplication.colecoes

fun main(args: Array<String>) {
    val pares = arrayListOf(2,4,6)

    //dentro do intArray tem o metodo union que une duas listas
    val impares = intArrayOf(1,3,5)

    //union uni os arrays de impares e pares e o sorted os organiza em ordem crescente
    for (n in impares.union(pares).sorted()){
        println("$n")
    }
}