package fine.oneday.ui.weather

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import fine.oneday.ui.weather.WeatherAnimateIcon.CloudyAnimateIcon
import fine.oneday.ui.weather.WeatherAnimateIcon.HeavyRainAnimateIcon
import fine.oneday.ui.weather.WeatherAnimateIcon.MostlyClearAnimateIcon
import fine.oneday.ui.weather.WeatherAnimateIcon.RainAnimateIcon
import fine.oneday.ui.weather.WeatherAnimateIcon.SnowAnimateIcon
import fine.oneday.ui.weather.WeatherAnimateIcon.SunnyAnimateIcon
import fine.oneday.ui.weather.WeatherAnimateIcon.ThunderStormAnimateIcon
import fine.oneday.ui.weather.WeatherComposedInfo.CloudyComposed
import fine.oneday.ui.weather.WeatherComposedInfo.CloudyRainComposed
import fine.oneday.ui.weather.WeatherComposedInfo.HeavyRainComposed
import fine.oneday.ui.weather.WeatherComposedInfo.MostlyClearComposed
import fine.oneday.ui.weather.WeatherComposedInfo.SnowyComposed
import fine.oneday.ui.weather.WeatherComposedInfo.SunnyComposed
import fine.oneday.ui.weather.WeatherComposedInfo.ThunderStormComposed
import fine.oneday.ui.weather.WeatherIcon.CloudyIcon
import fine.oneday.ui.weather.WeatherIcon.HeavyRainIcon
import fine.oneday.ui.weather.WeatherIcon.MostlyClearIcon
import fine.oneday.ui.weather.WeatherIcon.RainIcon
import fine.oneday.ui.weather.WeatherIcon.SnowyIcon
import fine.oneday.ui.weather.WeatherIcon.SunnyIcon
import fine.oneday.ui.weather.WeatherIcon.ThunderStormIcon

enum class Weather(
    val text: String = "",
    val composeInfo: ComposeInfo,
    val icon: @Composable () -> Unit,
    val animateIcon: @Composable () -> Unit,
    val background: Color
) {
    Sunny(
        "Sunny",
        SunnyComposed, SunnyIcon, SunnyAnimateIcon, Color(0xFF9DD8F1)
    ),
    MostlyClear(
        "Clear with periodic clouds",
        MostlyClearComposed, MostlyClearIcon, MostlyClearAnimateIcon, Color(0xFF9DD8F1)
    ),

    Cloudy(
        "Cloudy",
        CloudyComposed, CloudyIcon, CloudyAnimateIcon, Color(0xFF9DD8F1)
    ),

    CloudyRain(
        "Cloudy with periodic showers",
        CloudyRainComposed, RainIcon, RainAnimateIcon, Color(0xFF9DD8F1)
    ),

    HeavyRain(
        "Heavy rain",
        HeavyRainComposed, HeavyRainIcon, HeavyRainAnimateIcon, Color(0xFF9DD8F1)
    ),

    Snowy(
        "Snowy",
        SnowyComposed, SnowyIcon, SnowAnimateIcon, Color(0xFF9DD8F1)
    ),

    Storm(
        "Thundery storm",
        ThunderStormComposed, ThunderStormIcon, ThunderStormAnimateIcon, Color(0xFF9DD8F1)
    )
}

object WeatherIcon {
    val SunnyIcon = @Composable {
        Sun(Modifier.size(40.dp))
    }

    val MostlyClearIcon = @Composable {
        Box(Modifier.size(40.dp)) {
            Sun(
                Modifier
                    .size(40.dp)
                    .offset(3.dp)
            )
            Cloud(
                Modifier
                    .size(16.dp)
                    .offset(8.dp, 18.dp)
            )
        }
    }

    val CloudyIcon = @Composable {
        Cloud(
            Modifier
                .size(40.dp)
                .padding(3.dp)
        )
    }

    val RainIcon = @Composable {
        Box(Modifier.size(40.dp)) {
            Rains(
                Modifier
                    .size(25.dp)
                    .offset(5.dp, 8.dp),
                lightRain = true
            )
            Cloud(
                Modifier
                    .size(30.dp)
                    .align(Alignment.TopCenter)
            )
        }
    }

    val HeavyRainIcon = @Composable {
        Box(Modifier.size(40.dp)) {
            Rains(
                Modifier
                    .size(25.dp)
                    .offset(5.dp, 8.dp),
            )
            Cloud(
                Modifier
                    .size(30.dp)
                    .align(Alignment.TopCenter)
            )
        }
    }

    val SnowyIcon = @Composable {
        Box(Modifier.size(40.dp)) {
            Snow(
                Modifier
                    .size(20.dp)
                    .offset(3.dp, 8.dp),
            )
            Cloud(
                Modifier
                    .size(30.dp)
                    .align(Alignment.TopCenter)
            )
        }
    }

    val ThunderStormIcon = @Composable {
        Box(Modifier.size(40.dp)) {

            Cloud(
                Modifier
                    .size(30.dp)
                    .align(Alignment.TopCenter)
            )
            Thunder(
                Modifier
                    .size(20.dp)
                    .offset(10.dp, 18.dp),
            )
        }
    }
}

object WeatherAnimateIcon {
    val SunnyAnimateIcon = @Composable {
        AnimateSun(
            Modifier
                .size(40.dp)
                .padding(2.dp)
        )
    }

    val MostlyClearAnimateIcon = @Composable {
        Box(
            Modifier
                .size(40.dp)
        ) {
            AnimateSun(
                Modifier
                    .size(40.dp)
                    .offset(3.dp)
            )
            Cloud(
                Modifier
                    .size(16.dp)
                    .offset(8.dp, 18.dp)
            )
        }
    }

    val CloudyAnimateIcon = @Composable {
        AnimateCloud(
            Modifier
                .size(40.dp)
                .padding(3.dp),
            800
        )
    }

    val RainAnimateIcon = @Composable {
        Box(Modifier.size(40.dp)) {
            AnimateRains(
                Modifier
                    .size(25.dp)
                    .offset(5.dp, 8.dp),
                true
            )
            Cloud(
                Modifier
                    .size(30.dp)
                    .align(Alignment.TopCenter)
            )
        }
    }

    val HeavyRainAnimateIcon = @Composable {
        Box(Modifier.size(40.dp)) {
            AnimateRains(
                Modifier
                    .size(25.dp)
                    .offset(5.dp, 8.dp)
            )
            Cloud(
                Modifier
                    .size(30.dp)
                    .align(Alignment.TopCenter)
            )
        }
    }

    val SnowAnimateIcon = @Composable {
        Box(Modifier.size(40.dp)) {
            AnimateSnow(
                Modifier
                    .size(20.dp)
                    .offset(3.dp, 8.dp),
            )
            Cloud(
                Modifier
                    .size(30.dp)
                    .align(Alignment.TopCenter)
            )
        }
    }

    val ThunderStormAnimateIcon = @Composable {
        Box(Modifier.size(40.dp)) {
            Cloud(
                Modifier
                    .size(30.dp)
                    .align(Alignment.TopCenter)
            )
            AnimateThunder(
                Modifier
                    .size(20.dp)
                    .offset(10.dp, 18.dp),
                300
            )
        }
    }
}