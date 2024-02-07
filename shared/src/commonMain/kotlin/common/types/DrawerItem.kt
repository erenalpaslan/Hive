package common.types

import ui.resources.Icons

enum class DrawerItem(
    val itemId: Int,
    val title: String,
    val icon: String
) {
    Dashboard(0, "Dashboard", Icons.Home),
    Projects(1, "Projects", Icons.Layer),
    ContentLibrary(2, "Content Library", Icons.DocumentText),
    ScribeSettings(3, "Scriber Settings", Icons.Tune),
    UserProfile(4, "User Profile", Icons.User),
    FeedbackAndSupport(5, "Feedback and Support", Icons.SmsEdit),
    Analytics(6, "Analytics", Icons.Chart),
    Collaboration(7, "Collaboration", Icons.Data),
    Settings(8, "Settings", Icons.Setting)
}
