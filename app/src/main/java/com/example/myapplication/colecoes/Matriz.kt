package com.example.myapplication.colecoes

fun main(args: Array<String>) {

    //funcao do kotlin arrayOfNulls -> gera array de nulls de 3 posicoes e coloca no array matriz
    val matriz = Array(3){ arrayOfNulls<Int>(3)}

    //acessa o primeiro elemento do array matriz e o primeiro elemento do arrayOfNulls
    //matriz.get(0).set(0,1)
    //matriz.get(0).set(1,2)
    matriz[0][0] = 1
    matriz[0][1] = 2
    matriz[0][2] = 3
    matriz[1][0] = 4
    matriz[1][1] = 5
    matriz[1][2] = 6
    matriz[2][0] = 7
    matriz[2][1] = 8
    matriz[2][2] = 9

    //uso do destructuring
    for ((linha, linhaArray) in matriz.withIndex()){
        for ((coluna, valor) in linhaArray.withIndex())
            println("[$linha] [$coluna] - ${matriz[linha][coluna]} == $valor")

    }
    matriz.forEach {
        it.forEach {
            println(it)
        }
    }
}
