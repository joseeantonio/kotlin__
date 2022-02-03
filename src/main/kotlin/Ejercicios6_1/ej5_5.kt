package Ejercicios6_1


fun ahorcado(palabra: String, acertadas: String):String{
    val guion = "_"
    var salida = ""
    for (x in palabra){
        if (x in acertadas){
            salida += x
        }else{
            salida += guion
        }
    }
    return salida
}



fun main() {
    val palabras =
        arrayListOf<String>("cerillas", "patrulla", "papel", "azor", "alerones", "conversar", "sollozo", "manzana")
    val palabra = palabras.random()
    var intentos = 5
    var acertadas = ""
    while (intentos > 0){
        try {
            println("Te quedan ${intentos} intentos.")
            println(ahorcado(palabra,acertadas))
            print("Introduce una letra: ")
            var letra = readLine()!!
            if (palabra != ahorcado(palabra,letra)){
                if (letra in palabra){
                    acertadas += letra
                }else{
                    println("Ops has fallado")
                    intentos -= 1
                }
            }else{
                println("Has acertado la palabra")
                break
            }
        }catch (e : Exception){
            println("Introduce una letra.")
        }
    }
}

