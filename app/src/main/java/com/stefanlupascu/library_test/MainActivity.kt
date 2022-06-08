package com.stefanlupascu.library_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.stefanlupascu.my_library.Blendin

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        findViewById<AppCompatButton>(R.id.start_button).setOnClickListener {
            Blendin.presentQuestionnaire(this)
        }
    }
}