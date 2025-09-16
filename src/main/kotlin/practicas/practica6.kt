package practicas

fun main() {

    println("Introduce un peso en kg:")
    val peso = readLine()?.toDouble()
    println("Introduce una altura en metros")
    val altura = readLine()?.toDouble()

    println(calcularIMC(peso!!, altura!!))


}

fun calcularIMC(peso: Double, altura: Double) : String{

    var IMC = peso / Math.pow(altura, 2.0)

    when(IMC) {
        in 0.0 .. 18.5 -> return "Bajo peso"
        in 18.5 .. 24.9 -> return "Normal"
        in 25.0 .. 29.9 -> return  "Sobrepeso"
        in 30.0 ..Double.MAX_VALUE -> return "Obesidad"
        else -> return "Error"
    }
}