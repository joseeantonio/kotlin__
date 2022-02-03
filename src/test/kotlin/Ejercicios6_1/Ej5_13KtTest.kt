package Ejercicios6_1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Ej5_13KtTest {

    @Test
    fun codigoMorse() {
        assert(codigoMorse("Hola") == hashMapOf('H' to "....", 'O' to "---", 'L' to ".-..", 'A' to ".-"))
        assert(codigoMorse("oso") == hashMapOf('O' to "---", 'S' to "...",'O' to "---"))
        assert(codigoMorse("ola") == hashMapOf('O' to "---", 'L' to ".-..", 'A' to ".-"))
    }
}