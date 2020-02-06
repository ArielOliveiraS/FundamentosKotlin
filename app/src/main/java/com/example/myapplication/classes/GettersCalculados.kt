package com.example.myapplication.classes

class Produto(var nome: String, var preco: Double, var desconto: Double, var ativo: Boolean){
        val inativo: Boolean get() = !ativo
        val precoComDesconto: Double get() = preco* (1- desconto)
}

fun main(args: Array<String>) {
    val p1 = Produto("ipad", 1000.00, 0.20, ativo = false)
    println(p1.precoComDesconto)

    val p2 = Produto("Galaxy", 2000.00, 0.50, ativo = false)
    println("${p2.nome}\n\tDe: R$ ${p2.preco} \n\tPor: R$ ${p2.precoComDesconto}")

    if (p2.inativo){
        p2.preco = 0.0
        println("Depois de inativo: R$ ${p2.precoComDesconto}")
    }

}