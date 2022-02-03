package Ejercicios6_2.ej6_6


import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ClienteTest {

    @Test
    fun testCliente() {
        var cuenta1 = Cuenta("123456",0.0)
        var cliente1 = Cliente("pepe","123456789Y", arrayListOf(cuenta1))

        assert(cliente1.toString() == "Cliente(nombre='pepe', dni='123456789Y', cuentas=${arrayListOf(cuenta1)})")
    }
}