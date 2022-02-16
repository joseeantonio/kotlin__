package Ejercicios6_3.ej6_15

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ONGTest {

    var voluntario1 = Voluntario("pepe",20,"123456")
    var copia1 = Voluntario("pepe",20,"123456")
    var voluntario2 = Voluntario("pepe",22,"83632")
    var voluntario3 = Voluntario("pepe",40,"3487235324")
    var ong = ONG(arrayListOf())


    @Test
    fun siguienteYregistra() {
        assert(ong.siguiente() == null) //nulo

        assert(ong.registrar(voluntario1))
        assert(!ong.registrar(copia1)) // return false

        assert(ong.registrar(voluntario2))
        assert(ong.registrar(voluntario3))


        assert(ong.siguiente() == voluntario3)  //el mayor
        assert(ong.siguiente() == voluntario1)  // el menor

    }

}