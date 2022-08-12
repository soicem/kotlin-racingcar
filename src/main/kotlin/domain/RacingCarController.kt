package domain

import view.InputView
import view.ResultView

class RacingCarController {
    fun start() {
        val inputCommand = InputView().input()
        val result = CarGame().startGame(inputCommand)
        ResultView().printResult(inputCommand, result)
    }
}