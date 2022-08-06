package com.bhoghem.trailerreviewfilmku.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import kotlin.contracts.Returns

const val BASE_URL= "https://api.themoviedb.org/3/movie/"

class ApiService {
    val endpoint: ApiEndpoint
    get() {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit.create(ApiEndpoint::class.java)
    }
}