package com.io.toastlibrary

import android.content.Context
import android.widget.Toast

object ToastClass {
    fun showtoast(context: Context,string: String)
    {
        Toast.makeText(context,string,Toast.LENGTH_LONG).show()
    }
}