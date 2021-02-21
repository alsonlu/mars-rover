package mars.rover.eventListener

import mars.rover.MARS
import mars.rover.Rover
import java.util.*

class RoverMovedEventListener: EventListener {

    fun onEvent(rover: Rover) {
        MARS.updateRover(rover)
    }

}