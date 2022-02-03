package Ejercicios6_1

fun main() {
    while (true){

        try {
            print("Introduzca puntuacion: ")
            val puntuacion = readLine()!!.toFloat()
            if ( 1<puntuacion || puntuacion<0 ){
                println("La puntuacion debe de ser mayor de 0 y menor de 1.")
            }else{
                if (puntuacion>=0.9){
                    println("Sobresaliente")
                }else if (puntuacion>=0.8 && puntuacion<0.9){
                    println("Notable")
                }else if (puntuacion>=0.7 && puntuacion<0.8){
                    println("Bien")
                }else if (puntuacion>=0.6 && puntuacion<0.7){
                    println("Suficiente")
                }else{
                    println("Insuficiente")
                }
            }
        }catch (e : Exception){
            println("Valor incorrecto.")
        }

    }

}