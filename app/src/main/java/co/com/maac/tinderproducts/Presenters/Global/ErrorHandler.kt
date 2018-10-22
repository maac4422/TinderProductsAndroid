package co.com.maac.tinderproducts.Presenters.Global

import co.com.maac.tinderproducts.Model.Interactor.Auth.AuthInteractor
import co.com.maac.tinderproducts.Model.System.ResourceManager
import co.com.maac.tinderproducts.Model.System.SchedulersProvider
import com.jakewharton.rxrelay2.PublishRelay
import ru.terrakok.cicerone.Router
import java.util.concurrent.TimeUnit
import javax.inject.Inject

class ErrorHandler @Inject constructor(
        private val router: Router,
        private val authInteractor: AuthInteractor,
        private val resourceManager: ResourceManager,
        private val schedulers: SchedulersProvider
) {
    private val authErrorRelay = PublishRelay.create<Boolean>()

    init {
        subscribeOnAuthErrors()
    }

    private fun subscribeOnAuthErrors() {
        authErrorRelay
                .throttleFirst(50, TimeUnit.MILLISECONDS)
                .observeOn(schedulers.ui())
                .subscribe { logout() }
    }

    private fun logout() {
        //authInteractor.logout()
        //router.newRootScreen(Screens.AuthFlow)
    }
}