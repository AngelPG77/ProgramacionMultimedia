package practicas

import kotlin.math.pow

fun main() {
    val cuadrado1 = Cuadrado(10.0)
    cuadrado1.tituloResultado()
    println("Perímetro del cuadrado : ${"%.3f".format(cuadrado1.calcularPerimetro())}")
    println("Superficie del cuadrado : ${"%.3f".format(cuadrado1.calcularSuperficie())}")

    val rectangulo1 = Rectangulo(10.0, 5.0)
    rectangulo1.tituloResultado()
    println("Perímetro del rectángulo : ${"%.3f".format(rectangulo1.calcularPerimetro())}")
    println("Superficie del rectángulo : ${"%.3f".format(rectangulo1.calcularSuperficie())}")

    val circulo1 = Circulo(5.0)
    circulo1.tituloResultado()
    println("Perímetro del circulo: ${"%.3f".format(circulo1.calcularPerimetro())}")
    println("Superficie del circulo : ${"%.3f".format(circulo1.calcularSuperficie())}")
}

interface Figura {
    fun calcularSuperficie(): Double
    fun calcularPerimetro(): Double
    fun tituloResultado() {
        println("Datos de la figura")
    }
}

class Cuadrado(val lado: Double) : Figura {
    override fun calcularSuperficie(): Double {
        return lado * lado
    }

    override fun calcularPerimetro(): Double {
        return lado * 4
    }

    override fun tituloResultado() {
        println("Datos del cuadrado - Lado = $lado")
    }
}

class Rectangulo(val lado: Double, val altura: Double) : Figura {
    override fun calcularSuperficie(): Double {
        return lado * altura
    }

    override fun calcularPerimetro(): Double {
        return (2 * altura) + (2 * lado)
    }

    override fun tituloResultado() {
        println("Datos del ${this::class.simpleName} - Lado = $lado - Altura = $altura")
    }

}

class Circulo(val radio: Double) : Figura {
    override fun calcularSuperficie(): Double {
        return Math.PI * (radio.pow(2))
    }

    override fun calcularPerimetro(): Double {
        return radio * 2 * Math.PI
    }

    override fun tituloResultado() {
        println("Datos del circulo - Radio = $radio")
    }

}