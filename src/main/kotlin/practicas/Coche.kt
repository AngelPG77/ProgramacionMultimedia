package practicas

class Coche(val marca: String, val modelo: String) {

    var velocidad: Int = 0
        private set

    constructor(marca: String, modelo: String, velocidad: Int) : this(marca, modelo) {
        if (velocidad < 0) {
            this.velocidad = 0
            println("La velocidad no puede ser menor que 0, acutalizada a 0")
        } else this.velocidad = velocidad
    }


    fun acelerar(cantidad: Int) {
        if (cantidad > 0) {
            this.velocidad += cantidad
            println("Acelerando $cantidad el $modelo, velocidad actual $velocidad km por hora")
        }

    }

    fun frenar(cantidad: Int) {
        if ((this.velocidad - cantidad) < 0) {
            velocidad = 0
            println("Vehículo $modelo detenido")
        } else {
            this.velocidad -= cantidad
            println("Frenando $cantidad el $modelo, velocidad actual $velocidad km por hora")
        }
    }

}