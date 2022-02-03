package Ejercicios6_1


fun codigoMorse (palabra : String) : Map<Char,String>{
    var palabra = palabra.uppercase()
    val dic = hashMapOf('A' to ".-", 'B' to "-...", 'C' to "-.-.", 'D' to "-..", 'E' to ".", 'F' to "..-.", 'G' to "--.", 'H' to "....", 'I' to "..", 'J' to ".---",
           'K' to "-.-", 'L' to ".-..", 'M' to "--", 'N' to "-.", 'O' to "---", 'P' to ".--.", 'Q' to "--.-", 'R' to ".-.",'S' to "...",'T' to "-",
           'U' to "..-", 'V' to "...-", 'W' to ".--",'X' to "-..-",'Y' to "-.--",'Z' to "--..",'0' to "-----",'1' to ".----",'2' to "..---",
           '3' to "...--",'4' to "....-",'5' to ".....",'6' to "-....",'7' to "--...",'8' to "---..",'9' to "----.")
    var dic_palabra = hashMapOf<Char,String>()
    for (x in palabra){
        for ((letra,morse) in dic){
            if (x == letra){
                dic_palabra[x] = morse
            }
        }
    }
    return dic_palabra
}