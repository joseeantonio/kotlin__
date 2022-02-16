package Ejercicios6_3.ej6_15

class Voluntario (
    var nombre : String,
    var edad : Int,
    var dni : String
        ) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Voluntario

        if (nombre != other.nombre) return false
        if (edad != other.edad) return false
        if (dni != other.dni) return false

        return true
    }

    override fun hashCode(): Int {
        var result = nombre.hashCode()
        result = 31 * result + edad
        result = 31 * result + dni.hashCode()
        return result
    }
}