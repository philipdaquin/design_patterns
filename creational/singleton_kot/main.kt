

class Singleton { 
    val value: String

    constructor(value: String) { 
        try { 
            Thread.sleep(1000)
        } catch (e: InterruptedException) { 
            e.printStackTrace()
        }
        this.value = value
    }

    companion object { 
        @Volatile public var instance: Singleton? = null;

        public fun getInstance(value: String) = instance ?: synchronized(this) { 
            instance ?: Singleton(value).also { 
                instance = it
            }
        }
    }
}


fun main() {

    var singleton: Singleton = Singleton("asdasda")

    Singleton.getInstance("asdasjdlkasjd")


    println("Hello World")
}