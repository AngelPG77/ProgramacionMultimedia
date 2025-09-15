package practicas

class CalculadoraNulable {


    //Suma
    fun sumar( a: Int?, b: Int?) : Int {
        return (a ?: 0) + (b ?: 0)
    }

    //Restar
    fun restar ( a: Int?, b: Int?) : Int {
        return (a ?: 0) - (b ?: 0)
    }

    //Multiplicar
    fun multiplicar( a: Int?, b: Int?) : Int {
        return (a ?: 0) * (b ?: 0)
    }

    //Dividir
    fun dividir( a: Int?, b: Int?) : Int {
        try {
            return (a ?: 0) / (b ?: 0)
        } catch (e: ArithmeticException) {
            return 0
        }
    }
}