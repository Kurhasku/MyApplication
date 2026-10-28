
package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.padding
import com.example.myapplication.ui.theme.MyApplicationTheme

class DetailsActivity : ComponentActivity() {

    companion object {
        private const val TAG = "DetailsActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d(TAG, "onCreate called")

        val receivedData = intent.getStringExtra("EXTRA_MESSAGE")
        Log.d(TAG, "Received data: $receivedData")

        setContent {
            MyApplicationTheme {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(24.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(text = "Details Activity")
                    Text(
                        text = receivedData ?: "No data received",
                        modifier = Modifier.padding(top = 16.dp)
                    )
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume called")
    }

    override fun onPause() {
        Log.d(TAG, "onPause called")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG, "onStop called")
        super.onStop()
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart called")
    }

    override fun onDestroy() {
        Log.d(TAG, "onDestroy called")
        super.onDestroy()
    }
}
