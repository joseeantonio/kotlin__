package Ejercicios6_2.ej6_7

class Libro(
    val titulo : String,
    val id : String,
    val numPaginas : Int
) {
    override fun toString(): String {
        return "Libro(titulo='$titulo', id='$id', numPaginas=$numPaginas)"
    }
}