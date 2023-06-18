
/*
*   Adapter Design Pattern
*   - Allows objects with incompatible interfaces to work together
*   - It acts as a bridge between two incompatible classes or interfaces by converting the interface
*     of one class into another interface that the client expects
*
*   Adapter Pattern
*    - Target
*    - Adaptee
*    - Adapter
* */


interface MusicPlayer {
    fun play(song : String)
    fun stop()
}

class Mp3Player {
    fun playSong(songName: String) {
        println("Playing MP3: $songName")
    }

    fun stopPlayingBack() {
        println("Mp3 Playback stopped")
    }
}

class MediaPlayerAdapter(private val mp3Player: Mp3Player): MusicPlayer {
    override fun play(song: String) {
        mp3Player.playSong(song)
    }
    override fun stop() {
        mp3Player.stopPlayingBack()
    }
}

fun main(args: Array<String>) {
    val player = Mp3Player()
    val adapter : MusicPlayer = MediaPlayerAdapter(player)

    adapter.play("Song.mp3")
    adapter.stop()
}