package Ejercicios6_1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Ej5_1KtTest {

    @Test
    fun tiposDePalabras() {

        assert(tiposDePalabras("Programacion") == arrayListOf("Prgrmcn","oaaio","PrOgrAmAcIOn"))
        assert(tiposDePalabras("hola") == arrayListOf("hl","oa","hOlA"))
        assert(tiposDePalabras("rata") == arrayListOf("rt","aa","rAtA"))
    }
}