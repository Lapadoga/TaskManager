package com.example.domain.useCase

import com.example.domain.model.Task
import com.example.domain.repository.TasksRepository

class PlanningScreenUseCase(private val repository: TasksRepository) {
    fun getUnplannedTasks() = repository.getUnplannedTasks()
    fun setTask(task: Task) = repository.setTask(task)
}