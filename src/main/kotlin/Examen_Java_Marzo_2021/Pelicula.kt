package Examen_Java_Marzo_2021

class Pelicula (
    var genero : Genero_Pelicula,
    var director : String,
    titulo : String,
    precio : Double,
    año_publicacion : Int,
    descuentoProducto : Int = 0
        ) : Producto(titulo, precio, año_publicacion, descuentoProducto) {
}