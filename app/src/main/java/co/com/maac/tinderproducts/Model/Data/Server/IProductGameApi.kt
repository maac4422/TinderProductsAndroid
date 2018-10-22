package co.com.maac.tinderproducts.Model.Data.Server

import co.com.maac.tinderproducts.Model.Data.Server.Responses.ProductsGameResponse
import retrofit2.Call
import retrofit2.http.GET

interface IProductGameApi {
    companion object {
        const val API_PATH = "api/v1"
    }

    @GET("$API_PATH/products-random")
    fun  randomProducts(
    ) : Call<ProductsGameResponse>
}