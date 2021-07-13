package com.example.dstesing.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dstesing.*
import com.example.dstesing.adapters.RecyclerViewCardAdapter
import com.example.dstesing.adapters.RecyclerViewCourseAdapter

class MainFragment : Fragment(), OnCourseClickListener {


    private var layoutManager: RecyclerView.LayoutManager? = null
    private var cardAdapter: RecyclerView.Adapter<RecyclerViewCourseAdapter.ViewHolder>? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var binding = inflater.inflate(R.layout.fragment_main,container,false)

        val button = binding.findViewById<Button>(R.id.button)
        val points = binding.findViewById<TextView>(R.id.points_main)




        val recyclerView = binding.findViewById<RecyclerView>(R.id.module_recycler_view)
        layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
        recyclerView.layoutManager = layoutManager
        cardAdapter = RecyclerViewCourseAdapter(this)
        recyclerView.adapter = cardAdapter

        button.setOnClickListener{view: View ->
            view.findNavController().navigate(R.id.action_mainFragment_to_moduleFragment)
        }
        return binding
        // Inflate the layout for this fragment

    }

    override fun cardClick(course: Course, position: Int) {
        when(position) {
            0 -> findNavController().navigate(R.id.action_mainFragment_to_moduleFragment)
            1 -> findNavController().navigate(R.id.action_mainFragment_to_infoFragment)
//            1 -> Toast.makeText(context, "Этот курс пока что не доступен", Toast.LENGTH_LONG).show()
        }
    }
}