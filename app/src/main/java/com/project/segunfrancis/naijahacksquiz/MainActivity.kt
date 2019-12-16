package com.project.segunfrancis.naijahacksquiz

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ProgressBar
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.gson.Gson
import com.project.segunfrancis.naijahacksquiz.QuestionsUtil.getQuestions
import kotlinx.android.synthetic.main.activity_main.*
import java.io.IOException
import java.nio.charset.Charset

class MainActivity : AppCompatActivity() {

    //var mList: ArrayList<QuizData> = ArrayList()
    private var mJsonString: String? = ""
    private lateinit var myPrefs: MyPrefs
    private var score = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myPrefs = MyPrefs(this)

        val quizAdapter = QuizAdapter(getQuestions())
        recycler_view.adapter = quizAdapter
        recycler_view.layoutManager = LinearLayoutManager(this)

//        someTask().execute()
//       parseJson()
        submit_button.setOnClickListener {
            submit()
            Log.d("Score", "$score")
            Toast.makeText(this, "You scored $score", Toast.LENGTH_LONG).show()
        }
    }

    private fun submit() {
        for (answer in getQuestions()) {
            if (answer.userAnswer == answer.answer) {
                score++
            }
            Log.d("userAnswer", "${answer.userAnswer}")
            Log.d("answer", "${answer.answer}")
        }
    }

/*    fun loadJsonFromAsset(fileName: String): String? {
        var json: String? = null
        try {
            val inputStream = assets.open(fileName)
            val size = inputStream.available()
            val buffer = ByteArray(size)
            inputStream.read(buffer)
            inputStream.close()
            json = String(buffer, Charset.forName("UTF-8"))
        } catch (e: IOException) {
            e.printStackTrace()
            return null
        }
        return json
    }*/

/*    inner class someTask : AsyncTask<Void, Void, String>() {
        override fun doInBackground(vararg params: Void?): String? {
            mJsonString = loadJsonFromAsset("quiz.json")
            return null
        }

        override fun onPreExecute() {
            super.onPreExecute()
            // ...
        }

        override fun onPostExecute(result: String?) {
            //super.onPostExecute(result)
            val quizAdapter = QuizAdapter(mList)
            recycler_view.adapter = quizAdapter
            recycler_view.layoutManager = LinearLayoutManager(this@MainActivity)
        }
    }*/

/*    private fun parseJson() {
        if (mJsonString != null) {
            val gson = Gson()
            val quizData = gson.fromJson(mJsonString, QuizData1::class.java)
            if (quizData != null) {
                val questions = quizData.quiz
                for (items in questions) {
                    if (items.subject == "math")
                        mList.add(items)
                }
                myPrefs.setList(mList)
            }
        }
    }*/
}
