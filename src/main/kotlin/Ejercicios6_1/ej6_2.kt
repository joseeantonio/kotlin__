package Ejercicios6_1

fun main() {

    while (true){

        try {
            print("Introduzca importe final: ")
            val impFinal = readLine()!!.toFloat()
            if (impFinal<1){
                println("Debe de ser mayor que 0.")
            }else{
                println("Has pagado de IVA ${10*impFinal/100}€ y el importe sin IVA saldria ${impFinal-(10*impFinal/100)}€")
                break
            }
        }catch (e : Exception){
            println("Valor incorrecto")
        }

    }
}