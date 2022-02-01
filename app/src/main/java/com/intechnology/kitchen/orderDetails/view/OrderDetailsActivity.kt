package com.intechnology.kitchen.orderDetails.view

import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.intechnology.kitchen.R
import com.intechnology.kitchen.databinding.ActivityOrderDetailsBinding
import com.intechnology.kitchen.orderDetails.adapter.OrderItemAdapter

class OrderDetailsActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityOrderDetailsBinding
    private lateinit var adapter: OrderItemAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityOrderDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewInit()

    }

    private fun viewInit() {
        binding.receivedTvId.setOnClickListener(this)
        binding.processingTvId.setOnClickListener(this)
        binding.readyTvId.setOnClickListener(this)
        adapter = OrderItemAdapter(this)

        binding.itemRvId.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.itemRvId.adapter = adapter


        binding.backImgId.setOnClickListener() {
            onBackPressed()
        }
    }


    @RequiresApi(Build.VERSION_CODES.M)
    override fun onClick(v: View?) {
        when (v?.id) {
            binding.receivedTvId.id -> {
                binding.receivedTvId.setTextColor(getColor(R.color.white))
                binding.processingTvId.setTextColor(getColor(R.color.black))
                binding.readyTvId.setTextColor(getColor(R.color.black))
                binding.receivedTvId.setBackgroundResource(R.drawable.shape_rectangular)
                binding.processingTvId.setBackgroundResource(R.drawable.shape_outline_rectangular)
                binding.readyTvId.setBackgroundResource(R.drawable.shape_outline_rectangular)
            }
            binding.processingTvId.id -> {
                binding.processingTvId.setTextColor(getColor(R.color.white))
                binding.receivedTvId.setTextColor(getColor(R.color.black))
                binding.readyTvId.setTextColor(getColor(R.color.black))
                binding.processingTvId.setBackgroundResource(R.drawable.shape_rectangular)
                binding.receivedTvId.setBackgroundResource(R.drawable.shape_outline_rectangular)
                binding.readyTvId.setBackgroundResource(R.drawable.shape_outline_rectangular)
            }
            binding.readyTvId.id -> {
                binding.processingTvId.setTextColor(getColor(R.color.black))
                binding.receivedTvId.setTextColor(getColor(R.color.black))
                binding.readyTvId.setTextColor(getColor(R.color.white))
                binding.readyTvId.setBackgroundResource(R.drawable.shape_rectangular)
                binding.receivedTvId.setBackgroundResource(R.drawable.shape_outline_rectangular)
                binding.processingTvId.setBackgroundResource(R.drawable.shape_outline_rectangular)
            }
        }
    }
}