package Ejercicios6_3.ej6_13

import Ejercicios6_3.ej_13.Flauta
import Ejercicios6_3.ej_13.Guitarra
import Ejercicios6_3.ej_13.Nota
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class IntrumentoTest {


    var guitarra = Guitarra(6)
    var flauta = Flauta(9)

    @Test
    fun tocarNota() {
        assert(guitarra.tocarNota() == Nota.DO)
        assert(flauta.tocarNota() == Nota.DO)
    }
}