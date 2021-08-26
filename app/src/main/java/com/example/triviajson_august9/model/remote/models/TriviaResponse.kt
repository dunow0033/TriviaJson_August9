package com.example.triviajson_august9.model.remote.models

import com.example.triviajson_august9.model.remote.models.Question
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TriviaResponse(
    val results: List<Question>
)