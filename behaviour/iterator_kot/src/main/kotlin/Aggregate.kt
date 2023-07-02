

interface Aggregate<T> {
    fun createIterator(): Iterator<T>
}