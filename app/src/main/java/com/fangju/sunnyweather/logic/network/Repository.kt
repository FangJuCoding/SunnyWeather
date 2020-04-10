package com.fangju.sunnyweather.logic.network

import androidx.lifecycle.liveData
import com.fangju.sunnyweather.logic.model.Place
import kotlinx.coroutines.Dispatchers
import java.lang.Exception

/**
 * Created by FangJu on 2020/4/10.
 */
object Repository {
    fun searchPlaces(query: String) = liveData(Dispatchers.IO) {
        val result = try {
            val placeResponse = SunnyWeatherNetwork.searchPlaces(query)
            if (placeResponse.status == "ok") {
                val places = placeResponse.places
                Result.success(places)
            } else {
                Result.failure(RuntimeException("response status is ${placeResponse.status}"))
            }
        } catch (e: Exception) {
            Result.failure<List<Place>>(e)
        }
        emit(result)
    }
}