import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import com.example.androidassignment.ui.theme.Offwhite
import com.example.androidassignment.ui.theme.Serc

@Composable
fun HelpScreen() {
        Box(modifier = Modifier.fillMaxSize()) {
            Column (modifier = Modifier
                .fillMaxSize()
                .background(color = Offwhite)//CHANGE BACKGROUND COLOUR
                .align(Alignment.Center),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "Help help xxx", fontSize = 30.sp)
                Text(text = "Need Help? We're here for you!", fontSize = 16.sp)
            }
        }
    }
