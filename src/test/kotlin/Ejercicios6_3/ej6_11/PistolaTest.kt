package Ejercicios6_3.ej6_11

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class PistolaTest {

    var elPistolon = Pistola(70.0,true,5)

    @Test
    fun getCalibre() {
        assert(elPistolon.calibre == 5)
    }
}