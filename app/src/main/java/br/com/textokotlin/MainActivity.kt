package br.com.textokotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.textokotlin.ui.theme.TextoKotlinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TextoKotlinTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column (modifier = Modifier.padding(16.dp)) {
        Text(
            text = "Estudando texto no Android Studio",
            modifier = Modifier.background(Color(18, 196, 145, 255))
                .border(border = BorderStroke(2.dp, color = Color.Red))
                .fillMaxWidth()
                .padding(horizontal = 32.dp, vertical = 16.dp).align(Alignment.CenterHorizontally),
            fontSize = 24.sp,
            color = Color.Red,
            textAlign = TextAlign.Center,
            lineHeight = 40.sp,
            letterSpacing = 4.sp,
            fontWeight = FontWeight.Bold

        )

    }


}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    TextoKotlinTheme {
        Greeting()
    }
}