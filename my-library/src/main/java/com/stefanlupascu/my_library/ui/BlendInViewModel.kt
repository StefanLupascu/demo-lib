package com.stefanlupascu.my_library.ui

import androidx.lifecycle.ViewModel
import com.stefanlupascu.my_library.data.BlendInRepository

internal class BlendInViewModel(private val repository: BlendInRepository) : ViewModel() {

    fun get() = repository.get()
}
