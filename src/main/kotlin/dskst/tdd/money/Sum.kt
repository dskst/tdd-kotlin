package dskst.tdd.money

class Sum(augend: Money, addend: Money): Expression {

    val augend: Money = augend

    val addend: Money = addend

    fun reduce(to: String): Money {
        val amount = augend.amount + addend.amount
        return Money(amount, to)
    }
}