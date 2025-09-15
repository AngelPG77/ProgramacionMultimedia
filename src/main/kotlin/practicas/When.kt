package practicas

fun main() {
    val input = 'y'

    when (input) {
        'y' -> println("Continuando...")
        'n' -> println("Cerrando...")
        else -> println("Entrada inválida")
    }

    val input2 = 2

    when (input2) {
        1, 2, 3 -> println("Te toca turno nocturno")
        4, 5, 6 -> println("Te toca turno diurno")
    }

    val input3 = 100

    when (input3) {
        Char.MAX_VALUE.toInt() -> println("Límite superior")
        Char.MIN_VALUE.toInt() -> println("Límite inferior")
        else -> print("No es ninguno de los límites")
    }

    print("Ingresa el número:")
    val input4 = readLine()!!.toInt()

    when (input4) {
        in 1..49 -> println("$input pertenece a [1..49]")
        in 50..99 -> println("$input pertence a [50..99]")
        else -> println("Fuera de los rangos contemplados")
    }

    val formResponse: Any = 12

    when (formResponse) {
        is Int -> println("Respuesta Entera")
        is String -> println("Respuesta String")
    }

    val formResponse2: Any = "12"

    when (formResponse2) {
        is Int -> {
            val times = formResponse2 * 100
            println("Respuesta Entera:$times")
        }
        is String -> {
            val times = formResponse2.toInt() * 100
            println("Respuesta String:$times")
        }
    }

    val a = -5

    when {
        a > 0 -> print("Es positivo")
        a == 0 -> print("Es cero")
        else -> print("Es negativo")
    }

    val playerLucky = 0.2
    val bonus = 0.3

    when (val damage: Double = playerLucky + bonus) {
        in 0.0..0.3 -> print("Daño recibido:${damage * 10}")
        in 0.3..0.6 -> print("Daño recibido:${damage * 20}")
        in 0.6..1.0 -> print("Daño recibido:${damage * 30}")
    }

    val markNumber = 4

    val markText = when (markNumber) {
        1 -> "Insuficiente"
        2 -> "Deficiente"
        3 -> "Aceptable"
        4 -> "Sobresaliente"
        5 -> "Excelente"
        else -> "No permitido"
    }

    print("La calificación es: $markText")
}