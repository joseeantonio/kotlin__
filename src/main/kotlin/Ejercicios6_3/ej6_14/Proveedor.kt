package Ejercicios6_3.ej6_14

class Proveedor(
    nombre : String,
    apellidos : String,
    edad : Int,
    var codigo : String
) : Persona(nombre,apellidos,edad) {
}