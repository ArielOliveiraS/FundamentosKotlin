package com.example.myapplication.lambdas

/*
let-> Retorna qualquer valor a partir de um objeto do qual o escopo se originou e refere-se a esse objeto como it.
 */

fun main(args: Array<String>) {
    val listWithNulls: List<String?> = listOf("A", null, "B", null, "C", null)

    for (item in listWithNulls){

        //se o item for diferente de null, cai em let e printa o item
        item?.let{ println(it)
        }
        //    ?: run {  }
    }
}