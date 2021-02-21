package mars.rover

class Mars {

    private val width = 5
    private val height = 5
    private var world: Array<Array<String>> = createWorld()
    private lateinit var rover: Rover

    private fun createWorld(): Array<Array<String>> {
        val world =  Array(width) { Array(height) { "" } }

        for (i in 0 until width) {
            for (j in 0 until height) {
                world[i][j] = "*"
            }
        }
        return world
    }

    fun showRover(): String {
        var worldString = ""
        for (element in world) {
            for (spot in element) {
                worldString += "$spot "
            }
            worldString += "\n"
        }
        return worldString
    }

    fun updateRover(rover: Rover) {
        val position = rover.position
        val heading = rover.heading
        world = createWorld()
        world[position.y][position.x] = getDisplay(heading)
    }

    fun dropRover(rover: Rover) {
        this.rover = rover
    }

    private fun getDisplay(heading: Heading): String {
        return when (heading) {
            Heading.N -> "\u02C4"
            Heading.W -> "\u3008"
            Heading.E -> "\u3009"
            Heading.S -> "\u02C5"
        }
    }
}