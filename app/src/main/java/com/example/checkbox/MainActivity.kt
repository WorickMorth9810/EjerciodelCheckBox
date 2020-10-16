package com.example.checkbox

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.CheckBox
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    lateinit var txtSaludo: EditText
    lateinit var Negrita: CheckBox
    lateinit var Cursivas: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Negrita = findViewById(R.id.Negrita)
        Cursivas = findViewById(R.id.Cursivas)
        txtSaludo = findViewById(R.id.txt)

    }
    fun clicCheck(v: View){
        val checkPresiono: CheckBox = v as CheckBox
        if(checkPresiono.id == R.id.Negrita)
            Log.v("CheckAPP", "Es el checkbox de negritas")
        else
            Log.v("CheckAPP", "Es el checkbox de cursivas")
        txtSaludo.typeface = Typeface.DEFAULT
        if(Negrita.isChecked)
            txtSaludo.typeface = Typeface.defaultFromStyle(Typeface.BOLD);
        if(Cursivas.isChecked)
            txtSaludo.typeface = Typeface.defaultFromStyle(Typeface.ITALIC);
    }
}