package co.com.maac.tinderproducts.Entities

import com.google.gson.annotations.SerializedName

data class Product(
    @SerializedName("id") val id:Long,
    @SerializedName("name") val name:String,
    @SerializedName("description") val description:String
)