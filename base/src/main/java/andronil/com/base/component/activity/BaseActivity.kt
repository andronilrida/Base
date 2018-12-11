package andronil.com.base.component.activity

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.os.PersistableBundle
import android.support.annotation.LayoutRes
import android.support.v7.app.AppCompatActivity
import andronil.com.base.annotations.InsertViewModel
import andronil.com.base.component.BaseViewCombiner
import andronil.com.base.component.viewModel.BaseAndroidViewModel
import andronil.com.base.component.viewModel.BaseNormalViewModel
import andronil.com.base.component.viewModel.MarkerViewModel

abstract class BaseActivity<B:ViewDataBinding>(@LayoutRes private  val layoutId:Int)
    : AppCompatActivity(),BaseViewCombiner{

    private fun giveDataBindingClass(@LayoutRes layoutId:Int): B {
        return DataBindingUtil.setContentView(this,layoutId)
    }

    override fun <V:BaseNormalViewModel> requestViewModel(viewModelClass: Class<V>): V {
        return ViewModelProviders.of(this)[viewModelClass]
    }

    override fun <A:BaseAndroidViewModel> requestViewModel(viewModelClass: Class<A>): A {
        return ViewModelProviders.of(this)[viewModelClass]
    }

    private fun getAnnotatedViewModel(): Class<MarkerViewModel> {
        var viewModel:Class<MarkerViewModel> ?= null
        for (item in BaseActivity::class.java.annotations){
             val insertViewModel= item as InsertViewModel
//             viewModel = insertViewModel.viewModel
        }
        return viewModel!!
    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        val viewBinding = giveDataBindingClass(layoutId)

//        val viewModel =  requestViewModel(getAnnotatedViewModel())

        onCreate(savedInstanceState,viewBinding)
    }

    abstract fun onCreate(savedInstanceState: Bundle?,viewBinding:B)

}