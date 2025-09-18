package practicas

class CalculadoraCuerpoExpresion {


    //Suma
    fun sumar( a: Int?, b: Int?) : Int = (a ?: 0) + (b ?: 0)


    //Restar
    fun restar ( a: Int?, b: Int?) : Int = (a ?: 0) - (b ?: 0)


    //Multiplicar
    fun multiplicar( a: Int?, b: Int?) : Int = (a ?: 0) * (b ?: 0)


    //Dividir
    fun dividir( a: Int?, b: Int?) : Int =
        try {
            (a ?: 0) / (b ?: 0)
        } catch (e: ArithmeticException) {
             0
        }

    //Saludar
    fun saludar(nombre: String?) : Unit = println("Buenos días Doña $nombre")

}