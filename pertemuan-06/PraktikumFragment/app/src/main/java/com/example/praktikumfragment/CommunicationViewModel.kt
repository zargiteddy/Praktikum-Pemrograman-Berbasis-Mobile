package com.example.praktikumfragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CommunicationViewModel : ViewModel() {
    private val mName = MutableLiveData<String>()
    private val mAddress = MutableLiveData<String>()

    val name: LiveData<String>
        get() = mName

    val address: LiveData<String>
        get() = mAddress

    fun setName(name: String) {
        mName.value = name
    }
    fun setAddress(address: String) {
        mAddress.value = address
    }
}