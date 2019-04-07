package dskst.tdd.money

class Sum(augend: Expression, addend: Expression): Expression {

    val augend: Expression = augend

    val addend: Expression = addend

    override fun reduce(bank: Bank, to: String): Money {
        val amount = augend.reduce(bank, to).amount + addend.reduce(bank, to).amount
        return Money(amount, to)
    }
}