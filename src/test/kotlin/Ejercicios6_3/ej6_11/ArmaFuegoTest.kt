package Ejercicios6_3.ej6_11

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ArmaFuegoTest {

    var armaDeFuego1 = ArmaFuego(100.0)

    @Test
    fun cargar() {
        armaDeFuego1.cargar()
        assert(armaDeFuego1.cargada)
    }

    @Test
    fun disparar() {
        assert(!armaDeFuego1.disparar())
        armaDeFuego1.cargar()
        assert(armaDeFuego1.disparar())
    }

    @Test
    fun atacar() {
        armaDeFuego1.cargar()
        assert(armaDeFuego1.atacar() == 100.0)
        assert(armaDeFuego1.atacar() == 0.0)
    }

    @Test
    fun getCargada() {
        assert(armaDeFuego1.potencia == 100.0)
    }
}