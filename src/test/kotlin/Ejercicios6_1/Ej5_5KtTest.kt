package Ejercicios6_1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Ej5_5KtTest {

    @Test
    fun ahorcado() {
        assert(ahorcado("manzana","a") == "_a__a_a")
        assert(ahorcado("manzana","m") == "m______")
        assert(ahorcado("manzana","z") == "___z___")
    }
}