package com.example.triviajson_august9.model.remote.models

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class IncorrectAnswers(
    val incorrectAnswers : List<String>
)