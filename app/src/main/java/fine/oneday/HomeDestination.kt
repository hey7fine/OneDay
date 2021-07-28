package fine.oneday

import androidx.annotation.StringRes

enum class HomeDestination(val route: String, @StringRes val resourceId: Int) {
    Home("home", R.string.app_home),
    Discovery("discovery", R.string.app_discovery),
    Profile("profile", R.string.app_profile)
}