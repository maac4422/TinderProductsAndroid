package co.com.maac.tinderproducts.Presenters

import co.com.maac.tinderproducts.Model.Interactor.Auth.AuthInteractor
import com.arellomobile.mvp.MvpPresenter
import com.arellomobile.mvp.MvpView
import ru.terrakok.cicerone.Router
import javax.inject.Inject

class AppPresenter @Inject constructor(
        private val router: Router,
        private val authInteractor: AuthInteractor
) : MvpPresenter<MvpView>() {

    fun coldStart() {
        /*val rootScreen =
            if (authInteractor.isSignedIn()) Screens.DrawerFlow
            else Screens.AuthFlow

        if (launchInteractor.isFirstLaunch) {
            router.newRootChain(rootScreen, Screens.PrivacyPolicy)
        } else {
            router.newRootScreen(rootScreen)
        }
        */
    }
}