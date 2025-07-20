package com.example.domain.useCase

import com.example.domain.model.Task
import com.example.domain.repository.TasksRepository

class TaskScreenUseCase(private val repository: TasksRepository) {
    fun setTask(task: Task) = repository.setTask(task)
}