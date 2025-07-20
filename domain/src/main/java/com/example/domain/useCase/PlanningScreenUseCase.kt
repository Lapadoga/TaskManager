package com.example.domain.useCase

import com.example.domain.model.Task
import com.example.domain.repository.TasksRepository

class PlanningScreenUseCase(private val repository: TasksRepository) {
    suspend fun getUnplannedTasks() = repository.getUnplannedTasks()
    suspend fun setTask(task: Task) = repository.setTask(task)
}