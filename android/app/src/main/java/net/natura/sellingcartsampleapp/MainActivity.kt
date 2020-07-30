package net.natura.sellingcartsampleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.callReactNativeButton
import com.example.mymodulelibrary.MyModuleLibraryActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        callReactNativeButton.setOnClickListener {
            startActivity(Intent(this, MyModuleLibraryActivity::class.java))
        }
    }
}
