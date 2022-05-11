package com.example.davaleba6

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class DeepLink : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (intent.action === Intent.ACTION_VIEW) {
            val uri: Uri? = intent.data
        }
    }
}