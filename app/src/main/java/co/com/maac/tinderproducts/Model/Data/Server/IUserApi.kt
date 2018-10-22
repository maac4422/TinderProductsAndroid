package co.com.maac.tinderproducts.Model.Data.Server

import co.com.maac.tinderproducts.Model.Data.Server.Responses.AuthResponse
import retrofit2.http.POST
import retrofit2.http.Query
import retrofit2.Call;

interface IUserApi {
    companion object {
        const val API_PATH = "api/v1"
    }


    @POST("$API_PATH/login")
    fun  auth(
    ) : Call<AuthResponse>
}