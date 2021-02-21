package mars.rover

class Rover(startingPosition: Position, startingHeading: Heading) {

    var position: Position = startingPosition
    var heading: Heading = startingHeading

    fun processCommands(command: Command) {
        for (input in command.inputs) {
            when(input) {
                CommandOption.R -> {
                    heading = heading.rotateRight()
                }
                CommandOption.L -> {
                    heading = heading.rotateLeft()
                }
                CommandOption.M -> {
                    position = position.move(heading)
                }
            }
        }
        ROVER_MOVED_QUEUE.onEvent(this)
    }

}