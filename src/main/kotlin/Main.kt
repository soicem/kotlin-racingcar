import view.InputView
import view.OutputView

fun main() {
    val input = InputView()
    val ouputResult = OutputView()
    val carCount = input.carInput()
    val playCount = input.playCount()
    val carController = CarController(carCount, playCount)
    carController.raceCar(ouputResult)
}