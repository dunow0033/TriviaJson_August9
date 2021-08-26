package com.example.triviajson_august9.model.repository

import androidx.lifecycle.MutableLiveData
import com.example.triviajson_august9.model.remote.models.Question

class QuestionRepository {
    val questionList = mutableListOf<Question>()

    var _questionData = MutableLiveData<List<Question>>

    fun addNewQuestion(question: Question) {
        questionList.add(question)

        _questionData.value = questionList
    }
}