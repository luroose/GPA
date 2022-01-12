package com.example.gpa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener{
            var Cr1 = editTextNumber.text.toString()
            var Cr2 = editTextNumber2.text.toString()
            var Cr3 = editTextNumber3.text.toString()
            var Cr4 = editTextNumber4.text.toString()
            var Cr5 = editTextNumber5.text.toString()
            var Po1 = editTextNumber6.text.toString()
            var Po2 = editTextNumber7.text.toString()
            var Po3 = editTextNumber8.text.toString()
            var Po4 = editTextNumber9.text.toString()
            var Po5 = editTextNumber10.text.toString()
            if (Cr1 == ""|| Cr2 == ""|| Cr3 == ""|| Cr4 == ""|| Cr5 == ""|| Po1 == ""|| Po2 == ""|| Po3 == ""|| Po4 == ""|| Po5 == ""|| editTextTextPersonName.text.isEmpty()|| editTextTextPersonName2.text.isEmpty()|| editTextTextPersonName3.text.isEmpty()|| editTextTextPersonName4.text.isEmpty()|| editTextTextPersonName5.text.isEmpty())
                return@setOnClickListener Toast.makeText(this@MainActivity, "Plase Input All Text Box Before Press OK!!", Toast.LENGTH_SHORT).show()
            var w = Cr1.toInt() + Cr2.toInt() + Cr3.toInt() + Cr4.toInt() + Cr5.toInt()
            textView13.text=w.toString()
            var Sum = 0.0
            Sum += (Cr1.toDouble() * Po1.toDouble()) + (Cr2.toDouble() * Po2.toDouble()) + (Cr3.toDouble() * Po3.toDouble()) + (Cr4.toDouble() * Po4.toDouble()) + (Cr5.toDouble() * Po5.toDouble())
            textView14.text = String.format("%.2f",Sum/w )
        }
        button2.setOnClickListener{
            editTextTextPersonName.text.clear()
            editTextTextPersonName2.text.clear()
            editTextTextPersonName3.text.clear()
            editTextTextPersonName4.text.clear()
            editTextTextPersonName5.text.clear()
            editTextNumber2.text.clear()
             editTextNumber3.text.clear()
             editTextNumber4.text.clear()
             editTextNumber5.text.clear()
             editTextNumber6.text.clear()
            editTextNumber7.text.clear()
             editTextNumber8.text.clear()
             editTextNumber9.text.clear()
             editTextNumber10.text.clear()
            textView13.text=""
            textView14.text=""
        }
    }
}