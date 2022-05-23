fun main(){
    //Argumentos
    calcularSueldo("Agustin", 15.25, 160)
    //Tambien podemos nombrar cada argumento y asi darles el orden que querramos
    calcularSueldo(cantidadHoras = 160, nombre = "Luis", costoHora = 19.99)
}

fun calcularSueldo(nombre:String, costoHora:Double, cantidadHoras:Int){
    val sueldo = costoHora * cantidadHoras
    println("$nombre trabajo $cantidadHoras horas, se le paga \$$costoHora. Por lo tanto cobrara: \$$sueldo")
}