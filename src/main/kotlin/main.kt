import java.util.*
import kotlin.math.roundToInt

fun main() {
    var amount: Double
    val minAmount = 35
    val commision = 0.0075
    val scanner = Scanner(System.`in`)
    while (true) {
        println("Расчет комиссии")
        println("Введите сумму перевода в рублях (Минимальная сумма перевода 35 р.): ")
        amount = scanner.nextDouble()
        if (amount < minAmount) {
            println("Минимальная сумма перевода 35 р.")
            continue
        }
        amount *= 100 * commision //перевод в копейки и применение комиссии
        println("Комиссия составит ${amount.roundToInt()} копеек ")
    }
}