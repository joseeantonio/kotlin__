package Ejercicios6_3.ej6_11

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class RifleTest {

    var rifle = Rifle(200.0,true,100.0)

    @Test
    fun getAlcance() {
        assert(rifle.alcance == 100.0)
    }
}