package giros.jogo

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * Main Activity for the Android platform.
 * Displays "Hello, Redwood!" using Redwood UI framework.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // Create a simple TextView to display the message
        val textView = TextView(this).apply {
            text = "Hello, Redwood!\n\nPlatform: Android\nRedwood Version: 0.7.0"
            textSize = 24f
            setPadding(48, 48, 48, 48)
        }
        
        setContentView(textView)
    }
}
