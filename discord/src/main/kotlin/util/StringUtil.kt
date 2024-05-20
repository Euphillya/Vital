package util

fun List<String>.convertList(): String {
    if (this.isEmpty()) return ""

    val builder = StringBuilder()

    this.forEach {
        builder.append(it).append("\n")
    }

    return builder.toString().chomp()
}

fun String.plural(count: Int) = if (count != 1) plus("s") else this

fun String.chomp(): String {
    if (this.isEmpty()) return this

    val newLine = '\n'
    val reset = '\r'

    if (this.length == 1) {
        val character = this[0]

        if (character == newLine || character == reset) {
            return ""
        }

        return this
    }

    var index = this.length - 1
    val lastChar = this[index]

    if (lastChar == newLine) {
        if (this[index - 1] == reset) index--
    } else if (this[index - 1] == reset) {
        index++
    }

    return this.substring(0, index)
}