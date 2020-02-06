package com.example.myapplication.colecoes

fun main(args: Array<String>) {

    //imprime em ordem aleatoria
    val aprovados = hashSetOf("Jo","Ma","Ana","Bia", "Rafa")

    println("Sem ordem...")
    for (aprovado in aprovados){
        aprovado.print()
    }

    //imprime na ordem em que a lista é passada
    val aprovadosNaOrdem1 = linkedSetOf("Jo","Ma","Ana","Bia", "Rafa")

    println("\nLinked...")
    for (aprovado in aprovadosNaOrdem1){
        aprovado.print()
    }

    //imprime em ordem alfabetica
    val aprovadosNAOrdem2 = sortedSetOf("Jo","Ma","Ana","Bia", "Rafa")
    println("\nSorted...")

    for (aprovado in aprovadosNAOrdem2){
        aprovado.print()
    }

}