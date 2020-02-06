package com.example.myapplication.lambdas

data class Aluno(val nome: String, val nota: Double)

fun main(args: Array<String>) {
    val alunos = arrayListOf(
        Aluno("Pedro", 7.4),
        Aluno("Arthur", 8.0),
        Aluno("Ariel", 9.0),
        Aluno("Ricardo",4.5)
    )
    val aprovados = alunos.filter { it.nota >= 7.0 }.sortedBy { -it.nota }
    println(aprovados)
}