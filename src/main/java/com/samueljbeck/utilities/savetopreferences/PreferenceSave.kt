package com.samueljbeck.utilities.savetopreferences

import android.content.Context

/*
 * Created by Sam Beck on 10/5/2018
 */
class PreferenceSave {
    companion object {

        private const val TOP_KEY = "com.samueljbeck.top.key"

        operator fun set(context: Context, key: String, value: String?) {
            if (value == null) {
                clear(context, key)
            } else {
                val sharedPreferences = context.getSharedPreferences(
                        TOP_KEY + key,
                        Context.MODE_PRIVATE)
                val editor = sharedPreferences.edit()
                editor.putString(key, value)
                editor.apply()
            }
        }

        fun setSync(context: Context, key: String, value: String) {
            val sharedPreferences = context.getSharedPreferences(
                    TOP_KEY + key,
                    Context.MODE_PRIVATE)
            val editor = sharedPreferences.edit()
            editor.putString(key, value)
            editor.apply()
        }

        operator fun get(context: Context, key: String): String {

            val sharedPreferences = context.getSharedPreferences(
                    TOP_KEY + key,
                    Context.MODE_PRIVATE)
            return sharedPreferences.getString(key, "")
        }

        fun getIfContains(context: Context, key: String, value: String): String {
            return if (contains(context, key)) {
                get(context, key)
            } else {
                value
            }
        }

        fun clear(context: Context, key: String) {

            val sharedPreferences = context.getSharedPreferences(
                    TOP_KEY + key,
                    Context.MODE_PRIVATE)
            val editor = sharedPreferences.edit()
            editor.remove(key)
            editor.apply()
        }

        fun contains(context: Context, key: String): Boolean {
            val sharedPreferences = context.getSharedPreferences(
                    TOP_KEY + key,
                    Context.MODE_PRIVATE)
            return sharedPreferences.contains(key)

        }

        fun setBool(context: Context, key: String, value: Boolean?) {
            set(context, key, if (value != null && value) { "true" }else {"false"})
        }

        fun getBool(context: Context, key: String): Boolean {
            return get(context, key).equals("true", ignoreCase = true)
        }
    }
}