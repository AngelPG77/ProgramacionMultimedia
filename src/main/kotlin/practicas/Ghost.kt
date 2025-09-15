package practicas

class Ghost {
    var x = 0
    var y = 0

    enum class Direction {
        UP, DOWN, LEFT, RIGHT
    }

    fun move() {
        val randomDirection = Direction.values().random()
        when (randomDirection) {
            Direction.UP -> ++y
            Direction.DOWN -> --y
            Direction.LEFT -> --x
            Direction.RIGHT -> ++x
        }
    }
}