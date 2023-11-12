package com.example.livedatatugas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var mModel : RandomNumberLiveData

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mModel = ViewModelProvider(this).get(RandomNumberLiveData::class.java)

        val randomNumberObserver = Observer<Int> { newNumber ->
            textView.text = "Angka random baru : $newNumber"
        }
        mModel.currentRandomNumber.observe(this, randomNumberObserver)

        button.setOnClickListener {

            mModel.currentRandomNumber.value = Random().nextInt(50)
        }
    }
}
