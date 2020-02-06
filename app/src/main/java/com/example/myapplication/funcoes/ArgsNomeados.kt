package com.example.myapplication.funcoes

fun relacaoDeTrabalho(chefe: String, funcionario: String): String {
    return "$funcionario é subordinado a $chefe"
}

fun main(args: Array<String>) {
    println(relacaoDeTrabalho("Jessica", "João"))
    println(relacaoDeTrabalho(funcionario = "Joao", chefe ="Jessica" ))
}