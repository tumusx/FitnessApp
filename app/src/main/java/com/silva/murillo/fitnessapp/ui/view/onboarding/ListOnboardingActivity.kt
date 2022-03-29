package com.silva.murillo.fitnessapp.ui.view.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.databinding.DataBindingUtil
import com.silva.murillo.fitnessapp.R
import com.silva.murillo.fitnessapp.databinding.ActivityListMainBinding
import com.silva.murillo.fitnessapp.databinding.ActivityListOnboardingBinding
import com.silva.murillo.fitnessapp.databinding.ActivityMainBinding
import com.silva.murillo.fitnessapp.ui.view.adapters.AdapterOnboarding

class ListOnboardingActivity : AppCompatActivity() {
    private var titlesList = mutableListOf<String>()
    private var descriptionList = mutableListOf<String>()
    private var imageList = mutableListOf<Int>()
    private lateinit var adapter : AdapterOnboarding

    private lateinit var binding: ActivityListMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_list_main)
        configurePosition()

    }

    private fun configureList(title: String, description: String, imageView: Int) {
        titlesList.add(title)
        descriptionList.add(description)
        imageList.add(imageView)
    }

    private fun configurePosition() {
        for (i in 1..3) {
            configureList("Title $i", "Description $i", i)
        }

    }

}