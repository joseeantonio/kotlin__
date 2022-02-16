package Ejercicios6_3.ej6_14

import java.time.ZoneId

class Cliente (
    nombre : String,
    apellidos : String,
    edad : Int,
    var id : Long
        ) : Persona(nombre,apellidos,edad) {
}