package com.example.myapplication.ui.testimonial

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TestimonialViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Dapatkan Tubuh Sempurna"
    }
    val text: LiveData<String> = _text
}