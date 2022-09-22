package com.example.koinexample

import org.koin.core.module.Module
import org.koin.dsl.module

val appModules : Module = module {
    single { StudentCource() }
    factory {StudentFriend() }
    factory { Student(get(),get()) }
}