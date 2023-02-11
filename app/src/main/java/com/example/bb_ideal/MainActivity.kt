package com.example.bb_ideal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var InputNama:EditText
    private lateinit var InputTB:EditText
    private lateinit var LK:RadioButton
    private lateinit var PR:RadioButton
    private lateinit var Proses: Button
    private lateinit var Hasil: TextView



    private var tb : Int = 0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        InputNama = findViewById(R.id.etNama)
        InputTB = findViewById(R.id.etTB)
        LK = findViewById(R.id.rbLK)
        PR = findViewById(R.id.rbPR)
        Proses = findViewById(R.id.btProses)
        Hasil = findViewById(R.id.tvHasil)

        Proses.setOnClickListener {

            var tinggi = InputTB.text.toString().toInt()

            if (LK.isChecked){
                tb = (tinggi - 100) - ((tinggi - 100) * 10/100)
                Hasil.setText(tb.toString()+ "Kg")
            }else {
                tb = (tinggi - 100) - ((tinggi - 100) * 15/100)
                Hasil.setText(tb.toString()+ "Kg")
            }
        }
    }
}