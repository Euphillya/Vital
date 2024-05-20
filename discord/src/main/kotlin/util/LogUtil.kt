package util

import dev.minn.jda.ktx.util.SLF4J

private val logger by SLF4J("Beidou")

fun info(message: () -> String) {
    return logger.info(message())
}

fun warn(message: () -> String) {
    return logger.warn(message())
}

fun severe(message: () -> String) {
    return logger.error(message())
}