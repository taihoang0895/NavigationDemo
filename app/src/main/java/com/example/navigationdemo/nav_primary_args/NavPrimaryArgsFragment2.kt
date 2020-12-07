package com.example.navigationdemo.nav_primary_args

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationdemo.R


/**
 * A simple [Fragment] subclass.
 * Use the [NavPrimaryArgsFragment2.newInstance] factory method to
 * create an instance of this fragment.
 */
class NavPrimaryArgsFragment2 : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_nav_primary_args2, container, false)
    }
}