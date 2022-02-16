package Ejercicios6_3.ej6_11

open class ArmaBlanca (potencia : Double,
                       var afilada : Boolean = false,
                       var reduccionSinAfilar : Double)
    : Arma(potencia) {

    fun afilar() {
        if (!afilada){
            afilada = true
        }
    }

    override fun atacar() : Double{
        if (!afilada){
            afilada = false
            return potencia - reduccionSinAfilar
        }
        afilada = false
        return potencia
    }
}