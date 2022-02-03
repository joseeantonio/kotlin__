package Ejercicios6_1

fun tiposDePalabras (palabra: String):ArrayList<String>{
    var sinVocales = ""
    var sinConsonantes = ""
    var vocalesMayusculas = ""
    var vocales = "aeiou"
    for (x in palabra){
        if (x !in vocales){
            sinVocales += x
            vocalesMayusculas+= x
        }else{
            sinConsonantes += x
            vocalesMayusculas += x.uppercaseChar()
        }
    }
    return arrayListOf(sinVocales,sinConsonantes,vocalesMayusculas)
}