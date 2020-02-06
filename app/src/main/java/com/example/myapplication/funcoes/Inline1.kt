package com.example.myapplication.funcoes

inline fun transacao(funcao: () -> Unit){
    println("Abrindo transacao...")
    try {
        funcao()
    }finally {
        println("Fechando transacao")
    }
}

//forma mais basica de chamar uma funcao inline... passao o nome e logo em seguida o corpo
fun main(args: Array<String>) {
    transacao {
        println("Executando SQL 1...")
        println("Executando SQL 2...")
        println("Executando SQL 3...")
    }
}