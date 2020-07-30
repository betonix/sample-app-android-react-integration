package net.natura.sellingcartsampleapp

import android.app.Application
import android.content.Context
import androidx.multidex.MultiDex

class SellingCartSampleApplication : Application() {

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }
}
