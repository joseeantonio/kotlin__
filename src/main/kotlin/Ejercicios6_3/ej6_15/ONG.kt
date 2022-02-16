package Ejercicios6_3.ej6_15

import java.util.Optional

class ONG (
    var voluntarios : ArrayList<Voluntario> = arrayListOf(),
    var mayor: Boolean = true
        ) {

    fun siguiente () : Voluntario?{

        if (voluntarios.isEmpty()){
            return null
        }
        else if (mayor){
            var año = 0
            var voluntarioFinal : Voluntario? = null
            for (voluntario in voluntarios){
                if (voluntario.edad > año){
                    año = voluntario.edad
                    voluntarioFinal = voluntario
                }
            }
            mayor = false
            voluntarios.remove(voluntarioFinal)
            return voluntarioFinal
        }else{
            var año = 200
            var voluntarioFinal : Voluntario? = null
            for (voluntario in voluntarios){
                if (voluntario.edad < año){
                    año = voluntario.edad
                    voluntarioFinal = voluntario
                }
            }
            voluntarios.remove(voluntarioFinal)
            return voluntarioFinal
        }
    }

    fun registrar (voluntario : Voluntario) : Boolean {
        if (voluntario in voluntarios){
            return false
        }
        voluntarios.add(voluntario)
        return true
    }

}