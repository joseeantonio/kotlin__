package Ejercicios6_2.ej6_6

class Cuenta(
     val numeroDeCuenta : String,
     var saldo : Double
) {
    fun ingresar (cantidad : Double){
        saldo += cantidad
    }
    fun retirar (cantidad : Double){
        saldo -= cantidad
    }

    override fun toString(): String {
        return "Cuenta(numeroDeCuenta='$numeroDeCuenta', saldo=$saldo)"
    }

}