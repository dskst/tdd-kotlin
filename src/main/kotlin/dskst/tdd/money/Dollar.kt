package dskst.tdd.money

class Dollar(amount: Int) {

    var amount = amount

    fun times(multiplier: Int): Dollar {
        return Dollar(amount * multiplier)
    }
}