package com.silva.murillo.fitnessapp.ui.view.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.silva.murillo.fitnessapp.R
import com.silva.murillo.fitnessapp.databinding.ActivityHomeOnboardingBinding

class HomeOnboarding : AppCompatActivity() {
    private lateinit var binding: ActivityHomeOnboardingBinding
    companion object {
        const val HOME_ONBOARDING = 11
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_home_onboarding)
        configureClicksOnboarding()
    }

    private fun configureClicksOnboarding() {
        binding.btnGoOnboarding.setOnClickListener {
            startActivity(Intent(this, ListOnboardingActivity::class.java))
        }
    }
}