package thread.collection.java

import java.util.Collections

fun main() {
    val list = Collections.synchronizedList(mutableListOf<String>())
    list.add("data1")
    list.add("data2")
    list.add("data3")
    println(list.javaClass)
    println("list = $list")
}