

class ListIterator<T>(private val collection: List<T>): Iterator<T> {
    private var index = 0


    override fun next(): T {
        if (hasNext()) {
            val item = collection[index]

            index += 1

            return item

        } else {
            throw NoSuchElementException("End of collection reached")
        }
    }

    override fun hasNext(): Boolean {
        return index < collection.size
    }

}