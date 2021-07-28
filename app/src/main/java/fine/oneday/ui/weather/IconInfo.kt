package fine.oneday.ui.weather

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.unit.Dp
import fine.oneday.ui.weather.WeatherComposedInfo.IconSize

data class IconInfo(
    val ratio: Float = 1f,
    val offset: Offset = Offset(0f, 0f),
    val alpha: Float = 1f,
) {
    val size: Dp = IconSize // max size

    operator fun times(float: Float): IconInfo =
        copy(
            ratio = ratio * float,
            offset = Offset(
                offset.x * float,
                offset.y * float
            ),
            alpha = alpha * float,
        )

    operator fun minus(iconInfo: IconInfo): IconInfo =
        copy(
            ratio = ratio - iconInfo.ratio,
            offset = Offset(
                offset.x - iconInfo.offset.x,
                offset.y - iconInfo.offset.y
            ),
            alpha = alpha - iconInfo.alpha,
        )

    operator fun plus(iconInfo: IconInfo): IconInfo =
        copy(
            ratio = ratio + iconInfo.ratio,
            offset = Offset(
                offset.x + iconInfo.offset.x,
                offset.y + iconInfo.offset.y
            ),
            alpha = alpha + iconInfo.alpha,
        )
}