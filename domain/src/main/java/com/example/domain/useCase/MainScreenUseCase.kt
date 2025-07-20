package com.example.domain.useCase

import com.example.domain.model.Task
import com.example.domain.repository.TasksRepository
import java.util.Date

class MainScreenUseCase(private val repository: TasksRepository) {
    fun getTasksByDate(date: Date) = repository.getTasksByDate(date)
    fun setTask(task: Task) = repository.setTask(task)
}