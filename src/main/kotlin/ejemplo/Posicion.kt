package ejemplo

class Posicion {
    private var x : Int = 0
    private var y : Int = 0

    constructor(x: Int, y: Int) {
        this.x = x
        this.y = y
    }

    override fun toString(): String {
        return "Posicion(x=$x, y=$y)"
    }


}