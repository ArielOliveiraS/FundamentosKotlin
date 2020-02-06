package com.example.myapplication.classes

////erro!! kotlin: Val cannor be ressigned
//// constante nao pode ser alterada
//fun porReferencia(velocidade: Int){
//    velocidade++
//}

data class Carro (var marce: String, var modelo: String, var velocidade: Int = 0)


fun porReferencia(carro: Carro){
    carro.velocidade++

}

fun main(args: Array<String>) {
    var carro1 = Carro("Ford", "Fusion")

    //carro2 recebe a refencia de carro1
    var carro2 = carro1

    carro2.modelo = "Edge"
    println(carro1)

    carro1 = Carro("Audi", "A4")

    porReferencia(carro1)
    porReferencia(carro2)

    println(carro1)
    println(carro2)

    /*
    a recebe o valor de um, b pega a referecnia de a portanto comeca valendo 1, b++ incrementa
    resultado:
    a = 1
    b = 2 -> comecou valendo um e incrementou mais um
     */

    var a = 1
    var b = a

    b++

    println(a)
    println(b)


}