package com.intechnology.kitchen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.intechnology.kitchen.databinding.ActivityMainBinding
import com.shashank.sony.fancytoastlib.FancyToast

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var nevController: NavController
    private lateinit var navigationUI: NavigationUI
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewInit()
    }

    private fun viewInit() {

        nevController = NavController(this)
        navigationUI = NavigationUI

        nevController = Navigation.findNavController(this, R.id.hostFragment)
        navigationUI.setupWithNavController(binding.bottomNavigationView, nevController)

        nevController.addOnDestinationChangedListener(NavController.OnDestinationChangedListener { controller, destination, arguments ->
            //  binding.titleTvId.text = destination.label

        })


        binding.logOutImgId.setOnClickListener(){

            FancyToast.makeText(
                this,
                "Logout Success!",
                FancyToast.LENGTH_SHORT,
                FancyToast.SUCCESS,
                false
            ).show()

            startActivity(Intent(applicationContext, LogInActivity::class.java))
        }

    }
}