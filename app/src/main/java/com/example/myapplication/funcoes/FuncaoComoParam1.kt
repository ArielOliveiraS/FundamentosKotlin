package com.example.myapplication.funcoes

class Operacoes{
    fun somar(a: Int, b: Int): Int{
        return a + b
    }
}

fun somar(a: Int, b: Int): Int{
    return a + b
}

fun calc(a: Int, b:Int, funcao: (Int, Int) -> Int): Int{
    return funcao(a,b)
}

fun main(args: Array<String>) {
    //para chamar uma funcao dentro da classe
    println(calc(2,3,Operacoes()::somar))

    //para chamar uma funcao topLevel
    println(calc(2,3,:: somar))
}