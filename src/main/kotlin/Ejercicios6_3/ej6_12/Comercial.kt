package Ejercicios6_3.ej6_12

class Comercial (
    nombre : String,
    sueldo : Double,
    var ventas : Double,
    var comision : Double
        ) : Empleado(nombre,sueldo) {

    override fun cobrar () : Double {
        return comision * ventas / 100 + sueldo
    }

    fun vender (cantidad : Double){
        ventas += cantidad
    }

}