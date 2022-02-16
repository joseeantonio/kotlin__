package Ejercicios6_3.ej6_14

class Grupo (
    var grupo : ArrayList<Persona> = arrayListOf()
        ) {

    fun registra(persona : Persona) : Boolean{
        if (persona in grupo){
            return false
        }
        grupo.add(persona)
        return true
    }

    fun elimina(persona: Persona) : Boolean{
        if (persona in grupo){
            grupo.remove(persona)
            return true
        }
        return false
    }

}