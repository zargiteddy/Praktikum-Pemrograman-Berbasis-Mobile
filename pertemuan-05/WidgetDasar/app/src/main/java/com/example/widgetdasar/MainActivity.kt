package com.example.widgetdasar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.RadioButton
import android.widget.CheckBox
import android.widget.Button
import android.widget.TextView
import android.view.View.OnClickListener
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnProses = findViewById<Button>(R.id.btnProses)
        val tvPesan = findViewById<TextView>(R.id.tvPesan)
    }
    fun onRbClicked(view: View) {
        if (view is RadioButton) {
        // is the button now checked?
        val checked = view.isChecked

        //when which radio button was clicked
        when (view.getId()) {
            R.id.rb_pria ->
                if (checked) {
                    Toast.makeText(applicationContext,
                    "On click : ${rb_pria}.text}",
                    Toast.LENGTH_SHORT).show()
                }
            R.id.rb_wanita ->
                if (checked) {
                    Toast.makeText(applicationContext,
                    "On click : ${rb_wanita}.text}",
                    Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
    fun onCbClicked(view: View){
        if(view is CheckBox){
            val checked: Boolean = view.isChecked
            when (view.id){
                R.id.cb_coding -> {
                    if (checked){
                        Toast.makeText(applicationContext,
                        "${cb_coding.text} terpilih",
                        Toast.LENGTH_SHORT).show()
                    } else {
                        Toast.makeText(applicationContext,
                        "${cb_coding.text} tidak terpilih",
                        Toast.LENGTH_SHORT).show()
                    }
                }
                R.id.cb_traveling -> {
                    if (checked){
                        Toast.makeText(applicationContext,
                        "${cb_traveling.text} terpilih",
                        Toast.LENGTH_SHORT).show()
                    } else {
                        Toast.makeText(applicationContext,
                        "${cb_traveling.text} tidak terpilih",
                        Toast.LENGTH_SHORT).show()
                    }
                }
                R.id.cb_cooking -> {
                    if (checked){
                        Toast.makeText(applicationContext,
                        "${cb_cooking.text} terpilih",
                        Toast.LENGTH_SHORT).show()
                    } else {
                        Toast.makeText(applicationContext,
                       "${cb_cooking.text} tidak terpilih",
                       Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }
    }
    fun onBtnProsesClicked(view: View){
        if(view is Button){
        btnProses.setOnClickListener{
            tvPesan.text = "Mbak ${etNama.text}, kamu suka ${cb_coding.text}, ${cb_traveling.text}"
            }
        }
    }
}
