package co.com.maac.tinderproducts.Model.Interactor.Auth

import co.com.maac.tinderproducts.Model.Repository.Auth.AuthRepository

class AuthInteractor (
        private val serverPath: String,
        private val defaultServerPath: String,
        private val authRepository: AuthRepository
){
}