package Ejercicios6_2.ej6_7

class Autor(
    val nombre : String,
    val dni : String,
    private var libros : ArrayList<Libro> = arrayListOf()
) {
    fun mostrarLibros (): ArrayList<Libro>{
        return libros
    }
    fun añadirLibro(libro : Libro){
        libros.add(libro)
    }
    fun eliminarLibro(libro: Libro){
            libros.remove(libro)
    }

    override fun toString(): String {
        return "Autor(nombre='$nombre', dni='$dni', libros=$libros)"
    }

}