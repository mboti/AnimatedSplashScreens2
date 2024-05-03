package com.mboti.animatedsplashscreens2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.mboti.animatedsplashscreens2.ui.theme.AnimatedSplashScreens2Theme


/**
 *   ADD
 * ------
 * dependencies{
 *   ....
 *     implementation("com.airbnb.android:lottie-compose:6.3.0")
 *     implementation("androidx.navigation:navigation-compose:2.7.7")
 *   ...
 * }
 *
 * https://lottiefiles.com/featured
 */

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AnimatedSplashScreens2Theme {
                val navController = rememberNavController()
                SetupNavGraph(navController = navController)
            }
        }
    }
}

