package com.example.myapplication.OO.heranca

open class Animal(val nome: String)

class Cachorro : Animal{
    private val altura : Double

    constructor(nome: String, altura: Double) : super(nome){
        this.altura = altura
    }

    constructor(nome: String): this(nome, 0.0)

    override fun toString(): String = "$nome tem $altura com de altura"
}

fun main(args: Array<String>) {
    val dogAlemao = Cachorro("Spyke", 84.3)
    val youkshire = Cachorro("Lady di")

    println(dogAlemao)
    println(youkshire)
}