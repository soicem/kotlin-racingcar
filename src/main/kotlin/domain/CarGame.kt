package domain

import view.InputCommand

class CarGame {
    val cars : MutableList<Car> = mutableListOf()
    fun startGame(cmd : InputCommand): MutableList<Car> {
        ready(cmd)
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
}