package com.example.myapplication.classes

class Data(var dia: Int, var mes: Int, var ano: Int){
    fun formatar(): String {
        return "$dia/$mes/$ano"
    }
}

fun main(args: Array<String>) {
    var nascimento: Data = Data(dia = 22 ,mes = 10, ano = 1996)
  //  println("${nascimento.dia}/${nascimento.mes}/${nascimento.ano}")

    println(nascimento.formatar())
}