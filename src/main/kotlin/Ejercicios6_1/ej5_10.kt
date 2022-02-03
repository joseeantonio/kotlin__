package Ejercicios6_1


fun palindromo(lista: ArrayList<String>) :ArrayList<String>{
    var listaNueva : ArrayList<String> = arrayListOf()
    for (palabra in lista){
        if (palabra == palabra.reversed()){
            listaNueva.add(palabra)
        }
    }
    return listaNueva
}