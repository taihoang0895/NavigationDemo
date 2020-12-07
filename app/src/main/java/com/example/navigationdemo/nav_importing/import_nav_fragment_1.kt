package com.example.navigationdemo.nav_importing

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.navigationdemo.R
import com.example.navigationdemo.databinding.FragmentImportNav1Binding
import com.example.navigationdemo.databinding.FragmentNavGraphFragment1Binding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [import_nav_fragment_1.newInstance] factory method to
 * create an instance of this fragment.
 */
class import_nav_fragment_1 : Fragment() {
    private lateinit var binding: FragmentImportNav1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_import_nav_1, container, false)
        binding.nextScreenButton.setOnClickListener {
            findNavController().navigate(R.id.action_import_nav_fragment_1_to_import_nav_fragment_2)
        }
        return binding.root
    }
}