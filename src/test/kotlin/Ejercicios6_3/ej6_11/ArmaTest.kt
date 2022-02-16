package Ejercicios6_3.ej6_11

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ArmaTest {

    var arma1 = Arma(70.0)
    @Test
    fun atacar() {
        assert(arma1.atacar() == 70.0)
    }

    @Test
    fun getPotencia() {
        assert(arma1.potencia == 70.0)
    }
}