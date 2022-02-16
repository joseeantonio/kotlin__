package Ejercicios6_3.ej6_12

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class GuardiaSeguridadTest {

    var guardia = GuardiaSeguridad("Juan",1200.0,2,9.0)

    @Test
    fun cobrar() {
        assert(guardia.cobrar() == 1218.0)
    }

    @Test
    fun getNoches() {
        assert(guardia.noches == 2)
    }

    @Test
    fun getExtraNoche() {
        assert(guardia.extraNoche == 9.0)
    }
}