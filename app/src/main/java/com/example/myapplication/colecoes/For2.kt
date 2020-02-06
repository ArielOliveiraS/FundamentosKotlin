package com.example.myapplication.colecoes

fun main(args: Array<String>) {
    val alunos = arrayListOf("Amanda", "André", "Bernardo", "Carlos")

    //funcao forEach recebe um lambda que será chamado para cada um dos itens
    alunos.forEach { println(it)}
}