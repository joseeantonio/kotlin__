package Ejercicios6_1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Ej3_4KtTest {

    @Test
    fun añoBisiesto() {
        assert (añoBisiesto(2019) == false)
        assert (añoBisiesto(2020) == true)
        assert (añoBisiesto(1900) == false)
        assert (añoBisiesto(2000) == true)
    }
}