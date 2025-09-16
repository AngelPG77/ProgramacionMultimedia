package practicas

fun main() {

    println("Introduce un numero entero positivo")
    val n: Int = readln().toInt()

    for (i in 1 .. n){
        if (i%3 == 0){
            continue
        }
        if (i > 20){
            break
        }
        println(i)
    }
}