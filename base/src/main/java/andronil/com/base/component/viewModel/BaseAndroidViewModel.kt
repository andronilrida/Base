package andronil.com.base.component.viewModel

import android.app.Application
import android.arch.lifecycle.AndroidViewModel

abstract class BaseAndroidViewModel(app: Application): AndroidViewModel(app),MarkerViewModel {
}