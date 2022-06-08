package com.stefanlupascu.my_library

import android.content.Context
import android.content.Intent
import android.util.Log

object Blendin {

    fun init() {
        Log.e("BLENDIN_SDK", "Initializing SDK")
    }

    fun presentQuestionnaire(context: Context) {
        val intent = Intent(context, BlendinActivity::class.java)
        context.startActivity(intent)
    }
}