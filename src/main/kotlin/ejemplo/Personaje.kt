package ejemplo

class Personaje {
    private var nombre: String = ""
    private var posicion: Posicion = Posicion(0,0)


    constructor(nombre: String, posicion: Posicion) {
        this.nombre = nombre
        this.posicion = posicion
    }


    public fun andar(destino: Posicion) : Boolean{
        this.posicion = destino
        return true
    }

    override fun toString(): String {
        return "El nombre del personaje es $nombre y con posicion $posicion"
    }


}