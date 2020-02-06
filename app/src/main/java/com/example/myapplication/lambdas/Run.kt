package com.example.myapplication.lambdas

data class Casa(var endereco: String ="", var num: Int = 0)

fun main(args: Array<String>) {
    var casa = Casa()

    casa.run {
        endereco = "Rua abc"
        num = 1554
    }
    println(casa)
}