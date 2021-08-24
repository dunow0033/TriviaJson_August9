package com.example.triviajson_august9.model.remote

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TriviaResponse(
    val results: List<Question>
)