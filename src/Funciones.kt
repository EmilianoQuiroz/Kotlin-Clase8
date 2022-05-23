fun main() {

    /*
     *********************************
     *          FUNCIONES            *
     *********************************
     */
    //Con argumentos por defecto
    bienvenida()//Si llamamos a la funcion sin pasarle argumentos, tomara el que tiene por defecto
    bienvenida("Carlos")//Podemos cambiar el valor del parametro poniendo otro argumento
    //Creamos otra funcion agregando un parametro que no es por defecto
    //bienvenidaCompuesta("lunes")
    //Si solo colocamos el valoor que no es por defecto ocurre un error de sintaxis
    //Esto se debe a que existe una correlatividad de cada parametro con el orden de sus argumentos
    //Entonces al momento de compilarlos y aunque el valor de nombre es opcional, lo esta pidiendo para mantner dicho orden
    println(" ")
    bienvenidaCompuesta("Maria", "Jueves")
    bienvenidaCompuesta("Juan", "Sabado")
    //Argumentos variables
    /*
        Hay veces en la que no sepasramos la cantidad exacta de argumentos que pueda llevar una funcion.
        Incluso esa cantidad de argumentos puede definirse en tiempo de ejecusion. Para esto necesitamos
        crear una palabra reservada (modificador) que se utiliza en estos casos. "vararg" es la palabra
        que se utiliza en estos casos.
    */
}

fun bienvenida(nombre: String = "Maria") {//En este caso el tipo de dato de retorno es Unit (Puede omitirse)
    println("Bienvenido/a usuario $nombre")
}//011236

fun bienvenidaCompuesta(nombre: String = "Maria", dia: String) {
    println("Bienvenido/a usuario $nombre")
    println("El dia es $dia")
}
/*
fun palabraMasLarga(vararg palabras: String): Int {
    var max = 0
    for (i in palabras) if (i.length > max) max = i.length
}
*/

/*
Las funciones con cuerpo de bloque siempre deben especificar el tipo de devolucion de forma explicita,
a menos que se pretenda que devuelvan Unit, en cuyo caso especificar el tipo de devolucion es opcional.
Kotlin no infiere tipos de devolucion para funciones con cuerpos de bloque porque dichas funciones pueden
tener un fkujo de control complejo en el cuerpo, y el tipo de devolucion no sera obvio.
*/