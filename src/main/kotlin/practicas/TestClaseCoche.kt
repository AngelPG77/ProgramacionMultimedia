package practicas

fun main() {

    val coche1 = Coche("Ferrari", "F40")
    val coche2 = Coche("Renault", "Clio", 50)
    val coche3 = Coche("Ford", "Mustang", -10)

    println()


    coche1.acelerar(20)
    coche1.frenar(10)
    coche2.frenar(60)
    coche3.acelerar(100)
    coche3.frenar(40)

}