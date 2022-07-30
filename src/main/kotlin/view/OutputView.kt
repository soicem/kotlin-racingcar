package view;

import RACING_CAR
import domain.Car

class OutputView {

    fun printInit() {
        println("실행 결과")
    }

    fun printResult(car: Car) {
        println(RACING_CAR.repeat(car.getPosition()))
    }

    fun printResult(cars: List<Car>) {
        for (car in cars) {
            printResult(car)
        }
        println()
    }

}
