package andronil.com.base.component.observer

import android.arch.lifecycle.LifecycleOwner
import andronil.com.base.files.BaseViewModel

abstract class BaseObserver(
    private val lifecycleOwner: LifecycleOwner,
    val viewModel: BaseViewModel
) {

    fun startObServation() {

    }
}