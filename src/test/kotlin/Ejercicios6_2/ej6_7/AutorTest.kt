package Ejercicios6_2.ej6_7

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class AutorTest {
    var libro1 = Libro("Blancanieves","123456789",100)
    var autor1 = Autor("pepe","123456789N", arrayListOf(libro1))
    var libro2 = Libro("Tarzan","987654321",50)

    @Test
    fun mostrarLibros() {
        assert(autor1.mostrarLibros() == arrayListOf(libro1))
    }

    @Test
    fun añadirLibro() {
        autor1.añadirLibro(libro2)
        assert(autor1.mostrarLibros() == arrayListOf(libro1,libro2))
    }

    @Test
    fun eliminarLibro() {
        autor1.añadirLibro(libro2)
        autor1.eliminarLibro(libro1)
        assert(autor1.mostrarLibros() == arrayListOf(libro2))
    }

    @Test
    fun testToString() {
        assert(autor1.toString() == "Autor(nombre='pepe', dni='123456789N', libros=[Libro(titulo='Blancanieves', id='123456789', numPaginas=100)])")
    }
}