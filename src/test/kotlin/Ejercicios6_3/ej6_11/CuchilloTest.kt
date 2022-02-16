package Ejercicios6_3.ej6_11

import org.junit.Test
import org.junit.jupiter.api.Assertions.*

internal class CuchilloTest{

    var cuchillito = Cuchillo(100.0,afilada = false,10.0)
    @Test
    fun test() {
        assert(cuchillito.potencia == 100.0)
        assert(!cuchillito.afilada)
        assert(cuchillito.reduccionSinAfilar == 10.0)
    }
}