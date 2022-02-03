package Ejercicios6_1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Ej4_7KtTest {

    @Test
    fun restaSucesiva() {
        assert(Ejercicios6_1.restaSucesiva(1324,312) == arrayListOf(4,76))
        assert(Ejercicios6_1.restaSucesiva(3,2) == arrayListOf(1,1))
        assert(Ejercicios6_1.restaSucesiva(4,4) == arrayListOf(1,0))
    }
}