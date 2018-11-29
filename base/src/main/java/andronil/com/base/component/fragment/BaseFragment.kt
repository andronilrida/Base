package andronil.com.base.component.fragment

import android.content.Context
import android.support.v4.app.Fragment
import andronil.com.base.function.ComponentFun

abstract class BaseFragment: Fragment(),ComponentFun {

    override var componentContext: Context? = context
    override val logTag: String = this.javaClass.simpleName

    override fun appendLog(data: String) {

    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        componentContext = context
    }
}