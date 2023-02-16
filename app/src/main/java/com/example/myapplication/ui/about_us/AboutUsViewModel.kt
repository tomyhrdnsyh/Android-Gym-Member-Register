package com.example.myapplication.ui.about_us

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AboutUsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Halo, kami Baginda Gyms"
    }
    val text: LiveData<String> = _text
}