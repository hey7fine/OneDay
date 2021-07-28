package fine.oneday.ui.weather

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha

@Composable
fun WeatherIcon(modifier: Modifier, weather: Weather) {

    val (cur, setCur) = remember { mutableStateOf(weather) }
    var trigger by remember { mutableStateOf(0f) }

    DisposableEffect(weather.composeInfo) {
        trigger = 1f
        onDispose { }
    }

    val animateFloat by animateFloatAsState(
        targetValue = trigger,
        animationSpec = tween(1000)
    ) {
        setCur(weather)
        trigger = 0f
    }

    val composeInfo = remember(animateFloat) {
        cur.composeInfo + (weather.composeInfo - cur.composeInfo) * animateFloat
    }

    Box(modifier){
        ComposedIcon(
            Modifier.align(Center),
            composeInfo
        )
    }
}

@Composable
fun ComposedIcon(modifier: Modifier = Modifier, composeInfo: ComposeInfo) {

    val (sun, cloud, lightCloud, rains, lightRain, snow, thunder) = composeInfo
    Box(modifier = modifier
        .size(WeatherComposedInfo.IconSize)) {

        val _modifier = remember(Unit) {
            { icon: IconInfo ->
                Modifier
                    .offset(
                        icon.size * icon.offset.x,
                        icon.size * icon.offset.y
                    )
                    .size(icon.size * icon.ratio)
                    .alpha(icon.alpha)
            }
        }

        AnimateSun(_modifier(sun))

        AnimateRains(_modifier(rains))

        AnimateRains(_modifier(lightRain), true) // light rain

        AnimateSnow(_modifier(snow))

        AnimateCloud(_modifier(cloud))

        AnimateCloud(_modifier(lightCloud), 1000) // light cloud

        AnimateThunder(_modifier(thunder))
    }
}