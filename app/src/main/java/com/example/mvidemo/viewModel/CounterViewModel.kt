package com.example.mvidemo.viewModel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.mvidemo.intents.CounterIntent
import com.example.mvidemo.data.CounterState

class CounterViewModel : ViewModel() {

    private val _state = mutableStateOf(CounterState())// Mutable
    val state: State<CounterState> = _state            // Immutable to UI

    fun onIntent(intent: CounterIntent) {
        when (intent) {
            is CounterIntent.Increment -> {
                val newCount = _state.value.count + 1
                _state.value = _state.value.copy(count = newCount)// Always use .copy()!
            }
        }
    }
}
