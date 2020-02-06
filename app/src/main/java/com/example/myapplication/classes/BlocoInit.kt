package com.example.myapplication.classes

class Filme3(nome: String, anoLancamento: Int, genero: String){
    val nome: String
    val anoLancamento: Int
    val genero: String

    init {
        this.nome = nome
        this.anoLancamento = anoLancamento
        this.genero = genero
    }
}

fun main(args: Array<String>) {
    val filme= Filme3("Os incriveis", 2001,"Drama")
    println("${filme.nome} foi lancado em ${filme.anoLancamento}")
}
