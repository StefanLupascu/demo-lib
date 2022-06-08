package com.stefanlupascu.my_library

import android.content.Context
import android.content.Intent
import android.util.Log
import com.stefanlupascu.my_library.di.BlendInKoinContext
import com.stefanlupascu.my_library.di.modules.appModules
import com.stefanlupascu.my_library.ui.BlendinActivity
import org.koin.dsl.koinApplication

object Blendin {

    fun init() {
        Log.e("BLENDIN_SDK", "Initializing SDK")

        BlendInKoinContext.initialize(koinApplication { modules(appModules) })
    }

    fun presentQuestionnaire(context: Context) {
        val intent = Intent(context, BlendinActivity::class.java)
        context.startActivity(intent)
    }
}