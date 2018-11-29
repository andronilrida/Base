package andronil.com.base.component.activity

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import andronil.com.base.function.ComponentFun

abstract class BaseActivity: AppCompatActivity(),ComponentFun{

    override var componentContext: Context? = this
    override val logTag: String = this.javaClass.simpleName

    override fun appendLog(data: String) {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        onCreate()
            }

    abstract fun onCreate()
}