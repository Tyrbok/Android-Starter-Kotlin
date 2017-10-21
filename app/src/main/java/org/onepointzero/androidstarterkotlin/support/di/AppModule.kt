package org.onepointzero.androidstarterkotlin.support.di

import dagger.Module
import dagger.Provides
import org.onepointzero.androidstarterkotlin.application.GetStarterData
import org.onepointzero.androidstarterkotlin.application.MainPresenter
import org.onepointzero.androidstarterkotlin.domain.StarterDataRepository
import org.onepointzero.androidstarterkotlin.infraestructure.DummyStarterDataRepository
import org.onepointzero.androidstarterkotlin.support.Bootstrap
import javax.inject.Singleton

@Module
@Singleton
class AppModule(val app: Bootstrap) {

    @Provides @Singleton fun provideApp() = app

    @Provides fun mainPresenter(getStarterData: GetStarterData)
            = MainPresenter(getStarterData)

    @Provides fun starterDataRepository(): StarterDataRepository
            = DummyStarterDataRepository(app.applicationContext)

    @Provides fun getStarterData(mainRepository: StarterDataRepository)
            = GetStarterData(mainRepository)
}