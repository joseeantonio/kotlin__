package Ejercicios6_3.ej6_11

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ArmaBlancaTest {

    var armaBlanca1 = ArmaBlanca(100.0, afilada = false,50.0)

    @Test
    fun afilar() {
        armaBlanca1.afilar()
        assert(armaBlanca1.afilada)
    }

    @Test
    fun atacar() {
        armaBlanca1.afilar()
        assert(armaBlanca1.atacar() == 100.0)
        assert(armaBlanca1.atacar() == 50.0)
    }
}