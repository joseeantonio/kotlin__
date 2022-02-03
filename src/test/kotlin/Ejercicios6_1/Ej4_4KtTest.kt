package Ejercicios6_1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Ej4_4KtTest {

    @Test
    fun funcion() {

        assert(funcion(arrayListOf(1,1,3,-5)) == arrayListOf(0,3,1))
        assert(funcion(arrayListOf(1,1,3,-10)) == arrayListOf(-5,3,1))

    }
}