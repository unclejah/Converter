package com.example.converter

import com.google.gson.annotations.SerializedName

data class LocationModel(
    @SerializedName("lat")
    val lat:Float,

    @SerializedName("long")
    val long:Float,
)