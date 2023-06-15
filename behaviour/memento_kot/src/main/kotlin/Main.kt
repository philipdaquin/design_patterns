

/*
*   Memento Design Pattern
*   - Provides the ability to capture and restore the internal state of an object without
*     violating encapsulation.
*
*   - It is commonly used to implement undo mechanism or to store and retrieve snapshot of an object's state
*
*   The key participants in the Memento pattern are:
*
*   Originator: Capture and restore
*   Memento: Snapshot of the originator's state
*   Caretaker: Storing and managing the mementos
* */

class TextEditorMemento(val text: String)

class TextEditor(public var text: String) {

    fun createSnapshot(): TextEditorMemento {
        return TextEditorMemento(text)
    }
    fun restoreSnapshot(memento: TextEditorMemento) {
        text = memento.text
    }
    fun printText() {
        println("Current Text $text")
    }
}

class SnapshotManager {
    private val snapshots = mutableListOf<TextEditorMemento>()

    fun saveSnapshot(memento: TextEditorMemento) {
        snapshots.add(memento)
    }

    fun getSnapshot(i: Int): TextEditorMemento? {
        return if (i in 0 until snapshots.size) {
            snapshots[i]
        } else {
            null
        }
    }
}
fun main(args: Array<String>) {
    val editor  = TextEditor("Hello world")
    val snapshotManager = SnapshotManager()

    val initialSnapshot  = editor.createSnapshot()
    snapshotManager.saveSnapshot(initialSnapshot)

    editor.text = "Hello"
    editor.printText()


    val newSnapshot = editor.createSnapshot()
    snapshotManager.saveSnapshot(newSnapshot)
}