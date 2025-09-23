package practicas

fun main() {
    val inventario = Inventario()
    val p1 = Producto("Teclado", "P001")
    val p2 = Producto("Ratón", "P002")
    val p3 = Producto("Teclado", "P001") // Duplicado
    inventario.agregarProducto(p1)
    inventario.agregarProducto(p2)
    inventario.agregarProducto(p3)
    inventario.mostrarProductos()
}

data class Producto(val nombre : String, val codigo : String){


}

class  Inventario {
    private val productos: MutableSet<Producto> = mutableSetOf()
    fun agregarProducto(producto: Producto) {
        if (productos.add(producto)){
            println("Producto agregado correctamente")
        } else {
            println("Error al agregar un producto")
        }
    }

    fun mostrarProductos() {
        if (productos.isEmpty()){
            println("No hay productos")
        } else {
            for ((nombre, codigo) in productos){
                println("Producto = $nombre Código = $codigo")
            }
        }
    }
}