package com.example.myapplication.OO.heranca

class Ferrari : Carro(velocidadeMaxima = 350), Esportivo{
    override var turbo: Boolean = false
        get() = field
        set(value) { field = value}

    override fun acelerar() {
        //super é opcional, como esta herdando, pode acessar diretamente
        alterarVelocidadeEm(if (turbo) 50 else 25)
    }

    override fun frear() {
        super.alterarVelocidadeEm(-25)
    }
}