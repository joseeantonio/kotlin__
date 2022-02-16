package Examen_Java_Marzo_2021

abstract class Producto (
    var titulo : String,
    var precio : Double,
    var año_publicacion : Int,
    var descuentoProducto: Int = 0
        ) {

    open fun obtenerDescuento () : Int {return descuentoProducto}

}