package practicas

fun main() {
   val  miNave = NaveEspacial("Enterprise", 150)

    miNave.volar()
    val volando = miNave.estaVolando()
    println("¿Está volando? $volando")

    val nuevaNave = NaveEspacial.nuevaNave()
    println("Nueva nave: ${nuevaNave.nombre}, tamaño: ${nuevaNave.tamano}")

}