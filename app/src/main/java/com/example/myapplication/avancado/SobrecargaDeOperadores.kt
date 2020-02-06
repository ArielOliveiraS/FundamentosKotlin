package com.example.myapplication.avancado
//classe vai definir um ponto cartesiano x e y
data class Ponto(val x: Int, val y: Int){

    /*operator -> palavra reservada para definir que esta sobrecarregando um operador
    plus -> operador de adicao?
    pegando o x do objeto atual e somando com o x do outro objeto
    */
    operator fun plus(other: Ponto): Ponto = Ponto(x + other.x, y + other.y)

    //operador unario de menos
    operator fun unaryMinus(): Ponto = Ponto(-x, -y)
}

fun main(args: Array<String>) {
    val ponto1 = Ponto(10, 20)
    val ponto2 = Ponto(10, 20)

    println(-ponto1)
    println(ponto1+ ponto2)
}