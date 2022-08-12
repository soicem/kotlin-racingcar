package domain

import kotlin.random.Random

interface RandomGenerator {
    fun generate(): Int
}

class DefaultGenerator : RandomGenerator {
    override fun generate(): Int {
        return Random.nextInt(9)
    }
}

class CustomGenerator(private val min: Int = 0, private val max: Int = 9) : RandomGenerator {
    override fun generate(): Int {
        return (min..max).random()
    }
}

class Car(round: Int, name: String) {
    private var steps: MutableList<Int>
    private val name: String

    init {
        this.steps = MutableList(round) { 0 }
        this.name = name
    }

    fun canMove(randomGenerator: RandomGenerator = DefaultGenerator()): Boolean {
        return randomGenerator.generate() >= 4
    }

    fun move(lap: Int) {
        steps[lap - 1] = 1
    }

    fun getName(): String {
        return name
    }

    fun distance(lap: Int): Int {
        return steps.slice(0 until lap).sum()
    }
}