package thread.collection.simple.list

class SyncProxyList(
    private val target: SimpleList
) : SimpleList {

    override var size: Int = 0

    @Synchronized
    override fun add(e: Any) {
        target.add(e)
    }

    @Synchronized
    override fun get(index: Int): Any {
        return target.get(index)
    }

    override fun toString(): String {
        return "SyncProxyList(target=${target} by ${this.javaClass.simpleName})"
    }


}