package Ejercicios6_1


fun cuenta_caracteres(palabra:String):Map<Char,Int>{
    var diccionario = hashMapOf<Char,Int>()
    var contador = 0
    var letras = ""
    for(letra in palabra){
        if (letra in letras){
            contador += 1
            diccionario[letra] = contador
        }else{
            contador = 1
            diccionario[letra] = contador
            letras += letra
        }
    }
    return diccionario
}

fun main() {
    println(cuenta_caracteres("Programacion"))
    val dic1 = hashMapOf("P" to 1,"r" to 2,"o" to 2,"g" to 1,"a" to 2,"m" to 1,"c" to 1,"i" to 1,"n" to 1)
    println(dic1)
}