fun main(){

    /*
     *********************************
     *          FUNCIONES            *
     *********************************
     */
    //Con argumentos por defecto
    bienvenida()//Si llamamos a la funcion sin pasarle argumentos, tomara el que tiene por defecto
}
fun bienvenida(nombre:String = "Maria"){//En este caso el tipo de dato de retorno es Unit (Puede omitirse)
    println("Bienvenido/a usuario $nombre")
}