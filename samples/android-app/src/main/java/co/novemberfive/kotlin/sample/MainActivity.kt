package co.novemberfive.kotlin.sample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import co.novemberfive.kotlin.sample.HelloWorld
import kotlinx.android.synthetic.main.activity_main.txtBody

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtBody.text = HelloWorld.commonCode()
    }
}
