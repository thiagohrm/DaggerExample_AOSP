package com.android.car.daggerexample

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp(Application::class)
class DaggerHiltApp : Hilt_DaggerHiltApp()