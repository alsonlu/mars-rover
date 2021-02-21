/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package mars.rover

import mars.rover.eventListener.RoverMovedEventListener

/*
 * Mars Rover on a rectangular plateau
 * Current position is defined by coordinates (x,y) and heading (N,S,E,W)
 * In order to move the rover, you must give it L, R, M
 * L -> Turns left
 * R -> Turns right
 * M -> Moves one in the direction it's facing
 */


/*
 * Rover moves on a plateau
 * Rover takes in commands
 * Rover outputs current position
 */

/*
 * output position on the map and then show the path it took
 */
val ROVER_MOVED_QUEUE = RoverMovedEventListener()
val MARS = Mars()

fun main() {
    println("Where should the rover land?")
    val roverPosition = readLine()!!
    val x = roverPosition[0].toString().toInt()
    val y = roverPosition[1].toString().toInt()
    val heading = Heading.valueOf(roverPosition[2].toString())
    val rover = Rover(Position(x, y), heading)
    MARS.dropRover(rover)
    ROVER_MOVED_QUEUE.onEvent(rover)

    println("Here is the rover:")
    println(MARS.showRover())

    println("Enter command for Rover01: ")
    val userCommands = readLine()
    val commands = Command(userCommands!!)
    rover.processCommands(commands)

    println("Here is the rover:")
    println(MARS.showRover())
}