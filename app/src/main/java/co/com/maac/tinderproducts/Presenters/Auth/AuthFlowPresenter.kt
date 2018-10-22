package co.com.maac.tinderproducts.Presenters.Auth

import co.com.maac.tinderproducts.Presenters.Global.BasePresenter
import co.com.maac.tinderproducts.Toothpick.DI
import com.arellomobile.mvp.MvpView
import ru.terrakok.cicerone.Router
import toothpick.Toothpick
import javax.inject.Inject

class AuthFlowPresenter @Inject constructor(
        private val router: Router
) : BasePresenter<MvpView>() {

    override fun onDestroy() {
        Toothpick.closeScope(DI.AUTH_FLOW_SCOPE)
        super.onDestroy()
    }

    fun onExit(){
        router.exit()
    }
}