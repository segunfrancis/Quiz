package com.project.segunfrancis.naijahacksquiz

import android.content.Context
import com.google.gson.Gson

/**
 * Created by SegunFrancis
 */
class MyPrefs(context: Context) {
    val sharedPreferences = context.getSharedPreferences("my_pref_class", Context.MODE_PRIVATE)

    fun setList(items: ArrayList<QuizData>) {
        val editor = sharedPreferences.edit()
        val gson = Gson()
        val json = gson.toJson(items)
        editor.putString("adapter_items", json)
        editor.apply()
    }

    fun getList(): ArrayList<QuizData> {
        val gson = Gson()
        val json = sharedPreferences.getString("adapter_items", "")
        return gson.fromJson(json, ArrayList<QuizData>().javaClass)
    }
}