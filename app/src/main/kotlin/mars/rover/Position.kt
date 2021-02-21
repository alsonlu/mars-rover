package mars.rover

data class Position(val x: Int, val y: Int) {
    fun move(heading: Heading): Position {
        return when (heading) {
            Heading.W -> {
                Position(x - 1, y)
            }
            Heading.E -> {
                Position(x + 1, y)
            }
            Heading.N -> {
                Position(x, y - 1)
            }
            Heading.S -> {
                Position(x, y + 1)
            }
        }
    }
}