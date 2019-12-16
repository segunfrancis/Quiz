package com.project.segunfrancis.naijahacksquiz

/**
 * Created by SegunFrancis
 */
data class QuizData(
    var subject: String,
    var number: String,
    var question: String,
    var option1: String,
    var option2: String,
    var option3: String,
    var option4: String,
    var answer: Int,
    var userAnswer: Int
) {
    constructor() : this("", "", "", "", "", "", "", -1, -1)
}