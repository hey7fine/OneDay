package fine.oneday.ui.weather

data class ComposeInfo(
    val sun: IconInfo,
    val cloud: IconInfo,
    val lightCloud: IconInfo,
    val rains: IconInfo,
    val lightRain: IconInfo,
    val snow: IconInfo,
    val thunder: IconInfo
) {
    operator fun times(float: Float): ComposeInfo =
        copy(
            sun = sun * float,
            cloud = cloud * float,
            lightCloud = lightCloud * float,
            rains = rains * float,
            lightRain = lightRain * float,
            snow = snow * float,
            thunder = thunder * float
        )

    operator fun minus(composeInfo: ComposeInfo): ComposeInfo =
        copy(
            sun = sun - composeInfo.sun,
            cloud = cloud - composeInfo.cloud,
            lightCloud = lightCloud - composeInfo.lightCloud,
            rains = rains - composeInfo.rains,
            lightRain = lightRain - composeInfo.lightRain,
            snow = snow - composeInfo.snow,
            thunder = thunder - composeInfo.thunder
        )

    operator fun plus(composeInfo: ComposeInfo): ComposeInfo =
        copy(
            sun = sun + composeInfo.sun,
            cloud = cloud + composeInfo.cloud,
            lightCloud = lightCloud + composeInfo.lightCloud,
            rains = rains + composeInfo.rains,
            lightRain = lightRain + composeInfo.lightRain,
            snow = snow + composeInfo.snow,
            thunder = thunder + composeInfo.thunder
        )
}