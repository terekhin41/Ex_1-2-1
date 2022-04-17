import kotlin.math.ceil

const val FEE_PERCENTAGE = 0.75
const val MIN_FEE = 35_00

fun main() {
    while (true) {
        print("Введите сумму в рублях: ")
        val amount = ((readLine()?.toDoubleOrNull() ?: continue) * 100).toInt()
        val estFee = ceil(amount * FEE_PERCENTAGE / 100).toInt()
        val fee = if (estFee < MIN_FEE) MIN_FEE else estFee
        val result = amount - fee
        println("""Комиссия составит: ${fee / 100}р. ${String.format("%02d", fee % 100)}коп.
            |Итоговая сумма: ${result / 100}р. ${String.format("%02d", result % 100)}коп. 
        """.trimMargin())
        println()
    }
}