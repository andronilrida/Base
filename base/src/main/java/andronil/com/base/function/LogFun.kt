package andronil.com.base.function

import android.util.Log

interface LogFun {
    val logTag:String

    fun logE(message: String){
        Log.e(logTag,message)
    }
    fun logD(message: String){
        Log.d(logTag,message)
    }
    fun logI(message: String){
        Log.i(logTag,message)
    }
    fun appendLog(data: String)
}