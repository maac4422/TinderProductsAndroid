package co.com.maac.tinderproducts.Activities

import android.os.Bundle
import co.com.maac.tinderproducts.Presenters.AppPresenter
import co.com.maac.tinderproducts.R
import co.com.maac.tinderproducts.Toothpick.DI
import com.arellomobile.mvp.MvpAppCompatActivity
import com.arellomobile.mvp.MvpView
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter
import toothpick.Toothpick

class AppActivity : MvpAppCompatActivity(), MvpView {

    @InjectPresenter
    lateinit var presenter: AppPresenter

    @ProvidePresenter
    fun providePresenter() =
            Toothpick.openScope(DI.SERVER_SCOPE)
                .getInstance(AppPresenter::class.java)

    override fun onCreate(savedInstanceState: Bundle?) {

        Toothpick.inject(this, Toothpick.openScope(DI.SERVER_SCOPE))
        super.onCreate(savedInstanceState)
       /* setContentView(R.layout.layout_container)

        if (savedInstanceState == null) {
            presenter.coldStart()
        }*/
    }


}