package com.dicoding.mysimplelogin

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

open class Application : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin{
            androidContext(this@Application)
            modules(storageModule)
        }

    }
}