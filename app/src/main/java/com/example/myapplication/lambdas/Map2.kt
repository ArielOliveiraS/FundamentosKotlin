package com.example.myapplication.lambdas

/*
operacao de map com reduce
 */

class Produto(val nome: String, val preco: Double)

val materialEscolar = listOf(
    Produto("Fichario escolar", 29.19),
    Produto("Lapis ", 1.90),
    Produto("Borracha ", 2.20),
    Produto("Apontador ", 2.80)
)
fun main(args: Array<String>) {

    //funcao lambda em cima da constante totalizar
    //primeiro parametro do reduce funciona com acumulador
    val totalizar = {total: Double, atual: Double -> total + atual}

    //map extrai o preco de cada produto com o it.preco -> lista de double
    //reduce soma todos os valores
    val precoTotal = materialEscolar.map { it.preco }.reduce(totalizar)

    println("O preco total é R$ ${precoTotal / materialEscolar.size}.")
}