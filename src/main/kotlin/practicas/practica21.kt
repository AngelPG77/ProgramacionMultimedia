package practicas

fun main() {

}

data class Usuario(val username : String, val email : String) {
}

class GestorUsuario(){
    private val usuarios : MutableList<Usuario> = mutableListOf()

    fun agregarUsuario(usuario : Usuario){
        if (usuarios.any() { it.email == usuario.email}) {
            println("Ya existe un usuario con ese email registrado")
        } else {
            usuarios.add(usuario)
            println("Usuario ${usuario.username} agregado correctamente")
        }
    }

    fun mostrarUsarios(){
        if (usuarios.isEmpty()){
            println("No hay usuarios registrados")
        } else {
            for ((username, email) in usuarios){
                println("Usuario = $username Email = $email")
            }
        }
    }

}