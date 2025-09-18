package practicas

fun main() {
    val calculadora = CalculadoraCuerpoExpresion()

    val a = 10
    val b = 5
    val nombre = "Luisa"

    calculadora.saludar(nombre)


    println("La suma del valor a y b es: ${calculadora.sumar(a,b)}")
    println("La resta del valor a y b es: ${calculadora.restar(a,b)}")
    println("La multiplicacion del valor a y b es: ${calculadora.multiplicar(a,b)}")
    println("La division del valor a y b es: ${calculadora.dividir(a,b)}")
    println("La suma del valor a y null es: ${calculadora.sumar(a, null)}")
    println("La resta del valor a y null es: ${calculadora.restar(a, null)}")
    println("La multiplicacion del valor a y null es: ${calculadora.multiplicar(a,null)}")
    println("La division del valor a y null es: ${calculadora.dividir(a, null)}")
}