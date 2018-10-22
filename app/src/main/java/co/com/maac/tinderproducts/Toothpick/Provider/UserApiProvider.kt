package co.com.maac.tinderproducts.Toothpick.Provider

import co.com.maac.tinderproducts.Model.Data.Server.IUserApi
import co.com.maac.tinderproducts.Toothpick.Qualifier.ServerPath
import com.google.gson.Gson
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Inject
import javax.inject.Provider

class UserApiProvider @Inject constructor(
    private val okHttpClient: OkHttpClient,
    private val gson: Gson,
    @ServerPath private val serverPath: String
) : Provider<IUserApi> {

    override fun get() =
        Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(okHttpClient)
                .baseUrl(serverPath)
                .build()
                .create(IUserApi::class.java)
}