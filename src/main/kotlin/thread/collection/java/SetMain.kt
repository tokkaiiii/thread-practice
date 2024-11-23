package thread.collection.java

import java.util.concurrent.ConcurrentSkipListSet
import java.util.concurrent.CopyOnWriteArraySet

fun main() {
    val copySet = CopyOnWriteArraySet<Int>()
    copySet.add(2)
    copySet.add(1)
    copySet.add(3)
    println("copySet = $copySet")

    val skipSet = ConcurrentSkipListSet<Any>()
    skipSet.add(3)
    skipSet.add(1)
    skipSet.add(2)
    println("skipSet = $skipSet")
}