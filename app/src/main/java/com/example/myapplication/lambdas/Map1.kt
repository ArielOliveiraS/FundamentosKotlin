package com.example.myapplication.lambdas

fun main(args: Array<String>) {
    val alunos = arrayListOf("Pedro", "Thiago", "Jonas")


    /*
    retorna o item it da lista com todas as letras maiusculas
    apply recupera o novo array e imprime no console
     */
    alunos.map{it.toUpperCase()}.apply { print(this) }
}