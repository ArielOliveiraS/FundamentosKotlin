package com.example.myapplication.funcoes

/*
lista do tipo generico
se a lista for igual ou maior que dois, retorna o segundo indice, senão, retorna null
 */
fun <E> List <E>.secondOrNull(): E? = if (this.size>= 2) this.get(1) else null

fun main(args: Array<String>) {
    val list = listOf("Joao","Maria","Pedro")
    println(list.secondOrNull())
}
