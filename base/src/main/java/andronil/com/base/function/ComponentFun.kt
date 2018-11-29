package andronil.com.base.function

import android.content.Context
import android.content.SharedPreferences
import android.widget.Toast

interface ComponentFun:LogFun{

    var componentContext: Context?

    fun getSharedPref(): SharedPreferences?{
        return componentContext!!.getSharedPreferences(componentContext!!.applicationContext.applicationInfo.name,
            Context.MODE_PRIVATE)
    }

    fun showShortToast(message:String){
        Toast.makeText(componentContext,message,Toast.LENGTH_SHORT).show()
    }

    fun showLongToast(message: String){
        Toast.makeText(componentContext,message,Toast.LENGTH_LONG).show()
    }
}