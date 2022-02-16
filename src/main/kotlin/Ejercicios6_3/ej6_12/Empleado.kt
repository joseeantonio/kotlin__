package Ejercicios6_3.ej6_12

open class Empleado (
    var nombre : String,
    var sueldo : Double
        ){

    open fun cobrar() : Double {
        return sueldo
    }

}