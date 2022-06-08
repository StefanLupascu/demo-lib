package com.stefanlupascu.my_library.di.modules

import com.stefanlupascu.my_library.data.BlendInRepository
import com.stefanlupascu.my_library.data.BlendInRepositoryImpl
import org.koin.dsl.module

internal val repositoryModule = module {
    single<BlendInRepository> { BlendInRepositoryImpl(get()) }
}
