package com.example.navigationdemo.nav_graph

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.navigationdemo.R
import com.example.navigationdemo.databinding.FragmentNavGraphMainBinding


/**
 * A simple [Fragment] subclass.
 * Use the [NavGraphMainFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class NavGraphMainFragment : Fragment() {
    private lateinit var binding: FragmentNavGraphMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_nav_graph_main, container, false)
        binding.nextScreenButton.setOnClickListener {
            findNavController().navigate(R.id.action_navGraphMainFragment_to_navGraphFragment1)
        }
        return binding.root
    }
}