package com.example.triviajson_august9.model.remote.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Question(
    val category : String,
    val type : String,
    val difficulty : String,
    val question : String,
    @get:Json(name = "correct_answer")
    val correctAnswer : String,
    @get:Json(name = "incorrect_answers")
    val incorrectAnswers : IncorrectAnswers
)
