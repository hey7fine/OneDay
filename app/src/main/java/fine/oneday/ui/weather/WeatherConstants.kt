package fine.oneday.ui.weather

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.unit.dp

object WeatherComposedInfo {

    val IconSize = 120.dp // ComposedIcon size

    val SunnyComposed = ComposeInfo(
        sun = IconInfo(1f),
        cloud = IconInfo(0.8f, Offset(-0.1f, 0.1f),0f),
        lightCloud = IconInfo(0.5f, Offset(-0.15f, 0.35f),0f),
        rains = IconInfo(0.4f, Offset(0.225f, 0.3f),0f),
        lightRain = IconInfo(0.4f, Offset(0.225f, 0.3f),0f),
        snow = IconInfo(0.5f, Offset(0.1f, 0.3f),0f),
        thunder = IconInfo(0.45f, Offset(0.29f, 0.6f), 0f)
    )

    val MostlyClearComposed = ComposeInfo(
        sun = IconInfo(0.85f, Offset(0.175f, 0f)),
        cloud = IconInfo(0.5f, Offset(-0.1f, 0.1f), 0f),
        lightCloud = IconInfo(0.7f, Offset(0.125f, 0.35f), 1f),
        rains = IconInfo(0.4f, Offset(0.225f, 0.3f), 0f),
        lightRain = IconInfo(0.4f, Offset(0.225f, 0.3f), 0f),
        snow = IconInfo(0.5f, Offset(0.1f, 0.3f), 0f),
        thunder = IconInfo(0.45f, Offset(0.29f, 0.6f), 0f)

    )

    val CloudyComposed = ComposeInfo(
        sun = IconInfo(0.1f, Offset(0.75f, 0.2f), 0f),
        cloud = IconInfo(0.8f, Offset(0.1f, 0.1f)),
        lightCloud = IconInfo(0.5f, Offset(0.05f, 0.125f)),
        rains = IconInfo(0.4f, Offset(0.225f, 0.3f), 0f),
        lightRain = IconInfo(0.4f, Offset(0.225f, 0.3f), 0f),
        snow = IconInfo(0.5f, Offset(0.1f, 0.3f), 0f),
        thunder = IconInfo(0.45f, Offset(0.29f, 0.6f), 0f)

    )

    val CloudyRainComposed = ComposeInfo(
        sun = IconInfo(0.6f, Offset(0.4f, 0f)),
        cloud = IconInfo(0.8f, Offset(0.1f, 0.1f)),
        lightCloud = IconInfo(0.5f, Offset(-0.15f, 0.125f), 0f),
        rains = IconInfo(0.4f, Offset(0.225f, 0.3f), 0f),
        lightRain = IconInfo(0.4f, Offset(0.225f, 0.3f), 1f),
        snow = IconInfo(0.5f, Offset(0.1f, 0.3f),0f),
        thunder = IconInfo(0.45f, Offset(0.29f, 0.6f), 0f)

    )

    val HeavyRainComposed = ComposeInfo(
        sun = IconInfo(0.1f, Offset(0.75f, 0.2f), 0f),
        cloud = IconInfo(0.8f, Offset(0.1f, 0.1f)),
        lightCloud = IconInfo(0.5f, Offset(0.05f, 0.125f)),
        rains = IconInfo(0.4f, Offset(0.225f, 0.3f), 1f),
        lightRain = IconInfo(0.4f, Offset(0.225f, 0.3f), 0f),
        snow = IconInfo(0.5f, Offset(0.1f, 0.3f), 0f),
        thunder = IconInfo(0.45f, Offset(0.29f, 0.6f), 0f)

    )

    val SnowyComposed = ComposeInfo(
        sun = IconInfo(0.1f, Offset(0.75f, 0.2f), 0f),
        cloud = IconInfo(0.8f, Offset(0.1f, 0.1f)),
        lightCloud = IconInfo(0.5f, Offset(-0.15f, 0.35f), 0f),
        rains = IconInfo(0.4f, Offset(0.225f, 0.3f), alpha = 0f),
        lightRain = IconInfo(0.4f, Offset(0.225f, 0.3f), 0f),
        snow = IconInfo(0.5f, Offset(0.1f, 0.3f), alpha = 1f),
        thunder = IconInfo(0.45f, Offset(0.29f, 0.6f), alpha = 0f)

    )

    val ThunderStormComposed = ComposeInfo(
        sun = IconInfo(0.1f, Offset(0.75f, 0.2f), alpha = 0f),
        cloud = IconInfo(0.9f, Offset(0.06f, 0.05f)),
        lightCloud = IconInfo(0.5f, Offset(-0.05f, 0.125f), 0f),
        rains = IconInfo(0.45f, Offset(0.2f, 0.3f), alpha = 0f),
        lightRain = IconInfo(0.4f, Offset(0.225f, 0.3f), 0f),
        snow = IconInfo(0.5f, Offset(0.1f, 0.3f), alpha = 0f),
        thunder = IconInfo(0.5f, Offset(0.27f, 0.6f), alpha = 1f)

    )
}