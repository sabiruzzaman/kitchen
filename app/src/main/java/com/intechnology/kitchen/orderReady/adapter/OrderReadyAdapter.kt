package com.intechnology.kitchen.orderReady.adapter

import android.app.Dialog
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.Button
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.intechnology.kitchen.R
import com.intechnology.kitchen.databinding.ItemOrderReadyBinding

class OrderReadyAdapter(val context: Context) :
    RecyclerView.Adapter<OrderReadyAdapter.OrderReadyViewHolder>() {

    class OrderReadyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val binding = ItemOrderReadyBinding.bind(itemView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrderReadyViewHolder {
        val view: View =
            LayoutInflater.from(context).inflate(R.layout.item_order_ready, parent, false)
        return OrderReadyViewHolder(view)
    }

    override fun onBindViewHolder(holder: OrderReadyViewHolder, position: Int) {

        with(holder.binding) {

        }
        holder.itemView.setOnClickListener() {

            val dialog = Dialog(context)
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
            dialog.setContentView(R.layout.dialog_ready)
            dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)

            val cancelBtnId: Button = dialog.findViewById(R.id.cancelBtnId)
            cancelBtnId.setOnClickListener() {
                dialog.dismiss()
            }
            dialog.setCanceledOnTouchOutside(false)
            dialog.show()

        }
    }

    override fun getItemCount(): Int {
        return 20
    }

}