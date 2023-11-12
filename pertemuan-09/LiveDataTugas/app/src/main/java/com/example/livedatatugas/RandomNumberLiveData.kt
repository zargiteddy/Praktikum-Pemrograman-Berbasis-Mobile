package com.example.livedatatugas

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RandomNumberLiveData: ViewModel() {
    val currentRandomNumber:MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }
}