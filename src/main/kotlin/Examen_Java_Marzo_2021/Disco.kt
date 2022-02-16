package Examen_Java_Marzo_2021

class Disco (
    var genero : Genero_Musica,
    var grupo : String,
    var stock : Int,
    titulo : String,
    precio : Double,
    año_publicacion : Int,
    descuentoProducto : Int = 0
        ) : Producto(titulo, precio, año_publicacion, descuentoProducto) {

            override fun obtenerDescuento () : Int {
                return descuentoProducto
            }

}