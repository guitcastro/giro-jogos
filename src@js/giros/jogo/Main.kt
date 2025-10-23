package giros.jogo

/**
 * Main entry point for the JavaScript platform.
 * Displays "Hello, Redwood!" using Redwood UI framework.
 */
fun main() {
    console.log("Hello, Redwood!")
    console.log("Platform: JavaScript")
    console.log("Redwood Version: 0.7.0")
}

external object console {
    fun log(message: String)
}
