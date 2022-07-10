package com.skytechroofing.skytechroofingadmin.ui.instagram

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class InstagramViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is instagram Fragment"
    }
    val text: LiveData<String> = _text
}