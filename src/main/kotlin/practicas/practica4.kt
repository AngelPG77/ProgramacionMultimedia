package practicas

fun main() {
    val calculadora = Calculadora()

    val a = 10
    val b = 5

    println("La suma del valor a y b es: ${calculadora.sumar(a,b)}")
    println("La resta del valor a y b es: ${calculadora.restar(a,b)}")
    println("La multiplicacion del valor a y b es: ${calculadora.multiplicar(a,b)}")
    println("La division del valor a y b es: ${calculadora.dividir(a,b)}")

}