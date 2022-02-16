package Ejercicios6_3.ej6_11

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class HachaTest {

    var hacha = Hacha(200.0,true,50.0,4)

    @Test
    fun getFilos() {
        assert(hacha.filos == 4)
    }
}