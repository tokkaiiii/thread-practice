package thread.collection.java

import java.util.concurrent.CopyOnWriteArrayList

fun main() {
    val list = CopyOnWriteArrayList<Int>()
    list.add(1)
    list.add(2)
    list.add(3)
    println("list= $list")
}