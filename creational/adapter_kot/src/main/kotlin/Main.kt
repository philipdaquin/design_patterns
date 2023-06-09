

/*
*   Adapter Design Pattern
*   - Allows objects with incompatible interface to work together. It acts as a bridge
*     between two incompatible interfaces, allowing them to collaborate without
*     change their existing code
*
*   - The main goal of the Adapter Pattern is to convert the interface of one class into
*     another interface that clients expect
*
*   - It enables classes to work together that otherwise wouldnt be able to due incompatible interface
*
* */


interface MediaPlayer {
    fun play(audioType: String, fileName: String)

}
class AdvanceMediaPlayer {
    fun playVLC(fileName: String) {
        println("Playing vlc file: $fileName")
    }
    fun playMP4(fileName: String) {
        println("Playing mp4 file: $fileName")
    }
}
class MediaAdapter(private val audioType: String): MediaPlayer {
    private val audioMediaPlayer: AdvanceMediaPlayer = AdvanceMediaPlayer()
    override fun play(audioType: String, fileName: String) {
        when (audioType) {
            "vlc" -> audioMediaPlayer.playVLC("VLC FILE")
            "mp4" -> audioMediaPlayer.playMP4("MP4 FILE")
            else -> println("Invalid Media Type: $audioType")
        }
    }
}

fun main(args: Array<String>) {
    val mediaPlayer: MediaPlayer = MediaAdapter("mp4")

    mediaPlayer.play("mp4", "MP4 FILENAME")
    mediaPlayer.play("vlc", "VLC FILENAME")
    mediaPlayer.play("avi", "avi FILENAME")

}