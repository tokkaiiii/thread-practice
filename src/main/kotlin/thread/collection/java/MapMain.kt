package thread.collection.java

import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.ConcurrentSkipListMap

fun main() {
    val map1 = ConcurrentHashMap<Int, String>()
    map1[2] = "data2"
    map1[1] = "data1"
    map1[3] = "data3"

    println("map1 = $map1")

    val map2 = ConcurrentSkipListMap<Int, String>()
    map2[3] = "data3"
    map2[2] = "data2"
    map2[1] = "data1"

    println("map2 = $map2")
}