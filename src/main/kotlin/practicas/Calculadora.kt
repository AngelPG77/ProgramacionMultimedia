package practicas

class Calculadora {


    //Suma
    fun sumar( a: Int, b: Int) : Int {
        return a + b
    }

    //Restar
    fun restar ( a: Int, b: Int) : Int {
        return a - b
    }

    //Multiplicar
    fun multiplicar( a: Int, b: Int) : Int {
        return a * b
    }

    //Dividir
    fun dividir( a: Int, b: Int) : Int {
        try {
            return a / b
        } catch (e: ArithmeticException) {
            return 0
        }
    }
}