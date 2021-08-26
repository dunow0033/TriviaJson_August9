package com.example.triviajson_august9.services

import com.example.triviajson_august9.model.remote.models.TriviaResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface TriviaService {

    @GET("/api.php")
    suspend fun getTrivia(
        @Query("amount") amount: Int
    ): Response<TriviaResponse>
}