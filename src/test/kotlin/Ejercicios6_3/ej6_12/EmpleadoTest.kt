package Ejercicios6_3.ej6_12

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class EmpleadoTest {

    var empleado = Empleado("Pepe",1000.0)

    @Test
    fun cobrar() {
        assert(empleado.cobrar() == 1000.0)
    }

    @Test
    fun getNombre() {
        assert(empleado.nombre == "Pepe")
    }

    @Test
    fun getSueldo() {
        assert(empleado.sueldo == 1000.0)
    }
}