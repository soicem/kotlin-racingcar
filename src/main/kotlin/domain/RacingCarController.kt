package domain

import view.InputView
import view.ResultView

class RacingCarController {
    fun start() {
        val inputCommand = InputView().input()
        val carGame = CarGame()
        val result = carGame.startGame(inputCommand)
        val resultView = ResultView()
        resultView.printResult(inputCommand, result)
        resultView.printWinners(carGame.getWinners())
    }
}