package practicas

class NaveEspacial(var nombre: String , val tamano: Int) {
    var velocidad: Int = 0

    fun volar() {
        velocidad = 100
    }

    fun estaVolando() : Boolean {
        return velocidad > 0
    }

    companion object {
        fun nuevaNave() : NaveEspacial {
            return NaveEspacial("Falcon", 25)
        }
    }


}