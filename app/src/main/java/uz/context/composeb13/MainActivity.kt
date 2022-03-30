package uz.context.composeb13


import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import uz.context.composeb13.compose.*
import uz.context.composeb13.model.Message
import uz.context.composeb13.ui.theme.ComposeB13Theme
import uz.context.composeb13.ui.theme.CustomItem
import uz.context.composeb13.ui.theme.color1
import uz.context.composeb13.ui.theme.color2
import uz.context.composeb13.utils.PersonRepository

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterialApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeB13Theme() {

            }
        }
    }
}

/*
@Composable
fun Counter() {
    var count by remember { mutableStateOf(0) }
    Button(
        modifier = Modifier
            .padding(15.dp),
        onClick = {
            count++
        }) {
        Text(
            text = "Plus",
            fontSize = Typography().subtitle1.fontSize
        )
    }
    Text(
        modifier = Modifier
            .padding(vertical = 10.dp),
        text = count.toString(),
        fontSize = 25.sp
    )
    Button(
        modifier = Modifier
            .padding(15.dp),
        onClick = {
            if (count > 0) {
                count--
            }
        }) {
        Text(
            text = "Minus",
            fontSize = Typography().subtitle1.fontSize
        )
    }
}

 */
/*
@Composable
fun InitViews() {

    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        var text by remember { mutableStateOf("Type here...") }

        OutlinedTextField(
            value = text,
            onValueChange = { newText ->
                text = newText
            },
            label = {
                Text(
                    text = "Title"
                )
            },
            leadingIcon = {
                IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.Filled.Email,
                        contentDescription = "TextField"
                    )
                }
            },
            trailingIcon = {
                IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.Filled.Check,
                        contentDescription = "TextField"
                    )
                }
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email,
                imeAction = ImeAction.Send
            ),
            keyboardActions = KeyboardActions(
                onSearch = {
                    Toast.makeText(context, "Hello", Toast.LENGTH_SHORT).show()
                }
            )
        )
    }
}

/*
@Composable
fun ColumnScope.CustomItem(weight: Float, color: Color = MaterialTheme.colors.primary) {
    Surface(
        modifier = Modifier
            .width(200.dp)
            .weight(weight),
        color = color
    ) {}
}

@Preview(showBackground = true, widthDp = 350, heightDp = 780)
@Composable
fun DefaultPreview() {
    ComposeB13Theme {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            CustomItem(weight = 3f, color = MaterialTheme.colors.secondary)
            CustomItem(weight = 2f)
        }
    }
}

 */
 */
/*
@Composable
fun ExpandableCard(title: String, body: String) {
    var expanded by remember { mutableStateOf(false)}
    
    Card {
        Column {
            Text(text = title)
            if (expanded) {
                Text(text = body)
                IconButton(onClick = {expanded = false}) {
                    Icon(Icons.Default.KeyboardArrowDown, contentDescription = "Collapse")
                }
            } else {
                IconButton(onClick = {expanded = true}) {
                    Icon(Icons.Default.KeyboardArrowUp, contentDescription = "Expand")
                }
            }
        }
    }
}

 */
/*
@Composable
fun Conversation(messages: List<Message>) {
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(messages) { message ->
            ItemMessage(message = message)
        }
    }
}


@Composable
fun ItemMessage(message: Message) {

    val context = LocalContext.current

    var isExpanded = remember {
        mutableStateOf(false)
    }

    val surfaceColor: Color by animateColorAsState(
        if (isExpanded.value) MaterialTheme.colors.primary else MaterialTheme.colors.surface
    )

    Row(modifier = Modifier
        .padding(8.dp)
        .clickable {
            Toast
                .makeText(context, message.name, Toast.LENGTH_SHORT)
                .show()
        }) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = null,
            modifier = Modifier
                .size(40.dp)
                .clip(RoundedCornerShape(16.dp))
                .border(
                    width = 1.5.dp,
                    MaterialTheme.colors.secondaryVariant,
                    RoundedCornerShape(16.dp)
                )
        )
        Spacer(modifier = Modifier.width(8.dp))
        Column() {
            Text(
                text = message.name,
                color = Color.Black,
                fontSize = 18.sp,
                style = MaterialTheme.typography.subtitle1
            )
            Spacer(modifier = Modifier.height(8.dp))

            Surface(
                color = surfaceColor, shape = MaterialTheme.shapes.medium, elevation = 15.dp,
                modifier = Modifier
                    .animateContentSize()
                    .padding(1.dp)
            ) {
                Text(
                    text = message.description,
                    style = MaterialTheme.typography.subtitle2,
                    maxLines = if (isExpanded.value) Int.MAX_VALUE else 1
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeB13Theme {

    }
}
*/