package andronil.com.base.component.fragment

import android.arch.lifecycle.ViewModelProviders
import android.content.Context
import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.support.annotation.LayoutRes
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import andronil.com.base.component.BaseViewCombiner
import andronil.com.base.component.viewModel.BaseAndroidViewModel
import andronil.com.base.component.viewModel.BaseNormalViewModel
import java.lang.Exception

abstract class BaseFragment<B : ViewDataBinding>: Fragment(),BaseViewCombiner  {

    private fun giveDataBinding(inflater: LayoutInflater, @LayoutRes resId: Int, viewGroup: ViewGroup, attachToParent: Boolean): B{
        return DataBindingUtil.inflate(inflater,resId,viewGroup,attachToParent)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val resId = onLayoutInflate()
        val binding = giveDataBinding(inflater,resId,container!!,false)
        onCreateView(binding,savedInstanceState)
        return binding.root
    }

    abstract fun onLayoutInflate():Int

    abstract fun onCreateView(binding: B,savedInstanceState: Bundle?)

    override fun <A : BaseAndroidViewModel> requestViewModel(viewModelClass: Class<A>): A {
        return activity?.run {
            ViewModelProviders.of(this)[viewModelClass]
        } ?: throw Exception("Invalid Activity")
    }

    override fun <V : BaseNormalViewModel> requestViewModel(viewModelClass: Class<V>): V {
        return activity?.run {
            ViewModelProviders.of(this)[viewModelClass]
        } ?: throw Exception("Invalid Activity")
    }


}