package com.example.practikrmp4.domain.usecase
import androidx.fragment.app.Fragment
import com.example.practikrmp4.data.NavigationRepository

class NextUseCase(private val repository: NavigationRepository) {
    fun execute(fragmentClass: Class<out Fragment>) {
        repository.setNavigateTo(fragmentClass)
    }
}