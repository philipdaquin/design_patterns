

class ListAggregate<T>: Aggregate<T> {
    private val collection = mutableListOf<T>()
    fun addItem(item: T) {
        collection.add(item)
    }

    override fun createIterator(): Iterator<T> {
        return ListIterator(collection)
    }

}