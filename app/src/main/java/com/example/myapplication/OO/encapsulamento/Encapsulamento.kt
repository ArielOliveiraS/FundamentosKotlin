package com.example.myapplication.OO.encapsulamento

import android.graphics.Paint

private val dentroDoArquivo = 1
//protected val protegidoNaoSuportadoAqui = 1
internal val dentroDoProjeto = 1
val publico = 1

private fun dentroDoArquivo() = 1
//protected val protegidoNaoSuportadoAqui = 1
internal fun dentroDoProjeto () = 1
fun publico() = 1

//open -> a classe estara aberta para ser herdada
open class Capsula{
    private val dentroDoObjeto = 1
    protected val vaiPorHeranca =1
    internal val detroDoProjeto = 1
    val publico =1

    private fun dentroDoObjeto() = 1
    protected fun vaiPorHeranca() = 1
    internal fun dentroDoProjeto () = 1
    fun publico() = 1
}

class CapsulaFilha : Capsula(){

    fun verificarAcesso(){
       //private nao é transmitido por heranca
       // println(Capsula().dentroDoObjeto)

        //em caso de heranca, nao precisa instanciar o objeto pai, basta chamar direto
        println(vaiPorHeranca)
        println(detroDoProjeto)
        println(publico)

    }
}

//funcao topLevel
fun verificaAcesso(){
    //println(Capsula().dentroDoObjeto()) //não acessa pq é privato

   // println(Capsula().vaiPorHeranca()) // não acessa pq nao herda de Capsula

    println(Capsula().dentroDoProjeto())  // visibilidade internal

    println(Capsula().publico()) //visibilidade public
}