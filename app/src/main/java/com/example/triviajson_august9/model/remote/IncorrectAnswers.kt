package com.example.triviajson_august9.model.remote

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class IncorrectAnswers(
    val incorrectAnswers : List<String>
)