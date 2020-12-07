package com.example.navigationdemo.nav_graph

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.navigationdemo.R
import com.example.navigationdemo.databinding.FragmentNavGraphFragment1Binding
import com.example.navigationdemo.databinding.FragmentNavGraphMainBinding


/**
 * A simple [Fragment] subclass.
 * Use the [NavGraphFragment1.newInstance] factory method to
 * create an instance of this fragment.
 */
class NavGraphFragment1 : Fragment() {
    private lateinit var binding: FragmentNavGraphFragment1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_nav_graph_fragment_1, container, false)
        binding.startWithPopUpToInclusizeTrueButton.setOnClickListener {
            findNavController().navigate(R.id.action_navGraphFragment1_to_navGraphFragment2_pop_up_true)
        }
        binding.startWithPopUpToInclusizeFalseButton.setOnClickListener {
            findNavController().navigate(R.id.action_navGraphFragment1_to_navGraphFragment2_pop_up_false)
        }
        return binding.root
    }
}