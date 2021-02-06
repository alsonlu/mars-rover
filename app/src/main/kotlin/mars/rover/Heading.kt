package mars.rover

enum class Heading {
    N,
    S,
    E,
    W;

    fun rotateLeft(): Heading {
        return when (this) {
            W -> {
                S
            }
            E -> {
                N
            }
            N -> {
                W
            }
            S -> {
                E
            }
        }
    }

    fun rotateRight(): Heading {
        return when (this) {
            W -> {
                N
            }
            E -> {
                S
            }
            N -> {
                E
            }
            S -> {
                W
            }
        }
    }
}