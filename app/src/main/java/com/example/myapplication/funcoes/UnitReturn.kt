package com.example.myapplication.funcoes

fun imprimirMaior(a: Int, b : Int){
    println(Math.max(a,b))
}

fun ImprimirMaior2(a:Int, b: Int): Unit{
    println(Math.max(a,b))
}

fun ImprimeMaior3(a:Int, b: Int): Unit{
    println(Math.max(a,b))
    return
}

fun imprimeMaior4(a: Int, b: Int): Unit{
    println(Math.max(a,b))
    return Unit
}

fun imprimeMaior5(a: Int, b: Int){
    println(Math.max(a,b))
    return Unit
}
fun main(args: Array<String>) {
    imprimirMaior(2,1)
    ImprimirMaior2(2,1)
    ImprimeMaior3(2,1)
    imprimeMaior4(2,1)
    imprimeMaior5(2,1)
}