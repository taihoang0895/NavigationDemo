package com.example.navigationdemo.nav_primary_args

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.navigationdemo.R
import com.example.navigationdemo.databinding.FragmentNavGraphFragment1Binding
import com.example.navigationdemo.databinding.FragmentNavPrimaryArgsMainBinding
import com.example.navigationdemo.nav_graph.NavGraphMainFragmentDirections

/**
 * A simple [Fragment] subclass.
 * Use the [NavPrimaryArgsMainFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class NavPrimaryArgsMainFragment : Fragment() {
    private lateinit var binding: FragmentNavPrimaryArgsMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_nav_primary_args_main, container, false)
        binding.passAnParam.setOnClickListener {
           NavPrimaryArgsFragment1Di
        }
        return binding.root
    }
}