package Ejercicios6_3.ej6_11

class Escopeta(
    potencia : Double,
    cargada : Boolean,
    var recortada : Boolean,
    var aumentarRecortada : Double
): ArmaFuego(potencia,cargada) {
    override fun atacar(): Double {
        if (disparar()) {
            if (recortada) {
                return potencia + aumentarRecortada
            }
            return potencia
        }
        return 0.0
    }
}