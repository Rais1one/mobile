package com.example.practikrmp4.data

import androidx.fragment.app.Fragment
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class NavigationRepository {
    private val _navigateTo = MutableLiveData<Class<out Fragment>?>()
    val navigateTo: LiveData<Class<out Fragment>?> = _navigateTo

    private val _navigateBack = MutableLiveData<Boolean>()
    val navigateBack: LiveData<Boolean> = _navigateBack

    fun setNavigateTo(fragmentClass: Class<out Fragment>){
        _navigateTo.value = fragmentClass
    }

    fun setNavigateBack(){
        _navigateBack.value = true
    }

    fun ClearCommands(){
        _navigateTo.value = null
        _navigateBack.value = false
    }
}