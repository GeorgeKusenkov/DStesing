package com.example.dstesing.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dstesing.Koala
import com.example.dstesing.OnCardClickListener
import com.example.dstesing.R
import com.example.dstesing.Adapters.RecyclerViewAdapter

class FragmentTwo : Fragment(), OnCardClickListener {

    private var titleList = mutableListOf<String>()
    private var detailsList = mutableListOf<String>()
    private var imageList = mutableListOf<Int>()

    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = inflater.inflate(R.layout.fragment_two,container,false)

        val recyclerView = binding.findViewById<RecyclerView>(R.id.recycler_view)

        layoutManager = LinearLayoutManager(context)
        recyclerView.layoutManager = layoutManager

        adapter = RecyclerViewAdapter(titleList, detailsList, imageList, this)
        recyclerView.adapter = adapter

        return binding
    }

    override fun itemClick(koala: Koala, position: Int) {

        when(position) {
            0 -> findNavController().navigate(R.id.action_fragmentTwo_to_fragmentThree)
            1 -> findNavController().navigate(R.id.action_fragmentTwo_to_fragmentFour)
        }

        Toast.makeText(context,"Koala name $position", Toast.LENGTH_SHORT).show()
    }


}