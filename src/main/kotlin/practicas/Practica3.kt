package practicas

fun main() {

    val notas = arrayOfNulls<Double>(5)

    for (i in 0 until notas.size ){
        println("Introduce una nota de clase:")
        notas[i] = readlnOrNull()?.toDoubleOrNull()?:0.0
    }

    val total = notas.requireNoNulls().sum()
    val promedio = notas.requireNoNulls().average()
    val maxNota = notas.requireNoNulls().max()

    println(notas.contentToString())

    println("La suma de todas las notas es: $total")
    println("El promedio es: $promedio")
    println("La nota mas alta es: $maxNota")

}