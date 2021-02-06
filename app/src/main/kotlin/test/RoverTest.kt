package test

import mars.rover.*
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RoverTest {
    @Test
    fun `test process command list back to original spot`() {
        val rover = Rover(Position(0, 0), Heading.N)
        val command = Command("MRRML")
        rover.processCommands(command)
        assertEquals(Heading.E, rover.heading)
        assertEquals(Position(0, 0), rover.position)
    }

    @Test
    fun `test process command list`() {
        val rover = Rover(Position(0, 0), Heading.N)
        val command = Command("MLMRMR")
        rover.processCommands(command)
        assertEquals(Heading.E, rover.heading)
        assertEquals(Position(-1, 2), rover.position)
    }

}