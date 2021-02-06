package test

import mars.rover.Command
import mars.rover.CommandOption
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows


class CommandTest {

    @Test
    fun `parse command test`() {
        val command = Command("MMMRLR")
        val inputs = command.inputs
        assertEquals(6, inputs.size)
        assertEquals(listOf(
            CommandOption.M,
            CommandOption.M,
            CommandOption.M,
            CommandOption.R,
            CommandOption.L,
            CommandOption.R
        ), inputs)
    }

    @Test
    fun `validate test`() {
        assertThrows(IllegalArgumentException::class.java) {
            Command("123ABC")
        }
    }

}