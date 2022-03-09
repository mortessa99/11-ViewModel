package com.example.a11_viewmodel

import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    private var count = 0

    fun getCount() : Int {
        return count
    }

    fun setCount(addNumber : Int) {
        if (addNumber > 0) count += addNumber
    }
}