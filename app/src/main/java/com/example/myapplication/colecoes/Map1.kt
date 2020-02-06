package com.example.myapplication.colecoes

fun main(args: Array<String>) {

    //parametros -> chave e valor
    var map = HashMap<Long, String>()

    map.put(100200300,"Joao")
    map.put(300400500,"Maria")
    map.put(600700800,"Pedro")

    map.put(600700800,"Pedro Filho")

    for (par in map){
        println(par)
    }

    //printa o valor -> segunda coluna
    for(nome in map.values){
        println(nome)
    }

    for (cpf in map.keys){
        println(cpf)
    }

    //operador destructuring
    for ((cpf, nome) in map){
        println("$nome (CPF: $cpf)")
    }

    map.size.print()

    //o resultado pode ser null pq pode nao ter o cpf na lista... por isso o ?
    map.get(100200300)?.print()
    map[100200300]?.print()

}