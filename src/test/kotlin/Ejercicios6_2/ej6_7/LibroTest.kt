package Ejercicios6_2.ej6_7

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class LibroTest {

    @Test
    fun test() {
        val libro1 = Libro("Blancanieves","123456789",100)
        assert(libro1.toString() == "Libro(titulo='Blancanieves', id='123456789', numPaginas=100)")
    }
}