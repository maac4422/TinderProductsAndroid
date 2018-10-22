package co.com.maac.tinderproducts.Entities

import com.google.gson.annotations.SerializedName

data  class User(
    @SerializedName("email") val email: String
)
