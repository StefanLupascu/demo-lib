package com.stefanlupascu.my_library.di

import org.koin.core.Koin
import org.koin.core.component.KoinComponent

interface BlendInKoinComponent : KoinComponent {

    override fun getKoin(): Koin = BlendInKoinContext.getKoin()
}
