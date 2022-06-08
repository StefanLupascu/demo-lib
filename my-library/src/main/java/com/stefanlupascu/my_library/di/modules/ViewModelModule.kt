package com.stefanlupascu.my_library.di.modules

import com.stefanlupascu.my_library.ui.BlendInViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

internal val viewModelModule = module {
    viewModel { BlendInViewModel(get()) }
}