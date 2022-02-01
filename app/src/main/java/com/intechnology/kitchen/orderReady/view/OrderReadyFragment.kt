package com.intechnology.kitchen.orderReady.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.intechnology.kitchen.databinding.FragmentOrderReadyBinding
import com.intechnology.kitchen.orderReady.adapter.OrderReadyAdapter

class OrderReadyFragment : Fragment() {
    private lateinit var binding: FragmentOrderReadyBinding
    private lateinit var adapter: OrderReadyAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentOrderReadyBinding.inflate(layoutInflater)

        binding.root.setOnClickListener() {
            return@setOnClickListener
        }

        viewInit()
        return binding.root
    }

    private fun viewInit() {
        adapter = OrderReadyAdapter(requireContext())

        binding.orderReadyRvId.layoutManager = GridLayoutManager(context, 2)
        binding.orderReadyRvId.adapter = adapter
    }
}