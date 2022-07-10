package com.skytechroofing.skytechroofingadmin.ui.contactform

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ContactFormViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is contactform Fragment"
    }
    val text: LiveData<String> = _text
}