package org.iesra.parsear

import java.time.LocalDateTime

data class LogData(
    val fecha: LocalDateTime,
    val nivel: String,
    val mensaje: String
)

