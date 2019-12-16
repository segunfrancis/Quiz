package com.project.segunfrancis.naijahacksquiz

/**
 * Created by SegunFrancis
 */
object QuestionsUtil {
    fun getQuestions(): ArrayList<QuizData> {
        val mList = ArrayList<QuizData>()
        val question1 = QuizData(
            "math",
            "1",
            "What is addition?",
            "Operator",
            "Number",
            "Aplhabet",
            "Sign",
            1,
            -1
        )
        mList.add(question1)

        val question2 = QuizData(
            "math",
            "2",
            "What is addition?",
            "Operator",
            "Number",
            "Aplhabet",
            "Sign",
            1,
            -1
        )
        mList.add(question2)

        val question3 = QuizData(
            "math",
            "3",
            "What is addition?",
            "Operator",
            "Number",
            "Aplhabet",
            "Sign",
            2,
            -1
        )
        mList.add(question3)

        val question4 = QuizData(
            "math",
            "4",
            "What is addition?",
            "Operator",
            "Number",
            "Aplhabet",
            "Sign",
            2,
            -1
        )
        mList.add(question4)

        val question5 = QuizData(
            "math",
            "5",
            "What is addition?",
            "Operator",
            "Number",
            "Aplhabet",
            "Sign",
            3,
            -1
        )
        mList.add(question5)

        val question6 = QuizData(
            "math",
            "6",
            "What is subtraction?",
            "Operator",
            "Number",
            "Aplhabet",
            "Sign",
            3,
            -1
        )
        mList.add(question6)

        val question7 = QuizData(
            "math",
            "7",
            "What is Alphabet?",
            "Operator",
            "Number",
            "Alphabet",
            "Sign",
            3,
            -1
        )
        mList.add(question7)

        val question8 = QuizData(
            "math",
            "8",
            "What is Alphabet?",
            "Operator",
            "Number",
            "Alphabet",
            "Sign",
            4,
            -1
        )
        mList.add(question8)

        val question9 = QuizData(
            "math",
            "9",
            "What is addition?",
            "Operator",
            "Number",
            "Alphabet",
            "Sign",
            1,
            -1
        )
        mList.add(question9)

        val question10 = QuizData(
            "math",
            "10",
            "What is addition?",
            "Operator",
            "Number",
            "Alphabet",
            "Sign",
            0,
            -1
        )
        mList.add(question10)

        return mList
    }
}