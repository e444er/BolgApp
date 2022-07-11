package com.e444er.bolgapp.ui.navigation

sealed class NavigationItem(
    val route: String
){
    object Home: NavigationItem("Home")
    object DetailsScreen: NavigationItem("Details")
}

