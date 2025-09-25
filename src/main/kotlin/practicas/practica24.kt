package practicas

data class Empleado(val nombre: String, val salario: Double, val departamento: String)

fun procesarEmpleados(empleados: List<Empleado>, operacion: (List<Empleado>) -> Any):
        Any {
    return operacion(empleados)
}

fun main() {
    val empleados = listOf<Empleado>(
        Empleado("Julio", 1500.50, "Informatica"),
        Empleado("Sara", 2455.00, "Ventas"),
        Empleado("Dani", 1365.80, "Ventas"),
        Empleado("Sonia", 1405.50, "Informatica"),
        Empleado("Lorena", 2055.20, "Recursos Humanos"),
        Empleado("Raul", 2100.95, "Recursos Humanos"),
        Empleado("Enmanuel", 5243.75, "Informatica"),
        Empleado("Richard", 3500.00, "Campeones Europeos"),
        Empleado("Pablo", 129.60, "Mineria"),
        Empleado("Fillips", 10000.00, "Remoto"),
    )

    val mayorSalario = procesarEmpleados(empleados) {
        empleados.maxOf { it.salario }
    }
    println("Empleado con mayor salario: $mayorSalario")

    val promedioVentas = procesarEmpleados(empleados) {
      val emp = empleados.filter { it.departamento.equals("Ventas") }
          emp.sumOf { it.salario} / emp.count()
      }

    println("Promedio salario en Ventas: $promedioVentas")

    val altosSueldos = procesarEmpleados(empleados) {
        empleados.filter { it.salario > 2500 }.count()
    }
    println("Empleados con sueldo > 2500€: $altosSueldos")

    val agrupados = procesarEmpleados(empleados) {
        it.groupBy { emp -> emp.departamento }
    }
    println("Empleados agrupados por departamento: $agrupados")
}


