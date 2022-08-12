package view

import domain.Car

class ResultView {
    fun printResult(cmd: InputCommand, result: MutableList<Car>) {
        println("실행 결과")

        for (i in 1 .. cmd.trial) {
            result.forEach {
                print(it.getName() + " : ")
                val score: Int = it.distance(i)
                drawRoute(score)
            }
            println()
        }
    }

    private fun drawRoute(distance: Int) {
        for (i in 1..distance) {
            print("-")
        }
        println()
    }
}