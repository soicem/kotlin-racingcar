package domain

import view.InputCommand

class CarGame {
    private val cars: MutableList<Car> = mutableListOf()
    private var round: Int = 0
    fun startGame(cmd : InputCommand): MutableList<Car> {
        ready(cmd)
        this.round = cmd.trial
        return race(cmd.trial)
    }

    fun ready(cmd: InputCommand) {
        for (name in cmd.names) {
            cars.add(Car(cmd.trial, name))
        }
    }

    private fun race(round: Int): MutableList<Car> {
        for (i in 1..round) {
            cars.forEach { if (it.canMove(CustomGenerator(0, 9))) it.move(i) }
        }
        return cars
    }

    fun getWinners(): List<String> {
        return cars
            .filter {
                it.distance(round) == cars
                    .maxOf { it -> it.distance(round) }
            }
            .map {
                it.getName()
            }
    }
}