package com.intechnology.kitchen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.intechnology.kitchen.databinding.ActivityLogInBinding
import com.shashank.sony.fancytoastlib.FancyToast


class LogInActivity : AppCompatActivity() {
    lateinit var binding: ActivityLogInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLogInBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewInit()

    }

    private fun viewInit() {

        binding.loginBtnId.setOnClickListener() {

            FancyToast.makeText(
                this,
                "Login Success!",
                FancyToast.LENGTH_SHORT,
                FancyToast.SUCCESS,
                false
            ).show()

            startActivity(Intent(applicationContext, MainActivity::class.java))


        }

    }
}