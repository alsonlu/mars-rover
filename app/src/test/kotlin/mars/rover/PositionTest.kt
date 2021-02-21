package mars.rover

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PositionTest {

    @Test
    fun `move north`() {
        val position = Position(0, 0)
        val newPosition = position.move(Heading.N)
        assertEquals(Position(0, 1), newPosition)
    }

    @Test
    fun `move south`() {
        val position = Position(0, 0)
        val newPosition = position.move(Heading.S)
        assertEquals(Position(0, -1), newPosition)
    }

    @Test
    fun `move east`() {
        val position = Position(0, 0)
        val newPosition = position.move(Heading.E)
        assertEquals(Position(1, 0), newPosition)
    }

    @Test
    fun `move west`() {
        val position = Position(0, 0)
        val newPosition = position.move(Heading.W)
        assertEquals(Position(-1, 0), newPosition)
    }

}