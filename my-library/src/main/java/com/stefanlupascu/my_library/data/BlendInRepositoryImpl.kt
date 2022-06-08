package com.stefanlupascu.my_library.data

internal class BlendInRepositoryImpl(private val service: BlendInService) : BlendInRepository {

    override fun get() = "test repo"
}
