package com.secondworld.mvvmcoursenew.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.secondworld.mvvmcoursenew.R
import com.secondworld.mvvmcoursenew.data.repository.Repository
import com.secondworld.mvvmcoursenew.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var viewModel : MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViewModel()
    }

    private fun initViewModel() {
        val repository = Repository()
        viewModel = ViewModelProvider(this, ViewModelFactory(repository)).get(MainViewModel::class.java)
    }
}