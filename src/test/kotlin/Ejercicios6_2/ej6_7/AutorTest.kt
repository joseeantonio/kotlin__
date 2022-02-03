package Ejercicios6_2.ej6_7

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class AutorTest {
    var libro1 = Libro("Blancanieves","123456789",100)
    var autor1 = Autor("pepe","123456789N", arrayListOf(libro1))

    @Test
    fun mostrarLibros() {
        assert(autor1.mostrarLibros() == arrayListOf(libro1))
    }

    @Test
    fun añadirLibro() {
    }

    @Test
    fun eliminarLibro() {
    }

    @Test
    fun testToString() {
    }
}