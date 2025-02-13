import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            myfun();

        }
    }
}

@Composable
fun myfun() {
    Column(modifier = Modifier.background(Color.White)) {
        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxSize()
        ) {
            Text(
                "Sprawdzian!",
                fontWeight = FontWeight.Thin,
                fontSize = 40.sp,
                color = Color.White,
                modifier = Modifier
                    .background(Color.Blue)
                    .fillMaxWidth(),
                textAlign = TextAlign.Center
            )
            LinearProgressIndicator(
                color = Color.Red,
                trackColor = Color.Blue,
                modifier = Modifier.fillMaxWidth()
            )
            HorizontalDivider(thickness = 20.dp, color = Color.Green)
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight(),
                contentAlignment = Alignment.Center
            ) {
                CircularProgressIndicator()
            }
            HorizontalDivider(thickness = 20.dp, color = Color.Red,)
            CircularProgressIndicator(
                progress = 0.85F
            )
            Text(
                "Koniec sprawdzianu",
                fontWeight = FontWeight.Bold,
                fontSize = 35.sp,
                color = Color.Blue
            )
        }
    }
}
