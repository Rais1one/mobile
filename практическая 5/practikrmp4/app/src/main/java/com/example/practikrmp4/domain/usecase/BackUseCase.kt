package com.example.practikrmp4.domain.usecase
import com.example.practikrmp4.data.NavigationRepository

class BackUseCase(private val repository: NavigationRepository) {
    fun execute() {
        repository.setNavigateBack()
    }
}