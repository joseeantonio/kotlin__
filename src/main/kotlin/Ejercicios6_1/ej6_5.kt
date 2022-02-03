package Ejercicios6_1

fun main() {
    var coma = ""
    for (x in 1..50){
        if (x%2 == 0){
            print("${coma} ${x}")
            coma = ","
        }
    }
}