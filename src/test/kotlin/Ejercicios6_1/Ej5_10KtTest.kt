package Ejercicios6_1

import org.junit.jupiter.api.Test

internal class Ej5_10KtTest {


    @Test
    fun palindromo() {
        val vacia :ArrayList<String> = arrayListOf()
        assert(palindromo(arrayListOf("oso","eje","palabra")) == arrayListOf("oso","eje"))
        assert(palindromo(arrayListOf("solo","eje","palabra")) == arrayListOf("eje"))
        assert(palindromo(arrayListOf("oso","bola","palabra")) == arrayListOf("oso"))
        assert(palindromo(arrayListOf("solo","bola","palabra")) == vacia)
    }
}