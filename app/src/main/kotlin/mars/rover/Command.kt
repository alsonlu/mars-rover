package mars.rover

data class Command(private val input: String) {
    val inputs: List<CommandOption> = input.toCharArray().toList().mapNotNull { CommandOption.valueOf(it) }

    init {
        require(validate())
    }

    private fun validate(): Boolean {
        return inputs.size == input.length
    }

}

enum class CommandOption {
    R, L, M;

    companion object {
        fun valueOf(key: Char): CommandOption? {
            return when (key) {
                'R' -> {
                    R
                }
                'L' -> {
                    L
                }
                'M' -> {
                    M
                }
                else -> {
                    null
                }
            }
        }
    }
}