package com.example.navigationdemo.nav_importing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.navigationdemo.R
import com.example.navigationdemo.databinding.ActivityImportingNavBinding

class NavImportingActivity : AppCompatActivity() {
    private lateinit var binding: ActivityImportingNavBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_importing_nav)
    }
}