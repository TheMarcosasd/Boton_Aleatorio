package com.dam2.botonnumal

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.dam2.botonnumal.ui.theme.BotonNumAlTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {

    val num: Int=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BotonNumAlTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}
fun Rarn(): Int {
    val nu: Int = Random.nextInt(0, 10)
    return nu
}
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    var n: Int =Rarn()
    Column {

    Text(
        text = "Numero aleatorio es $n",
        fontSize = 50.sp,
    )
    Button(onClick = {n= Rarn() })
    {
        Text(text = "$n",
            fontSize = 50.sp)
    }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BotonNumAlTheme {
        Greeting("Android")
    }
}