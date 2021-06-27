package com.example.dstesing.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.example.dstesing.R

class FragmentOne : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var binding = inflater.inflate(R.layout.fragment_one,container,false)

        val button = binding.findViewById<Button>(R.id.button)

        button.setOnClickListener{view: View ->
            view.findNavController().navigate(R.id.action_fragmentOne_to_fragmentTwo)
        }
        return binding
        // Inflate the layout for this fragment

    }

}