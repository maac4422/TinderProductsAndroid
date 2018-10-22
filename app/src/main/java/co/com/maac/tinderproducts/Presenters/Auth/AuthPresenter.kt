package co.com.maac.tinderproducts.Presenters.Auth

import co.com.maac.tinderproducts.Activities.Auth.IAuthActivity
import co.com.maac.tinderproducts.Model.Interactor.Auth.AuthInteractor
import co.com.maac.tinderproducts.Model.System.Flow.FlowRouter
import co.com.maac.tinderproducts.Presenters.Global.BasePresenter
import co.com.maac.tinderproducts.Presenters.Global.ErrorHandler
import javax.inject.Inject

class AuthPresenter @Inject constructor(
        private val router: FlowRouter,
        private val authInteractor: AuthInteractor,
        private val errorHandler: ErrorHandler
): BasePresenter<IAuthActivity>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        startAuthorization()
    }

    private fun startAuthorization() {

    }
}