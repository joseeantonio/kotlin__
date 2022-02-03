package Ejercicios6_1


fun restaSucesiva (dividendo:Int,divisor:Int):ArrayList<Int>{
    var dividendo = dividendo
    var cociente = 0
    while (dividendo >= divisor) {
        dividendo -= divisor
        cociente += 1
    }
    return arrayListOf(cociente,dividendo)
}