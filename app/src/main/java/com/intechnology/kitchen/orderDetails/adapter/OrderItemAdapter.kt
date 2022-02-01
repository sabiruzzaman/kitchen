package com.intechnology.kitchen.orderDetails.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.intechnology.kitchen.R
import com.intechnology.kitchen.databinding.ItemOrderItemBinding

class OrderItemAdapter(val context: Context) :
    RecyclerView.Adapter<OrderItemAdapter.OrderItemViewHolder>() {

    class OrderItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val binding = ItemOrderItemBinding.bind(itemView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrderItemViewHolder {
        val view: View =
            LayoutInflater.from(context).inflate(R.layout.item_order_item, parent, false)
        return OrderItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: OrderItemViewHolder, position: Int) {

        with(holder.binding) {

        }
    }

    override fun getItemCount(): Int {
        return 5
    }

}