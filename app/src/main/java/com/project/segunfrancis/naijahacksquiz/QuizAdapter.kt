package com.project.segunfrancis.naijahacksquiz

import android.util.Log
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ProgressBar
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.core.view.get
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.quiz_item_list.view.*
import java.util.zip.Inflater

/**
 * Created by SegunFrancis
 */
class QuizAdapter(private var data: List<QuizData>) : RecyclerView.Adapter<QuizAdapter.QuizViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuizViewHolder {
        val root = LayoutInflater.from(parent.context).inflate(R.layout.quiz_item_list, parent, false)
        return QuizViewHolder(root)
    }

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: QuizViewHolder, position: Int) {
        holder.bind(data[position])
    }

    class QuizViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        lateinit var myPrefs: MyPrefs
        fun bind(item: QuizData) = with(itemView) {
            myPrefs = MyPrefs(context)
            questionTextView.text = item.question
            option1Text.text = item.option1
            option2Text.text = item.option2
            option3Text.text = item.option3
            option4Text.text = item.option4
            questionNumber.text = item.number
            val progressBar = findViewById<ProgressBar>(R.id.progress_bar)
            /*options_radio_group.setOnCheckedChangeListener { radioGroup, i ->
                if (radioGroup.checkedRadioButtonId != -1) {
                    // checked
                }
            }*/
            options_radio_group.setOnCheckedChangeListener { radioGroup, i ->
                val data = QuizData()
                val checkedRadioButton = radioGroup.findViewById<RadioButton>(i)
                val checkedIndex = radioGroup.indexOfChild(checkedRadioButton)
                data.userAnswer = checkedIndex
                Log.d("Answer", "${data.userAnswer}")
            }

            setOnClickListener {
                // TODO: Handle on click
            }
        }

        /*private fun checkProgress(size: Int, count: Int) {
            val percentage = (count / size) * 100
            count += 1
            //Log.d("ADAPTER", "$percentage")
            Log.d("ADAPTER", "$count")
            Log.d("ADAPTER", "$size")
        }*/
    }
}