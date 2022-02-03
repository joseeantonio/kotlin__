package Ejercicios6_1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Ej5_11KtTest {

    @Test
    fun cuenta_caracteres() {
        //val dic1 = mutableMapOf(''P'' to 1,''r'' to 2,''o'' to 2,''g'' to 1,''a'' to 2,''m'' to 1,''c'' to 1,''i'' to 1,''n'' to 1)
        assert(cuenta_caracteres("Programacion") == (hashMapOf('P' to 1,'r' to 2,'o' to 2,'g' to 1,'a' to 2,'m' to 1,'c' to 1,'i' to 1,'n' to 1)))
    }
}
