package com.example.dstesing.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.OrientationHelper
import androidx.recyclerview.widget.RecyclerView
import com.example.dstesing.Module
import com.example.dstesing.OnCardClickListener
import com.example.dstesing.R
import com.example.dstesing.adapters.RecyclerViewCardAdapter

class ModuleFragment : Fragment(), OnCardClickListener {

    private var layoutManager: RecyclerView.LayoutManager? = null
    private var cardAdapter: RecyclerView.Adapter<RecyclerViewCardAdapter.ViewHolder>? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = inflater.inflate(R.layout.fragment_module,container,false)

//Настраиваем Recycler View. Назначаем адаптер, находим список и говорим как мы бдем отображать данные
        val recyclerView = binding.findViewById<RecyclerView>(R.id.module_recycler_view)
        layoutManager = LinearLayoutManager(context)
        recyclerView.layoutManager = layoutManager
        cardAdapter = RecyclerViewCardAdapter(this)
        recyclerView.adapter = cardAdapter

        return binding
    }


    //Функция навигации по RecyclerView
    override fun cardClick(module: Module, position: Int) {
        when(position) {
            0 -> findNavController().navigate(R.id.action_moduleFragment_to_LessonsModule1Fragment)
            1 -> Toast.makeText(context, "Это модуль пока что недоступен", Toast.LENGTH_SHORT).show()
            2 -> Toast.makeText(context, "Это модуль пока что недоступен", Toast.LENGTH_SHORT).show()
            3 -> Toast.makeText(context, "Это модуль пока что недоступен", Toast.LENGTH_SHORT).show()
            4 -> Toast.makeText(context, "Это модуль пока что недоступен", Toast.LENGTH_SHORT).show()
        }
    }
}