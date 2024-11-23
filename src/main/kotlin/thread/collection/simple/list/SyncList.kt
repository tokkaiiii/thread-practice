package thread.collection.simple.list

import java.lang.Thread.sleep

private const val DEFAULT_CAPACITY = 5

class SyncList: SimpleList {
    override var size: Int = 0
    private val elementData = Array<Any>(DEFAULT_CAPACITY) {}

    @Synchronized
    override fun add(e: Any) {
        elementData[size] = e
        sleep(100)
        size++
    }

    override fun get(index: Int): Any {
        return elementData[index]
    }

    @Synchronized
    override fun toString(): String {
        return "BasicList(size=$size, " +
                "capacity=${elementData.size}, " +
                "elementData=${elementData.contentToString()})"
    }

}