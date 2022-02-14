package com.mvp.architecture.api

import com.mvp.architecture.model.Places
import io.reactivex.Observable
import retrofit2.http.GET

interface ApiService {

    @GET("visitlocations")
    fun getPlacesLocation(): Observable<List<Places>>
}