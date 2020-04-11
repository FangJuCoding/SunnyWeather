package com.fangju.sunnyweather.logic.model

/**
 * Created by FangJu on 2020/4/10.
 */
data class Weather(val realTime: RealtimeResponse.RealTime, val daily: DailyResponse.Daily)