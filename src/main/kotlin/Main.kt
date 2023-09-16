fun main() {
    println("Введите строку:")
    val input: String? = readLine()
    var count = 0
    var prevChar: Char? = null
    var result = ""

    input?.forEach { char -> if (char != prevChar) {
        if (count >= 2) {
            result += count.toString()
        }
        result += char
        count = 1
        prevChar = char
    } else {
        count++
    }
    }

    if (count >= 2) {
        result += count.toString()
    }

    println("Результат: $result")
}
