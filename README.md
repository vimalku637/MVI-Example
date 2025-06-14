# 🧮 MVI Counter App (Jetpack Compose)

This is a simple example of implementing the **MVI (Model-View-Intent)** architecture in an Android app using **Jetpack Compose** and **ViewModel**.

## 🚀 Features

- ✅ Increment counter using MVI pattern
- ✅ Unidirectional data flow (Intent → ViewModel → State → UI)
- ✅ Jetpack Compose UI with lifecycle-aware ViewModel
- ✅ Lightweight and easy to understand

---

## 🏗️ Architecture: MVI Pattern


### Layers:
- **Intent**: Represents user interactions (e.g., `Increment`)
- **ViewModel**: Handles logic and updates state
- **State**: Immutable UI state
- **View**: Jetpack Compose UI observes the state

---

## 📷 Screenshot

<p align="center">
  <img src="https://via.placeholder.com/300x600.png?text=Counter+App" alt="Counter Screenshot" width="250"/>
</p>

---

## 🧱 Tech Stack

- Kotlin
- Jetpack Compose
- ViewModel (Lifecycle)
- Material 3

## 📦 Dependencies (TOML)

[versions]
lifecycle = "2.7.0"
activity_compose = "1.8.1"
compose_ui = "1.6.4"
material3 = "1.2.0"

[libraries]
lifecycle-viewmodel-compose = { group = "androidx.lifecycle", name = "lifecycle-viewmodel-compose", version.ref = "lifecycle" }
activity-compose = { group = "androidx.activity", name = "activity-compose", version.ref = "activity_compose" }
compose-ui = { group = "androidx.compose.ui", name = "ui", version.ref = "compose_ui" }
material3 = { group = "androidx.compose.material3", name = "material3", version.ref = "material3" }

🛠️ How to Run
Clone the repo:

git clone https://github.com/your-username/mvi-counter-app.git

Open in Android Studio.

Make sure you have the latest Compose + Kotlin plugin.

Run the app on emulator or device.

🙋‍♂️ Author

https://github.com/vimalku637
