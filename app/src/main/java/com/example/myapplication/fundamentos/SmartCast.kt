package com.example.myapplication.fundamentos

fun souEsperto(x: Any){

    if (x is String){
        println(x.toUpperCase())
    }else if(x is Int) {
        println(x.plus(3))
    }
}

fun souEsperto2(x: Any){
    when(x){
        is String -> println(x.toUpperCase())
        is Int -> println(x.plus(3))
        else -> println("Repesne a estrutura")
    }
}


fun  imprimirConceito(nota: Any){
    when(nota as? Int){
        10,9 -> println("A")
        8,7 -> println("B")
        else -> println("Nota invalida ")
    }
}

fun main(args: Array<String>) {
   val notas = arrayOf(9.6, 3.8, 5.5,4.2)
    for (nota in notas){
        imprimirConceito(nota.toInt())
    }
}