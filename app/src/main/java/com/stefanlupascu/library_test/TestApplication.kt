package com.stefanlupascu.library_test

import android.app.Application
import com.stefanlupascu.my_library.Blendin
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class TestApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        Blendin.init()
    }
}