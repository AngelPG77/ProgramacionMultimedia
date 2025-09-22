package practicas

open class CalculadoraBase(val a: Double, val b: Double) {

    //Suma
    fun sumar() : Double {
        return a + b
    }

    //Restar
    fun restar () : Double {
        return a - b
    }

    //Multiplicar
    fun multiplicar() : Double {
        return a * b
    }

    //Dividir
    fun dividir() : Double {
        try {
            return a / b
        } catch (e: ArithmeticException) {
            return 0.0
        }
    }

}