package com.example.myapplication.OO.polimorfismo

//superClasse -> Carro / subClasses -> Civic, Ferrari, Fiesta

//Polimorfismo -> multiplas formas -> a partir de um tipo mais generico, esse generico pode assumir multiplas formas

class Feijao2 (val peso: Double)
class Arroz2 (val peso: Double)

class Pessoa2(var peso: Double){
    fun comer(feijao: Feijao2){
        peso += feijao.peso
    }

    fun comer(arroz: Arroz2){
        peso += arroz.peso
    }
}

fun main(args: Array<String>) {
    val feijao = Feijao2(0.3)
    val arroz = Arroz2(0.3)

    val joao = Pessoa2(80.5)
    joao.comer(feijao)
    joao.comer(arroz)

    println(joao.peso)
}