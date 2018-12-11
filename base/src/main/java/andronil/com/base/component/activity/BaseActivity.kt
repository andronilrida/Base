package andronil.com.base.component.activity

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.support.annotation.LayoutRes
import android.support.v7.app.AppCompatActivity

abstract class BaseActivity: AppCompatActivity(){

    fun <T: ViewDataBinding> giveDataBindingClass(@LayoutRes layoutId:Int): T {
        return DataBindingUtil.setContentView(this,layoutId)
    }

}