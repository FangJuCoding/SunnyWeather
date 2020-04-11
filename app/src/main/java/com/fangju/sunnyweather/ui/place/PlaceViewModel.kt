package com.fangju.sunnyweather.ui.place

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.fangju.sunnyweather.logic.model.Place
import com.fangju.sunnyweather.logic.network.Repository

/**
 * 搜索全球城市的逻辑层
 * Created by FangJu on 2020/4/10.
 */
class PlaceViewModel : ViewModel() {
    private val searchListData = MutableLiveData<String>()

    val placeList = ArrayList<Place>()

    val placeLiveData = Transformations.switchMap(searchListData) { query ->
        Repository.searchPlaces(query)
    }

    fun searchPlaces(query: String) {
        searchListData.value = query
    }

    fun savePlace(place: Place) = Repository.savePlace(place)

    fun getSavedPlace() = Repository.getSavedPlace()

    fun isPlaceSaved() = Repository.isPlaceSaved()
}