package com.fangju.sunnyweather

import android.app.Application
import android.content.Context

/**
 * 全局的Application
 * Created by FangJu on 2020/4/9.
 */
class SunnyWeatherApplication : Application() {

    companion object {
        // 全局上下文
        lateinit var context: Context
        const val TOKEN = "7tI5VdAJ12wqnRtV"

    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}