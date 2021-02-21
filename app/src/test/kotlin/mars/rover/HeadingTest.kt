package mars.rover

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class HeadingTest {

    @Test
    fun `rotate left test`() {
        assertEquals(Heading.W, Heading.N.rotateLeft())
    }

    @Test
    fun `rotate right test`() {
        assertEquals(Heading.E, Heading.N.rotateRight())
    }

}