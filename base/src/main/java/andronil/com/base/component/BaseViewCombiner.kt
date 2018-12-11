package andronil.com.base.component

import andronil.com.base.component.viewModel.BaseAndroidViewModel
import andronil.com.base.component.viewModel.BaseNormalViewModel

interface BaseViewCombiner {

    fun <V:BaseNormalViewModel> requestViewModel(viewModelClass: Class<V>): V

    fun <A: BaseAndroidViewModel> requestViewModel(viewModelClass: Class<A>): A
}