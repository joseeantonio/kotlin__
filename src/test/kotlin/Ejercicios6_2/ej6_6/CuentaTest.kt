package Ejercicios6_2.ej6_6

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CuentaTest {

    var cuenta1 = Cuenta("123456",0.0)
    @Test
    fun testCuenta() {
        cuenta1.ingresar(100.0)
        assert(cuenta1.numeroDeCuenta == "123456")
        assert(cuenta1.saldo == 100.0)
        assert(cuenta1.toString() == "Cuenta(numeroDeCuenta='123456', saldo=100.0)")
        cuenta1.retirar(100.0)
        assert(cuenta1.saldo == 0.0)

    }
}