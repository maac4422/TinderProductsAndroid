package co.com.maac.tinderproducts.Model.Interactor.ProductsGame

import co.com.maac.tinderproducts.Model.Repository.ProductsGame.ProductGameRepository

class ProductsGameInteractor(
        private val serverPath: String,
        private val defaultServerPath: String,
        private val productGameRepository: ProductGameRepository
) {
}