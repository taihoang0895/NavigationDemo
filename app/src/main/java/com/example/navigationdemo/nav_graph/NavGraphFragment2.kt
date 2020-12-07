package com.example.navigationdemo.nav_graph

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.navigationdemo.R
import com.example.navigationdemo.databinding.FragmentNavGraphFragment1Binding
import com.example.navigationdemo.databinding.FragmentNavGraphFragment2Binding


/**
 * A simple [Fragment] subclass.
 * Use the [NavGraphFragment2.newInstance] factory method to
 * create an instance of this fragment.
 */
class NavGraphFragment2 : Fragment() {
    private lateinit var binding: FragmentNavGraphFragment2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_nav_graph_fragment_2, container, false)
        return binding.root
    }
}