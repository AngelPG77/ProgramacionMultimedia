package practicas

import kotlin.math.pow
import kotlin.math.sqrt

class CalculadoraCientifica(a: Double, b: Double) : CalculadoraBase(a,b) {

    fun cuadrado() : Double{
        return a.pow(b)
    }

    fun raiz() : Double{
        return sqrt(a)
    }
}