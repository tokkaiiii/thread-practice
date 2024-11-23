package thread.collection.simple.list

import thread.util.logger

class SimpleListMainV2 {
    private val log = logger()

    fun test(list: SimpleList) {
        log.info(list.javaClass.simpleName)

        // A를 리스트에 저장하는 코드
        val addA = Runnable {
            list.add("A")
            log.info("Thread-1: list.add(A)")
        }

        val addB = Runnable {
            list.add("B")
            log.info("Thread-2: list.add(B)")
        }

        val thread1 = Thread(addA, "Thread-1")
        val thread2 = Thread(addB, "Thread-2")
        thread1.start()
        thread2.start()
        thread1.join()
        thread2.join()
        log.info(list.toString())
    }

}

fun main() {
    SimpleListMainV2().test(BasicList())
}

