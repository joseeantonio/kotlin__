package Ejercicios6_3.ej_13

open abstract class Intrumento {

    open fun tocarNota () : Nota {
        return Nota.DO
    }

}