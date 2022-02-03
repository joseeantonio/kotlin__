package Ejercicios6_1

fun funcion (lista : ArrayList<Int>) :ArrayList<Int>{

    var suma = 0
    var positivos = 0
    var negativos = 0

    for (x in lista){
        suma+=x
        if (x<0){
            negativos += 1
        }else if (x>0){
            positivos += 1
        }
    }
    return arrayListOf(suma,positivos,negativos)
}