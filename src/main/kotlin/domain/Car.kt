package domain

import MAX_NAME_LENGTH

//class Car(val carName: String, val carPosition: Int = 0) {
class Car() {

    private var position: Int = 0

//    init {
//        require(carName.length > MAX_NAME_LENGTH) {
//            throw IllegalArgumentException("자동차의 이름은 5글자를 초과할 수 없습니다.")
//        }
//    }

    fun getPosition(): Int {
        return position
    }

    fun move(carPosition: Int): Int {
        require(carPosition > 0) {
            throw IllegalArgumentException("0 미만의 값은 사용이 불가능합니다.")
        }

        require(carPosition < 9) {
            throw IllegalArgumentException("9보다 큰 값은 사용이 불가능합니다.")
        }

        if (carPosition >= 4) {
            position++
        }

        return position
    }

}