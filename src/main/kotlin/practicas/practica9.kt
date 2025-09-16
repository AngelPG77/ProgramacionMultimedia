package practicas

fun main() {
    val nums1 = intArrayOf(1,2,3,4)
    val nums2 = intArrayOf(5,6,7,8)

    etiqueta@ for (i in 0 .. nums1.size -1){
        println("Estamos en la iteración nº: ${i+1} ")
        for (j in 0 .. nums2.size -1){
            val suma = nums1[i]+ nums2[j]
            if (suma > 10){
                println("Saltando al bucle exterior")
                continue@etiqueta
            }
            println("${nums1[i]} + ${nums2[j]} = $suma")
        }
    }
}