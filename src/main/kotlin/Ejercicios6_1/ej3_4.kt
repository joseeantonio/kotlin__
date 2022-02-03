package Ejercicios6_1

fun añoBisiesto (año:Int): Boolean {
    if ((año%4 == 0 && año%100 != 0) || (año%4 == 0 && año%100 == 0 && año%400 == 0)){
        return true
    }
    return false
}



//fun añoBisiesto (año:Int): Boolean {
//    if (año%4 != 0){
//        return false
//    }else if (año%4 == 0 && año%100 != 0){
//        return true
//    }else if (año%4 == 0 && año%100 == 0 && año%400 != 0){
//        return false
//    }else if (año%4 == 0 && año%100 == 0 && año%400 == 0) {
//        return true
//    }
//    return false
//}