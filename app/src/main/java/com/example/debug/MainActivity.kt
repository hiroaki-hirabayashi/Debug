package com.example.debug

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        logging()
    }




    fun logging() {
        Log.e(TAG, "ERROR: アプリクラッシュ")
        Log.w(TAG, "WARN:  重大なエラーの可能性")
        Log.i(TAG, "INFO: 操作の引き継ぎなど、技術的な情報を報告する")
        Log.d(TAG, "DEBUG:  デバッグに役立つ技術情報を報告")
        Log.v(TAG, "VERBOSE: more verbose than DEBUG logs")
    }
}