package org.onepointzero.androidstarterkotlin.support

import android.app.Activity
import android.app.Application
import org.onepointzero.androidstarterkotlin.support.di.AppComponent
import org.onepointzero.androidstarterkotlin.support.di.AppModule
import org.onepointzero.androidstarterkotlin.support.di.DaggerAppComponent

class Bootstrap : Application() {

    var component: AppComponent =
            DaggerAppComponent
                    .builder()
                    .appModule(AppModule(this))
                    .build()

    override fun onCreate() {
        super.onCreate()
        component.inject(this)
    }
}

val Activity.app: Bootstrap
    get() = application as Bootstrap
