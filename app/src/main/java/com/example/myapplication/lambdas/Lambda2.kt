package com.example.myapplication.lambdas

//interface Operacao{
//    fun executar(a: Int, b: Int): Int
//}
//
//class Multiplicacao: Operacao{
//    override fun executar(a: Int, b: Int): Int {
//        return a * b
//    }
//}

class Calculadora{
//    fun calcular(a: Int, b: Int): Int{
//        return a+b
//    }
//    fun calcular(a: Int, b: Int, operacao: Operacao): Int{
//        return operacao.executar(a,b)
//    }


    //funcao Lambda/ terceiro parametro com expressao lambda
    fun calcularLambda(a: Int, b: Int, operacao: (Int, Int) -> Int): Int {
        return operacao(a,b)
    }
}

fun main(args: Array<String>) {
    val calculadora = Calculadora()
//    val resultado1 = calculadora.calcular(3,4)
//    val resultado2 = calculadora.calcular(3,4, Multiplicacao())

    //atribuindo a funcao lambda na constante subtracao
    val subtracao = {a: Int, b: Int -> a-b}
    val resultado3 = calculadora.calcularLambda(3,4,subtracao)

    println(" $resultado3")
//
//    println(resultado1)
//    println(resultado2)
}