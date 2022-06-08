package com.stefanlupascu.my_library.di

import org.koin.core.KoinApplication

object BlendInKoinContext {

    private lateinit var koinApp: KoinApplication

    fun initialize(koinApp: KoinApplication) {
        this.koinApp = koinApp
    }

    fun getKoin() = koinApp.koin
}
