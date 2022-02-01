package com.intechnology.kitchen.orderList.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.intechnology.kitchen.R
import com.intechnology.kitchen.databinding.ItemOrderListBinding
import com.intechnology.kitchen.orderDetails.view.OrderDetailsActivity


class OrderListAdapter(val context: Context) :
    RecyclerView.Adapter<OrderListAdapter.OrderListViewHolder>() {

    class OrderListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val binding = ItemOrderListBinding.bind(itemView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrderListViewHolder {
        val view: View =
            LayoutInflater.from(context).inflate(R.layout.item_order_list, parent, false)
        return OrderListViewHolder(view)
    }

    override fun onBindViewHolder(holder: OrderListViewHolder, position: Int) {

        with(holder.binding) {

        }
        holder.itemView.setOnClickListener(){
            context.startActivity(Intent(context, OrderDetailsActivity::class.java))
        }


    }

    override fun getItemCount(): Int {
        return 20
    }

}