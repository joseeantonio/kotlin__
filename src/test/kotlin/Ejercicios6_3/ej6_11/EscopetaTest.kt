package Ejercicios6_3.ej6_11

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class EscopetaTest {

    var laEscopeta = Escopeta(100.0,cargada = true,recortada = true,50.0)
    var laEscopetita = Escopeta(100.0,cargada = true,recortada = false,50.0)

    @Test
    fun atacar() {
        assert(laEscopeta.atacar() == 150.0)
        assert(laEscopetita.atacar() == 100.0)
    }

    @Test
    fun getRecortada() {
        assert(laEscopeta.recortada)
        assert(!laEscopetita.recortada)
    }

    @Test
    fun getAumentarRecortada() {
        assert(laEscopeta.aumentarRecortada == 50.0)
        assert(laEscopetita.aumentarRecortada == 50.0)
    }
}