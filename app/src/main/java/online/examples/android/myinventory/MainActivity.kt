package online.examples.android.myinventory

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
    Column(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(0.6f)
            .height(300.dp)
            .background(Color.LightGray),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Up")
        Text(text = "Middle")
        Text(text = "Bottom")
        Spacer(modifier = Modifier.padding(bottom = 16.dp))
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Click Me!")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyInventoryTheme {
        StartingDisplay()
    }
}