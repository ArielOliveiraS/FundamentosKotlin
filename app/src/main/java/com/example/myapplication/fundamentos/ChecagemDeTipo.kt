package com.example.myapplication.fundamentos

fun main(args: Array<String>) {

    //Any tipo mais generico
    val valor: Any = 123

    if (valor is String){
        println(valor)
    }else{
        println("Não é uma String")
    }
}