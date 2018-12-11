package andronil.com.base.files

import android.content.Context
import android.util.Log
import android.widget.Toast

fun Context.showShortToast(message:String){
    Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
}

fun Context.showLongToast(message:String){
    Toast.makeText(this,message,Toast.LENGTH_LONG).show()
}

fun Context.logD(message: String,throwable: Throwable? = null){
    Log.d(this.packageName,message,throwable)
}

fun Context.logE(message: String,throwable: Throwable? = null){
    Log.e(this.packageName,message,throwable)
}

fun Context.logV(message: String,throwable: Throwable? = null){
    Log.v(this.packageName,message,throwable)
}

fun Context.logI(message: String,throwable: Throwable? = null){
    Log.i(this.packageName,message,throwable)
}

