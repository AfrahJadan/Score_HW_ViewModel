package com.example.score_hw_viewmodel.model

import androidx.lifecycle.ViewModel

class ScoreViewModel:ViewModel() {
    private var _score = 0
    val score:Int
        get() =_score

    fun getScoreAddOne() {
        _score += 1
    }

    fun getScoreAddFour() {
        _score += 4

    }
    fun getScoreSubTwo() {
        if ( _score >= 2) _score -= 2

    }
}