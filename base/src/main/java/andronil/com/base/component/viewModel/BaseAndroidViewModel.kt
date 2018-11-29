package andronil.com.base.component.viewModel

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import andronil.com.base.files.BaseViewModel

@BaseViewModel
abstract class BaseAndroidViewModel(app: Application): AndroidViewModel(app),FunForViewModel {
}