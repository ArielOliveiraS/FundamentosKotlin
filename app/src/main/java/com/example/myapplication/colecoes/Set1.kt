package com.example.myapplication.colecoes

fun Any.print() = println(this)

fun main(args: Array<String>) {
    val conjunto = hashSetOf(3,'a', "texto", 3.14)

    conjunto.add(2).print()
    conjunto.print()

    conjunto.remove('a').print()
    conjunto.print()

    conjunto.contains('a').print()
    conjunto.contains("texto").print()

    val nums = setOf(1, 4, 3) // somente leitura

    (conjunto + nums).print()

    //elimina o que tem de igual nos dois conjuntos, subtrai
    (conjunto - nums).print()

    // imprime apenas o que tem de igual nos dois conjuntos / nao altera o conjunto, somente nums
    conjunto.intersect(nums).print()
    conjunto.print()

    //limpa o conjunto
    conjunto.clear()

    //se o conjunto está vazio
    conjunto.isEmpty().print()




}