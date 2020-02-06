package com.example.myapplication.OO.heranca

open class Carro( val velocidadeMaxima: Int = 200, var velocidadeAtual: Int = 0){

    protected fun alterarVelocidadeEm(velocidade: Int){
        val novaVelocidade = velocidadeAtual + velocidade


        velocidadeAtual = when(novaVelocidade){
            //se a novaVelocidade estiver entre 0 e a velocidade maxima, retorna a nova velocidade
            in 0..velocidadeMaxima -> novaVelocidade

            //se a novaVelocidade tiver a velocidade maxima + 1 ou até o numero maximo supertado pelo int -> retorna a velocidadeMaxima
            in velocidadeMaxima + 1..Int.MAX_VALUE -> velocidadeMaxima

            //se a nova velocidade nao está dentro do intervalo permitido e nem acima, significa que esta abaixo entao retorna -> 0 para nao ter retorno negativo
            else -> 0
        }
    }

    open fun acelerar(){
        alterarVelocidadeEm(5)
    }

    open fun frear(){
        alterarVelocidadeEm(-5)
    }

    override fun toString(): String {
        return "A velocidade atual é $velocidadeAtual Km/h"
    }
}
