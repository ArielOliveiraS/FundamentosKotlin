package com.example.myapplication.classes

class Filme2(val nome: String, val anoLanchamento: Int, val genero: String)

fun main(args: Array<String>) {
    val filme = Filme2("Monstros SA",2001,"Comédia")
    println("${filme.nome} foi lancado em ${filme.anoLanchamento} do genero ${filme.genero}")
}