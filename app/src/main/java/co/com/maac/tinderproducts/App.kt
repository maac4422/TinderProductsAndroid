package co.com.maac.tinderproducts

import android.app.Application
import toothpick.Toothpick
import toothpick.configuration.Configuration

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        initToothpick()
        initAppScope()
    }

    private fun initToothpick(){
        if(BuildConfig.DEBUG){
            Toothpick.setConfiguration(Configuration.forDevelopment().preventMultipleRootScopes())
        }else{

        }
    }

    private fun initAppScope(){

    }

}