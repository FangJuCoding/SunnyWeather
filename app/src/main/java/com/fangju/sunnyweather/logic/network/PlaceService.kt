package com.fangju.sunnyweather.logic.network

import com.fangju.sunnyweather.SunnyWeatherApplication
import com.fangju.sunnyweather.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * 城市搜索api
 * Created by FangJu on 2020/4/9.
 */
interface PlaceService {
    @GET("v2/place?token=${SunnyWeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>
}