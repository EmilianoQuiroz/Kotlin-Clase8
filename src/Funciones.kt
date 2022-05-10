fun main() {
    /*
    ******************************************
    *       REPASO NULOS
    ******************************************
    */
    /*
    Null: representa que una variable esta vacia o que
    no apunta a ningun dato valido
    Exception: son problemas que ocurren en tiempo de
    ejecucion y que detienen el programa abruptamente
    NullPointerException: es una excepcion provocada cuando
    queremos alcanzar una variable que contiene un valor nulo
    Kotlin implementa Null Safety para administrar este tipo
    de excepciones
    En Kotlin no existen los nulos a menos que se exprese lo contrario
    A ningun objeto se le puede asignar null (todos los tipos son
    objetos)
    */
    //La siguiente sentencia no compilara:
    //var x: Int = null
    //Para indicar que una variable pueda ser nula, lo hacemos
    //con el operador "?" despues del tipo de dato
    var x: Int? = null
    //A partir de esto el compilador nis va a exigir que comprobemos
    //los nulos antes de hacer algo con la variable
    //if(x != null){
    //  var y = x.toDouble()
    //}
    //Otra manera de representar lo anterior
    //var y = x?.toDouble()
    //println(y)
    //Devuelve null porque si x es null, devuelve un null
    // y la variable "y" sera del tipo Double?

    //Que pasaria si queremos guardar por defecto otro valor en vez de null
    //Una opcion seria utilizar if

    //var y = if (x != null) x.toDouble() else 0.0
    //En Kotlin podemos escrribr toda esta expresion en una misma linea
    //println(y)

    //Otra forma de representar lo anterior con el operador Elvis
    var y = x?.toDouble() ?: 0.0
    println(y)
    //Si el resultado de la operacion de la izquierda es nulo, devuelve el valor de la derecha.

    //Hasta el momento estuvimos utilizando el toInt() para convertir un
    //String a un entero cuando computabamos por consola
    //Cuando ingresabamos un numero del tipo Int lanzaba un
    //NumberFormatException que nos detenia el programa
    println("Ingrese un numero entero: ")
    //var numero = readln()!!.toInt()
    //println("El numero ingresado es $numero")
    //Se lanza un exception siempre que la cadena no sea una representacion
    //valida de un numero entero
    //Lo podemos solucionar con  un .toIntOrNull()
    //Devuelve un entero si lo puede convertir en caso de que no devuelve un null
    //Validar un entero
    var numero = readln().toIntOrNull()
    println("El numero ingresado es: $numero")
//005410
}
