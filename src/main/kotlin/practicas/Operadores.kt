package practicas

fun main() {
    var contador = 0

    contador++
    println("El contador es: $contador")
    contador++
    println("El contador es: $contador")
    contador++
    println("El contador es: $contador")

    var a = 10
    var b = 20


    println("($a + $b)= ${a + b}")
    println("($a - $b)= ${a - b}")
    println("($a x $b)= ${a * b}")
    println("($a / $b)= ${a / b}")
    println("($a % $b)= ${a % b}")

    a += b
    println("+= $a")
    a -= b
    println("-= $a")
    a *= b
    println("*= $a")
    a /= b
    println("/= $a")
    a %= b
    println("%= $a")
}