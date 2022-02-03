package Ejercicios6_1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import kotlin.math.sqrt

internal class Ej3_3KtTest {

    @Test
    fun distancia_puntos() {
        assert(distancia_puntos(1,4,2,4) == 1.0)
        assert(distancia_puntos(-3,4,2,8) == sqrt(41.0))
    }
}