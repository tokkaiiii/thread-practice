package thread.util

import java.time.LocalTime
import java.time.format.DateTimeFormatter

private const val TIME_FORMAT = "HH:mm:ss.SSS"


private val formatter = DateTimeFormatter.ofPattern(TIME_FORMAT)
fun log(any: Any) {
    val time = LocalTime.now().format(formatter)
    println("%s [%9s] %s".format(time, Thread.currentThread().name, any))

}
