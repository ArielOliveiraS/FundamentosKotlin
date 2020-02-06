package com.example.myapplication.funcoes

class Produto(val nome: String, val preco: Double)

infix fun Produto.maisCAroQue(produto: Produto): Boolean= this.preco > produto.preco

fun main(args: Array<String>) {
    val p1 = Produto("Ipad", 2500.00)
    val p2 = Produto( preco = 3.50, nome = "Borracha")

    //infix esta no meio
    println(p1 maisCAroQue p2)

}