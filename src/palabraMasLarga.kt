fun main(){
    var maxima =palabraMasLarga("jajajajja","jaja","jsjsjsks","jsjsjsjss")
    println("La palabra mas larga tiene $maxima caracteres")
}

fun palabraMasLarga(vararg palabras: String):Int{
    var max = 0
    for (i in palabras) if (i.length > max) max = i.length
}//020914