package com.intechnology.kitchen.orderList.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.intechnology.kitchen.databinding.FragmentOrderListBinding
import com.intechnology.kitchen.orderList.adapter.OrderListAdapter

class OrderListFragment : Fragment() {
    private lateinit var binding: FragmentOrderListBinding
    private lateinit var adapter: OrderListAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentOrderListBinding.inflate(layoutInflater)
        binding.root.setOnClickListener {
            return@setOnClickListener
        }
        viewInit()
        return binding.root
    }

    private fun viewInit() {

        adapter = OrderListAdapter(requireContext())

        binding.orderListRvId.layoutManager = GridLayoutManager(context,2)
        binding.orderListRvId.adapter=adapter
    }
}