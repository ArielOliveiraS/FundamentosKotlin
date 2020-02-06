package com.example.myapplication.lambdas

fun main(args: Array<String>) {
    println("Digite uma mensagem")

    val entrada = readLine()

    //se houver msg ele a retorna, se nao, retorna a mensagem padrao / .trim() elimina espacos vazios
    val mensagem = entrada.takeIf { it?.trim() != "" } ?: "Sem mensagem"

    println(mensagem)
}