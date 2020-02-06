package com.example.myapplication.classes

class Calculadora{
    private var resultado: Int = 0

    //vararg pega a quatidade de numeros inteiros e soma
    fun somar(vararg valores: Int): Calculadora{

        //forEach navega na lista de valores e acessa o it item corrente (elemento)
        valores.forEach { resultado += it }
        return this
    }

    fun multiplicar(valor: Int): Calculadora{
        //resultado = resultado * valor
        resultado *= valor
        return this
    }

    fun limpar(): Calculadora{
        resultado = 0
        return this
    }
    fun print(): Calculadora{
        println(resultado)
        return this
    }

    fun obterReusltado(): Int {
        return resultado
    }
}

fun main(args: Array<String>) {
    val calculadora = Calculadora()
    calculadora.somar(1,2,3).multiplicar(3).print()
    calculadora.somar(7,10).print().limpar()
    println(calculadora.obterReusltado())
}