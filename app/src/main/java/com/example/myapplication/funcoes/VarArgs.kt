package com.example.myapplication.funcoes


//ordena os numeros em ordem crescente/ passando 2 parametros
fun ordenar(vararg numeros: Int, a: Int): IntArray{
    println(a)
    return  numeros.sortedArray()
}

fun main(args: Array<String>) {
    for (n in ordenar(3,6,65,7,56,34,2,4, a = 1))
        print("$n")
}