package online.examples.android.myinventory

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import online.examples.android.myinventory.ui.theme.MyInventoryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyInventoryTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {

                    StartingDisplay()

                }
            }
        }
    }
}

@Composable
fun StartingDisplay() {
    Column {
        Text(text = "Attention:")
        Text(text = "This is very important.")
        Text(text = "And much faster.")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyInventoryTheme {
        StartingDisplay()
    }
}