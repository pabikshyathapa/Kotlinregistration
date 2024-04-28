package com.example.registration

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    lateinit var imageView: ImageView
    lateinit var textView: TextView
    lateinit var editText: EditText
    lateinit var radioGroup: RadioGroup
    lateinit var spinner: Spinner
    var Hobbies = arrayOf("Cooking","Dancing","Singing","Painting","Travelling")
    lateinit var button: Button
    lateinit var radioButton: RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView = findViewById(R.id.imageView)
        textView = findViewById(R.id.textView)
        textView = findViewById(R.id.textView2)
        textView = findViewById(R.id.textView3)
        textView = findViewById(R.id.textView4)
        textView = findViewById(R.id.textView5)
        editText = findViewById(R.id.EmailAddress)
        radioGroup = findViewById(R.id.radioGroup)
        radioButton = findViewById(R.id.radioButton2)
        radioButton = findViewById(R.id.radioButton4)
        spinner = findViewById(R.id.spinner2)
        button = findViewById(R.id.button)
        button.setOnClickListener {
            Toast.makeText(this, "Registration complete", Toast.LENGTH_LONG).show()

        }
        spinner.onItemSelectedListener= this

        var adapter =ArrayAdapter( this@MainActivity,
            android.R.layout.simple_spinner_item,Hobbies)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter=adapter


        }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

    }

    override fun onNothingSelected(parent: AdapterView<*>?) {

    }
}




