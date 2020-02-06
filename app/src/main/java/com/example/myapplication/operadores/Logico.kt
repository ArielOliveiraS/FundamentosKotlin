package com.example.myapplication.operadores

//Destructuring
//data class cria uma classe para representar um pojo
data class Carro(val marca: String, val modelo: String)

fun main(args: Array<String>) {

    //criou uma instancia de Carro
    val(a,b) = Carro("Ford", "Fusion")
    println("$a , $b")


    //desestruturando de uma lista
    val (marido, mulher) = listOf("João", "Maria")
    println("$marido e $mulher")

    val(_,_ , terceiroLugar) = listOf("Kimi","Hamilton", "Alonso")
    println("$terceiroLugar  terminou em terceiro lugar")



}