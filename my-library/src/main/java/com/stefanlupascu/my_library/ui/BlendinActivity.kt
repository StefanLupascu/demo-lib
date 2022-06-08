package com.stefanlupascu.my_library.ui

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatTextView
import com.stefanlupascu.my_library.R
import com.stefanlupascu.my_library.di.BlendInKoinComponent
import org.koin.androidx.viewmodel.ext.android.viewModel

internal class BlendinActivity : AppCompatActivity(), BlendInKoinComponent {

    private val viewModel by viewModel<BlendInViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_questionnaire)
        findViewById<AppCompatTextView>(R.id.test_text).text = viewModel.get()
    }
}