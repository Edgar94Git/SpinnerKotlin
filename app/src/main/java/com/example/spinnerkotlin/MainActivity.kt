package com.example.spinnerkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.spinnerkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        val aaCountries = ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item)
        mBinding.spinnerCountries.adapter = aaCountries
    }
}