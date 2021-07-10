import kotlinx.datetime.*

// https://github.com/Kotlin/kotlinx-datetime

fun date() {
    val currentMoment: Instant = Clock.System.now()
    val datetimeInUtc: LocalDateTime = currentMoment.toLocalDateTime(TimeZone.UTC)
    val datetimeInSystemZone: LocalDateTime = currentMoment.toLocalDateTime(TimeZone.currentSystemDefault())

    println(currentMoment)
    println(datetimeInUtc)
    datetimeInSystemZone.run {
        println("$year/$monthNumber/$dayOfMonth(${dayOfWeek}) $hour:$minute:$second")
    }
    println("UnixTime[ms]=${currentMoment.toEpochMilliseconds()}")
}
