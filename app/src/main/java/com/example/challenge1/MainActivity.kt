package com.example.challenge1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.challenge1.ui.theme.Challenge1Theme

import com.example.challenge1.screens.RegisterScreen
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Challenge1Theme {
                RegisterScreen()
            }
        }
    }
}