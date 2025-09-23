package practicas.map

class Inventario {

    private val productos = mutableMapOf<String, Producto>()

    // Agregar un producto al inventario
    fun agregarProducto(id: String, producto: Producto) {
        if (id in productos){
            println("Error al insertar el producto")
        } else {
            productos.put(id, producto)
            println("Producto ${producto.nombre} añadido con éxito")
        }
    }

    // Actualizar el precio de un producto existente
    fun actualizarPrecio(id: String, nuevoPrecio: Double) {
        if (productos.any() {it.key == id}){
            productos.getValue(id).precio = nuevoPrecio
            println("El precio del producto ${productos.getValue(id).nombre} se ha actualizado a $nuevoPrecio €")
        } else {
            println("Ese producto no existe")
        }
    }

    // Eliminar un producto por su ID
    fun eliminarProducto(id: String) {
        if (productos.any() {it.key == id}){
            println("El precio del producto ${productos.getValue(id).nombre} se ha eliminado")
            productos.remove(id)
        } else {
            println("Ese producto no existe")
        }
    }

    // Mostrar todos los productos con su nombre y precio
    fun mostrarProductos() {
        if (productos.isEmpty()){
            println("No hay productos guardados")
        } else {
            for ((nombre, precio) in productos){
                println("El producto $nombre tiene un precio de $precio €")
            }
        }
    }

    // Buscar un producto por su ID
    fun buscarProductoPorId(id: String): Producto? {
        return productos.getValue(id)
    }
}