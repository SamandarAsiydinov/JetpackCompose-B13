package uz.context.composeb13.compose

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import uz.context.composeb13.ui.theme.ComposeB13Theme

class SecondActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeB13Theme(darkTheme = true) {
                Surface(color = MaterialTheme.colors.background) {
                    Preview()
                }
            }
        }
    }
}

@Composable
fun Preview() {
    ExpandableCard()
}