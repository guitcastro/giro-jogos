package giros.jogo

import platform.UIKit.*
import platform.Foundation.*

/**
 * Main entry point for the iOS platform.
 * Displays "Hello, Redwood!" using Redwood UI framework.
 */
fun main() {
    println("Hello, Redwood!")
    println("Platform: iOS")
    println("Redwood Version: 0.7.0")
}

/**
 * iOS Application Delegate
 */
class AppDelegate : UIResponder, UIApplicationDelegateProtocol {
    companion object : UIResponderMeta(), UIApplicationDelegateProtocolMeta
    
    @OverrideInit
    constructor() : super()
    
    private var _window: UIWindow? = null
    
    override fun window() = _window
    override fun setWindow(window: UIWindow?) {
        _window = window
    }
    
    override fun application(
        application: UIApplication,
        didFinishLaunchingWithOptions: Map<Any?, *>?
    ): Boolean {
        _window = UIWindow(frame = UIScreen.mainScreen.bounds)
        
        val viewController = UIViewController()
        val label = UILabel(frame = UIScreen.mainScreen.bounds).apply {
            text = "Hello, Redwood!\n\nPlatform: iOS\nRedwood Version: 0.7.0"
            numberOfLines = 0
            textAlignment = NSTextAlignmentCenter
        }
        
        viewController.view.addSubview(label)
        viewController.view.backgroundColor = UIColor.whiteColor
        
        _window?.rootViewController = viewController
        _window?.makeKeyAndVisible()
        
        return true
    }
}
