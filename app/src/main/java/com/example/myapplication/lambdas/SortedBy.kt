package com.example.myapplication.lambdas

fun main(args: Array<String>) {
    val nomes = arrayListOf("Renata", "Jessica", "Sara", "Glayce", "Andressa")

    /*
    it -> item da lista, acessa cada um dos elementos e organiza
    {it.reversed()} inverte o nome e faz a ordenacao -> ordena pela ultima letra
     */
    val ordenados = nomes.sortedBy { it }
    println(ordenados)
}