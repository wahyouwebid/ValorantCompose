package com.wahyouwebid.valorantapp.features.weapon.data.model

import com.google.gson.annotations.SerializedName

data class Chroma(
    @SerializedName("assetPath")
    val assetPath: String?,
    @SerializedName("displayIcon")
    val displayIcon: String?,
    @SerializedName("displayName")
    val displayName: String?,
    @SerializedName("fullRender")
    val fullRender: String?,
    @SerializedName("streamedVideo")
    val streamedVideo: Any?,
    @SerializedName("swatch")
    val swatch: String?,
    @SerializedName("uuid")
    val uuid: String?
)