package com.example.courtcounterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.example.courtcounterapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewBinding: MainActivityViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        viewBinding= MainActivityViewBinding()
        setContentView(binding.root)


    viewBinding=ViewModelProvider(this).get(MainActivityViewBinding::class.java)
        //The two lines below if put above the above line and u rotate the screen values go back to zero.....
        // but this way it doesn'
        binding.scoreforA.text=viewBinding.a_scores.toString()
        binding.scoreforB.text=viewBinding.b_scores.toString()
        //setting the click even for the A button
        binding.buttonforteamA.setOnClickListener {
            viewBinding.addScoreA()
            binding.scoreforA.text=viewBinding.a_scores.toString()
        }

        //setting the click event for the B button
        binding.buttonforteamB.setOnClickListener {
            viewBinding.addScoreB()
            binding.scoreforB.text=viewBinding.b_scores.toString()
        }

    }
}