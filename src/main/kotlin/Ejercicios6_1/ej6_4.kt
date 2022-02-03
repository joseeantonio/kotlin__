package Ejercicios6_1

fun main() {
    while (true) {

        try {
            print("Introduzca un numero: ")
            val n1 = readLine()!!.toInt()
            print("Introduzca otro numero: ")
            val n2 = readLine()!!.toInt()
            println("Decide la operacion: sumar, restar, dividir o multiplicar.")
            val operacion = readLine()

            if (operacion == "sumar"){
                println("${n1}+${n2} = ${n1+n2}")
                break
            }else if (operacion == "restar"){
                println("${n1}-${n2} = ${n1-n2}")
                break
            }else if (operacion == "dividir"){

                if (n1.equals(0) || n2.equals(0)){
                    println("Ninguno de los dos numeros pueden ser 0.")
                }else{
                    println("${n1}/${n2} = ${n1/n2}")
                    break
                }
            }else if (operacion == "multiplicar"){
                println("${n1}*${n2} = ${n1*n2}")
                break
            }else{
                println("Introduzca una operacion valida")
            }

        }catch (e : Exception){
            println("Introduce un numero por favor")
        }

    }
}