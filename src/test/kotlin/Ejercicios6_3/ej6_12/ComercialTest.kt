package Ejercicios6_3.ej6_12

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ComercialTest {

    var comercial = Comercial("Maria",1200.0,200.0,50.0)

    @Test
    fun cobrar() {
        assert(comercial.cobrar() == 1300.0)
    }

    @Test
    fun vender() {
        comercial.vender(400.0)
        assert(comercial.ventas == 600.0)
    }

    @Test
    fun getVentas() {
        assert(comercial.ventas == 200.0)
    }

    @Test
    fun getComision() {
        assert(comercial.comision == 50.0)
    }
}