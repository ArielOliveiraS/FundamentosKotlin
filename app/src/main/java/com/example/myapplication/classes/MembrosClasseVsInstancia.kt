package com.example.myapplication.classes

var desconto: Double = 0.0

class ItemPedido(val nome : String, var preco: Double){
    companion object{
        fun create(nome: String, preco: Double) = ItemPedido(nome, preco)
      //  @JvmStatic var desconto: Double = 0.0
    }
    fun precoComDesconto(): Double{
        return preco - preco * desconto
    }
}


fun main(args: Array<String>) {
    val item1 = ItemPedido.create("TV", 2000.00)
    val item2 = ItemPedido("PC", 4000.00)
    desconto = 0.10

    println(item1.precoComDesconto())
    println(item2.precoComDesconto())
}