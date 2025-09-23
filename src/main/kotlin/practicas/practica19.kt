package practicas

fun main() {

    val biblioteca = listOf(
        Novela("La ciudad de la alegría", "Dominique Lapierre", 1985),
        Novela("El Quijote", "Miguel de Cervantes", 1605),
        Novela("La fiesta del Chivo", "Mario Vargas Llosa", 2000)
    )


    for ((titulo, autor, anio) in biblioteca){
        println("La novela $titulo del autor $autor fue publicada en el año $anio")
    }

    println(".............")


    for ((titulo, _ , anio) in biblioteca){
        println("La novela $titulo fue publicada en el año $anio")
    }
}

class Novela(val titulo: String, val autor: String, val anioPublicado: Int) {

    operator fun component1() = titulo
    operator fun component2() = autor
    operator fun component3() = anioPublicado

}