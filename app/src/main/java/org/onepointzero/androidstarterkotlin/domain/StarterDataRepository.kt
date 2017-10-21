package org.onepointzero.androidstarterkotlin.domain

import io.reactivex.Single

interface StarterDataRepository {
    fun get(): Single<StarterData>
}
