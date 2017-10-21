package org.onepointzero.androidstarterkotlin.support.di

import org.onepointzero.androidstarterkotlin.application.MainActivity

import dagger.Component
import org.onepointzero.androidstarterkotlin.support.Bootstrap

@Component(modules = arrayOf(AppModule::class)) interface AppComponent {
    fun inject(app: Bootstrap)
    fun inject(activity: MainActivity)
}
