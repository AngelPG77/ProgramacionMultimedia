package practicas

fun main() {
    val calculadora = CalculadoraBase(10.0, 5.0)
    val calculadoraCientifica = CalculadoraCientifica(15.0, 7.5)

    println("Calculadora Base:")
    println(calculadora.sumar())
    println(calculadora.restar())
    println(calculadora.multiplicar())
    println(calculadora.dividir())

    println("Calculadora Cientifica:")
    println(calculadoraCientifica.cuadrado())
    println(calculadoraCientifica.raiz())
}