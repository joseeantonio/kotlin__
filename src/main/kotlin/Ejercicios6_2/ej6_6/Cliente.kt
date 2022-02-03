package Ejercicios6_2.ej6_6

class Cliente (
    val nombre : String,
    val dni : String,
    private var cuentas: ArrayList<Cuenta> = arrayListOf()
        ){
    override fun toString(): String {
        return "Cliente(nombre='$nombre', dni='$dni', cuentas=$cuentas)"
    }
}