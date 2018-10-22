package co.com.maac.tinderproducts.Activities.Global

import android.os.Bundle
import com.arellomobile.mvp.MvpAppCompatActivity
import com.arellomobile.mvp.MvpView
import com.arellomobile.mvp.presenter.InjectPresenter

abstract class BaseActivity : MvpAppCompatActivity() {
    abstract  val layoutRes: Int
    private var instanceStateSaved: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutRes)
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
    }



}