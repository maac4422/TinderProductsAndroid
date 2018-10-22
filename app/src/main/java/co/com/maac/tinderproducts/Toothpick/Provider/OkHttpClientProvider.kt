package co.com.maac.tinderproducts.Toothpick.Provider

import android.content.Context
import co.com.maac.tinderproducts.Model.Data.Auth.IAuthHolder
import okhttp3.Cache
import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit
import javax.inject.Inject
import javax.inject.Provider

class OkHttpClientProvider @Inject constructor(
        private val authData: IAuthHolder,
        private val context: Context
): Provider<OkHttpClient> {

    override fun get() = with(OkHttpClient.Builder()){
        cache(Cache(context.cacheDir,20*1024))
        connectTimeout(30,TimeUnit.SECONDS)
        readTimeout(30,TimeUnit.SECONDS)

        build()
    }
}