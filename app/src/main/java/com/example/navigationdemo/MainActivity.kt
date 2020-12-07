package com.example.navigationdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.navigationdemo.databinding.ActivityMainBinding
import com.example.navigationdemo.nav_graph.NavGraphActivity
import com.example.navigationdemo.nav_importing.NavImportingActivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.testImportingNavActivity.setOnClickListener {
            val intent = Intent(this, NavImportingActivity::class.java)
            startActivity(intent)
        }
        binding.testGraphNav.setOnClickListener {
            val intent = Intent(this, NavGraphActivity::class.java)
            startActivity(intent)
        }
    }
}