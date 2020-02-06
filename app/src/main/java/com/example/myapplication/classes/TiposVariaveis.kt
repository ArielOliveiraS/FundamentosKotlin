package com.example.myapplication.classes

val diretamenteNoArquivo ="Bum dia"

fun topLevel(){
    var local = "fulano"
    println("$diretamenteNoArquivo $local")
}

class Coisa{
    var variavelDeInstancia: String = "Boa noite"

    //objeto companheiro associado a classe Coisa
    companion object{
        //define o membro declarado como estático
        @JvmStatic val constanteDeClasse = "Ciclano"
    }

    fun fazer(){
        val local: Int = 7

        if(local > 3){
            val variavelDeBloco = "Beltrano"
            println("$variavelDeInstancia, $constanteDeClasse, $local e $variavelDeBloco")
        }
    }
}

fun main(args: Array<String>) {
    topLevel()

    //criando instancia da classe Coisa para chamar o metodo
    Coisa().fazer()
    println(Coisa.constanteDeClasse)
}