package view;

import Const.InputMessage.CAR_INPUT_MESSAGE
import Const.InputMessage.CAR_TRY_MESSAGE

class InputView {

    fun carInput(): Int {
        println(CAR_INPUT_MESSAGE)
        // Todo : input value 체크 빼고 controller or car에서 입력체크
        val carCount = readLine()!!.toInt()
        require(carCount > 0) {
            throw IllegalArgumentException("자동차는 최소 1대 이상 필요합니다.")
        }
        return carCount
    }

    fun playCount(): Int {
        println(CAR_TRY_MESSAGE)
        val playCount = readLine()!!.toInt()
        require(playCount > 0) {
            throw IllegalArgumentException("최소 1회 이상 필요합니다.")
        }
        return playCount
    }

}
