package Ejercicios6_2.ej6_7

class Libro(
    var titulo : String,
    var id : String,
    var numPaginas : Int
) {
    override fun toString(): String {
        return "Libro(titulo='$titulo', id='$id', numPaginas=$numPaginas)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Libro

        if (titulo != other.titulo) return false
        if (id != other.id) return false
        if (numPaginas != other.numPaginas) return false

        return true
    }

    override fun hashCode(): Int {
        var result = titulo.hashCode()
        result = 31 * result + id.hashCode()
        result = 31 * result + numPaginas
        return result
    }


}