package practicas

fun main() {

    val notas = arrayOfNulls<Double>(4)

    for (i in 0 until notas.size) {
        println("Introduce una nota de clase:")
        notas[i] = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    }

    val promedio = notas.requireNoNulls().average()


    //Version 1
    when (promedio) {
        in 0.0..4.9 -> {
            println("¿Te has presentado a la recuperación?")
            val respuesta = readLine()?.toString()
            when (respuesta?.uppercase()) {
                "S" -> println("En recuperación")
                "N" -> println("Suspenso")
            }
        }

        in 5.0..6.99 -> println("Aprobado, nota final: $promedio")
        in 7.0..10.0 -> println("Notable, nota final: $promedio")
        else -> println("Notas fuera de rango: ERROR")
    }

    //Version 2
    val notaFinal = when (promedio) {
        in 0.0..4.9 -> {
            println("¿Te has presentado a la recuperación?")
            val respuesta = readLine()?.toString()
            when (respuesta?.uppercase()) {
                "S" -> println("En recuperación")
                "N" -> println("Suspenso")
                else -> println("Error")
            }
        }

        in 5.0..6.99 -> println("Aprobado, nota final: $promedio")
        in 7.0..10.0 -> println("Notable, nota final: $promedio")
        else -> println("Notas fuera de rango: ERROR")
    }
}
