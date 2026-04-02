package com.example.practikrmp4.viewmodel

import androidx.fragment.app.Fragment
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.practikrmp4.data.NavigationRepository
import com.example.practikrmp4.domain.usecase.BackUseCase
import com.example.practikrmp4.domain.usecase.NextUseCase

class MainViewModel : ViewModel() {
    private val repository = NavigationRepository()

    private val nextUseCase = NextUseCase(repository)
    private val backUseCase = BackUseCase(repository)

    val navigateTo: LiveData<Class<out Fragment>?> = repository.navigateTo
    val navigateBack: LiveData<Boolean> = repository.navigateBack

    fun navigateTo(fragmentClass: Class<out Fragment>) {
        nextUseCase.execute(fragmentClass)
    }

    fun navigateBack() {
        backUseCase.execute()
    }

    fun navigateComplete() {
        repository.ClearCommands()
    }
}