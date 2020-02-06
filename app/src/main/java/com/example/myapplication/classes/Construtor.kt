package com.example.myapplication.classes

class Filme{
    val nome: String
    val anoLancamento: Int
    val genero: String

    constructor(nome: String, anoLancamento: Int, genero: String){
        this.nome = nome
        this.anoLancamento = anoLancamento
        this.genero = genero
    }

}

fun main(args: Array<String>) {
    val filme = Filme("O poderoso chefao", 1972, "Drama")
    println("${filme.nome} foi lancado em ${filme.anoLancamento}")
}