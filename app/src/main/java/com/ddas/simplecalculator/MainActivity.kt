package com.ddas.simplecalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.ddas.simplecalculator.ui.theme.SimpleCalculatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SimpleCalculatorTheme {
                val viewModel= viewModel<CalculatorViewModel>()
                val state= viewModel.state
                val buttonSpacing= 8.dp
                Calculator(
                    state = state,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp)
                        .background(Color.Black),
                    buttonSpacing= buttonSpacing,
                    onAction = viewModel::onAction)
            }
        }
    }
}
