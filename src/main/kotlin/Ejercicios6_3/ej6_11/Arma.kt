package Ejercicios6_3.ej6_11

open class Arma(
    var potencia : Double
        ) {
    open fun atacar () : Double {
        return potencia
    }
}