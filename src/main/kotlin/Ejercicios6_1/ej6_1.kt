package Ejercicios6_1


fun main() {
    while (true) {

        try {
            print("Horas de trabajo: ")
            val horas = readLine()!!.toInt()
            print("Coste por hora: ")
            val coste = readLine()!!.toFloat()

            if (horas<1){
                print("Las horas deben de ser mayor que 0.")
            }else if (coste<1){
                print("Los costes deben de ser mayor que 0.")
            }else{
                print("Importe total: ${horas*coste}")
                break
            }
        }
        catch (e : Exception){
            println("Datos no validos.")
        }
    }
}
