package andronil.com.base.component.observer

import android.arch.lifecycle.LifecycleOwner
import andronil.com.base.component.viewModel.MarkerViewModel

abstract class BaseObserver(
    private val lifecycleOwner: LifecycleOwner,
    val viewModel: MarkerViewModel) {

    fun startObServation() {

    }
}