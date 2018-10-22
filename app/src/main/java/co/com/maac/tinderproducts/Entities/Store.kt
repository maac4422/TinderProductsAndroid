package co.com.maac.tinderproducts.Entities

import com.google.gson.annotations.SerializedName

data class Store(
    @SerializedName("id") val id:Long,
    @SerializedName("name") val name:String
)