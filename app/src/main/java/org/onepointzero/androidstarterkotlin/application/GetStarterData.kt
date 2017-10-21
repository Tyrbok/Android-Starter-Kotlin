package org.onepointzero.androidstarterkotlin.application

import io.reactivex.Single
import org.onepointzero.androidstarterkotlin.domain.StarterData
import org.onepointzero.androidstarterkotlin.domain.StarterDataRepository

class GetStarterData(private val starterDataRepository: StarterDataRepository) {

    fun execute(): Single<String> {
        return starterDataRepository
                .get()
                .map(StarterData::message)
    }
}
