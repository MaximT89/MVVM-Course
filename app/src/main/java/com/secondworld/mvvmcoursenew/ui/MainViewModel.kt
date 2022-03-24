package com.secondworld.mvvmcoursenew.ui

import androidx.lifecycle.ViewModel
import com.secondworld.mvvmcoursenew.data.repository.Repository

class MainViewModel(private val repository: Repository) : ViewModel() {

    fun getDataFromRepository() = repository.getData()
}