package Ejercicios6_1

import kotlin.math.*


fun distancia_puntos(x1: Int, y1: Int, x2: Int, y2: Int): Double{
    var d = sqrt(  Math.pow((x2-x1).toDouble(), 2.toDouble()) + Math.pow((y2-y1).toDouble(), 2.toDouble())  )
    return d
}
