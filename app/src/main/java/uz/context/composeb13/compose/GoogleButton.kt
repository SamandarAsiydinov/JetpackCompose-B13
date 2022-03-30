package uz.context.composeb13.compose

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import uz.context.composeb13.R
import uz.context.composeb13.ui.theme.Shapes

@ExperimentalMaterialApi
@Composable
fun GoogleButton(
    text: String = "Sign up with Google",
    loadingText: String = "Creating Account...",
    onClicked: () -> Unit
) {

    var clicked by remember { mutableStateOf(false) }

    Surface(
        onClick = {
            clicked = !clicked
        },
        shape = Shapes.medium,
        border = BorderStroke(width = 1.dp, color = Color.LightGray),
        color = MaterialTheme.colors.surface
    ) {
        Row(
            modifier = Modifier
                .padding(
                    end = 12.dp,
                    top = 8.dp,
                    start = 8.dp,
                    bottom = 8.dp
                )
                .animateContentSize(
                    animationSpec = tween(
                        durationMillis = 300,
                        easing = LinearOutSlowInEasing
                    )
                ),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                modifier = Modifier
                    .width(60.dp)
                    .height(60.dp)
                    .padding(
                        end = 12.dp,
                        top = 8.dp,
                        start = 8.dp,
                        bottom = 8.dp
                    ),
                painter = painterResource(id = R.drawable.ggole),
                contentDescription = "Google Button",
                tint = Color.Unspecified
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = if (clicked) loadingText else text)
            if (clicked) {
                Spacer(modifier = Modifier.width(16.dp))
                CircularProgressIndicator(
                    modifier = Modifier
                        .height(20.dp)
                        .width(20.dp),
                    strokeWidth = 2.dp,
                    color = MaterialTheme.colors.primary
                )
                onClicked()
            }
        }
    }
}

@ExperimentalMaterialApi
@Preview(showBackground = true, widthDp = 350, heightDp = 800)
@Composable
fun GoogleButtonPreview() {
    GoogleButton(
        onClicked = {}
    )
}