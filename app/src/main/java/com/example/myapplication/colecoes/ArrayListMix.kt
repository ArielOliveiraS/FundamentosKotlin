package com.example.myapplication.colecoes

fun main(args: Array<String>) {
    val listaMix = arrayListOf("Rafael", true , 1, 2.14, 'p')

    for (item in listaMix){
        if (item is String){ //smart cast -> para percorrer uma lista que vc nao sabe o tipo?
            println(item.toUpperCase())
        }
    }
}

