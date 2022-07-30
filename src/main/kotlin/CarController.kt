import domain.Car
import view.OutputView
import kotlin.random.Random

class CarController(carCount: Int, private val playCount: Int) {

    private var cars: List<Car>

    init {
        // Todo : 자연수 체크
        cars = makeCars(carCount)
    }

    // Todo : racingGame 패키지 만들어서 input을 전달하고,
    //  패키지의 결과를 받아서 output으로 전달하는 정도로 수정하기
    private fun makeCars(count: Int): List<Car> {
        val cars = mutableListOf<Car>()
        for (i in 0 until count) {
            cars.add(Car())
        }
        return cars
    }

    fun raceCar(result: OutputView) {
        result.printInit()
        repeat(playCount) {
            cars.forEach {
                it.move(Random.nextInt(RANDOM_RANGE))
            }
            result.printResult(cars)
        }
    }

}
