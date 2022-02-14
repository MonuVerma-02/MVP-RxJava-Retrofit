package com.mvp.architecture.api

import com.mvp.architecture.common.Constants
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class ApiClient {

    companion object {
        private val retrofit = Retrofit.Builder()
            .client(OkHttpClient.Builder().build())
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()

        fun getApiInstance(): ApiService {
            return retrofit!!.create(ApiService::class.java)
        }
    }
}