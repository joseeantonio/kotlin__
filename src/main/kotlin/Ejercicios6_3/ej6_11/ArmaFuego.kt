package Ejercicios6_3.ej6_11

open class ArmaFuego (
    potencia: Double, var cargada : Boolean = false
) : Arma(potencia) {

    fun cargar (){
        if (!cargada){
            cargada=true
        }
    }

    fun disparar () : Boolean{
        if (cargada){
            cargada = false
            return true
        }
        return false
    }

    override fun atacar () : Double {
        if (disparar()) {
            return potencia
        }
        return 0.0
    }
}