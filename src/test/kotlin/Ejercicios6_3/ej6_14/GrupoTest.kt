package Ejercicios6_3.ej6_14

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class GrupoTest {

    var persona = Cliente("pepe","garcia",20,1234567)
    var grupo = Grupo(arrayListOf())
    var proveedor = Proveedor("juan","Lopez",122,"12345")

    @Test
    fun registraYelimina() {
        assert(grupo.registra(persona))
        assert(!grupo.registra(persona))
        assert(grupo.elimina(persona))
        assert(!grupo.elimina(proveedor))
    }
}