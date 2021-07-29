package fine.oneday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.animateOffsetAsState
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation
import fine.oneday.ui.weather.Weather
import fine.oneday.ui.theme.OneDayTheme
import fine.oneday.ui.theme.sunny_blue
import fine.oneday.ui.weather.WeatherIcon

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OneDayTheme {
                val navController = rememberNavController()
                Scaffold(bottomBar = {
                    BottomAppBar {

                    }
                }) {
                    NavHost(navController ,startDestination = "",Modifier.padding(it)){
                        navigation(HomeDestination.Home.route,"main"){
                            composable(HomeDestination.Home.route){

                            }
                            composable(HomeDestination.Discovery.route){

                            }
                            composable(HomeDestination.Profile.route){

                            }
                        }
                        composable("weather"){

                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Layer(
    front:@Composable BoxScope.(Boolean)->Unit,
    child:@Composable (MutableState<Boolean>)->Unit
) {
    val expand = remember {
        mutableStateOf(false)
    }
    val mExpand by expand
    Box(modifier = Modifier){
        Card(modifier = if (mExpand) Modifier
            .animateContentSize() else Modifier
            .animateContentSize()
            .padding(top = 60.dp, start = 16.dp, end = 16.dp),
            shape = if (mExpand) RoundedCornerShape(0.dp) else RoundedCornerShape(8.dp),
            backgroundColor = sunny_blue) {
            child(expand)
        }
        front(expand.value)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    OneDayTheme {
        Layer(front = {
            val offset by animateOffsetAsState(targetValue = if (it) Offset(-60f,60f) else Offset.Zero)
            val offset2 by animateOffsetAsState(targetValue = if (it) Offset(0f,60f) else Offset.Zero)
            Column(
                Modifier
                    .animateContentSize()
                    .padding(top = 60.dp, start = 16.dp, end = 16.dp)
                    .height(160.dp)
                    .padding(horizontal = 8.dp)
                    .padding(bottom = 4.dp)
            ) {
                Text(text = "正在下小雨,预测雨势会变大。\n外出时一定不要忘记带好雨伞。",
                    style = MaterialTheme.typography.body1,
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .offset(offset2.x.dp, offset2.y.dp)
                        .fillMaxWidth()
                        .padding(vertical = 28.dp))
                Row(Modifier.offset(offset2.x.dp,offset2.y.dp)) {
                    Text(text = "30°",
                        color = Color.White,style = MaterialTheme.typography.h3,modifier = Modifier.align(
                            Alignment.Bottom
                        ))
                    Spacer(modifier = Modifier.width(8.dp))
                    Column {
                        Spacer(modifier = Modifier.weight(1f))
                        Text(text = "28° / 30°",
                            color = Color.White)
                        Text(text = "体感 30°",
                            color = Color.White)
                    }
                    Spacer(modifier = Modifier.weight(1f))
                    Column {
                        Spacer(modifier = Modifier.weight(1f))
                        Text(text = "虎丘区",
                            color = Color.White)
                    }
                }
            }
            WeatherIcon(modifier = Modifier
                .offset(offset.x.dp, offset.y.dp)
                .align(Alignment.TopEnd), weather = Weather.Sunny )
        }) {
            if (it.value){
                LazyColumn(Modifier
                    .clickable { it.value = !it.value }
                    .fillMaxSize()) {

                }
            }else{
                Box(modifier = Modifier
                    .clickable { it.value = !it.value }
                    .fillMaxWidth()
                    .height(160.dp)
                    .padding(horizontal = 8.dp)
                    .padding(bottom = 4.dp))
            }
        }
    }
}