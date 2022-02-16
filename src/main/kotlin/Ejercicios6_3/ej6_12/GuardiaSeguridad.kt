package Ejercicios6_3.ej6_12

class GuardiaSeguridad (
    nombre : String,
    sueldo : Double,
    var noches : Int,
    var extraNoche : Double
        ) : Empleado(nombre,sueldo) {

            override fun cobrar() : Double{
                return noches * extraNoche + sueldo
            }

}