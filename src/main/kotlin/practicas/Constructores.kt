package practicas

class Constructores(val propiedad1: String, val propiedad2: String) {

    // Constructor secundario
    constructor(propiedad3: String, propiedad4: String, extra: Boolean) :
            this(propiedad3, propiedad4) {

    }
}