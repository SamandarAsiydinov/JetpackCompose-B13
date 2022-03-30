package uz.context.composeb13.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.annotation.ExperimentalCoilApi
import coil.compose.ImagePainter
import coil.compose.rememberImagePainter
import uz.context.composeb13.R

@OptIn(ExperimentalCoilApi::class)
@Composable
fun CoilImage() {
    Box(
        modifier = Modifier
            .height(150.dp)
            .width(150.dp),
        contentAlignment = Alignment.Center
    ) {
        val painter = rememberImagePainter(
            data = "https://avatars.githubusercontent.com/u/14994036?v=4",
            //data = "https://www.google.com/search?q=images&sxsrf=APq-WBvAbABNrX_3iWZ9dpASYEB73gEJzQ:1648559210938&source=lnms&tbm=isch&sa=X&ved=2ahUKEwjg0aLRsev2AhVyhosKHQGsAYIQ_AUoAXoECAEQAw&biw=1777&bih=841&dpr=0.9#imgrc=uDdggi1SmN9sOM",
            builder = {
                placeholder(R.drawable.ic_launcher_background)
                error(R.drawable.ggole)
                crossfade(900)
            }
        )
        val painterState = painter.state
        Image(painter = painter, contentDescription = "Logo Image")
//        if (painterState is ImagePainter.State.Loading) {
//            CircularProgressIndicator()
//        }
    }
}