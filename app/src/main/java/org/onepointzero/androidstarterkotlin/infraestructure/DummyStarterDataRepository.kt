package org.onepointzero.androidstarterkotlin.infraestructure

import android.content.Context

import io.reactivex.Single
import org.onepointzero.androidstarterkotlin.R
import org.onepointzero.androidstarterkotlin.domain.StarterData
import org.onepointzero.androidstarterkotlin.domain.StarterDataRepository

class DummyStarterDataRepository(private var context: Context) : StarterDataRepository {

    override fun get(): Single<StarterData> {
        val appName = context.resources.getString(R.string.app_name)

        val data = StarterData("Hello $appName!")
        return Single.just<StarterData>(data)
    }
}
