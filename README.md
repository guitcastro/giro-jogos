# Giro Jogos

A multiplatform "Hello World" application built with [Redwood](https://github.com/cashapp/redwood) v0.7.0 and [Amper](https://github.com/JetBrains/amper).

## Overview

This project demonstrates a simple multiplatform Kotlin application using Redwood UI framework. The application displays "Hello, Redwood!" message across JVM, JavaScript, Android, and iOS platforms.

## Prerequisites

- **JDK 17 or higher** - For JVM target
- **Amper** - Build tool for Kotlin Multiplatform projects
- **Android SDK** (API 24+) - For Android target
- **Xcode** (macOS only) - For iOS target
- **Node.js** - For JavaScript target

## Project Structure

```
giro-jogos/
├── amper.yaml                    # Amper build configuration
├── src@jvm/                      # JVM-specific code
│   └── giros/jogo/
│       └── Main.kt
├── src@js/                       # JavaScript-specific code
│   └── giros/jogo/
│       └── Main.kt
├── src@android/                  # Android-specific code
│   └── giros/jogo/
│       └── MainActivity.kt
├── src@ios/                      # iOS-specific code
│   └── giros/jogo/
│       └── Main.kt
└── .github/workflows/ci.yaml     # CI/CD configuration
```

## Setup

1. **Clone the repository:**
   ```bash
   git clone https://github.com/guitcastro/giro-jogos.git
   cd giro-jogos
   ```

2. **Install Amper:**
   Follow the [Amper installation guide](https://github.com/JetBrains/amper#installation).

## Building

### Build All Platforms
```bash
amper build
```

### Build Specific Platform
```bash
# JVM
amper build --platform jvm

# JavaScript
amper build --platform js

# Android
amper build --platform android

# iOS
amper build --platform iosArm64
```

## Running

### JVM
```bash
amper run --platform jvm
```

### JavaScript
```bash
amper run --platform js
```

### Android
```bash
amper run --platform android
```

### iOS
```bash
amper run --platform iosArm64
```

## Dependencies

- **Redwood v0.7.0** - UI framework for Kotlin Multiplatform
  - redwood-layout-view
  - redwood-widget
  - redwood-lazylayout-compose
  - redwood-layout-uiview (iOS)
- **AndroidX AppCompat 1.6.1** (Android)
- **AndroidX Activity Compose 1.8.0** (Android)

## CI/CD

The project uses GitHub Actions for continuous integration. On every push and pull request, the workflow:
- Builds the project for all platforms
- Runs tests (if available)
- Validates code compilation

## Platform Support

- ✅ **JVM** (Java 17+)
- ✅ **JavaScript** (Browser/Node.js)
- ✅ **Android** (API 24+)
- ✅ **iOS** (ARM64 and Simulator ARM64)

## License

This project is part of the Giro Jogos initiative.

## Contributing

Contributions are welcome! Please feel free to submit a Pull Request.
