package com.example.tugasfragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CommunicationViewModel : ViewModel() {
    private val mName = MutableLiveData<String>()
    private val mKampus = MutableLiveData<String>()
    private val mProdi = MutableLiveData<String>()

    val name: LiveData<String>
        get() = mName

    val kampus: LiveData<String>
        get() = mKampus

    val prodi: LiveData<String>
        get() = mProdi

    fun setName(name: String) {
        mName.value = name
    }
    fun setKampus(kampus: String) {
        mKampus.value = kampus
    }
    fun setProdi(prodi: String) {
        mProdi.value = prodi
    }
}