package com.example.mvidemo.intents

sealed class CounterIntent {
    object Increment : CounterIntent()
}
