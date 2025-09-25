package practicas

data class Task(val title: String, val completed: Boolean = false)

fun filterTasks(tasks : List<Task>, criterio : (Task) -> Boolean) : List<Task> {
    return tasks.filter(criterio)
}

fun List<Task>.printTasks(){
    for (task in this){
            println("La tarea ${task.title} esta terminada ? ${if (task.completed) "[X]" else "[ ]" }")
    }
}

infix fun Task.sameTitleAs(other: Task): Boolean {
    return this.title == other.title
}


fun main() {

    val tareas = mutableListOf<Task>()

    tareas.add(Task("Cocinar", true))
    tareas.add(Task("Dormir", false))
    tareas.add(Task("Clase", false))
    tareas.add(Task("Clase", true))



    val pending = filterTasks(tareas) { !it.completed }
    val finished = filterTasks(tareas) { it.completed }

    pending.printTasks()
    finished.printTasks()

    println(tareas[2].sameTitleAs(tareas[1]))

}


